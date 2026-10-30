package gdext.internal.engine

import gdext.builtin.Callable
import gdext.internal.{StringName, StringNames}

/**
 * Signal-connection helper. `Object.connect` takes a `Callable` argument, which
 * the codegen does not emit a wrapper for, so we bind it directly here via its
 * MethodBind. Pairs with [[gdext.builtin.Callable.of]] to
 * route an engine signal back into a registered class's Scala method.
 */
object Signals {
  // Object.connect(signal: StringName, callable: Callable, flags: int) -> Error
  private final val ConnectHash = 1518946055L

  private val connectBind = new CachedBind("Object", "connect", ConnectHash)

  /**
   * Connect `signal` on `host` to `callable`. Returns the engine `Error` code
   * (0 == OK). `connect` returns a value, so this uses the value ptrcall path
   * (a null return buffer would crash).
   */
  def connect(
    host: GodotObject,
    signal: String,
    callable: Callable,
    flags: Long = 0L
  ): Long =
    Ptrcall.call3[StringName, Callable, Long, Long](
      connectBind.ptr,
      host.objectPtr,
      StringNames.cached(signal),
      callable,
      flags
    )
}
