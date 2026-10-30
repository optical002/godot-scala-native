package gdext.internal

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.builtin.{BuiltinSizes, GString, ToVariant, VariantConstructors}
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `StringName` — an interned, 8-byte (`BuiltinSizes.StringName`)
 * reference-counted handle used pervasively for method, class, property and
 * signal names. Lookups by StringName are O(1) pointer comparisons engine-side,
 * which is why every classdb/method API takes one.
 *
 * Internal: the public API takes and returns Scala `String`s, marshalled
 * through [[gdext.internal.engine.SnArg]]. Names the binding itself uses over
 * and over (class, method, signal names) are cached for the process lifetime
 * via [[StringNames.cached]].
 */
opaque type StringName = GDExtensionStringNamePtr

object StringName {
  extension (sn: StringName) {
    def ptr: GDExtensionStringNamePtr = sn

    /** Release the underlying StringName reference. */
    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_STRING_NAME)(sn)
  }

  given ToVariant[StringName] = (value, dest) =>
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_STRING_NAME)(dest, value)

  /** Wrap an existing engine StringName pointer without copying. */
  def fromPtr(p: GDExtensionStringNamePtr): StringName = p

  /**
   * Decode a StringName handle to a Scala `String` by constructing a Godot
   * `String` from it (String constructor index 2 takes a StringName) and
   * reading that out. Used to match incoming engine StringNames by text, since
   * two StringName *handles* for the same text are not pointer-equal.
   */
  def toScala(sn: GDExtensionConstStringNamePtr): String = {
    val strBuf = stackalloc[Byte](BuiltinSizes.String.toCSize)
    val ctor = VariantConstructors.constructor(
      GDEXTENSION_VARIANT_TYPE_STRING,
      2
    )
    val args = stackalloc[GDExtensionConstTypePtr](1)
    args(0) = sn
    ctor(strBuf, args)
    val gstr = GString.fromPtr(strBuf)
    val out = gstr.toScala
    gstr.destroy()
    out
  }

  /** Construct a StringName from a Scala `String` into caller storage. */
  def from(value: String, dest: GDExtensionStringNamePtr): StringName = {
    writeAt(value, dest.toLong)
    dest
  }

  /**
   * Build a StringName from `value` at the address `dest` (see `Addr`). The
   * UTF-8 bytes are encoded by hand into a stack buffer (heap above
   * `GString.StackChars` chars), so a short name allocates nothing.
   */
  def writeAt(value: String, dest: Long): Unit = {
    val len = value.length
    val cap = len * 3
    // The buffer is chosen as an address: a `Ptr` merged from two branches
    // is boxed.
    val bufAddr: Long =
      if (len <= GString.StackChars) stackalloc[CChar]((cap max 1).toCSize).toLong
      else stdlib.malloc(cap.toCSize).toLong
    val out = Addr.ptr[CChar](bufAddr)
    var i = 0
    var n = 0
    while (i < len) {
      var c = value.charAt(i).toInt
      if (Character.isHighSurrogate(c.toChar) && i + 1 < len &&
          Character.isLowSurrogate(value.charAt(i + 1))) {
        c = Character.toCodePoint(c.toChar, value.charAt(i + 1))
        i += 1
      }
      if (c < 0x80) { out(n) = c.toByte; n += 1 }
      else if (c < 0x800) {
        out(n) = (0xc0 | (c >> 6)).toByte
        out(n + 1) = (0x80 | (c & 0x3f)).toByte
        n += 2
      } else if (c < 0x10000) {
        out(n) = (0xe0 | (c >> 12)).toByte
        out(n + 1) = (0x80 | ((c >> 6) & 0x3f)).toByte
        out(n + 2) = (0x80 | (c & 0x3f)).toByte
        n += 3
      } else {
        out(n) = (0xf0 | (c >> 18)).toByte
        out(n + 1) = (0x80 | ((c >> 12) & 0x3f)).toByte
        out(n + 2) = (0x80 | ((c >> 6) & 0x3f)).toByte
        out(n + 3) = (0x80 | (c & 0x3f)).toByte
        n += 4
      }
      i += 1
    }
    Godot.interface.string_name_new_with_utf8_chars_and_len(
      Addr.ptr[Byte](dest).asInstanceOf[GDExtensionUninitializedStringNamePtr],
      out,
      n.toLong
    )
    if (len > GString.StackChars) stdlib.free(Addr.ptr[Byte](bufAddr))
  }
}

