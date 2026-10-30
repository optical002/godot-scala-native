package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderData`, extends `Object`. */
abstract class RenderData extends Object {
  override def godotClassName: String = "RenderData"

  /** RenderData.get_render_scene_buffers. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRenderSceneBuffers(): RenderSceneBuffers = {
    if (gdext.classes.RenderData.mb_get_render_scene_buffers == null) gdext.classes.RenderData.mb_get_render_scene_buffers = MethodBind.get("RenderData", "get_render_scene_buffers", 2793216201L)
    Wrappers.owned[RenderSceneBuffers](Ptrcall.call0[Long](gdext.classes.RenderData.mb_get_render_scene_buffers, livePtr))
  }

  /** RenderData.get_render_scene_data */
  final def getRenderSceneData(): RenderSceneData = {
    if (gdext.classes.RenderData.mb_get_render_scene_data == null) gdext.classes.RenderData.mb_get_render_scene_data = MethodBind.get("RenderData", "get_render_scene_data", 1288715698L)
    Wrappers.borrowed[RenderSceneData](Ptrcall.call0[Long](gdext.classes.RenderData.mb_get_render_scene_data, livePtr))
  }

}

object RenderData {
  private[classes] var mb_get_render_scene_buffers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_scene_data: GDExtensionMethodBindPtr = null
}
