package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Line2D`, extends `Node2D`. */
abstract class Line2D extends Node2D {
  override def godotClassName: String = "Line2D"

  /** Line2D.set_point_position */
  final def setPointPosition(index: Long, position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.Line2D.mb_set_point_position == null) gdext.classes.Line2D.mb_set_point_position = MethodBind.get("Line2D", "set_point_position", 163021252L)
    Ptrcall.callVoid2(gdext.classes.Line2D.mb_set_point_position, livePtr, index, position)
  }

  /** Line2D.get_point_position */
  final def getPointPosition(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Line2D.mb_get_point_position == null) gdext.classes.Line2D.mb_get_point_position = MethodBind.get("Line2D", "get_point_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.Line2D.mb_get_point_position, livePtr, index)
  }

  /** Line2D.get_point_count */
  final def getPointCount(): Long = {
    if (gdext.classes.Line2D.mb_get_point_count == null) gdext.classes.Line2D.mb_get_point_count = MethodBind.get("Line2D", "get_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_point_count, livePtr)
  }

  /** Line2D.add_point */
  final def addPoint(position: gdext.builtin.Vector2, index: Long): Unit = {
    if (gdext.classes.Line2D.mb_add_point == null) gdext.classes.Line2D.mb_add_point = MethodBind.get("Line2D", "add_point", 2654014372L)
    Ptrcall.callVoid2(gdext.classes.Line2D.mb_add_point, livePtr, position, index)
  }

  /** Line2D.remove_point */
  final def removePoint(index: Long): Unit = {
    if (gdext.classes.Line2D.mb_remove_point == null) gdext.classes.Line2D.mb_remove_point = MethodBind.get("Line2D", "remove_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_remove_point, livePtr, index)
  }

  /** Line2D.clear_points */
  final def clearPoints(): Unit = {
    if (gdext.classes.Line2D.mb_clear_points == null) gdext.classes.Line2D.mb_clear_points = MethodBind.get("Line2D", "clear_points", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Line2D.mb_clear_points, livePtr)
  }

  /** Line2D.set_closed */
  final def setClosed(closed: Boolean): Unit = {
    if (gdext.classes.Line2D.mb_set_closed == null) gdext.classes.Line2D.mb_set_closed = MethodBind.get("Line2D", "set_closed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_closed, livePtr, closed)
  }

  /** Line2D.is_closed */
  final def isClosed(): Boolean = {
    if (gdext.classes.Line2D.mb_is_closed == null) gdext.classes.Line2D.mb_is_closed = MethodBind.get("Line2D", "is_closed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Line2D.mb_is_closed, livePtr)
  }

  /** Line2D.set_width */
  final def setWidth(width: Double): Unit = {
    if (gdext.classes.Line2D.mb_set_width == null) gdext.classes.Line2D.mb_set_width = MethodBind.get("Line2D", "set_width", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_width, livePtr, width)
  }

  /** Line2D.get_width */
  final def getWidth(): Double = {
    if (gdext.classes.Line2D.mb_get_width == null) gdext.classes.Line2D.mb_get_width = MethodBind.get("Line2D", "get_width", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Line2D.mb_get_width, livePtr)
  }

  /** Line2D.set_curve */
  final def setCurve(curve: Curve): Unit = {
    if (gdext.classes.Line2D.mb_set_curve == null) gdext.classes.Line2D.mb_set_curve = MethodBind.get("Line2D", "set_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** Line2D.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve = {
    if (gdext.classes.Line2D.mb_get_curve == null) gdext.classes.Line2D.mb_get_curve = MethodBind.get("Line2D", "get_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_curve, livePtr))
  }

  /** Line2D.set_default_color */
  final def setDefaultColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Line2D.mb_set_default_color == null) gdext.classes.Line2D.mb_set_default_color = MethodBind.get("Line2D", "set_default_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_default_color, livePtr, color)
  }

  /** Line2D.get_default_color */
  final def getDefaultColor(): gdext.builtin.Color = {
    if (gdext.classes.Line2D.mb_get_default_color == null) gdext.classes.Line2D.mb_get_default_color = MethodBind.get("Line2D", "get_default_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.Line2D.mb_get_default_color, livePtr)
  }

  /** Line2D.set_gradient */
  final def setGradient(color: Gradient): Unit = {
    if (gdext.classes.Line2D.mb_set_gradient == null) gdext.classes.Line2D.mb_set_gradient = MethodBind.get("Line2D", "set_gradient", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_gradient, livePtr, Wrappers.handle(color))
  }

  /** Line2D.get_gradient. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGradient(): Gradient = {
    if (gdext.classes.Line2D.mb_get_gradient == null) gdext.classes.Line2D.mb_get_gradient = MethodBind.get("Line2D", "get_gradient", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_gradient, livePtr))
  }

  /** Line2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.Line2D.mb_set_texture == null) gdext.classes.Line2D.mb_set_texture = MethodBind.get("Line2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** Line2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.Line2D.mb_get_texture == null) gdext.classes.Line2D.mb_get_texture = MethodBind.get("Line2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_texture, livePtr))
  }

  /** Line2D.set_texture_mode */
  final def setTextureMode(mode: Long): Unit = {
    if (gdext.classes.Line2D.mb_set_texture_mode == null) gdext.classes.Line2D.mb_set_texture_mode = MethodBind.get("Line2D", "set_texture_mode", 1952559516L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_texture_mode, livePtr, mode)
  }

  /** Line2D.get_texture_mode */
  final def getTextureMode(): Long = {
    if (gdext.classes.Line2D.mb_get_texture_mode == null) gdext.classes.Line2D.mb_get_texture_mode = MethodBind.get("Line2D", "get_texture_mode", 2341040722L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_texture_mode, livePtr)
  }

  /** Line2D.set_joint_mode */
  final def setJointMode(mode: Long): Unit = {
    if (gdext.classes.Line2D.mb_set_joint_mode == null) gdext.classes.Line2D.mb_set_joint_mode = MethodBind.get("Line2D", "set_joint_mode", 604292979L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_joint_mode, livePtr, mode)
  }

  /** Line2D.get_joint_mode */
  final def getJointMode(): Long = {
    if (gdext.classes.Line2D.mb_get_joint_mode == null) gdext.classes.Line2D.mb_get_joint_mode = MethodBind.get("Line2D", "get_joint_mode", 2546544037L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_joint_mode, livePtr)
  }

  /** Line2D.set_begin_cap_mode */
  final def setBeginCapMode(mode: Long): Unit = {
    if (gdext.classes.Line2D.mb_set_begin_cap_mode == null) gdext.classes.Line2D.mb_set_begin_cap_mode = MethodBind.get("Line2D", "set_begin_cap_mode", 1669024546L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_begin_cap_mode, livePtr, mode)
  }

  /** Line2D.get_begin_cap_mode */
  final def getBeginCapMode(): Long = {
    if (gdext.classes.Line2D.mb_get_begin_cap_mode == null) gdext.classes.Line2D.mb_get_begin_cap_mode = MethodBind.get("Line2D", "get_begin_cap_mode", 1107511441L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_begin_cap_mode, livePtr)
  }

  /** Line2D.set_end_cap_mode */
  final def setEndCapMode(mode: Long): Unit = {
    if (gdext.classes.Line2D.mb_set_end_cap_mode == null) gdext.classes.Line2D.mb_set_end_cap_mode = MethodBind.get("Line2D", "set_end_cap_mode", 1669024546L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_end_cap_mode, livePtr, mode)
  }

  /** Line2D.get_end_cap_mode */
  final def getEndCapMode(): Long = {
    if (gdext.classes.Line2D.mb_get_end_cap_mode == null) gdext.classes.Line2D.mb_get_end_cap_mode = MethodBind.get("Line2D", "get_end_cap_mode", 1107511441L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_end_cap_mode, livePtr)
  }

  /** Line2D.set_sharp_limit */
  final def setSharpLimit(limit: Double): Unit = {
    if (gdext.classes.Line2D.mb_set_sharp_limit == null) gdext.classes.Line2D.mb_set_sharp_limit = MethodBind.get("Line2D", "set_sharp_limit", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_sharp_limit, livePtr, limit)
  }

  /** Line2D.get_sharp_limit */
  final def getSharpLimit(): Double = {
    if (gdext.classes.Line2D.mb_get_sharp_limit == null) gdext.classes.Line2D.mb_get_sharp_limit = MethodBind.get("Line2D", "get_sharp_limit", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Line2D.mb_get_sharp_limit, livePtr)
  }

  /** Line2D.set_round_precision */
  final def setRoundPrecision(precision: Long): Unit = {
    if (gdext.classes.Line2D.mb_set_round_precision == null) gdext.classes.Line2D.mb_set_round_precision = MethodBind.get("Line2D", "set_round_precision", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_round_precision, livePtr, precision)
  }

  /** Line2D.get_round_precision */
  final def getRoundPrecision(): Long = {
    if (gdext.classes.Line2D.mb_get_round_precision == null) gdext.classes.Line2D.mb_get_round_precision = MethodBind.get("Line2D", "get_round_precision", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Line2D.mb_get_round_precision, livePtr)
  }

  /** Line2D.set_antialiased */
  final def setAntialiased(antialiased: Boolean): Unit = {
    if (gdext.classes.Line2D.mb_set_antialiased == null) gdext.classes.Line2D.mb_set_antialiased = MethodBind.get("Line2D", "set_antialiased", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Line2D.mb_set_antialiased, livePtr, antialiased)
  }

  /** Line2D.get_antialiased */
  final def getAntialiased(): Boolean = {
    if (gdext.classes.Line2D.mb_get_antialiased == null) gdext.classes.Line2D.mb_get_antialiased = MethodBind.get("Line2D", "get_antialiased", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Line2D.mb_get_antialiased, livePtr)
  }

}

object Line2D {
  private[classes] var mb_set_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_points: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gradient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_joint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_joint_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_begin_cap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_begin_cap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_cap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_cap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sharp_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sharp_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_round_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_round_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_antialiased: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_antialiased: GDExtensionMethodBindPtr = null
}
