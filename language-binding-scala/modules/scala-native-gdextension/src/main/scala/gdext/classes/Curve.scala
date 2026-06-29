package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Curve`, extends `Resource`. */
abstract class Curve extends Resource {
  override def godotClassName: String = "Curve"

  /** Curve.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Curve", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** Curve.set_point_count */
  final def setPointCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_point_count", 1286410249L), hostObject.objectPtr, count)

  /** Curve.add_point */
  final def addPoint(position: gdext.builtin.Vector2, left_tangent: Double, right_tangent: Double, left_mode: Long, right_mode: Long): Long =
    Ptrcall.call5[gdext.builtin.Vector2, Double, Double, Long, Long, Long](MethodBind.get("Curve", "add_point", 434072736L), hostObject.objectPtr, position, left_tangent, right_tangent, left_mode, right_mode)

  /** Curve.remove_point */
  final def removePoint(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "remove_point", 1286410249L), hostObject.objectPtr, index)

  /** Curve.clear_points */
  final def clearPoints(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Curve", "clear_points", 3218959716L), hostObject.objectPtr)

  /** Curve.get_point_position */
  final def getPointPosition(index: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Curve", "get_point_position", 2299179447L), hostObject.objectPtr, index)

  /** Curve.set_point_value */
  final def setPointValue(index: Long, y: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve", "set_point_value", 1602489585L), hostObject.objectPtr, index, y)

  /** Curve.set_point_offset */
  final def setPointOffset(index: Long, offset: Double): Long =
    Ptrcall.call2[Long, Double, Long](MethodBind.get("Curve", "set_point_offset", 3780573764L), hostObject.objectPtr, index, offset)

  /** Curve.sample */
  final def sample(offset: Double): Double =
    Ptrcall.call1[Double, Double](MethodBind.get("Curve", "sample", 3919130443L), hostObject.objectPtr, offset)

  /** Curve.sample_baked */
  final def sampleBaked(offset: Double): Double =
    Ptrcall.call1[Double, Double](MethodBind.get("Curve", "sample_baked", 3919130443L), hostObject.objectPtr, offset)

  /** Curve.get_point_left_tangent */
  final def getPointLeftTangent(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Curve", "get_point_left_tangent", 2339986948L), hostObject.objectPtr, index)

  /** Curve.get_point_right_tangent */
  final def getPointRightTangent(index: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Curve", "get_point_right_tangent", 2339986948L), hostObject.objectPtr, index)

  /** Curve.get_point_left_mode */
  final def getPointLeftMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Curve", "get_point_left_mode", 426950354L), hostObject.objectPtr, index)

  /** Curve.get_point_right_mode */
  final def getPointRightMode(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Curve", "get_point_right_mode", 426950354L), hostObject.objectPtr, index)

  /** Curve.set_point_left_tangent */
  final def setPointLeftTangent(index: Long, tangent: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve", "set_point_left_tangent", 1602489585L), hostObject.objectPtr, index, tangent)

  /** Curve.set_point_right_tangent */
  final def setPointRightTangent(index: Long, tangent: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve", "set_point_right_tangent", 1602489585L), hostObject.objectPtr, index, tangent)

  /** Curve.set_point_left_mode */
  final def setPointLeftMode(index: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve", "set_point_left_mode", 1217242874L), hostObject.objectPtr, index, mode)

  /** Curve.set_point_right_mode */
  final def setPointRightMode(index: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve", "set_point_right_mode", 1217242874L), hostObject.objectPtr, index, mode)

  /** Curve.get_min_value */
  final def getMinValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_min_value", 1740695150L), hostObject.objectPtr)

  /** Curve.set_min_value */
  final def setMinValue(min: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_min_value", 373806689L), hostObject.objectPtr, min)

  /** Curve.get_max_value */
  final def getMaxValue(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_max_value", 1740695150L), hostObject.objectPtr)

  /** Curve.set_max_value */
  final def setMaxValue(max: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_max_value", 373806689L), hostObject.objectPtr, max)

  /** Curve.get_value_range */
  final def getValueRange(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_value_range", 1740695150L), hostObject.objectPtr)

  /** Curve.get_min_domain */
  final def getMinDomain(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_min_domain", 1740695150L), hostObject.objectPtr)

  /** Curve.set_min_domain */
  final def setMinDomain(min: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_min_domain", 373806689L), hostObject.objectPtr, min)

  /** Curve.get_max_domain */
  final def getMaxDomain(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_max_domain", 1740695150L), hostObject.objectPtr)

  /** Curve.set_max_domain */
  final def setMaxDomain(max: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_max_domain", 373806689L), hostObject.objectPtr, max)

  /** Curve.get_domain_range */
  final def getDomainRange(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve", "get_domain_range", 1740695150L), hostObject.objectPtr)

  /** Curve.clean_dupes */
  final def cleanDupes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Curve", "clean_dupes", 3218959716L), hostObject.objectPtr)

  /** Curve.bake */
  final def bake(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Curve", "bake", 3218959716L), hostObject.objectPtr)

  /** Curve.get_bake_resolution */
  final def getBakeResolution(): Long =
    Ptrcall.call0[Long](MethodBind.get("Curve", "get_bake_resolution", 3905245786L), hostObject.objectPtr)

  /** Curve.set_bake_resolution */
  final def setBakeResolution(resolution: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve", "set_bake_resolution", 1286410249L), hostObject.objectPtr, resolution)

}
