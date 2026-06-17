package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Engine`, extends `Object`. */
abstract class Engine extends Object {

  /** Engine.set_physics_ticks_per_second */
  final def setPhysicsTicksPerSecond(physics_ticks_per_second: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_physics_ticks_per_second", 1286410249L), hostObject.objectPtr, physics_ticks_per_second)

  /** Engine.get_physics_ticks_per_second */
  final def getPhysicsTicksPerSecond(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_physics_ticks_per_second", 3905245786L), hostObject.objectPtr)

  /** Engine.set_max_physics_steps_per_frame */
  final def setMaxPhysicsStepsPerFrame(max_physics_steps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_max_physics_steps_per_frame", 1286410249L), hostObject.objectPtr, max_physics_steps)

  /** Engine.get_max_physics_steps_per_frame */
  final def getMaxPhysicsStepsPerFrame(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_max_physics_steps_per_frame", 3905245786L), hostObject.objectPtr)

  /** Engine.set_physics_jitter_fix */
  final def setPhysicsJitterFix(physics_jitter_fix: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_physics_jitter_fix", 373806689L), hostObject.objectPtr, physics_jitter_fix)

  /** Engine.get_physics_jitter_fix */
  final def getPhysicsJitterFix(): Double =
    Ptrcall.call0[Double](MethodBind.get("Engine", "get_physics_jitter_fix", 1740695150L), hostObject.objectPtr)

  /** Engine.get_physics_interpolation_fraction */
  final def getPhysicsInterpolationFraction(): Double =
    Ptrcall.call0[Double](MethodBind.get("Engine", "get_physics_interpolation_fraction", 1740695150L), hostObject.objectPtr)

  /** Engine.set_max_fps */
  final def setMaxFps(max_fps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_max_fps", 1286410249L), hostObject.objectPtr, max_fps)

  /** Engine.get_max_fps */
  final def getMaxFps(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_max_fps", 3905245786L), hostObject.objectPtr)

  /** Engine.set_time_scale */
  final def setTimeScale(time_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_time_scale", 373806689L), hostObject.objectPtr, time_scale)

  /** Engine.get_time_scale */
  final def getTimeScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Engine", "get_time_scale", 191475506L), hostObject.objectPtr)

  /** Engine.get_frames_drawn */
  final def getFramesDrawn(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_frames_drawn", 2455072627L), hostObject.objectPtr)

  /** Engine.get_frames_per_second */
  final def getFramesPerSecond(): Double =
    Ptrcall.call0[Double](MethodBind.get("Engine", "get_frames_per_second", 1740695150L), hostObject.objectPtr)

  /** Engine.get_physics_frames */
  final def getPhysicsFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_physics_frames", 3905245786L), hostObject.objectPtr)

  /** Engine.get_process_frames */
  final def getProcessFrames(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_process_frames", 3905245786L), hostObject.objectPtr)

  /** Engine.get_license_text */
  final def getLicenseText(): String =
    Ptrcall.call0[String](MethodBind.get("Engine", "get_license_text", 201670096L), hostObject.objectPtr)

  /** Engine.get_architecture_name */
  final def getArchitectureName(): String =
    Ptrcall.call0[String](MethodBind.get("Engine", "get_architecture_name", 201670096L), hostObject.objectPtr)

  /** Engine.is_in_physics_frame */
  final def isInPhysicsFrame(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_in_physics_frame", 36873697L), hostObject.objectPtr)

  /** Engine.get_script_language_count */
  final def getScriptLanguageCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Engine", "get_script_language_count", 2455072627L), hostObject.objectPtr)

  /** Engine.is_editor_hint */
  final def isEditorHint(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_editor_hint", 36873697L), hostObject.objectPtr)

  /** Engine.is_embedded_in_editor */
  final def isEmbeddedInEditor(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_embedded_in_editor", 36873697L), hostObject.objectPtr)

  /** Engine.get_write_movie_path */
  final def getWriteMoviePath(): String =
    Ptrcall.call0[String](MethodBind.get("Engine", "get_write_movie_path", 201670096L), hostObject.objectPtr)

  /** Engine.set_print_to_stdout */
  final def setPrintToStdout(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_print_to_stdout", 2586408642L), hostObject.objectPtr, enabled)

  /** Engine.is_printing_to_stdout */
  final def isPrintingToStdout(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_printing_to_stdout", 36873697L), hostObject.objectPtr)

  /** Engine.set_print_error_messages */
  final def setPrintErrorMessages(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Engine", "set_print_error_messages", 2586408642L), hostObject.objectPtr, enabled)

  /** Engine.is_printing_error_messages */
  final def isPrintingErrorMessages(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_printing_error_messages", 36873697L), hostObject.objectPtr)

}

object Engine {
  /** Class metadata for Gd[Engine] lifetime management and casting. */
  given GodotClass[Engine] with {
    def className = "Engine"
    def isRefCounted = false
    def wrap(o: GodotObject): Engine = new Engine {}.withHost(o.objectPtr)
    def unwrap(t: Engine): GodotObject = t.hostObject
  }

  /** The process-global Engine singleton instance. */
  def singleton: Engine = new Engine {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Engine").ptr))
}
