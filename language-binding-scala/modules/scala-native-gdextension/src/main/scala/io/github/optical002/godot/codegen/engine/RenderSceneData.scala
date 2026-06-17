package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RenderSceneData`, extends `Object`. */
abstract class RenderSceneData extends Object {

  /** RenderSceneData.get_cam_transform */
  final def getCamTransform(): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call0[io.github.optical002.godot.builtin.Transform3D](MethodBind.get("RenderSceneData", "get_cam_transform", 3229777777L), hostObject.objectPtr)

  /** RenderSceneData.get_cam_projection */
  final def getCamProjection(): io.github.optical002.godot.builtin.Projection =
    Ptrcall.call0[io.github.optical002.godot.builtin.Projection](MethodBind.get("RenderSceneData", "get_cam_projection", 2910717950L), hostObject.objectPtr)

  /** RenderSceneData.get_view_count */
  final def getViewCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RenderSceneData", "get_view_count", 3905245786L), hostObject.objectPtr)

  /** RenderSceneData.get_view_eye_offset */
  final def getViewEyeOffset(view: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("RenderSceneData", "get_view_eye_offset", 711720468L), hostObject.objectPtr, view)

  /** RenderSceneData.get_view_projection */
  final def getViewProjection(view: Long): io.github.optical002.godot.builtin.Projection =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Projection](MethodBind.get("RenderSceneData", "get_view_projection", 3179846605L), hostObject.objectPtr, view)

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
