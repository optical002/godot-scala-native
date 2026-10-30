package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Animation`, extends `Resource`. */
abstract class Animation extends Resource {
  override def godotClassName: String = "Animation"

  /** Animation.add_track */
  final def addTrack(`type`: gdext.classes.Animation.TrackType, atPosition: Long = -1L): Long = {
    if (gdext.classes.Animation.mb_add_track == null) gdext.classes.Animation.mb_add_track = MethodBind.get("Animation", "add_track", 3843682357L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.Animation.mb_add_track, livePtr, `type`, atPosition)
  }

  /** Animation.remove_track */
  final def removeTrack(trackIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_remove_track == null) gdext.classes.Animation.mb_remove_track = MethodBind.get("Animation", "remove_track", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_remove_track, livePtr, trackIdx)
  }

  /** Animation.get_track_count */
  final def getTrackCount(): Long = {
    if (gdext.classes.Animation.mb_get_track_count == null) gdext.classes.Animation.mb_get_track_count = MethodBind.get("Animation", "get_track_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Animation.mb_get_track_count, livePtr)
  }

  /** Animation.track_get_type */
  final def trackGetType(trackIdx: Long): gdext.classes.Animation.TrackType = {
    if (gdext.classes.Animation.mb_track_get_type == null) gdext.classes.Animation.mb_track_get_type = MethodBind.get("Animation", "track_get_type", 3445944217L)
    gdext.classes.Animation.TrackType(Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_type, livePtr, trackIdx))
  }

  /** Animation.track_move_up */
  final def trackMoveUp(trackIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_up == null) gdext.classes.Animation.mb_track_move_up = MethodBind.get("Animation", "track_move_up", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_track_move_up, livePtr, trackIdx)
  }

  /** Animation.track_move_down */
  final def trackMoveDown(trackIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_down == null) gdext.classes.Animation.mb_track_move_down = MethodBind.get("Animation", "track_move_down", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_track_move_down, livePtr, trackIdx)
  }

  /** Animation.track_move_to */
  final def trackMoveTo(trackIdx: Long, toIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_move_to == null) gdext.classes.Animation.mb_track_move_to = MethodBind.get("Animation", "track_move_to", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_move_to, livePtr, trackIdx, toIdx)
  }

  /** Animation.track_swap */
  final def trackSwap(trackIdx: Long, withIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_swap == null) gdext.classes.Animation.mb_track_swap = MethodBind.get("Animation", "track_swap", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_swap, livePtr, trackIdx, withIdx)
  }

  /** Animation.track_set_imported */
  final def trackSetImported(trackIdx: Long, imported: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_imported == null) gdext.classes.Animation.mb_track_set_imported = MethodBind.get("Animation", "track_set_imported", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_imported, livePtr, trackIdx, imported)
  }

  /** Animation.track_is_imported */
  final def trackIsImported(trackIdx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_imported == null) gdext.classes.Animation.mb_track_is_imported = MethodBind.get("Animation", "track_is_imported", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_imported, livePtr, trackIdx)
  }

  /** Animation.track_set_enabled */
  final def trackSetEnabled(trackIdx: Long, enabled: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_enabled == null) gdext.classes.Animation.mb_track_set_enabled = MethodBind.get("Animation", "track_set_enabled", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_enabled, livePtr, trackIdx, enabled)
  }

  /** Animation.track_is_enabled */
  final def trackIsEnabled(trackIdx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_enabled == null) gdext.classes.Animation.mb_track_is_enabled = MethodBind.get("Animation", "track_is_enabled", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_enabled, livePtr, trackIdx)
  }

  /** Animation.position_track_insert_key */
  final def positionTrackInsertKey(trackIdx: Long, time: Double, position: gdext.builtin.Vector3): Long = {
    if (gdext.classes.Animation.mb_position_track_insert_key == null) gdext.classes.Animation.mb_position_track_insert_key = MethodBind.get("Animation", "position_track_insert_key", 2540608232L)
    Ptrcall.call3[Long, Double, gdext.builtin.Vector3, Long](gdext.classes.Animation.mb_position_track_insert_key, livePtr, trackIdx, time, position)
  }

  /** Animation.rotation_track_insert_key */
  final def rotationTrackInsertKey(trackIdx: Long, time: Double, rotation: gdext.builtin.Quaternion): Long = {
    if (gdext.classes.Animation.mb_rotation_track_insert_key == null) gdext.classes.Animation.mb_rotation_track_insert_key = MethodBind.get("Animation", "rotation_track_insert_key", 4165004800L)
    Ptrcall.call3[Long, Double, gdext.builtin.Quaternion, Long](gdext.classes.Animation.mb_rotation_track_insert_key, livePtr, trackIdx, time, rotation)
  }

  /** Animation.scale_track_insert_key */
  final def scaleTrackInsertKey(trackIdx: Long, time: Double, scale: gdext.builtin.Vector3): Long = {
    if (gdext.classes.Animation.mb_scale_track_insert_key == null) gdext.classes.Animation.mb_scale_track_insert_key = MethodBind.get("Animation", "scale_track_insert_key", 2540608232L)
    Ptrcall.call3[Long, Double, gdext.builtin.Vector3, Long](gdext.classes.Animation.mb_scale_track_insert_key, livePtr, trackIdx, time, scale)
  }

  /** Animation.blend_shape_track_insert_key */
  final def blendShapeTrackInsertKey(trackIdx: Long, time: Double, amount: Double): Long = {
    if (gdext.classes.Animation.mb_blend_shape_track_insert_key == null) gdext.classes.Animation.mb_blend_shape_track_insert_key = MethodBind.get("Animation", "blend_shape_track_insert_key", 1534913637L)
    Ptrcall.call3[Long, Double, Double, Long](gdext.classes.Animation.mb_blend_shape_track_insert_key, livePtr, trackIdx, time, amount)
  }

  /** Animation.position_track_interpolate */
  final def positionTrackInterpolate(trackIdx: Long, timeSec: Double, backward: Boolean = false): gdext.builtin.Vector3 = {
    if (gdext.classes.Animation.mb_position_track_interpolate == null) gdext.classes.Animation.mb_position_track_interpolate = MethodBind.get("Animation", "position_track_interpolate", 3530011197L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Vector3](gdext.classes.Animation.mb_position_track_interpolate, livePtr, trackIdx, timeSec, backward)
  }

  /** Animation.rotation_track_interpolate */
  final def rotationTrackInterpolate(trackIdx: Long, timeSec: Double, backward: Boolean = false): gdext.builtin.Quaternion = {
    if (gdext.classes.Animation.mb_rotation_track_interpolate == null) gdext.classes.Animation.mb_rotation_track_interpolate = MethodBind.get("Animation", "rotation_track_interpolate", 2915876792L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Quaternion](gdext.classes.Animation.mb_rotation_track_interpolate, livePtr, trackIdx, timeSec, backward)
  }

  /** Animation.scale_track_interpolate */
  final def scaleTrackInterpolate(trackIdx: Long, timeSec: Double, backward: Boolean = false): gdext.builtin.Vector3 = {
    if (gdext.classes.Animation.mb_scale_track_interpolate == null) gdext.classes.Animation.mb_scale_track_interpolate = MethodBind.get("Animation", "scale_track_interpolate", 3530011197L)
    Ptrcall.call3[Long, Double, Boolean, gdext.builtin.Vector3](gdext.classes.Animation.mb_scale_track_interpolate, livePtr, trackIdx, timeSec, backward)
  }

  /** Animation.blend_shape_track_interpolate */
  final def blendShapeTrackInterpolate(trackIdx: Long, timeSec: Double, backward: Boolean = false): Double = {
    if (gdext.classes.Animation.mb_blend_shape_track_interpolate == null) gdext.classes.Animation.mb_blend_shape_track_interpolate = MethodBind.get("Animation", "blend_shape_track_interpolate", 2482365182L)
    Ptrcall.call3[Long, Double, Boolean, Double](gdext.classes.Animation.mb_blend_shape_track_interpolate, livePtr, trackIdx, timeSec, backward)
  }

  /** Animation.track_remove_key */
  final def trackRemoveKey(trackIdx: Long, keyIdx: Long): Unit = {
    if (gdext.classes.Animation.mb_track_remove_key == null) gdext.classes.Animation.mb_track_remove_key = MethodBind.get("Animation", "track_remove_key", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_remove_key, livePtr, trackIdx, keyIdx)
  }

  /** Animation.track_remove_key_at_time */
  final def trackRemoveKeyAtTime(trackIdx: Long, time: Double): Unit = {
    if (gdext.classes.Animation.mb_track_remove_key_at_time == null) gdext.classes.Animation.mb_track_remove_key_at_time = MethodBind.get("Animation", "track_remove_key_at_time", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_remove_key_at_time, livePtr, trackIdx, time)
  }

  /** Animation.track_set_key_transition */
  final def trackSetKeyTransition(trackIdx: Long, keyIdx: Long, transition: Double): Unit = {
    if (gdext.classes.Animation.mb_track_set_key_transition == null) gdext.classes.Animation.mb_track_set_key_transition = MethodBind.get("Animation", "track_set_key_transition", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_track_set_key_transition, livePtr, trackIdx, keyIdx, transition)
  }

  /** Animation.track_set_key_time */
  final def trackSetKeyTime(trackIdx: Long, keyIdx: Long, time: Double): Unit = {
    if (gdext.classes.Animation.mb_track_set_key_time == null) gdext.classes.Animation.mb_track_set_key_time = MethodBind.get("Animation", "track_set_key_time", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_track_set_key_time, livePtr, trackIdx, keyIdx, time)
  }

  /** Animation.track_get_key_transition */
  final def trackGetKeyTransition(trackIdx: Long, keyIdx: Long): Double = {
    if (gdext.classes.Animation.mb_track_get_key_transition == null) gdext.classes.Animation.mb_track_get_key_transition = MethodBind.get("Animation", "track_get_key_transition", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_track_get_key_transition, livePtr, trackIdx, keyIdx)
  }

  /** Animation.track_get_key_count */
  final def trackGetKeyCount(trackIdx: Long): Long = {
    if (gdext.classes.Animation.mb_track_get_key_count == null) gdext.classes.Animation.mb_track_get_key_count = MethodBind.get("Animation", "track_get_key_count", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_key_count, livePtr, trackIdx)
  }

  /** Animation.track_get_key_time */
  final def trackGetKeyTime(trackIdx: Long, keyIdx: Long): Double = {
    if (gdext.classes.Animation.mb_track_get_key_time == null) gdext.classes.Animation.mb_track_get_key_time = MethodBind.get("Animation", "track_get_key_time", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_track_get_key_time, livePtr, trackIdx, keyIdx)
  }

  /** Animation.track_find_key */
  final def trackFindKey(trackIdx: Long, time: Double, findMode: gdext.classes.Animation.FindMode = gdext.classes.Animation.FindMode(0L), limit: Boolean = false, backward: Boolean = false): Long = {
    if (gdext.classes.Animation.mb_track_find_key == null) gdext.classes.Animation.mb_track_find_key = MethodBind.get("Animation", "track_find_key", 4230953007L)
    Ptrcall.call5[Long, Double, Long, Boolean, Boolean, Long](gdext.classes.Animation.mb_track_find_key, livePtr, trackIdx, time, findMode, limit, backward)
  }

  /** Animation.track_set_interpolation_type */
  final def trackSetInterpolationType(trackIdx: Long, interpolation: gdext.classes.Animation.InterpolationType): Unit = {
    if (gdext.classes.Animation.mb_track_set_interpolation_type == null) gdext.classes.Animation.mb_track_set_interpolation_type = MethodBind.get("Animation", "track_set_interpolation_type", 4112932513L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_interpolation_type, livePtr, trackIdx, interpolation)
  }

  /** Animation.track_get_interpolation_type */
  final def trackGetInterpolationType(trackIdx: Long): gdext.classes.Animation.InterpolationType = {
    if (gdext.classes.Animation.mb_track_get_interpolation_type == null) gdext.classes.Animation.mb_track_get_interpolation_type = MethodBind.get("Animation", "track_get_interpolation_type", 1530756894L)
    gdext.classes.Animation.InterpolationType(Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_track_get_interpolation_type, livePtr, trackIdx))
  }

  /** Animation.track_set_interpolation_loop_wrap */
  final def trackSetInterpolationLoopWrap(trackIdx: Long, interpolation: Boolean): Unit = {
    if (gdext.classes.Animation.mb_track_set_interpolation_loop_wrap == null) gdext.classes.Animation.mb_track_set_interpolation_loop_wrap = MethodBind.get("Animation", "track_set_interpolation_loop_wrap", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_track_set_interpolation_loop_wrap, livePtr, trackIdx, interpolation)
  }

  /** Animation.track_get_interpolation_loop_wrap */
  final def trackGetInterpolationLoopWrap(trackIdx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_get_interpolation_loop_wrap == null) gdext.classes.Animation.mb_track_get_interpolation_loop_wrap = MethodBind.get("Animation", "track_get_interpolation_loop_wrap", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_get_interpolation_loop_wrap, livePtr, trackIdx)
  }

  /** Animation.track_is_compressed */
  final def trackIsCompressed(trackIdx: Long): Boolean = {
    if (gdext.classes.Animation.mb_track_is_compressed == null) gdext.classes.Animation.mb_track_is_compressed = MethodBind.get("Animation", "track_is_compressed", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_track_is_compressed, livePtr, trackIdx)
  }

  /** Animation.value_track_set_update_mode */
  final def valueTrackSetUpdateMode(trackIdx: Long, mode: gdext.classes.Animation.UpdateMode): Unit = {
    if (gdext.classes.Animation.mb_value_track_set_update_mode == null) gdext.classes.Animation.mb_value_track_set_update_mode = MethodBind.get("Animation", "value_track_set_update_mode", 2854058312L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_value_track_set_update_mode, livePtr, trackIdx, mode)
  }

  /** Animation.value_track_get_update_mode */
  final def valueTrackGetUpdateMode(trackIdx: Long): gdext.classes.Animation.UpdateMode = {
    if (gdext.classes.Animation.mb_value_track_get_update_mode == null) gdext.classes.Animation.mb_value_track_get_update_mode = MethodBind.get("Animation", "value_track_get_update_mode", 1440326473L)
    gdext.classes.Animation.UpdateMode(Ptrcall.call1[Long, Long](gdext.classes.Animation.mb_value_track_get_update_mode, livePtr, trackIdx))
  }

  /** Animation.method_track_get_name */
  final def methodTrackGetName(trackIdx: Long, keyIdx: Long): String = {
    if (gdext.classes.Animation.mb_method_track_get_name == null) gdext.classes.Animation.mb_method_track_get_name = MethodBind.get("Animation", "method_track_get_name", 351665558L)
    Ptrcall.call2[Long, Long, SnArg](gdext.classes.Animation.mb_method_track_get_name, livePtr, trackIdx, keyIdx)
  }

  /** Animation.bezier_track_insert_key */
  final def bezierTrackInsertKey(trackIdx: Long, time: Double, value: Double, inHandle: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f), outHandle: gdext.builtin.Vector2 = gdext.builtin.Vector2(0f, 0f)): Long = {
    if (gdext.classes.Animation.mb_bezier_track_insert_key == null) gdext.classes.Animation.mb_bezier_track_insert_key = MethodBind.get("Animation", "bezier_track_insert_key", 3656773645L)
    Ptrcall.call5[Long, Double, Double, gdext.builtin.Vector2, gdext.builtin.Vector2, Long](gdext.classes.Animation.mb_bezier_track_insert_key, livePtr, trackIdx, time, value, inHandle, outHandle)
  }

  /** Animation.bezier_track_set_key_value */
  final def bezierTrackSetKeyValue(trackIdx: Long, keyIdx: Long, value: Double): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_value == null) gdext.classes.Animation.mb_bezier_track_set_key_value = MethodBind.get("Animation", "bezier_track_set_key_value", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_bezier_track_set_key_value, livePtr, trackIdx, keyIdx, value)
  }

  /** Animation.bezier_track_set_key_in_handle */
  final def bezierTrackSetKeyInHandle(trackIdx: Long, keyIdx: Long, inHandle: gdext.builtin.Vector2, balancedValueTimeRatio: Double = 1.0): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_in_handle == null) gdext.classes.Animation.mb_bezier_track_set_key_in_handle = MethodBind.get("Animation", "bezier_track_set_key_in_handle", 1719223284L)
    Ptrcall.callVoid4(gdext.classes.Animation.mb_bezier_track_set_key_in_handle, livePtr, trackIdx, keyIdx, inHandle, balancedValueTimeRatio)
  }

  /** Animation.bezier_track_set_key_out_handle */
  final def bezierTrackSetKeyOutHandle(trackIdx: Long, keyIdx: Long, outHandle: gdext.builtin.Vector2, balancedValueTimeRatio: Double = 1.0): Unit = {
    if (gdext.classes.Animation.mb_bezier_track_set_key_out_handle == null) gdext.classes.Animation.mb_bezier_track_set_key_out_handle = MethodBind.get("Animation", "bezier_track_set_key_out_handle", 1719223284L)
    Ptrcall.callVoid4(gdext.classes.Animation.mb_bezier_track_set_key_out_handle, livePtr, trackIdx, keyIdx, outHandle, balancedValueTimeRatio)
  }

  /** Animation.bezier_track_get_key_value */
  final def bezierTrackGetKeyValue(trackIdx: Long, keyIdx: Long): Double = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_value == null) gdext.classes.Animation.mb_bezier_track_get_key_value = MethodBind.get("Animation", "bezier_track_get_key_value", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_bezier_track_get_key_value, livePtr, trackIdx, keyIdx)
  }

  /** Animation.bezier_track_get_key_in_handle */
  final def bezierTrackGetKeyInHandle(trackIdx: Long, keyIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_in_handle == null) gdext.classes.Animation.mb_bezier_track_get_key_in_handle = MethodBind.get("Animation", "bezier_track_get_key_in_handle", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.Animation.mb_bezier_track_get_key_in_handle, livePtr, trackIdx, keyIdx)
  }

  /** Animation.bezier_track_get_key_out_handle */
  final def bezierTrackGetKeyOutHandle(trackIdx: Long, keyIdx: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.Animation.mb_bezier_track_get_key_out_handle == null) gdext.classes.Animation.mb_bezier_track_get_key_out_handle = MethodBind.get("Animation", "bezier_track_get_key_out_handle", 3016396712L)
    Ptrcall.call2[Long, Long, gdext.builtin.Vector2](gdext.classes.Animation.mb_bezier_track_get_key_out_handle, livePtr, trackIdx, keyIdx)
  }

  /** Animation.bezier_track_interpolate */
  final def bezierTrackInterpolate(trackIdx: Long, time: Double): Double = {
    if (gdext.classes.Animation.mb_bezier_track_interpolate == null) gdext.classes.Animation.mb_bezier_track_interpolate = MethodBind.get("Animation", "bezier_track_interpolate", 1900462983L)
    Ptrcall.call2[Long, Double, Double](gdext.classes.Animation.mb_bezier_track_interpolate, livePtr, trackIdx, time)
  }

  /** Animation.audio_track_insert_key */
  final def audioTrackInsertKey(trackIdx: Long, time: Double, stream: Resource, startOffset: Double = 0.0, endOffset: Double = 0.0): Long = {
    if (gdext.classes.Animation.mb_audio_track_insert_key == null) gdext.classes.Animation.mb_audio_track_insert_key = MethodBind.get("Animation", "audio_track_insert_key", 4021027286L)
    Ptrcall.call5[Long, Double, GodotObject, Double, Double, Long](gdext.classes.Animation.mb_audio_track_insert_key, livePtr, trackIdx, time, Wrappers.handle(stream), startOffset, endOffset)
  }

  /** Animation.audio_track_set_key_stream */
  final def audioTrackSetKeyStream(trackIdx: Long, keyIdx: Long, stream: Resource): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_stream == null) gdext.classes.Animation.mb_audio_track_set_key_stream = MethodBind.get("Animation", "audio_track_set_key_stream", 3886397084L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_stream, livePtr, trackIdx, keyIdx, Wrappers.handle(stream))
  }

  /** Animation.audio_track_set_key_start_offset */
  final def audioTrackSetKeyStartOffset(trackIdx: Long, keyIdx: Long, offset: Double): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_start_offset == null) gdext.classes.Animation.mb_audio_track_set_key_start_offset = MethodBind.get("Animation", "audio_track_set_key_start_offset", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_start_offset, livePtr, trackIdx, keyIdx, offset)
  }

  /** Animation.audio_track_set_key_end_offset */
  final def audioTrackSetKeyEndOffset(trackIdx: Long, keyIdx: Long, offset: Double): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_key_end_offset == null) gdext.classes.Animation.mb_audio_track_set_key_end_offset = MethodBind.get("Animation", "audio_track_set_key_end_offset", 3506521499L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_audio_track_set_key_end_offset, livePtr, trackIdx, keyIdx, offset)
  }

  /** Animation.audio_track_get_key_stream. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def audioTrackGetKeyStream(trackIdx: Long, keyIdx: Long): Resource = {
    if (gdext.classes.Animation.mb_audio_track_get_key_stream == null) gdext.classes.Animation.mb_audio_track_get_key_stream = MethodBind.get("Animation", "audio_track_get_key_stream", 635277205L)
    Wrappers.owned[Resource](Ptrcall.call2[Long, Long, Long](gdext.classes.Animation.mb_audio_track_get_key_stream, livePtr, trackIdx, keyIdx))
  }

  /** Animation.audio_track_get_key_start_offset */
  final def audioTrackGetKeyStartOffset(trackIdx: Long, keyIdx: Long): Double = {
    if (gdext.classes.Animation.mb_audio_track_get_key_start_offset == null) gdext.classes.Animation.mb_audio_track_get_key_start_offset = MethodBind.get("Animation", "audio_track_get_key_start_offset", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_audio_track_get_key_start_offset, livePtr, trackIdx, keyIdx)
  }

  /** Animation.audio_track_get_key_end_offset */
  final def audioTrackGetKeyEndOffset(trackIdx: Long, keyIdx: Long): Double = {
    if (gdext.classes.Animation.mb_audio_track_get_key_end_offset == null) gdext.classes.Animation.mb_audio_track_get_key_end_offset = MethodBind.get("Animation", "audio_track_get_key_end_offset", 3085491603L)
    Ptrcall.call2[Long, Long, Double](gdext.classes.Animation.mb_audio_track_get_key_end_offset, livePtr, trackIdx, keyIdx)
  }

  /** Animation.audio_track_set_use_blend */
  final def audioTrackSetUseBlend(trackIdx: Long, enable: Boolean): Unit = {
    if (gdext.classes.Animation.mb_audio_track_set_use_blend == null) gdext.classes.Animation.mb_audio_track_set_use_blend = MethodBind.get("Animation", "audio_track_set_use_blend", 300928843L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_audio_track_set_use_blend, livePtr, trackIdx, enable)
  }

  /** Animation.audio_track_is_use_blend */
  final def audioTrackIsUseBlend(trackIdx: Long): Boolean = {
    if (gdext.classes.Animation.mb_audio_track_is_use_blend == null) gdext.classes.Animation.mb_audio_track_is_use_blend = MethodBind.get("Animation", "audio_track_is_use_blend", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Animation.mb_audio_track_is_use_blend, livePtr, trackIdx)
  }

  /** Animation.animation_track_insert_key */
  final def animationTrackInsertKey(trackIdx: Long, time: Double, animation: String): Long = {
    if (gdext.classes.Animation.mb_animation_track_insert_key == null) gdext.classes.Animation.mb_animation_track_insert_key = MethodBind.get("Animation", "animation_track_insert_key", 158676774L)
    Ptrcall.call3[Long, Double, SnArg, Long](gdext.classes.Animation.mb_animation_track_insert_key, livePtr, trackIdx, time, SnArg(animation))
  }

  /** Animation.animation_track_set_key_animation */
  final def animationTrackSetKeyAnimation(trackIdx: Long, keyIdx: Long, animation: String): Unit = {
    if (gdext.classes.Animation.mb_animation_track_set_key_animation == null) gdext.classes.Animation.mb_animation_track_set_key_animation = MethodBind.get("Animation", "animation_track_set_key_animation", 117615382L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_animation_track_set_key_animation, livePtr, trackIdx, keyIdx, SnArg(animation))
  }

  /** Animation.animation_track_get_key_animation */
  final def animationTrackGetKeyAnimation(trackIdx: Long, keyIdx: Long): String = {
    if (gdext.classes.Animation.mb_animation_track_get_key_animation == null) gdext.classes.Animation.mb_animation_track_get_key_animation = MethodBind.get("Animation", "animation_track_get_key_animation", 351665558L)
    Ptrcall.call2[Long, Long, SnArg](gdext.classes.Animation.mb_animation_track_get_key_animation, livePtr, trackIdx, keyIdx)
  }

  /** Animation.add_marker */
  final def addMarker(name: String, time: Double): Unit = {
    if (gdext.classes.Animation.mb_add_marker == null) gdext.classes.Animation.mb_add_marker = MethodBind.get("Animation", "add_marker", 4135858297L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_add_marker, livePtr, SnArg(name), time)
  }

  /** Animation.remove_marker */
  final def removeMarker(name: String): Unit = {
    if (gdext.classes.Animation.mb_remove_marker == null) gdext.classes.Animation.mb_remove_marker = MethodBind.get("Animation", "remove_marker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_remove_marker, livePtr, SnArg(name))
  }

  /** Animation.has_marker */
  final def hasMarker(name: String): Boolean = {
    if (gdext.classes.Animation.mb_has_marker == null) gdext.classes.Animation.mb_has_marker = MethodBind.get("Animation", "has_marker", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Animation.mb_has_marker, livePtr, SnArg(name))
  }

  /** Animation.get_marker_at_time */
  final def getMarkerAtTime(time: Double): String = {
    if (gdext.classes.Animation.mb_get_marker_at_time == null) gdext.classes.Animation.mb_get_marker_at_time = MethodBind.get("Animation", "get_marker_at_time", 4079494655L)
    Ptrcall.call1[Double, SnArg](gdext.classes.Animation.mb_get_marker_at_time, livePtr, time)
  }

  /** Animation.get_next_marker */
  final def getNextMarker(time: Double): String = {
    if (gdext.classes.Animation.mb_get_next_marker == null) gdext.classes.Animation.mb_get_next_marker = MethodBind.get("Animation", "get_next_marker", 4079494655L)
    Ptrcall.call1[Double, SnArg](gdext.classes.Animation.mb_get_next_marker, livePtr, time)
  }

  /** Animation.get_prev_marker */
  final def getPrevMarker(time: Double): String = {
    if (gdext.classes.Animation.mb_get_prev_marker == null) gdext.classes.Animation.mb_get_prev_marker = MethodBind.get("Animation", "get_prev_marker", 4079494655L)
    Ptrcall.call1[Double, SnArg](gdext.classes.Animation.mb_get_prev_marker, livePtr, time)
  }

  /** Animation.get_marker_time */
  final def getMarkerTime(name: String): Double = {
    if (gdext.classes.Animation.mb_get_marker_time == null) gdext.classes.Animation.mb_get_marker_time = MethodBind.get("Animation", "get_marker_time", 2349060816L)
    Ptrcall.call1[SnArg, Double](gdext.classes.Animation.mb_get_marker_time, livePtr, SnArg(name))
  }

  /** Animation.get_marker_color */
  final def getMarkerColor(name: String): gdext.builtin.Color = {
    if (gdext.classes.Animation.mb_get_marker_color == null) gdext.classes.Animation.mb_get_marker_color = MethodBind.get("Animation", "get_marker_color", 3742943038L)
    Ptrcall.call1[SnArg, gdext.builtin.Color](gdext.classes.Animation.mb_get_marker_color, livePtr, SnArg(name))
  }

  /** Animation.set_marker_color */
  final def setMarkerColor(name: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Animation.mb_set_marker_color == null) gdext.classes.Animation.mb_set_marker_color = MethodBind.get("Animation", "set_marker_color", 4260178595L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_set_marker_color, livePtr, SnArg(name), color)
  }

  /** Animation.set_length */
  final def setLength(timeSec: Double): Unit = {
    if (gdext.classes.Animation.mb_set_length == null) gdext.classes.Animation.mb_set_length = MethodBind.get("Animation", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_length, livePtr, timeSec)
  }

  /** Animation.get_length */
  final def getLength(): Double = {
    if (gdext.classes.Animation.mb_get_length == null) gdext.classes.Animation.mb_get_length = MethodBind.get("Animation", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Animation.mb_get_length, livePtr)
  }

  /** Animation.set_loop_mode */
  final def setLoopMode(loopMode: gdext.classes.Animation.LoopMode): Unit = {
    if (gdext.classes.Animation.mb_set_loop_mode == null) gdext.classes.Animation.mb_set_loop_mode = MethodBind.get("Animation", "set_loop_mode", 3155355575L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_loop_mode, livePtr, loopMode)
  }

  /** Animation.get_loop_mode */
  final def getLoopMode(): gdext.classes.Animation.LoopMode = {
    if (gdext.classes.Animation.mb_get_loop_mode == null) gdext.classes.Animation.mb_get_loop_mode = MethodBind.get("Animation", "get_loop_mode", 1988889481L)
    gdext.classes.Animation.LoopMode(Ptrcall.call0[Long](gdext.classes.Animation.mb_get_loop_mode, livePtr))
  }

  /** Animation.set_step */
  final def setStep(sizeSec: Double): Unit = {
    if (gdext.classes.Animation.mb_set_step == null) gdext.classes.Animation.mb_set_step = MethodBind.get("Animation", "set_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Animation.mb_set_step, livePtr, sizeSec)
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
  final def copyTrack(trackIdx: Long, toAnimation: Animation): Unit = {
    if (gdext.classes.Animation.mb_copy_track == null) gdext.classes.Animation.mb_copy_track = MethodBind.get("Animation", "copy_track", 148001024L)
    Ptrcall.callVoid2(gdext.classes.Animation.mb_copy_track, livePtr, trackIdx, Wrappers.handle(toAnimation))
  }

  /** Animation.optimize */
  final def optimize(allowedVelocityErr: Double = 0.01, allowedAngularErr: Double = 0.01, precision: Long = 3L): Unit = {
    if (gdext.classes.Animation.mb_optimize == null) gdext.classes.Animation.mb_optimize = MethodBind.get("Animation", "optimize", 3303583852L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_optimize, livePtr, allowedVelocityErr, allowedAngularErr, precision)
  }

  /** Animation.compress */
  final def compress(pageSize: Long = 8192L, fps: Long = 120L, splitTolerance: Double = 4.0): Unit = {
    if (gdext.classes.Animation.mb_compress == null) gdext.classes.Animation.mb_compress = MethodBind.get("Animation", "compress", 3608408117L)
    Ptrcall.callVoid3(gdext.classes.Animation.mb_compress, livePtr, pageSize, fps, splitTolerance)
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

  /** Godot enum `Animation.TrackType`. */
  opaque type TrackType <: Long = Long

  object TrackType {
    final val Value: TrackType = 0L.asInstanceOf[TrackType]
    final val Position3d: TrackType = 1L.asInstanceOf[TrackType]
    final val Rotation3d: TrackType = 2L.asInstanceOf[TrackType]
    final val Scale3d: TrackType = 3L.asInstanceOf[TrackType]
    final val BlendShape: TrackType = 4L.asInstanceOf[TrackType]
    final val Method: TrackType = 5L.asInstanceOf[TrackType]
    final val Bezier: TrackType = 6L.asInstanceOf[TrackType]
    final val Audio: TrackType = 7L.asInstanceOf[TrackType]
    final val Animation: TrackType = 8L.asInstanceOf[TrackType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TrackType = value.asInstanceOf[TrackType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TrackType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[TrackType]]

    extension (self: TrackType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Value"
        case 1L => "Position3d"
        case 2L => "Rotation3d"
        case 3L => "Scale3d"
        case 4L => "BlendShape"
        case 5L => "Method"
        case 6L => "Bezier"
        case 7L => "Audio"
        case 8L => "Animation"
        case other => other.toString
      }
  }

  /** Godot enum `Animation.InterpolationType`. */
  opaque type InterpolationType <: Long = Long

  object InterpolationType {
    final val Nearest: InterpolationType = 0L.asInstanceOf[InterpolationType]
    final val Linear: InterpolationType = 1L.asInstanceOf[InterpolationType]
    final val Cubic: InterpolationType = 2L.asInstanceOf[InterpolationType]
    final val LinearAngle: InterpolationType = 3L.asInstanceOf[InterpolationType]
    final val CubicAngle: InterpolationType = 4L.asInstanceOf[InterpolationType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InterpolationType = value.asInstanceOf[InterpolationType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InterpolationType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[InterpolationType]]

    extension (self: InterpolationType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case 2L => "Cubic"
        case 3L => "LinearAngle"
        case 4L => "CubicAngle"
        case other => other.toString
      }
  }

  /** Godot enum `Animation.UpdateMode`. */
  opaque type UpdateMode <: Long = Long

  object UpdateMode {
    final val Continuous: UpdateMode = 0L.asInstanceOf[UpdateMode]
    final val Discrete: UpdateMode = 1L.asInstanceOf[UpdateMode]
    final val Capture: UpdateMode = 2L.asInstanceOf[UpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UpdateMode = value.asInstanceOf[UpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UpdateMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[UpdateMode]]

    extension (self: UpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Continuous"
        case 1L => "Discrete"
        case 2L => "Capture"
        case other => other.toString
      }
  }

  /** Godot enum `Animation.LoopMode`. */
  opaque type LoopMode <: Long = Long

  object LoopMode {
    final val None: LoopMode = 0L.asInstanceOf[LoopMode]
    final val Linear: LoopMode = 1L.asInstanceOf[LoopMode]
    final val Pingpong: LoopMode = 2L.asInstanceOf[LoopMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LoopMode = value.asInstanceOf[LoopMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LoopMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LoopMode]]

    extension (self: LoopMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Linear"
        case 2L => "Pingpong"
        case other => other.toString
      }
  }

  /** Godot enum `Animation.LoopedFlag`. */
  opaque type LoopedFlag <: Long = Long

  object LoopedFlag {
    final val None: LoopedFlag = 0L.asInstanceOf[LoopedFlag]
    final val End: LoopedFlag = 1L.asInstanceOf[LoopedFlag]
    final val Start: LoopedFlag = 2L.asInstanceOf[LoopedFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LoopedFlag = value.asInstanceOf[LoopedFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LoopedFlag] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[LoopedFlag]]

    extension (self: LoopedFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "End"
        case 2L => "Start"
        case other => other.toString
      }
  }

  /** Godot enum `Animation.FindMode`. */
  opaque type FindMode <: Long = Long

  object FindMode {
    final val Nearest: FindMode = 0L.asInstanceOf[FindMode]
    final val Approx: FindMode = 1L.asInstanceOf[FindMode]
    final val Exact: FindMode = 2L.asInstanceOf[FindMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FindMode = value.asInstanceOf[FindMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FindMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FindMode]]

    extension (self: FindMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Approx"
        case 2L => "Exact"
        case other => other.toString
      }
  }
}
