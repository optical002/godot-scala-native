package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneData`, extends `Object`. */
abstract class RenderSceneData extends Object {

  /** RenderSceneData.get_cam_transform */
  final def getCamTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("RenderSceneData", "get_cam_transform", 3229777777L), hostObject.objectPtr)

  /** RenderSceneData.get_cam_projection */
  final def getCamProjection(): gdext.builtin.Projection =
    Ptrcall.call0[gdext.builtin.Projection](MethodBind.get("RenderSceneData", "get_cam_projection", 2910717950L), hostObject.objectPtr)

  /** RenderSceneData.get_view_count */
  final def getViewCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneData", "get_view_count", 3905245786L), hostObject.objectPtr)

  /** RenderSceneData.get_view_eye_offset */
  final def getViewEyeOffset(view: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("RenderSceneData", "get_view_eye_offset", 711720468L), hostObject.objectPtr, view)

  /** RenderSceneData.get_view_projection */
  final def getViewProjection(view: Long): gdext.builtin.Projection =
    Ptrcall.call1[Long, gdext.builtin.Projection](MethodBind.get("RenderSceneData", "get_view_projection", 3179846605L), hostObject.objectPtr, view)

}

object RenderSceneData {
  /** Class metadata for Gd[RenderSceneData] lifetime management and casting. */
  given GodotClass[RenderSceneData] with {
    def className = "RenderSceneData"
    def isRefCounted = false
    def wrap(o: GodotObject): RenderSceneData = new RenderSceneData {}.withHost(o.objectPtr)
    def unwrap(t: RenderSceneData): GodotObject = t.hostObject
  }
}
