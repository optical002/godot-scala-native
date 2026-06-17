package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Sprite2D`, inherits `Node2D`. */
opaque type Sprite2D = GodotObject

object Sprite2D {
  /** Wrap a raw object handle as a `Sprite2D` (no checked cast). */
  def fromObject(o: GodotObject): Sprite2D = o

  /** Class metadata for Gd[Sprite2D] lifetime management and casting. */
  given GodotClass[Sprite2D] with {
    def className = "Sprite2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Sprite2D = o
    def unwrap(t: Sprite2D): GodotObject = t
  }

  extension (self: Sprite2D) {
    /** The underlying object handle. */
    def asObject: GodotObject = self

    /** Sprite2D.set_centered */
    def setCentered(centered: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_centered", 2586408642L), self.asObject.objectPtr, centered)

    /** Sprite2D.is_centered */
    def isCentered(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_centered", 36873697L), self.asObject.objectPtr)

    /** Sprite2D.set_offset */
    def setOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_offset", 743155724L), self.asObject.objectPtr, offset)

    /** Sprite2D.get_offset */
    def getOffset(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Sprite2D", "get_offset", 3341600327L), self.asObject.objectPtr)

    /** Sprite2D.set_flip_h */
    def setFlipH(flip_h: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_flip_h", 2586408642L), self.asObject.objectPtr, flip_h)

    /** Sprite2D.is_flipped_h */
    def isFlippedH(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_flipped_h", 36873697L), self.asObject.objectPtr)

    /** Sprite2D.set_flip_v */
    def setFlipV(flip_v: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_flip_v", 2586408642L), self.asObject.objectPtr, flip_v)

    /** Sprite2D.is_flipped_v */
    def isFlippedV(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_flipped_v", 36873697L), self.asObject.objectPtr)

    /** Sprite2D.set_region_enabled */
    def setRegionEnabled(enabled: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_region_enabled", 2586408642L), self.asObject.objectPtr, enabled)

    /** Sprite2D.is_region_enabled */
    def isRegionEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_region_enabled", 36873697L), self.asObject.objectPtr)

    /** Sprite2D.is_pixel_opaque */
    def isPixelOpaque(pos: io.github.optical002.godot.builtin.Vector2): Boolean =
      Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, Boolean](MethodBind.get("Sprite2D", "is_pixel_opaque", 556197845L), self.asObject.objectPtr, pos)

    /** Sprite2D.set_region_filter_clip_enabled */
    def setRegionFilterClipEnabled(enabled: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_region_filter_clip_enabled", 2586408642L), self.asObject.objectPtr, enabled)

    /** Sprite2D.is_region_filter_clip_enabled */
    def isRegionFilterClipEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Sprite2D", "is_region_filter_clip_enabled", 36873697L), self.asObject.objectPtr)

    /** Sprite2D.set_frame */
    def setFrame(frame: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_frame", 1286410249L), self.asObject.objectPtr, frame)

    /** Sprite2D.get_frame */
    def getFrame(): Long =
      Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_frame", 3905245786L), self.asObject.objectPtr)

    /** Sprite2D.set_vframes */
    def setVframes(vframes: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_vframes", 1286410249L), self.asObject.objectPtr, vframes)

    /** Sprite2D.get_vframes */
    def getVframes(): Long =
      Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_vframes", 3905245786L), self.asObject.objectPtr)

    /** Sprite2D.set_hframes */
    def setHframes(hframes: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Sprite2D", "set_hframes", 1286410249L), self.asObject.objectPtr, hframes)

    /** Sprite2D.get_hframes */
    def getHframes(): Long =
      Ptrcall.call0[Long](MethodBind.get("Sprite2D", "get_hframes", 3905245786L), self.asObject.objectPtr)

    /** Node2D.set_position */
    def setPosition(position: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_position", 743155724L), self.asObject.objectPtr, position)

    /** Node2D.set_rotation */
    def setRotation(radians: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_rotation", 373806689L), self.asObject.objectPtr, radians)

    /** Node2D.set_rotation_degrees */
    def setRotationDegrees(degrees: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_rotation_degrees", 373806689L), self.asObject.objectPtr, degrees)

    /** Node2D.set_skew */
    def setSkew(radians: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_skew", 373806689L), self.asObject.objectPtr, radians)

    /** Node2D.set_scale */
    def setScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_scale", 743155724L), self.asObject.objectPtr, scale)

    /** Node2D.get_position */
    def getPosition(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_position", 3341600327L), self.asObject.objectPtr)

    /** Node2D.get_rotation */
    def getRotation(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_rotation", 1740695150L), self.asObject.objectPtr)

    /** Node2D.get_rotation_degrees */
    def getRotationDegrees(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_rotation_degrees", 1740695150L), self.asObject.objectPtr)

    /** Node2D.get_skew */
    def getSkew(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_skew", 1740695150L), self.asObject.objectPtr)

    /** Node2D.get_scale */
    def getScale(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_scale", 3341600327L), self.asObject.objectPtr)

    /** Node2D.rotate */
    def rotate(radians: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "rotate", 373806689L), self.asObject.objectPtr, radians)

    /** Node2D.move_local_x */
    def moveLocalX(delta: Double, scaled: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node2D", "move_local_x", 2087892650L), self.asObject.objectPtr, delta, scaled)

    /** Node2D.move_local_y */
    def moveLocalY(delta: Double, scaled: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node2D", "move_local_y", 2087892650L), self.asObject.objectPtr, delta, scaled)

    /** Node2D.translate */
    def translate(offset: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "translate", 743155724L), self.asObject.objectPtr, offset)

    /** Node2D.global_translate */
    def globalTranslate(offset: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "global_translate", 743155724L), self.asObject.objectPtr, offset)

    /** Node2D.apply_scale */
    def applyScale(ratio: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "apply_scale", 743155724L), self.asObject.objectPtr, ratio)

    /** Node2D.set_global_position */
    def setGlobalPosition(position: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_position", 743155724L), self.asObject.objectPtr, position)

    /** Node2D.get_global_position */
    def getGlobalPosition(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_global_position", 3341600327L), self.asObject.objectPtr)

    /** Node2D.set_global_rotation */
    def setGlobalRotation(radians: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_rotation", 373806689L), self.asObject.objectPtr, radians)

    /** Node2D.set_global_rotation_degrees */
    def setGlobalRotationDegrees(degrees: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_rotation_degrees", 373806689L), self.asObject.objectPtr, degrees)

    /** Node2D.get_global_rotation */
    def getGlobalRotation(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_rotation", 1740695150L), self.asObject.objectPtr)

    /** Node2D.get_global_rotation_degrees */
    def getGlobalRotationDegrees(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_rotation_degrees", 1740695150L), self.asObject.objectPtr)

    /** Node2D.set_global_skew */
    def setGlobalSkew(radians: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_skew", 373806689L), self.asObject.objectPtr, radians)

    /** Node2D.get_global_skew */
    def getGlobalSkew(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node2D", "get_global_skew", 1740695150L), self.asObject.objectPtr)

    /** Node2D.set_global_scale */
    def setGlobalScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "set_global_scale", 743155724L), self.asObject.objectPtr, scale)

    /** Node2D.get_global_scale */
    def getGlobalScale(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "get_global_scale", 3341600327L), self.asObject.objectPtr)

    /** Node2D.look_at */
    def lookAt(point: io.github.optical002.godot.builtin.Vector2): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node2D", "look_at", 743155724L), self.asObject.objectPtr, point)

    /** Node2D.get_angle_to */
    def getAngleTo(point: io.github.optical002.godot.builtin.Vector2): Double =
      Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, Double](MethodBind.get("Node2D", "get_angle_to", 2276447920L), self.asObject.objectPtr, point)

    /** Node2D.to_local */
    def toLocal(global_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "to_local", 2656412154L), self.asObject.objectPtr, global_point)

    /** Node2D.to_global */
    def toGlobal(local_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Node2D", "to_global", 2656412154L), self.asObject.objectPtr, local_point)

    /** CanvasItem.set_visible */
    def setVisible(visible: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_visible", 2586408642L), self.asObject.objectPtr, visible)

    /** CanvasItem.is_visible */
    def isVisible(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_visible", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.is_visible_in_tree */
    def isVisibleInTree(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_visible_in_tree", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.show */
    def show(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "show", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.hide */
    def hide(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "hide", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.queue_redraw */
    def queueRedraw(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "queue_redraw", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.move_to_front */
    def moveToFront(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "move_to_front", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.set_as_top_level */
    def setAsTopLevel(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_as_top_level", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.is_set_as_top_level */
    def isSetAsTopLevel(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_set_as_top_level", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.set_light_mask */
    def setLightMask(light_mask: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_light_mask", 1286410249L), self.asObject.objectPtr, light_mask)

    /** CanvasItem.get_light_mask */
    def getLightMask(): Long =
      Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_light_mask", 3905245786L), self.asObject.objectPtr)

    /** CanvasItem.set_modulate */
    def setModulate(modulate: io.github.optical002.godot.builtin.Color): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_modulate", 2920490490L), self.asObject.objectPtr, modulate)

    /** CanvasItem.get_modulate */
    def getModulate(): io.github.optical002.godot.builtin.Color =
      Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CanvasItem", "get_modulate", 3444240500L), self.asObject.objectPtr)

    /** CanvasItem.set_self_modulate */
    def setSelfModulate(self_modulate: io.github.optical002.godot.builtin.Color): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_self_modulate", 2920490490L), self.asObject.objectPtr, self_modulate)

    /** CanvasItem.get_self_modulate */
    def getSelfModulate(): io.github.optical002.godot.builtin.Color =
      Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CanvasItem", "get_self_modulate", 3444240500L), self.asObject.objectPtr)

    /** CanvasItem.set_z_index */
    def setZIndex(z_index: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_z_index", 1286410249L), self.asObject.objectPtr, z_index)

    /** CanvasItem.get_z_index */
    def getZIndex(): Long =
      Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_z_index", 3905245786L), self.asObject.objectPtr)

    /** CanvasItem.set_z_as_relative */
    def setZAsRelative(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_z_as_relative", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.is_z_relative */
    def isZRelative(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_z_relative", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.set_y_sort_enabled */
    def setYSortEnabled(enabled: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_y_sort_enabled", 2586408642L), self.asObject.objectPtr, enabled)

    /** CanvasItem.is_y_sort_enabled */
    def isYSortEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_y_sort_enabled", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.set_draw_behind_parent */
    def setDrawBehindParent(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_draw_behind_parent", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.is_draw_behind_parent_enabled */
    def isDrawBehindParentEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_draw_behind_parent_enabled", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.draw_end_animation */
    def drawEndAnimation(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "draw_end_animation", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.get_local_mouse_position */
    def getLocalMousePosition(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "get_local_mouse_position", 3341600327L), self.asObject.objectPtr)

    /** CanvasItem.get_global_mouse_position */
    def getGlobalMousePosition(): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "get_global_mouse_position", 3341600327L), self.asObject.objectPtr)

    /** CanvasItem.set_use_parent_material */
    def setUseParentMaterial(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_use_parent_material", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.get_use_parent_material */
    def getUseParentMaterial(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "get_use_parent_material", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.set_notify_local_transform */
    def setNotifyLocalTransform(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_notify_local_transform", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.is_local_transform_notification_enabled */
    def isLocalTransformNotificationEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_local_transform_notification_enabled", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.set_notify_transform */
    def setNotifyTransform(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_notify_transform", 2586408642L), self.asObject.objectPtr, enable)

    /** CanvasItem.is_transform_notification_enabled */
    def isTransformNotificationEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("CanvasItem", "is_transform_notification_enabled", 36873697L), self.asObject.objectPtr)

    /** CanvasItem.force_update_transform */
    def forceUpdateTransform(): Unit =
      Ptrcall.callVoid0(MethodBind.get("CanvasItem", "force_update_transform", 3218959716L), self.asObject.objectPtr)

    /** CanvasItem.make_canvas_position_local */
    def makeCanvasPositionLocal(viewport_point: io.github.optical002.godot.builtin.Vector2): io.github.optical002.godot.builtin.Vector2 =
      Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2](MethodBind.get("CanvasItem", "make_canvas_position_local", 2656412154L), self.asObject.objectPtr, viewport_point)

    /** CanvasItem.set_visibility_layer */
    def setVisibilityLayer(layer: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("CanvasItem", "set_visibility_layer", 1286410249L), self.asObject.objectPtr, layer)

    /** CanvasItem.get_visibility_layer */
    def getVisibilityLayer(): Long =
      Ptrcall.call0[Long](MethodBind.get("CanvasItem", "get_visibility_layer", 3905245786L), self.asObject.objectPtr)

    /** CanvasItem.set_visibility_layer_bit */
    def setVisibilityLayerBit(layer: Long, enabled: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("CanvasItem", "set_visibility_layer_bit", 300928843L), self.asObject.objectPtr, layer, enabled)

    /** CanvasItem.get_visibility_layer_bit */
    def getVisibilityLayerBit(layer: Long): Boolean =
      Ptrcall.call1[Long, Boolean](MethodBind.get("CanvasItem", "get_visibility_layer_bit", 1116898809L), self.asObject.objectPtr, layer)

    /** Node.add_sibling */
    def addSibling(sibling: Node, force_readable_name: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "add_sibling", 2570952461L), self.asObject.objectPtr, sibling.asObject, force_readable_name)

    /** Node.remove_child */
    def removeChild(node: Node): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "remove_child", 1078189570L), self.asObject.objectPtr, node.asObject)

    /** Node.reparent */
    def reparent(new_parent: Node, keep_global_transform: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "reparent", 3685795103L), self.asObject.objectPtr, new_parent.asObject, keep_global_transform)

    /** Node.get_child_count */
    def getChildCount(include_internal: Boolean): Long =
      Ptrcall.call1[Boolean, Long](MethodBind.get("Node", "get_child_count", 894402480L), self.asObject.objectPtr, include_internal)

    /** Node.get_child */
    def getChild(idx: Long, include_internal: Boolean): Node =
      Node.fromObject(Ptrcall.call2[Long, Boolean, GodotObject](MethodBind.get("Node", "get_child", 541253412L), self.asObject.objectPtr, idx, include_internal))

    /** Node.get_parent */
    def getParent(): Node =
      Node.fromObject(Ptrcall.call0[GodotObject](MethodBind.get("Node", "get_parent", 3160264692L), self.asObject.objectPtr))

    /** Node.find_parent */
    def findParent(pattern: String): Node =
      Node.fromObject(Ptrcall.call1[String, GodotObject](MethodBind.get("Node", "find_parent", 1140089439L), self.asObject.objectPtr, pattern))

    /** Node.is_inside_tree */
    def isInsideTree(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_inside_tree", 36873697L), self.asObject.objectPtr)

    /** Node.is_part_of_edited_scene */
    def isPartOfEditedScene(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_part_of_edited_scene", 36873697L), self.asObject.objectPtr)

    /** Node.is_ancestor_of */
    def isAncestorOf(node: Node): Boolean =
      Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_ancestor_of", 3093956946L), self.asObject.objectPtr, node.asObject)

    /** Node.is_greater_than */
    def isGreaterThan(node: Node): Boolean =
      Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_greater_than", 3093956946L), self.asObject.objectPtr, node.asObject)

    /** Node.move_child */
    def moveChild(child_node: Node, to_index: Long): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "move_child", 3315886247L), self.asObject.objectPtr, child_node.asObject, to_index)

    /** Node.set_owner */
    def setOwner(owner: Node): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_owner", 1078189570L), self.asObject.objectPtr, owner.asObject)

    /** Node.get_owner */
    def getOwner(): Node =
      Node.fromObject(Ptrcall.call0[GodotObject](MethodBind.get("Node", "get_owner", 3160264692L), self.asObject.objectPtr))

    /** Node.get_index */
    def getIndex(include_internal: Boolean): Long =
      Ptrcall.call1[Boolean, Long](MethodBind.get("Node", "get_index", 894402480L), self.asObject.objectPtr, include_internal)

    /** Node.print_tree */
    def printTree(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "print_tree", 3218959716L), self.asObject.objectPtr)

    /** Node.print_tree_pretty */
    def printTreePretty(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "print_tree_pretty", 3218959716L), self.asObject.objectPtr)

    /** Node.get_tree_string */
    def getTreeString(): String =
      Ptrcall.call0[String](MethodBind.get("Node", "get_tree_string", 2841200299L), self.asObject.objectPtr)

    /** Node.get_tree_string_pretty */
    def getTreeStringPretty(): String =
      Ptrcall.call0[String](MethodBind.get("Node", "get_tree_string_pretty", 2841200299L), self.asObject.objectPtr)

    /** Node.set_scene_file_path */
    def setSceneFilePath(scene_file_path: String): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_scene_file_path", 83702148L), self.asObject.objectPtr, scene_file_path)

    /** Node.get_scene_file_path */
    def getSceneFilePath(): String =
      Ptrcall.call0[String](MethodBind.get("Node", "get_scene_file_path", 201670096L), self.asObject.objectPtr)

    /** Node.propagate_notification */
    def propagateNotification(what: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "propagate_notification", 1286410249L), self.asObject.objectPtr, what)

    /** Node.set_physics_process */
    def setPhysicsProcess(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.get_physics_process_delta_time */
    def getPhysicsProcessDeltaTime(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node", "get_physics_process_delta_time", 1740695150L), self.asObject.objectPtr)

    /** Node.is_physics_processing */
    def isPhysicsProcessing(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_processing", 36873697L), self.asObject.objectPtr)

    /** Node.get_process_delta_time */
    def getProcessDeltaTime(): Double =
      Ptrcall.call0[Double](MethodBind.get("Node", "get_process_delta_time", 1740695150L), self.asObject.objectPtr)

    /** Node.set_process */
    def setProcess(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.set_process_priority */
    def setProcessPriority(priority: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_priority", 1286410249L), self.asObject.objectPtr, priority)

    /** Node.get_process_priority */
    def getProcessPriority(): Long =
      Ptrcall.call0[Long](MethodBind.get("Node", "get_process_priority", 3905245786L), self.asObject.objectPtr)

    /** Node.set_physics_process_priority */
    def setPhysicsProcessPriority(priority: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process_priority", 1286410249L), self.asObject.objectPtr, priority)

    /** Node.get_physics_process_priority */
    def getPhysicsProcessPriority(): Long =
      Ptrcall.call0[Long](MethodBind.get("Node", "get_physics_process_priority", 3905245786L), self.asObject.objectPtr)

    /** Node.is_processing */
    def isProcessing(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_input */
    def setProcessInput(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_input", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_processing_input */
    def isProcessingInput(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_input", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_shortcut_input */
    def setProcessShortcutInput(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_shortcut_input", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_processing_shortcut_input */
    def isProcessingShortcutInput(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_shortcut_input", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_unhandled_input */
    def setProcessUnhandledInput(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_unhandled_input", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_processing_unhandled_input */
    def isProcessingUnhandledInput(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_unhandled_input", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_unhandled_key_input */
    def setProcessUnhandledKeyInput(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_unhandled_key_input", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_processing_unhandled_key_input */
    def isProcessingUnhandledKeyInput(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_unhandled_key_input", 36873697L), self.asObject.objectPtr)

    /** Node.can_process */
    def canProcess(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "can_process", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_thread_group_order */
    def setProcessThreadGroupOrder(order: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_thread_group_order", 1286410249L), self.asObject.objectPtr, order)

    /** Node.get_process_thread_group_order */
    def getProcessThreadGroupOrder(): Long =
      Ptrcall.call0[Long](MethodBind.get("Node", "get_process_thread_group_order", 3905245786L), self.asObject.objectPtr)

    /** Node.queue_accessibility_update */
    def queueAccessibilityUpdate(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "queue_accessibility_update", 3218959716L), self.asObject.objectPtr)

    /** Node.set_display_folded */
    def setDisplayFolded(fold: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_display_folded", 2586408642L), self.asObject.objectPtr, fold)

    /** Node.is_displayed_folded */
    def isDisplayedFolded(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_displayed_folded", 36873697L), self.asObject.objectPtr)

    /** Node.set_process_internal */
    def setProcessInternal(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_process_internal", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_processing_internal */
    def isProcessingInternal(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_processing_internal", 36873697L), self.asObject.objectPtr)

    /** Node.set_physics_process_internal */
    def setPhysicsProcessInternal(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_physics_process_internal", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_physics_processing_internal */
    def isPhysicsProcessingInternal(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_processing_internal", 36873697L), self.asObject.objectPtr)

    /** Node.is_physics_interpolated */
    def isPhysicsInterpolated(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_interpolated", 36873697L), self.asObject.objectPtr)

    /** Node.is_physics_interpolated_and_enabled */
    def isPhysicsInterpolatedAndEnabled(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_physics_interpolated_and_enabled", 36873697L), self.asObject.objectPtr)

    /** Node.reset_physics_interpolation */
    def resetPhysicsInterpolation(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "reset_physics_interpolation", 3218959716L), self.asObject.objectPtr)

    /** Node.can_auto_translate */
    def canAutoTranslate(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "can_auto_translate", 36873697L), self.asObject.objectPtr)

    /** Node.set_translation_domain_inherited */
    def setTranslationDomainInherited(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "set_translation_domain_inherited", 3218959716L), self.asObject.objectPtr)

    /** Node.duplicate */
    def duplicate(flags: Long): Node =
      Node.fromObject(Ptrcall.call1[Long, GodotObject](MethodBind.get("Node", "duplicate", 3511555459L), self.asObject.objectPtr, flags))

    /** Node.replace_by */
    def replaceBy(node: Node, keep_groups: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "replace_by", 2570952461L), self.asObject.objectPtr, node.asObject, keep_groups)

    /** Node.set_scene_instance_load_placeholder */
    def setSceneInstanceLoadPlaceholder(load_placeholder: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_scene_instance_load_placeholder", 2586408642L), self.asObject.objectPtr, load_placeholder)

    /** Node.get_scene_instance_load_placeholder */
    def getSceneInstanceLoadPlaceholder(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "get_scene_instance_load_placeholder", 36873697L), self.asObject.objectPtr)

    /** Node.set_editable_instance */
    def setEditableInstance(node: Node, is_editable: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "set_editable_instance", 2731852923L), self.asObject.objectPtr, node.asObject, is_editable)

    /** Node.is_editable_instance */
    def isEditableInstance(node: Node): Boolean =
      Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Node", "is_editable_instance", 3093956946L), self.asObject.objectPtr, node.asObject)

    /** Node.queue_free */
    def queueFree(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "queue_free", 3218959716L), self.asObject.objectPtr)

    /** Node.request_ready */
    def requestReady(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "request_ready", 3218959716L), self.asObject.objectPtr)

    /** Node.is_node_ready */
    def isNodeReady(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_node_ready", 36873697L), self.asObject.objectPtr)

    /** Node.set_multiplayer_authority */
    def setMultiplayerAuthority(id: Long, recursive: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Node", "set_multiplayer_authority", 972357352L), self.asObject.objectPtr, id, recursive)

    /** Node.get_multiplayer_authority */
    def getMultiplayerAuthority(): Long =
      Ptrcall.call0[Long](MethodBind.get("Node", "get_multiplayer_authority", 3905245786L), self.asObject.objectPtr)

    /** Node.is_multiplayer_authority */
    def isMultiplayerAuthority(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_multiplayer_authority", 36873697L), self.asObject.objectPtr)

    /** Node.set_editor_description */
    def setEditorDescription(editor_description: String): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_editor_description", 83702148L), self.asObject.objectPtr, editor_description)

    /** Node.get_editor_description */
    def getEditorDescription(): String =
      Ptrcall.call0[String](MethodBind.get("Node", "get_editor_description", 201670096L), self.asObject.objectPtr)

    /** Node.set_unique_name_in_owner */
    def setUniqueNameInOwner(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "set_unique_name_in_owner", 2586408642L), self.asObject.objectPtr, enable)

    /** Node.is_unique_name_in_owner */
    def isUniqueNameInOwner(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Node", "is_unique_name_in_owner", 36873697L), self.asObject.objectPtr)

    /** Node.update_configuration_warnings */
    def updateConfigurationWarnings(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Node", "update_configuration_warnings", 3218959716L), self.asObject.objectPtr)

    /** Node.notify_deferred_thread_group */
    def notifyDeferredThreadGroup(what: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "notify_deferred_thread_group", 1286410249L), self.asObject.objectPtr, what)

    /** Node.notify_thread_safe */
    def notifyThreadSafe(what: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Node", "notify_thread_safe", 1286410249L), self.asObject.objectPtr, what)

    /** Object.is_class */
    def isClass(`class`: String): Boolean =
      Ptrcall.call1[String, Boolean](MethodBind.get("Object", "is_class", 3927539163L), self.asObject.objectPtr, `class`)

    /** Object.notification */
    def notification(what: Long, reversed: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), self.asObject.objectPtr, what, reversed)

    /** Object.get_instance_id */
    def getInstanceId(): Long =
      Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), self.asObject.objectPtr)

    /** Object.set_block_signals */
    def setBlockSignals(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_block_signals", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.is_blocking_signals */
    def isBlockingSignals(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_blocking_signals", 36873697L), self.asObject.objectPtr)

    /** Object.notify_property_list_changed */
    def notifyPropertyListChanged(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "notify_property_list_changed", 3218959716L), self.asObject.objectPtr)

    /** Object.set_message_translation */
    def setMessageTranslation(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_message_translation", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.can_translate_messages */
    def canTranslateMessages(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "can_translate_messages", 36873697L), self.asObject.objectPtr)

    /** Object.is_queued_for_deletion */
    def isQueuedForDeletion(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_queued_for_deletion", 36873697L), self.asObject.objectPtr)

    /** Object.cancel_free */
    def cancelFree(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "cancel_free", 3218959716L), self.asObject.objectPtr)

  }
}
