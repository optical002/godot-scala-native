package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasLayer`, extends `Node`. */
abstract class CanvasLayer extends Node {
  override def godotClassName: String = "CanvasLayer"

  /** CanvasLayer.set_layer */
  final def setLayer(layer: Long): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_layer == null) gdext.classes.CanvasLayer.mb_set_layer = MethodBind.get("CanvasLayer", "set_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_layer, livePtr, layer)
  }

  /** CanvasLayer.get_layer */
  final def getLayer(): Long = {
    if (gdext.classes.CanvasLayer.mb_get_layer == null) gdext.classes.CanvasLayer.mb_get_layer = MethodBind.get("CanvasLayer", "get_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasLayer.mb_get_layer, livePtr)
  }

  /** CanvasLayer.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_visible == null) gdext.classes.CanvasLayer.mb_set_visible = MethodBind.get("CanvasLayer", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_visible, livePtr, visible)
  }

  /** CanvasLayer.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.CanvasLayer.mb_is_visible == null) gdext.classes.CanvasLayer.mb_is_visible = MethodBind.get("CanvasLayer", "is_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasLayer.mb_is_visible, livePtr)
  }

  /** CanvasLayer.show */
  final def show(): Unit = {
    if (gdext.classes.CanvasLayer.mb_show == null) gdext.classes.CanvasLayer.mb_show = MethodBind.get("CanvasLayer", "show", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasLayer.mb_show, livePtr)
  }

  /** CanvasLayer.hide */
  final def hide(): Unit = {
    if (gdext.classes.CanvasLayer.mb_hide == null) gdext.classes.CanvasLayer.mb_hide = MethodBind.get("CanvasLayer", "hide", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasLayer.mb_hide, livePtr)
  }

  /** CanvasLayer.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_transform == null) gdext.classes.CanvasLayer.mb_set_transform = MethodBind.get("CanvasLayer", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_transform, livePtr, transform)
  }

  /** CanvasLayer.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasLayer.mb_get_transform == null) gdext.classes.CanvasLayer.mb_get_transform = MethodBind.get("CanvasLayer", "get_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasLayer.mb_get_transform, livePtr)
  }

  /** CanvasLayer.get_final_transform */
  final def getFinalTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasLayer.mb_get_final_transform == null) gdext.classes.CanvasLayer.mb_get_final_transform = MethodBind.get("CanvasLayer", "get_final_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasLayer.mb_get_final_transform, livePtr)
  }

  /** CanvasLayer.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_offset == null) gdext.classes.CanvasLayer.mb_set_offset = MethodBind.get("CanvasLayer", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_offset, livePtr, offset)
  }

  /** CanvasLayer.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.CanvasLayer.mb_get_offset == null) gdext.classes.CanvasLayer.mb_get_offset = MethodBind.get("CanvasLayer", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CanvasLayer.mb_get_offset, livePtr)
  }

  /** CanvasLayer.set_rotation */
  final def setRotation(radians: Double): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_rotation == null) gdext.classes.CanvasLayer.mb_set_rotation = MethodBind.get("CanvasLayer", "set_rotation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_rotation, livePtr, radians)
  }

  /** CanvasLayer.get_rotation */
  final def getRotation(): Double = {
    if (gdext.classes.CanvasLayer.mb_get_rotation == null) gdext.classes.CanvasLayer.mb_get_rotation = MethodBind.get("CanvasLayer", "get_rotation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CanvasLayer.mb_get_rotation, livePtr)
  }

  /** CanvasLayer.set_scale */
  final def setScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_scale == null) gdext.classes.CanvasLayer.mb_set_scale = MethodBind.get("CanvasLayer", "set_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_scale, livePtr, scale)
  }

  /** CanvasLayer.get_scale */
  final def getScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.CanvasLayer.mb_get_scale == null) gdext.classes.CanvasLayer.mb_get_scale = MethodBind.get("CanvasLayer", "get_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CanvasLayer.mb_get_scale, livePtr)
  }

  /** CanvasLayer.set_follow_viewport */
  final def setFollowViewport(enable: Boolean): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_follow_viewport == null) gdext.classes.CanvasLayer.mb_set_follow_viewport = MethodBind.get("CanvasLayer", "set_follow_viewport", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_follow_viewport, livePtr, enable)
  }

  /** CanvasLayer.is_following_viewport */
  final def isFollowingViewport(): Boolean = {
    if (gdext.classes.CanvasLayer.mb_is_following_viewport == null) gdext.classes.CanvasLayer.mb_is_following_viewport = MethodBind.get("CanvasLayer", "is_following_viewport", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasLayer.mb_is_following_viewport, livePtr)
  }

  /** CanvasLayer.set_follow_viewport_scale */
  final def setFollowViewportScale(scale: Double): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_follow_viewport_scale == null) gdext.classes.CanvasLayer.mb_set_follow_viewport_scale = MethodBind.get("CanvasLayer", "set_follow_viewport_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_follow_viewport_scale, livePtr, scale)
  }

  /** CanvasLayer.get_follow_viewport_scale */
  final def getFollowViewportScale(): Double = {
    if (gdext.classes.CanvasLayer.mb_get_follow_viewport_scale == null) gdext.classes.CanvasLayer.mb_get_follow_viewport_scale = MethodBind.get("CanvasLayer", "get_follow_viewport_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CanvasLayer.mb_get_follow_viewport_scale, livePtr)
  }

  /** CanvasLayer.set_custom_viewport */
  final def setCustomViewport(viewport: Node): Unit = {
    if (gdext.classes.CanvasLayer.mb_set_custom_viewport == null) gdext.classes.CanvasLayer.mb_set_custom_viewport = MethodBind.get("CanvasLayer", "set_custom_viewport", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.CanvasLayer.mb_set_custom_viewport, livePtr, Wrappers.handle(viewport))
  }

  /** CanvasLayer.get_custom_viewport */
  final def getCustomViewport(): Node = {
    if (gdext.classes.CanvasLayer.mb_get_custom_viewport == null) gdext.classes.CanvasLayer.mb_get_custom_viewport = MethodBind.get("CanvasLayer", "get_custom_viewport", 3160264692L)
    Wrappers.borrowed[Node](Ptrcall.call0[Long](gdext.classes.CanvasLayer.mb_get_custom_viewport, livePtr))
  }

}

object CanvasLayer {
  private[classes] var mb_set_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_show: GDExtensionMethodBindPtr = null
  private[classes] var mb_hide: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_final_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_following_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_follow_viewport_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_follow_viewport_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_viewport: GDExtensionMethodBindPtr = null
}
