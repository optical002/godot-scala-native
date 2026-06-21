package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterCSVTranslation`, extends `ResourceImporter`. */
abstract class ResourceImporterCSVTranslation extends ResourceImporter {

}

object ResourceImporterCSVTranslation {
  /** Class metadata for Gd[ResourceImporterCSVTranslation] lifetime management and casting. */
  given GodotClass[ResourceImporterCSVTranslation] with {
    def className = "ResourceImporterCSVTranslation"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterCSVTranslation = new ResourceImporterCSVTranslation {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterCSVTranslation): GodotObject = t.hostObject
  }
}
