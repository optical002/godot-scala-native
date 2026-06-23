package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterScene`, extends `ResourceImporter`. */
abstract class ResourceImporterScene extends ResourceImporter {

}

object ResourceImporterScene {
  /** Class metadata for Gd[ResourceImporterScene] lifetime management and casting. */
  given GodotClass[ResourceImporterScene] with {
    def className = "ResourceImporterScene"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterScene = new ResourceImporterScene {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterScene): GodotObject = t.hostObject
  }
}
