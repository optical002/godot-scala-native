package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Viewport`, extends `Node`. */
abstract class Viewport extends Node {
  override def godotClassName: String = "Viewport"

  /** Viewport.set_world_2d */
  final def setWorld2d(world_2d: World2D): Unit = {
    if (gdext.classes.Viewport.mb_set_world_2d == null) gdext.classes.Viewport.mb_set_world_2d = MethodBind.get("Viewport", "set_world_2d", 2736080068L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_world_2d, livePtr, Wrappers.handle(world_2d))
  }

  /** Viewport.get_world_2d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getWorld2d(): World2D = {
    if (gdext.classes.Viewport.mb_get_world_2d == null) gdext.classes.Viewport.mb_get_world_2d = MethodBind.get("Viewport", "get_world_2d", 2339128592L)
    Wrappers.owned[World2D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_world_2d, livePtr))
  }

  /** Viewport.find_world_2d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findWorld2d(): World2D = {
    if (gdext.classes.Viewport.mb_find_world_2d == null) gdext.classes.Viewport.mb_find_world_2d = MethodBind.get("Viewport", "find_world_2d", 2339128592L)
    Wrappers.owned[World2D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_find_world_2d, livePtr))
  }

  /** Viewport.set_canvas_transform */
  final def setCanvasTransform(xform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.Viewport.mb_set_canvas_transform == null) gdext.classes.Viewport.mb_set_canvas_transform = MethodBind.get("Viewport", "set_canvas_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_canvas_transform, livePtr, xform)
  }

  /** Viewport.get_canvas_transform */
  final def getCanvasTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.Viewport.mb_get_canvas_transform == null) gdext.classes.Viewport.mb_get_canvas_transform = MethodBind.get("Viewport", "get_canvas_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Viewport.mb_get_canvas_transform, livePtr)
  }

  /** Viewport.set_global_canvas_transform */
  final def setGlobalCanvasTransform(xform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.Viewport.mb_set_global_canvas_transform == null) gdext.classes.Viewport.mb_set_global_canvas_transform = MethodBind.get("Viewport", "set_global_canvas_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_global_canvas_transform, livePtr, xform)
  }

  /** Viewport.get_global_canvas_transform */
  final def getGlobalCanvasTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.Viewport.mb_get_global_canvas_transform == null) gdext.classes.Viewport.mb_get_global_canvas_transform = MethodBind.get("Viewport", "get_global_canvas_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Viewport.mb_get_global_canvas_transform, livePtr)
  }

  /** Viewport.get_stretch_transform */
  final def getStretchTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.Viewport.mb_get_stretch_transform == null) gdext.classes.Viewport.mb_get_stretch_transform = MethodBind.get("Viewport", "get_stretch_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Viewport.mb_get_stretch_transform, livePtr)
  }

  /** Viewport.get_final_transform */
  final def getFinalTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.Viewport.mb_get_final_transform == null) gdext.classes.Viewport.mb_get_final_transform = MethodBind.get("Viewport", "get_final_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Viewport.mb_get_final_transform, livePtr)
  }

  /** Viewport.get_screen_transform */
  final def getScreenTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.Viewport.mb_get_screen_transform == null) gdext.classes.Viewport.mb_get_screen_transform = MethodBind.get("Viewport", "get_screen_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.Viewport.mb_get_screen_transform, livePtr)
  }

  /** Viewport.get_visible_rect */
  final def getVisibleRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.Viewport.mb_get_visible_rect == null) gdext.classes.Viewport.mb_get_visible_rect = MethodBind.get("Viewport", "get_visible_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.Viewport.mb_get_visible_rect, livePtr)
  }

  /** Viewport.set_transparent_background */
  final def setTransparentBackground(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_transparent_background == null) gdext.classes.Viewport.mb_set_transparent_background = MethodBind.get("Viewport", "set_transparent_background", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_transparent_background, livePtr, enable)
  }

  /** Viewport.has_transparent_background */
  final def hasTransparentBackground(): Boolean = {
    if (gdext.classes.Viewport.mb_has_transparent_background == null) gdext.classes.Viewport.mb_has_transparent_background = MethodBind.get("Viewport", "has_transparent_background", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_has_transparent_background, livePtr)
  }

  /** Viewport.set_use_hdr_2d */
  final def setUseHdr2d(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_hdr_2d == null) gdext.classes.Viewport.mb_set_use_hdr_2d = MethodBind.get("Viewport", "set_use_hdr_2d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_hdr_2d, livePtr, enable)
  }

  /** Viewport.is_using_hdr_2d */
  final def isUsingHdr2d(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_hdr_2d == null) gdext.classes.Viewport.mb_is_using_hdr_2d = MethodBind.get("Viewport", "is_using_hdr_2d", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_hdr_2d, livePtr)
  }

  /** Viewport.set_msaa_2d */
  final def setMsaa2d(msaa: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_msaa_2d == null) gdext.classes.Viewport.mb_set_msaa_2d = MethodBind.get("Viewport", "set_msaa_2d", 3330258708L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_msaa_2d, livePtr, msaa)
  }

  /** Viewport.get_msaa_2d */
  final def getMsaa2d(): Long = {
    if (gdext.classes.Viewport.mb_get_msaa_2d == null) gdext.classes.Viewport.mb_get_msaa_2d = MethodBind.get("Viewport", "get_msaa_2d", 2542055527L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_msaa_2d, livePtr)
  }

  /** Viewport.set_msaa_3d */
  final def setMsaa3d(msaa: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_msaa_3d == null) gdext.classes.Viewport.mb_set_msaa_3d = MethodBind.get("Viewport", "set_msaa_3d", 3330258708L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_msaa_3d, livePtr, msaa)
  }

  /** Viewport.get_msaa_3d */
  final def getMsaa3d(): Long = {
    if (gdext.classes.Viewport.mb_get_msaa_3d == null) gdext.classes.Viewport.mb_get_msaa_3d = MethodBind.get("Viewport", "get_msaa_3d", 2542055527L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_msaa_3d, livePtr)
  }

  /** Viewport.set_screen_space_aa */
  final def setScreenSpaceAa(screen_space_aa: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_screen_space_aa == null) gdext.classes.Viewport.mb_set_screen_space_aa = MethodBind.get("Viewport", "set_screen_space_aa", 3544169389L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_screen_space_aa, livePtr, screen_space_aa)
  }

  /** Viewport.get_screen_space_aa */
  final def getScreenSpaceAa(): Long = {
    if (gdext.classes.Viewport.mb_get_screen_space_aa == null) gdext.classes.Viewport.mb_get_screen_space_aa = MethodBind.get("Viewport", "get_screen_space_aa", 1390814124L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_screen_space_aa, livePtr)
  }

  /** Viewport.set_use_taa */
  final def setUseTaa(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_taa == null) gdext.classes.Viewport.mb_set_use_taa = MethodBind.get("Viewport", "set_use_taa", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_taa, livePtr, enable)
  }

  /** Viewport.is_using_taa */
  final def isUsingTaa(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_taa == null) gdext.classes.Viewport.mb_is_using_taa = MethodBind.get("Viewport", "is_using_taa", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_taa, livePtr)
  }

  /** Viewport.set_use_debanding */
  final def setUseDebanding(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_debanding == null) gdext.classes.Viewport.mb_set_use_debanding = MethodBind.get("Viewport", "set_use_debanding", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_debanding, livePtr, enable)
  }

  /** Viewport.is_using_debanding */
  final def isUsingDebanding(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_debanding == null) gdext.classes.Viewport.mb_is_using_debanding = MethodBind.get("Viewport", "is_using_debanding", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_debanding, livePtr)
  }

  /** Viewport.set_use_occlusion_culling */
  final def setUseOcclusionCulling(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_occlusion_culling == null) gdext.classes.Viewport.mb_set_use_occlusion_culling = MethodBind.get("Viewport", "set_use_occlusion_culling", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_occlusion_culling, livePtr, enable)
  }

  /** Viewport.is_using_occlusion_culling */
  final def isUsingOcclusionCulling(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_occlusion_culling == null) gdext.classes.Viewport.mb_is_using_occlusion_culling = MethodBind.get("Viewport", "is_using_occlusion_culling", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_occlusion_culling, livePtr)
  }

  /** Viewport.set_debug_draw */
  final def setDebugDraw(debug_draw: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_debug_draw == null) gdext.classes.Viewport.mb_set_debug_draw = MethodBind.get("Viewport", "set_debug_draw", 1970246205L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_debug_draw, livePtr, debug_draw)
  }

  /** Viewport.get_debug_draw */
  final def getDebugDraw(): Long = {
    if (gdext.classes.Viewport.mb_get_debug_draw == null) gdext.classes.Viewport.mb_get_debug_draw = MethodBind.get("Viewport", "get_debug_draw", 579191299L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_debug_draw, livePtr)
  }

  /** Viewport.set_use_oversampling */
  final def setUseOversampling(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_oversampling == null) gdext.classes.Viewport.mb_set_use_oversampling = MethodBind.get("Viewport", "set_use_oversampling", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_oversampling, livePtr, enable)
  }

  /** Viewport.is_using_oversampling */
  final def isUsingOversampling(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_oversampling == null) gdext.classes.Viewport.mb_is_using_oversampling = MethodBind.get("Viewport", "is_using_oversampling", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_oversampling, livePtr)
  }

  /** Viewport.set_oversampling_override */
  final def setOversamplingOverride(oversampling: Double): Unit = {
    if (gdext.classes.Viewport.mb_set_oversampling_override == null) gdext.classes.Viewport.mb_set_oversampling_override = MethodBind.get("Viewport", "set_oversampling_override", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_oversampling_override, livePtr, oversampling)
  }

  /** Viewport.get_oversampling_override */
  final def getOversamplingOverride(): Double = {
    if (gdext.classes.Viewport.mb_get_oversampling_override == null) gdext.classes.Viewport.mb_get_oversampling_override = MethodBind.get("Viewport", "get_oversampling_override", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_oversampling_override, livePtr)
  }

  /** Viewport.get_oversampling */
  final def getOversampling(): Double = {
    if (gdext.classes.Viewport.mb_get_oversampling == null) gdext.classes.Viewport.mb_get_oversampling = MethodBind.get("Viewport", "get_oversampling", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_oversampling, livePtr)
  }

  /** Viewport.get_render_info */
  final def getRenderInfo(`type`: Long, info: Long): Long = {
    if (gdext.classes.Viewport.mb_get_render_info == null) gdext.classes.Viewport.mb_get_render_info = MethodBind.get("Viewport", "get_render_info", 481977019L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.Viewport.mb_get_render_info, livePtr, `type`, info)
  }

  /** Viewport.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): ViewportTexture = {
    if (gdext.classes.Viewport.mb_get_texture == null) gdext.classes.Viewport.mb_get_texture = MethodBind.get("Viewport", "get_texture", 1746695840L)
    Wrappers.owned[ViewportTexture](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_texture, livePtr))
  }

  /** Viewport.set_physics_object_picking */
  final def setPhysicsObjectPicking(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_physics_object_picking == null) gdext.classes.Viewport.mb_set_physics_object_picking = MethodBind.get("Viewport", "set_physics_object_picking", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_physics_object_picking, livePtr, enable)
  }

  /** Viewport.get_physics_object_picking */
  final def getPhysicsObjectPicking(): Boolean = {
    if (gdext.classes.Viewport.mb_get_physics_object_picking == null) gdext.classes.Viewport.mb_get_physics_object_picking = MethodBind.get("Viewport", "get_physics_object_picking", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_get_physics_object_picking, livePtr)
  }

  /** Viewport.set_physics_object_picking_sort */
  final def setPhysicsObjectPickingSort(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_physics_object_picking_sort == null) gdext.classes.Viewport.mb_set_physics_object_picking_sort = MethodBind.get("Viewport", "set_physics_object_picking_sort", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_physics_object_picking_sort, livePtr, enable)
  }

  /** Viewport.get_physics_object_picking_sort */
  final def getPhysicsObjectPickingSort(): Boolean = {
    if (gdext.classes.Viewport.mb_get_physics_object_picking_sort == null) gdext.classes.Viewport.mb_get_physics_object_picking_sort = MethodBind.get("Viewport", "get_physics_object_picking_sort", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_get_physics_object_picking_sort, livePtr)
  }

  /** Viewport.set_physics_object_picking_first_only */
  final def setPhysicsObjectPickingFirstOnly(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_physics_object_picking_first_only == null) gdext.classes.Viewport.mb_set_physics_object_picking_first_only = MethodBind.get("Viewport", "set_physics_object_picking_first_only", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_physics_object_picking_first_only, livePtr, enable)
  }

  /** Viewport.get_physics_object_picking_first_only */
  final def getPhysicsObjectPickingFirstOnly(): Boolean = {
    if (gdext.classes.Viewport.mb_get_physics_object_picking_first_only == null) gdext.classes.Viewport.mb_get_physics_object_picking_first_only = MethodBind.get("Viewport", "get_physics_object_picking_first_only", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_get_physics_object_picking_first_only, livePtr)
  }

  /** Viewport.push_text_input */
  final def pushTextInput(text: String): Unit = {
    if (gdext.classes.Viewport.mb_push_text_input == null) gdext.classes.Viewport.mb_push_text_input = MethodBind.get("Viewport", "push_text_input", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_push_text_input, livePtr, text)
  }

  /** Viewport.push_input */
  final def pushInput(event: InputEvent, in_local_coords: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_push_input == null) gdext.classes.Viewport.mb_push_input = MethodBind.get("Viewport", "push_input", 3644664830L)
    Ptrcall.callVoid2(gdext.classes.Viewport.mb_push_input, livePtr, Wrappers.handle(event), in_local_coords)
  }

  /** Viewport.push_unhandled_input */
  final def pushUnhandledInput(event: InputEvent, in_local_coords: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_push_unhandled_input == null) gdext.classes.Viewport.mb_push_unhandled_input = MethodBind.get("Viewport", "push_unhandled_input", 3644664830L)
    Ptrcall.callVoid2(gdext.classes.Viewport.mb_push_unhandled_input, livePtr, Wrappers.handle(event), in_local_coords)
  }

  /** Viewport.notify_mouse_entered */
  final def notifyMouseEntered(): Unit = {
    if (gdext.classes.Viewport.mb_notify_mouse_entered == null) gdext.classes.Viewport.mb_notify_mouse_entered = MethodBind.get("Viewport", "notify_mouse_entered", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_notify_mouse_entered, livePtr)
  }

  /** Viewport.notify_mouse_exited */
  final def notifyMouseExited(): Unit = {
    if (gdext.classes.Viewport.mb_notify_mouse_exited == null) gdext.classes.Viewport.mb_notify_mouse_exited = MethodBind.get("Viewport", "notify_mouse_exited", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_notify_mouse_exited, livePtr)
  }

  /** Viewport.get_mouse_position */
  final def getMousePosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.Viewport.mb_get_mouse_position == null) gdext.classes.Viewport.mb_get_mouse_position = MethodBind.get("Viewport", "get_mouse_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Viewport.mb_get_mouse_position, livePtr)
  }

  /** Viewport.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Viewport.mb_warp_mouse == null) gdext.classes.Viewport.mb_warp_mouse = MethodBind.get("Viewport", "warp_mouse", 743155724L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_warp_mouse, livePtr, position)
  }

  /** Viewport.update_mouse_cursor_state */
  final def updateMouseCursorState(): Unit = {
    if (gdext.classes.Viewport.mb_update_mouse_cursor_state == null) gdext.classes.Viewport.mb_update_mouse_cursor_state = MethodBind.get("Viewport", "update_mouse_cursor_state", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_update_mouse_cursor_state, livePtr)
  }

  /** Viewport.gui_cancel_drag */
  final def guiCancelDrag(): Unit = {
    if (gdext.classes.Viewport.mb_gui_cancel_drag == null) gdext.classes.Viewport.mb_gui_cancel_drag = MethodBind.get("Viewport", "gui_cancel_drag", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_gui_cancel_drag, livePtr)
  }

  /** Viewport.gui_get_drag_description */
  final def guiGetDragDescription(): String = {
    if (gdext.classes.Viewport.mb_gui_get_drag_description == null) gdext.classes.Viewport.mb_gui_get_drag_description = MethodBind.get("Viewport", "gui_get_drag_description", 201670096L)
    Ptrcall.call0[String](gdext.classes.Viewport.mb_gui_get_drag_description, livePtr)
  }

  /** Viewport.gui_set_drag_description */
  final def guiSetDragDescription(description: String): Unit = {
    if (gdext.classes.Viewport.mb_gui_set_drag_description == null) gdext.classes.Viewport.mb_gui_set_drag_description = MethodBind.get("Viewport", "gui_set_drag_description", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_gui_set_drag_description, livePtr, description)
  }

  /** Viewport.gui_is_dragging */
  final def guiIsDragging(): Boolean = {
    if (gdext.classes.Viewport.mb_gui_is_dragging == null) gdext.classes.Viewport.mb_gui_is_dragging = MethodBind.get("Viewport", "gui_is_dragging", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_gui_is_dragging, livePtr)
  }

  /** Viewport.gui_is_drag_successful */
  final def guiIsDragSuccessful(): Boolean = {
    if (gdext.classes.Viewport.mb_gui_is_drag_successful == null) gdext.classes.Viewport.mb_gui_is_drag_successful = MethodBind.get("Viewport", "gui_is_drag_successful", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_gui_is_drag_successful, livePtr)
  }

  /** Viewport.gui_release_focus */
  final def guiReleaseFocus(): Unit = {
    if (gdext.classes.Viewport.mb_gui_release_focus == null) gdext.classes.Viewport.mb_gui_release_focus = MethodBind.get("Viewport", "gui_release_focus", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_gui_release_focus, livePtr)
  }

  /** Viewport.gui_get_focus_owner */
  final def guiGetFocusOwner(): Control = {
    if (gdext.classes.Viewport.mb_gui_get_focus_owner == null) gdext.classes.Viewport.mb_gui_get_focus_owner = MethodBind.get("Viewport", "gui_get_focus_owner", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.Viewport.mb_gui_get_focus_owner, livePtr))
  }

  /** Viewport.gui_get_hovered_control */
  final def guiGetHoveredControl(): Control = {
    if (gdext.classes.Viewport.mb_gui_get_hovered_control == null) gdext.classes.Viewport.mb_gui_get_hovered_control = MethodBind.get("Viewport", "gui_get_hovered_control", 2783021301L)
    Wrappers.borrowed[Control](Ptrcall.call0[Long](gdext.classes.Viewport.mb_gui_get_hovered_control, livePtr))
  }

  /** Viewport.set_disable_input */
  final def setDisableInput(disable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_disable_input == null) gdext.classes.Viewport.mb_set_disable_input = MethodBind.get("Viewport", "set_disable_input", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_disable_input, livePtr, disable)
  }

  /** Viewport.is_input_disabled */
  final def isInputDisabled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_input_disabled == null) gdext.classes.Viewport.mb_is_input_disabled = MethodBind.get("Viewport", "is_input_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_input_disabled, livePtr)
  }

  /** Viewport.set_positional_shadow_atlas_size */
  final def setPositionalShadowAtlasSize(size: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_positional_shadow_atlas_size == null) gdext.classes.Viewport.mb_set_positional_shadow_atlas_size = MethodBind.get("Viewport", "set_positional_shadow_atlas_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_positional_shadow_atlas_size, livePtr, size)
  }

  /** Viewport.get_positional_shadow_atlas_size */
  final def getPositionalShadowAtlasSize(): Long = {
    if (gdext.classes.Viewport.mb_get_positional_shadow_atlas_size == null) gdext.classes.Viewport.mb_get_positional_shadow_atlas_size = MethodBind.get("Viewport", "get_positional_shadow_atlas_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_positional_shadow_atlas_size, livePtr)
  }

  /** Viewport.set_positional_shadow_atlas_16_bits */
  final def setPositionalShadowAtlas16Bits(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_positional_shadow_atlas_16_bits == null) gdext.classes.Viewport.mb_set_positional_shadow_atlas_16_bits = MethodBind.get("Viewport", "set_positional_shadow_atlas_16_bits", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_positional_shadow_atlas_16_bits, livePtr, enable)
  }

  /** Viewport.get_positional_shadow_atlas_16_bits */
  final def getPositionalShadowAtlas16Bits(): Boolean = {
    if (gdext.classes.Viewport.mb_get_positional_shadow_atlas_16_bits == null) gdext.classes.Viewport.mb_get_positional_shadow_atlas_16_bits = MethodBind.get("Viewport", "get_positional_shadow_atlas_16_bits", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_get_positional_shadow_atlas_16_bits, livePtr)
  }

  /** Viewport.set_snap_controls_to_pixels */
  final def setSnapControlsToPixels(enabled: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_snap_controls_to_pixels == null) gdext.classes.Viewport.mb_set_snap_controls_to_pixels = MethodBind.get("Viewport", "set_snap_controls_to_pixels", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_snap_controls_to_pixels, livePtr, enabled)
  }

  /** Viewport.is_snap_controls_to_pixels_enabled */
  final def isSnapControlsToPixelsEnabled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_snap_controls_to_pixels_enabled == null) gdext.classes.Viewport.mb_is_snap_controls_to_pixels_enabled = MethodBind.get("Viewport", "is_snap_controls_to_pixels_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_snap_controls_to_pixels_enabled, livePtr)
  }

  /** Viewport.set_snap_2d_transforms_to_pixel */
  final def setSnap2dTransformsToPixel(enabled: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_snap_2d_transforms_to_pixel == null) gdext.classes.Viewport.mb_set_snap_2d_transforms_to_pixel = MethodBind.get("Viewport", "set_snap_2d_transforms_to_pixel", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_snap_2d_transforms_to_pixel, livePtr, enabled)
  }

  /** Viewport.is_snap_2d_transforms_to_pixel_enabled */
  final def isSnap2dTransformsToPixelEnabled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_snap_2d_transforms_to_pixel_enabled == null) gdext.classes.Viewport.mb_is_snap_2d_transforms_to_pixel_enabled = MethodBind.get("Viewport", "is_snap_2d_transforms_to_pixel_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_snap_2d_transforms_to_pixel_enabled, livePtr)
  }

  /** Viewport.set_snap_2d_vertices_to_pixel */
  final def setSnap2dVerticesToPixel(enabled: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_snap_2d_vertices_to_pixel == null) gdext.classes.Viewport.mb_set_snap_2d_vertices_to_pixel = MethodBind.get("Viewport", "set_snap_2d_vertices_to_pixel", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_snap_2d_vertices_to_pixel, livePtr, enabled)
  }

  /** Viewport.is_snap_2d_vertices_to_pixel_enabled */
  final def isSnap2dVerticesToPixelEnabled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_snap_2d_vertices_to_pixel_enabled == null) gdext.classes.Viewport.mb_is_snap_2d_vertices_to_pixel_enabled = MethodBind.get("Viewport", "is_snap_2d_vertices_to_pixel_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_snap_2d_vertices_to_pixel_enabled, livePtr)
  }

  /** Viewport.set_positional_shadow_atlas_quadrant_subdiv */
  final def setPositionalShadowAtlasQuadrantSubdiv(quadrant: Long, subdiv: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_positional_shadow_atlas_quadrant_subdiv == null) gdext.classes.Viewport.mb_set_positional_shadow_atlas_quadrant_subdiv = MethodBind.get("Viewport", "set_positional_shadow_atlas_quadrant_subdiv", 2596956071L)
    Ptrcall.callVoid2(gdext.classes.Viewport.mb_set_positional_shadow_atlas_quadrant_subdiv, livePtr, quadrant, subdiv)
  }

  /** Viewport.get_positional_shadow_atlas_quadrant_subdiv */
  final def getPositionalShadowAtlasQuadrantSubdiv(quadrant: Long): Long = {
    if (gdext.classes.Viewport.mb_get_positional_shadow_atlas_quadrant_subdiv == null) gdext.classes.Viewport.mb_get_positional_shadow_atlas_quadrant_subdiv = MethodBind.get("Viewport", "get_positional_shadow_atlas_quadrant_subdiv", 2676778355L)
    Ptrcall.call1[Long, Long](gdext.classes.Viewport.mb_get_positional_shadow_atlas_quadrant_subdiv, livePtr, quadrant)
  }

  /** Viewport.set_input_as_handled */
  final def setInputAsHandled(): Unit = {
    if (gdext.classes.Viewport.mb_set_input_as_handled == null) gdext.classes.Viewport.mb_set_input_as_handled = MethodBind.get("Viewport", "set_input_as_handled", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Viewport.mb_set_input_as_handled, livePtr)
  }

  /** Viewport.is_input_handled */
  final def isInputHandled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_input_handled == null) gdext.classes.Viewport.mb_is_input_handled = MethodBind.get("Viewport", "is_input_handled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_input_handled, livePtr)
  }

  /** Viewport.set_handle_input_locally */
  final def setHandleInputLocally(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_handle_input_locally == null) gdext.classes.Viewport.mb_set_handle_input_locally = MethodBind.get("Viewport", "set_handle_input_locally", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_handle_input_locally, livePtr, enable)
  }

  /** Viewport.is_handling_input_locally */
  final def isHandlingInputLocally(): Boolean = {
    if (gdext.classes.Viewport.mb_is_handling_input_locally == null) gdext.classes.Viewport.mb_is_handling_input_locally = MethodBind.get("Viewport", "is_handling_input_locally", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_handling_input_locally, livePtr)
  }

  /** Viewport.set_default_canvas_item_texture_filter */
  final def setDefaultCanvasItemTextureFilter(mode: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_default_canvas_item_texture_filter == null) gdext.classes.Viewport.mb_set_default_canvas_item_texture_filter = MethodBind.get("Viewport", "set_default_canvas_item_texture_filter", 2815160100L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_default_canvas_item_texture_filter, livePtr, mode)
  }

  /** Viewport.get_default_canvas_item_texture_filter */
  final def getDefaultCanvasItemTextureFilter(): Long = {
    if (gdext.classes.Viewport.mb_get_default_canvas_item_texture_filter == null) gdext.classes.Viewport.mb_get_default_canvas_item_texture_filter = MethodBind.get("Viewport", "get_default_canvas_item_texture_filter", 896601198L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_default_canvas_item_texture_filter, livePtr)
  }

  /** Viewport.set_embedding_subwindows */
  final def setEmbeddingSubwindows(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_embedding_subwindows == null) gdext.classes.Viewport.mb_set_embedding_subwindows = MethodBind.get("Viewport", "set_embedding_subwindows", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_embedding_subwindows, livePtr, enable)
  }

  /** Viewport.is_embedding_subwindows */
  final def isEmbeddingSubwindows(): Boolean = {
    if (gdext.classes.Viewport.mb_is_embedding_subwindows == null) gdext.classes.Viewport.mb_is_embedding_subwindows = MethodBind.get("Viewport", "is_embedding_subwindows", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_embedding_subwindows, livePtr)
  }

  /** Viewport.set_drag_threshold */
  final def setDragThreshold(threshold: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_drag_threshold == null) gdext.classes.Viewport.mb_set_drag_threshold = MethodBind.get("Viewport", "set_drag_threshold", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_drag_threshold, livePtr, threshold)
  }

  /** Viewport.get_drag_threshold */
  final def getDragThreshold(): Long = {
    if (gdext.classes.Viewport.mb_get_drag_threshold == null) gdext.classes.Viewport.mb_get_drag_threshold = MethodBind.get("Viewport", "get_drag_threshold", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_drag_threshold, livePtr)
  }

  /** Viewport.set_canvas_cull_mask */
  final def setCanvasCullMask(mask: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_canvas_cull_mask == null) gdext.classes.Viewport.mb_set_canvas_cull_mask = MethodBind.get("Viewport", "set_canvas_cull_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_canvas_cull_mask, livePtr, mask)
  }

  /** Viewport.get_canvas_cull_mask */
  final def getCanvasCullMask(): Long = {
    if (gdext.classes.Viewport.mb_get_canvas_cull_mask == null) gdext.classes.Viewport.mb_get_canvas_cull_mask = MethodBind.get("Viewport", "get_canvas_cull_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_canvas_cull_mask, livePtr)
  }

  /** Viewport.set_canvas_cull_mask_bit */
  final def setCanvasCullMaskBit(layer: Long, enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_canvas_cull_mask_bit == null) gdext.classes.Viewport.mb_set_canvas_cull_mask_bit = MethodBind.get("Viewport", "set_canvas_cull_mask_bit", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Viewport.mb_set_canvas_cull_mask_bit, livePtr, layer, enable)
  }

  /** Viewport.get_canvas_cull_mask_bit */
  final def getCanvasCullMaskBit(layer: Long): Boolean = {
    if (gdext.classes.Viewport.mb_get_canvas_cull_mask_bit == null) gdext.classes.Viewport.mb_get_canvas_cull_mask_bit = MethodBind.get("Viewport", "get_canvas_cull_mask_bit", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Viewport.mb_get_canvas_cull_mask_bit, livePtr, layer)
  }

  /** Viewport.set_default_canvas_item_texture_repeat */
  final def setDefaultCanvasItemTextureRepeat(mode: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_default_canvas_item_texture_repeat == null) gdext.classes.Viewport.mb_set_default_canvas_item_texture_repeat = MethodBind.get("Viewport", "set_default_canvas_item_texture_repeat", 1658513413L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_default_canvas_item_texture_repeat, livePtr, mode)
  }

  /** Viewport.get_default_canvas_item_texture_repeat */
  final def getDefaultCanvasItemTextureRepeat(): Long = {
    if (gdext.classes.Viewport.mb_get_default_canvas_item_texture_repeat == null) gdext.classes.Viewport.mb_get_default_canvas_item_texture_repeat = MethodBind.get("Viewport", "get_default_canvas_item_texture_repeat", 4049774160L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_default_canvas_item_texture_repeat, livePtr)
  }

  /** Viewport.set_sdf_oversize */
  final def setSdfOversize(oversize: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_sdf_oversize == null) gdext.classes.Viewport.mb_set_sdf_oversize = MethodBind.get("Viewport", "set_sdf_oversize", 2574159017L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_sdf_oversize, livePtr, oversize)
  }

  /** Viewport.get_sdf_oversize */
  final def getSdfOversize(): Long = {
    if (gdext.classes.Viewport.mb_get_sdf_oversize == null) gdext.classes.Viewport.mb_get_sdf_oversize = MethodBind.get("Viewport", "get_sdf_oversize", 2631427510L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_sdf_oversize, livePtr)
  }

  /** Viewport.set_sdf_scale */
  final def setSdfScale(scale: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_sdf_scale == null) gdext.classes.Viewport.mb_set_sdf_scale = MethodBind.get("Viewport", "set_sdf_scale", 1402773951L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_sdf_scale, livePtr, scale)
  }

  /** Viewport.get_sdf_scale */
  final def getSdfScale(): Long = {
    if (gdext.classes.Viewport.mb_get_sdf_scale == null) gdext.classes.Viewport.mb_get_sdf_scale = MethodBind.get("Viewport", "get_sdf_scale", 3162688184L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_sdf_scale, livePtr)
  }

  /** Viewport.set_mesh_lod_threshold */
  final def setMeshLodThreshold(pixels: Double): Unit = {
    if (gdext.classes.Viewport.mb_set_mesh_lod_threshold == null) gdext.classes.Viewport.mb_set_mesh_lod_threshold = MethodBind.get("Viewport", "set_mesh_lod_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_mesh_lod_threshold, livePtr, pixels)
  }

  /** Viewport.get_mesh_lod_threshold */
  final def getMeshLodThreshold(): Double = {
    if (gdext.classes.Viewport.mb_get_mesh_lod_threshold == null) gdext.classes.Viewport.mb_get_mesh_lod_threshold = MethodBind.get("Viewport", "get_mesh_lod_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_mesh_lod_threshold, livePtr)
  }

  /** Viewport.set_as_audio_listener_2d */
  final def setAsAudioListener2d(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_as_audio_listener_2d == null) gdext.classes.Viewport.mb_set_as_audio_listener_2d = MethodBind.get("Viewport", "set_as_audio_listener_2d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_as_audio_listener_2d, livePtr, enable)
  }

  /** Viewport.is_audio_listener_2d */
  final def isAudioListener2d(): Boolean = {
    if (gdext.classes.Viewport.mb_is_audio_listener_2d == null) gdext.classes.Viewport.mb_is_audio_listener_2d = MethodBind.get("Viewport", "is_audio_listener_2d", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_audio_listener_2d, livePtr)
  }

  /** Viewport.get_audio_listener_2d */
  final def getAudioListener2d(): AudioListener2D = {
    if (gdext.classes.Viewport.mb_get_audio_listener_2d == null) gdext.classes.Viewport.mb_get_audio_listener_2d = MethodBind.get("Viewport", "get_audio_listener_2d", 1840977180L)
    Wrappers.borrowed[AudioListener2D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_audio_listener_2d, livePtr))
  }

  /** Viewport.get_camera_2d */
  final def getCamera2d(): Camera2D = {
    if (gdext.classes.Viewport.mb_get_camera_2d == null) gdext.classes.Viewport.mb_get_camera_2d = MethodBind.get("Viewport", "get_camera_2d", 3551466917L)
    Wrappers.borrowed[Camera2D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_camera_2d, livePtr))
  }

  /** Viewport.set_world_3d */
  final def setWorld3d(world_3d: World3D): Unit = {
    if (gdext.classes.Viewport.mb_set_world_3d == null) gdext.classes.Viewport.mb_set_world_3d = MethodBind.get("Viewport", "set_world_3d", 1400875337L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_world_3d, livePtr, Wrappers.handle(world_3d))
  }

  /** Viewport.get_world_3d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getWorld3d(): World3D = {
    if (gdext.classes.Viewport.mb_get_world_3d == null) gdext.classes.Viewport.mb_get_world_3d = MethodBind.get("Viewport", "get_world_3d", 317588385L)
    Wrappers.owned[World3D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_world_3d, livePtr))
  }

  /** Viewport.find_world_3d. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findWorld3d(): World3D = {
    if (gdext.classes.Viewport.mb_find_world_3d == null) gdext.classes.Viewport.mb_find_world_3d = MethodBind.get("Viewport", "find_world_3d", 317588385L)
    Wrappers.owned[World3D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_find_world_3d, livePtr))
  }

  /** Viewport.set_use_own_world_3d */
  final def setUseOwnWorld3d(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_own_world_3d == null) gdext.classes.Viewport.mb_set_use_own_world_3d = MethodBind.get("Viewport", "set_use_own_world_3d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_own_world_3d, livePtr, enable)
  }

  /** Viewport.is_using_own_world_3d */
  final def isUsingOwnWorld3d(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_own_world_3d == null) gdext.classes.Viewport.mb_is_using_own_world_3d = MethodBind.get("Viewport", "is_using_own_world_3d", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_own_world_3d, livePtr)
  }

  /** Viewport.get_audio_listener_3d */
  final def getAudioListener3d(): AudioListener3D = {
    if (gdext.classes.Viewport.mb_get_audio_listener_3d == null) gdext.classes.Viewport.mb_get_audio_listener_3d = MethodBind.get("Viewport", "get_audio_listener_3d", 3472246991L)
    Wrappers.borrowed[AudioListener3D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_audio_listener_3d, livePtr))
  }

  /** Viewport.get_camera_3d */
  final def getCamera3d(): Camera3D = {
    if (gdext.classes.Viewport.mb_get_camera_3d == null) gdext.classes.Viewport.mb_get_camera_3d = MethodBind.get("Viewport", "get_camera_3d", 2285090890L)
    Wrappers.borrowed[Camera3D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_camera_3d, livePtr))
  }

  /** Viewport.set_as_audio_listener_3d */
  final def setAsAudioListener3d(enable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_as_audio_listener_3d == null) gdext.classes.Viewport.mb_set_as_audio_listener_3d = MethodBind.get("Viewport", "set_as_audio_listener_3d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_as_audio_listener_3d, livePtr, enable)
  }

  /** Viewport.is_audio_listener_3d */
  final def isAudioListener3d(): Boolean = {
    if (gdext.classes.Viewport.mb_is_audio_listener_3d == null) gdext.classes.Viewport.mb_is_audio_listener_3d = MethodBind.get("Viewport", "is_audio_listener_3d", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_audio_listener_3d, livePtr)
  }

  /** Viewport.set_disable_3d */
  final def setDisable3d(disable: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_disable_3d == null) gdext.classes.Viewport.mb_set_disable_3d = MethodBind.get("Viewport", "set_disable_3d", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_disable_3d, livePtr, disable)
  }

  /** Viewport.is_3d_disabled */
  final def is3dDisabled(): Boolean = {
    if (gdext.classes.Viewport.mb_is_3d_disabled == null) gdext.classes.Viewport.mb_is_3d_disabled = MethodBind.get("Viewport", "is_3d_disabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_3d_disabled, livePtr)
  }

  /** Viewport.set_use_xr */
  final def setUseXr(use: Boolean): Unit = {
    if (gdext.classes.Viewport.mb_set_use_xr == null) gdext.classes.Viewport.mb_set_use_xr = MethodBind.get("Viewport", "set_use_xr", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_use_xr, livePtr, use)
  }

  /** Viewport.is_using_xr */
  final def isUsingXr(): Boolean = {
    if (gdext.classes.Viewport.mb_is_using_xr == null) gdext.classes.Viewport.mb_is_using_xr = MethodBind.get("Viewport", "is_using_xr", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Viewport.mb_is_using_xr, livePtr)
  }

  /** Viewport.set_scaling_3d_mode */
  final def setScaling3dMode(scaling_3d_mode: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_scaling_3d_mode == null) gdext.classes.Viewport.mb_set_scaling_3d_mode = MethodBind.get("Viewport", "set_scaling_3d_mode", 1531597597L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_scaling_3d_mode, livePtr, scaling_3d_mode)
  }

  /** Viewport.get_scaling_3d_mode */
  final def getScaling3dMode(): Long = {
    if (gdext.classes.Viewport.mb_get_scaling_3d_mode == null) gdext.classes.Viewport.mb_get_scaling_3d_mode = MethodBind.get("Viewport", "get_scaling_3d_mode", 2597660574L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_scaling_3d_mode, livePtr)
  }

  /** Viewport.set_scaling_3d_scale */
  final def setScaling3dScale(scale: Double): Unit = {
    if (gdext.classes.Viewport.mb_set_scaling_3d_scale == null) gdext.classes.Viewport.mb_set_scaling_3d_scale = MethodBind.get("Viewport", "set_scaling_3d_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_scaling_3d_scale, livePtr, scale)
  }

  /** Viewport.get_scaling_3d_scale */
  final def getScaling3dScale(): Double = {
    if (gdext.classes.Viewport.mb_get_scaling_3d_scale == null) gdext.classes.Viewport.mb_get_scaling_3d_scale = MethodBind.get("Viewport", "get_scaling_3d_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_scaling_3d_scale, livePtr)
  }

  /** Viewport.set_fsr_sharpness */
  final def setFsrSharpness(fsr_sharpness: Double): Unit = {
    if (gdext.classes.Viewport.mb_set_fsr_sharpness == null) gdext.classes.Viewport.mb_set_fsr_sharpness = MethodBind.get("Viewport", "set_fsr_sharpness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_fsr_sharpness, livePtr, fsr_sharpness)
  }

  /** Viewport.get_fsr_sharpness */
  final def getFsrSharpness(): Double = {
    if (gdext.classes.Viewport.mb_get_fsr_sharpness == null) gdext.classes.Viewport.mb_get_fsr_sharpness = MethodBind.get("Viewport", "get_fsr_sharpness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_fsr_sharpness, livePtr)
  }

  /** Viewport.set_texture_mipmap_bias */
  final def setTextureMipmapBias(texture_mipmap_bias: Double): Unit = {
    if (gdext.classes.Viewport.mb_set_texture_mipmap_bias == null) gdext.classes.Viewport.mb_set_texture_mipmap_bias = MethodBind.get("Viewport", "set_texture_mipmap_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_texture_mipmap_bias, livePtr, texture_mipmap_bias)
  }

  /** Viewport.get_texture_mipmap_bias */
  final def getTextureMipmapBias(): Double = {
    if (gdext.classes.Viewport.mb_get_texture_mipmap_bias == null) gdext.classes.Viewport.mb_get_texture_mipmap_bias = MethodBind.get("Viewport", "get_texture_mipmap_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Viewport.mb_get_texture_mipmap_bias, livePtr)
  }

  /** Viewport.set_anisotropic_filtering_level */
  final def setAnisotropicFilteringLevel(anisotropic_filtering_level: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_anisotropic_filtering_level == null) gdext.classes.Viewport.mb_set_anisotropic_filtering_level = MethodBind.get("Viewport", "set_anisotropic_filtering_level", 3445583046L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_anisotropic_filtering_level, livePtr, anisotropic_filtering_level)
  }

  /** Viewport.get_anisotropic_filtering_level */
  final def getAnisotropicFilteringLevel(): Long = {
    if (gdext.classes.Viewport.mb_get_anisotropic_filtering_level == null) gdext.classes.Viewport.mb_get_anisotropic_filtering_level = MethodBind.get("Viewport", "get_anisotropic_filtering_level", 3991528932L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_anisotropic_filtering_level, livePtr)
  }

  /** Viewport.set_vrs_mode */
  final def setVrsMode(mode: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_vrs_mode == null) gdext.classes.Viewport.mb_set_vrs_mode = MethodBind.get("Viewport", "set_vrs_mode", 2749867817L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_vrs_mode, livePtr, mode)
  }

  /** Viewport.get_vrs_mode */
  final def getVrsMode(): Long = {
    if (gdext.classes.Viewport.mb_get_vrs_mode == null) gdext.classes.Viewport.mb_get_vrs_mode = MethodBind.get("Viewport", "get_vrs_mode", 349660525L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_vrs_mode, livePtr)
  }

  /** Viewport.set_vrs_update_mode */
  final def setVrsUpdateMode(mode: Long): Unit = {
    if (gdext.classes.Viewport.mb_set_vrs_update_mode == null) gdext.classes.Viewport.mb_set_vrs_update_mode = MethodBind.get("Viewport", "set_vrs_update_mode", 3182412319L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_vrs_update_mode, livePtr, mode)
  }

  /** Viewport.get_vrs_update_mode */
  final def getVrsUpdateMode(): Long = {
    if (gdext.classes.Viewport.mb_get_vrs_update_mode == null) gdext.classes.Viewport.mb_get_vrs_update_mode = MethodBind.get("Viewport", "get_vrs_update_mode", 2255951583L)
    Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_vrs_update_mode, livePtr)
  }

  /** Viewport.set_vrs_texture */
  final def setVrsTexture(texture: Texture2D): Unit = {
    if (gdext.classes.Viewport.mb_set_vrs_texture == null) gdext.classes.Viewport.mb_set_vrs_texture = MethodBind.get("Viewport", "set_vrs_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Viewport.mb_set_vrs_texture, livePtr, Wrappers.handle(texture))
  }

  /** Viewport.get_vrs_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getVrsTexture(): Texture2D = {
    if (gdext.classes.Viewport.mb_get_vrs_texture == null) gdext.classes.Viewport.mb_get_vrs_texture = MethodBind.get("Viewport", "get_vrs_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Viewport.mb_get_vrs_texture, livePtr))
  }

}

object Viewport {
  private[classes] var mb_set_world_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_world_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canvas_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_canvas_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_canvas_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_final_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transparent_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_transparent_background: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_hdr_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_hdr_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msaa_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msaa_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_msaa_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_msaa_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_space_aa: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_space_aa: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_taa: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_taa: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_debanding: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_occlusion_culling: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_occlusion_culling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_debug_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_debug_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_oversampling_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_info: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_object_picking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_object_picking: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_object_picking_sort: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_object_picking_sort: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_object_picking_first_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_object_picking_first_only: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_text_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_push_unhandled_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_mouse_entered: GDExtensionMethodBindPtr = null
  private[classes] var mb_notify_mouse_exited: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mouse_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_warp_mouse: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_mouse_cursor_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_cancel_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_get_drag_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_set_drag_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_is_dragging: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_is_drag_successful: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_release_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_get_focus_owner: GDExtensionMethodBindPtr = null
  private[classes] var mb_gui_get_hovered_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_input: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_positional_shadow_atlas_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_positional_shadow_atlas_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_positional_shadow_atlas_16_bits: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_positional_shadow_atlas_16_bits: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap_controls_to_pixels: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_snap_controls_to_pixels_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap_2d_transforms_to_pixel: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_snap_2d_transforms_to_pixel_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap_2d_vertices_to_pixel: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_snap_2d_vertices_to_pixel_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_positional_shadow_atlas_quadrant_subdiv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_positional_shadow_atlas_quadrant_subdiv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_input_as_handled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_input_handled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_handle_input_locally: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_handling_input_locally: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_canvas_item_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_canvas_item_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_embedding_subwindows: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_embedding_subwindows: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canvas_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_cull_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_canvas_cull_mask_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_canvas_cull_mask_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_canvas_item_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_canvas_item_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdf_oversize: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdf_oversize: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sdf_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sdf_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh_lod_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh_lod_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_audio_listener_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_audio_listener_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_listener_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_own_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_own_world_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_listener_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_audio_listener_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_audio_listener_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_3d: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_3d_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_xr: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_xr: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scaling_3d_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scaling_3d_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scaling_3d_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scaling_3d_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fsr_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fsr_sharpness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_mipmap_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_mipmap_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_anisotropic_filtering_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_anisotropic_filtering_level: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vrs_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vrs_texture: GDExtensionMethodBindPtr = null
}
