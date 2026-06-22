package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffersExtension`, extends `RenderSceneBuffers`. */
abstract class RenderSceneBuffersExtension extends RenderSceneBuffers {

}

object RenderSceneBuffersExtension {
  /** Class metadata for Gd[RenderSceneBuffersExtension] lifetime management and casting. */
  given GodotClass[RenderSceneBuffersExtension] with {
    def className = "RenderSceneBuffersExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffersExtension = new RenderSceneBuffersExtension {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffersExtension): GodotObject = t.hostObject
  }
}
