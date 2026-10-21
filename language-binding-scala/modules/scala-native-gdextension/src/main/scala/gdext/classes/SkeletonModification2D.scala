package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModification2D`, extends `Resource`. */
abstract class SkeletonModification2D extends Resource {
  override def godotClassName: String = "SkeletonModification2D"

  /** SkeletonModification2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2D.mb_set_enabled == null) gdext.classes.SkeletonModification2D.mb_set_enabled = MethodBind.get("SkeletonModification2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2D.mb_set_enabled, livePtr, enabled)
  }

  /** SkeletonModification2D.get_enabled */
  final def getEnabled(): Boolean = {
    if (gdext.classes.SkeletonModification2D.mb_get_enabled == null) gdext.classes.SkeletonModification2D.mb_get_enabled = MethodBind.get("SkeletonModification2D", "get_enabled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2D.mb_get_enabled, livePtr)
  }

  /** SkeletonModification2D.get_modification_stack. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getModificationStack(): SkeletonModificationStack2D = {
    if (gdext.classes.SkeletonModification2D.mb_get_modification_stack == null) gdext.classes.SkeletonModification2D.mb_get_modification_stack = MethodBind.get("SkeletonModification2D", "get_modification_stack", 2137761694L)
    Wrappers.owned[SkeletonModificationStack2D](Ptrcall.call0[Long](gdext.classes.SkeletonModification2D.mb_get_modification_stack, livePtr))
  }

  /** SkeletonModification2D.set_is_setup */
  final def setIsSetup(is_setup: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2D.mb_set_is_setup == null) gdext.classes.SkeletonModification2D.mb_set_is_setup = MethodBind.get("SkeletonModification2D", "set_is_setup", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2D.mb_set_is_setup, livePtr, is_setup)
  }

  /** SkeletonModification2D.get_is_setup */
  final def getIsSetup(): Boolean = {
    if (gdext.classes.SkeletonModification2D.mb_get_is_setup == null) gdext.classes.SkeletonModification2D.mb_get_is_setup = MethodBind.get("SkeletonModification2D", "get_is_setup", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2D.mb_get_is_setup, livePtr)
  }

  /** SkeletonModification2D.set_execution_mode */
  final def setExecutionMode(execution_mode: Long): Unit = {
    if (gdext.classes.SkeletonModification2D.mb_set_execution_mode == null) gdext.classes.SkeletonModification2D.mb_set_execution_mode = MethodBind.get("SkeletonModification2D", "set_execution_mode", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2D.mb_set_execution_mode, livePtr, execution_mode)
  }

  /** SkeletonModification2D.get_execution_mode */
  final def getExecutionMode(): Long = {
    if (gdext.classes.SkeletonModification2D.mb_get_execution_mode == null) gdext.classes.SkeletonModification2D.mb_get_execution_mode = MethodBind.get("SkeletonModification2D", "get_execution_mode", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SkeletonModification2D.mb_get_execution_mode, livePtr)
  }

  /** SkeletonModification2D.clamp_angle */
  final def clampAngle(angle: Double, min: Double, max: Double, invert: Boolean): Double = {
    if (gdext.classes.SkeletonModification2D.mb_clamp_angle == null) gdext.classes.SkeletonModification2D.mb_clamp_angle = MethodBind.get("SkeletonModification2D", "clamp_angle", 1229502682L)
    Ptrcall.call4[Double, Double, Double, Boolean, Double](gdext.classes.SkeletonModification2D.mb_clamp_angle, livePtr, angle, min, max, invert)
  }

  /** SkeletonModification2D.set_editor_draw_gizmo */
  final def setEditorDrawGizmo(draw_gizmo: Boolean): Unit = {
    if (gdext.classes.SkeletonModification2D.mb_set_editor_draw_gizmo == null) gdext.classes.SkeletonModification2D.mb_set_editor_draw_gizmo = MethodBind.get("SkeletonModification2D", "set_editor_draw_gizmo", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModification2D.mb_set_editor_draw_gizmo, livePtr, draw_gizmo)
  }

  /** SkeletonModification2D.get_editor_draw_gizmo */
  final def getEditorDrawGizmo(): Boolean = {
    if (gdext.classes.SkeletonModification2D.mb_get_editor_draw_gizmo == null) gdext.classes.SkeletonModification2D.mb_get_editor_draw_gizmo = MethodBind.get("SkeletonModification2D", "get_editor_draw_gizmo", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModification2D.mb_get_editor_draw_gizmo, livePtr)
  }

}

object SkeletonModification2D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modification_stack: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_is_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_is_setup: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_execution_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_execution_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_clamp_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_editor_draw_gizmo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_editor_draw_gizmo: GDExtensionMethodBindPtr = null
}
