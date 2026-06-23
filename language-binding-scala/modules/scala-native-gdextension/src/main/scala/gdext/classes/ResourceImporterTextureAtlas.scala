package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterTextureAtlas`, extends `ResourceImporter`. */
abstract class ResourceImporterTextureAtlas extends ResourceImporter {

}

object ResourceImporterTextureAtlas {
  /** Class metadata for Gd[ResourceImporterTextureAtlas] lifetime management and casting. */
  given GodotClass[ResourceImporterTextureAtlas] with {
    def className = "ResourceImporterTextureAtlas"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterTextureAtlas = new ResourceImporterTextureAtlas {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterTextureAtlas): GodotObject = t.hostObject
  }
}
