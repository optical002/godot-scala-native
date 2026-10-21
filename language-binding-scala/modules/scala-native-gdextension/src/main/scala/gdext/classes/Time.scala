package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Time`, extends `Object`. */
abstract class Time extends Object {
  override def godotClassName: String = "Time"

  /** Time.get_datetime_string_from_unix_time */
  final def getDatetimeStringFromUnixTime(unix_time_val: Long, use_space: Boolean): String = {
    if (gdext.classes.Time.mb_get_datetime_string_from_unix_time == null) gdext.classes.Time.mb_get_datetime_string_from_unix_time = MethodBind.get("Time", "get_datetime_string_from_unix_time", 2311239925L)
    Ptrcall.call2[Long, Boolean, String](gdext.classes.Time.mb_get_datetime_string_from_unix_time, livePtr, unix_time_val, use_space)
  }

  /** Time.get_date_string_from_unix_time */
  final def getDateStringFromUnixTime(unix_time_val: Long): String = {
    if (gdext.classes.Time.mb_get_date_string_from_unix_time == null) gdext.classes.Time.mb_get_date_string_from_unix_time = MethodBind.get("Time", "get_date_string_from_unix_time", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_date_string_from_unix_time, livePtr, unix_time_val)
  }

  /** Time.get_time_string_from_unix_time */
  final def getTimeStringFromUnixTime(unix_time_val: Long): String = {
    if (gdext.classes.Time.mb_get_time_string_from_unix_time == null) gdext.classes.Time.mb_get_time_string_from_unix_time = MethodBind.get("Time", "get_time_string_from_unix_time", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_time_string_from_unix_time, livePtr, unix_time_val)
  }

  /** Time.get_unix_time_from_datetime_string */
  final def getUnixTimeFromDatetimeString(datetime: String): Long = {
    if (gdext.classes.Time.mb_get_unix_time_from_datetime_string == null) gdext.classes.Time.mb_get_unix_time_from_datetime_string = MethodBind.get("Time", "get_unix_time_from_datetime_string", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.Time.mb_get_unix_time_from_datetime_string, livePtr, datetime)
  }

  /** Time.get_offset_string_from_offset_minutes */
  final def getOffsetStringFromOffsetMinutes(offset_minutes: Long): String = {
    if (gdext.classes.Time.mb_get_offset_string_from_offset_minutes == null) gdext.classes.Time.mb_get_offset_string_from_offset_minutes = MethodBind.get("Time", "get_offset_string_from_offset_minutes", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_offset_string_from_offset_minutes, livePtr, offset_minutes)
  }

  /** Time.get_datetime_string_from_system */
  final def getDatetimeStringFromSystem(utc: Boolean, use_space: Boolean): String = {
    if (gdext.classes.Time.mb_get_datetime_string_from_system == null) gdext.classes.Time.mb_get_datetime_string_from_system = MethodBind.get("Time", "get_datetime_string_from_system", 1136425492L)
    Ptrcall.call2[Boolean, Boolean, String](gdext.classes.Time.mb_get_datetime_string_from_system, livePtr, utc, use_space)
  }

  /** Time.get_date_string_from_system */
  final def getDateStringFromSystem(utc: Boolean): String = {
    if (gdext.classes.Time.mb_get_date_string_from_system == null) gdext.classes.Time.mb_get_date_string_from_system = MethodBind.get("Time", "get_date_string_from_system", 1162154673L)
    Ptrcall.call1[Boolean, String](gdext.classes.Time.mb_get_date_string_from_system, livePtr, utc)
  }

  /** Time.get_time_string_from_system */
  final def getTimeStringFromSystem(utc: Boolean): String = {
    if (gdext.classes.Time.mb_get_time_string_from_system == null) gdext.classes.Time.mb_get_time_string_from_system = MethodBind.get("Time", "get_time_string_from_system", 1162154673L)
    Ptrcall.call1[Boolean, String](gdext.classes.Time.mb_get_time_string_from_system, livePtr, utc)
  }

  /** Time.get_unix_time_from_system */
  final def getUnixTimeFromSystem(): Double = {
    if (gdext.classes.Time.mb_get_unix_time_from_system == null) gdext.classes.Time.mb_get_unix_time_from_system = MethodBind.get("Time", "get_unix_time_from_system", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Time.mb_get_unix_time_from_system, livePtr)
  }

  /** Time.get_ticks_msec */
  final def getTicksMsec(): Long = {
    if (gdext.classes.Time.mb_get_ticks_msec == null) gdext.classes.Time.mb_get_ticks_msec = MethodBind.get("Time", "get_ticks_msec", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Time.mb_get_ticks_msec, livePtr)
  }

  /** Time.get_ticks_usec */
  final def getTicksUsec(): Long = {
    if (gdext.classes.Time.mb_get_ticks_usec == null) gdext.classes.Time.mb_get_ticks_usec = MethodBind.get("Time", "get_ticks_usec", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Time.mb_get_ticks_usec, livePtr)
  }

}

object Time {
  private[classes] var mb_get_datetime_string_from_unix_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_date_string_from_unix_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_string_from_unix_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unix_time_from_datetime_string: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset_string_from_offset_minutes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_datetime_string_from_system: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_date_string_from_system: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_time_string_from_system: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unix_time_from_system: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ticks_msec: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ticks_usec: GDExtensionMethodBindPtr = null

  private var instance: Time = null

  /** The process-global Time singleton instance. */
  def singleton: Time = {
    if (instance == null)
      instance = Wrappers.borrowed[Time](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("Time").ptr)))
    instance
  }
}
