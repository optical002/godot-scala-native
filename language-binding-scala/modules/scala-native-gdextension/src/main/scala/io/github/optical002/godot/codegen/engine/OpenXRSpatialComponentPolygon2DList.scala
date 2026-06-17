package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentPolygon2DList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPolygon2DList extends OpenXRSpatialComponentData {

  /** OpenXRSpatialComponentPolygon2DList.get_transform */
  final def getTransform(index: Long): io.github.optical002.godot.builtin.Transform3D =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Transform3D](MethodBind.get("OpenXRSpatialComponentPolygon2DList", "get_transform", 1965739696L), hostObject.objectPtr, index)

}

object OpenXRSpatialComponentPolygon2DList {
  /** Class metadata for Gd[OpenXRSpatialComponentPolygon2DList] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentPolygon2DList] with {
    def className = "OpenXRSpatialComponentPolygon2DList"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentPolygon2DList = new OpenXRSpatialComponentPolygon2DList {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentPolygon2DList): GodotObject = t.hostObject
  }
}
