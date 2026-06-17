package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialComponentData`, extends `RefCounted`. */
abstract class OpenXRSpatialComponentData extends RefCounted {

  /** OpenXRSpatialComponentData.set_capacity */
  final def setCapacity(capacity: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialComponentData", "set_capacity", 1286410249L), hostObject.objectPtr, capacity)

}

object OpenXRSpatialComponentData {
  /** Class metadata for Gd[OpenXRSpatialComponentData] lifetime management and casting. */
  given GodotClass[OpenXRSpatialComponentData] with {
    def className = "OpenXRSpatialComponentData"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialComponentData = new OpenXRSpatialComponentData {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialComponentData): GodotObject = t.hostObject
  }
}
