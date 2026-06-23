package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceFormatSaver`, extends `RefCounted`. */
abstract class ResourceFormatSaver extends RefCounted {

}

object ResourceFormatSaver {
  /** Class metadata for Gd[ResourceFormatSaver] lifetime management and casting. */
  given GodotClass[ResourceFormatSaver] with {
    def className = "ResourceFormatSaver"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceFormatSaver = new ResourceFormatSaver {}.withHost(o.objectPtr)
    def unwrap(t: ResourceFormatSaver): GodotObject = t.hostObject
  }
}
