package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `StringName` — an interned, 8-byte ([[BuiltinSizes.StringName]])
 * reference-counted handle used pervasively for method, class, property and
 * signal names. Lookups by StringName are O(1) pointer comparisons engine-side,
 * which is why every classdb/method API takes one.
 *
 * Because the same names (class names, method names) are used over and over,
 * StringNames are cached for the process lifetime via [[StringNames.cached]]
 * rather than rebuilt per call — gdext does the same.
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
    import scala.scalanative.unsafe.*
    import scala.scalanative.unsigned.*
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
    val bytes = value.getBytes(java.nio.charset.StandardCharsets.UTF_8)
    val c = stackalloc[CChar]((bytes.length max 1).toCSize)
    var i = 0
    while (i < bytes.length) { c(i) = bytes(i); i += 1 }
    Godot.interface.string_name_new_with_utf8_chars_and_len(
      dest,
      c,
      bytes.length.toLong
    )
    dest
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
  // text while alive) -> index into `known`, which holds the cached value
  // itself. Returning that stored value (rather than a `Ptr` rebuilt from an
  // address) is what keeps `adopt` allocation-free.
  private val byHandle = new gdext.internal.LongMap(256)
  private var known = new Array[AnyRef](256)
  private var knownCount = 0

  private def remember(handle: Long, sn: StringName): Unit = {
    if (knownCount == known.length)
      known = java.util.Arrays.copyOf(known, knownCount * 2)
    known(knownCount) = sn.asInstanceOf[AnyRef]
    byHandle(handle) = knownCount.toLong
    knownCount += 1
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
          if (!byHandle.contains(handle)) remember(handle, sn)
          sn
        }
      )
  }

  /**
   * Take over the StringName an engine call wrote into `buf` (a return
   * buffer) and return process-lifetime storage for it. A name seen before
   * resolves to its existing storage and the returned reference is dropped;
   * a new name keeps the reference in fresh storage. No heap allocation once
   * a name is known, and equal names yield the same `StringName` value.
   */
  private[gdext] def adopt(bufAddr: Long): StringName = {
    val buf = gdext.internal.Addr.ptr[Byte](bufAddr)
    val handle = !buf.asInstanceOf[Ptr[Long]]
    val idx = byHandle.getOrElse(handle, -1L)
    if (idx >= 0L) {
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_STRING_NAME)(buf)
      known(idx.toInt).asInstanceOf[StringName]
    } else {
      val storage = stdlib.malloc(BuiltinSizes.StringName.toCSize)
      !storage.asInstanceOf[Ptr[Long]] = handle
      val sn = StringName.fromPtr(storage.asInstanceOf[GDExtensionStringNamePtr])
      remember(handle, sn)
      sn
    }
  }
}
