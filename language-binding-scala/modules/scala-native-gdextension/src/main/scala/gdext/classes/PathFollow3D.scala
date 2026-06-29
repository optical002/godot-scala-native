package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PathFollow3D`, extends `Node3D`. */
abstract class PathFollow3D extends Node3D {
  override def godotClassName: String = "PathFollow3D"

  /** PathFollow3D.set_progress */
  final def setProgress(progress: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_progress", 373806689L), hostObject.objectPtr, progress)

  /** PathFollow3D.get_progress */
  final def getProgress(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow3D", "get_progress", 1740695150L), hostObject.objectPtr)

  /** PathFollow3D.set_h_offset */
  final def setHOffset(h_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_h_offset", 373806689L), hostObject.objectPtr, h_offset)

  /** PathFollow3D.get_h_offset */
  final def getHOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow3D", "get_h_offset", 1740695150L), hostObject.objectPtr)

  /** PathFollow3D.set_v_offset */
  final def setVOffset(v_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_v_offset", 373806689L), hostObject.objectPtr, v_offset)

  /** PathFollow3D.get_v_offset */
  final def getVOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow3D", "get_v_offset", 1740695150L), hostObject.objectPtr)

  /** PathFollow3D.set_progress_ratio */
  final def setProgressRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_progress_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** PathFollow3D.get_progress_ratio */
  final def getProgressRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("PathFollow3D", "get_progress_ratio", 1740695150L), hostObject.objectPtr)

  /** PathFollow3D.set_rotation_mode */
  final def setRotationMode(rotation_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_rotation_mode", 1640311967L), hostObject.objectPtr, rotation_mode)

  /** PathFollow3D.get_rotation_mode */
  final def getRotationMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("PathFollow3D", "get_rotation_mode", 3814010545L), hostObject.objectPtr)

  /** PathFollow3D.set_cubic_interpolation */
  final def setCubicInterpolation(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_cubic_interpolation", 2586408642L), hostObject.objectPtr, enabled)

  /** PathFollow3D.get_cubic_interpolation */
  final def getCubicInterpolation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow3D", "get_cubic_interpolation", 36873697L), hostObject.objectPtr)

  /** PathFollow3D.set_use_model_front */
  final def setUseModelFront(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_use_model_front", 2586408642L), hostObject.objectPtr, enabled)

  /** PathFollow3D.is_using_model_front */
  final def isUsingModelFront(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow3D", "is_using_model_front", 36873697L), hostObject.objectPtr)

  /** PathFollow3D.set_loop */
  final def setLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_loop", 2586408642L), hostObject.objectPtr, loop)

  /** PathFollow3D.has_loop */
  final def hasLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow3D", "has_loop", 36873697L), hostObject.objectPtr)

  /** PathFollow3D.set_tilt_enabled */
  final def setTiltEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PathFollow3D", "set_tilt_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** PathFollow3D.is_tilt_enabled */
  final def isTiltEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PathFollow3D", "is_tilt_enabled", 36873697L), hostObject.objectPtr)

}
