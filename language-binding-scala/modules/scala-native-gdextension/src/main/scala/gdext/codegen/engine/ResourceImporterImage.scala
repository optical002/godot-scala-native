package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterImage`, extends `ResourceImporter`. */
abstract class ResourceImporterImage extends ResourceImporter {

}

object ResourceImporterImage {
  /** Class metadata for Gd[ResourceImporterImage] lifetime management and casting. */
  given GodotClass[ResourceImporterImage] with {
    def className = "ResourceImporterImage"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterImage = new ResourceImporterImage {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterImage): GodotObject = t.hostObject
  }
}
