package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AStar2D`, extends `RefCounted`. */
abstract class AStar2D extends RefCounted {

  /** AStar2D.get_available_point_id */
  final def getAvailablePointId(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar2D", "get_available_point_id", 3905245786L), hostObject.objectPtr)

  /** AStar2D.add_point */
  final def addPoint(id: Long, position: gdext.builtin.Vector2, weight_scale: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar2D", "add_point", 4074201818L), hostObject.objectPtr, id, position, weight_scale)

  /** AStar2D.get_point_position */
  final def getPointPosition(id: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("AStar2D", "get_point_position", 2299179447L), hostObject.objectPtr, id)

  /** AStar2D.set_point_position */
  final def setPointPosition(id: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar2D", "set_point_position", 163021252L), hostObject.objectPtr, id, position)

  /** AStar2D.get_point_weight_scale */
  final def getPointWeightScale(id: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AStar2D", "get_point_weight_scale", 2339986948L), hostObject.objectPtr, id)

  /** AStar2D.set_point_weight_scale */
  final def setPointWeightScale(id: Long, weight_scale: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar2D", "set_point_weight_scale", 1602489585L), hostObject.objectPtr, id, weight_scale)

  /** AStar2D.remove_point */
  final def removePoint(id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar2D", "remove_point", 1286410249L), hostObject.objectPtr, id)

  /** AStar2D.has_point */
  final def hasPoint(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AStar2D", "has_point", 1116898809L), hostObject.objectPtr, id)

  /** AStar2D.set_neighbor_filter_enabled */
  final def setNeighborFilterEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar2D", "set_neighbor_filter_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** AStar2D.is_neighbor_filter_enabled */
  final def isNeighborFilterEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AStar2D", "is_neighbor_filter_enabled", 36873697L), hostObject.objectPtr)

  /** AStar2D.set_point_disabled */
  final def setPointDisabled(id: Long, disabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AStar2D", "set_point_disabled", 972357352L), hostObject.objectPtr, id, disabled)

  /** AStar2D.is_point_disabled */
  final def isPointDisabled(id: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AStar2D", "is_point_disabled", 1116898809L), hostObject.objectPtr, id)

  /** AStar2D.connect_points */
  final def connectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar2D", "connect_points", 3710494224L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar2D.disconnect_points */
  final def disconnectPoints(id: Long, to_id: Long, bidirectional: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("AStar2D", "disconnect_points", 3710494224L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar2D.are_points_connected */
  final def arePointsConnected(id: Long, to_id: Long, bidirectional: Boolean): Boolean =
    Ptrcall.call3[Long, Long, Boolean, Boolean](MethodBind.get("AStar2D", "are_points_connected", 2288175859L), hostObject.objectPtr, id, to_id, bidirectional)

  /** AStar2D.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar2D", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** AStar2D.get_point_capacity */
  final def getPointCapacity(): Long =
    Ptrcall.call0[Long](MethodBind.get("AStar2D", "get_point_capacity", 3905245786L), hostObject.objectPtr)

  /** AStar2D.reserve_space */
  final def reserveSpace(num_nodes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AStar2D", "reserve_space", 1286410249L), hostObject.objectPtr, num_nodes)

  /** AStar2D.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AStar2D", "clear", 3218959716L), hostObject.objectPtr)

  /** AStar2D.get_closest_point */
  final def getClosestPoint(to_position: gdext.builtin.Vector2, include_disabled: Boolean): Long =
    Ptrcall.call2[gdext.builtin.Vector2, Boolean, Long](MethodBind.get("AStar2D", "get_closest_point", 2300324924L), hostObject.objectPtr, to_position, include_disabled)

  /** AStar2D.get_closest_position_in_segment */
  final def getClosestPositionInSegment(to_position: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("AStar2D", "get_closest_position_in_segment", 2656412154L), hostObject.objectPtr, to_position)

}

object AStar2D {
  /** Class metadata for Gd[AStar2D] lifetime management and casting. */
  given GodotClass[AStar2D] with {
    def className = "AStar2D"
    def isRefCounted = true
    def wrap(o: GodotObject): AStar2D = new AStar2D {}.withHost(o.objectPtr)
    def unwrap(t: AStar2D): GodotObject = t.hostObject
  }
}
