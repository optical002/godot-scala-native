package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.libc.stdlib
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Godot's `String` (named `GString` to avoid clashing with `scala.String`).
 *
 * Physically an 8-byte ([[BuiltinSizes.String]]) reference-counted handle.
 * Conversion in both directions copies UTF-16 code units (Scala's own string
 * representation) through the `*_utf16_*` interface functions, using the
 * two-call length probe for reads.
 *
 * Strings are reference-counted, so a constructed GString must be [[destroy]]ed
 * when no longer needed; [[GString.scope]] does this automatically.
 */
opaque type GString = GDExtensionStringPtr

object GString {
  extension (s: GString) {
    def ptr: GDExtensionStringPtr = s

    /** Release the underlying Godot String's reference. */
    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_STRING)(s)

    /** Decode this Godot String into a Scala `String`. */
    def toScala: String = {
      val len = Godot.interface.string_to_utf16_chars(s, null, 0).toInt
      if (len <= 0) ""
      else {
        val chars = new Array[Char](len)
        val buf =
          if (len <= GString.StackChars) stackalloc[CChar16](len.toCSize)
          else stdlib.malloc((len * 2).toCSize).asInstanceOf[Ptr[CChar16]]
        Godot.interface.string_to_utf16_chars(s, buf, len.toLong)
        val units = buf.asInstanceOf[Ptr[CShort]]
        var i = 0
        while (i < len) { chars(i) = units(i).toChar; i += 1 }
        if (len > GString.StackChars) stdlib.free(buf.asInstanceOf[Ptr[Byte]])
        new String(chars)
      }
    }
  }

  /** Wrap an existing engine String pointer without copying. */
  def fromPtr(p: GDExtensionStringPtr): GString = p

  /** Build a Godot String from `value` at the address `dest` (see `Addr`). */
  private[gdext] def writeAt(value: String, dest: Long): Unit = {
    val len = value.length
    // The buffer is chosen as an address: a `Ptr` merged from two branches
    // is boxed.
    val bufAddr: Long =
      if (len <= StackChars) stackalloc[CChar16]((len max 1).toCSize).toLong
      else stdlib.malloc((len * 2).toCSize).toLong
    val units = gdext.internal.Addr.ptr[CShort](bufAddr)
    var i = 0
    while (i < len) { units(i) = value.charAt(i).toShort; i += 1 }
    Godot.interface.string_new_with_utf16_chars_and_len2(
      gdext.internal.Addr.ptr[Byte](dest),
      gdext.internal.Addr.ptr[CChar16](bufAddr),
      len.toLong,
      GString.LittleEndian
    )
    if (len > StackChars) stdlib.free(gdext.internal.Addr.ptr[Byte](bufAddr))
  }

  /** Decode the Godot String at `addr`, then destroy it. */
  private[gdext] def takeAt(addr: Long): String = {
    val s: GString = gdext.internal.Addr.ptr[Byte](addr)
    val out = s.toScala
    s.destroy()
    out
  }

  /** Strings up to this many UTF-16 units are converted through the stack. */
  private[gdext] final val StackChars = 2048

  /**
   * Construct a Godot String from a Scala `String` into caller storage. The
   * UTF-16 code units are copied straight across (no charset encoder), through
   * a stack buffer for strings up to [[StackChars]] units, so the conversion
   * allocates nothing on the Scala heap.
   */
  def from(value: String, dest: GDExtensionStringPtr): GString = {
    writeAt(value, dest.toLong)
    dest
  }

  private val LittleEndian: GDExtensionBool = 1.toUByte

  /**
   * Run `body` with a stack-allocated Godot String built from `value`; the
   * String is destroyed on exit.
   */
  inline def scope[R](value: String)(body: GString => R): R = {
    val buf = stackalloc[Byte](BuiltinSizes.String.toCSize)
    val s = from(value, buf)
    try body(s)
    finally s.destroy()
  }
}
