package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PathFollow3D`, extends `Node3D`. */
abstract class PathFollow3D extends Node3D {
  override def godotClassName: String = "PathFollow3D"

  /** PathFollow3D.set_progress */
  final def setProgress(progress: Double): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_progress == null) gdext.classes.PathFollow3D.mb_set_progress = MethodBind.get("PathFollow3D", "set_progress", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_progress, livePtr, progress)
  }

  /** PathFollow3D.get_progress */
  final def getProgress(): Double = {
    if (gdext.classes.PathFollow3D.mb_get_progress == null) gdext.classes.PathFollow3D.mb_get_progress = MethodBind.get("PathFollow3D", "get_progress", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow3D.mb_get_progress, livePtr)
  }

  /** PathFollow3D.set_h_offset */
  final def setHOffset(h_offset: Double): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_h_offset == null) gdext.classes.PathFollow3D.mb_set_h_offset = MethodBind.get("PathFollow3D", "set_h_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_h_offset, livePtr, h_offset)
  }

  /** PathFollow3D.get_h_offset */
  final def getHOffset(): Double = {
    if (gdext.classes.PathFollow3D.mb_get_h_offset == null) gdext.classes.PathFollow3D.mb_get_h_offset = MethodBind.get("PathFollow3D", "get_h_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow3D.mb_get_h_offset, livePtr)
  }

  /** PathFollow3D.set_v_offset */
  final def setVOffset(v_offset: Double): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_v_offset == null) gdext.classes.PathFollow3D.mb_set_v_offset = MethodBind.get("PathFollow3D", "set_v_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_v_offset, livePtr, v_offset)
  }

  /** PathFollow3D.get_v_offset */
  final def getVOffset(): Double = {
    if (gdext.classes.PathFollow3D.mb_get_v_offset == null) gdext.classes.PathFollow3D.mb_get_v_offset = MethodBind.get("PathFollow3D", "get_v_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow3D.mb_get_v_offset, livePtr)
  }

  /** PathFollow3D.set_progress_ratio */
  final def setProgressRatio(ratio: Double): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_progress_ratio == null) gdext.classes.PathFollow3D.mb_set_progress_ratio = MethodBind.get("PathFollow3D", "set_progress_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_progress_ratio, livePtr, ratio)
  }

  /** PathFollow3D.get_progress_ratio */
  final def getProgressRatio(): Double = {
    if (gdext.classes.PathFollow3D.mb_get_progress_ratio == null) gdext.classes.PathFollow3D.mb_get_progress_ratio = MethodBind.get("PathFollow3D", "get_progress_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow3D.mb_get_progress_ratio, livePtr)
  }

  /** PathFollow3D.set_rotation_mode */
  final def setRotationMode(rotation_mode: Long): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_rotation_mode == null) gdext.classes.PathFollow3D.mb_set_rotation_mode = MethodBind.get("PathFollow3D", "set_rotation_mode", 1640311967L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_rotation_mode, livePtr, rotation_mode)
  }

  /** PathFollow3D.get_rotation_mode */
  final def getRotationMode(): Long = {
    if (gdext.classes.PathFollow3D.mb_get_rotation_mode == null) gdext.classes.PathFollow3D.mb_get_rotation_mode = MethodBind.get("PathFollow3D", "get_rotation_mode", 3814010545L)
    Ptrcall.call0[Long](gdext.classes.PathFollow3D.mb_get_rotation_mode, livePtr)
  }

  /** PathFollow3D.set_cubic_interpolation */
  final def setCubicInterpolation(enabled: Boolean): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_cubic_interpolation == null) gdext.classes.PathFollow3D.mb_set_cubic_interpolation = MethodBind.get("PathFollow3D", "set_cubic_interpolation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_cubic_interpolation, livePtr, enabled)
  }

  /** PathFollow3D.get_cubic_interpolation */
  final def getCubicInterpolation(): Boolean = {
    if (gdext.classes.PathFollow3D.mb_get_cubic_interpolation == null) gdext.classes.PathFollow3D.mb_get_cubic_interpolation = MethodBind.get("PathFollow3D", "get_cubic_interpolation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow3D.mb_get_cubic_interpolation, livePtr)
  }

  /** PathFollow3D.set_use_model_front */
  final def setUseModelFront(enabled: Boolean): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_use_model_front == null) gdext.classes.PathFollow3D.mb_set_use_model_front = MethodBind.get("PathFollow3D", "set_use_model_front", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_use_model_front, livePtr, enabled)
  }

  /** PathFollow3D.is_using_model_front */
  final def isUsingModelFront(): Boolean = {
    if (gdext.classes.PathFollow3D.mb_is_using_model_front == null) gdext.classes.PathFollow3D.mb_is_using_model_front = MethodBind.get("PathFollow3D", "is_using_model_front", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow3D.mb_is_using_model_front, livePtr)
  }

  /** PathFollow3D.set_loop */
  final def setLoop(loop: Boolean): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_loop == null) gdext.classes.PathFollow3D.mb_set_loop = MethodBind.get("PathFollow3D", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_loop, livePtr, loop)
  }

  /** PathFollow3D.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.PathFollow3D.mb_has_loop == null) gdext.classes.PathFollow3D.mb_has_loop = MethodBind.get("PathFollow3D", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow3D.mb_has_loop, livePtr)
  }

  /** PathFollow3D.set_tilt_enabled */
  final def setTiltEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.PathFollow3D.mb_set_tilt_enabled == null) gdext.classes.PathFollow3D.mb_set_tilt_enabled = MethodBind.get("PathFollow3D", "set_tilt_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow3D.mb_set_tilt_enabled, livePtr, enabled)
  }

  /** PathFollow3D.is_tilt_enabled */
  final def isTiltEnabled(): Boolean = {
    if (gdext.classes.PathFollow3D.mb_is_tilt_enabled == null) gdext.classes.PathFollow3D.mb_is_tilt_enabled = MethodBind.get("PathFollow3D", "is_tilt_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow3D.mb_is_tilt_enabled, livePtr)
  }

}

object PathFollow3D {
  private[classes] var mb_set_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_progress_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rotation_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cubic_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cubic_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_model_front: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_model_front: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tilt_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_tilt_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_correct_posture: GDExtensionMethodBindPtr = null

  /** PathFollow3D.correct_posture */
  final def correctPosture(transform: gdext.builtin.Transform3D, rotation_mode: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.PathFollow3D.mb_correct_posture == null) gdext.classes.PathFollow3D.mb_correct_posture = MethodBind.get("PathFollow3D", "correct_posture", 2686588690L)
    Ptrcall.call2[gdext.builtin.Transform3D, Long, gdext.builtin.Transform3D](gdext.classes.PathFollow3D.mb_correct_posture, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], transform, rotation_mode)
  }
}
