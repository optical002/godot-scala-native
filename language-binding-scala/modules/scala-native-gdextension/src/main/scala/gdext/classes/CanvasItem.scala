package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasItem`, extends `Node`. */
abstract class CanvasItem extends Node {
  override def godotClassName: String = "CanvasItem"

  /** CanvasItem.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_visible == null) gdext.classes.CanvasItem.mb_set_visible = MethodBind.get("CanvasItem", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_visible, livePtr, visible)
  }

  /** CanvasItem.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_visible == null) gdext.classes.CanvasItem.mb_is_visible = MethodBind.get("CanvasItem", "is_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_visible, livePtr)
  }

  /** CanvasItem.is_visible_in_tree */
  final def isVisibleInTree(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_visible_in_tree == null) gdext.classes.CanvasItem.mb_is_visible_in_tree = MethodBind.get("CanvasItem", "is_visible_in_tree", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_visible_in_tree, livePtr)
  }

  /** CanvasItem.show */
  final def show(): Unit = {
    if (gdext.classes.CanvasItem.mb_show == null) gdext.classes.CanvasItem.mb_show = MethodBind.get("CanvasItem", "show", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_show, livePtr)
  }

  /** CanvasItem.hide */
  final def hide(): Unit = {
    if (gdext.classes.CanvasItem.mb_hide == null) gdext.classes.CanvasItem.mb_hide = MethodBind.get("CanvasItem", "hide", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_hide, livePtr)
  }

  /** CanvasItem.queue_redraw */
  final def queueRedraw(): Unit = {
    if (gdext.classes.CanvasItem.mb_queue_redraw == null) gdext.classes.CanvasItem.mb_queue_redraw = MethodBind.get("CanvasItem", "queue_redraw", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_queue_redraw, livePtr)
  }

  /** CanvasItem.move_to_front */
  final def moveToFront(): Unit = {
    if (gdext.classes.CanvasItem.mb_move_to_front == null) gdext.classes.CanvasItem.mb_move_to_front = MethodBind.get("CanvasItem", "move_to_front", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_move_to_front, livePtr)
  }

  /** CanvasItem.set_as_top_level */
  final def setAsTopLevel(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_as_top_level == null) gdext.classes.CanvasItem.mb_set_as_top_level = MethodBind.get("CanvasItem", "set_as_top_level", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_as_top_level, livePtr, enable)
  }

  /** CanvasItem.is_set_as_top_level */
  final def isSetAsTopLevel(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_set_as_top_level == null) gdext.classes.CanvasItem.mb_is_set_as_top_level = MethodBind.get("CanvasItem", "is_set_as_top_level", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_set_as_top_level, livePtr)
  }

  /** CanvasItem.set_light_mask */
  final def setLightMask(lightMask: Long): Unit = {
    if (gdext.classes.CanvasItem.mb_set_light_mask == null) gdext.classes.CanvasItem.mb_set_light_mask = MethodBind.get("CanvasItem", "set_light_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_light_mask, livePtr, lightMask)
  }

  /** CanvasItem.get_light_mask */
  final def getLightMask(): Long = {
    if (gdext.classes.CanvasItem.mb_get_light_mask == null) gdext.classes.CanvasItem.mb_get_light_mask = MethodBind.get("CanvasItem", "get_light_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_light_mask, livePtr)
  }

  /** CanvasItem.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.CanvasItem.mb_set_modulate == null) gdext.classes.CanvasItem.mb_set_modulate = MethodBind.get("CanvasItem", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_modulate, livePtr, modulate)
  }

  /** CanvasItem.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.CanvasItem.mb_get_modulate == null) gdext.classes.CanvasItem.mb_get_modulate = MethodBind.get("CanvasItem", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CanvasItem.mb_get_modulate, livePtr)
  }

  /** CanvasItem.set_self_modulate */
  final def setSelfModulate(selfModulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.CanvasItem.mb_set_self_modulate == null) gdext.classes.CanvasItem.mb_set_self_modulate = MethodBind.get("CanvasItem", "set_self_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_self_modulate, livePtr, selfModulate)
  }

  /** CanvasItem.get_self_modulate */
  final def getSelfModulate(): gdext.builtin.Color = {
    if (gdext.classes.CanvasItem.mb_get_self_modulate == null) gdext.classes.CanvasItem.mb_get_self_modulate = MethodBind.get("CanvasItem", "get_self_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CanvasItem.mb_get_self_modulate, livePtr)
  }

  /** CanvasItem.set_z_index */
  final def setZIndex(zIndex: Long): Unit = {
    if (gdext.classes.CanvasItem.mb_set_z_index == null) gdext.classes.CanvasItem.mb_set_z_index = MethodBind.get("CanvasItem", "set_z_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_z_index, livePtr, zIndex)
  }

  /** CanvasItem.get_z_index */
  final def getZIndex(): Long = {
    if (gdext.classes.CanvasItem.mb_get_z_index == null) gdext.classes.CanvasItem.mb_get_z_index = MethodBind.get("CanvasItem", "get_z_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_z_index, livePtr)
  }

  /** CanvasItem.set_z_as_relative */
  final def setZAsRelative(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_z_as_relative == null) gdext.classes.CanvasItem.mb_set_z_as_relative = MethodBind.get("CanvasItem", "set_z_as_relative", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_z_as_relative, livePtr, enable)
  }

  /** CanvasItem.is_z_relative */
  final def isZRelative(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_z_relative == null) gdext.classes.CanvasItem.mb_is_z_relative = MethodBind.get("CanvasItem", "is_z_relative", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_z_relative, livePtr)
  }

  /** CanvasItem.set_y_sort_enabled */
  final def setYSortEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_y_sort_enabled == null) gdext.classes.CanvasItem.mb_set_y_sort_enabled = MethodBind.get("CanvasItem", "set_y_sort_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_y_sort_enabled, livePtr, enabled)
  }

  /** CanvasItem.is_y_sort_enabled */
  final def isYSortEnabled(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_y_sort_enabled == null) gdext.classes.CanvasItem.mb_is_y_sort_enabled = MethodBind.get("CanvasItem", "is_y_sort_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_y_sort_enabled, livePtr)
  }

  /** CanvasItem.set_draw_behind_parent */
  final def setDrawBehindParent(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_draw_behind_parent == null) gdext.classes.CanvasItem.mb_set_draw_behind_parent = MethodBind.get("CanvasItem", "set_draw_behind_parent", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_draw_behind_parent, livePtr, enable)
  }

  /** CanvasItem.is_draw_behind_parent_enabled */
  final def isDrawBehindParentEnabled(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_draw_behind_parent_enabled == null) gdext.classes.CanvasItem.mb_is_draw_behind_parent_enabled = MethodBind.get("CanvasItem", "is_draw_behind_parent_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_draw_behind_parent_enabled, livePtr)
  }

  /** CanvasItem.draw_line */
  final def drawLine(from: gdext.builtin.Vector2, to: gdext.builtin.Vector2, color: gdext.builtin.Color, width: Double = -1.0, antialiased: Boolean = false): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_line == null) gdext.classes.CanvasItem.mb_draw_line = MethodBind.get("CanvasItem", "draw_line", 1562330099L)
    Ptrcall.callVoid5(gdext.classes.CanvasItem.mb_draw_line, livePtr, from, to, color, width, antialiased)
  }

  /** CanvasItem.draw_rect */
  final def drawRect(rect: gdext.builtin.Rect2, color: gdext.builtin.Color, filled: Boolean = true, width: Double = -1.0, antialiased: Boolean = false): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_rect == null) gdext.classes.CanvasItem.mb_draw_rect = MethodBind.get("CanvasItem", "draw_rect", 2773573813L)
    Ptrcall.callVoid5(gdext.classes.CanvasItem.mb_draw_rect, livePtr, rect, color, filled, width, antialiased)
  }

  /** CanvasItem.draw_circle */
  final def drawCircle(position: gdext.builtin.Vector2, radius: Double, color: gdext.builtin.Color, filled: Boolean = true, width: Double = -1.0, antialiased: Boolean = false): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_circle == null) gdext.classes.CanvasItem.mb_draw_circle = MethodBind.get("CanvasItem", "draw_circle", 3153026596L)
    Ptrcall.callVoid6(gdext.classes.CanvasItem.mb_draw_circle, livePtr, position, radius, color, filled, width, antialiased)
  }

  /** CanvasItem.draw_texture */
  final def drawTexture(texture: Texture2D, position: gdext.builtin.Vector2, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f)): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_texture == null) gdext.classes.CanvasItem.mb_draw_texture = MethodBind.get("CanvasItem", "draw_texture", 520200117L)
    Ptrcall.callVoid3(gdext.classes.CanvasItem.mb_draw_texture, livePtr, Wrappers.handle(texture), position, modulate)
  }

  /** CanvasItem.draw_texture_rect */
  final def drawTextureRect(texture: Texture2D, rect: gdext.builtin.Rect2, tile: Boolean, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f), transpose: Boolean = false): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_texture_rect == null) gdext.classes.CanvasItem.mb_draw_texture_rect = MethodBind.get("CanvasItem", "draw_texture_rect", 3832805018L)
    Ptrcall.callVoid5(gdext.classes.CanvasItem.mb_draw_texture_rect, livePtr, Wrappers.handle(texture), rect, tile, modulate, transpose)
  }

  /** CanvasItem.draw_texture_rect_region */
  final def drawTextureRectRegion(texture: Texture2D, rect: gdext.builtin.Rect2, srcRect: gdext.builtin.Rect2, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f), transpose: Boolean = false, clipUv: Boolean = true): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_texture_rect_region == null) gdext.classes.CanvasItem.mb_draw_texture_rect_region = MethodBind.get("CanvasItem", "draw_texture_rect_region", 3883821411L)
    Ptrcall.callVoid6(gdext.classes.CanvasItem.mb_draw_texture_rect_region, livePtr, Wrappers.handle(texture), rect, srcRect, modulate, transpose, clipUv)
  }

  /** CanvasItem.draw_lcd_texture_rect_region */
  final def drawLcdTextureRectRegion(texture: Texture2D, rect: gdext.builtin.Rect2, srcRect: gdext.builtin.Rect2, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f)): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_lcd_texture_rect_region == null) gdext.classes.CanvasItem.mb_draw_lcd_texture_rect_region = MethodBind.get("CanvasItem", "draw_lcd_texture_rect_region", 3212350954L)
    Ptrcall.callVoid4(gdext.classes.CanvasItem.mb_draw_lcd_texture_rect_region, livePtr, Wrappers.handle(texture), rect, srcRect, modulate)
  }

  /** CanvasItem.draw_style_box */
  final def drawStyleBox(styleBox: StyleBox, rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_style_box == null) gdext.classes.CanvasItem.mb_draw_style_box = MethodBind.get("CanvasItem", "draw_style_box", 388176283L)
    Ptrcall.callVoid2(gdext.classes.CanvasItem.mb_draw_style_box, livePtr, Wrappers.handle(styleBox), rect)
  }

  /** CanvasItem.draw_char */
  final def drawChar(font: Font, pos: gdext.builtin.Vector2, char: String, fontSize: Long = 16L, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f), oversampling: Double = 0.0): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_char == null) gdext.classes.CanvasItem.mb_draw_char = MethodBind.get("CanvasItem", "draw_char", 1336210142L)
    Ptrcall.callVoid6(gdext.classes.CanvasItem.mb_draw_char, livePtr, Wrappers.handle(font), pos, char, fontSize, modulate, oversampling)
  }

  /** CanvasItem.draw_mesh */
  final def drawMesh(mesh: Mesh, texture: Texture2D, transform: gdext.builtin.Transform2D, modulate: gdext.builtin.Color = gdext.builtin.Color(1f, 1f, 1f, 1f)): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_mesh == null) gdext.classes.CanvasItem.mb_draw_mesh = MethodBind.get("CanvasItem", "draw_mesh", 153818295L)
    Ptrcall.callVoid4(gdext.classes.CanvasItem.mb_draw_mesh, livePtr, Wrappers.handle(mesh), Wrappers.handle(texture), transform, modulate)
  }

  /** CanvasItem.draw_multimesh */
  final def drawMultimesh(multimesh: MultiMesh, texture: Texture2D): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_multimesh == null) gdext.classes.CanvasItem.mb_draw_multimesh = MethodBind.get("CanvasItem", "draw_multimesh", 937992368L)
    Ptrcall.callVoid2(gdext.classes.CanvasItem.mb_draw_multimesh, livePtr, Wrappers.handle(multimesh), Wrappers.handle(texture))
  }

  /** CanvasItem.draw_set_transform */
  final def drawSetTransform(position: gdext.builtin.Vector2, rotation: Double = 0.0, scale: gdext.builtin.Vector2 = gdext.builtin.Vector2(1f, 1f)): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_set_transform == null) gdext.classes.CanvasItem.mb_draw_set_transform = MethodBind.get("CanvasItem", "draw_set_transform", 288975085L)
    Ptrcall.callVoid3(gdext.classes.CanvasItem.mb_draw_set_transform, livePtr, position, rotation, scale)
  }

  /** CanvasItem.draw_set_transform_matrix */
  final def drawSetTransformMatrix(xform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_set_transform_matrix == null) gdext.classes.CanvasItem.mb_draw_set_transform_matrix = MethodBind.get("CanvasItem", "draw_set_transform_matrix", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_draw_set_transform_matrix, livePtr, xform)
  }

  /** CanvasItem.draw_animation_slice */
  final def drawAnimationSlice(animationLength: Double, sliceBegin: Double, sliceEnd: Double, offset: Double = 0.0): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_animation_slice == null) gdext.classes.CanvasItem.mb_draw_animation_slice = MethodBind.get("CanvasItem", "draw_animation_slice", 3112831842L)
    Ptrcall.callVoid4(gdext.classes.CanvasItem.mb_draw_animation_slice, livePtr, animationLength, sliceBegin, sliceEnd, offset)
  }

  /** CanvasItem.draw_end_animation */
  final def drawEndAnimation(): Unit = {
    if (gdext.classes.CanvasItem.mb_draw_end_animation == null) gdext.classes.CanvasItem.mb_draw_end_animation = MethodBind.get("CanvasItem", "draw_end_animation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_draw_end_animation, livePtr)
  }

  /** CanvasItem.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_transform == null) gdext.classes.CanvasItem.mb_get_transform = MethodBind.get("CanvasItem", "get_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_transform, livePtr)
  }

  /** CanvasItem.get_global_transform */
  final def getGlobalTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_global_transform == null) gdext.classes.CanvasItem.mb_get_global_transform = MethodBind.get("CanvasItem", "get_global_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_global_transform, livePtr)
  }

  /** CanvasItem.get_global_transform_with_canvas */
  final def getGlobalTransformWithCanvas(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_global_transform_with_canvas == null) gdext.classes.CanvasItem.mb_get_global_transform_with_canvas = MethodBind.get("CanvasItem", "get_global_transform_with_canvas", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_global_transform_with_canvas, livePtr)
  }

  /** CanvasItem.get_viewport_transform */
  final def getViewportTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_viewport_transform == null) gdext.classes.CanvasItem.mb_get_viewport_transform = MethodBind.get("CanvasItem", "get_viewport_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_viewport_transform, livePtr)
  }

  /** CanvasItem.get_viewport_rect */
  final def getViewportRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.CanvasItem.mb_get_viewport_rect == null) gdext.classes.CanvasItem.mb_get_viewport_rect = MethodBind.get("CanvasItem", "get_viewport_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.CanvasItem.mb_get_viewport_rect, livePtr)
  }

  /** CanvasItem.get_canvas_transform */
  final def getCanvasTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_canvas_transform == null) gdext.classes.CanvasItem.mb_get_canvas_transform = MethodBind.get("CanvasItem", "get_canvas_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_canvas_transform, livePtr)
  }

  /** CanvasItem.get_screen_transform */
  final def getScreenTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CanvasItem.mb_get_screen_transform == null) gdext.classes.CanvasItem.mb_get_screen_transform = MethodBind.get("CanvasItem", "get_screen_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CanvasItem.mb_get_screen_transform, livePtr)
  }

  /** CanvasItem.get_local_mouse_position */
  final def getLocalMousePosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.CanvasItem.mb_get_local_mouse_position == null) gdext.classes.CanvasItem.mb_get_local_mouse_position = MethodBind.get("CanvasItem", "get_local_mouse_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CanvasItem.mb_get_local_mouse_position, livePtr)
  }

  /** CanvasItem.get_global_mouse_position */
  final def getGlobalMousePosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.CanvasItem.mb_get_global_mouse_position == null) gdext.classes.CanvasItem.mb_get_global_mouse_position = MethodBind.get("CanvasItem", "get_global_mouse_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CanvasItem.mb_get_global_mouse_position, livePtr)
  }

  /** CanvasItem.get_canvas_layer_node */
  final def getCanvasLayerNode(): CanvasLayer = {
    if (gdext.classes.CanvasItem.mb_get_canvas_layer_node == null) gdext.classes.CanvasItem.mb_get_canvas_layer_node = MethodBind.get("CanvasItem", "get_canvas_layer_node", 2602762519L)
    Wrappers.borrowed[CanvasLayer](Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_canvas_layer_node, livePtr))
  }

  /** CanvasItem.get_world_2d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getWorld2d(): World2D = {
    if (gdext.classes.CanvasItem.mb_get_world_2d == null) gdext.classes.CanvasItem.mb_get_world_2d = MethodBind.get("CanvasItem", "get_world_2d", 2339128592L)
    Wrappers.owned[World2D](Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_world_2d, livePtr))
  }

  /** CanvasItem.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CanvasItem.mb_set_material == null) gdext.classes.CanvasItem.mb_set_material = MethodBind.get("CanvasItem", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CanvasItem.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CanvasItem.mb_get_material == null) gdext.classes.CanvasItem.mb_get_material = MethodBind.get("CanvasItem", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_material, livePtr))
  }

  /** CanvasItem.set_use_parent_material */
  final def setUseParentMaterial(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_use_parent_material == null) gdext.classes.CanvasItem.mb_set_use_parent_material = MethodBind.get("CanvasItem", "set_use_parent_material", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_use_parent_material, livePtr, enable)
  }

  /** CanvasItem.get_use_parent_material */
  final def getUseParentMaterial(): Boolean = {
    if (gdext.classes.CanvasItem.mb_get_use_parent_material == null) gdext.classes.CanvasItem.mb_get_use_parent_material = MethodBind.get("CanvasItem", "get_use_parent_material", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_get_use_parent_material, livePtr)
  }

  /** CanvasItem.set_notify_local_transform */
  final def setNotifyLocalTransform(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_notify_local_transform == null) gdext.classes.CanvasItem.mb_set_notify_local_transform = MethodBind.get("CanvasItem", "set_notify_local_transform", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_notify_local_transform, livePtr, enable)
  }

  /** CanvasItem.is_local_transform_notification_enabled */
  final def isLocalTransformNotificationEnabled(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_local_transform_notification_enabled == null) gdext.classes.CanvasItem.mb_is_local_transform_notification_enabled = MethodBind.get("CanvasItem", "is_local_transform_notification_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_local_transform_notification_enabled, livePtr)
  }

  /** CanvasItem.set_notify_transform */
  final def setNotifyTransform(enable: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_notify_transform == null) gdext.classes.CanvasItem.mb_set_notify_transform = MethodBind.get("CanvasItem", "set_notify_transform", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_notify_transform, livePtr, enable)
  }

  /** CanvasItem.is_transform_notification_enabled */
  final def isTransformNotificationEnabled(): Boolean = {
    if (gdext.classes.CanvasItem.mb_is_transform_notification_enabled == null) gdext.classes.CanvasItem.mb_is_transform_notification_enabled = MethodBind.get("CanvasItem", "is_transform_notification_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasItem.mb_is_transform_notification_enabled, livePtr)
  }

  /** CanvasItem.force_update_transform */
  final def forceUpdateTransform(): Unit = {
    if (gdext.classes.CanvasItem.mb_force_update_transform == null) gdext.classes.CanvasItem.mb_force_update_transform = MethodBind.get("CanvasItem", "force_update_transform", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.CanvasItem.mb_force_update_transform, livePtr)
  }

  /** CanvasItem.make_canvas_position_local */
  final def makeCanvasPositionLocal(viewportPoint: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.CanvasItem.mb_make_canvas_position_local == null) gdext.classes.CanvasItem.mb_make_canvas_position_local = MethodBind.get("CanvasItem", "make_canvas_position_local", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.CanvasItem.mb_make_canvas_position_local, livePtr, viewportPoint)
  }

  /** CanvasItem.make_input_local. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def makeInputLocal(event: InputEvent): InputEvent = {
    if (gdext.classes.CanvasItem.mb_make_input_local == null) gdext.classes.CanvasItem.mb_make_input_local = MethodBind.get("CanvasItem", "make_input_local", 811130057L)
    Wrappers.owned[InputEvent](Ptrcall.call1[GodotObject, Long](gdext.classes.CanvasItem.mb_make_input_local, livePtr, Wrappers.handle(event)))
  }

  /** CanvasItem.set_visibility_layer */
  final def setVisibilityLayer(layer: Long): Unit = {
    if (gdext.classes.CanvasItem.mb_set_visibility_layer == null) gdext.classes.CanvasItem.mb_set_visibility_layer = MethodBind.get("CanvasItem", "set_visibility_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_visibility_layer, livePtr, layer)
  }

  /** CanvasItem.get_visibility_layer */
  final def getVisibilityLayer(): Long = {
    if (gdext.classes.CanvasItem.mb_get_visibility_layer == null) gdext.classes.CanvasItem.mb_get_visibility_layer = MethodBind.get("CanvasItem", "get_visibility_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_visibility_layer, livePtr)
  }

  /** CanvasItem.set_visibility_layer_bit */
  final def setVisibilityLayerBit(layer: Long, enabled: Boolean): Unit = {
    if (gdext.classes.CanvasItem.mb_set_visibility_layer_bit == null) gdext.classes.CanvasItem.mb_set_visibility_layer_bit = MethodBind.get("CanvasItem", "set_visibility_layer_bit", 300928843L)
    Ptrcall.callVoid2(gdext.classes.CanvasItem.mb_set_visibility_layer_bit, livePtr, layer, enabled)
  }

  /** CanvasItem.get_visibility_layer_bit */
  final def getVisibilityLayerBit(layer: Long): Boolean = {
    if (gdext.classes.CanvasItem.mb_get_visibility_layer_bit == null) gdext.classes.CanvasItem.mb_get_visibility_layer_bit = MethodBind.get("CanvasItem", "get_visibility_layer_bit", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CanvasItem.mb_get_visibility_layer_bit, livePtr, layer)
  }

  /** CanvasItem.set_texture_filter */
  final def setTextureFilter(mode: gdext.classes.CanvasItem.TextureFilter): Unit = {
    if (gdext.classes.CanvasItem.mb_set_texture_filter == null) gdext.classes.CanvasItem.mb_set_texture_filter = MethodBind.get("CanvasItem", "set_texture_filter", 1037999706L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_texture_filter, livePtr, mode)
  }

  /** CanvasItem.get_texture_filter */
  final def getTextureFilter(): gdext.classes.CanvasItem.TextureFilter = {
    if (gdext.classes.CanvasItem.mb_get_texture_filter == null) gdext.classes.CanvasItem.mb_get_texture_filter = MethodBind.get("CanvasItem", "get_texture_filter", 121960042L)
    gdext.classes.CanvasItem.TextureFilter(Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_texture_filter, livePtr))
  }

  /** CanvasItem.set_texture_repeat */
  final def setTextureRepeat(mode: gdext.classes.CanvasItem.TextureRepeat): Unit = {
    if (gdext.classes.CanvasItem.mb_set_texture_repeat == null) gdext.classes.CanvasItem.mb_set_texture_repeat = MethodBind.get("CanvasItem", "set_texture_repeat", 1716472974L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_texture_repeat, livePtr, mode)
  }

  /** CanvasItem.get_texture_repeat */
  final def getTextureRepeat(): gdext.classes.CanvasItem.TextureRepeat = {
    if (gdext.classes.CanvasItem.mb_get_texture_repeat == null) gdext.classes.CanvasItem.mb_get_texture_repeat = MethodBind.get("CanvasItem", "get_texture_repeat", 2667158319L)
    gdext.classes.CanvasItem.TextureRepeat(Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_texture_repeat, livePtr))
  }

  /** CanvasItem.set_clip_children_mode */
  final def setClipChildrenMode(mode: gdext.classes.CanvasItem.ClipChildrenMode): Unit = {
    if (gdext.classes.CanvasItem.mb_set_clip_children_mode == null) gdext.classes.CanvasItem.mb_set_clip_children_mode = MethodBind.get("CanvasItem", "set_clip_children_mode", 1319393776L)
    Ptrcall.callVoid1(gdext.classes.CanvasItem.mb_set_clip_children_mode, livePtr, mode)
  }

  /** CanvasItem.get_clip_children_mode */
  final def getClipChildrenMode(): gdext.classes.CanvasItem.ClipChildrenMode = {
    if (gdext.classes.CanvasItem.mb_get_clip_children_mode == null) gdext.classes.CanvasItem.mb_get_clip_children_mode = MethodBind.get("CanvasItem", "get_clip_children_mode", 3581808349L)
    gdext.classes.CanvasItem.ClipChildrenMode(Ptrcall.call0[Long](gdext.classes.CanvasItem.mb_get_clip_children_mode, livePtr))
  }

}

object CanvasItem {
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible_in_tree: GDExtensionMethodBindPtr = null
  private[classes] var mb_show: GDExtensionMethodBindPtr = null
  private[classes] var mb_hide: GDExtensionMethodBindPtr = null
  private[classes] var mb_queue_redraw: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_to_front: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_top_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_set_as_top_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_self_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_self_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_z_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_z_as_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_z_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_y_sort_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_y_sort_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_behind_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_draw_behind_parent_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_line: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_circle: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_texture_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_texture_rect_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_lcd_texture_rect_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_style_box: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_char: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_multimesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_set_transform_matrix: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_animation_slice: GDExtensionMethodBindPtr = null
  private[classes] var mb_draw_end_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_transform_with_canvas: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_viewport_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_viewport_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_local_mouse_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_mouse_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_layer_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_parent_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_parent_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_notify_local_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_local_transform_notification_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_notify_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transform_notification_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_update_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_canvas_position_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_input_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_layer_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_layer_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_children_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_children_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `CanvasItem.TextureFilter`. */
  opaque type TextureFilter <: Long = Long

  object TextureFilter {
    final val ParentNode: TextureFilter = 0L.asInstanceOf[TextureFilter]
    final val Nearest: TextureFilter = 1L.asInstanceOf[TextureFilter]
    final val Linear: TextureFilter = 2L.asInstanceOf[TextureFilter]
    final val NearestWithMipmaps: TextureFilter = 3L.asInstanceOf[TextureFilter]
    final val LinearWithMipmaps: TextureFilter = 4L.asInstanceOf[TextureFilter]
    final val NearestWithMipmapsAnisotropic: TextureFilter = 5L.asInstanceOf[TextureFilter]
    final val LinearWithMipmapsAnisotropic: TextureFilter = 6L.asInstanceOf[TextureFilter]
    final val Max: TextureFilter = 7L.asInstanceOf[TextureFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureFilter = value.asInstanceOf[TextureFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[TextureFilter]]

    extension (self: TextureFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ParentNode"
        case 1L => "Nearest"
        case 2L => "Linear"
        case 3L => "NearestWithMipmaps"
        case 4L => "LinearWithMipmaps"
        case 5L => "NearestWithMipmapsAnisotropic"
        case 6L => "LinearWithMipmapsAnisotropic"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `CanvasItem.TextureRepeat`. */
  opaque type TextureRepeat <: Long = Long

  object TextureRepeat {
    final val ParentNode: TextureRepeat = 0L.asInstanceOf[TextureRepeat]
    final val Disabled: TextureRepeat = 1L.asInstanceOf[TextureRepeat]
    final val Enabled: TextureRepeat = 2L.asInstanceOf[TextureRepeat]
    final val Mirror: TextureRepeat = 3L.asInstanceOf[TextureRepeat]
    final val Max: TextureRepeat = 4L.asInstanceOf[TextureRepeat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureRepeat = value.asInstanceOf[TextureRepeat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureRepeat] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TextureRepeat]]

    extension (self: TextureRepeat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ParentNode"
        case 1L => "Disabled"
        case 2L => "Enabled"
        case 3L => "Mirror"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `CanvasItem.ClipChildrenMode`. */
  opaque type ClipChildrenMode <: Long = Long

  object ClipChildrenMode {
    final val Disabled: ClipChildrenMode = 0L.asInstanceOf[ClipChildrenMode]
    final val Only: ClipChildrenMode = 1L.asInstanceOf[ClipChildrenMode]
    final val AndDraw: ClipChildrenMode = 2L.asInstanceOf[ClipChildrenMode]
    final val Max: ClipChildrenMode = 3L.asInstanceOf[ClipChildrenMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ClipChildrenMode = value.asInstanceOf[ClipChildrenMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ClipChildrenMode] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ClipChildrenMode]]

    extension (self: ClipChildrenMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Only"
        case 2L => "AndDraw"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
