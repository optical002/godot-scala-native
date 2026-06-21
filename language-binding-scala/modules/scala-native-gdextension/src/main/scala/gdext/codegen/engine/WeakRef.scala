package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `WeakRef`, extends `RefCounted`. */
abstract class WeakRef extends RefCounted {

}

object WeakRef {
  /** Class metadata for Gd[WeakRef] lifetime management and casting. */
  given GodotClass[WeakRef] with {
    def className = "WeakRef"
    def isRefCounted = true
    def wrap(o: GodotObject): WeakRef = new WeakRef {}.withHost(o.objectPtr)
    def unwrap(t: WeakRef): GodotObject = t.hostObject
  }
}
