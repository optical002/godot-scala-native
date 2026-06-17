package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AStar3D`, extends `RefCounted`. */
abstract class AStar3D extends RefCounted {

  /** AStar3D.get_available_point_id */
  final def getAvailablePointId(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar3D", "get_available_point_id", 3905245786L), hostObject.objectPtr)

  /** AStar3D.add_point */
  final def addPoint(id: Long, position: io.github.optical002.godot.builtin.Vector3, weight_scale: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar3D", "add_point", 1038703438L), hostObject.objectPtr, id, position, weight_scale)

  /** AStar3D.get_point_position */
  final def getPointPosition(id: Long): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector3](MethodBind.get("AStar3D", "get_point_position", 711720468L), hostObject.objectPtr, id)

  /** AStar3D.set_point_position */
  final def setPointPosition(id: Long, position: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar3D", "set_point_position", 1530502735L), hostObject.objectPtr, id, position)

  /** AStar3D.get_point_weight_scale */
  final def getPointWeightScale(id: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AStar3D", "get_point_weight_scale", 2339986948L), hostObject.objectPtr, id)

  /** AStar3D.set_point_weight_scale */
  final def setPointWeightScale(id: Long, weight_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar3D", "set_point_weight_scale", 1602489585L), hostObject.objectPtr, id, weight_scale)

  /** AStar3D.remove_point */
  final def removePoint(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar3D", "remove_point", 1286410249L), hostObject.objectPtr, id)

  /** AStar3D.has_point */
  final def hasPoint(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AStar3D", "has_point", 1116898809L), hostObject.objectPtr, id)

  /** AStar3D.set_point_disabled */
  final def setPointDisabled(id: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar3D", "set_point_disabled", 972357352L), hostObject.objectPtr, id, disabled)

  /** AStar3D.is_point_disabled */
  final def isPointDisabled(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AStar3D", "is_point_disabled", 1116898809L), hostObject.objectPtr, id)

  /** AStar3D.set_neighbor_filter_enabled */
  final def setNeighborFilterEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar3D", "set_neighbor_filter_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** AStar3D.is_neighbor_filter_enabled */
  final def isNeighborFilterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AStar3D", "is_neighbor_filter_enabled", 36873697L), hostObject.objectPtr)

  /** AStar3D.connect_points */
  final def connectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar3D", "connect_points", 3710494224L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar3D.disconnect_points */
  final def disconnectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar3D", "disconnect_points", 3710494224L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar3D.are_points_connected */
  final def arePointsConnected(id: Long, to_id: Long, bidirectional: Boolean): Boolean =
    Ptrcall.call3[Long, Long, Boolean, Boolean](MethodBind.get("AStar3D", "are_points_connected", 2288175859L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar3D.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar3D", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** AStar3D.get_point_capacity */
  final def getPointCapacity(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar3D", "get_point_capacity", 3905245786L), hostObject.objectPtr)

  /** AStar3D.reserve_space */
  final def reserveSpace(num_nodes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar3D", "reserve_space", 1286410249L), hostObject.objectPtr, num_nodes)

  /** AStar3D.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AStar3D", "clear", 3218959716L), hostObject.objectPtr)

  /** AStar3D.get_closest_point */
  final def getClosestPoint(to_position: io.github.optical002.godot.builtin.Vector3, include_disabled: Boolean): Long =
    Ptrcall.call2[io.github.optical002.godot.builtin.Vector3, Boolean, Long](MethodBind.get("AStar3D", "get_closest_point", 3241074317L), hostObject.objectPtr, to_position, include_disabled)

  /** AStar3D.get_closest_position_in_segment */
  final def getClosestPositionInSegment(to_position: io.github.optical002.godot.builtin.Vector3): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector3, io.github.optical002.godot.builtin.Vector3](MethodBind.get("AStar3D", "get_closest_position_in_segment", 192990374L), hostObject.objectPtr, to_position)

}

object AStar3D {
  /** Class metadata for Gd[AStar3D] lifetime management and casting. */
  given GodotClass[AStar3D] with {
    def className = "AStar3D"
    def isRefCounted = true
    def wrap(o: GodotObject): AStar3D = new AStar3D {}.withHost(o.objectPtr)
    def unwrap(t: AStar3D): GodotObject = t.hostObject
  }
}
