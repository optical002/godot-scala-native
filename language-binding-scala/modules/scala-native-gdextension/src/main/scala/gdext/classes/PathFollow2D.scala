package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PathFollow2D`, extends `Node2D`. */
abstract class PathFollow2D extends Node2D {
  override def godotClassName: String = "PathFollow2D"

  /** PathFollow2D.set_progress */
  final def setProgress(progress: Double): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_progress == null) gdext.classes.PathFollow2D.mb_set_progress = MethodBind.get("PathFollow2D", "set_progress", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_progress, livePtr, progress)
  }

  /** PathFollow2D.get_progress */
  final def getProgress(): Double = {
    if (gdext.classes.PathFollow2D.mb_get_progress == null) gdext.classes.PathFollow2D.mb_get_progress = MethodBind.get("PathFollow2D", "get_progress", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow2D.mb_get_progress, livePtr)
  }

  /** PathFollow2D.set_h_offset */
  final def setHOffset(hOffset: Double): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_h_offset == null) gdext.classes.PathFollow2D.mb_set_h_offset = MethodBind.get("PathFollow2D", "set_h_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_h_offset, livePtr, hOffset)
  }

  /** PathFollow2D.get_h_offset */
  final def getHOffset(): Double = {
    if (gdext.classes.PathFollow2D.mb_get_h_offset == null) gdext.classes.PathFollow2D.mb_get_h_offset = MethodBind.get("PathFollow2D", "get_h_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow2D.mb_get_h_offset, livePtr)
  }

  /** PathFollow2D.set_v_offset */
  final def setVOffset(vOffset: Double): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_v_offset == null) gdext.classes.PathFollow2D.mb_set_v_offset = MethodBind.get("PathFollow2D", "set_v_offset", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_v_offset, livePtr, vOffset)
  }

  /** PathFollow2D.get_v_offset */
  final def getVOffset(): Double = {
    if (gdext.classes.PathFollow2D.mb_get_v_offset == null) gdext.classes.PathFollow2D.mb_get_v_offset = MethodBind.get("PathFollow2D", "get_v_offset", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow2D.mb_get_v_offset, livePtr)
  }

  /** PathFollow2D.set_progress_ratio */
  final def setProgressRatio(ratio: Double): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_progress_ratio == null) gdext.classes.PathFollow2D.mb_set_progress_ratio = MethodBind.get("PathFollow2D", "set_progress_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_progress_ratio, livePtr, ratio)
  }

  /** PathFollow2D.get_progress_ratio */
  final def getProgressRatio(): Double = {
    if (gdext.classes.PathFollow2D.mb_get_progress_ratio == null) gdext.classes.PathFollow2D.mb_get_progress_ratio = MethodBind.get("PathFollow2D", "get_progress_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PathFollow2D.mb_get_progress_ratio, livePtr)
  }

  /** PathFollow2D.set_rotates */
  final def setRotates(enabled: Boolean): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_rotates == null) gdext.classes.PathFollow2D.mb_set_rotates = MethodBind.get("PathFollow2D", "set_rotates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_rotates, livePtr, enabled)
  }

  /** PathFollow2D.is_rotating */
  final def isRotating(): Boolean = {
    if (gdext.classes.PathFollow2D.mb_is_rotating == null) gdext.classes.PathFollow2D.mb_is_rotating = MethodBind.get("PathFollow2D", "is_rotating", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow2D.mb_is_rotating, livePtr)
  }

  /** PathFollow2D.set_cubic_interpolation */
  final def setCubicInterpolation(enabled: Boolean): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_cubic_interpolation == null) gdext.classes.PathFollow2D.mb_set_cubic_interpolation = MethodBind.get("PathFollow2D", "set_cubic_interpolation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_cubic_interpolation, livePtr, enabled)
  }

  /** PathFollow2D.get_cubic_interpolation */
  final def getCubicInterpolation(): Boolean = {
    if (gdext.classes.PathFollow2D.mb_get_cubic_interpolation == null) gdext.classes.PathFollow2D.mb_get_cubic_interpolation = MethodBind.get("PathFollow2D", "get_cubic_interpolation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow2D.mb_get_cubic_interpolation, livePtr)
  }

  /** PathFollow2D.set_loop */
  final def setLoop(loop: Boolean): Unit = {
    if (gdext.classes.PathFollow2D.mb_set_loop == null) gdext.classes.PathFollow2D.mb_set_loop = MethodBind.get("PathFollow2D", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PathFollow2D.mb_set_loop, livePtr, loop)
  }

  /** PathFollow2D.has_loop */
  final def hasLoop(): Boolean = {
    if (gdext.classes.PathFollow2D.mb_has_loop == null) gdext.classes.PathFollow2D.mb_has_loop = MethodBind.get("PathFollow2D", "has_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PathFollow2D.mb_has_loop, livePtr)
  }

}

object PathFollow2D {
  private[classes] var mb_set_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_h_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_v_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_progress_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_progress_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotates: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rotating: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cubic_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cubic_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_loop: GDExtensionMethodBindPtr = null
}
