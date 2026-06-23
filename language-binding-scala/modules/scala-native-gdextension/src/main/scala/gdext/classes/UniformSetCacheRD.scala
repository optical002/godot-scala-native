package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `UniformSetCacheRD`, extends `Object`. */
abstract class UniformSetCacheRD extends Object {

}

object UniformSetCacheRD {
  /** Class metadata for Gd[UniformSetCacheRD] lifetime management and casting. */
  given GodotClass[UniformSetCacheRD] with {
    def className = "UniformSetCacheRD"
    def isRefCounted = false
    def wrap(o: GodotObject): UniformSetCacheRD = new UniformSetCacheRD {}.withHost(o.objectPtr)
    def unwrap(t: UniformSetCacheRD): GodotObject = t.hostObject
  }
}
