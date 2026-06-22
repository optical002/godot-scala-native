package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterLayeredTexture`, extends `ResourceImporter`. */
abstract class ResourceImporterLayeredTexture extends ResourceImporter {

}

object ResourceImporterLayeredTexture {
  /** Class metadata for Gd[ResourceImporterLayeredTexture] lifetime management and casting. */
  given GodotClass[ResourceImporterLayeredTexture] with {
    def className = "ResourceImporterLayeredTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterLayeredTexture = new ResourceImporterLayeredTexture {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterLayeredTexture): GodotObject = t.hostObject
  }
}
