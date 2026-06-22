package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `FramebufferCacheRD`, extends `Object`. */
abstract class FramebufferCacheRD extends Object {

}

object FramebufferCacheRD {
  /** Class metadata for Gd[FramebufferCacheRD] lifetime management and casting. */
  given GodotClass[FramebufferCacheRD] with {
    def className = "FramebufferCacheRD"
    def isRefCounted = false
    def wrap(o: GodotObject): FramebufferCacheRD = new FramebufferCacheRD {}.withHost(o.objectPtr)
    def unwrap(t: FramebufferCacheRD): GodotObject = t.hostObject
  }
}
