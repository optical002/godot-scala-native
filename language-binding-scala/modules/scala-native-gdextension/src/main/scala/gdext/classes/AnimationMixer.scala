package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationMixer`, extends `Node`. */
abstract class AnimationMixer extends Node {
  override def godotClassName: String = "AnimationMixer"

  /** AnimationMixer.add_animation_library */
  final def addAnimationLibrary(name: gdext.builtin.StringName, library: AnimationLibrary): Long = {
    if (gdext.classes.AnimationMixer.mb_add_animation_library == null) gdext.classes.AnimationMixer.mb_add_animation_library = MethodBind.get("AnimationMixer", "add_animation_library", 618909818L)
    Ptrcall.call2[gdext.builtin.StringName, GodotObject, Long](gdext.classes.AnimationMixer.mb_add_animation_library, livePtr, name, Wrappers.handle(library))
  }

  /** AnimationMixer.remove_animation_library */
  final def removeAnimationLibrary(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationMixer.mb_remove_animation_library == null) gdext.classes.AnimationMixer.mb_remove_animation_library = MethodBind.get("AnimationMixer", "remove_animation_library", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_remove_animation_library, livePtr, name)
  }

  /** AnimationMixer.rename_animation_library */
  final def renameAnimationLibrary(name: gdext.builtin.StringName, newname: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationMixer.mb_rename_animation_library == null) gdext.classes.AnimationMixer.mb_rename_animation_library = MethodBind.get("AnimationMixer", "rename_animation_library", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationMixer.mb_rename_animation_library, livePtr, name, newname)
  }

  /** AnimationMixer.has_animation_library */
  final def hasAnimationLibrary(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.AnimationMixer.mb_has_animation_library == null) gdext.classes.AnimationMixer.mb_has_animation_library = MethodBind.get("AnimationMixer", "has_animation_library", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.AnimationMixer.mb_has_animation_library, livePtr, name)
  }

  /** AnimationMixer.get_animation_library. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAnimationLibrary(name: gdext.builtin.StringName): AnimationLibrary = {
    if (gdext.classes.AnimationMixer.mb_get_animation_library == null) gdext.classes.AnimationMixer.mb_get_animation_library = MethodBind.get("AnimationMixer", "get_animation_library", 147342321L)
    Wrappers.owned[AnimationLibrary](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.AnimationMixer.mb_get_animation_library, livePtr, name))
  }

  /** AnimationMixer.has_animation */
  final def hasAnimation(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.AnimationMixer.mb_has_animation == null) gdext.classes.AnimationMixer.mb_has_animation = MethodBind.get("AnimationMixer", "has_animation", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.AnimationMixer.mb_has_animation, livePtr, name)
  }

  /** AnimationMixer.get_animation. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAnimation(name: gdext.builtin.StringName): Animation = {
    if (gdext.classes.AnimationMixer.mb_get_animation == null) gdext.classes.AnimationMixer.mb_get_animation = MethodBind.get("AnimationMixer", "get_animation", 2933122410L)
    Wrappers.owned[Animation](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.AnimationMixer.mb_get_animation, livePtr, name))
  }

  /** AnimationMixer.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_active == null) gdext.classes.AnimationMixer.mb_set_active = MethodBind.get("AnimationMixer", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_active, livePtr, active)
  }

  /** AnimationMixer.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.AnimationMixer.mb_is_active == null) gdext.classes.AnimationMixer.mb_is_active = MethodBind.get("AnimationMixer", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationMixer.mb_is_active, livePtr)
  }

  /** AnimationMixer.set_deterministic */
  final def setDeterministic(deterministic: Boolean): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_deterministic == null) gdext.classes.AnimationMixer.mb_set_deterministic = MethodBind.get("AnimationMixer", "set_deterministic", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_deterministic, livePtr, deterministic)
  }

  /** AnimationMixer.is_deterministic */
  final def isDeterministic(): Boolean = {
    if (gdext.classes.AnimationMixer.mb_is_deterministic == null) gdext.classes.AnimationMixer.mb_is_deterministic = MethodBind.get("AnimationMixer", "is_deterministic", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationMixer.mb_is_deterministic, livePtr)
  }

  /** AnimationMixer.set_callback_mode_process */
  final def setCallbackModeProcess(mode: Long): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_callback_mode_process == null) gdext.classes.AnimationMixer.mb_set_callback_mode_process = MethodBind.get("AnimationMixer", "set_callback_mode_process", 2153733086L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_callback_mode_process, livePtr, mode)
  }

  /** AnimationMixer.get_callback_mode_process */
  final def getCallbackModeProcess(): Long = {
    if (gdext.classes.AnimationMixer.mb_get_callback_mode_process == null) gdext.classes.AnimationMixer.mb_get_callback_mode_process = MethodBind.get("AnimationMixer", "get_callback_mode_process", 1394468472L)
    Ptrcall.call0[Long](gdext.classes.AnimationMixer.mb_get_callback_mode_process, livePtr)
  }

  /** AnimationMixer.set_callback_mode_method */
  final def setCallbackModeMethod(mode: Long): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_callback_mode_method == null) gdext.classes.AnimationMixer.mb_set_callback_mode_method = MethodBind.get("AnimationMixer", "set_callback_mode_method", 742218271L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_callback_mode_method, livePtr, mode)
  }

  /** AnimationMixer.get_callback_mode_method */
  final def getCallbackModeMethod(): Long = {
    if (gdext.classes.AnimationMixer.mb_get_callback_mode_method == null) gdext.classes.AnimationMixer.mb_get_callback_mode_method = MethodBind.get("AnimationMixer", "get_callback_mode_method", 489449656L)
    Ptrcall.call0[Long](gdext.classes.AnimationMixer.mb_get_callback_mode_method, livePtr)
  }

  /** AnimationMixer.set_callback_mode_discrete */
  final def setCallbackModeDiscrete(mode: Long): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_callback_mode_discrete == null) gdext.classes.AnimationMixer.mb_set_callback_mode_discrete = MethodBind.get("AnimationMixer", "set_callback_mode_discrete", 1998944670L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_callback_mode_discrete, livePtr, mode)
  }

  /** AnimationMixer.get_callback_mode_discrete */
  final def getCallbackModeDiscrete(): Long = {
    if (gdext.classes.AnimationMixer.mb_get_callback_mode_discrete == null) gdext.classes.AnimationMixer.mb_get_callback_mode_discrete = MethodBind.get("AnimationMixer", "get_callback_mode_discrete", 3493168860L)
    Ptrcall.call0[Long](gdext.classes.AnimationMixer.mb_get_callback_mode_discrete, livePtr)
  }

  /** AnimationMixer.set_audio_max_polyphony */
  final def setAudioMaxPolyphony(max_polyphony: Long): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_audio_max_polyphony == null) gdext.classes.AnimationMixer.mb_set_audio_max_polyphony = MethodBind.get("AnimationMixer", "set_audio_max_polyphony", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_audio_max_polyphony, livePtr, max_polyphony)
  }

  /** AnimationMixer.get_audio_max_polyphony */
  final def getAudioMaxPolyphony(): Long = {
    if (gdext.classes.AnimationMixer.mb_get_audio_max_polyphony == null) gdext.classes.AnimationMixer.mb_get_audio_max_polyphony = MethodBind.get("AnimationMixer", "get_audio_max_polyphony", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationMixer.mb_get_audio_max_polyphony, livePtr)
  }

  /** AnimationMixer.set_root_motion_local */
  final def setRootMotionLocal(enabled: Boolean): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_root_motion_local == null) gdext.classes.AnimationMixer.mb_set_root_motion_local = MethodBind.get("AnimationMixer", "set_root_motion_local", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_root_motion_local, livePtr, enabled)
  }

  /** AnimationMixer.is_root_motion_local */
  final def isRootMotionLocal(): Boolean = {
    if (gdext.classes.AnimationMixer.mb_is_root_motion_local == null) gdext.classes.AnimationMixer.mb_is_root_motion_local = MethodBind.get("AnimationMixer", "is_root_motion_local", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationMixer.mb_is_root_motion_local, livePtr)
  }

  /** AnimationMixer.get_root_motion_position */
  final def getRootMotionPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_position == null) gdext.classes.AnimationMixer.mb_get_root_motion_position = MethodBind.get("AnimationMixer", "get_root_motion_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.AnimationMixer.mb_get_root_motion_position, livePtr)
  }

  /** AnimationMixer.get_root_motion_rotation */
  final def getRootMotionRotation(): gdext.builtin.Quaternion = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_rotation == null) gdext.classes.AnimationMixer.mb_get_root_motion_rotation = MethodBind.get("AnimationMixer", "get_root_motion_rotation", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.AnimationMixer.mb_get_root_motion_rotation, livePtr)
  }

  /** AnimationMixer.get_root_motion_scale */
  final def getRootMotionScale(): gdext.builtin.Vector3 = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_scale == null) gdext.classes.AnimationMixer.mb_get_root_motion_scale = MethodBind.get("AnimationMixer", "get_root_motion_scale", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.AnimationMixer.mb_get_root_motion_scale, livePtr)
  }

  /** AnimationMixer.get_root_motion_position_accumulator */
  final def getRootMotionPositionAccumulator(): gdext.builtin.Vector3 = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_position_accumulator == null) gdext.classes.AnimationMixer.mb_get_root_motion_position_accumulator = MethodBind.get("AnimationMixer", "get_root_motion_position_accumulator", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.AnimationMixer.mb_get_root_motion_position_accumulator, livePtr)
  }

  /** AnimationMixer.get_root_motion_rotation_accumulator */
  final def getRootMotionRotationAccumulator(): gdext.builtin.Quaternion = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_rotation_accumulator == null) gdext.classes.AnimationMixer.mb_get_root_motion_rotation_accumulator = MethodBind.get("AnimationMixer", "get_root_motion_rotation_accumulator", 1222331677L)
    Ptrcall.call0[gdext.builtin.Quaternion](gdext.classes.AnimationMixer.mb_get_root_motion_rotation_accumulator, livePtr)
  }

  /** AnimationMixer.get_root_motion_scale_accumulator */
  final def getRootMotionScaleAccumulator(): gdext.builtin.Vector3 = {
    if (gdext.classes.AnimationMixer.mb_get_root_motion_scale_accumulator == null) gdext.classes.AnimationMixer.mb_get_root_motion_scale_accumulator = MethodBind.get("AnimationMixer", "get_root_motion_scale_accumulator", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.AnimationMixer.mb_get_root_motion_scale_accumulator, livePtr)
  }

  /** AnimationMixer.clear_caches */
  final def clearCaches(): Unit = {
    if (gdext.classes.AnimationMixer.mb_clear_caches == null) gdext.classes.AnimationMixer.mb_clear_caches = MethodBind.get("AnimationMixer", "clear_caches", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationMixer.mb_clear_caches, livePtr)
  }

  /** AnimationMixer.advance */
  final def advance(delta: Double): Unit = {
    if (gdext.classes.AnimationMixer.mb_advance == null) gdext.classes.AnimationMixer.mb_advance = MethodBind.get("AnimationMixer", "advance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_advance, livePtr, delta)
  }

  /** AnimationMixer.capture */
  final def capture(name: gdext.builtin.StringName, duration: Double, trans_type: Long, ease_type: Long): Unit = {
    if (gdext.classes.AnimationMixer.mb_capture == null) gdext.classes.AnimationMixer.mb_capture = MethodBind.get("AnimationMixer", "capture", 1333632127L)
    Ptrcall.callVoid4(gdext.classes.AnimationMixer.mb_capture, livePtr, name, duration, trans_type, ease_type)
  }

  /** AnimationMixer.set_reset_on_save_enabled */
  final def setResetOnSaveEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.AnimationMixer.mb_set_reset_on_save_enabled == null) gdext.classes.AnimationMixer.mb_set_reset_on_save_enabled = MethodBind.get("AnimationMixer", "set_reset_on_save_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationMixer.mb_set_reset_on_save_enabled, livePtr, enabled)
  }

  /** AnimationMixer.is_reset_on_save_enabled */
  final def isResetOnSaveEnabled(): Boolean = {
    if (gdext.classes.AnimationMixer.mb_is_reset_on_save_enabled == null) gdext.classes.AnimationMixer.mb_is_reset_on_save_enabled = MethodBind.get("AnimationMixer", "is_reset_on_save_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationMixer.mb_is_reset_on_save_enabled, livePtr)
  }

  /** AnimationMixer.find_animation */
  final def findAnimation(animation: Animation): gdext.builtin.StringName = {
    if (gdext.classes.AnimationMixer.mb_find_animation == null) gdext.classes.AnimationMixer.mb_find_animation = MethodBind.get("AnimationMixer", "find_animation", 1559484580L)
    Ptrcall.call1[GodotObject, gdext.builtin.StringName](gdext.classes.AnimationMixer.mb_find_animation, livePtr, Wrappers.handle(animation))
  }

  /** AnimationMixer.find_animation_library */
  final def findAnimationLibrary(animation: Animation): gdext.builtin.StringName = {
    if (gdext.classes.AnimationMixer.mb_find_animation_library == null) gdext.classes.AnimationMixer.mb_find_animation_library = MethodBind.get("AnimationMixer", "find_animation_library", 1559484580L)
    Ptrcall.call1[GodotObject, gdext.builtin.StringName](gdext.classes.AnimationMixer.mb_find_animation_library, livePtr, Wrappers.handle(animation))
  }

}

object AnimationMixer {
  private[classes] var mb_add_animation_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_animation_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_animation_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_animation_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_library: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_deterministic: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_deterministic: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_callback_mode_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_callback_mode_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_callback_mode_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_callback_mode_method: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_callback_mode_discrete: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_callback_mode_discrete: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_audio_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_audio_max_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_root_motion_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_root_motion_local: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_position_accumulator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_rotation_accumulator: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_root_motion_scale_accumulator: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_caches: GDExtensionMethodBindPtr = null
  private[classes] var mb_advance: GDExtensionMethodBindPtr = null
  private[classes] var mb_capture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_reset_on_save_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_reset_on_save_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_animation_library: GDExtensionMethodBindPtr = null
}
