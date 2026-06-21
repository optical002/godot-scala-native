package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.codegen.gdextensioninterface.types.*
import gdext.codegen.gdextensioninterface.types.GDExtensionVariantType.*

/**
 * Godot's `Dictionary`. An 8-byte ([[BuiltinSizes.Dictionary]]) reference-
 * counted handle.
 *
 * `dictionary_operator_index` returns a pointer to the Variant slot for a key,
 * inserting a nil slot if the key is absent — so it serves both `get` and the
 * lvalue side of `set`. `size`/`has` go through the builtin-method machinery,
 * same as [[GArray]].
 */
opaque type Dictionary = GDExtensionTypePtr

object Dictionary {
  // Method hashes from extension_api.json (Dictionary, Godot 4.5).
  private final val HashSize = 3173160232L

  extension (d: Dictionary) {
    def ptr: GDExtensionTypePtr = d

    def destroy(): Unit =
      VariantConstructors.destructor(GDEXTENSION_VARIANT_TYPE_DICTIONARY)(d)

    def size: Int = {
      val out = stackalloc[GDExtensionInt]()
      BuiltinMethods
        .method(GDEXTENSION_VARIANT_TYPE_DICTIONARY, "size", HashSize)
        .apply(d, null, out.asInstanceOf[GDExtensionTypePtr], 0)
      (!out).toInt
    }

    /** Set `key -> value` (both marshalled through the Variant seam). */
    def put[K, V](key: K, value: V)(using
      tk: ToVariant[K],
      tv: ToVariant[V]
    ): Unit = {
      val keyBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
      val k = Variant.from(key, keyBuf)
      try {
        val slot = Godot.interface.dictionary_operator_index(d, k.ptr)
        // The slot is a live Variant. Release any prior payload (no-op for a
        // freshly-inserted nil slot) before overwriting it in place.
        Godot.interface.variant_destroy(slot)
        tv.toVariant(value, slot)
      } finally k.destroy()
    }

    /** Read the value at `key` as a Scala value. */
    def get[K, V](key: K)(using tk: ToVariant[K], fv: FromVariant[V]): V = {
      val keyBuf = stackalloc[Byte](BuiltinSizes.Variant.toCSize)
      val k = Variant.from(key, keyBuf)
      try {
        val slot = Godot.interface.dictionary_operator_index(d, k.ptr)
        fv.fromVariant(slot)
      } finally k.destroy()
    }
  }

  /** Wrap an existing Dictionary handle pointer (no copy). */
  def fromPtr(p: GDExtensionTypePtr): Dictionary = p

  /** Construct an empty Dictionary into caller storage. */
  def empty(dest: GDExtensionTypePtr): Dictionary = {
    val ctor = Godot.interface.variant_get_ptr_constructor(
      GDEXTENSION_VARIANT_TYPE_DICTIONARY,
      0
    )
    ctor(dest, null)
    dest
  }

  inline def scope[R](body: Dictionary => R): R = {
    val buf = stackalloc[Byte](BuiltinSizes.Dictionary.toCSize)
    val d = empty(buf)
    try body(d)
    finally d.destroy()
  }
}
