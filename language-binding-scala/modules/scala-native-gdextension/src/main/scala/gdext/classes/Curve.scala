package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Curve`, extends `Resource`. */
abstract class Curve extends Resource {
  override def godotClassName: String = "Curve"

  /** Curve.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.Curve.mb_get_point_count == null) gdext.classes.Curve.mb_get_point_count = MethodBind.get("Curve", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Curve.mb_get_point_count, livePtr)
  }

  /** Curve.set_point_count */
  final def setPointCount(count: Long): Unit = {
    if (gdext.classes.Curve.mb_set_point_count == null) gdext.classes.Curve.mb_set_point_count = MethodBind.get("Curve", "set_point_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_point_count, livePtr, count)
  }

  /** Curve.add_point */
  final def addPoint(position: gdext.builtin.Vector2, leftTangent: Double = 0.0, rightTangent: Double = 0.0, leftMode: gdext.classes.Curve.TangentMode = gdext.classes.Curve.TangentMode(0L), rightMode: gdext.classes.Curve.TangentMode = gdext.classes.Curve.TangentMode(0L)): Long = {
    if (gdext.classes.Curve.mb_add_point == null) gdext.classes.Curve.mb_add_point = MethodBind.get("Curve", "add_point", 434072736L)
    Ptrcall.call5[gdext.builtin.Vector2, Double, Double, Long, Long, Long](gdext.classes.Curve.mb_add_point, livePtr, position, leftTangent, rightTangent, leftMode, rightMode)
  }

  /** Curve.remove_point */
  final def removePoint(index: Long): Unit = {
    if (gdext.classes.Curve.mb_remove_point == null) gdext.classes.Curve.mb_remove_point = MethodBind.get("Curve", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_remove_point, livePtr, index)
  }

  /** Curve.clear_points */
  final def clearPoints(): Unit = {
    if (gdext.classes.Curve.mb_clear_points == null) gdext.classes.Curve.mb_clear_points = MethodBind.get("Curve", "clear_points", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Curve.mb_clear_points, livePtr)
  }

  /** Curve.get_point_position */
  final def getPointPosition(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Curve.mb_get_point_position == null) gdext.classes.Curve.mb_get_point_position = MethodBind.get("Curve", "get_point_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Curve.mb_get_point_position, livePtr, index)
  }

  /** Curve.set_point_value */
  final def setPointValue(index: Long, y: Double): Unit = {
    if (gdext.classes.Curve.mb_set_point_value == null) gdext.classes.Curve.mb_set_point_value = MethodBind.get("Curve", "set_point_value", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Curve.mb_set_point_value, livePtr, index, y)
  }

  /** Curve.set_point_offset */
  final def setPointOffset(index: Long, offset: Double): Long = {
    if (gdext.classes.Curve.mb_set_point_offset == null) gdext.classes.Curve.mb_set_point_offset = MethodBind.get("Curve", "set_point_offset", 3780573764L)
    Ptrcall.call2[Long, Double, Long](gdext.classes.Curve.mb_set_point_offset, livePtr, index, offset)
  }

  /** Curve.sample */
  final def sample(offset: Double): Double = {
    if (gdext.classes.Curve.mb_sample == null) gdext.classes.Curve.mb_sample = MethodBind.get("Curve", "sample", 3919130443L)
    Ptrcall.call1[Double, Double](gdext.classes.Curve.mb_sample, livePtr, offset)
  }

  /** Curve.sample_baked */
  final def sampleBaked(offset: Double): Double = {
    if (gdext.classes.Curve.mb_sample_baked == null) gdext.classes.Curve.mb_sample_baked = MethodBind.get("Curve", "sample_baked", 3919130443L)
    Ptrcall.call1[Double, Double](gdext.classes.Curve.mb_sample_baked, livePtr, offset)
  }

  /** Curve.get_point_left_tangent */
  final def getPointLeftTangent(index: Long): Double = {
    if (gdext.classes.Curve.mb_get_point_left_tangent == null) gdext.classes.Curve.mb_get_point_left_tangent = MethodBind.get("Curve", "get_point_left_tangent", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.Curve.mb_get_point_left_tangent, livePtr, index)
  }

  /** Curve.get_point_right_tangent */
  final def getPointRightTangent(index: Long): Double = {
    if (gdext.classes.Curve.mb_get_point_right_tangent == null) gdext.classes.Curve.mb_get_point_right_tangent = MethodBind.get("Curve", "get_point_right_tangent", 2339986948L)
    Ptrcall.call1[Long, Double](gdext.classes.Curve.mb_get_point_right_tangent, livePtr, index)
  }

  /** Curve.get_point_left_mode */
  final def getPointLeftMode(index: Long): gdext.classes.Curve.TangentMode = {
    if (gdext.classes.Curve.mb_get_point_left_mode == null) gdext.classes.Curve.mb_get_point_left_mode = MethodBind.get("Curve", "get_point_left_mode", 426950354L)
    gdext.classes.Curve.TangentMode(Ptrcall.call1[Long, Long](gdext.classes.Curve.mb_get_point_left_mode, livePtr, index))
  }

  /** Curve.get_point_right_mode */
  final def getPointRightMode(index: Long): gdext.classes.Curve.TangentMode = {
    if (gdext.classes.Curve.mb_get_point_right_mode == null) gdext.classes.Curve.mb_get_point_right_mode = MethodBind.get("Curve", "get_point_right_mode", 426950354L)
    gdext.classes.Curve.TangentMode(Ptrcall.call1[Long, Long](gdext.classes.Curve.mb_get_point_right_mode, livePtr, index))
  }

  /** Curve.set_point_left_tangent */
  final def setPointLeftTangent(index: Long, tangent: Double): Unit = {
    if (gdext.classes.Curve.mb_set_point_left_tangent == null) gdext.classes.Curve.mb_set_point_left_tangent = MethodBind.get("Curve", "set_point_left_tangent", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Curve.mb_set_point_left_tangent, livePtr, index, tangent)
  }

  /** Curve.set_point_right_tangent */
  final def setPointRightTangent(index: Long, tangent: Double): Unit = {
    if (gdext.classes.Curve.mb_set_point_right_tangent == null) gdext.classes.Curve.mb_set_point_right_tangent = MethodBind.get("Curve", "set_point_right_tangent", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Curve.mb_set_point_right_tangent, livePtr, index, tangent)
  }

  /** Curve.set_point_left_mode */
  final def setPointLeftMode(index: Long, mode: gdext.classes.Curve.TangentMode): Unit = {
    if (gdext.classes.Curve.mb_set_point_left_mode == null) gdext.classes.Curve.mb_set_point_left_mode = MethodBind.get("Curve", "set_point_left_mode", 1217242874L)
    Ptrcall.callVoid2(gdext.classes.Curve.mb_set_point_left_mode, livePtr, index, mode)
  }

  /** Curve.set_point_right_mode */
  final def setPointRightMode(index: Long, mode: gdext.classes.Curve.TangentMode): Unit = {
    if (gdext.classes.Curve.mb_set_point_right_mode == null) gdext.classes.Curve.mb_set_point_right_mode = MethodBind.get("Curve", "set_point_right_mode", 1217242874L)
    Ptrcall.callVoid2(gdext.classes.Curve.mb_set_point_right_mode, livePtr, index, mode)
  }

  /** Curve.get_min_value */
  final def getMinValue(): Double = {
    if (gdext.classes.Curve.mb_get_min_value == null) gdext.classes.Curve.mb_get_min_value = MethodBind.get("Curve", "get_min_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_min_value, livePtr)
  }

  /** Curve.set_min_value */
  final def setMinValue(min: Double): Unit = {
    if (gdext.classes.Curve.mb_set_min_value == null) gdext.classes.Curve.mb_set_min_value = MethodBind.get("Curve", "set_min_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_min_value, livePtr, min)
  }

  /** Curve.get_max_value */
  final def getMaxValue(): Double = {
    if (gdext.classes.Curve.mb_get_max_value == null) gdext.classes.Curve.mb_get_max_value = MethodBind.get("Curve", "get_max_value", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_max_value, livePtr)
  }

  /** Curve.set_max_value */
  final def setMaxValue(max: Double): Unit = {
    if (gdext.classes.Curve.mb_set_max_value == null) gdext.classes.Curve.mb_set_max_value = MethodBind.get("Curve", "set_max_value", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_max_value, livePtr, max)
  }

  /** Curve.get_value_range */
  final def getValueRange(): Double = {
    if (gdext.classes.Curve.mb_get_value_range == null) gdext.classes.Curve.mb_get_value_range = MethodBind.get("Curve", "get_value_range", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_value_range, livePtr)
  }

  /** Curve.get_min_domain */
  final def getMinDomain(): Double = {
    if (gdext.classes.Curve.mb_get_min_domain == null) gdext.classes.Curve.mb_get_min_domain = MethodBind.get("Curve", "get_min_domain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_min_domain, livePtr)
  }

  /** Curve.set_min_domain */
  final def setMinDomain(min: Double): Unit = {
    if (gdext.classes.Curve.mb_set_min_domain == null) gdext.classes.Curve.mb_set_min_domain = MethodBind.get("Curve", "set_min_domain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_min_domain, livePtr, min)
  }

  /** Curve.get_max_domain */
  final def getMaxDomain(): Double = {
    if (gdext.classes.Curve.mb_get_max_domain == null) gdext.classes.Curve.mb_get_max_domain = MethodBind.get("Curve", "get_max_domain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_max_domain, livePtr)
  }

  /** Curve.set_max_domain */
  final def setMaxDomain(max: Double): Unit = {
    if (gdext.classes.Curve.mb_set_max_domain == null) gdext.classes.Curve.mb_set_max_domain = MethodBind.get("Curve", "set_max_domain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_max_domain, livePtr, max)
  }

  /** Curve.get_domain_range */
  final def getDomainRange(): Double = {
    if (gdext.classes.Curve.mb_get_domain_range == null) gdext.classes.Curve.mb_get_domain_range = MethodBind.get("Curve", "get_domain_range", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Curve.mb_get_domain_range, livePtr)
  }

  /** Curve.clean_dupes */
  final def cleanDupes(): Unit = {
    if (gdext.classes.Curve.mb_clean_dupes == null) gdext.classes.Curve.mb_clean_dupes = MethodBind.get("Curve", "clean_dupes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Curve.mb_clean_dupes, livePtr)
  }

  /** Curve.bake */
  final def bake(): Unit = {
    if (gdext.classes.Curve.mb_bake == null) gdext.classes.Curve.mb_bake = MethodBind.get("Curve", "bake", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Curve.mb_bake, livePtr)
  }

  /** Curve.get_bake_resolution */
  final def getBakeResolution(): Long = {
    if (gdext.classes.Curve.mb_get_bake_resolution == null) gdext.classes.Curve.mb_get_bake_resolution = MethodBind.get("Curve", "get_bake_resolution", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Curve.mb_get_bake_resolution, livePtr)
  }

  /** Curve.set_bake_resolution */
  final def setBakeResolution(resolution: Long): Unit = {
    if (gdext.classes.Curve.mb_set_bake_resolution == null) gdext.classes.Curve.mb_set_bake_resolution = MethodBind.get("Curve", "set_bake_resolution", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Curve.mb_set_bake_resolution, livePtr, resolution)
  }

}

object Curve {
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample_baked: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_left_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_right_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_left_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_right_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_left_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_right_tangent: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_left_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_point_right_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_value_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_domain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_domain_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_clean_dupes: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bake_resolution: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bake_resolution: GDExtensionMethodBindPtr = null

  /** Godot enum `Curve.TangentMode`. */
  opaque type TangentMode <: Long = Long

  object TangentMode {
    final val Free: TangentMode = 0L.asInstanceOf[TangentMode]
    final val Linear: TangentMode = 1L.asInstanceOf[TangentMode]
    final val ModeCount: TangentMode = 2L.asInstanceOf[TangentMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TangentMode = value.asInstanceOf[TangentMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TangentMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TangentMode]]

    extension (self: TangentMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Free"
        case 1L => "Linear"
        case 2L => "ModeCount"
        case other => other.toString
      }
  }
}
