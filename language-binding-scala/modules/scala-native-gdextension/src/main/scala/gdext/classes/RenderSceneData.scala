package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RenderSceneData`, extends `Object`. */
abstract class RenderSceneData extends Object {
  override def godotClassName: String = "RenderSceneData"

  /** RenderSceneData.get_cam_transform */
  final def getCamTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.RenderSceneData.mb_get_cam_transform == null) gdext.classes.RenderSceneData.mb_get_cam_transform = MethodBind.get("RenderSceneData", "get_cam_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.RenderSceneData.mb_get_cam_transform, livePtr)
  }

  /** RenderSceneData.get_cam_projection */
  final def getCamProjection(): gdext.builtin.Projection = {
    if (gdext.classes.RenderSceneData.mb_get_cam_projection == null) gdext.classes.RenderSceneData.mb_get_cam_projection = MethodBind.get("RenderSceneData", "get_cam_projection", 2910717950L)
    Ptrcall.call0[gdext.builtin.Projection](gdext.classes.RenderSceneData.mb_get_cam_projection, livePtr)
  }

  /** RenderSceneData.get_view_count */
  final def getViewCount(): Long = {
    if (gdext.classes.RenderSceneData.mb_get_view_count == null) gdext.classes.RenderSceneData.mb_get_view_count = MethodBind.get("RenderSceneData", "get_view_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RenderSceneData.mb_get_view_count, livePtr)
  }

  /** RenderSceneData.get_view_eye_offset */
  final def getViewEyeOffset(view: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.RenderSceneData.mb_get_view_eye_offset == null) gdext.classes.RenderSceneData.mb_get_view_eye_offset = MethodBind.get("RenderSceneData", "get_view_eye_offset", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.RenderSceneData.mb_get_view_eye_offset, livePtr, view)
  }

  /** RenderSceneData.get_view_projection */
  final def getViewProjection(view: Long): gdext.builtin.Projection = {
    if (gdext.classes.RenderSceneData.mb_get_view_projection == null) gdext.classes.RenderSceneData.mb_get_view_projection = MethodBind.get("RenderSceneData", "get_view_projection", 3179846605L)
    Ptrcall.call1[Long, gdext.builtin.Projection](gdext.classes.RenderSceneData.mb_get_view_projection, livePtr, view)
  }

}

object RenderSceneData {
  private[classes] var mb_get_cam_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cam_projection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_eye_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_view_projection: GDExtensionMethodBindPtr = null
}
