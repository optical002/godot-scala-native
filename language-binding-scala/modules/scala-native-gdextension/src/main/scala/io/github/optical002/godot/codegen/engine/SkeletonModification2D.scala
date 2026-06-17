package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SkeletonModification2D`, extends `Resource`. */
abstract class SkeletonModification2D extends Resource {

  /** SkeletonModification2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** SkeletonModification2D.get_enabled */
  final def getEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2D", "get_enabled", 2240911060L), hostObject.objectPtr)

  /** SkeletonModification2D.get_modification_stack */
  final def getModificationStack(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkeletonModification2D", "get_modification_stack", 2137761694L), hostObject.objectPtr)

  /** SkeletonModification2D.set_is_setup */
  final def setIsSetup(is_setup: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2D", "set_is_setup", 2586408642L), hostObject.objectPtr, is_setup)

  /** SkeletonModification2D.get_is_setup */
  final def getIsSetup(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2D", "get_is_setup", 36873697L), hostObject.objectPtr)

  /** SkeletonModification2D.set_execution_mode */
  final def setExecutionMode(execution_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2D", "set_execution_mode", 1286410249L), hostObject.objectPtr, execution_mode)

  /** SkeletonModification2D.get_execution_mode */
  final def getExecutionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SkeletonModification2D", "get_execution_mode", 3905245786L), hostObject.objectPtr)

  /** SkeletonModification2D.clamp_angle */
  final def clampAngle(angle: Double, min: Double, max: Double, invert: Boolean): Double =
    Ptrcall.call4[Double, Double, Double, Boolean, Double](MethodBind.get("SkeletonModification2D", "clamp_angle", 1229502682L), hostObject.objectPtr, angle, min, max, invert)

  /** SkeletonModification2D.set_editor_draw_gizmo */
  final def setEditorDrawGizmo(draw_gizmo: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SkeletonModification2D", "set_editor_draw_gizmo", 2586408642L), hostObject.objectPtr, draw_gizmo)

  /** SkeletonModification2D.get_editor_draw_gizmo */
  final def getEditorDrawGizmo(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SkeletonModification2D", "get_editor_draw_gizmo", 36873697L), hostObject.objectPtr)

}

object SkeletonModification2D {
  /** Class metadata for Gd[SkeletonModification2D] lifetime management and casting. */
  given GodotClass[SkeletonModification2D] with {
    def className = "SkeletonModification2D"
    def isRefCounted = true
    def wrap(o: GodotObject): SkeletonModification2D = new SkeletonModification2D {}.withHost(o.objectPtr)
    def unwrap(t: SkeletonModification2D): GodotObject = t.hostObject
  }
}
