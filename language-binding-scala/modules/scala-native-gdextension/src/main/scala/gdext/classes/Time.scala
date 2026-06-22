package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Time`, extends `Object`. */
abstract class Time extends Object {

  /** Time.get_datetime_string_from_unix_time */
  final def getDatetimeStringFromUnixTime(unix_time_val: Long, use_space: Boolean): String =
    Ptrcall.call2[Long, Boolean, String](MethodBind.get("Time", "get_datetime_string_from_unix_time", 2311239925L), hostObject.objectPtr, unix_time_val, use_space)

  /** Time.get_date_string_from_unix_time */
  final def getDateStringFromUnixTime(unix_time_val: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Time", "get_date_string_from_unix_time", 844755477L), hostObject.objectPtr, unix_time_val)

  /** Time.get_time_string_from_unix_time */
  final def getTimeStringFromUnixTime(unix_time_val: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Time", "get_time_string_from_unix_time", 844755477L), hostObject.objectPtr, unix_time_val)

  /** Time.get_unix_time_from_datetime_string */
  final def getUnixTimeFromDatetimeString(datetime: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Time", "get_unix_time_from_datetime_string", 1321353865L), hostObject.objectPtr, datetime)

  /** Time.get_offset_string_from_offset_minutes */
  final def getOffsetStringFromOffsetMinutes(offset_minutes: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("Time", "get_offset_string_from_offset_minutes", 844755477L), hostObject.objectPtr, offset_minutes)

  /** Time.get_datetime_string_from_system */
  final def getDatetimeStringFromSystem(utc: Boolean, use_space: Boolean): String =
    Ptrcall.call2[Boolean, Boolean, String](MethodBind.get("Time", "get_datetime_string_from_system", 1136425492L), hostObject.objectPtr, utc, use_space)

  /** Time.get_date_string_from_system */
  final def getDateStringFromSystem(utc: Boolean): String =
    Ptrcall.call1[Boolean, String](MethodBind.get("Time", "get_date_string_from_system", 1162154673L), hostObject.objectPtr, utc)

  /** Time.get_time_string_from_system */
  final def getTimeStringFromSystem(utc: Boolean): String =
    Ptrcall.call1[Boolean, String](MethodBind.get("Time", "get_time_string_from_system", 1162154673L), hostObject.objectPtr, utc)

  /** Time.get_unix_time_from_system */
  final def getUnixTimeFromSystem(): Double =
    Ptrcall.call0[Double](MethodBind.get("Time", "get_unix_time_from_system", 1740695150L), hostObject.objectPtr)

  /** Time.get_ticks_msec */
  final def getTicksMsec(): Long =
    Ptrcall.call0[Long](MethodBind.get("Time", "get_ticks_msec", 3905245786L), hostObject.objectPtr)

  /** Time.get_ticks_usec */
  final def getTicksUsec(): Long =
    Ptrcall.call0[Long](MethodBind.get("Time", "get_ticks_usec", 3905245786L), hostObject.objectPtr)

}

object Time {
  /** Class metadata for Gd[Time] lifetime management and casting. */
  given GodotClass[Time] with {
    def className = "Time"
    def isRefCounted = false
    def wrap(o: GodotObject): Time = new Time {}.withHost(o.objectPtr)
    def unwrap(t: Time): GodotObject = t.hostObject
  }

  /** The process-global Time singleton instance. */
  def singleton: Time = new Time {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("Time").ptr))
}