/**
 * Process-lifetime cache of StringNames keyed by their Scala string.
 *
 * Entries are allocated with libc `malloc` (not the GC) so the 8-byte handle
 * has a stable address for the whole process and is never moved or collected;
 * they are intentionally never freed (the cache lives as long as the
 * extension). This mirrors how name interning is meant to be used.
 */
object StringNames {

  private val cache =
    new java.util.concurrent.ConcurrentHashMap[String, StringName]()

  // Engine StringName handle word (its interned `_data` pointer, unique per
  // text while alive) -> index into `known` / `texts`, which hold the cached
  // value and its decoded text. Returning those stored values (rather than a
  // `Ptr` rebuilt from an address, or a freshly decoded String) is what keeps
  // `adopt` / `adoptText` allocation-free.
  private val byHandle = new LongMap(256)
  private var known = new Array[AnyRef](256)
  private var texts = new Array[String](256)
  private var knownCount = 0

  private def remember(handle: Long, sn: StringName, text: String): Int = {
    if (knownCount == known.length) {
      known = java.util.Arrays.copyOf(known, knownCount * 2)
      texts = java.util.Arrays.copyOf(texts, knownCount * 2)
    }
    known(knownCount) = sn.asInstanceOf[AnyRef]
    texts(knownCount) = text
    byHandle(handle) = knownCount.toLong
    knownCount += 1
    knownCount - 1
  }

  /** Return the cached StringName for `name`, creating it on first use. */
  def cached(name: String): StringName = {
    val hit = cache.get(name)
    if (hit.ptr != null) hit
    else
      cache.computeIfAbsent(
        name,
        _ => {
          val storage = stdlib
            .malloc(BuiltinSizes.StringName.toCSize)
            .asInstanceOf[GDExtensionStringNamePtr]
          val sn = StringName.from(name, storage)
          val handle = !storage.asInstanceOf[Ptr[Long]]
          if (!byHandle.contains(handle)) remember(handle, sn, name)
          sn
        }
      )
  }

  /** Index of the entry for the StringName an engine call wrote into `buf`
    * (a return buffer), taking over its reference: a known name drops it, a
    * new one keeps it in fresh process-lifetime storage. */
  private def adoptIndex(bufAddr: Long): Int = {
    val buf = Addr.ptr[Byte](bufAddr)
    val handle = !buf.asInstanceOf[Ptr[Long]]
    val idx = byHandle.getOrElse(handle, -1L)
    if (idx >= 0L) {
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_STRING_NAME)(buf)
      idx.toInt
    } else {
      val storage = stdlib.malloc(BuiltinSizes.StringName.toCSize)
      !storage.asInstanceOf[Ptr[Long]] = handle
      val sn = StringName.fromPtr(storage.asInstanceOf[GDExtensionStringNamePtr])
      remember(handle, sn, StringName.toScala(sn.ptr))
    }
  }

  /**
   * Take over the StringName in return buffer `buf` and return
   * process-lifetime storage for it. No heap allocation once a name is known,
   * and equal names yield the same `StringName` value.
   */
  def adopt(bufAddr: Long): StringName =
    known(adoptIndex(bufAddr)).asInstanceOf[StringName]

  /** [[adopt]], returning the name's text: decoded once per distinct name,
    * then the same `String` instance with no allocation. */
  def adoptText(bufAddr: Long): String = texts(adoptIndex(bufAddr))
}
