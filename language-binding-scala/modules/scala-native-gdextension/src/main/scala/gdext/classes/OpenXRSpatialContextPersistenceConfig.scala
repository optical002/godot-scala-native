package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialContextPersistenceConfig`, extends `OpenXRStructureBase`. */
abstract class OpenXRSpatialContextPersistenceConfig extends OpenXRStructureBase {

}

object OpenXRSpatialContextPersistenceConfig {
  /** Class metadata for Gd[OpenXRSpatialContextPersistenceConfig] lifetime management and casting. */
  given GodotClass[OpenXRSpatialContextPersistenceConfig] with {
    def className = "OpenXRSpatialContextPersistenceConfig"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialContextPersistenceConfig = new OpenXRSpatialContextPersistenceConfig {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialContextPersistenceConfig): GodotObject = t.hostObject
  }
}
