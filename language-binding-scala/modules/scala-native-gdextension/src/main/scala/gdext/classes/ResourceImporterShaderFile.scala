package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterShaderFile`, extends `ResourceImporter`. */
abstract class ResourceImporterShaderFile extends ResourceImporter {

}

object ResourceImporterShaderFile {
  /** Class metadata for Gd[ResourceImporterShaderFile] lifetime management and casting. */
  given GodotClass[ResourceImporterShaderFile] with {
    def className = "ResourceImporterShaderFile"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterShaderFile = new ResourceImporterShaderFile {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterShaderFile): GodotObject = t.hostObject
  }
}
