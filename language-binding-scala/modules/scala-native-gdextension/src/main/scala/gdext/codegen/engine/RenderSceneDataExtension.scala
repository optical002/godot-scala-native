package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
