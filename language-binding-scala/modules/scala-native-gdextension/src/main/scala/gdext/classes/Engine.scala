package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Engine`, extends `Object`. */
abstract class Engine extends Object {
  override def godotClassName: String = "Engine"

  /** Engine.set_physics_ticks_per_second */
  final def setPhysicsTicksPerSecond(physics_ticks_per_second: Long): Unit = {
    if (gdext.classes.Engine.mb_set_physics_ticks_per_second == null) gdext.classes.Engine.mb_set_physics_ticks_per_second = MethodBind.get("Engine", "set_physics_ticks_per_second", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_physics_ticks_per_second, livePtr, physics_ticks_per_second)
  }

  /** Engine.get_physics_ticks_per_second */
  final def getPhysicsTicksPerSecond(): Long = {
    if (gdext.classes.Engine.mb_get_physics_ticks_per_second == null) gdext.classes.Engine.mb_get_physics_ticks_per_second = MethodBind.get("Engine", "get_physics_ticks_per_second", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_physics_ticks_per_second, livePtr)
  }

  /** Engine.set_max_physics_steps_per_frame */
  final def setMaxPhysicsStepsPerFrame(max_physics_steps: Long): Unit = {
    if (gdext.classes.Engine.mb_set_max_physics_steps_per_frame == null) gdext.classes.Engine.mb_set_max_physics_steps_per_frame = MethodBind.get("Engine", "set_max_physics_steps_per_frame", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_max_physics_steps_per_frame, livePtr, max_physics_steps)
  }

  /** Engine.get_max_physics_steps_per_frame */
  final def getMaxPhysicsStepsPerFrame(): Long = {
    if (gdext.classes.Engine.mb_get_max_physics_steps_per_frame == null) gdext.classes.Engine.mb_get_max_physics_steps_per_frame = MethodBind.get("Engine", "get_max_physics_steps_per_frame", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_max_physics_steps_per_frame, livePtr)
  }

  /** Engine.set_physics_jitter_fix */
  final def setPhysicsJitterFix(physics_jitter_fix: Double): Unit = {
    if (gdext.classes.Engine.mb_set_physics_jitter_fix == null) gdext.classes.Engine.mb_set_physics_jitter_fix = MethodBind.get("Engine", "set_physics_jitter_fix", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_physics_jitter_fix, livePtr, physics_jitter_fix)
  }

  /** Engine.get_physics_jitter_fix */
  final def getPhysicsJitterFix(): Double = {
    if (gdext.classes.Engine.mb_get_physics_jitter_fix == null) gdext.classes.Engine.mb_get_physics_jitter_fix = MethodBind.get("Engine", "get_physics_jitter_fix", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Engine.mb_get_physics_jitter_fix, livePtr)
  }

  /** Engine.get_physics_interpolation_fraction */
  final def getPhysicsInterpolationFraction(): Double = {
    if (gdext.classes.Engine.mb_get_physics_interpolation_fraction == null) gdext.classes.Engine.mb_get_physics_interpolation_fraction = MethodBind.get("Engine", "get_physics_interpolation_fraction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Engine.mb_get_physics_interpolation_fraction, livePtr)
  }

  /** Engine.set_max_fps */
  final def setMaxFps(max_fps: Long): Unit = {
    if (gdext.classes.Engine.mb_set_max_fps == null) gdext.classes.Engine.mb_set_max_fps = MethodBind.get("Engine", "set_max_fps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_max_fps, livePtr, max_fps)
  }

  /** Engine.get_max_fps */
  final def getMaxFps(): Long = {
    if (gdext.classes.Engine.mb_get_max_fps == null) gdext.classes.Engine.mb_get_max_fps = MethodBind.get("Engine", "get_max_fps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_max_fps, livePtr)
  }

  /** Engine.set_time_scale */
  final def setTimeScale(time_scale: Double): Unit = {
    if (gdext.classes.Engine.mb_set_time_scale == null) gdext.classes.Engine.mb_set_time_scale = MethodBind.get("Engine", "set_time_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_time_scale, livePtr, time_scale)
  }

  /** Engine.get_time_scale */
  final def getTimeScale(): Double = {
    if (gdext.classes.Engine.mb_get_time_scale == null) gdext.classes.Engine.mb_get_time_scale = MethodBind.get("Engine", "get_time_scale", 191475506L)
    Ptrcall.call0[Double](gdext.classes.Engine.mb_get_time_scale, livePtr)
  }

  /** Engine.get_frames_drawn */
  final def getFramesDrawn(): Long = {
    if (gdext.classes.Engine.mb_get_frames_drawn == null) gdext.classes.Engine.mb_get_frames_drawn = MethodBind.get("Engine", "get_frames_drawn", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_frames_drawn, livePtr)
  }

  /** Engine.get_frames_per_second */
  final def getFramesPerSecond(): Double = {
    if (gdext.classes.Engine.mb_get_frames_per_second == null) gdext.classes.Engine.mb_get_frames_per_second = MethodBind.get("Engine", "get_frames_per_second", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Engine.mb_get_frames_per_second, livePtr)
  }

  /** Engine.get_physics_frames */
  final def getPhysicsFrames(): Long = {
    if (gdext.classes.Engine.mb_get_physics_frames == null) gdext.classes.Engine.mb_get_physics_frames = MethodBind.get("Engine", "get_physics_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_physics_frames, livePtr)
  }

  /** Engine.get_process_frames */
  final def getProcessFrames(): Long = {
    if (gdext.classes.Engine.mb_get_process_frames == null) gdext.classes.Engine.mb_get_process_frames = MethodBind.get("Engine", "get_process_frames", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_process_frames, livePtr)
  }

  /** Engine.get_main_loop */
  final def getMainLoop(): MainLoop = {
    if (gdext.classes.Engine.mb_get_main_loop == null) gdext.classes.Engine.mb_get_main_loop = MethodBind.get("Engine", "get_main_loop", 1016888095L)
    Wrappers.borrowed[MainLoop](Ptrcall.call0[Long](gdext.classes.Engine.mb_get_main_loop, livePtr))
  }

  /** Engine.get_license_text */
  final def getLicenseText(): String = {
    if (gdext.classes.Engine.mb_get_license_text == null) gdext.classes.Engine.mb_get_license_text = MethodBind.get("Engine", "get_license_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Engine.mb_get_license_text, livePtr)
  }

  /** Engine.get_architecture_name */
  final def getArchitectureName(): String = {
    if (gdext.classes.Engine.mb_get_architecture_name == null) gdext.classes.Engine.mb_get_architecture_name = MethodBind.get("Engine", "get_architecture_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Engine.mb_get_architecture_name, livePtr)
  }

  /** Engine.is_in_physics_frame */
  final def isInPhysicsFrame(): Boolean = {
    if (gdext.classes.Engine.mb_is_in_physics_frame == null) gdext.classes.Engine.mb_is_in_physics_frame = MethodBind.get("Engine", "is_in_physics_frame", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Engine.mb_is_in_physics_frame, livePtr)
  }

  /** Engine.has_singleton */
  final def hasSingleton(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Engine.mb_has_singleton == null) gdext.classes.Engine.mb_has_singleton = MethodBind.get("Engine", "has_singleton", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Engine.mb_has_singleton, livePtr, name)
  }

  /** Engine.get_singleton */
  final def getSingleton(name: gdext.builtin.StringName): Object = {
    if (gdext.classes.Engine.mb_get_singleton == null) gdext.classes.Engine.mb_get_singleton = MethodBind.get("Engine", "get_singleton", 1371597918L)
    Wrappers.borrowed[Object](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.Engine.mb_get_singleton, livePtr, name))
  }

  /** Engine.register_singleton */
  final def registerSingleton(name: gdext.builtin.StringName, instance: Object): Unit = {
    if (gdext.classes.Engine.mb_register_singleton == null) gdext.classes.Engine.mb_register_singleton = MethodBind.get("Engine", "register_singleton", 965313290L)
    Ptrcall.callVoid2(gdext.classes.Engine.mb_register_singleton, livePtr, name, Wrappers.handle(instance))
  }

  /** Engine.unregister_singleton */
  final def unregisterSingleton(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Engine.mb_unregister_singleton == null) gdext.classes.Engine.mb_unregister_singleton = MethodBind.get("Engine", "unregister_singleton", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_unregister_singleton, livePtr, name)
  }

  /** Engine.register_script_language */
  final def registerScriptLanguage(language: ScriptLanguage): Long = {
    if (gdext.classes.Engine.mb_register_script_language == null) gdext.classes.Engine.mb_register_script_language = MethodBind.get("Engine", "register_script_language", 1850254898L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.Engine.mb_register_script_language, livePtr, Wrappers.handle(language))
  }

  /** Engine.unregister_script_language */
  final def unregisterScriptLanguage(language: ScriptLanguage): Long = {
    if (gdext.classes.Engine.mb_unregister_script_language == null) gdext.classes.Engine.mb_unregister_script_language = MethodBind.get("Engine", "unregister_script_language", 1850254898L)
    Ptrcall.call1[GodotObject, Long](gdext.classes.Engine.mb_unregister_script_language, livePtr, Wrappers.handle(language))
  }

  /** Engine.get_script_language_count */
  final def getScriptLanguageCount(): Long = {
    if (gdext.classes.Engine.mb_get_script_language_count == null) gdext.classes.Engine.mb_get_script_language_count = MethodBind.get("Engine", "get_script_language_count", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.Engine.mb_get_script_language_count, livePtr)
  }

  /** Engine.get_script_language */
  final def getScriptLanguage(index: Long): ScriptLanguage = {
    if (gdext.classes.Engine.mb_get_script_language == null) gdext.classes.Engine.mb_get_script_language = MethodBind.get("Engine", "get_script_language", 2151255799L)
    Wrappers.borrowed[ScriptLanguage](Ptrcall.call1[Long, Long](gdext.classes.Engine.mb_get_script_language, livePtr, index))
  }

  /** Engine.is_editor_hint */
  final def isEditorHint(): Boolean = {
    if (gdext.classes.Engine.mb_is_editor_hint == null) gdext.classes.Engine.mb_is_editor_hint = MethodBind.get("Engine", "is_editor_hint", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Engine.mb_is_editor_hint, livePtr)
  }

  /** Engine.is_embedded_in_editor */
  final def isEmbeddedInEditor(): Boolean = {
    if (gdext.classes.Engine.mb_is_embedded_in_editor == null) gdext.classes.Engine.mb_is_embedded_in_editor = MethodBind.get("Engine", "is_embedded_in_editor", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Engine.mb_is_embedded_in_editor, livePtr)
  }

  /** Engine.get_write_movie_path */
  final def getWriteMoviePath(): String = {
    if (gdext.classes.Engine.mb_get_write_movie_path == null) gdext.classes.Engine.mb_get_write_movie_path = MethodBind.get("Engine", "get_write_movie_path", 201670096L)
    Ptrcall.call0[String](gdext.classes.Engine.mb_get_write_movie_path, livePtr)
  }

  /** Engine.set_print_to_stdout */
  final def setPrintToStdout(enabled: Boolean): Unit = {
    if (gdext.classes.Engine.mb_set_print_to_stdout == null) gdext.classes.Engine.mb_set_print_to_stdout = MethodBind.get("Engine", "set_print_to_stdout", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_print_to_stdout, livePtr, enabled)
  }

  /** Engine.is_printing_to_stdout */
  final def isPrintingToStdout(): Boolean = {
    if (gdext.classes.Engine.mb_is_printing_to_stdout == null) gdext.classes.Engine.mb_is_printing_to_stdout = MethodBind.get("Engine", "is_printing_to_stdout", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Engine.mb_is_printing_to_stdout, livePtr)
  }

  /** Engine.set_print_error_messages */
  final def setPrintErrorMessages(enabled: Boolean): Unit = {
    if (gdext.classes.Engine.mb_set_print_error_messages == null) gdext.classes.Engine.mb_set_print_error_messages = MethodBind.get("Engine", "set_print_error_messages", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Engine.mb_set_print_error_messages, livePtr, enabled)
  }

  /** Engine.is_printing_error_messages */
  final def isPrintingErrorMessages(): Boolean = {
    if (gdext.classes.Engine.mb_is_printing_error_messages == null) gdext.classes.Engine.mb_is_printing_error_messages = MethodBind.get("Engine", "is_printing_error_messages", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Engine.mb_is_printing_error_messages, livePtr)
  }

}

object Engine {
  private[classes] var mb_set_physics_ticks_per_second: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_ticks_per_second: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_physics_steps_per_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_physics_steps_per_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_jitter_fix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_jitter_fix: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_interpolation_fraction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frames_drawn: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frames_per_second: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_frames: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_main_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_license_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_architecture_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_physics_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_singleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_script_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_script_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_language_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_script_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_editor_hint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_embedded_in_editor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_movie_path: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_print_to_stdout: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_printing_to_stdout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_print_error_messages: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_printing_error_messages: GDExtensionMethodBindPtr = null

  private var instance: Engine = null

  /** The process-global Engine singleton instance. */
  def singleton: Engine = {
    if (instance == null)
      instance = Wrappers.borrowed[Engine](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Engine").ptr)))
    instance
  }
}
