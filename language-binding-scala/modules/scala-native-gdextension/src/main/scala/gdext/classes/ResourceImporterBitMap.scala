package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterBitMap`, extends `ResourceImporter`. */
abstract class ResourceImporterBitMap extends ResourceImporter {

}

object ResourceImporterBitMap {
  /** Class metadata for Gd[ResourceImporterBitMap] lifetime management and casting. */
  given GodotClass[ResourceImporterBitMap] with {
    def className = "ResourceImporterBitMap"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterBitMap = new ResourceImporterBitMap {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterBitMap): GodotObject = t.hostObject
  }
}
