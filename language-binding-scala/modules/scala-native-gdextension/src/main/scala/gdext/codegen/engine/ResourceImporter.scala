package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporter`, extends `RefCounted`. */
abstract class ResourceImporter extends RefCounted {

}

object ResourceImporter {
  /** Class metadata for Gd[ResourceImporter] lifetime management and casting. */
  given GodotClass[ResourceImporter] with {
    def className = "ResourceImporter"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporter = new ResourceImporter {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporter): GodotObject = t.hostObject
  }
}
