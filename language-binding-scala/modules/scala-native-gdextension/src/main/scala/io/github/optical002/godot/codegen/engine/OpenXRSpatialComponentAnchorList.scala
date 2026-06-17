package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentAnchorList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentAnchorList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentAnchorList.get_entity_pose */
  final def getEntityPose(index: Long): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentAnchorList", "get_entity_pose", 1965739696L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentAnchorList {
  /** Class metadata for Gd[OpenXRSpatialComponentAnchorList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentAnchorList] with {
    def className = "OpenXRSpatialComponentAnchorList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentAnchorList = new OpenXRSpatialComponentAnchorList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentAnchorList): GodotObject = t.hostObject
  }
}
