package gdext.engine

import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.ffi.types.*

/**
 * Resolves and caches engine `MethodBind` pointers.
 *
 * `classdb_get_method_bind(class, method, hash)` is a dictionary lookup; the
 * returned bind is stable for the process. Generated engine-class wrappers each
 * resolve their bind once (lazily) and reuse it — this is the cache backing
 * that. The (class, method, hash) hash uniquely identifies an ABI-compatible
 * method version, which is how Godot keeps GDExtensions working across point
 * releases.
 */
object MethodBind {
  private val cache =
    new java.util.concurrent.ConcurrentHashMap[String, GDExtensionMethodBindPtr]()

  def get(
    className: String,
    methodName: String,
    hash: Long
  ): GDExtensionMethodBindPtr =
    cache.computeIfAbsent(
      s"$className::$methodName::$hash",
      _ =>
        Godot.interface.classdb_get_method_bind(
          StringNames.cached(className).ptr,
          StringNames.cached(methodName).ptr,
          hash
        )
    )
}
