package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AStar3D`, extends `RefCounted`. */
abstract class AStar3D extends RefCounted {
  override def godotClassName: String = "AStar3D"

  /** AStar3D.get_available_point_id */
  final def getAvailablePointId(): Long = {
    if (gdext.classes.AStar3D.mb_get_available_point_id == null) gdext.classes.AStar3D.mb_get_available_point_id = MethodBind.get("AStar3D", "get_available_point_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AStar3D.mb_get_available_point_id, livePtr)
  }

  /** AStar3D.add_point */
  final def addPoint(id: Long, position: gdext.builtin.Vector3, weight_scale: Double): Unit = {
    if (gdext.classes.AStar3D.mb_add_point == null) gdext.classes.AStar3D.mb_add_point = MethodBind.get("AStar3D", "add_point", 1038703438L)
    Ptrcall.callVoid3(gdext.classes.AStar3D.mb_add_point, livePtr, id, position, weight_scale)
  }

  /** AStar3D.get_point_position */
  final def getPointPosition(id: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.AStar3D.mb_get_point_position == null) gdext.classes.AStar3D.mb_get_point_position = MethodBind.get("AStar3D", "get_point_position", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.AStar3D.mb_get_point_position, livePtr, id)
  }

  /** AStar3D.set_point_position */
  final def setPointPosition(id: Long, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.AStar3D.mb_set_point_position == null) gdext.classes.AStar3D.mb_set_point_position = MethodBind.get("AStar3D", "set_point_position", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.AStar3D.mb_set_point_position, livePtr, id, position)
  }

  /** AStar3D.get_point_weight_scale */
  final def getPointWeightScale(id: Long): Double = {
    if (gdext.classes.AStar3D.mb_get_point_weight_scale == null) gdext.classes.AStar3D.mb_get_point_weight_scale = MethodBind.get("AStar3D", "get_point_weight_scale", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.AStar3D.mb_get_point_weight_scale, livePtr, id)
  }

  /** AStar3D.set_point_weight_scale */
  final def setPointWeightScale(id: Long, weight_scale: Double): Unit = {
    if (gdext.classes.AStar3D.mb_set_point_weight_scale == null) gdext.classes.AStar3D.mb_set_point_weight_scale = MethodBind.get("AStar3D", "set_point_weight_scale", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.AStar3D.mb_set_point_weight_scale, livePtr, id, weight_scale)
  }

  /** AStar3D.remove_point */
  final def removePoint(id: Long): Unit = {
    if (gdext.classes.AStar3D.mb_remove_point == null) gdext.classes.AStar3D.mb_remove_point = MethodBind.get("AStar3D", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AStar3D.mb_remove_point, livePtr, id)
  }

  /** AStar3D.has_point */
  final def hasPoint(id: Long): Boolean = {
    if (gdext.classes.AStar3D.mb_has_point == null) gdext.classes.AStar3D.mb_has_point = MethodBind.get("AStar3D", "has_point", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AStar3D.mb_has_point, livePtr, id)
  }

  /** AStar3D.set_point_disabled */
  final def setPointDisabled(id: Long, disabled: Boolean): Unit = {
    if (gdext.classes.AStar3D.mb_set_point_disabled == null) gdext.classes.AStar3D.mb_set_point_disabled = MethodBind.get("AStar3D", "set_point_disabled", 972357352L)
    Ptrcall.callVoid2(gdext.classes.AStar3D.mb_set_point_disabled, livePtr, id, disabled)
  }

  /** AStar3D.is_point_disabled */
  final def isPointDisabled(id: Long): Boolean = {
    if (gdext.classes.AStar3D.mb_is_point_disabled == null) gdext.classes.AStar3D.mb_is_point_disabled = MethodBind.get("AStar3D", "is_point_disabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.AStar3D.mb_is_point_disabled, livePtr, id)
  }

  /** AStar3D.set_neighbor_filter_enabled */
  final def setNeighborFilterEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.AStar3D.mb_set_neighbor_filter_enabled == null) gdext.classes.AStar3D.mb_set_neighbor_filter_enabled = MethodBind.get("AStar3D", "set_neighbor_filter_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AStar3D.mb_set_neighbor_filter_enabled, livePtr, enabled)
  }

  /** AStar3D.is_neighbor_filter_enabled */
  final def isNeighborFilterEnabled(): Boolean = {
    if (gdext.classes.AStar3D.mb_is_neighbor_filter_enabled == null) gdext.classes.AStar3D.mb_is_neighbor_filter_enabled = MethodBind.get("AStar3D", "is_neighbor_filter_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AStar3D.mb_is_neighbor_filter_enabled, livePtr)
  }

  /** AStar3D.connect_points */
  final def connectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit = {
    if (gdext.classes.AStar3D.mb_connect_points == null) gdext.classes.AStar3D.mb_connect_points = MethodBind.get("AStar3D", "connect_points", 3710494224L)
    Ptrcall.callVoid3(gdext.classes.AStar3D.mb_connect_points, livePtr, id, to_id, bidirectional)
  }

  /** AStar3D.disconnect_points */
  final def disconnectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit = {
    if (gdext.classes.AStar3D.mb_disconnect_points == null) gdext.classes.AStar3D.mb_disconnect_points = MethodBind.get("AStar3D", "disconnect_points", 3710494224L)
    Ptrcall.callVoid3(gdext.classes.AStar3D.mb_disconnect_points, livePtr, id, to_id, bidirectional)
  }

  /** AStar3D.are_points_connected */
  final def arePointsConnected(id: Long, to_id: Long, bidirectional: Boolean): Boolean = {
    if (gdext.classes.AStar3D.mb_are_points_connected == null) gdext.classes.AStar3D.mb_are_points_connected = MethodBind.get("AStar3D", "are_points_connected", 2288175859L)
    Ptrcall.call3[Long, Long, Boolean, Boolean](gdext.classes.AStar3D.mb_are_points_connected, livePtr, id, to_id, bidirectional)
  }

  /** AStar3D.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.AStar3D.mb_get_point_count == null) gdext.classes.AStar3D.mb_get_point_count = MethodBind.get("AStar3D", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AStar3D.mb_get_point_count, livePtr)
  }

  /** AStar3D.get_point_capacity */
  final def getPointCapacity(): Long = {
    if (gdext.classes.AStar3D.mb_get_point_capacity == null) gdext.classes.AStar3D.mb_get_point_capacity = MethodBind.get("AStar3D", "get_point_capacity", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AStar3D.mb_get_point_capacity, livePtr)
  }

  /** AStar3D.reserve_space */
  final def reserveSpace(num_nodes: Long): Unit = {
    if (gdext.classes.AStar3D.mb_reserve_space == null) gdext.classes.AStar3D.mb_reserve_space = MethodBind.get("AStar3D", "reserve_space", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AStar3D.mb_reserve_space, livePtr, num_nodes)
  }

  /** AStar3D.clear */
  final def clear(): Unit = {
    if (gdext.classes.AStar3D.mb_clear == null) gdext.classes.AStar3D.mb_clear = MethodBind.get("AStar3D", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AStar3D.mb_clear, livePtr)
  }

  /** AStar3D.get_closest_point */
  final def getClosestPoint(to_position: gdext.builtin.Vector3, include_disabled: Boolean): Long = {
    if (gdext.classes.AStar3D.mb_get_closest_point == null) gdext.classes.AStar3D.mb_get_closest_point = MethodBind.get("AStar3D", "get_closest_point", 3241074317L)
    Ptrcall.call2[gdext.builtin.Vector3, Boolean, Long](gdext.classes.AStar3D.mb_get_closest_point, livePtr, to_position, include_disabled)
  }

  /** AStar3D.get_closest_position_in_segment */
  final def getClosestPositionInSegment(to_position: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.AStar3D.mb_get_closest_position_in_segment == null) gdext.classes.AStar3D.mb_get_closest_position_in_segment = MethodBind.get("AStar3D", "get_closest_position_in_segment", 192990374L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.AStar3D.mb_get_closest_position_in_segment, livePtr, to_position)
  }

}

object AStar3D {
  private[classes] var mb_get_available_point_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_weight_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_weight_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_point_disabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_neighbor_filter_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_neighbor_filter_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_connect_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_points_connected: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_capacity: GDExtensionMethodBindPtr = null
  private[classes] var mb_reserve_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_position_in_segment: GDExtensionMethodBindPtr = null
}
