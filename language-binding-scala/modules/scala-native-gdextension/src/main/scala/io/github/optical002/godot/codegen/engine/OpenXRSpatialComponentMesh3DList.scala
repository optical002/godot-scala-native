package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentMesh3DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMesh3DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentMesh3DList.get_transform */
  final def getTransform(index: Long): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

  /** OpenXRSpatialComponentMesh3DList.get_mesh */
  final def getMesh(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("OpenXRSpatialComponentMesh3DList", "get_mesh", 1576363275L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentMesh3DList {
  /** Class metadata for Gd[OpenXRSpatialComponentMesh3DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentMesh3DList] with {
    def className = "OpenXRSpatialComponentMesh3DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentMesh3DList = new OpenXRSpatialComponentMesh3DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentMesh3DList): GodotObject = t.hostObject
  }
}
