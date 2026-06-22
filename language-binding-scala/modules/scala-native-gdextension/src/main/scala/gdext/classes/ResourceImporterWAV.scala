package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterWAV`, extends `ResourceImporter`. */
abstract class ResourceImporterWAV extends ResourceImporter {

}

object ResourceImporterWAV {
  /** Class metadata for Gd[ResourceImporterWAV] lifetime management and casting. */
  given GodotClass[ResourceImporterWAV] with {
    def className = "ResourceImporterWAV"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterWAV = new ResourceImporterWAV {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterWAV): GodotObject = t.hostObject
  }
}
