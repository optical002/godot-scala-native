package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

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
  final def setModulate(modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** CanvasItem.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CanvasItem", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** CanvasItem.set_self_modulate */
  final def setSelfModulate(self_modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_self_modulate", 2920490490L), hostObject.objectPtr, self_modulate)

  /** CanvasItem.get_self_modulate */
  final def getSelfModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CanvasItem", "get_self_modulate", 3444240500L), hostObject.objectPtr)

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

  /** CanvasItem.draw_line */
  final def drawLine(from: gdext.builtin.Vector2, to: gdext.builtin.Vector2, color: gdext.builtin.Color, width: Double, antialiased: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("CanvasItem", "draw_line", 1562330099L), hostObject.objectPtr, from, to, color, width, antialiased)

  /** CanvasItem.draw_rect */
  final def drawRect(rect: gdext.builtin.Rect2, color: gdext.builtin.Color, filled: Boolean, width: Double, antialiased: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("CanvasItem", "draw_rect", 2773573813L), hostObject.objectPtr, rect, color, filled, width, antialiased)

  /** CanvasItem.draw_circle */
  final def drawCircle(position: gdext.builtin.Vector2, radius: Double, color: gdext.builtin.Color, filled: Boolean, width: Double, antialiased: Boolean): Unit =
    Ptrcall.callVoid6(MethodBind.get("CanvasItem", "draw_circle", 3153026596L), hostObject.objectPtr, position, radius, color, filled, width, antialiased)

  /** CanvasItem.draw_texture */
  final def drawTexture(texture: Texture2D, position: gdext.builtin.Vector2, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("CanvasItem", "draw_texture", 520200117L), hostObject.objectPtr, texture.hostObject, position, modulate)

  /** CanvasItem.draw_texture_rect */
  final def drawTextureRect(texture: Texture2D, rect: gdext.builtin.Rect2, tile: Boolean, modulate: gdext.builtin.Color, transpose: Boolean): Unit =
    Ptrcall.callVoid5(MethodBind.get("CanvasItem", "draw_texture_rect", 3832805018L), hostObject.objectPtr, texture.hostObject, rect, tile, modulate, transpose)

  /** CanvasItem.draw_texture_rect_region */
  final def drawTextureRectRegion(texture: Texture2D, rect: gdext.builtin.Rect2, src_rect: gdext.builtin.Rect2, modulate: gdext.builtin.Color, transpose: Boolean, clip_uv: Boolean): Unit =
    Ptrcall.callVoid6(MethodBind.get("CanvasItem", "draw_texture_rect_region", 3883821411L), hostObject.objectPtr, texture.hostObject, rect, src_rect, modulate, transpose, clip_uv)

  /** CanvasItem.draw_lcd_texture_rect_region */
  final def drawLcdTextureRectRegion(texture: Texture2D, rect: gdext.builtin.Rect2, src_rect: gdext.builtin.Rect2, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid4(MethodBind.get("CanvasItem", "draw_lcd_texture_rect_region", 3212350954L), hostObject.objectPtr, texture.hostObject, rect, src_rect, modulate)

  /** CanvasItem.draw_style_box */
  final def drawStyleBox(style_box: StyleBox, rect: gdext.builtin.Rect2): Unit =
    Ptrcall.callVoid2(MethodBind.get("CanvasItem", "draw_style_box", 388176283L), hostObject.objectPtr, style_box.hostObject, rect)

  /** CanvasItem.draw_char */
  final def drawChar(font: Font, pos: gdext.builtin.Vector2, char: String, font_size: Long, modulate: gdext.builtin.Color, oversampling: Double): Unit =
    Ptrcall.callVoid6(MethodBind.get("CanvasItem", "draw_char", 1336210142L), hostObject.objectPtr, font.hostObject, pos, char, font_size, modulate, oversampling)

  /** CanvasItem.draw_mesh */
  final def drawMesh(mesh: Mesh, texture: Texture2D, transform: gdext.builtin.Transform2D, modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid4(MethodBind.get("CanvasItem", "draw_mesh", 153818295L), hostObject.objectPtr, mesh.hostObject, texture.hostObject, transform, modulate)

  /** CanvasItem.draw_multimesh */
  final def drawMultimesh(multimesh: MultiMesh, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("CanvasItem", "draw_multimesh", 937992368L), hostObject.objectPtr, multimesh.hostObject, texture.hostObject)

  /** CanvasItem.draw_set_transform */
  final def drawSetTransform(position: gdext.builtin.Vector2, rotation: Double, scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid3(MethodBind.get("CanvasItem", "draw_set_transform", 288975085L), hostObject.objectPtr, position, rotation, scale)

  /** CanvasItem.draw_set_transform_matrix */
  final def drawSetTransformMatrix(xform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "draw_set_transform_matrix", 2761652528L), hostObject.objectPtr, xform)

  /** CanvasItem.draw_animation_slice */
  final def drawAnimationSlice(animation_length: Double, slice_begin: Double, slice_end: Double, offset: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("CanvasItem", "draw_animation_slice", 3112831842L), hostObject.objectPtr, animation_length, slice_begin, slice_end, offset)

  /** CanvasItem.draw_end_animation */
  final def drawEndAnimation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("CanvasItem", "draw_end_animation", 3218959716L), hostObject.objectPtr)

  /** CanvasItem.get_transform */
  final def getTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_global_transform */
  final def getGlobalTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_global_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_global_transform_with_canvas */
  final def getGlobalTransformWithCanvas(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_global_transform_with_canvas", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_viewport_transform */
  final def getViewportTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_viewport_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_viewport_rect */
  final def getViewportRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("CanvasItem", "get_viewport_rect", 1639390495L), hostObject.objectPtr)

  /** CanvasItem.get_canvas_transform */
  final def getCanvasTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_canvas_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_screen_transform */
  final def getScreenTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CanvasItem", "get_screen_transform", 3814499831L), hostObject.objectPtr)

  /** CanvasItem.get_local_mouse_position */
  final def getLocalMousePosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("CanvasItem", "get_local_mouse_position", 3341600327L), hostObject.objectPtr)

  /** CanvasItem.get_global_mouse_position */
  final def getGlobalMousePosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("CanvasItem", "get_global_mouse_position", 3341600327L), hostObject.objectPtr)

  /** CanvasItem.get_canvas_layer_node */
  final def getCanvasLayerNode(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasItem", "get_canvas_layer_node", 2602762519L), hostObject.objectPtr)

  /** CanvasItem.get_world_2d */
  final def getWorld2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasItem", "get_world_2d", 2339128592L), hostObject.objectPtr)

  /** CanvasItem.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CanvasItem.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasItem", "get_material", 5934680L), hostObject.objectPtr)

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
  final def makeCanvasPositionLocal(viewport_point: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("CanvasItem", "make_canvas_position_local", 2656412154L), hostObject.objectPtr, viewport_point)

  /** CanvasItem.make_input_local */
  final def makeInputLocal(event: InputEvent): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("CanvasItem", "make_input_local", 811130057L), hostObject.objectPtr, event.hostObject)

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

  /** CanvasItem.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_texture_filter", 1037999706L), hostObject.objectPtr, mode)

  /** CanvasItem.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_texture_filter", 121960042L), hostObject.objectPtr)

  /** CanvasItem.set_texture_repeat */
  final def setTextureRepeat(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_texture_repeat", 1716472974L), hostObject.objectPtr, mode)

  /** CanvasItem.get_texture_repeat */
  final def getTextureRepeat(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_texture_repeat", 2667158319L), hostObject.objectPtr)

  /** CanvasItem.set_clip_children_mode */
  final def setClipChildrenMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_clip_children_mode", 1319393776L), hostObject.objectPtr, mode)

  /** CanvasItem.get_clip_children_mode */
  final def getClipChildrenMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_clip_children_mode", 3581808349L), hostObject.objectPtr)

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
