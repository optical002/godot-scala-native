package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffers`, extends `RefCounted`. */
abstract class RenderSceneBuffers extends RefCounted {

  /** RenderSceneBuffers.configure */
  final def configure(config: RenderSceneBuffersConfiguration): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffers", "configure", 3072623270L), hostObject.objectPtr, config.hostObject)

}

object RenderSceneBuffers {
  /** Class metadata for Gd[RenderSceneBuffers] lifetime management and casting. */
  given GodotClass[RenderSceneBuffers] with {
    def className = "RenderSceneBuffers"
    def isRefCounted = true
    def wrap(o: GodotObject): RenderSceneBuffers = new RenderSceneBuffers {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneBuffers): GodotObject = t.hostObject
  }
}
