package gdext.builtin

import gdext.internal.StringNames
import gdext.Godot
import gdext.internal.ffi.types.*

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
  // One name -> function map per variant type, so a hit is an array index plus
  // a map read: no key building, no closure.
  private val byType =
    Array.fill(64)(
      new java.util.concurrent.ConcurrentHashMap[String, GDExtensionPtrBuiltInMethod]()
    )

  def method(
    variantType: GDExtensionVariantType,
    name: String,
    hash: Long
  ): GDExtensionPtrBuiltInMethod = {
    val cache = byType(variantType.toInt)
    val hit = cache.get(name)
    if (hit != null) hit
    else {
      val fn = Godot.interface.variant_get_ptr_builtin_method(
        variantType,
        StringNames.cached(name).ptr,
        hash
      )
      cache.put(name, fn)
      fn
    }
  }
}
