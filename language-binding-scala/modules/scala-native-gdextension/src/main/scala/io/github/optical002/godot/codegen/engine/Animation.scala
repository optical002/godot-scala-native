package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Animation`, extends `Resource`. */
abstract class Animation extends Resource {

  /** Animation.add_track */
  final def addTrack(`type`: Long, at_position: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("Animation", "add_track", 3843682357L), hostObject.objectPtr, `type`, at_position)

  /** Animation.remove_track */
  final def removeTrack(track_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "remove_track", 1286410249L), hostObject.objectPtr, track_idx)

  /** Animation.get_track_count */
  final def getTrackCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Animation", "get_track_count", 3905245786L), hostObject.objectPtr)

  /** Animation.track_get_type */
  final def trackGetType(track_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Animation", "track_get_type", 3445944217L), hostObject.objectPtr, track_idx)

  /** Animation.track_move_up */
  final def trackMoveUp(track_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "track_move_up", 1286410249L), hostObject.objectPtr, track_idx)

  /** Animation.track_move_down */
  final def trackMoveDown(track_idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "track_move_down", 1286410249L), hostObject.objectPtr, track_idx)

  /** Animation.track_move_to */
  final def trackMoveTo(track_idx: Long, to_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_move_to", 3937882851L), hostObject.objectPtr, track_idx, to_idx)

  /** Animation.track_swap */
  final def trackSwap(track_idx: Long, with_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_swap", 3937882851L), hostObject.objectPtr, track_idx, with_idx)

  /** Animation.track_set_imported */
  final def trackSetImported(track_idx: Long, imported: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_set_imported", 300928843L), hostObject.objectPtr, track_idx, imported)

  /** Animation.track_is_imported */
  final def trackIsImported(track_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Animation", "track_is_imported", 1116898809L), hostObject.objectPtr, track_idx)

  /** Animation.track_set_enabled */
  final def trackSetEnabled(track_idx: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_set_enabled", 300928843L), hostObject.objectPtr, track_idx, enabled)

  /** Animation.track_is_enabled */
  final def trackIsEnabled(track_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Animation", "track_is_enabled", 1116898809L), hostObject.objectPtr, track_idx)

  /** Animation.position_track_insert_key */
  final def positionTrackInsertKey(track_idx: Long, time: Double, position: io.github.optical002.godot.builtin.Vector3): Long =
    Ptrcall.call3[Long, Double, io.github.optical002.godot.builtin.Vector3, Long](MethodBind.get("Animation", "position_track_insert_key", 2540608232L), hostObject.objectPtr, track_idx, time, position)

  /** Animation.rotation_track_insert_key */
  final def rotationTrackInsertKey(track_idx: Long, time: Double, rotation: io.github.optical002.godot.builtin.Quaternion): Long =
    Ptrcall.call3[Long, Double, io.github.optical002.godot.builtin.Quaternion, Long](MethodBind.get("Animation", "rotation_track_insert_key", 4165004800L), hostObject.objectPtr, track_idx, time, rotation)

  /** Animation.scale_track_insert_key */
  final def scaleTrackInsertKey(track_idx: Long, time: Double, scale: io.github.optical002.godot.builtin.Vector3): Long =
    Ptrcall.call3[Long, Double, io.github.optical002.godot.builtin.Vector3, Long](MethodBind.get("Animation", "scale_track_insert_key", 2540608232L), hostObject.objectPtr, track_idx, time, scale)

  /** Animation.blend_shape_track_insert_key */
  final def blendShapeTrackInsertKey(track_idx: Long, time: Double, amount: Double): Long =
    Ptrcall.call3[Long, Double, Double, Long](MethodBind.get("Animation", "blend_shape_track_insert_key", 1534913637L), hostObject.objectPtr, track_idx, time, amount)

  /** Animation.position_track_interpolate */
  final def positionTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call3[Long, Double, Boolean, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Animation", "position_track_interpolate", 3530011197L), hostObject.objectPtr, track_idx, time_sec, backward)

  /** Animation.rotation_track_interpolate */
  final def rotationTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): io.github.optical002.godot.builtin.Quaternion =
    Ptrcall.call3[Long, Double, Boolean, io.github.optical002.godot.builtin.Quaternion](MethodBind.get("Animation", "rotation_track_interpolate", 2915876792L), hostObject.objectPtr, track_idx, time_sec, backward)

  /** Animation.scale_track_interpolate */
  final def scaleTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call3[Long, Double, Boolean, io.github.optical002.godot.builtin.Vector3](MethodBind.get("Animation", "scale_track_interpolate", 3530011197L), hostObject.objectPtr, track_idx, time_sec, backward)

  /** Animation.blend_shape_track_interpolate */
  final def blendShapeTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): Double =
    Ptrcall.call3[Long, Double, Boolean, Double](MethodBind.get("Animation", "blend_shape_track_interpolate", 2482365182L), hostObject.objectPtr, track_idx, time_sec, backward)

  /** Animation.track_remove_key */
  final def trackRemoveKey(track_idx: Long, key_idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_remove_key", 3937882851L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.track_remove_key_at_time */
  final def trackRemoveKeyAtTime(track_idx: Long, time: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_remove_key_at_time", 1602489585L), hostObject.objectPtr, track_idx, time)

  /** Animation.track_set_key_transition */
  final def trackSetKeyTransition(track_idx: Long, key_idx: Long, transition: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "track_set_key_transition", 3506521499L), hostObject.objectPtr, track_idx, key_idx, transition)

  /** Animation.track_set_key_time */
  final def trackSetKeyTime(track_idx: Long, key_idx: Long, time: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "track_set_key_time", 3506521499L), hostObject.objectPtr, track_idx, key_idx, time)

  /** Animation.track_get_key_transition */
  final def trackGetKeyTransition(track_idx: Long, key_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Animation", "track_get_key_transition", 3085491603L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.track_get_key_count */
  final def trackGetKeyCount(track_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Animation", "track_get_key_count", 923996154L), hostObject.objectPtr, track_idx)

  /** Animation.track_get_key_time */
  final def trackGetKeyTime(track_idx: Long, key_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Animation", "track_get_key_time", 3085491603L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.track_find_key */
  final def trackFindKey(track_idx: Long, time: Double, find_mode: Long, limit: Boolean, backward: Boolean): Long =
    Ptrcall.call5[Long, Double, Long, Boolean, Boolean, Long](MethodBind.get("Animation", "track_find_key", 4230953007L), hostObject.objectPtr, track_idx, time, find_mode, limit, backward)

  /** Animation.track_set_interpolation_type */
  final def trackSetInterpolationType(track_idx: Long, interpolation: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_set_interpolation_type", 4112932513L), hostObject.objectPtr, track_idx, interpolation)

  /** Animation.track_get_interpolation_type */
  final def trackGetInterpolationType(track_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Animation", "track_get_interpolation_type", 1530756894L), hostObject.objectPtr, track_idx)

  /** Animation.track_set_interpolation_loop_wrap */
  final def trackSetInterpolationLoopWrap(track_idx: Long, interpolation: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "track_set_interpolation_loop_wrap", 300928843L), hostObject.objectPtr, track_idx, interpolation)

  /** Animation.track_get_interpolation_loop_wrap */
  final def trackGetInterpolationLoopWrap(track_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Animation", "track_get_interpolation_loop_wrap", 1116898809L), hostObject.objectPtr, track_idx)

  /** Animation.track_is_compressed */
  final def trackIsCompressed(track_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Animation", "track_is_compressed", 1116898809L), hostObject.objectPtr, track_idx)

  /** Animation.value_track_set_update_mode */
  final def valueTrackSetUpdateMode(track_idx: Long, mode: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "value_track_set_update_mode", 2854058312L), hostObject.objectPtr, track_idx, mode)

  /** Animation.value_track_get_update_mode */
  final def valueTrackGetUpdateMode(track_idx: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Animation", "value_track_get_update_mode", 1440326473L), hostObject.objectPtr, track_idx)

  /** Animation.method_track_get_name */
  final def methodTrackGetName(track_idx: Long, key_idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("Animation", "method_track_get_name", 351665558L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.bezier_track_insert_key */
  final def bezierTrackInsertKey(track_idx: Long, time: Double, value: Double, in_handle: io.github.optical002.godot.builtin.Vector2, out_handle: io.github.optical002.godot.builtin.Vector2): Long =
    Ptrcall.call5[Long, Double, Double, io.github.optical002.godot.builtin.Vector2, io.github.optical002.godot.builtin.Vector2, Long](MethodBind.get("Animation", "bezier_track_insert_key", 3656773645L), hostObject.objectPtr, track_idx, time, value, in_handle, out_handle)

  /** Animation.bezier_track_set_key_value */
  final def bezierTrackSetKeyValue(track_idx: Long, key_idx: Long, value: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "bezier_track_set_key_value", 3506521499L), hostObject.objectPtr, track_idx, key_idx, value)

  /** Animation.bezier_track_set_key_in_handle */
  final def bezierTrackSetKeyInHandle(track_idx: Long, key_idx: Long, in_handle: io.github.optical002.godot.builtin.Vector2, balanced_value_time_ratio: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("Animation", "bezier_track_set_key_in_handle", 1719223284L), hostObject.objectPtr, track_idx, key_idx, in_handle, balanced_value_time_ratio)

  /** Animation.bezier_track_set_key_out_handle */
  final def bezierTrackSetKeyOutHandle(track_idx: Long, key_idx: Long, out_handle: io.github.optical002.godot.builtin.Vector2, balanced_value_time_ratio: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("Animation", "bezier_track_set_key_out_handle", 1719223284L), hostObject.objectPtr, track_idx, key_idx, out_handle, balanced_value_time_ratio)

  /** Animation.bezier_track_get_key_value */
  final def bezierTrackGetKeyValue(track_idx: Long, key_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Animation", "bezier_track_get_key_value", 3085491603L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.bezier_track_get_key_in_handle */
  final def bezierTrackGetKeyInHandle(track_idx: Long, key_idx: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Animation", "bezier_track_get_key_in_handle", 3016396712L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.bezier_track_get_key_out_handle */
  final def bezierTrackGetKeyOutHandle(track_idx: Long, key_idx: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("Animation", "bezier_track_get_key_out_handle", 3016396712L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.bezier_track_interpolate */
  final def bezierTrackInterpolate(track_idx: Long, time: Double): Double =
    Ptrcall.call2[Long, Double, Double](MethodBind.get("Animation", "bezier_track_interpolate", 1900462983L), hostObject.objectPtr, track_idx, time)

  /** Animation.audio_track_insert_key */
  final def audioTrackInsertKey(track_idx: Long, time: Double, stream: Resource, start_offset: Double, end_offset: Double): Long =
    Ptrcall.call5[Long, Double, GodotObject, Double, Double, Long](MethodBind.get("Animation", "audio_track_insert_key", 4021027286L), hostObject.objectPtr, track_idx, time, stream.hostObject, start_offset, end_offset)

  /** Animation.audio_track_set_key_stream */
  final def audioTrackSetKeyStream(track_idx: Long, key_idx: Long, stream: Resource): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "audio_track_set_key_stream", 3886397084L), hostObject.objectPtr, track_idx, key_idx, stream.hostObject)

  /** Animation.audio_track_set_key_start_offset */
  final def audioTrackSetKeyStartOffset(track_idx: Long, key_idx: Long, offset: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "audio_track_set_key_start_offset", 3506521499L), hostObject.objectPtr, track_idx, key_idx, offset)

  /** Animation.audio_track_set_key_end_offset */
  final def audioTrackSetKeyEndOffset(track_idx: Long, key_idx: Long, offset: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "audio_track_set_key_end_offset", 3506521499L), hostObject.objectPtr, track_idx, key_idx, offset)

  /** Animation.audio_track_get_key_stream */
  final def audioTrackGetKeyStream(track_idx: Long, key_idx: Long): GodotObject =
    Ptrcall.call2[Long, Long, GodotObject](MethodBind.get("Animation", "audio_track_get_key_stream", 635277205L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.audio_track_get_key_start_offset */
  final def audioTrackGetKeyStartOffset(track_idx: Long, key_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Animation", "audio_track_get_key_start_offset", 3085491603L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.audio_track_get_key_end_offset */
  final def audioTrackGetKeyEndOffset(track_idx: Long, key_idx: Long): Double =
    Ptrcall.call2[Long, Long, Double](MethodBind.get("Animation", "audio_track_get_key_end_offset", 3085491603L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.audio_track_set_use_blend */
  final def audioTrackSetUseBlend(track_idx: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "audio_track_set_use_blend", 300928843L), hostObject.objectPtr, track_idx, enable)

  /** Animation.audio_track_is_use_blend */
  final def audioTrackIsUseBlend(track_idx: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Animation", "audio_track_is_use_blend", 1116898809L), hostObject.objectPtr, track_idx)

  /** Animation.animation_track_insert_key */
  final def animationTrackInsertKey(track_idx: Long, time: Double, animation: io.github.optical002.godot.builtin.StringName): Long =
    Ptrcall.call3[Long, Double, io.github.optical002.godot.builtin.StringName, Long](MethodBind.get("Animation", "animation_track_insert_key", 158676774L), hostObject.objectPtr, track_idx, time, animation)

  /** Animation.animation_track_set_key_animation */
  final def animationTrackSetKeyAnimation(track_idx: Long, key_idx: Long, animation: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "animation_track_set_key_animation", 117615382L), hostObject.objectPtr, track_idx, key_idx, animation)

  /** Animation.animation_track_get_key_animation */
  final def animationTrackGetKeyAnimation(track_idx: Long, key_idx: Long): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call2[Long, Long, io.github.optical002.godot.builtin.StringName](MethodBind.get("Animation", "animation_track_get_key_animation", 351665558L), hostObject.objectPtr, track_idx, key_idx)

  /** Animation.add_marker */
  final def addMarker(name: io.github.optical002.godot.builtin.StringName, time: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "add_marker", 4135858297L), hostObject.objectPtr, name, time)

  /** Animation.remove_marker */
  final def removeMarker(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "remove_marker", 3304788590L), hostObject.objectPtr, name)

  /** Animation.has_marker */
  final def hasMarker(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("Animation", "has_marker", 2619796661L), hostObject.objectPtr, name)

  /** Animation.get_marker_at_time */
  final def getMarkerAtTime(time: Double): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Double, io.github.optical002.godot.builtin.StringName](MethodBind.get("Animation", "get_marker_at_time", 4079494655L), hostObject.objectPtr, time)

  /** Animation.get_next_marker */
  final def getNextMarker(time: Double): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Double, io.github.optical002.godot.builtin.StringName](MethodBind.get("Animation", "get_next_marker", 4079494655L), hostObject.objectPtr, time)

  /** Animation.get_prev_marker */
  final def getPrevMarker(time: Double): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call1[Double, io.github.optical002.godot.builtin.StringName](MethodBind.get("Animation", "get_prev_marker", 4079494655L), hostObject.objectPtr, time)

  /** Animation.get_marker_time */
  final def getMarkerTime(name: io.github.optical002.godot.builtin.StringName): Double =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Double](MethodBind.get("Animation", "get_marker_time", 2349060816L), hostObject.objectPtr, name)

  /** Animation.get_marker_color */
  final def getMarkerColor(name: io.github.optical002.godot.builtin.StringName): io.github.optical002.godot.builtin.Color =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, io.github.optical002.godot.builtin.Color](MethodBind.get("Animation", "get_marker_color", 3742943038L), hostObject.objectPtr, name)

  /** Animation.set_marker_color */
  final def setMarkerColor(name: io.github.optical002.godot.builtin.StringName, color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "set_marker_color", 4260178595L), hostObject.objectPtr, name, color)

  /** Animation.set_length */
  final def setLength(time_sec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "set_length", 373806689L), hostObject.objectPtr, time_sec)

  /** Animation.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Animation", "get_length", 1740695150L), hostObject.objectPtr)

  /** Animation.set_loop_mode */
  final def setLoopMode(loop_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "set_loop_mode", 3155355575L), hostObject.objectPtr, loop_mode)

  /** Animation.get_loop_mode */
  final def getLoopMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Animation", "get_loop_mode", 1988889481L), hostObject.objectPtr)

  /** Animation.set_step */
  final def setStep(size_sec: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Animation", "set_step", 373806689L), hostObject.objectPtr, size_sec)

  /** Animation.get_step */
  final def getStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("Animation", "get_step", 1740695150L), hostObject.objectPtr)

  /** Animation.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Animation", "clear", 3218959716L), hostObject.objectPtr)

  /** Animation.copy_track */
  final def copyTrack(track_idx: Long, to_animation: Animation): Unit =
    Ptrcall.callVoid2(MethodBind.get("Animation", "copy_track", 148001024L), hostObject.objectPtr, track_idx, to_animation.hostObject)

  /** Animation.optimize */
  final def optimize(allowed_velocity_err: Double, allowed_angular_err: Double, precision: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "optimize", 3303583852L), hostObject.objectPtr, allowed_velocity_err, allowed_angular_err, precision)

  /** Animation.compress */
  final def compress(page_size: Long, fps: Long, split_tolerance: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Animation", "compress", 3608408117L), hostObject.objectPtr, page_size, fps, split_tolerance)

  /** Animation.is_capture_included */
  final def isCaptureIncluded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Animation", "is_capture_included", 36873697L), hostObject.objectPtr)

}

object Animation {
  /** Class metadata for Gd[Animation] lifetime management and casting. */
  given GodotClass[Animation] with {
    def className = "Animation"
    def isRefCounted = true
    def wrap(o: GodotObject): Animation = new Animation {}.withHost(o.objectPtr)
    def unwrap(t: Animation): GodotObject = t.hostObject
  }
}
