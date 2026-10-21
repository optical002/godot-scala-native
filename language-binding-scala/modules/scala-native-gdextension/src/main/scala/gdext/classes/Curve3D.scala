package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Curve3D`, extends `Resource`. */
abstract class Curve3D extends Resource {
  override def godotClassName: String = "Curve3D"

  /** Curve3D.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.Curve3D.mb_get_point_count == null) gdext.classes.Curve3D.mb_get_point_count = MethodBind.get("Curve3D", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Curve3D.mb_get_point_count, livePtr)
  }

  /** Curve3D.set_point_count */
  final def setPointCount(count: Long): Unit = {
    if (gdext.classes.Curve3D.mb_set_point_count == null) gdext.classes.Curve3D.mb_set_point_count = MethodBind.get("Curve3D", "set_point_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve3D.mb_set_point_count, livePtr, count)
  }

  /** Curve3D.add_point */
  final def addPoint(position: gdext.builtin.Vector3, in: gdext.builtin.Vector3, out: gdext.builtin.Vector3, index: Long): Unit = {
    if (gdext.classes.Curve3D.mb_add_point == null) gdext.classes.Curve3D.mb_add_point = MethodBind.get("Curve3D", "add_point", 2931053748L)
    Ptrcall.callVoid4(gdext.classes.Curve3D.mb_add_point, livePtr, position, in, out, index)
  }

  /** Curve3D.set_point_position */
  final def setPointPosition(idx: Long, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Curve3D.mb_set_point_position == null) gdext.classes.Curve3D.mb_set_point_position = MethodBind.get("Curve3D", "set_point_position", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.Curve3D.mb_set_point_position, livePtr, idx, position)
  }

  /** Curve3D.get_point_position */
  final def getPointPosition(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_get_point_position == null) gdext.classes.Curve3D.mb_get_point_position = MethodBind.get("Curve3D", "get_point_position", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_get_point_position, livePtr, idx)
  }

  /** Curve3D.set_point_tilt */
  final def setPointTilt(idx: Long, tilt: Double): Unit = {
    if (gdext.classes.Curve3D.mb_set_point_tilt == null) gdext.classes.Curve3D.mb_set_point_tilt = MethodBind.get("Curve3D", "set_point_tilt", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Curve3D.mb_set_point_tilt, livePtr, idx, tilt)
  }

  /** Curve3D.get_point_tilt */
  final def getPointTilt(idx: Long): Double = {
    if (gdext.classes.Curve3D.mb_get_point_tilt == null) gdext.classes.Curve3D.mb_get_point_tilt = MethodBind.get("Curve3D", "get_point_tilt", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.Curve3D.mb_get_point_tilt, livePtr, idx)
  }

  /** Curve3D.set_point_in */
  final def setPointIn(idx: Long, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Curve3D.mb_set_point_in == null) gdext.classes.Curve3D.mb_set_point_in = MethodBind.get("Curve3D", "set_point_in", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.Curve3D.mb_set_point_in, livePtr, idx, position)
  }

  /** Curve3D.get_point_in */
  final def getPointIn(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_get_point_in == null) gdext.classes.Curve3D.mb_get_point_in = MethodBind.get("Curve3D", "get_point_in", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_get_point_in, livePtr, idx)
  }

  /** Curve3D.set_point_out */
  final def setPointOut(idx: Long, position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.Curve3D.mb_set_point_out == null) gdext.classes.Curve3D.mb_set_point_out = MethodBind.get("Curve3D", "set_point_out", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.Curve3D.mb_set_point_out, livePtr, idx, position)
  }

  /** Curve3D.get_point_out */
  final def getPointOut(idx: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_get_point_out == null) gdext.classes.Curve3D.mb_get_point_out = MethodBind.get("Curve3D", "get_point_out", 711720468L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_get_point_out, livePtr, idx)
  }

  /** Curve3D.remove_point */
  final def removePoint(idx: Long): Unit = {
    if (gdext.classes.Curve3D.mb_remove_point == null) gdext.classes.Curve3D.mb_remove_point = MethodBind.get("Curve3D", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve3D.mb_remove_point, livePtr, idx)
  }

  /** Curve3D.clear_points */
  final def clearPoints(): Unit = {
    if (gdext.classes.Curve3D.mb_clear_points == null) gdext.classes.Curve3D.mb_clear_points = MethodBind.get("Curve3D", "clear_points", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Curve3D.mb_clear_points, livePtr)
  }

  /** Curve3D.sample */
  final def sample(idx: Long, t: Double): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_sample == null) gdext.classes.Curve3D.mb_sample = MethodBind.get("Curve3D", "sample", 3285246857L)
    Ptrcall.call2[Long, Double, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_sample, livePtr, idx, t)
  }

  /** Curve3D.samplef */
  final def samplef(fofs: Double): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_samplef == null) gdext.classes.Curve3D.mb_samplef = MethodBind.get("Curve3D", "samplef", 2553580215L)
    Ptrcall.call1[Double, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_samplef, livePtr, fofs)
  }

  /** Curve3D.set_closed */
  final def setClosed(closed: Boolean): Unit = {
    if (gdext.classes.Curve3D.mb_set_closed == null) gdext.classes.Curve3D.mb_set_closed = MethodBind.get("Curve3D", "set_closed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Curve3D.mb_set_closed, livePtr, closed)
  }

  /** Curve3D.is_closed */
  final def isClosed(): Boolean = {
    if (gdext.classes.Curve3D.mb_is_closed == null) gdext.classes.Curve3D.mb_is_closed = MethodBind.get("Curve3D", "is_closed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Curve3D.mb_is_closed, livePtr)
  }

  /** Curve3D.set_bake_interval */
  final def setBakeInterval(distance: Double): Unit = {
    if (gdext.classes.Curve3D.mb_set_bake_interval == null) gdext.classes.Curve3D.mb_set_bake_interval = MethodBind.get("Curve3D", "set_bake_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve3D.mb_set_bake_interval, livePtr, distance)
  }

  /** Curve3D.get_bake_interval */
  final def getBakeInterval(): Double = {
    if (gdext.classes.Curve3D.mb_get_bake_interval == null) gdext.classes.Curve3D.mb_get_bake_interval = MethodBind.get("Curve3D", "get_bake_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve3D.mb_get_bake_interval, livePtr)
  }

  /** Curve3D.set_up_vector_enabled */
  final def setUpVectorEnabled(enable: Boolean): Unit = {
    if (gdext.classes.Curve3D.mb_set_up_vector_enabled == null) gdext.classes.Curve3D.mb_set_up_vector_enabled = MethodBind.get("Curve3D", "set_up_vector_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Curve3D.mb_set_up_vector_enabled, livePtr, enable)
  }

  /** Curve3D.is_up_vector_enabled */
  final def isUpVectorEnabled(): Boolean = {
    if (gdext.classes.Curve3D.mb_is_up_vector_enabled == null) gdext.classes.Curve3D.mb_is_up_vector_enabled = MethodBind.get("Curve3D", "is_up_vector_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Curve3D.mb_is_up_vector_enabled, livePtr)
  }

  /** Curve3D.get_baked_length */
  final def getBakedLength(): Double = {
    if (gdext.classes.Curve3D.mb_get_baked_length == null) gdext.classes.Curve3D.mb_get_baked_length = MethodBind.get("Curve3D", "get_baked_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve3D.mb_get_baked_length, livePtr)
  }

  /** Curve3D.sample_baked */
  final def sampleBaked(offset: Double, cubic: Boolean): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_sample_baked == null) gdext.classes.Curve3D.mb_sample_baked = MethodBind.get("Curve3D", "sample_baked", 1350085894L)
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_sample_baked, livePtr, offset, cubic)
  }

  /** Curve3D.sample_baked_with_rotation */
  final def sampleBakedWithRotation(offset: Double, cubic: Boolean, apply_tilt: Boolean): gdext.builtin.Transform3D = {
    if (gdext.classes.Curve3D.mb_sample_baked_with_rotation == null) gdext.classes.Curve3D.mb_sample_baked_with_rotation = MethodBind.get("Curve3D", "sample_baked_with_rotation", 1939359131L)
    Ptrcall.call3[Double, Boolean, Boolean, gdext.builtin.Transform3D](gdext.classes.Curve3D.mb_sample_baked_with_rotation, livePtr, offset, cubic, apply_tilt)
  }

  /** Curve3D.sample_baked_up_vector */
  final def sampleBakedUpVector(offset: Double, apply_tilt: Boolean): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_sample_baked_up_vector == null) gdext.classes.Curve3D.mb_sample_baked_up_vector = MethodBind.get("Curve3D", "sample_baked_up_vector", 1362627031L)
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_sample_baked_up_vector, livePtr, offset, apply_tilt)
  }

  /** Curve3D.get_closest_point */
  final def getClosestPoint(to_point: gdext.builtin.Vector3): gdext.builtin.Vector3 = {
    if (gdext.classes.Curve3D.mb_get_closest_point == null) gdext.classes.Curve3D.mb_get_closest_point = MethodBind.get("Curve3D", "get_closest_point", 192990374L)
    Ptrcall.call1[gdext.builtin.Vector3, gdext.builtin.Vector3](gdext.classes.Curve3D.mb_get_closest_point, livePtr, to_point)
  }

  /** Curve3D.get_closest_offset */
  final def getClosestOffset(to_point: gdext.builtin.Vector3): Double = {
    if (gdext.classes.Curve3D.mb_get_closest_offset == null) gdext.classes.Curve3D.mb_get_closest_offset = MethodBind.get("Curve3D", "get_closest_offset", 1109078154L)
    Ptrcall.call1[gdext.builtin.Vector3, Double](gdext.classes.Curve3D.mb_get_closest_offset, livePtr, to_point)
  }

}

object Curve3D {
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_samplef: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_up_vector_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_up_vector_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_baked_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked_with_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked_up_vector: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_offset: GDExtensionMethodBindPtr = null
}
