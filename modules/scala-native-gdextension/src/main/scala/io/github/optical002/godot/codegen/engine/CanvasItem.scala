package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasItem`, extends `Node`. */
abstract class CanvasItem extends Node {

  /** CanvasItem.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_visible", 2586408642L), hostObject.objectPtr, visible)

  /** CanvasItem.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_visible", 36873697L), hostObject.objectPtr)

  /** CanvasItem.is_visible_in_tree */
  final def isVisibleInTree(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_visible_in_tree", 36873697L), hostObject.objectPtr)

  /** CanvasItem.show */
  final def show(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "show", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.hide */
  final def hide(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "hide", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.queue_redraw */
  final def queueRedraw(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "queue_redraw", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.move_to_front */
  final def moveToFront(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "move_to_front", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.set_as_top_level */
  final def setAsTopLevel(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_as_top_level", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.is_set_as_top_level */
  final def isSetAsTopLevel(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_set_as_top_level", 36873697L), hostObject.objectPtr)

  /** CanvasItem.set_light_mask */
  final def setLightMask(light_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_light_mask", 1286410249L), hostObject.objectPtr, light_mask)

  /** CanvasItem.get_light_mask */
  final def getLightMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_light_mask", 3905245786L), hostObject.objectPtr)

  /** CanvasItem.set_modulate */
  final def setModulate(modulate: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** CanvasItem.get_modulate */
  final def getModulate(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CanvasItem", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** CanvasItem.set_self_modulate */
  final def setSelfModulate(self_modulate: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_self_modulate", 2920490490L), hostObject.objectPtr, self_modulate)

  /** CanvasItem.get_self_modulate */
  final def getSelfModulate(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CanvasItem", "get_self_modulate", 3444240500L), hostObject.objectPtr)

  /** CanvasItem.set_z_index */
  final def setZIndex(z_index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_z_index", 1286410249L), hostObject.objectPtr, z_index)

  /** CanvasItem.get_z_index */
  final def getZIndex(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_z_index", 3905245786L), hostObject.objectPtr)

  /** CanvasItem.set_z_as_relative */
  final def setZAsRelative(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_z_as_relative", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.is_z_relative */
  final def isZRelative(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_z_relative", 36873697L), hostObject.objectPtr)

  /** CanvasItem.set_y_sort_enabled */
  final def setYSortEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_y_sort_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** CanvasItem.is_y_sort_enabled */
  final def isYSortEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_y_sort_enabled", 36873697L), hostObject.objectPtr)

  /** CanvasItem.set_draw_behind_parent */
  final def setDrawBehindParent(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_draw_behind_parent", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.is_draw_behind_parent_enabled */
  final def isDrawBehindParentEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_draw_behind_parent_enabled", 36873697L), hostObject.objectPtr)

  /** CanvasItem.draw_end_animation */
  final def drawEndAnimation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "draw_end_animation", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.get_local_mouse_position */
  final def getLocalMousePosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "get_local_mouse_position", 3341600327L), hostObject.objectPtr)

  /** CanvasItem.get_global_mouse_position */
  final def getGlobalMousePosition(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "get_global_mouse_position", 3341600327L), hostObject.objectPtr)

  /** CanvasItem.set_use_parent_material */
  final def setUseParentMaterial(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_use_parent_material", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.get_use_parent_material */
  final def getUseParentMaterial(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "get_use_parent_material", 36873697L), hostObject.objectPtr)

  /** CanvasItem.set_notify_local_transform */
  final def setNotifyLocalTransform(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_notify_local_transform", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.is_local_transform_notification_enabled */
  final def isLocalTransformNotificationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_local_transform_notification_enabled", 36873697L), hostObject.objectPtr)

  /** CanvasItem.set_notify_transform */
  final def setNotifyTransform(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_notify_transform", 2586408642L), hostObject.objectPtr, enable)

  /** CanvasItem.is_transform_notification_enabled */
  final def isTransformNotificationEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_transform_notification_enabled", 36873697L), hostObject.objectPtr)

  /** CanvasItem.force_update_transform */
  final def forceUpdateTransform(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "force_update_transform", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.make_canvas_position_local */
  final def makeCanvasPositionLocal(viewport_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "make_canvas_position_local", 2656412154L), hostObject.objectPtr, viewport_point)

  /** CanvasItem.set_visibility_layer */
  final def setVisibilityLayer(layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_visibility_layer", 1286410249L), hostObject.objectPtr, layer)

  /** CanvasItem.get_visibility_layer */
  final def getVisibilityLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_visibility_layer", 3905245786L), hostObject.objectPtr)

  /** CanvasItem.set_visibility_layer_bit */
  final def setVisibilityLayerBit(layer: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CanvasItem", "set_visibility_layer_bit", 300928843L), hostObject.objectPtr, layer, enabled)

  /** CanvasItem.get_visibility_layer_bit */
  final def getVisibilityLayerBit(layer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CanvasItem", "get_visibility_layer_bit", 1116898809L), hostObject.objectPtr, layer)

}

object CanvasItem {
  /** Class metadata for Gd[CanvasItem] lifetime management and casting. */
  given GodotClass[CanvasItem] with {
    def className = "CanvasItem"
    def isRefCounted = false
    def wrap(o: GodotObject): CanvasItem = new CanvasItem {}.withHost(o.objectPtr)
    def unwrap(t: CanvasItem): GodotObject = t.hostObject
  }
}
