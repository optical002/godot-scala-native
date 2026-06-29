package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PathFollow2D`, extends `Node2D`. */
abstract class PathFollow2D extends Node2D {
  override def godotClassName: String = "PathFollow2D"

  /** PathFollow2D.set_progress */
  final def setProgress(progress: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_progress", 373806689L), hostObject.objectPtr, progress)

  /** PathFollow2D.get_progress */
  final def getProgress(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow2D", "get_progress", 1740695150L), hostObject.objectPtr)

  /** PathFollow2D.set_h_offset */
  final def setHOffset(h_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_h_offset", 373806689L), hostObject.objectPtr, h_offset)

  /** PathFollow2D.get_h_offset */
  final def getHOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow2D", "get_h_offset", 1740695150L), hostObject.objectPtr)

  /** PathFollow2D.set_v_offset */
  final def setVOffset(v_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_v_offset", 373806689L), hostObject.objectPtr, v_offset)

  /** PathFollow2D.get_v_offset */
  final def getVOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow2D", "get_v_offset", 1740695150L), hostObject.objectPtr)

  /** PathFollow2D.set_progress_ratio */
  final def setProgressRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_progress_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** PathFollow2D.get_progress_ratio */
  final def getProgressRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow2D", "get_progress_ratio", 1740695150L), hostObject.objectPtr)

  /** PathFollow2D.set_rotates */
  final def setRotates(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_rotates", 2586408642L), hostObject.objectPtr, enabled)

  /** PathFollow2D.is_rotating */
  final def isRotating(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow2D", "is_rotating", 36873697L), hostObject.objectPtr)

  /** PathFollow2D.set_cubic_interpolation */
  final def setCubicInterpolation(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_cubic_interpolation", 2586408642L), hostObject.objectPtr, enabled)

  /** PathFollow2D.get_cubic_interpolation */
  final def getCubicInterpolation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow2D", "get_cubic_interpolation", 36873697L), hostObject.objectPtr)

  /** PathFollow2D.set_loop */
  final def setLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow2D", "set_loop", 2586408642L), hostObject.objectPtr, loop)

  /** PathFollow2D.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow2D", "has_loop", 36873697L), hostObject.objectPtr)

}
