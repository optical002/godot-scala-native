package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneBuffers`, extends `RefCounted`. */
abstract class RenderSceneBuffers extends RefCounted {
  override def godotClassName: String = "RenderSceneBuffers"

  /** RenderSceneBuffers.configure */
  final def configure(config: RenderSceneBuffersConfiguration): Unit =
    Ptrcall.callVoid1(MethodBind.get("RenderSceneBuffers", "configure", 3072623270L), hostObject.objectPtr, config.hostObject)

}
