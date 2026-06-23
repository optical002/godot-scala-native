package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `HMACContext`, extends `RefCounted`. */
abstract class HMACContext extends RefCounted {

}

object HMACContext {
  /** Class metadata for Gd[HMACContext] lifetime management and casting. */
  given GodotClass[HMACContext] with {
    def className = "HMACContext"
    def isRefCounted = true
    def wrap(o: GodotObject): HMACContext = new HMACContext {}.withHost(o.objectPtr)
    def unwrap(t: HMACContext): GodotObject = t.hostObject
  }
}
