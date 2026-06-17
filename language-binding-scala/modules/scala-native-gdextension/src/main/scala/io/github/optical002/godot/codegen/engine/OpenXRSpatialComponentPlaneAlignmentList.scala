package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneAlignmentList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneAlignmentList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentPlaneAlignmentList.get_plane_alignment */
  final def getPlaneAlignment(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("OpenXRSpatialComponentPlaneAlignmentList", "get_plane_alignment", 3340200270L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentPlaneAlignmentList {
  /** Class metadata for Gd[OpenXRSpatialComponentPlaneAlignmentList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentPlaneAlignmentList] with {
    def className = "OpenXRSpatialComponentPlaneAlignmentList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentPlaneAlignmentList = new OpenXRSpatialComponentPlaneAlignmentList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentPlaneAlignmentList): GodotObject = t.hostObject
  }
}
