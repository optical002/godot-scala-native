package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.codegen.gdextensioninterface.types.*
import gdext.codegen.gdextensioninterface.types.GDExtensionVariantType.*

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
    val ctor = Godot.interface.variant_get_ptr_constructor(
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
    Zone.acquire { implicit z =>
      val c = toCString(value)
      Godot.interface.string_name_new_with_utf8_chars_and_len(
        dest,
        c,
        bytes.length.toLong
      )
    }
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

  /** Return the cached StringName for `name`, creating it on first use. */
  def cached(name: String): StringName =
    cache.computeIfAbsent(
      name,
      _ => {
        val storage = stdlib
          .malloc(BuiltinSizes.StringName.toCSize)
          .asInstanceOf[GDExtensionStringNamePtr]
        StringName.from(name, storage)
      }
    )
}
