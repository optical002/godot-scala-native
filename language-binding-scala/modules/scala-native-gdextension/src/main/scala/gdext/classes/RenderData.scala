package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderData`, extends `Object`. */
abstract class RenderData extends Object {
  override def godotClassName: String = "RenderData"

  /** RenderData.get_render_scene_buffers */
  final def getRenderSceneBuffers(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderData", "get_render_scene_buffers", 2793216201L), hostObject.objectPtr)

  /** RenderData.get_render_scene_data */
  final def getRenderSceneData(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("RenderData", "get_render_scene_data", 1288715698L), hostObject.objectPtr)

}
