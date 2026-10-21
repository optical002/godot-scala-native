package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeBlendSpace1D`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendSpace1D extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeBlendSpace1D"

  /** AnimationNodeBlendSpace1D.add_blend_point */
  final def addBlendPoint(node: AnimationRootNode, pos: Double, at_index: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_add_blend_point == null) gdext.classes.AnimationNodeBlendSpace1D.mb_add_blend_point = MethodBind.get("AnimationNodeBlendSpace1D", "add_blend_point", 285050433L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendSpace1D.mb_add_blend_point, livePtr, Wrappers.handle(node), pos, at_index)
  }

  /** AnimationNodeBlendSpace1D.set_blend_point_position */
  final def setBlendPointPosition(point: Long, pos: Double): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_position == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_position = MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_point_position", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_position, livePtr, point, pos)
  }

  /** AnimationNodeBlendSpace1D.get_blend_point_position */
  final def getBlendPointPosition(point: Long): Double = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_position == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_position = MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_position", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_position, livePtr, point)
  }

  /** AnimationNodeBlendSpace1D.set_blend_point_node */
  final def setBlendPointNode(point: Long, node: AnimationRootNode): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_node == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_node = MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_point_node", 4240341528L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_point_node, livePtr, point, Wrappers.handle(node))
  }

  /** AnimationNodeBlendSpace1D.get_blend_point_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBlendPointNode(point: Long): AnimationRootNode = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_node == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_node = MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_node", 665599029L)
    Wrappers.owned[AnimationRootNode](Ptrcall.call1[Long, Long](gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_node, livePtr, point))
  }

  /** AnimationNodeBlendSpace1D.remove_blend_point */
  final def removeBlendPoint(point: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_remove_blend_point == null) gdext.classes.AnimationNodeBlendSpace1D.mb_remove_blend_point = MethodBind.get("AnimationNodeBlendSpace1D", "remove_blend_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_remove_blend_point, livePtr, point)
  }

  /** AnimationNodeBlendSpace1D.get_blend_point_count */
  final def getBlendPointCount(): Long = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_count == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_count = MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_point_count, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_min_space */
  final def setMinSpace(min_space: Double): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_min_space == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_min_space = MethodBind.get("AnimationNodeBlendSpace1D", "set_min_space", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_min_space, livePtr, min_space)
  }

  /** AnimationNodeBlendSpace1D.get_min_space */
  final def getMinSpace(): Double = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_min_space == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_min_space = MethodBind.get("AnimationNodeBlendSpace1D", "get_min_space", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeBlendSpace1D.mb_get_min_space, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_max_space */
  final def setMaxSpace(max_space: Double): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_max_space == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_max_space = MethodBind.get("AnimationNodeBlendSpace1D", "set_max_space", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_max_space, livePtr, max_space)
  }

  /** AnimationNodeBlendSpace1D.get_max_space */
  final def getMaxSpace(): Double = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_max_space == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_max_space = MethodBind.get("AnimationNodeBlendSpace1D", "get_max_space", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeBlendSpace1D.mb_get_max_space, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_snap */
  final def setSnap(snap: Double): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_snap == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_snap = MethodBind.get("AnimationNodeBlendSpace1D", "set_snap", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_snap, livePtr, snap)
  }

  /** AnimationNodeBlendSpace1D.get_snap */
  final def getSnap(): Double = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_snap == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_snap = MethodBind.get("AnimationNodeBlendSpace1D", "get_snap", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeBlendSpace1D.mb_get_snap, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_value_label */
  final def setValueLabel(text: String): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_value_label == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_value_label = MethodBind.get("AnimationNodeBlendSpace1D", "set_value_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_value_label, livePtr, text)
  }

  /** AnimationNodeBlendSpace1D.get_value_label */
  final def getValueLabel(): String = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_value_label == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_value_label = MethodBind.get("AnimationNodeBlendSpace1D", "get_value_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimationNodeBlendSpace1D.mb_get_value_label, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_blend_mode */
  final def setBlendMode(mode: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_mode == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_mode = MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_mode", 2600869457L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_blend_mode, livePtr, mode)
  }

  /** AnimationNodeBlendSpace1D.get_blend_mode */
  final def getBlendMode(): Long = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_mode == null) gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_mode = MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_mode", 1547667849L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeBlendSpace1D.mb_get_blend_mode, livePtr)
  }

  /** AnimationNodeBlendSpace1D.set_use_sync */
  final def setUseSync(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_set_use_sync == null) gdext.classes.AnimationNodeBlendSpace1D.mb_set_use_sync = MethodBind.get("AnimationNodeBlendSpace1D", "set_use_sync", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace1D.mb_set_use_sync, livePtr, enable)
  }

  /** AnimationNodeBlendSpace1D.is_using_sync */
  final def isUsingSync(): Boolean = {
    if (gdext.classes.AnimationNodeBlendSpace1D.mb_is_using_sync == null) gdext.classes.AnimationNodeBlendSpace1D.mb_is_using_sync = MethodBind.get("AnimationNodeBlendSpace1D", "is_using_sync", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeBlendSpace1D.mb_is_using_sync, livePtr)
  }

}

object AnimationNodeBlendSpace1D {
  private[classes] var mb_add_blend_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_point_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_blend_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_value_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_value_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_sync: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_sync: GDExtensionMethodBindPtr = null
}
