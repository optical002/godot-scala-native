package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Gradient`, extends `Resource`. */
abstract class Gradient extends Resource {
  override def godotClassName: String = "Gradient"

  /** Gradient.add_point */
  final def addPoint(offset: Double, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Gradient.mb_add_point == null) gdext.classes.Gradient.mb_add_point = MethodBind.get("Gradient", "add_point", 3629403827L)
    Ptrcall.callVoid2(gdext.classes.Gradient.mb_add_point, livePtr, offset, color)
  }

  /** Gradient.remove_point */
  final def removePoint(point: Long): Unit = {
    if (gdext.classes.Gradient.mb_remove_point == null) gdext.classes.Gradient.mb_remove_point = MethodBind.get("Gradient", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Gradient.mb_remove_point, livePtr, point)
  }

  /** Gradient.set_offset */
  final def setOffset(point: Long, offset: Double): Unit = {
    if (gdext.classes.Gradient.mb_set_offset == null) gdext.classes.Gradient.mb_set_offset = MethodBind.get("Gradient", "set_offset", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Gradient.mb_set_offset, livePtr, point, offset)
  }

  /** Gradient.get_offset */
  final def getOffset(point: Long): Double = {
    if (gdext.classes.Gradient.mb_get_offset == null) gdext.classes.Gradient.mb_get_offset = MethodBind.get("Gradient", "get_offset", 4025615559L)
    Ptrcall.call1[Long, Double](gdext.classes.Gradient.mb_get_offset, livePtr, point)
  }

  /** Gradient.reverse */
  final def reverse(): Unit = {
    if (gdext.classes.Gradient.mb_reverse == null) gdext.classes.Gradient.mb_reverse = MethodBind.get("Gradient", "reverse", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Gradient.mb_reverse, livePtr)
  }

  /** Gradient.set_color */
  final def setColor(point: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Gradient.mb_set_color == null) gdext.classes.Gradient.mb_set_color = MethodBind.get("Gradient", "set_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.Gradient.mb_set_color, livePtr, point, color)
  }

  /** Gradient.get_color */
  final def getColor(point: Long): gdext.builtin.Color = {
    if (gdext.classes.Gradient.mb_get_color == null) gdext.classes.Gradient.mb_get_color = MethodBind.get("Gradient", "get_color", 2624840992L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.Gradient.mb_get_color, livePtr, point)
  }

  /** Gradient.sample */
  final def sample(offset: Double): gdext.builtin.Color = {
    if (gdext.classes.Gradient.mb_sample == null) gdext.classes.Gradient.mb_sample = MethodBind.get("Gradient", "sample", 1250405064L)
    Ptrcall.call1[Double, gdext.builtin.Color](gdext.classes.Gradient.mb_sample, livePtr, offset)
  }

  /** Gradient.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.Gradient.mb_get_point_count == null) gdext.classes.Gradient.mb_get_point_count = MethodBind.get("Gradient", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Gradient.mb_get_point_count, livePtr)
  }

  /** Gradient.set_interpolation_mode */
  final def setInterpolationMode(interpolation_mode: Long): Unit = {
    if (gdext.classes.Gradient.mb_set_interpolation_mode == null) gdext.classes.Gradient.mb_set_interpolation_mode = MethodBind.get("Gradient", "set_interpolation_mode", 1971444490L)
    Ptrcall.callVoid1(gdext.classes.Gradient.mb_set_interpolation_mode, livePtr, interpolation_mode)
  }

  /** Gradient.get_interpolation_mode */
  final def getInterpolationMode(): Long = {
    if (gdext.classes.Gradient.mb_get_interpolation_mode == null) gdext.classes.Gradient.mb_get_interpolation_mode = MethodBind.get("Gradient", "get_interpolation_mode", 3674172981L)
    Ptrcall.call0[Long](gdext.classes.Gradient.mb_get_interpolation_mode, livePtr)
  }

  /** Gradient.set_interpolation_color_space */
  final def setInterpolationColorSpace(interpolation_color_space: Long): Unit = {
    if (gdext.classes.Gradient.mb_set_interpolation_color_space == null) gdext.classes.Gradient.mb_set_interpolation_color_space = MethodBind.get("Gradient", "set_interpolation_color_space", 3685995981L)
    Ptrcall.callVoid1(gdext.classes.Gradient.mb_set_interpolation_color_space, livePtr, interpolation_color_space)
  }

  /** Gradient.get_interpolation_color_space */
  final def getInterpolationColorSpace(): Long = {
    if (gdext.classes.Gradient.mb_get_interpolation_color_space == null) gdext.classes.Gradient.mb_get_interpolation_color_space = MethodBind.get("Gradient", "get_interpolation_color_space", 1538296000L)
    Ptrcall.call0[Long](gdext.classes.Gradient.mb_get_interpolation_color_space, livePtr)
  }

}

object Gradient {
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_reverse: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_sample: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interpolation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interpolation_color_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolation_color_space: GDExtensionMethodBindPtr = null
}
