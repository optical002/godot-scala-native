package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CollisionShape3D`, extends `Node3D`. */
abstract class CollisionShape3D extends Node3D {

  /** CollisionShape3D.resource_changed */
  final def resourceChanged(resource: Resource): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape3D", "resource_changed", 968641751L), hostObject.objectPtr, resource.hostObject)

  /** CollisionShape3D.set_shape */
  final def setShape(shape: Shape3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape3D", "set_shape", 1549710052L), hostObject.objectPtr, shape.hostObject)

  /** CollisionShape3D.get_shape */
  final def getShape(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CollisionShape3D", "get_shape", 3214262478L), hostObject.objectPtr)

  /** CollisionShape3D.set_disabled */
  final def setDisabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape3D", "set_disabled", 2586408642L), hostObject.objectPtr, enable)

  /** CollisionShape3D.is_disabled */
  final def isDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionShape3D", "is_disabled", 36873697L), hostObject.objectPtr)

  /** CollisionShape3D.make_convex_from_siblings */
  final def makeConvexFromSiblings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CollisionShape3D", "make_convex_from_siblings", 3218959716L), hostObject.objectPtr)

  /** CollisionShape3D.set_debug_color */
  final def setDebugColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape3D", "set_debug_color", 2920490490L), hostObject.objectPtr, color)

  /** CollisionShape3D.get_debug_color */
  final def getDebugColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CollisionShape3D", "get_debug_color", 3444240500L), hostObject.objectPtr)

  /** CollisionShape3D.set_enable_debug_fill */
  final def setEnableDebugFill(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CollisionShape3D", "set_enable_debug_fill", 2586408642L), hostObject.objectPtr, enable)

  /** CollisionShape3D.get_enable_debug_fill */
  final def getEnableDebugFill(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CollisionShape3D", "get_enable_debug_fill", 36873697L), hostObject.objectPtr)

}

object CollisionShape3D {
  /** Class metadata for Gd[CollisionShape3D] lifetime management and casting. */
  given GodotClass[CollisionShape3D] with {
    def className = "CollisionShape3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CollisionShape3D = new CollisionShape3D {}.withHost(o.objectPtr)
    def unwrap(t: CollisionShape3D): GodotObject = t.hostObject
  }
}
