package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Curve3D`, extends `Resource`. */
abstract class Curve3D extends Resource {

  /** Curve3D.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Curve3D", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** Curve3D.set_point_count */
  final def setPointCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve3D", "set_point_count", 1286410249L), hostObject.objectPtr, count)

  /** Curve3D.add_point */
  final def addPoint(position: gdext.builtin.Vector3, in: gdext.builtin.Vector3, out: gdext.builtin.Vector3, index: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("Curve3D", "add_point", 2931053748L), hostObject.objectPtr, position, in, out, index)

  /** Curve3D.set_point_position */
  final def setPointPosition(idx: Long, position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve3D", "set_point_position", 1530502735L), hostObject.objectPtr, idx, position)

  /** Curve3D.get_point_position */
  final def getPointPosition(idx: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("Curve3D", "get_point_position", 711720468L), hostObject.objectPtr, idx)

  /** Curve3D.set_point_tilt */
  final def setPointTilt(idx: Long, tilt: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve3D", "set_point_tilt", 1602489585L), hostObject.objectPtr, idx, tilt)

  /** Curve3D.get_point_tilt */
  final def getPointTilt(idx: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Curve3D", "get_point_tilt", 2339986948L), hostObject.objectPtr, idx)

  /** Curve3D.set_point_in */
  final def setPointIn(idx: Long, position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve3D", "set_point_in", 1530502735L), hostObject.objectPtr, idx, position)

  /** Curve3D.get_point_in */
  final def getPointIn(idx: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("Curve3D", "get_point_in", 711720468L), hostObject.objectPtr, idx)

  /** Curve3D.set_point_out */
  final def setPointOut(idx: Long, position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve3D", "set_point_out", 1530502735L), hostObject.objectPtr, idx, position)

  /** Curve3D.get_point_out */
  final def getPointOut(idx: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("Curve3D", "get_point_out", 711720468L), hostObject.objectPtr, idx)

  /** Curve3D.remove_point */
  final def removePoint(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve3D", "remove_point", 1286410249L), hostObject.objectPtr, idx)

  /** Curve3D.clear_points */
  final def clearPoints(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Curve3D", "clear_points", 3218959716L), hostObject.objectPtr)

  /** Curve3D.sample */
  final def sample(idx: Long, t: Double): gdext.builtin.Vector3 =
    Ptrcall.call2[Long, Double, gdext.builtin.Vector3](MethodBind.get("Curve3D", "sample", 3285246857L), hostObject.objectPtr, idx, t)

  /** Curve3D.samplef */
  final def samplef(fofs: Double): gdext.builtin.Vector3 =
    Ptrcall.call1[Double, gdext.builtin.Vector3](MethodBind.get("Curve3D", "samplef", 2553580215L), hostObject.objectPtr, fofs)

  /** Curve3D.set_closed */
  final def setClosed(closed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve3D", "set_closed", 2586408642L), hostObject.objectPtr, closed)

  /** Curve3D.is_closed */
  final def isClosed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Curve3D", "is_closed", 36873697L), hostObject.objectPtr)

  /** Curve3D.set_bake_interval */
  final def setBakeInterval(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve3D", "set_bake_interval", 373806689L), hostObject.objectPtr, distance)

  /** Curve3D.get_bake_interval */
  final def getBakeInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve3D", "get_bake_interval", 1740695150L), hostObject.objectPtr)

  /** Curve3D.set_up_vector_enabled */
  final def setUpVectorEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve3D", "set_up_vector_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** Curve3D.is_up_vector_enabled */
  final def isUpVectorEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Curve3D", "is_up_vector_enabled", 36873697L), hostObject.objectPtr)

  /** Curve3D.get_baked_length */
  final def getBakedLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve3D", "get_baked_length", 1740695150L), hostObject.objectPtr)

  /** Curve3D.sample_baked */
  final def sampleBaked(offset: Double, cubic: Boolean): gdext.builtin.Vector3 =
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector3](MethodBind.get("Curve3D", "sample_baked", 1350085894L), hostObject.objectPtr, offset, cubic)

  /** Curve3D.sample_baked_with_rotation */
  final def sampleBakedWithRotation(offset: Double, cubic: Boolean, apply_tilt: Boolean): gdext.builtin.Transform3D =
    Ptrcall.call3[Double, Boolean, Boolean, gdext.builtin.Transform3D](MethodBind.get("Curve3D", "sample_baked_with_rotation", 1939359131L), hostObject.objectPtr, offset, cubic, apply_tilt)

  /** Curve3D.sample_baked_up_vector */
  final def sampleBakedUpVector(offset: Double, apply_tilt: Boolean): gdext.builtin.Vector3 =
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector3](MethodBind.get("Curve3D", "sample_baked_up_vector", 1362627031L), hostObject.objectPtr, offset, apply_tilt)

  /** Curve3D.get_closest_point */
  final def getClosestPoint(to_point: gdext.builtin.Vector3): gdext.builtin.Vector3 =
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](MethodBind.get("Curve3D", "get_closest_point", 192990374L), hostObject.objectPtr, to_point)

  /** Curve3D.get_closest_offset */
  final def getClosestOffset(to_point: gdext.builtin.Vector3): Double =
    Ptrcall.call1[gdext.builtin.Vector3, Double](MethodBind.get("Curve3D", "get_closest_offset", 1109078154L), hostObject.objectPtr, to_point)

}

object Curve3D {
  /** Class metadata for Gd[Curve3D] lifetime management and casting. */
  given GodotClass[Curve3D] with {
    def className = "Curve3D"
    def isRefCounted = true
    def wrap(o: GodotObject): Curve3D = new Curve3D {}.withHost(o.objectPtr)
    def unwrap(t: Curve3D): GodotObject = t.hostObject
  }
}
