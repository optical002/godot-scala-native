package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentBounded2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentBounded2DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentBounded2DList.get_center_pose */
  final def getCenterPose(index: Long): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_center_pose", 1965739696L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentBounded2DList.get_size */
  final def getSize(index: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("OpenXRSpatialComponentBounded2DList", "get_size", 2299179447L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentBounded2DList {
  /** Class metadata for Gd[OpenXRSpatialComponentBounded2DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentBounded2DList] with {
    def className = "OpenXRSpatialComponentBounded2DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentBounded2DList = new OpenXRSpatialComponentBounded2DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentBounded2DList): GodotObject = t.hostObject
  }
}
