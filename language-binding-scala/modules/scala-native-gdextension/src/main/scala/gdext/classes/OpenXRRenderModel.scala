package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRRenderModel`, extends `Node3D`. */
abstract class OpenXRRenderModel extends Node3D {
  override def godotClassName: String = "OpenXRRenderModel"

  /** OpenXRRenderModel.get_top_level_path */
  final def getTopLevelPath(): String = {
    if (gdext.classes.OpenXRRenderModel.mb_get_top_level_path == null) gdext.classes.OpenXRRenderModel.mb_get_top_level_path = MethodBind.get("OpenXRRenderModel", "get_top_level_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.OpenXRRenderModel.mb_get_top_level_path, livePtr)
  }

}

object OpenXRRenderModel {
  private[classes] var mb_get_top_level_path: GDExtensionMethodBindPtr = null
}
