package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasLayer`, extends `Node`. */
abstract class CanvasLayer extends Node {
  override def godotClassName: String = "CanvasLayer"

  /** CanvasLayer.set_layer */
  final def setLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_layer", 1286410249L), hostObject.objectPtr, layer)

  /** CanvasLayer.get_layer */
  final def getLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasLayer", "get_layer", 3905245786L), hostObject.objectPtr)

  /** CanvasLayer.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_visible", 2586408642L), hostObject.objectPtr, visible)

  /** CanvasLayer.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasLayer", "is_visible", 36873697L), hostObject.objectPtr)

  /** CanvasLayer.show */
  final def show(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasLayer", "show", 3218959716L), hostObject.objectPtr)

  /** CanvasLayer.hide */
  final def hide(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasLayer", "hide", 3218959716L), hostObject.objectPtr)

  /** CanvasLayer.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_transform", 2761652528L), hostObject.objectPtr, transform)

  /** CanvasLayer.get_transform */
  final def getTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasLayer", "get_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasLayer.get_final_transform */
  final def getFinalTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasLayer", "get_final_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasLayer.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** CanvasLayer.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("CanvasLayer", "get_offset", 3341600327L), hostObject.objectPtr)

  /** CanvasLayer.set_rotation */
  final def setRotation(radians: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_rotation", 373806689L), hostObject.objectPtr, radians)

  /** CanvasLayer.get_rotation */
  final def getRotation(): Double =
    Ptrcall.call0[Double](MethodBind.get("CanvasLayer", "get_rotation", 1740695150L), hostObject.objectPtr)

  /** CanvasLayer.set_scale */
  final def setScale(scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_scale", 743155724L), hostObject.objectPtr, scale)

  /** CanvasLayer.get_scale */
  final def getScale(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("CanvasLayer", "get_scale", 3341600327L), hostObject.objectPtr)

  /** CanvasLayer.set_follow_viewport */
  final def setFollowViewport(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_follow_viewport", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasLayer.is_following_viewport */
  final def isFollowingViewport(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasLayer", "is_following_viewport", 36873697L), hostObject.objectPtr)

  /** CanvasLayer.set_follow_viewport_scale */
  final def setFollowViewportScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_follow_viewport_scale", 373806689L), hostObject.objectPtr, scale)

  /** CanvasLayer.get_follow_viewport_scale */
  final def getFollowViewportScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("CanvasLayer", "get_follow_viewport_scale", 1740695150L), hostObject.objectPtr)

  /** CanvasLayer.set_custom_viewport */
  final def setCustomViewport(viewport: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasLayer", "set_custom_viewport", 1078189570L), hostObject.objectPtr, viewport.hostObject)

  /** CanvasLayer.get_custom_viewport */
  final def getCustomViewport(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasLayer", "get_custom_viewport", 3160264692L), hostObject.objectPtr)

}
