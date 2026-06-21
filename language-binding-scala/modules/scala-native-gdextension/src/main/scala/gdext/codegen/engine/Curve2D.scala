package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Curve2D`, extends `Resource`. */
abstract class Curve2D extends Resource {

  /** Curve2D.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Curve2D", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** Curve2D.set_point_count */
  final def setPointCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve2D", "set_point_count", 1286410249L), hostObject.objectPtr, count)

  /** Curve2D.add_point */
  final def addPoint(position: gdext.builtin.Vector2, in: gdext.builtin.Vector2, out: gdext.builtin.Vector2, index: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("Curve2D", "add_point", 4175465202L), hostObject.objectPtr, position, in, out, index)

  /** Curve2D.set_point_position */
  final def setPointPosition(idx: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve2D", "set_point_position", 163021252L), hostObject.objectPtr, idx, position)

  /** Curve2D.get_point_position */
  final def getPointPosition(idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Curve2D", "get_point_position", 2299179447L), hostObject.objectPtr, idx)

  /** Curve2D.set_point_in */
  final def setPointIn(idx: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve2D", "set_point_in", 163021252L), hostObject.objectPtr, idx, position)

  /** Curve2D.get_point_in */
  final def getPointIn(idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Curve2D", "get_point_in", 2299179447L), hostObject.objectPtr, idx)

  /** Curve2D.set_point_out */
  final def setPointOut(idx: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("Curve2D", "set_point_out", 163021252L), hostObject.objectPtr, idx, position)

  /** Curve2D.get_point_out */
  final def getPointOut(idx: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Curve2D", "get_point_out", 2299179447L), hostObject.objectPtr, idx)

  /** Curve2D.remove_point */
  final def removePoint(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve2D", "remove_point", 1286410249L), hostObject.objectPtr, idx)

  /** Curve2D.clear_points */
  final def clearPoints(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Curve2D", "clear_points", 3218959716L), hostObject.objectPtr)

  /** Curve2D.sample */
  final def sample(idx: Long, t: Double): gdext.builtin.Vector2 =
    Ptrcall.call2[Long, Double, gdext.builtin.Vector2](MethodBind.get("Curve2D", "sample", 26514310L), hostObject.objectPtr, idx, t)

  /** Curve2D.samplef */
  final def samplef(fofs: Double): gdext.builtin.Vector2 =
    Ptrcall.call1[Double, gdext.builtin.Vector2](MethodBind.get("Curve2D", "samplef", 3588506812L), hostObject.objectPtr, fofs)

  /** Curve2D.set_bake_interval */
  final def setBakeInterval(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Curve2D", "set_bake_interval", 373806689L), hostObject.objectPtr, distance)

  /** Curve2D.get_bake_interval */
  final def getBakeInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve2D", "get_bake_interval", 1740695150L), hostObject.objectPtr)

  /** Curve2D.get_baked_length */
  final def getBakedLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Curve2D", "get_baked_length", 1740695150L), hostObject.objectPtr)

  /** Curve2D.sample_baked */
  final def sampleBaked(offset: Double, cubic: Boolean): gdext.builtin.Vector2 =
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector2](MethodBind.get("Curve2D", "sample_baked", 3464257706L), hostObject.objectPtr, offset, cubic)

  /** Curve2D.sample_baked_with_rotation */
  final def sampleBakedWithRotation(offset: Double, cubic: Boolean): gdext.builtin.Transform2D =
    Ptrcall.call2[Double, Boolean, gdext.builtin.Transform2D](MethodBind.get("Curve2D", "sample_baked_with_rotation", 3296056341L), hostObject.objectPtr, offset, cubic)

  /** Curve2D.get_closest_point */
  final def getClosestPoint(to_point: gdext.builtin.Vector2): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](MethodBind.get("Curve2D", "get_closest_point", 2656412154L), hostObject.objectPtr, to_point)

  /** Curve2D.get_closest_offset */
  final def getClosestOffset(to_point: gdext.builtin.Vector2): Double =
    Ptrcall.call1[gdext.builtin.Vector2, Double](MethodBind.get("Curve2D", "get_closest_offset", 2276447920L), hostObject.objectPtr, to_point)

}

object Curve2D {
  /** Class metadata for Gd[Curve2D] lifetime management and casting. */
  given GodotClass[Curve2D] with {
    def className = "Curve2D"
    def isRefCounted = true
    def wrap(o: GodotObject): Curve2D = new Curve2D {}.withHost(o.objectPtr)
    def unwrap(t: Curve2D): GodotObject = t.hostObject
  }
}
