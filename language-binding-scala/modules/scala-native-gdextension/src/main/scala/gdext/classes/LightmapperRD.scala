package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `LightmapperRD`, extends `Lightmapper`. */
abstract class LightmapperRD extends Lightmapper {

}

object LightmapperRD {
  /** Class metadata for Gd[LightmapperRD] lifetime management and casting. */
  given GodotClass[LightmapperRD] with {
    def className = "LightmapperRD"
    def isRefCounted = true
    def wrap(o: GodotObject): LightmapperRD = new LightmapperRD {}.withHost(o.objectPtr)
    def unwrap(t: LightmapperRD): GodotObject = t.hostObject
  }
}
