package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterTexture`, extends `ResourceImporter`. */
abstract class ResourceImporterTexture extends ResourceImporter {

}

object ResourceImporterTexture {
  /** Class metadata for Gd[ResourceImporterTexture] lifetime management and casting. */
  given GodotClass[ResourceImporterTexture] with {
    def className = "ResourceImporterTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterTexture = new ResourceImporterTexture {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterTexture): GodotObject = t.hostObject
  }
}
