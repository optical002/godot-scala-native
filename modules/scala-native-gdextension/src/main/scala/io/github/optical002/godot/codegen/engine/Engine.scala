package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Engine`, inherits `Object`. */
opaque type Engine = GodotObject

object Engine {
  /** Wrap a raw object handle as a `Engine` (no checked cast). */
  def fromObject(o: GodotObject): Engine = o

  /** Class metadata for Gd[Engine] lifetime management and casting. */
  given GodotClass[Engine] with {
    def className = "Engine"
    def isRefCounted = false
    def wrap(o: GodotObject): Engine = o
    def unwrap(t: Engine): GodotObject = t
  }

  extension (self: Engine) {
    /** The underlying object handle. */
    def asObject: GodotObject = self

    /** Engine.set_physics_ticks_per_second */
    def setPhysicsTicksPerSecond(physics_ticks_per_second: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_physics_ticks_per_second", 1286410249L), self.asObject.objectPtr, physics_ticks_per_second)

    /** Engine.get_physics_ticks_per_second */
    def getPhysicsTicksPerSecond(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_physics_ticks_per_second", 3905245786L), self.asObject.objectPtr)

    /** Engine.set_max_physics_steps_per_frame */
    def setMaxPhysicsStepsPerFrame(max_physics_steps: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_max_physics_steps_per_frame", 1286410249L), self.asObject.objectPtr, max_physics_steps)

    /** Engine.get_max_physics_steps_per_frame */
    def getMaxPhysicsStepsPerFrame(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_max_physics_steps_per_frame", 3905245786L), self.asObject.objectPtr)

    /** Engine.set_physics_jitter_fix */
    def setPhysicsJitterFix(physics_jitter_fix: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_physics_jitter_fix", 373806689L), self.asObject.objectPtr, physics_jitter_fix)

    /** Engine.get_physics_jitter_fix */
    def getPhysicsJitterFix(): Double =
      Ptrcall.call0[Double](MethodBind.get("Engine", "get_physics_jitter_fix", 1740695150L), self.asObject.objectPtr)

    /** Engine.get_physics_interpolation_fraction */
    def getPhysicsInterpolationFraction(): Double =
      Ptrcall.call0[Double](MethodBind.get("Engine", "get_physics_interpolation_fraction", 1740695150L), self.asObject.objectPtr)

    /** Engine.set_max_fps */
    def setMaxFps(max_fps: Long): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_max_fps", 1286410249L), self.asObject.objectPtr, max_fps)

    /** Engine.get_max_fps */
    def getMaxFps(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_max_fps", 3905245786L), self.asObject.objectPtr)

    /** Engine.set_time_scale */
    def setTimeScale(time_scale: Double): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_time_scale", 373806689L), self.asObject.objectPtr, time_scale)

    /** Engine.get_time_scale */
    def getTimeScale(): Double =
      Ptrcall.call0[Double](MethodBind.get("Engine", "get_time_scale", 191475506L), self.asObject.objectPtr)

    /** Engine.get_frames_drawn */
    def getFramesDrawn(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_frames_drawn", 2455072627L), self.asObject.objectPtr)

    /** Engine.get_frames_per_second */
    def getFramesPerSecond(): Double =
      Ptrcall.call0[Double](MethodBind.get("Engine", "get_frames_per_second", 1740695150L), self.asObject.objectPtr)

    /** Engine.get_physics_frames */
    def getPhysicsFrames(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_physics_frames", 3905245786L), self.asObject.objectPtr)

    /** Engine.get_process_frames */
    def getProcessFrames(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_process_frames", 3905245786L), self.asObject.objectPtr)

    /** Engine.get_license_text */
    def getLicenseText(): String =
      Ptrcall.call0[String](MethodBind.get("Engine", "get_license_text", 201670096L), self.asObject.objectPtr)

    /** Engine.get_architecture_name */
    def getArchitectureName(): String =
      Ptrcall.call0[String](MethodBind.get("Engine", "get_architecture_name", 201670096L), self.asObject.objectPtr)

    /** Engine.is_in_physics_frame */
    def isInPhysicsFrame(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_in_physics_frame", 36873697L), self.asObject.objectPtr)

    /** Engine.get_script_language_count */
    def getScriptLanguageCount(): Long =
      Ptrcall.call0[Long](MethodBind.get("Engine", "get_script_language_count", 2455072627L), self.asObject.objectPtr)

    /** Engine.is_editor_hint */
    def isEditorHint(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_editor_hint", 36873697L), self.asObject.objectPtr)

    /** Engine.is_embedded_in_editor */
    def isEmbeddedInEditor(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_embedded_in_editor", 36873697L), self.asObject.objectPtr)

    /** Engine.get_write_movie_path */
    def getWriteMoviePath(): String =
      Ptrcall.call0[String](MethodBind.get("Engine", "get_write_movie_path", 201670096L), self.asObject.objectPtr)

    /** Engine.set_print_to_stdout */
    def setPrintToStdout(enabled: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_print_to_stdout", 2586408642L), self.asObject.objectPtr, enabled)

    /** Engine.is_printing_to_stdout */
    def isPrintingToStdout(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_printing_to_stdout", 36873697L), self.asObject.objectPtr)

    /** Engine.set_print_error_messages */
    def setPrintErrorMessages(enabled: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Engine", "set_print_error_messages", 2586408642L), self.asObject.objectPtr, enabled)

    /** Engine.is_printing_error_messages */
    def isPrintingErrorMessages(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Engine", "is_printing_error_messages", 36873697L), self.asObject.objectPtr)

    /** Object.is_class */
    def isClass(`class`: String): Boolean =
      Ptrcall.call1[String, Boolean](MethodBind.get("Object", "is_class", 3927539163L), self.asObject.objectPtr, `class`)

    /** Object.notification */
    def notification(what: Long, reversed: Boolean): Unit =
      Ptrcall.callVoid2(MethodBind.get("Object", "notification", 4023243586L), self.asObject.objectPtr, what, reversed)

    /** Object.get_instance_id */
    def getInstanceId(): Long =
      Ptrcall.call0[Long](MethodBind.get("Object", "get_instance_id", 3905245786L), self.asObject.objectPtr)

    /** Object.set_block_signals */
    def setBlockSignals(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_block_signals", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.is_blocking_signals */
    def isBlockingSignals(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_blocking_signals", 36873697L), self.asObject.objectPtr)

    /** Object.notify_property_list_changed */
    def notifyPropertyListChanged(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "notify_property_list_changed", 3218959716L), self.asObject.objectPtr)

    /** Object.set_message_translation */
    def setMessageTranslation(enable: Boolean): Unit =
      Ptrcall.callVoid1(MethodBind.get("Object", "set_message_translation", 2586408642L), self.asObject.objectPtr, enable)

    /** Object.can_translate_messages */
    def canTranslateMessages(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "can_translate_messages", 36873697L), self.asObject.objectPtr)

    /** Object.is_queued_for_deletion */
    def isQueuedForDeletion(): Boolean =
      Ptrcall.call0[Boolean](MethodBind.get("Object", "is_queued_for_deletion", 36873697L), self.asObject.objectPtr)

    /** Object.cancel_free */
    def cancelFree(): Unit =
      Ptrcall.callVoid0(MethodBind.get("Object", "cancel_free", 3218959716L), self.asObject.objectPtr)

  }

  /** The process-global Engine singleton instance. */
  def singleton: Engine =
    fromObject(GodotObject.fromPtr(
      Godot.interface.global_get_singleton(
        StringNames.cached("Engine").ptr)))
}
