package gdext.internal.engine

import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.ffi.types.*

/**
 * Resolves and caches engine `MethodBind` pointers.
 *
 * `classdb_get_method_bind(class, method, hash)` is a dictionary lookup; the
 * returned bind is stable for the process. [[get]] is the cold path: generated
 * engine-class wrappers keep one null-checked bind field per method in their
 * companion and call it once, and hand-written callers hold a [[CachedBind]].
 * The (class, method, hash) hash uniquely identifies an ABI-compatible method
 * version, which is how Godot keeps GDExtensions working across point
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

/** A method bind resolved on first use and then read from a field. */
final class CachedBind(className: String, methodName: String, hash: Long) {
  private var bind: GDExtensionMethodBindPtr = null

  def ptr: GDExtensionMethodBindPtr = {
    if (bind == null) bind = MethodBind.get(className, methodName, hash)
    bind
  }
}
