package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Viewport`, extends `Node`. */
abstract class Viewport extends Node {
  override def godotClassName: String = "Viewport"

  /** Viewport.set_world_2d */
  final def setWorld2d(world_2d: World2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_world_2d", 2736080068L), hostObject.objectPtr, world_2d.hostObject)

  /** Viewport.get_world_2d */
  final def getWorld2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_world_2d", 2339128592L), hostObject.objectPtr)

  /** Viewport.find_world_2d */
  final def findWorld2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "find_world_2d", 2339128592L), hostObject.objectPtr)

  /** Viewport.set_canvas_transform */
  final def setCanvasTransform(xform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_canvas_transform", 2761652528L), hostObject.objectPtr, xform)

  /** Viewport.get_canvas_transform */
  final def getCanvasTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Viewport", "get_canvas_transform", 3814499831L), hostObject.objectPtr)

  /** Viewport.set_global_canvas_transform */
  final def setGlobalCanvasTransform(xform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_global_canvas_transform", 2761652528L), hostObject.objectPtr, xform)

  /** Viewport.get_global_canvas_transform */
  final def getGlobalCanvasTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Viewport", "get_global_canvas_transform", 3814499831L), hostObject.objectPtr)

  /** Viewport.get_stretch_transform */
  final def getStretchTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Viewport", "get_stretch_transform", 3814499831L), hostObject.objectPtr)

  /** Viewport.get_final_transform */
  final def getFinalTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Viewport", "get_final_transform", 3814499831L), hostObject.objectPtr)

  /** Viewport.get_screen_transform */
  final def getScreenTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("Viewport", "get_screen_transform", 3814499831L), hostObject.objectPtr)

  /** Viewport.get_visible_rect */
  final def getVisibleRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("Viewport", "get_visible_rect", 1639390495L), hostObject.objectPtr)

  /** Viewport.set_transparent_background */
  final def setTransparentBackground(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_transparent_background", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.has_transparent_background */
  final def hasTransparentBackground(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "has_transparent_background", 36873697L), hostObject.objectPtr)

  /** Viewport.set_use_hdr_2d */
  final def setUseHdr2d(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_hdr_2d", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_hdr_2d */
  final def isUsingHdr2d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_hdr_2d", 36873697L), hostObject.objectPtr)

  /** Viewport.set_msaa_2d */
  final def setMsaa2d(msaa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_msaa_2d", 3330258708L), hostObject.objectPtr, msaa)

  /** Viewport.get_msaa_2d */
  final def getMsaa2d(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_msaa_2d", 2542055527L), hostObject.objectPtr)

  /** Viewport.set_msaa_3d */
  final def setMsaa3d(msaa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_msaa_3d", 3330258708L), hostObject.objectPtr, msaa)

  /** Viewport.get_msaa_3d */
  final def getMsaa3d(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_msaa_3d", 2542055527L), hostObject.objectPtr)

  /** Viewport.set_screen_space_aa */
  final def setScreenSpaceAa(screen_space_aa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_screen_space_aa", 3544169389L), hostObject.objectPtr, screen_space_aa)

  /** Viewport.get_screen_space_aa */
  final def getScreenSpaceAa(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_screen_space_aa", 1390814124L), hostObject.objectPtr)

  /** Viewport.set_use_taa */
  final def setUseTaa(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_taa", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_taa */
  final def isUsingTaa(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_taa", 36873697L), hostObject.objectPtr)

  /** Viewport.set_use_debanding */
  final def setUseDebanding(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_debanding", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_debanding */
  final def isUsingDebanding(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_debanding", 36873697L), hostObject.objectPtr)

  /** Viewport.set_use_occlusion_culling */
  final def setUseOcclusionCulling(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_occlusion_culling", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_occlusion_culling */
  final def isUsingOcclusionCulling(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_occlusion_culling", 36873697L), hostObject.objectPtr)

  /** Viewport.set_debug_draw */
  final def setDebugDraw(debug_draw: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_debug_draw", 1970246205L), hostObject.objectPtr, debug_draw)

  /** Viewport.get_debug_draw */
  final def getDebugDraw(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_debug_draw", 579191299L), hostObject.objectPtr)

  /** Viewport.set_use_oversampling */
  final def setUseOversampling(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_oversampling", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_oversampling */
  final def isUsingOversampling(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_oversampling", 36873697L), hostObject.objectPtr)

  /** Viewport.set_oversampling_override */
  final def setOversamplingOverride(oversampling: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_oversampling_override", 373806689L), hostObject.objectPtr, oversampling)

  /** Viewport.get_oversampling_override */
  final def getOversamplingOverride(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_oversampling_override", 1740695150L), hostObject.objectPtr)

  /** Viewport.get_oversampling */
  final def getOversampling(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_oversampling", 1740695150L), hostObject.objectPtr)

  /** Viewport.get_render_info */
  final def getRenderInfo(`type`: Long, info: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("Viewport", "get_render_info", 481977019L), hostObject.objectPtr, `type`, info)

  /** Viewport.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_texture", 1746695840L), hostObject.objectPtr)

  /** Viewport.set_physics_object_picking */
  final def setPhysicsObjectPicking(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_physics_object_picking", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.get_physics_object_picking */
  final def getPhysicsObjectPicking(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "get_physics_object_picking", 2240911060L), hostObject.objectPtr)

  /** Viewport.set_physics_object_picking_sort */
  final def setPhysicsObjectPickingSort(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_physics_object_picking_sort", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.get_physics_object_picking_sort */
  final def getPhysicsObjectPickingSort(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "get_physics_object_picking_sort", 2240911060L), hostObject.objectPtr)

  /** Viewport.set_physics_object_picking_first_only */
  final def setPhysicsObjectPickingFirstOnly(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_physics_object_picking_first_only", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.get_physics_object_picking_first_only */
  final def getPhysicsObjectPickingFirstOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "get_physics_object_picking_first_only", 2240911060L), hostObject.objectPtr)

  /** Viewport.push_text_input */
  final def pushTextInput(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "push_text_input", 83702148L), hostObject.objectPtr, text)

  /** Viewport.push_input */
  final def pushInput(event: InputEvent, in_local_coords: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Viewport", "push_input", 3644664830L), hostObject.objectPtr, event.hostObject, in_local_coords)

  /** Viewport.push_unhandled_input */
  final def pushUnhandledInput(event: InputEvent, in_local_coords: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Viewport", "push_unhandled_input", 3644664830L), hostObject.objectPtr, event.hostObject, in_local_coords)

  /** Viewport.notify_mouse_entered */
  final def notifyMouseEntered(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "notify_mouse_entered", 3218959716L), hostObject.objectPtr)

  /** Viewport.notify_mouse_exited */
  final def notifyMouseExited(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "notify_mouse_exited", 3218959716L), hostObject.objectPtr)

  /** Viewport.get_mouse_position */
  final def getMousePosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Viewport", "get_mouse_position", 3341600327L), hostObject.objectPtr)

  /** Viewport.warp_mouse */
  final def warpMouse(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "warp_mouse", 743155724L), hostObject.objectPtr, position)

  /** Viewport.update_mouse_cursor_state */
  final def updateMouseCursorState(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "update_mouse_cursor_state", 3218959716L), hostObject.objectPtr)

  /** Viewport.gui_cancel_drag */
  final def guiCancelDrag(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "gui_cancel_drag", 3218959716L), hostObject.objectPtr)

  /** Viewport.gui_get_drag_description */
  final def guiGetDragDescription(): String =
    Ptrcall.call0[String](MethodBind.get("Viewport", "gui_get_drag_description", 201670096L), hostObject.objectPtr)

  /** Viewport.gui_set_drag_description */
  final def guiSetDragDescription(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "gui_set_drag_description", 83702148L), hostObject.objectPtr, description)

  /** Viewport.gui_is_dragging */
  final def guiIsDragging(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "gui_is_dragging", 36873697L), hostObject.objectPtr)

  /** Viewport.gui_is_drag_successful */
  final def guiIsDragSuccessful(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "gui_is_drag_successful", 36873697L), hostObject.objectPtr)

  /** Viewport.gui_release_focus */
  final def guiReleaseFocus(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "gui_release_focus", 3218959716L), hostObject.objectPtr)

  /** Viewport.gui_get_focus_owner */
  final def guiGetFocusOwner(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "gui_get_focus_owner", 2783021301L), hostObject.objectPtr)

  /** Viewport.gui_get_hovered_control */
  final def guiGetHoveredControl(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "gui_get_hovered_control", 2783021301L), hostObject.objectPtr)

  /** Viewport.set_disable_input */
  final def setDisableInput(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_disable_input", 2586408642L), hostObject.objectPtr, disable)

  /** Viewport.is_input_disabled */
  final def isInputDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_input_disabled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_positional_shadow_atlas_size */
  final def setPositionalShadowAtlasSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_positional_shadow_atlas_size", 1286410249L), hostObject.objectPtr, size)

  /** Viewport.get_positional_shadow_atlas_size */
  final def getPositionalShadowAtlasSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_positional_shadow_atlas_size", 3905245786L), hostObject.objectPtr)

  /** Viewport.set_positional_shadow_atlas_16_bits */
  final def setPositionalShadowAtlas16Bits(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_positional_shadow_atlas_16_bits", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.get_positional_shadow_atlas_16_bits */
  final def getPositionalShadowAtlas16Bits(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "get_positional_shadow_atlas_16_bits", 36873697L), hostObject.objectPtr)

  /** Viewport.set_snap_controls_to_pixels */
  final def setSnapControlsToPixels(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_snap_controls_to_pixels", 2586408642L), hostObject.objectPtr, enabled)

  /** Viewport.is_snap_controls_to_pixels_enabled */
  final def isSnapControlsToPixelsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_snap_controls_to_pixels_enabled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_snap_2d_transforms_to_pixel */
  final def setSnap2dTransformsToPixel(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_snap_2d_transforms_to_pixel", 2586408642L), hostObject.objectPtr, enabled)

  /** Viewport.is_snap_2d_transforms_to_pixel_enabled */
  final def isSnap2dTransformsToPixelEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_snap_2d_transforms_to_pixel_enabled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_snap_2d_vertices_to_pixel */
  final def setSnap2dVerticesToPixel(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_snap_2d_vertices_to_pixel", 2586408642L), hostObject.objectPtr, enabled)

  /** Viewport.is_snap_2d_vertices_to_pixel_enabled */
  final def isSnap2dVerticesToPixelEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_snap_2d_vertices_to_pixel_enabled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_positional_shadow_atlas_quadrant_subdiv */
  final def setPositionalShadowAtlasQuadrantSubdiv(quadrant: Long, subdiv: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Viewport", "set_positional_shadow_atlas_quadrant_subdiv", 2596956071L), hostObject.objectPtr, quadrant, subdiv)

  /** Viewport.get_positional_shadow_atlas_quadrant_subdiv */
  final def getPositionalShadowAtlasQuadrantSubdiv(quadrant: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Viewport", "get_positional_shadow_atlas_quadrant_subdiv", 2676778355L), hostObject.objectPtr, quadrant)

  /** Viewport.set_input_as_handled */
  final def setInputAsHandled(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Viewport", "set_input_as_handled", 3218959716L), hostObject.objectPtr)

  /** Viewport.is_input_handled */
  final def isInputHandled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_input_handled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_handle_input_locally */
  final def setHandleInputLocally(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_handle_input_locally", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_handling_input_locally */
  final def isHandlingInputLocally(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_handling_input_locally", 36873697L), hostObject.objectPtr)

  /** Viewport.set_default_canvas_item_texture_filter */
  final def setDefaultCanvasItemTextureFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_default_canvas_item_texture_filter", 2815160100L), hostObject.objectPtr, mode)

  /** Viewport.get_default_canvas_item_texture_filter */
  final def getDefaultCanvasItemTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_default_canvas_item_texture_filter", 896601198L), hostObject.objectPtr)

  /** Viewport.set_embedding_subwindows */
  final def setEmbeddingSubwindows(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_embedding_subwindows", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_embedding_subwindows */
  final def isEmbeddingSubwindows(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_embedding_subwindows", 36873697L), hostObject.objectPtr)

  /** Viewport.set_drag_threshold */
  final def setDragThreshold(threshold: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_drag_threshold", 1286410249L), hostObject.objectPtr, threshold)

  /** Viewport.get_drag_threshold */
  final def getDragThreshold(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_drag_threshold", 3905245786L), hostObject.objectPtr)

  /** Viewport.set_canvas_cull_mask */
  final def setCanvasCullMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_canvas_cull_mask", 1286410249L), hostObject.objectPtr, mask)

  /** Viewport.get_canvas_cull_mask */
  final def getCanvasCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_canvas_cull_mask", 3905245786L), hostObject.objectPtr)

  /** Viewport.set_canvas_cull_mask_bit */
  final def setCanvasCullMaskBit(layer: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Viewport", "set_canvas_cull_mask_bit", 300928843L), hostObject.objectPtr, layer, enable)

  /** Viewport.get_canvas_cull_mask_bit */
  final def getCanvasCullMaskBit(layer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Viewport", "get_canvas_cull_mask_bit", 1116898809L), hostObject.objectPtr, layer)

  /** Viewport.set_default_canvas_item_texture_repeat */
  final def setDefaultCanvasItemTextureRepeat(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_default_canvas_item_texture_repeat", 1658513413L), hostObject.objectPtr, mode)

  /** Viewport.get_default_canvas_item_texture_repeat */
  final def getDefaultCanvasItemTextureRepeat(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_default_canvas_item_texture_repeat", 4049774160L), hostObject.objectPtr)

  /** Viewport.set_sdf_oversize */
  final def setSdfOversize(oversize: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_sdf_oversize", 2574159017L), hostObject.objectPtr, oversize)

  /** Viewport.get_sdf_oversize */
  final def getSdfOversize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_sdf_oversize", 2631427510L), hostObject.objectPtr)

  /** Viewport.set_sdf_scale */
  final def setSdfScale(scale: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_sdf_scale", 1402773951L), hostObject.objectPtr, scale)

  /** Viewport.get_sdf_scale */
  final def getSdfScale(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_sdf_scale", 3162688184L), hostObject.objectPtr)

  /** Viewport.set_mesh_lod_threshold */
  final def setMeshLodThreshold(pixels: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_mesh_lod_threshold", 373806689L), hostObject.objectPtr, pixels)

  /** Viewport.get_mesh_lod_threshold */
  final def getMeshLodThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_mesh_lod_threshold", 1740695150L), hostObject.objectPtr)

  /** Viewport.set_as_audio_listener_2d */
  final def setAsAudioListener2d(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_as_audio_listener_2d", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_audio_listener_2d */
  final def isAudioListener2d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_audio_listener_2d", 36873697L), hostObject.objectPtr)

  /** Viewport.get_audio_listener_2d */
  final def getAudioListener2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_audio_listener_2d", 1840977180L), hostObject.objectPtr)

  /** Viewport.get_camera_2d */
  final def getCamera2d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_camera_2d", 3551466917L), hostObject.objectPtr)

  /** Viewport.set_world_3d */
  final def setWorld3d(world_3d: World3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_world_3d", 1400875337L), hostObject.objectPtr, world_3d.hostObject)

  /** Viewport.get_world_3d */
  final def getWorld3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_world_3d", 317588385L), hostObject.objectPtr)

  /** Viewport.find_world_3d */
  final def findWorld3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "find_world_3d", 317588385L), hostObject.objectPtr)

  /** Viewport.set_use_own_world_3d */
  final def setUseOwnWorld3d(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_own_world_3d", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_using_own_world_3d */
  final def isUsingOwnWorld3d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_own_world_3d", 36873697L), hostObject.objectPtr)

  /** Viewport.get_audio_listener_3d */
  final def getAudioListener3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_audio_listener_3d", 3472246991L), hostObject.objectPtr)

  /** Viewport.get_camera_3d */
  final def getCamera3d(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_camera_3d", 2285090890L), hostObject.objectPtr)

  /** Viewport.set_as_audio_listener_3d */
  final def setAsAudioListener3d(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_as_audio_listener_3d", 2586408642L), hostObject.objectPtr, enable)

  /** Viewport.is_audio_listener_3d */
  final def isAudioListener3d(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_audio_listener_3d", 36873697L), hostObject.objectPtr)

  /** Viewport.set_disable_3d */
  final def setDisable3d(disable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_disable_3d", 2586408642L), hostObject.objectPtr, disable)

  /** Viewport.is_3d_disabled */
  final def is3dDisabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_3d_disabled", 36873697L), hostObject.objectPtr)

  /** Viewport.set_use_xr */
  final def setUseXr(use: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_use_xr", 2586408642L), hostObject.objectPtr, use)

  /** Viewport.is_using_xr */
  final def isUsingXr(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Viewport", "is_using_xr", 2240911060L), hostObject.objectPtr)

  /** Viewport.set_scaling_3d_mode */
  final def setScaling3dMode(scaling_3d_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_scaling_3d_mode", 1531597597L), hostObject.objectPtr, scaling_3d_mode)

  /** Viewport.get_scaling_3d_mode */
  final def getScaling3dMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_scaling_3d_mode", 2597660574L), hostObject.objectPtr)

  /** Viewport.set_scaling_3d_scale */
  final def setScaling3dScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_scaling_3d_scale", 373806689L), hostObject.objectPtr, scale)

  /** Viewport.get_scaling_3d_scale */
  final def getScaling3dScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_scaling_3d_scale", 1740695150L), hostObject.objectPtr)

  /** Viewport.set_fsr_sharpness */
  final def setFsrSharpness(fsr_sharpness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_fsr_sharpness", 373806689L), hostObject.objectPtr, fsr_sharpness)

  /** Viewport.get_fsr_sharpness */
  final def getFsrSharpness(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_fsr_sharpness", 1740695150L), hostObject.objectPtr)

  /** Viewport.set_texture_mipmap_bias */
  final def setTextureMipmapBias(texture_mipmap_bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_texture_mipmap_bias", 373806689L), hostObject.objectPtr, texture_mipmap_bias)

  /** Viewport.get_texture_mipmap_bias */
  final def getTextureMipmapBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Viewport", "get_texture_mipmap_bias", 1740695150L), hostObject.objectPtr)

  /** Viewport.set_anisotropic_filtering_level */
  final def setAnisotropicFilteringLevel(anisotropic_filtering_level: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_anisotropic_filtering_level", 3445583046L), hostObject.objectPtr, anisotropic_filtering_level)

  /** Viewport.get_anisotropic_filtering_level */
  final def getAnisotropicFilteringLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_anisotropic_filtering_level", 3991528932L), hostObject.objectPtr)

  /** Viewport.set_vrs_mode */
  final def setVrsMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_vrs_mode", 2749867817L), hostObject.objectPtr, mode)

  /** Viewport.get_vrs_mode */
  final def getVrsMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_vrs_mode", 349660525L), hostObject.objectPtr)

  /** Viewport.set_vrs_update_mode */
  final def setVrsUpdateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_vrs_update_mode", 3182412319L), hostObject.objectPtr, mode)

  /** Viewport.get_vrs_update_mode */
  final def getVrsUpdateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Viewport", "get_vrs_update_mode", 2255951583L), hostObject.objectPtr)

  /** Viewport.set_vrs_texture */
  final def setVrsTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Viewport", "set_vrs_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Viewport.get_vrs_texture */
  final def getVrsTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Viewport", "get_vrs_texture", 3635182373L), hostObject.objectPtr)

}
