package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterMP3`, extends `ResourceImporter`. */
abstract class ResourceImporterMP3 extends ResourceImporter {

}

object ResourceImporterMP3 {
  /** Class metadata for Gd[ResourceImporterMP3] lifetime management and casting. */
  given GodotClass[ResourceImporterMP3] with {
    def className = "ResourceImporterMP3"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterMP3 = new ResourceImporterMP3 {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterMP3): GodotObject = t.hostObject
  }
}
