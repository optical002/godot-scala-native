package gdext.builtin

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import gdext.Godot
import gdext.engine.MethodBind
import gdext.internal.ffi.types.*
import gdext.internal.ffi.types.GDExtensionVariantType.*

/**
 * Reads the property names of an arbitrary engine object via
 * `Object.get_property_list`.
 *
 * `Object.get_property_list` returns `typedarray::Dictionary` (ABI-identical to
 * an untyped `Array` of `Dictionary`), which the code generator drops — so this
 * is the bespoke reader. It ptrcalls the bind into an Array buffer, then reads
 * each element Dictionary's `"name"` key (a String). Used to enumerate an
 * `AnimationTree`'s `parameters/...` paths, which have no dedicated list method.
 */
object ObjectPropertyList {
  // Object.get_property_list hash from extension_api.json (Godot 4.6.1).
  private final val HashGetPropertyList = 3995934104L

  /** All property names reported by `instance.get_property_list()`. */
  def names(instance: GDExtensionObjectPtr): Seq[String] = {
    val bind = MethodBind.get("Object", "get_property_list", HashGetPropertyList)
    if (bind == null) return Seq.empty
    val arrBuf = stackalloc[Byte](BuiltinSizes.Array.toCSize)
    Godot.interface.object_method_bind_ptrcall(bind, instance, null, arrBuf)
    val arr = GArray.fromPtr(arrBuf)
    try {
      val n = arr.size
      val b = Seq.newBuilder[String]
      var i = 0
      while (i < n) {
        // Each element is a Dictionary Variant; pull it out into a Dictionary
        // handle, read its "name" key, then release that handle.
        val slot = Godot.interface.array_operator_index(arrBuf, i.toLong)
        val dictBuf = stackalloc[Byte](BuiltinSizes.Dictionary.toCSize)
        VariantConstructors
          .toType(GDEXTENSION_VARIANT_TYPE_DICTIONARY)(dictBuf, slot)
        val dict = Dictionary.fromPtr(dictBuf)
        try b += dict.get[String, String]("name")
        finally dict.destroy()
        i += 1
      }
      b.result()
    } finally VariantConstructors
      .destructor(GDEXTENSION_VARIANT_TYPE_ARRAY)(arrBuf)
  }
}
