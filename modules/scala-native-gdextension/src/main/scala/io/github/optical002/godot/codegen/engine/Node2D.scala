package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Node2D`, extends `CanvasItem`. */
abstract class Node2D extends CanvasItem {

  /** Node2D.set_position */
  final def setPosition(position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_position", 743155724L), hostObject.objectPtr, position)

  /** Node2D.set_rotation */
  final def setRotation(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_rotation", 373806689L), hostObject.objectPtr, radians)

  /** Node2D.set_rotation_degrees */
  final def setRotationDegrees(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_rotation_degrees", 373806689L), hostObject.objectPtr, degrees)

  /** Node2D.set_skew */
  final def setSkew(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_skew", 373806689L), hostObject.objectPtr, radians)

  /** Node2D.set_scale */
  final def setScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_scale", 743155724L), hostObject.objectPtr, scale)

  /** Node2D.get_position */
  final def getPosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_position", 3341600327L), hostObject.objectPtr)

  /** Node2D.get_rotation */
  final def getRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_rotation", 1740695150L), hostObject.objectPtr)

  /** Node2D.get_rotation_degrees */
  final def getRotationDegrees(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_rotation_degrees", 1740695150L), hostObject.objectPtr)

  /** Node2D.get_skew */
  final def getSkew(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_skew", 1740695150L), hostObject.objectPtr)

  /** Node2D.get_scale */
  final def getScale(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_scale", 3341600327L), hostObject.objectPtr)

  /** Node2D.rotate */
  final def rotate(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "rotate", 373806689L), hostObject.objectPtr, radians)

  /** Node2D.move_local_x */
  final def moveLocalX(delta: Double, scaled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node2D", "move_local_x", 2087892650L), hostObject.objectPtr, delta, scaled)

  /** Node2D.move_local_y */
  final def moveLocalY(delta: Double, scaled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Node2D", "move_local_y", 2087892650L), hostObject.objectPtr, delta, scaled)

  /** Node2D.translate */
  final def translate(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "translate", 743155724L), hostObject.objectPtr, offset)

  /** Node2D.global_translate */
  final def globalTranslate(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "global_translate", 743155724L), hostObject.objectPtr, offset)

  /** Node2D.apply_scale */
  final def applyScale(ratio: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "apply_scale", 743155724L), hostObject.objectPtr, ratio)

  /** Node2D.set_global_position */
  final def setGlobalPosition(position: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_position", 743155724L), hostObject.objectPtr, position)

  /** Node2D.get_global_position */
  final def getGlobalPosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_global_position", 3341600327L), hostObject.objectPtr)

  /** Node2D.set_global_rotation */
  final def setGlobalRotation(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_rotation", 373806689L), hostObject.objectPtr, radians)

  /** Node2D.set_global_rotation_degrees */
  final def setGlobalRotationDegrees(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_rotation_degrees", 373806689L), hostObject.objectPtr, degrees)

  /** Node2D.get_global_rotation */
  final def getGlobalRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_rotation", 1740695150L), hostObject.objectPtr)

  /** Node2D.get_global_rotation_degrees */
  final def getGlobalRotationDegrees(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_rotation_degrees", 1740695150L), hostObject.objectPtr)

  /** Node2D.set_global_skew */
  final def setGlobalSkew(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_skew", 373806689L), hostObject.objectPtr, radians)

  /** Node2D.get_global_skew */
  final def getGlobalSkew(): Double =
    Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_skew", 1740695150L), hostObject.objectPtr)

  /** Node2D.set_global_scale */
  final def setGlobalScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_scale", 743155724L), hostObject.objectPtr, scale)

  /** Node2D.get_global_scale */
  final def getGlobalScale(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_global_scale", 3341600327L), hostObject.objectPtr)

  /** Node2D.look_at */
  final def lookAt(point: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Node2D", "look_at", 743155724L), hostObject.objectPtr, point)

  /** Node2D.get_angle_to */
  final def getAngleTo(point: io.github.optical002.godot.builtin.Vector2): Double =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, Double](MethodBind.get("Node2D", "get_angle_to", 2276447920L), hostObject.objectPtr, point)

  /** Node2D.to_local */
  final def toLocal(global_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "to_local", 2656412154L), hostObject.objectPtr, global_point)

  /** Node2D.to_global */
  final def toGlobal(local_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "to_global", 2656412154L), hostObject.objectPtr, local_point)

}

object Node2D {
  /** Class metadata for Gd[Node2D] lifetime management and casting. */
  given GodotClass[Node2D] with {
    def className = "Node2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Node2D = new Node2D {}.withHost(o.objectPtr)
    def unwrap(t: Node2D): GodotObject = t.hostObject
  }
}
