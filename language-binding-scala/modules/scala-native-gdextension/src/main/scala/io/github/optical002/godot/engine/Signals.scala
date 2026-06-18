package io.github.optical002.godot.engine

import io.github.optical002.godot.builtin.{Callable, StringName, StringNames}

/**
 * Signal-connection helper. `Object.connect` takes a `Callable` argument, which
 * the codegen does not emit a wrapper for, so we bind it directly here via its
 * MethodBind. Pairs with [[io.github.optical002.godot.builtin.Callable.of]] to
 * route an engine signal back into a registered class's Scala method.
 */
object Signals {
  // Object.connect(signal: StringName, callable: Callable, flags: int) -> Error
  private final val ConnectHash = 1518946055L

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
      MethodBind.get("Object", "connect", ConnectHash),
      host.objectPtr,
      StringNames.cached(signal),
      callable,
      flags
    )
}
