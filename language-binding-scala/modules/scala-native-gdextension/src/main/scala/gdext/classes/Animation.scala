package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Animation`, extends `Resource`. */
abstract class Animation extends Resource {
  override def godotClassName: String = "Animation"

  /** Animation.add_track */
  final def addTrack(`type`: Long, at_position: Long): Long = {
    if (gdext.classes.Animation.mb_add_track == null) gdext.classes.Animation.mb_add_track = MethodBind.get("Animation", "add_track", 3843682357L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.Animation.mb_add_track, livePtr, `type`, at_position)
  }

  /** Animation.remove_track */
  final def removeTrack(track_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_remove_track == null) gdext.classes.Animation.mb_remove_track = MethodBind.get("Animation", "remove_track", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_remove_track, livePtr, track_idx)
  }

  /** Animation.get_track_count */
  final def getTrackCount(): Long = {
    if (gdext.classes.Animation.mb_get_track_count == null) gdext.classes.Animation.mb_get_track_count = MethodBind.get("Animation", "get_track_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Animation.mb_get_track_count, livePtr)
  }

  /** Animation.track_get_type */
  final def trackGetType(track_idx: Long): Long = {
    if (gdext.classes.Animation.mb_track_get_type == null) gdext.classes.Animation.mb_track_get_type = MethodBind.get("Animation", "track_get_type", 3445944217L)
    Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_type, livePtr, track_idx)
  }

  /** Animation.track_move_up */
  final def trackMoveUp(track_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_up == null) gdext.classes.Animation.mb_track_move_up = MethodBind.get("Animation", "track_move_up", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_track_move_up, livePtr, track_idx)
  }

  /** Animation.track_move_down */
  final def trackMoveDown(track_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_down == null) gdext.classes.Animation.mb_track_move_down = MethodBind.get("Animation", "track_move_down", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_track_move_down, livePtr, track_idx)
  }

  /** Animation.track_move_to */
  final def trackMoveTo(track_idx: Long, to_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_to == null) gdext.classes.Animation.mb_track_move_to = MethodBind.get("Animation", "track_move_to", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_move_to, livePtr, track_idx, to_idx)
  }

  /** Animation.track_swap */
  final def trackSwap(track_idx: Long, with_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_swap == null) gdext.classes.Animation.mb_track_swap = MethodBind.get("Animation", "track_swap", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_swap, livePtr, track_idx, with_idx)
  }

  /** Animation.track_set_imported */
  final def trackSetImported(track_idx: Long, imported: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_imported == null) gdext.classes.Animation.mb_track_set_imported = MethodBind.get("Animation", "track_set_imported", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_imported, livePtr, track_idx, imported)
  }

  /** Animation.track_is_imported */
  final def trackIsImported(track_idx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_imported == null) gdext.classes.Animation.mb_track_is_imported = MethodBind.get("Animation", "track_is_imported", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_imported, livePtr, track_idx)
  }

  /** Animation.track_set_enabled */
  final def trackSetEnabled(track_idx: Long, enabled: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_enabled == null) gdext.classes.Animation.mb_track_set_enabled = MethodBind.get("Animation", "track_set_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_enabled, livePtr, track_idx, enabled)
  }

  /** Animation.track_is_enabled */
  final def trackIsEnabled(track_idx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_enabled == null) gdext.classes.Animation.mb_track_is_enabled = MethodBind.get("Animation", "track_is_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_enabled, livePtr, track_idx)
  }

  /** Animation.position_track_insert_key */
  final def positionTrackInsertKey(track_idx: Long, time: Double, position: gdext.builtin.Vector3): Long = {
    if (gdext.classes.Animation.mb_position_track_insert_key == null) gdext.classes.Animation.mb_position_track_insert_key = MethodBind.get("Animation", "position_track_insert_key", 2540608232L)
    Ptrcall.call3[Long, Double, gdext.builtin.Vector3, Long](gdext.classes.Animation.mb_position_track_insert_key, livePtr, track_idx, time, position)
  }

  /** Animation.rotation_track_insert_key */
  final def rotationTrackInsertKey(track_idx: Long, time: Double, rotation: gdext.builtin.Quaternion): Long = {
    if (gdext.classes.Animation.mb_rotation_track_insert_key == null) gdext.classes.Animation.mb_rotation_track_insert_key = MethodBind.get("Animation", "rotation_track_insert_key", 4165004800L)
    Ptrcall.call3[Long, Double, gdext.builtin.Quaternion, Long](gdext.classes.Animation.mb_rotation_track_insert_key, livePtr, track_idx, time, rotation)
  }

  /** Animation.scale_track_insert_key */
  final def scaleTrackInsertKey(track_idx: Long, time: Double, scale: gdext.builtin.Vector3): Long = {
    if (gdext.classes.Animation.mb_scale_track_insert_key == null) gdext.classes.Animation.mb_scale_track_insert_key = MethodBind.get("Animation", "scale_track_insert_key", 2540608232L)
    Ptrcall.call3[Long, Double, gdext.builtin.Vector3, Long](gdext.classes.Animation.mb_scale_track_insert_key, livePtr, track_idx, time, scale)
  }

  /** Animation.blend_shape_track_insert_key */
  final def blendShapeTrackInsertKey(track_idx: Long, time: Double, amount: Double): Long = {
    if (gdext.classes.Animation.mb_blend_shape_track_insert_key == null) gdext.classes.Animation.mb_blend_shape_track_insert_key = MethodBind.get("Animation", "blend_shape_track_insert_key", 1534913637L)
    Ptrcall.call3[Long, Double, Double, Long](gdext.classes.Animation.mb_blend_shape_track_insert_key, livePtr, track_idx, time, amount)
  }

  /** Animation.position_track_interpolate */
  final def positionTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): gdext.builtin.Vector3 = {
    if (gdext.classes.Animation.mb_position_track_interpolate == null) gdext.classes.Animation.mb_position_track_interpolate = MethodBind.get("Animation", "position_track_interpolate", 3530011197L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Vector3](gdext.classes.Animation.mb_position_track_interpolate, livePtr, track_idx, time_sec, backward)
  }

  /** Animation.rotation_track_interpolate */
  final def rotationTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): gdext.builtin.Quaternion = {
    if (gdext.classes.Animation.mb_rotation_track_interpolate == null) gdext.classes.Animation.mb_rotation_track_interpolate = MethodBind.get("Animation", "rotation_track_interpolate", 2915876792L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Quaternion](gdext.classes.Animation.mb_rotation_track_interpolate, livePtr, track_idx, time_sec, backward)
  }

  /** Animation.scale_track_interpolate */
  final def scaleTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): gdext.builtin.Vector3 = {
    if (gdext.classes.Animation.mb_scale_track_interpolate == null) gdext.classes.Animation.mb_scale_track_interpolate = MethodBind.get("Animation", "scale_track_interpolate", 3530011197L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Vector3](gdext.classes.Animation.mb_scale_track_interpolate, livePtr, track_idx, time_sec, backward)
  }

  /** Animation.blend_shape_track_interpolate */
  final def blendShapeTrackInterpolate(track_idx: Long, time_sec: Double, backward: Boolean): Double = {
    if (gdext.classes.Animation.mb_blend_shape_track_interpolate == null) gdext.classes.Animation.mb_blend_shape_track_interpolate = MethodBind.get("Animation", "blend_shape_track_interpolate", 2482365182L)
    Ptrcall.call3[Long, Double, Boolean, Double](gdext.classes.Animation.mb_blend_shape_track_interpolate, livePtr, track_idx, time_sec, backward)
  }

  /** Animation.track_remove_key */
  final def trackRemoveKey(track_idx: Long, key_idx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_remove_key == null) gdext.classes.Animation.mb_track_remove_key = MethodBind.get("Animation", "track_remove_key", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_remove_key, livePtr, track_idx, key_idx)
  }

  /** Animation.track_remove_key_at_time */
  final def trackRemoveKeyAtTime(track_idx: Long, time: Double): Unit = {
    if (gdext.classes.Animation.mb_track_remove_key_at_time == null) gdext.classes.Animation.mb_track_remove_key_at_time = MethodBind.get("Animation", "track_remove_key_at_time", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_remove_key_at_time, livePtr, track_idx, time)
  }

  /** Animation.track_set_key_transition */
  final def trackSetKeyTransition(track_idx: Long, key_idx: Long, transition: Double): Unit = {
    if (gdext.classes.Animation.mb_track_set_key_transition == null) gdext.classes.Animation.mb_track_set_key_transition = MethodBind.get("Animation", "track_set_key_transition", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_track_set_key_transition, livePtr, track_idx, key_idx, transition)
  }

  /** Animation.track_set_key_time */
  final def trackSetKeyTime(track_idx: Long, key_idx: Long, time: Double): Unit = {
    if (gdext.classes.Animation.mb_track_set_key_time == null) gdext.classes.Animation.mb_track_set_key_time = MethodBind.get("Animation", "track_set_key_time", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_track_set_key_time, livePtr, track_idx, key_idx, time)
  }

  /** Animation.track_get_key_transition */
  final def trackGetKeyTransition(track_idx: Long, key_idx: Long): Double = {
    if (gdext.classes.Animation.mb_track_get_key_transition == null) gdext.classes.Animation.mb_track_get_key_transition = MethodBind.get("Animation", "track_get_key_transition", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_track_get_key_transition, livePtr, track_idx, key_idx)
  }

  /** Animation.track_get_key_count */
  final def trackGetKeyCount(track_idx: Long): Long = {
    if (gdext.classes.Animation.mb_track_get_key_count == null) gdext.classes.Animation.mb_track_get_key_count = MethodBind.get("Animation", "track_get_key_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_key_count, livePtr, track_idx)
  }

  /** Animation.track_get_key_time */
  final def trackGetKeyTime(track_idx: Long, key_idx: Long): Double = {
    if (gdext.classes.Animation.mb_track_get_key_time == null) gdext.classes.Animation.mb_track_get_key_time = MethodBind.get("Animation", "track_get_key_time", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_track_get_key_time, livePtr, track_idx, key_idx)
  }

  /** Animation.track_find_key */
  final def trackFindKey(track_idx: Long, time: Double, find_mode: Long, limit: Boolean, backward: Boolean): Long = {
    if (gdext.classes.Animation.mb_track_find_key == null) gdext.classes.Animation.mb_track_find_key = MethodBind.get("Animation", "track_find_key", 4230953007L)
    Ptrcall.call5[Long, Double, Long, Boolean, Boolean, Long](gdext.classes.Animation.mb_track_find_key, livePtr, track_idx, time, find_mode, limit, backward)
  }

  /** Animation.track_set_interpolation_type */
  final def trackSetInterpolationType(track_idx: Long, interpolation: Long): Unit = {
    if (gdext.classes.Animation.mb_track_set_interpolation_type == null) gdext.classes.Animation.mb_track_set_interpolation_type = MethodBind.get("Animation", "track_set_interpolation_type", 4112932513L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_interpolation_type, livePtr, track_idx, interpolation)
  }

  /** Animation.track_get_interpolation_type */
  final def trackGetInterpolationType(track_idx: Long): Long = {
    if (gdext.classes.Animation.mb_track_get_interpolation_type == null) gdext.classes.Animation.mb_track_get_interpolation_type = MethodBind.get("Animation", "track_get_interpolation_type", 1530756894L)
    Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_interpolation_type, livePtr, track_idx)
  }

  /** Animation.track_set_interpolation_loop_wrap */
  final def trackSetInterpolationLoopWrap(track_idx: Long, interpolation: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_interpolation_loop_wrap == null) gdext.classes.Animation.mb_track_set_interpolation_loop_wrap = MethodBind.get("Animation", "track_set_interpolation_loop_wrap", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_interpolation_loop_wrap, livePtr, track_idx, interpolation)
  }

  /** Animation.track_get_interpolation_loop_wrap */
  final def trackGetInterpolationLoopWrap(track_idx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_get_interpolation_loop_wrap == null) gdext.classes.Animation.mb_track_get_interpolation_loop_wrap = MethodBind.get("Animation", "track_get_interpolation_loop_wrap", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_get_interpolation_loop_wrap, livePtr, track_idx)
  }

  /** Animation.track_is_compressed */
  final def trackIsCompressed(track_idx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_compressed == null) gdext.classes.Animation.mb_track_is_compressed = MethodBind.get("Animation", "track_is_compressed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_compressed, livePtr, track_idx)
  }

  /** Animation.value_track_set_update_mode */
  final def valueTrackSetUpdateMode(track_idx: Long, mode: Long): Unit = {
    if (gdext.classes.Animation.mb_value_track_set_update_mode == null) gdext.classes.Animation.mb_value_track_set_update_mode = MethodBind.get("Animation", "value_track_set_update_mode", 2854058312L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_value_track_set_update_mode, livePtr, track_idx, mode)
  }

  /** Animation.value_track_get_update_mode */
  final def valueTrackGetUpdateMode(track_idx: Long): Long = {
    if (gdext.classes.Animation.mb_value_track_get_update_mode == null) gdext.classes.Animation.mb_value_track_get_update_mode = MethodBind.get("Animation", "value_track_get_update_mode", 1440326473L)
    Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_value_track_get_update_mode, livePtr, track_idx)
  }

  /** Animation.method_track_get_name */
  final def methodTrackGetName(track_idx: Long, key_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.Animation.mb_method_track_get_name == null) gdext.classes.Animation.mb_method_track_get_name = MethodBind.get("Animation", "method_track_get_name", 351665558L)
    Ptrcall.call2[Long, Long, gdext.builtin.StringName](gdext.classes.Animation.mb_method_track_get_name, livePtr, track_idx, key_idx)
  }

  /** Animation.bezier_track_insert_key */
  final def bezierTrackInsertKey(track_idx: Long, time: Double, value: Double, in_handle: gdext.builtin.Vector2, out_handle: gdext.builtin.Vector2): Long = {
    if (gdext.classes.Animation.mb_bezier_track_insert_key == null) gdext.classes.Animation.mb_bezier_track_insert_key = MethodBind.get("Animation", "bezier_track_insert_key", 3656773645L)
    Ptrcall.call5[Long, Double, Double, gdext.builtin.Vector2, gdext.builtin.Vector2, Long](gdext.classes.Animation.mb_bezier_track_insert_key, livePtr, track_idx, time, value, in_handle, out_handle)
  }

  /** Animation.bezier_track_set_key_value */
  final def bezierTrackSetKeyValue(track_idx: Long, key_idx: Long, value: Double): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_value == null) gdext.classes.Animation.mb_bezier_track_set_key_value = MethodBind.get("Animation", "bezier_track_set_key_value", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_bezier_track_set_key_value, livePtr, track_idx, key_idx, value)
  }

  /** Animation.bezier_track_set_key_in_handle */
  final def bezierTrackSetKeyInHandle(track_idx: Long, key_idx: Long, in_handle: gdext.builtin.Vector2, balanced_value_time_ratio: Double): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_in_handle == null) gdext.classes.Animation.mb_bezier_track_set_key_in_handle = MethodBind.get("Animation", "bezier_track_set_key_in_handle", 1719223284L)
    Ptrcall.callVoid4(gdext.classes.Animation.mb_bezier_track_set_key_in_handle, livePtr, track_idx, key_idx, in_handle, balanced_value_time_ratio)
  }

  /** Animation.bezier_track_set_key_out_handle */
  final def bezierTrackSetKeyOutHandle(track_idx: Long, key_idx: Long, out_handle: gdext.builtin.Vector2, balanced_value_time_ratio: Double): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_out_handle == null) gdext.classes.Animation.mb_bezier_track_set_key_out_handle = MethodBind.get("Animation", "bezier_track_set_key_out_handle", 1719223284L)
    Ptrcall.callVoid4(gdext.classes.Animation.mb_bezier_track_set_key_out_handle, livePtr, track_idx, key_idx, out_handle, balanced_value_time_ratio)
  }

  /** Animation.bezier_track_get_key_value */
  final def bezierTrackGetKeyValue(track_idx: Long, key_idx: Long): Double = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_value == null) gdext.classes.Animation.mb_bezier_track_get_key_value = MethodBind.get("Animation", "bezier_track_get_key_value", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_bezier_track_get_key_value, livePtr, track_idx, key_idx)
  }

  /** Animation.bezier_track_get_key_in_handle */
  final def bezierTrackGetKeyInHandle(track_idx: Long, key_idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_in_handle == null) gdext.classes.Animation.mb_bezier_track_get_key_in_handle = MethodBind.get("Animation", "bezier_track_get_key_in_handle", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.Animation.mb_bezier_track_get_key_in_handle, livePtr, track_idx, key_idx)
  }

  /** Animation.bezier_track_get_key_out_handle */
  final def bezierTrackGetKeyOutHandle(track_idx: Long, key_idx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_out_handle == null) gdext.classes.Animation.mb_bezier_track_get_key_out_handle = MethodBind.get("Animation", "bezier_track_get_key_out_handle", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.Animation.mb_bezier_track_get_key_out_handle, livePtr, track_idx, key_idx)
  }

  /** Animation.bezier_track_interpolate */
  final def bezierTrackInterpolate(track_idx: Long, time: Double): Double = {
    if (gdext.classes.Animation.mb_bezier_track_interpolate == null) gdext.classes.Animation.mb_bezier_track_interpolate = MethodBind.get("Animation", "bezier_track_interpolate", 1900462983L)
    Ptrcall.call2[Long, Double, Double](gdext.classes.Animation.mb_bezier_track_interpolate, livePtr, track_idx, time)
  }

  /** Animation.audio_track_insert_key */
  final def audioTrackInsertKey(track_idx: Long, time: Double, stream: Resource, start_offset: Double, end_offset: Double): Long = {
    if (gdext.classes.Animation.mb_audio_track_insert_key == null) gdext.classes.Animation.mb_audio_track_insert_key = MethodBind.get("Animation", "audio_track_insert_key", 4021027286L)
    Ptrcall.call5[Long, Double, GodotObject, Double, Double, Long](gdext.classes.Animation.mb_audio_track_insert_key, livePtr, track_idx, time, Wrappers.handle(stream), start_offset, end_offset)
  }

  /** Animation.audio_track_set_key_stream */
  final def audioTrackSetKeyStream(track_idx: Long, key_idx: Long, stream: Resource): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_stream == null) gdext.classes.Animation.mb_audio_track_set_key_stream = MethodBind.get("Animation", "audio_track_set_key_stream", 3886397084L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_stream, livePtr, track_idx, key_idx, Wrappers.handle(stream))
  }

  /** Animation.audio_track_set_key_start_offset */
  final def audioTrackSetKeyStartOffset(track_idx: Long, key_idx: Long, offset: Double): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_start_offset == null) gdext.classes.Animation.mb_audio_track_set_key_start_offset = MethodBind.get("Animation", "audio_track_set_key_start_offset", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_start_offset, livePtr, track_idx, key_idx, offset)
  }

  /** Animation.audio_track_set_key_end_offset */
  final def audioTrackSetKeyEndOffset(track_idx: Long, key_idx: Long, offset: Double): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_end_offset == null) gdext.classes.Animation.mb_audio_track_set_key_end_offset = MethodBind.get("Animation", "audio_track_set_key_end_offset", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_end_offset, livePtr, track_idx, key_idx, offset)
  }

  /** Animation.audio_track_get_key_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def audioTrackGetKeyStream(track_idx: Long, key_idx: Long): Resource = {
    if (gdext.classes.Animation.mb_audio_track_get_key_stream == null) gdext.classes.Animation.mb_audio_track_get_key_stream = MethodBind.get("Animation", "audio_track_get_key_stream", 635277205L)
    Wrappers.owned[Resource](Ptrcall.call2[Long, Long, Long](gdext.classes.Animation.mb_audio_track_get_key_stream, livePtr, track_idx, key_idx))
  }

  /** Animation.audio_track_get_key_start_offset */
  final def audioTrackGetKeyStartOffset(track_idx: Long, key_idx: Long): Double = {
    if (gdext.classes.Animation.mb_audio_track_get_key_start_offset == null) gdext.classes.Animation.mb_audio_track_get_key_start_offset = MethodBind.get("Animation", "audio_track_get_key_start_offset", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_audio_track_get_key_start_offset, livePtr, track_idx, key_idx)
  }

  /** Animation.audio_track_get_key_end_offset */
  final def audioTrackGetKeyEndOffset(track_idx: Long, key_idx: Long): Double = {
    if (gdext.classes.Animation.mb_audio_track_get_key_end_offset == null) gdext.classes.Animation.mb_audio_track_get_key_end_offset = MethodBind.get("Animation", "audio_track_get_key_end_offset", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_audio_track_get_key_end_offset, livePtr, track_idx, key_idx)
  }

  /** Animation.audio_track_set_use_blend */
  final def audioTrackSetUseBlend(track_idx: Long, enable: Boolean): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_use_blend == null) gdext.classes.Animation.mb_audio_track_set_use_blend = MethodBind.get("Animation", "audio_track_set_use_blend", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_audio_track_set_use_blend, livePtr, track_idx, enable)
  }

  /** Animation.audio_track_is_use_blend */
  final def audioTrackIsUseBlend(track_idx: Long): Boolean = {
    if (gdext.classes.Animation.mb_audio_track_is_use_blend == null) gdext.classes.Animation.mb_audio_track_is_use_blend = MethodBind.get("Animation", "audio_track_is_use_blend", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_audio_track_is_use_blend, livePtr, track_idx)
  }

  /** Animation.animation_track_insert_key */
  final def animationTrackInsertKey(track_idx: Long, time: Double, animation: gdext.builtin.StringName): Long = {
    if (gdext.classes.Animation.mb_animation_track_insert_key == null) gdext.classes.Animation.mb_animation_track_insert_key = MethodBind.get("Animation", "animation_track_insert_key", 158676774L)
    Ptrcall.call3[Long, Double, gdext.builtin.StringName, Long](gdext.classes.Animation.mb_animation_track_insert_key, livePtr, track_idx, time, animation)
  }

  /** Animation.animation_track_set_key_animation */
  final def animationTrackSetKeyAnimation(track_idx: Long, key_idx: Long, animation: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Animation.mb_animation_track_set_key_animation == null) gdext.classes.Animation.mb_animation_track_set_key_animation = MethodBind.get("Animation", "animation_track_set_key_animation", 117615382L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_animation_track_set_key_animation, livePtr, track_idx, key_idx, animation)
  }

  /** Animation.animation_track_get_key_animation */
  final def animationTrackGetKeyAnimation(track_idx: Long, key_idx: Long): gdext.builtin.StringName = {
    if (gdext.classes.Animation.mb_animation_track_get_key_animation == null) gdext.classes.Animation.mb_animation_track_get_key_animation = MethodBind.get("Animation", "animation_track_get_key_animation", 351665558L)
    Ptrcall.call2[Long, Long, gdext.builtin.StringName](gdext.classes.Animation.mb_animation_track_get_key_animation, livePtr, track_idx, key_idx)
  }

  /** Animation.add_marker */
  final def addMarker(name: gdext.builtin.StringName, time: Double): Unit = {
    if (gdext.classes.Animation.mb_add_marker == null) gdext.classes.Animation.mb_add_marker = MethodBind.get("Animation", "add_marker", 4135858297L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_add_marker, livePtr, name, time)
  }

  /** Animation.remove_marker */
  final def removeMarker(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Animation.mb_remove_marker == null) gdext.classes.Animation.mb_remove_marker = MethodBind.get("Animation", "remove_marker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_remove_marker, livePtr, name)
  }

  /** Animation.has_marker */
  final def hasMarker(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Animation.mb_has_marker == null) gdext.classes.Animation.mb_has_marker = MethodBind.get("Animation", "has_marker", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.Animation.mb_has_marker, livePtr, name)
  }

  /** Animation.get_marker_at_time */
  final def getMarkerAtTime(time: Double): gdext.builtin.StringName = {
    if (gdext.classes.Animation.mb_get_marker_at_time == null) gdext.classes.Animation.mb_get_marker_at_time = MethodBind.get("Animation", "get_marker_at_time", 4079494655L)
    Ptrcall.call1[Double, gdext.builtin.StringName](gdext.classes.Animation.mb_get_marker_at_time, livePtr, time)
  }

  /** Animation.get_next_marker */
  final def getNextMarker(time: Double): gdext.builtin.StringName = {
    if (gdext.classes.Animation.mb_get_next_marker == null) gdext.classes.Animation.mb_get_next_marker = MethodBind.get("Animation", "get_next_marker", 4079494655L)
    Ptrcall.call1[Double, gdext.builtin.StringName](gdext.classes.Animation.mb_get_next_marker, livePtr, time)
  }

  /** Animation.get_prev_marker */
  final def getPrevMarker(time: Double): gdext.builtin.StringName = {
    if (gdext.classes.Animation.mb_get_prev_marker == null) gdext.classes.Animation.mb_get_prev_marker = MethodBind.get("Animation", "get_prev_marker", 4079494655L)
    Ptrcall.call1[Double, gdext.builtin.StringName](gdext.classes.Animation.mb_get_prev_marker, livePtr, time)
  }

  /** Animation.get_marker_time */
  final def getMarkerTime(name: gdext.builtin.StringName): Double = {
    if (gdext.classes.Animation.mb_get_marker_time == null) gdext.classes.Animation.mb_get_marker_time = MethodBind.get("Animation", "get_marker_time", 2349060816L)
    Ptrcall.call1[gdext.builtin.StringName, Double](gdext.classes.Animation.mb_get_marker_time, livePtr, name)
  }

  /** Animation.get_marker_color */
  final def getMarkerColor(name: gdext.builtin.StringName): gdext.builtin.Color = {
    if (gdext.classes.Animation.mb_get_marker_color == null) gdext.classes.Animation.mb_get_marker_color = MethodBind.get("Animation", "get_marker_color", 3742943038L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.Color](gdext.classes.Animation.mb_get_marker_color, livePtr, name)
  }

  /** Animation.set_marker_color */
  final def setMarkerColor(name: gdext.builtin.StringName, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Animation.mb_set_marker_color == null) gdext.classes.Animation.mb_set_marker_color = MethodBind.get("Animation", "set_marker_color", 4260178595L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_set_marker_color, livePtr, name, color)
  }

  /** Animation.set_length */
  final def setLength(time_sec: Double): Unit = {
    if (gdext.classes.Animation.mb_set_length == null) gdext.classes.Animation.mb_set_length = MethodBind.get("Animation", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_length, livePtr, time_sec)
  }

  /** Animation.get_length */
  final def getLength(): Double = {
    if (gdext.classes.Animation.mb_get_length == null) gdext.classes.Animation.mb_get_length = MethodBind.get("Animation", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Animation.mb_get_length, livePtr)
  }

  /** Animation.set_loop_mode */
  final def setLoopMode(loop_mode: Long): Unit = {
    if (gdext.classes.Animation.mb_set_loop_mode == null) gdext.classes.Animation.mb_set_loop_mode = MethodBind.get("Animation", "set_loop_mode", 3155355575L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_loop_mode, livePtr, loop_mode)
  }

  /** Animation.get_loop_mode */
  final def getLoopMode(): Long = {
    if (gdext.classes.Animation.mb_get_loop_mode == null) gdext.classes.Animation.mb_get_loop_mode = MethodBind.get("Animation", "get_loop_mode", 1988889481L)
    Ptrcall.call0[Long](gdext.classes.Animation.mb_get_loop_mode, livePtr)
  }

  /** Animation.set_step */
  final def setStep(size_sec: Double): Unit = {
    if (gdext.classes.Animation.mb_set_step == null) gdext.classes.Animation.mb_set_step = MethodBind.get("Animation", "set_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_step, livePtr, size_sec)
  }

  /** Animation.get_step */
  final def getStep(): Double = {
    if (gdext.classes.Animation.mb_get_step == null) gdext.classes.Animation.mb_get_step = MethodBind.get("Animation", "get_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Animation.mb_get_step, livePtr)
  }

  /** Animation.clear */
  final def clear(): Unit = {
    if (gdext.classes.Animation.mb_clear == null) gdext.classes.Animation.mb_clear = MethodBind.get("Animation", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Animation.mb_clear, livePtr)
  }

  /** Animation.copy_track */
  final def copyTrack(track_idx: Long, to_animation: Animation): Unit = {
    if (gdext.classes.Animation.mb_copy_track == null) gdext.classes.Animation.mb_copy_track = MethodBind.get("Animation", "copy_track", 148001024L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_copy_track, livePtr, track_idx, Wrappers.handle(to_animation))
  }

  /** Animation.optimize */
  final def optimize(allowed_velocity_err: Double, allowed_angular_err: Double, precision: Long): Unit = {
    if (gdext.classes.Animation.mb_optimize == null) gdext.classes.Animation.mb_optimize = MethodBind.get("Animation", "optimize", 3303583852L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_optimize, livePtr, allowed_velocity_err, allowed_angular_err, precision)
  }

  /** Animation.compress */
  final def compress(page_size: Long, fps: Long, split_tolerance: Double): Unit = {
    if (gdext.classes.Animation.mb_compress == null) gdext.classes.Animation.mb_compress = MethodBind.get("Animation", "compress", 3608408117L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_compress, livePtr, page_size, fps, split_tolerance)
  }

  /** Animation.is_capture_included */
  final def isCaptureIncluded(): Boolean = {
    if (gdext.classes.Animation.mb_is_capture_included == null) gdext.classes.Animation.mb_is_capture_included = MethodBind.get("Animation", "is_capture_included", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Animation.mb_is_capture_included, livePtr)
  }

}

object Animation {
  private[classes] var mb_add_track: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_track: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_track_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_move_up: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_move_down: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_move_to: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_swap: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_imported: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_is_imported: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_position_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotation_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_scale_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_blend_shape_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_position_track_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotation_track_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_scale_track_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_blend_shape_track_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_remove_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_remove_key_at_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_key_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_key_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_key_transition: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_key_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_key_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_find_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_interpolation_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_interpolation_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_set_interpolation_loop_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_get_interpolation_loop_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_track_is_compressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_value_track_set_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_value_track_get_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_method_track_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_set_key_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_set_key_in_handle: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_set_key_out_handle: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_get_key_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_get_key_in_handle: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_get_key_out_handle: GDExtensionMethodBindPtr = null
  private[classes] var mb_bezier_track_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_set_key_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_set_key_start_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_set_key_end_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_get_key_stream: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_get_key_start_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_get_key_end_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_set_use_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_audio_track_is_use_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_animation_track_insert_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_animation_track_set_key_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_animation_track_get_key_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_marker: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_marker: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_marker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_at_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_next_marker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_prev_marker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_marker_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_copy_track: GDExtensionMethodBindPtr = null
  private[classes] var mb_optimize: GDExtensionMethodBindPtr = null
  private[classes] var mb_compress: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_capture_included: GDExtensionMethodBindPtr = null
}
