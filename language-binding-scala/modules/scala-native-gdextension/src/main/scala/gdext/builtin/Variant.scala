package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * A Godot `Variant` — the dynamically-typed value all of Godot's scripting and
 * reflection traffics in.
 *
 * Physically this is a [[ptr]] to a [[BuiltinSizes.Variant]]-byte buffer that
 * Godot owns the contents of. Constructing a Variant from a value, and reading
 * a value back out, go through the engine's per-type constructor functions
 * (cached in [[VariantConstructors]]), matching gdext's approach exactly.
 *
 * Memory: the backing buffer here is provided by the caller (typically stack-
 * allocated within a [[Variant.scope]]). A Variant may hold a reference-counted
 * payload (e.g. a String or Object), so when you are done with one you must
 * [[destroy]] it to release that payload; the buffer itself is reclaimed by
 * whoever allocated it.
 */
opaque type Variant = GDExtensionVariantPtr

object Variant {

  /** The raw pointer to the 24-byte Variant storage. */
  extension (v: Variant) {
    def ptr: GDExtensionVariantPtr = v

    /** The runtime Variant type tag (NIL, INT, STRING, ...). */
    def variantType: GDExtensionVariantType =
      Godot.interface.variant_get_type(v)

    /** Releases any reference-counted payload held by this Variant. */
    def destroy(): Unit = Godot.interface.variant_destroy(v)

    /** Decode this Variant into a Scala value via the [[FromVariant]] seam. */
    def to[A](using fv: FromVariant[A]): A = fv.fromVariant(v)
  }

  /** Wrap an existing engine Variant pointer without copying. */
  def fromPtr(p: GDExtensionVariantPtr): Variant = p

  /**
   * Build a Variant from a Scala value into caller-provided storage.
   *
   * @param dest a buffer of at least [[BuiltinSizes.Variant]] bytes
   */
  def from[A](value: A, dest: GDExtensionVariantPtr)(using
    tv: ToVariant[A]
  ): Variant = {
    tv.toVariant(value, dest)
    dest
  }

  /**
   * Run `body` with a stack-allocated Variant built from `value`. The Variant
   * (and its storage) are valid only for the duration of `body`; the payload is
   * destroyed on exit.
   */
  inline def scope[A, R](value: A)(body: Variant => R)(using
    tv: ToVariant[A]
  ): R = {
    val buf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
    val v: Variant = buf
    tv.toVariant(value, v)
    try body(v)
    finally v.destroy()
  }
}

/** Encodes a Scala value into a (caller-allocated) Godot Variant. */
trait ToVariant[A] {
  def toVariant(value: A, dest: GDExtensionVariantPtr): Unit
}

/** Decodes a Scala value out of a Godot Variant. */
trait FromVariant[A] {
  def fromVariant(variant: GDExtensionVariantPtr): A
}

object ToVariant {
  def apply[A](using tv: ToVariant[A]): ToVariant[A] = tv

  /**
   * Generic encoder for any builtin type: writes `value` into a type buffer,
   * then invokes the engine's cached `variant_from_type` constructor for
   * `variantType` to populate `dest`.
   */
  private inline def fromBuiltin[A](
    variantType: GDExtensionVariantType,
    typeSize: Int
  )(writeType: (A, GDExtensionTypePtr) => Unit): ToVariant[A] =
    (value: A, dest: GDExtensionVariantPtr) => {
      val typeBuf = stackalloc[Byte](typeSize.toCSize)
      writeType(value, typeBuf)
      VariantConstructors.fromType(variantType)(dest, typeBuf)
    }

  given ToVariant[Boolean] =
    fromBuiltin[Boolean](GDEXTENSION_VARIANT_TYPE_BOOL, 1) { (b, p) =>
      !p.asInstanceOf[Ptr[GDExtensionBool]] = (if (b) 1 else 0).toUByte
    }

  given ToVariant[Long] =
    fromBuiltin[Long](GDEXTENSION_VARIANT_TYPE_INT, 8) { (n, p) =>
      !p.asInstanceOf[Ptr[GDExtensionInt]] = n
    }

  given ToVariant[Int] = (value, dest) => ToVariant[Long].toVariant(value.toLong, dest)

  given ToVariant[Double] =
    fromBuiltin[Double](GDEXTENSION_VARIANT_TYPE_FLOAT, 8) { (d, p) =>
      !p.asInstanceOf[Ptr[CDouble]] = d
    }

  given ToVariant[Float] = (value, dest) => ToVariant[Double].toVariant(value.toDouble, dest)

  /**
   * String: build a Godot String in a temp buffer, construct a STRING Variant
   * from it, then release the temp (the Variant holds its own copy).
   */
  given ToVariant[String] = (value: String, dest: GDExtensionVariantPtr) => {
    val buf = stackalloc[Byte](BuiltinSizes.String.toCSize)
    GString.from(value, buf)
    VariantConstructors.fromType(GDEXTENSION_VARIANT_TYPE_STRING)(dest, buf)
    GString.fromPtr(buf).destroy()
  }
}

object FromVariant {
  def apply[A](using fv: FromVariant[A]): FromVariant[A] = fv

  private inline def toBuiltin[A](
    variantType: GDExtensionVariantType,
    typeSize: Int
  )(readType: GDExtensionTypePtr => A): FromVariant[A] =
    (variant: GDExtensionVariantPtr) => {
      val typeBuf = stackalloc[Byte](typeSize.toCSize)
      VariantConstructors.toType(variantType)(typeBuf, variant)
      readType(typeBuf)
    }

  given FromVariant[Boolean] =
    toBuiltin[Boolean](GDEXTENSION_VARIANT_TYPE_BOOL, 1) { p =>
      (!p.asInstanceOf[Ptr[GDExtensionBool]]).toInt != 0
    }

  given FromVariant[Long] =
    toBuiltin[Long](GDEXTENSION_VARIANT_TYPE_INT, 8) { p =>
      !p.asInstanceOf[Ptr[GDExtensionInt]]
    }

  given FromVariant[Int] = (v) => FromVariant[Long].fromVariant(v).toInt

  given FromVariant[Double] =
    toBuiltin[Double](GDEXTENSION_VARIANT_TYPE_FLOAT, 8) { p =>
      !p.asInstanceOf[Ptr[CDouble]]
    }

  given FromVariant[Float] = (v) => FromVariant[Double].fromVariant(v).toFloat

  given FromVariant[String] = (variant: GDExtensionVariantPtr) => {
    val buf = stackalloc[Byte](BuiltinSizes.String.toCSize)
    VariantConstructors.toType(GDEXTENSION_VARIANT_TYPE_STRING)(buf, variant)
    val s = GString.fromPtr(buf)
    val out = s.toScala
    s.destroy()
    out
  }
}
