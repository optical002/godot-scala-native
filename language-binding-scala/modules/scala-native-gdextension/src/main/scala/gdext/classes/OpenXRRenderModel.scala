package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRRenderModel`, extends `Node3D`. */
abstract class OpenXRRenderModel extends Node3D {
  override def godotClassName: String = "OpenXRRenderModel"

  /** OpenXRRenderModel.get_top_level_path */
  final def getTopLevelPath(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRRenderModel", "get_top_level_path", 201670096L), hostObject.objectPtr)

}
