package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Line2D`, extends `Node2D`. */
abstract class Line2D extends Node2D {

  /** Line2D.set_point_position */
  final def setPointPosition(index: Long, position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("Line2D", "set_point_position", 163021252L), hostObject.objectPtr, index, position)

  /** Line2D.get_point_position */
  final def getPointPosition(index: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("Line2D", "get_point_position", 2299179447L), hostObject.objectPtr, index)

  /** Line2D.get_point_count */
  final def getPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_point_count", 3905245786L), hostObject.objectPtr)

  /** Line2D.add_point */
  final def addPoint(position: gdext.builtin.Vector2, index: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Line2D", "add_point", 2654014372L), hostObject.objectPtr, position, index)

  /** Line2D.remove_point */
  final def removePoint(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "remove_point", 1286410249L), hostObject.objectPtr, index)

  /** Line2D.clear_points */
  final def clearPoints(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Line2D", "clear_points", 3218959716L), hostObject.objectPtr)

  /** Line2D.set_closed */
  final def setClosed(closed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_closed", 2586408642L), hostObject.objectPtr, closed)

  /** Line2D.is_closed */
  final def isClosed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Line2D", "is_closed", 36873697L), hostObject.objectPtr)

  /** Line2D.set_width */
  final def setWidth(width: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_width", 373806689L), hostObject.objectPtr, width)

  /** Line2D.get_width */
  final def getWidth(): Double =
    Ptrcall.call0[Double](MethodBind.get("Line2D", "get_width", 1740695150L), hostObject.objectPtr)

  /** Line2D.set_curve */
  final def setCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** Line2D.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Line2D", "get_curve", 2460114913L), hostObject.objectPtr)

  /** Line2D.set_default_color */
  final def setDefaultColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_default_color", 2920490490L), hostObject.objectPtr, color)

  /** Line2D.get_default_color */
  final def getDefaultColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Line2D", "get_default_color", 3444240500L), hostObject.objectPtr)

  /** Line2D.set_gradient */
  final def setGradient(color: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_gradient", 2756054477L), hostObject.objectPtr, color.hostObject)

  /** Line2D.get_gradient */
  final def getGradient(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Line2D", "get_gradient", 132272999L), hostObject.objectPtr)

  /** Line2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Line2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Line2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** Line2D.set_texture_mode */
  final def setTextureMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_texture_mode", 1952559516L), hostObject.objectPtr, mode)

  /** Line2D.get_texture_mode */
  final def getTextureMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_texture_mode", 2341040722L), hostObject.objectPtr)

  /** Line2D.set_joint_mode */
  final def setJointMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_joint_mode", 604292979L), hostObject.objectPtr, mode)

  /** Line2D.get_joint_mode */
  final def getJointMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_joint_mode", 2546544037L), hostObject.objectPtr)

  /** Line2D.set_begin_cap_mode */
  final def setBeginCapMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_begin_cap_mode", 1669024546L), hostObject.objectPtr, mode)

  /** Line2D.get_begin_cap_mode */
  final def getBeginCapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_begin_cap_mode", 1107511441L), hostObject.objectPtr)

  /** Line2D.set_end_cap_mode */
  final def setEndCapMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_end_cap_mode", 1669024546L), hostObject.objectPtr, mode)

  /** Line2D.get_end_cap_mode */
  final def getEndCapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_end_cap_mode", 1107511441L), hostObject.objectPtr)

  /** Line2D.set_sharp_limit */
  final def setSharpLimit(limit: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_sharp_limit", 373806689L), hostObject.objectPtr, limit)

  /** Line2D.get_sharp_limit */
  final def getSharpLimit(): Double =
    Ptrcall.call0[Double](MethodBind.get("Line2D", "get_sharp_limit", 1740695150L), hostObject.objectPtr)

  /** Line2D.set_round_precision */
  final def setRoundPrecision(precision: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_round_precision", 1286410249L), hostObject.objectPtr, precision)

  /** Line2D.get_round_precision */
  final def getRoundPrecision(): Long =
    Ptrcall.call0[Long](MethodBind.get("Line2D", "get_round_precision", 3905245786L), hostObject.objectPtr)

  /** Line2D.set_antialiased */
  final def setAntialiased(antialiased: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Line2D", "set_antialiased", 2586408642L), hostObject.objectPtr, antialiased)

  /** Line2D.get_antialiased */
  final def getAntialiased(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Line2D", "get_antialiased", 36873697L), hostObject.objectPtr)

}

object Line2D {
  /** Class metadata for Gd[Line2D] lifetime management and casting. */
  given GodotClass[Line2D] with {
    def className = "Line2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Line2D = new Line2D {}.withHost(o.objectPtr)
    def unwrap(t: Line2D): GodotObject = t.hostObject
  }
}
