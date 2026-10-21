package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Node2D`, extends `CanvasItem`. */
abstract class Node2D extends CanvasItem {
  override def godotClassName: String = "Node2D"

  /** Node2D.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_set_position == null) gdext.classes.Node2D.mb_set_position = MethodBind.get("Node2D", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_position, livePtr, position)
  }

  /** Node2D.set_rotation */
  final def setRotation(radians: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_rotation == null) gdext.classes.Node2D.mb_set_rotation = MethodBind.get("Node2D", "set_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_rotation, livePtr, radians)
  }

  /** Node2D.set_rotation_degrees */
  final def setRotationDegrees(degrees: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_rotation_degrees == null) gdext.classes.Node2D.mb_set_rotation_degrees = MethodBind.get("Node2D", "set_rotation_degrees", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_rotation_degrees, livePtr, degrees)
  }

  /** Node2D.set_skew */
  final def setSkew(radians: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_skew == null) gdext.classes.Node2D.mb_set_skew = MethodBind.get("Node2D", "set_skew", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_skew, livePtr, radians)
  }

  /** Node2D.set_scale */
  final def setScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_set_scale == null) gdext.classes.Node2D.mb_set_scale = MethodBind.get("Node2D", "set_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_scale, livePtr, scale)
  }

  /** Node2D.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_get_position == null) gdext.classes.Node2D.mb_get_position = MethodBind.get("Node2D", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Node2D.mb_get_position, livePtr)
  }

  /** Node2D.get_rotation */
  final def getRotation(): Double = {
    if (gdext.classes.Node2D.mb_get_rotation == null) gdext.classes.Node2D.mb_get_rotation = MethodBind.get("Node2D", "get_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_rotation, livePtr)
  }

  /** Node2D.get_rotation_degrees */
  final def getRotationDegrees(): Double = {
    if (gdext.classes.Node2D.mb_get_rotation_degrees == null) gdext.classes.Node2D.mb_get_rotation_degrees = MethodBind.get("Node2D", "get_rotation_degrees", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_rotation_degrees, livePtr)
  }

  /** Node2D.get_skew */
  final def getSkew(): Double = {
    if (gdext.classes.Node2D.mb_get_skew == null) gdext.classes.Node2D.mb_get_skew = MethodBind.get("Node2D", "get_skew", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_skew, livePtr)
  }

  /** Node2D.get_scale */
  final def getScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_get_scale == null) gdext.classes.Node2D.mb_get_scale = MethodBind.get("Node2D", "get_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Node2D.mb_get_scale, livePtr)
  }

  /** Node2D.rotate */
  final def rotate(radians: Double): Unit = {
    if (gdext.classes.Node2D.mb_rotate == null) gdext.classes.Node2D.mb_rotate = MethodBind.get("Node2D", "rotate", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_rotate, livePtr, radians)
  }

  /** Node2D.move_local_x */
  final def moveLocalX(delta: Double, scaled: Boolean): Unit = {
    if (gdext.classes.Node2D.mb_move_local_x == null) gdext.classes.Node2D.mb_move_local_x = MethodBind.get("Node2D", "move_local_x", 2087892650L)
    Ptrcall.callVoid2(gdext.classes.Node2D.mb_move_local_x, livePtr, delta, scaled)
  }

  /** Node2D.move_local_y */
  final def moveLocalY(delta: Double, scaled: Boolean): Unit = {
    if (gdext.classes.Node2D.mb_move_local_y == null) gdext.classes.Node2D.mb_move_local_y = MethodBind.get("Node2D", "move_local_y", 2087892650L)
    Ptrcall.callVoid2(gdext.classes.Node2D.mb_move_local_y, livePtr, delta, scaled)
  }

  /** Node2D.translate */
  final def translate(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_translate == null) gdext.classes.Node2D.mb_translate = MethodBind.get("Node2D", "translate", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_translate, livePtr, offset)
  }

  /** Node2D.global_translate */
  final def globalTranslate(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_global_translate == null) gdext.classes.Node2D.mb_global_translate = MethodBind.get("Node2D", "global_translate", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_global_translate, livePtr, offset)
  }

  /** Node2D.apply_scale */
  final def applyScale(ratio: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_apply_scale == null) gdext.classes.Node2D.mb_apply_scale = MethodBind.get("Node2D", "apply_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_apply_scale, livePtr, ratio)
  }

  /** Node2D.set_global_position */
  final def setGlobalPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_set_global_position == null) gdext.classes.Node2D.mb_set_global_position = MethodBind.get("Node2D", "set_global_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_position, livePtr, position)
  }

  /** Node2D.get_global_position */
  final def getGlobalPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_get_global_position == null) gdext.classes.Node2D.mb_get_global_position = MethodBind.get("Node2D", "get_global_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Node2D.mb_get_global_position, livePtr)
  }

  /** Node2D.set_global_rotation */
  final def setGlobalRotation(radians: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_global_rotation == null) gdext.classes.Node2D.mb_set_global_rotation = MethodBind.get("Node2D", "set_global_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_rotation, livePtr, radians)
  }

  /** Node2D.set_global_rotation_degrees */
  final def setGlobalRotationDegrees(degrees: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_global_rotation_degrees == null) gdext.classes.Node2D.mb_set_global_rotation_degrees = MethodBind.get("Node2D", "set_global_rotation_degrees", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_rotation_degrees, livePtr, degrees)
  }

  /** Node2D.get_global_rotation */
  final def getGlobalRotation(): Double = {
    if (gdext.classes.Node2D.mb_get_global_rotation == null) gdext.classes.Node2D.mb_get_global_rotation = MethodBind.get("Node2D", "get_global_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_global_rotation, livePtr)
  }

  /** Node2D.get_global_rotation_degrees */
  final def getGlobalRotationDegrees(): Double = {
    if (gdext.classes.Node2D.mb_get_global_rotation_degrees == null) gdext.classes.Node2D.mb_get_global_rotation_degrees = MethodBind.get("Node2D", "get_global_rotation_degrees", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_global_rotation_degrees, livePtr)
  }

  /** Node2D.set_global_skew */
  final def setGlobalSkew(radians: Double): Unit = {
    if (gdext.classes.Node2D.mb_set_global_skew == null) gdext.classes.Node2D.mb_set_global_skew = MethodBind.get("Node2D", "set_global_skew", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_skew, livePtr, radians)
  }

  /** Node2D.get_global_skew */
  final def getGlobalSkew(): Double = {
    if (gdext.classes.Node2D.mb_get_global_skew == null) gdext.classes.Node2D.mb_get_global_skew = MethodBind.get("Node2D", "get_global_skew", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Node2D.mb_get_global_skew, livePtr)
  }

  /** Node2D.set_global_scale */
  final def setGlobalScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_set_global_scale == null) gdext.classes.Node2D.mb_set_global_scale = MethodBind.get("Node2D", "set_global_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_scale, livePtr, scale)
  }

  /** Node2D.get_global_scale */
  final def getGlobalScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_get_global_scale == null) gdext.classes.Node2D.mb_get_global_scale = MethodBind.get("Node2D", "get_global_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Node2D.mb_get_global_scale, livePtr)
  }

  /** Node2D.set_transform */
  final def setTransform(xform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.Node2D.mb_set_transform == null) gdext.classes.Node2D.mb_set_transform = MethodBind.get("Node2D", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_transform, livePtr, xform)
  }

  /** Node2D.set_global_transform */
  final def setGlobalTransform(xform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.Node2D.mb_set_global_transform == null) gdext.classes.Node2D.mb_set_global_transform = MethodBind.get("Node2D", "set_global_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_set_global_transform, livePtr, xform)
  }

  /** Node2D.look_at */
  final def lookAt(point: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Node2D.mb_look_at == null) gdext.classes.Node2D.mb_look_at = MethodBind.get("Node2D", "look_at", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Node2D.mb_look_at, livePtr, point)
  }

  /** Node2D.get_angle_to */
  final def getAngleTo(point: gdext.builtin.Vector2): Double = {
    if (gdext.classes.Node2D.mb_get_angle_to == null) gdext.classes.Node2D.mb_get_angle_to = MethodBind.get("Node2D", "get_angle_to", 2276447920L)
    Ptrcall.call1[gdext.builtin.Vector2, Double](gdext.classes.Node2D.mb_get_angle_to, livePtr, point)
  }

  /** Node2D.to_local */
  final def toLocal(global_point: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_to_local == null) gdext.classes.Node2D.mb_to_local = MethodBind.get("Node2D", "to_local", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.Node2D.mb_to_local, livePtr, global_point)
  }

  /** Node2D.to_global */
  final def toGlobal(local_point: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.Node2D.mb_to_global == null) gdext.classes.Node2D.mb_to_global = MethodBind.get("Node2D", "to_global", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.Node2D.mb_to_global, livePtr, local_point)
  }

  /** Node2D.get_relative_transform_to_parent */
  final def getRelativeTransformToParent(parent: Node): gdext.builtin.Transform2D = {
    if (gdext.classes.Node2D.mb_get_relative_transform_to_parent == null) gdext.classes.Node2D.mb_get_relative_transform_to_parent = MethodBind.get("Node2D", "get_relative_transform_to_parent", 904556875L)
    Ptrcall.call1[GodotObject, gdext.builtin.Transform2D](gdext.classes.Node2D.mb_get_relative_transform_to_parent, livePtr, Wrappers.handle(parent))
  }

}

object Node2D {
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_local_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_local_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_global_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_rotation_degrees: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_skew: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_look_at: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angle_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_global: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_relative_transform_to_parent: GDExtensionMethodBindPtr = null
}
