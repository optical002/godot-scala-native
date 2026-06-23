package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneDataExtension`, extends `RenderSceneData`. */
abstract class RenderSceneDataExtension extends RenderSceneData {

}

object RenderSceneDataExtension {
  /** Class metadata for Gd[RenderSceneDataExtension] lifetime management and casting. */
  given GodotClass[RenderSceneDataExtension] with {
    def className = "RenderSceneDataExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderSceneDataExtension = new RenderSceneDataExtension {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneDataExtension): GodotObject = t.hostObject
  }
}
