package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `HashingContext`, extends `RefCounted`. */
abstract class HashingContext extends RefCounted {

  /** HashingContext.start */
  final def start(`type`: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("HashingContext", "start", 3940338335L), hostObject.objectPtr, `type`)

}

object HashingContext {
  /** Class metadata for Gd[HashingContext] lifetime management and casting. */
  given GodotClass[HashingContext] with {
    def className = "HashingContext"
    def isRefCounted = true
    def wrap(o: GodotObject): HashingContext = new HashingContext {}.withHost(o.objectPtr)
    def unwrap(t: HashingContext): GodotObject = t.hostObject
  }
}
