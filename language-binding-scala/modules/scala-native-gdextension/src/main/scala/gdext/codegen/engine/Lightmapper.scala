package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
