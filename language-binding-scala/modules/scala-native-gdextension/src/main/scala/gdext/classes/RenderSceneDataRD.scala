package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneDataRD`, extends `RenderSceneData`. */
abstract class RenderSceneDataRD extends RenderSceneData {

}

object RenderSceneDataRD {
  /** Class metadata for Gd[RenderSceneDataRD] lifetime management and casting. */
  given GodotClass[RenderSceneDataRD] with {
    def className = "RenderSceneDataRD"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderSceneDataRD = new RenderSceneDataRD {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneDataRD): GodotObject = t.hostObject
  }
}
