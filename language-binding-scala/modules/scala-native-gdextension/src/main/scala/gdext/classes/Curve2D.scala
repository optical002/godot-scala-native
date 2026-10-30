package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Curve2D`, extends `Resource`. */
abstract class Curve2D extends Resource {
  override def godotClassName: String = "Curve2D"

  /** Curve2D.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.Curve2D.mb_get_point_count == null) gdext.classes.Curve2D.mb_get_point_count = MethodBind.get("Curve2D", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Curve2D.mb_get_point_count, livePtr)
  }

  /** Curve2D.set_point_count */
  final def setPointCount(count: Long): Unit = {
    if (gdext.classes.Curve2D.mb_set_point_count == null) gdext.classes.Curve2D.mb_set_point_count = MethodBind.get("Curve2D", "set_point_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve2D.mb_set_point_count, livePtr, count)
  }

  /** Curve2D.add_point */
  final def addPoint(position: gdext.builtin.Vector2, in: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f), out: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f), index: Long = -1L): Unit = {
    if (gdext.classes.Curve2D.mb_add_point == null) gdext.classes.Curve2D.mb_add_point = MethodBind.get("Curve2D", "add_point", 4175465202L)
    Ptrcall.callVoid4(gdext.classes.Curve2D.mb_add_point, livePtr, position, in, out, index)
  }

  /** Curve2D.set_point_position */
  final def setPointPosition(idx: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Curve2D.mb_set_point_position == null) gdext.classes.Curve2D.mb_set_point_position = MethodBind.get("Curve2D", "set_point_position", 163021252L)
    Ptrcall.callVoid2(gdext.classes.Curve2D.mb_set_point_position, livePtr, idx, position)
  }

  /** Curve2D.get_point_position */
  final def getPointPosition(idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_get_point_position == null) gdext.classes.Curve2D.mb_get_point_position = MethodBind.get("Curve2D", "get_point_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_get_point_position, livePtr, idx)
  }

  /** Curve2D.set_point_in */
  final def setPointIn(idx: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Curve2D.mb_set_point_in == null) gdext.classes.Curve2D.mb_set_point_in = MethodBind.get("Curve2D", "set_point_in", 163021252L)
    Ptrcall.callVoid2(gdext.classes.Curve2D.mb_set_point_in, livePtr, idx, position)
  }

  /** Curve2D.get_point_in */
  final def getPointIn(idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_get_point_in == null) gdext.classes.Curve2D.mb_get_point_in = MethodBind.get("Curve2D", "get_point_in", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_get_point_in, livePtr, idx)
  }

  /** Curve2D.set_point_out */
  final def setPointOut(idx: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Curve2D.mb_set_point_out == null) gdext.classes.Curve2D.mb_set_point_out = MethodBind.get("Curve2D", "set_point_out", 163021252L)
    Ptrcall.callVoid2(gdext.classes.Curve2D.mb_set_point_out, livePtr, idx, position)
  }

  /** Curve2D.get_point_out */
  final def getPointOut(idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_get_point_out == null) gdext.classes.Curve2D.mb_get_point_out = MethodBind.get("Curve2D", "get_point_out", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_get_point_out, livePtr, idx)
  }

  /** Curve2D.remove_point */
  final def removePoint(idx: Long): Unit = {
    if (gdext.classes.Curve2D.mb_remove_point == null) gdext.classes.Curve2D.mb_remove_point = MethodBind.get("Curve2D", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve2D.mb_remove_point, livePtr, idx)
  }

  /** Curve2D.clear_points */
  final def clearPoints(): Unit = {
    if (gdext.classes.Curve2D.mb_clear_points == null) gdext.classes.Curve2D.mb_clear_points = MethodBind.get("Curve2D", "clear_points", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Curve2D.mb_clear_points, livePtr)
  }

  /** Curve2D.sample */
  final def sample(idx: Long, t: Double): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_sample == null) gdext.classes.Curve2D.mb_sample = MethodBind.get("Curve2D", "sample", 26514310L)
    Ptrcall.call2[Long, Double, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_sample, livePtr, idx, t)
  }

  /** Curve2D.samplef */
  final def samplef(fofs: Double): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_samplef == null) gdext.classes.Curve2D.mb_samplef = MethodBind.get("Curve2D", "samplef", 3588506812L)
    Ptrcall.call1[Double, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_samplef, livePtr, fofs)
  }

  /** Curve2D.set_bake_interval */
  final def setBakeInterval(distance: Double): Unit = {
    if (gdext.classes.Curve2D.mb_set_bake_interval == null) gdext.classes.Curve2D.mb_set_bake_interval = MethodBind.get("Curve2D", "set_bake_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve2D.mb_set_bake_interval, livePtr, distance)
  }

  /** Curve2D.get_bake_interval */
  final def getBakeInterval(): Double = {
    if (gdext.classes.Curve2D.mb_get_bake_interval == null) gdext.classes.Curve2D.mb_get_bake_interval = MethodBind.get("Curve2D", "get_bake_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve2D.mb_get_bake_interval, livePtr)
  }

  /** Curve2D.get_baked_length */
  final def getBakedLength(): Double = {
    if (gdext.classes.Curve2D.mb_get_baked_length == null) gdext.classes.Curve2D.mb_get_baked_length = MethodBind.get("Curve2D", "get_baked_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve2D.mb_get_baked_length, livePtr)
  }

  /** Curve2D.sample_baked */
  final def sampleBaked(offset: Double = 0.0, cubic: Boolean = false): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_sample_baked == null) gdext.classes.Curve2D.mb_sample_baked = MethodBind.get("Curve2D", "sample_baked", 3464257706L)
    Ptrcall.call2[Double, Boolean, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_sample_baked, livePtr, offset, cubic)
  }

  /** Curve2D.sample_baked_with_rotation */
  final def sampleBakedWithRotation(offset: Double = 0.0, cubic: Boolean = false): gdext.builtin.Transform2D = {
    if (gdext.classes.Curve2D.mb_sample_baked_with_rotation == null) gdext.classes.Curve2D.mb_sample_baked_with_rotation = MethodBind.get("Curve2D", "sample_baked_with_rotation", 3296056341L)
    Ptrcall.call2[Double, Boolean, gdext.builtin.Transform2D](gdext.classes.Curve2D.mb_sample_baked_with_rotation, livePtr, offset, cubic)
  }

  /** Curve2D.get_closest_point */
  final def getClosestPoint(toPoint: gdext.builtin.Vector2): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve2D.mb_get_closest_point == null) gdext.classes.Curve2D.mb_get_closest_point = MethodBind.get("Curve2D", "get_closest_point", 2656412154L)
    Ptrcall.call1[gdext.builtin.Vector2, gdext.builtin.Vector2](gdext.classes.Curve2D.mb_get_closest_point, livePtr, toPoint)
  }

  /** Curve2D.get_closest_offset */
  final def getClosestOffset(toPoint: gdext.builtin.Vector2): Double = {
    if (gdext.classes.Curve2D.mb_get_closest_offset == null) gdext.classes.Curve2D.mb_get_closest_offset = MethodBind.get("Curve2D", "get_closest_offset", 2276447920L)
    Ptrcall.call1[gdext.builtin.Vector2, Double](gdext.classes.Curve2D.mb_get_closest_offset, livePtr, toPoint)
  }

}

object Curve2D {
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_samplef: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_baked_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked_with_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_closest_offset: GDExtensionMethodBindPtr = null
}
