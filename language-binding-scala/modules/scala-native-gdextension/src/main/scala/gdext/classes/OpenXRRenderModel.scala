package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRRenderModel`, extends `Node3D`. */
abstract class OpenXRRenderModel extends Node3D {

  /** OpenXRRenderModel.get_top_level_path */
  final def getTopLevelPath(): String =
    Ptrcall.call0[String](MethodBind.get("OpenXRRenderModel", "get_top_level_path", 201670096L), hostObject.objectPtr)

}

object OpenXRRenderModel {
  /** Class metadata for Gd[OpenXRRenderModel] lifetime management and casting. */
  given GodotClass[OpenXRRenderModel] with {
    def className = "OpenXRRenderModel"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRRenderModel = new OpenXRRenderModel {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRRenderModel): GodotObject = t.hostObject
  }
}
