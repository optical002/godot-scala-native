package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterSVG`, extends `ResourceImporter`. */
abstract class ResourceImporterSVG extends ResourceImporter {

}

object ResourceImporterSVG {
  /** Class metadata for Gd[ResourceImporterSVG] lifetime management and casting. */
  given GodotClass[ResourceImporterSVG] with {
    def className = "ResourceImporterSVG"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterSVG = new ResourceImporterSVG {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterSVG): GodotObject = t.hostObject
  }
}
