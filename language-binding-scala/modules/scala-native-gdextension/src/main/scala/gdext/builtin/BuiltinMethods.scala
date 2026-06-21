package gdext.builtin

import gdext.Godot
import gdext.codegen.gdextensioninterface.types.*

/**
 * Caches `ptrcall` function pointers for builtin-type methods (Array.size,
 * Dictionary.keys, ...). Resolving one requires the type, a StringName of the
 * method, and the method's hash from `extension_api.json`; the resulting
 * function pointer is stable for the process, so it is memoized.
 *
 * This is the builtin-type analogue of the engine-class method binding Phase 2
 * will generate; it is kept minimal here to support the Phase 1 containers.
 */
object BuiltinMethods {
  private val cache =
    new java.util.concurrent.ConcurrentHashMap[String, GDExtensionPtrBuiltInMethod]()

  def method(
    variantType: GDExtensionVariantType,
    name: String,
    hash: Long
  ): GDExtensionPtrBuiltInMethod =
    cache.computeIfAbsent(
      s"${variantType.toInt}#$name",
      _ => {
        val sn = StringNames.cached(name)
        Godot.interface.variant_get_ptr_builtin_method(
          variantType,
          sn.ptr,
          hash
        )
      }
    )
}
