package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh2DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentMesh2DList.get_transform */
  final def getTransform(index: Long): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentMesh2DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentMesh2DList {
  /** Class metadata for Gd[OpenXRSpatialComponentMesh2DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentMesh2DList] with {
    def className = "OpenXRSpatialComponentMesh2DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentMesh2DList = new OpenXRSpatialComponentMesh2DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentMesh2DList): GodotObject = t.hostObject
  }
}
