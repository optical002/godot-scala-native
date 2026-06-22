package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterImageFont`, extends `ResourceImporter`. */
abstract class ResourceImporterImageFont extends ResourceImporter {

}

object ResourceImporterImageFont {
  /** Class metadata for Gd[ResourceImporterImageFont] lifetime management and casting. */
  given GodotClass[ResourceImporterImageFont] with {
    def className = "ResourceImporterImageFont"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterImageFont = new ResourceImporterImageFont {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterImageFont): GodotObject = t.hostObject
  }
}
