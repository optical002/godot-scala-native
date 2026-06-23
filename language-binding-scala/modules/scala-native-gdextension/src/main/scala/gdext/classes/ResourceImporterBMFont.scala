package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterBMFont`, extends `ResourceImporter`. */
abstract class ResourceImporterBMFont extends ResourceImporter {

}

object ResourceImporterBMFont {
  /** Class metadata for Gd[ResourceImporterBMFont] lifetime management and casting. */
  given GodotClass[ResourceImporterBMFont] with {
    def className = "ResourceImporterBMFont"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterBMFont = new ResourceImporterBMFont {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterBMFont): GodotObject = t.hostObject
  }
}
