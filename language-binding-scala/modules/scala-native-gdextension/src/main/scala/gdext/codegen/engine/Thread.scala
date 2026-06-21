package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Thread`, extends `RefCounted`. */
abstract class Thread extends RefCounted {

  /** Thread.get_id */
  final def getId(): String =
    Ptrcall.call0[String](MethodBind.get("Thread", "get_id", 201670096L), hostObject.objectPtr)

  /** Thread.is_started */
  final def isStarted(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Thread", "is_started", 36873697L), hostObject.objectPtr)

  /** Thread.is_alive */
  final def isAlive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Thread", "is_alive", 36873697L), hostObject.objectPtr)

}

object Thread {
  /** Class metadata for Gd[Thread] lifetime management and casting. */
  given GodotClass[Thread] with {
    def className = "Thread"
    def isRefCounted = true
    def wrap(o: GodotObject): Thread = new Thread {}.withHost(o.objectPtr)
    def unwrap(t: Thread): GodotObject = t.hostObject
  }
}
