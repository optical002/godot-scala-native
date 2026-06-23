package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Lightmapper`, extends `RefCounted`. */
abstract class Lightmapper extends RefCounted {

}

object Lightmapper {
  /** Class metadata for Gd[Lightmapper] lifetime management and casting. */
  given GodotClass[Lightmapper] with {
    def className = "Lightmapper"
    def isRefCounted = true
    def wrap(o: GodotObject): Lightmapper = new Lightmapper {}.withHost(o.objectPtr)
    def unwrap(t: Lightmapper): GodotObject = t.hostObject
  }
}
