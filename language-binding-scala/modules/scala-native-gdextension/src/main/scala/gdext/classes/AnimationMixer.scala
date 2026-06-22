package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationMixer`, extends `Node`. */
abstract class AnimationMixer extends Node {

  /** AnimationMixer.add_animation_library */
  final def addAnimationLibrary(name: gdext.builtin.StringName, library: AnimationLibrary): Long =
    Ptrcall.call2[gdext.builtin.StringName, GodotObject, Long](MethodBind.get("AnimationMixer", "add_animation_library", 618909818L), hostObject.objectPtr, name, library.hostObject)

  /** AnimationMixer.remove_animation_library */
  final def removeAnimationLibrary(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "remove_animation_library", 3304788590L), hostObject.objectPtr, name)

  /** AnimationMixer.rename_animation_library */
  final def renameAnimationLibrary(name: gdext.builtin.StringName, newname: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationMixer", "rename_animation_library", 3740211285L), hostObject.objectPtr, name, newname)

  /** AnimationMixer.has_animation_library */
  final def hasAnimationLibrary(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("AnimationMixer", "has_animation_library", 2619796661L), hostObject.objectPtr, name)

  /** AnimationMixer.get_animation_library */
  final def getAnimationLibrary(name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("AnimationMixer", "get_animation_library", 147342321L), hostObject.objectPtr, name)

  /** AnimationMixer.has_animation */
  final def hasAnimation(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("AnimationMixer", "has_animation", 2619796661L), hostObject.objectPtr, name)

  /** AnimationMixer.get_animation */
  final def getAnimation(name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("AnimationMixer", "get_animation", 2933122410L), hostObject.objectPtr, name)

  /** AnimationMixer.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** AnimationMixer.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationMixer", "is_active", 36873697L), hostObject.objectPtr)

  /** AnimationMixer.set_deterministic */
  final def setDeterministic(deterministic: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_deterministic", 2586408642L), hostObject.objectPtr, deterministic)

  /** AnimationMixer.is_deterministic */
  final def isDeterministic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationMixer", "is_deterministic", 36873697L), hostObject.objectPtr)

  /** AnimationMixer.set_callback_mode_process */
  final def setCallbackModeProcess(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_callback_mode_process", 2153733086L), hostObject.objectPtr, mode)

  /** AnimationMixer.get_callback_mode_process */
  final def getCallbackModeProcess(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationMixer", "get_callback_mode_process", 1394468472L), hostObject.objectPtr)

  /** AnimationMixer.set_callback_mode_method */
  final def setCallbackModeMethod(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_callback_mode_method", 742218271L), hostObject.objectPtr, mode)

  /** AnimationMixer.get_callback_mode_method */
  final def getCallbackModeMethod(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationMixer", "get_callback_mode_method", 489449656L), hostObject.objectPtr)

  /** AnimationMixer.set_callback_mode_discrete */
  final def setCallbackModeDiscrete(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_callback_mode_discrete", 1998944670L), hostObject.objectPtr, mode)

  /** AnimationMixer.get_callback_mode_discrete */
  final def getCallbackModeDiscrete(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationMixer", "get_callback_mode_discrete", 3493168860L), hostObject.objectPtr)

  /** AnimationMixer.set_audio_max_polyphony */
  final def setAudioMaxPolyphony(max_polyphony: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_audio_max_polyphony", 1286410249L), hostObject.objectPtr, max_polyphony)

  /** AnimationMixer.get_audio_max_polyphony */
  final def getAudioMaxPolyphony(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationMixer", "get_audio_max_polyphony", 3905245786L), hostObject.objectPtr)

  /** AnimationMixer.set_root_motion_local */
  final def setRootMotionLocal(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_root_motion_local", 2586408642L), hostObject.objectPtr, enabled)

  /** AnimationMixer.is_root_motion_local */
  final def isRootMotionLocal(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationMixer", "is_root_motion_local", 36873697L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_position */
  final def getRootMotionPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("AnimationMixer", "get_root_motion_position", 3360562783L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_rotation */
  final def getRootMotionRotation(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("AnimationMixer", "get_root_motion_rotation", 1222331677L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_scale */
  final def getRootMotionScale(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("AnimationMixer", "get_root_motion_scale", 3360562783L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_position_accumulator */
  final def getRootMotionPositionAccumulator(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("AnimationMixer", "get_root_motion_position_accumulator", 3360562783L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_rotation_accumulator */
  final def getRootMotionRotationAccumulator(): gdext.builtin.Quaternion =
    Ptrcall.call0[gdext.builtin.Quaternion](MethodBind.get("AnimationMixer", "get_root_motion_rotation_accumulator", 1222331677L), hostObject.objectPtr)

  /** AnimationMixer.get_root_motion_scale_accumulator */
  final def getRootMotionScaleAccumulator(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("AnimationMixer", "get_root_motion_scale_accumulator", 3360562783L), hostObject.objectPtr)

  /** AnimationMixer.clear_caches */
  final def clearCaches(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationMixer", "clear_caches", 3218959716L), hostObject.objectPtr)

  /** AnimationMixer.advance */
  final def advance(delta: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "advance", 373806689L), hostObject.objectPtr, delta)

  /** AnimationMixer.capture */
  final def capture(name: gdext.builtin.StringName, duration: Double, trans_type: Long, ease_type: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("AnimationMixer", "capture", 1333632127L), hostObject.objectPtr, name, duration, trans_type, ease_type)

  /** AnimationMixer.set_reset_on_save_enabled */
  final def setResetOnSaveEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationMixer", "set_reset_on_save_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** AnimationMixer.is_reset_on_save_enabled */
  final def isResetOnSaveEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationMixer", "is_reset_on_save_enabled", 36873697L), hostObject.objectPtr)

  /** AnimationMixer.find_animation */
  final def findAnimation(animation: Animation): gdext.builtin.StringName =
    Ptrcall.call1[GodotObject, gdext.builtin.StringName](MethodBind.get("AnimationMixer", "find_animation", 1559484580L), hostObject.objectPtr, animation.hostObject)

  /** AnimationMixer.find_animation_library */
  final def findAnimationLibrary(animation: Animation): gdext.builtin.StringName =
    Ptrcall.call1[GodotObject, gdext.builtin.StringName](MethodBind.get("AnimationMixer", "find_animation_library", 1559484580L), hostObject.objectPtr, animation.hostObject)

}

object AnimationMixer {
  /** Class metadata for Gd[AnimationMixer] lifetime management and casting. */
  given GodotClass[AnimationMixer] with {
    def className = "AnimationMixer"
    def isRefCounted = false
    def wrap(o: GodotObject): AnimationMixer = new AnimationMixer {}.withHost(o.objectPtr)
    def unwrap(t: AnimationMixer): GodotObject = t.hostObject
  }
}
