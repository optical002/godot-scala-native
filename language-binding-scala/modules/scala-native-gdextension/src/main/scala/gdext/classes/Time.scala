package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Time`, extends `Object`. */
abstract class Time extends Object {
  override def godotClassName: String = "Time"

  /** Time.get_datetime_string_from_unix_time */
  final def getDatetimeStringFromUnixTime(unixTimeVal: Long, useSpace: Boolean = false): String = {
    if (gdext.classes.Time.mb_get_datetime_string_from_unix_time == null) gdext.classes.Time.mb_get_datetime_string_from_unix_time = MethodBind.get("Time", "get_datetime_string_from_unix_time", 2311239925L)
    Ptrcall.call2[Long, Boolean, String](gdext.classes.Time.mb_get_datetime_string_from_unix_time, livePtr, unixTimeVal, useSpace)
  }

  /** Time.get_date_string_from_unix_time */
  final def getDateStringFromUnixTime(unixTimeVal: Long): String = {
    if (gdext.classes.Time.mb_get_date_string_from_unix_time == null) gdext.classes.Time.mb_get_date_string_from_unix_time = MethodBind.get("Time", "get_date_string_from_unix_time", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_date_string_from_unix_time, livePtr, unixTimeVal)
  }

  /** Time.get_time_string_from_unix_time */
  final def getTimeStringFromUnixTime(unixTimeVal: Long): String = {
    if (gdext.classes.Time.mb_get_time_string_from_unix_time == null) gdext.classes.Time.mb_get_time_string_from_unix_time = MethodBind.get("Time", "get_time_string_from_unix_time", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_time_string_from_unix_time, livePtr, unixTimeVal)
  }

  /** Time.get_unix_time_from_datetime_string */
  final def getUnixTimeFromDatetimeString(datetime: String): Long = {
    if (gdext.classes.Time.mb_get_unix_time_from_datetime_string == null) gdext.classes.Time.mb_get_unix_time_from_datetime_string = MethodBind.get("Time", "get_unix_time_from_datetime_string", 1321353865L)
    Ptrcall.call1[String, Long](gdext.classes.Time.mb_get_unix_time_from_datetime_string, livePtr, datetime)
  }

  /** Time.get_offset_string_from_offset_minutes */
  final def getOffsetStringFromOffsetMinutes(offsetMinutes: Long): String = {
    if (gdext.classes.Time.mb_get_offset_string_from_offset_minutes == null) gdext.classes.Time.mb_get_offset_string_from_offset_minutes = MethodBind.get("Time", "get_offset_string_from_offset_minutes", 844755477L)
    Ptrcall.call1[Long, String](gdext.classes.Time.mb_get_offset_string_from_offset_minutes, livePtr, offsetMinutes)
  }

  /** Time.get_datetime_string_from_system */
  final def getDatetimeStringFromSystem(utc: Boolean = false, useSpace: Boolean = false): String = {
    if (gdext.classes.Time.mb_get_datetime_string_from_system == null) gdext.classes.Time.mb_get_datetime_string_from_system = MethodBind.get("Time", "get_datetime_string_from_system", 1136425492L)
    Ptrcall.call2[Boolean, Boolean, String](gdext.classes.Time.mb_get_datetime_string_from_system, livePtr, utc, useSpace)
  }

  /** Time.get_date_string_from_system */
  final def getDateStringFromSystem(utc: Boolean = false): String = {
    if (gdext.classes.Time.mb_get_date_string_from_system == null) gdext.classes.Time.mb_get_date_string_from_system = MethodBind.get("Time", "get_date_string_from_system", 1162154673L)
    Ptrcall.call1[Boolean, String](gdext.classes.Time.mb_get_date_string_from_system, livePtr, utc)
  }

  /** Time.get_time_string_from_system */
  final def getTimeStringFromSystem(utc: Boolean = false): String = {
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

  /** Forwards to [[singleton]]: Time.get_datetime_string_from_unix_time */
  final def getDatetimeStringFromUnixTime(unixTimeVal: Long, useSpace: Boolean = false): String =
    singleton.getDatetimeStringFromUnixTime(unixTimeVal, useSpace)

  /** Forwards to [[singleton]]: Time.get_date_string_from_unix_time */
  final def getDateStringFromUnixTime(unixTimeVal: Long): String =
    singleton.getDateStringFromUnixTime(unixTimeVal)

  /** Forwards to [[singleton]]: Time.get_time_string_from_unix_time */
  final def getTimeStringFromUnixTime(unixTimeVal: Long): String =
    singleton.getTimeStringFromUnixTime(unixTimeVal)

  /** Forwards to [[singleton]]: Time.get_unix_time_from_datetime_string */
  final def getUnixTimeFromDatetimeString(datetime: String): Long =
    singleton.getUnixTimeFromDatetimeString(datetime)

  /** Forwards to [[singleton]]: Time.get_offset_string_from_offset_minutes */
  final def getOffsetStringFromOffsetMinutes(offsetMinutes: Long): String =
    singleton.getOffsetStringFromOffsetMinutes(offsetMinutes)

  /** Forwards to [[singleton]]: Time.get_datetime_string_from_system */
  final def getDatetimeStringFromSystem(utc: Boolean = false, useSpace: Boolean = false): String =
    singleton.getDatetimeStringFromSystem(utc, useSpace)

  /** Forwards to [[singleton]]: Time.get_date_string_from_system */
  final def getDateStringFromSystem(utc: Boolean = false): String =
    singleton.getDateStringFromSystem(utc)

  /** Forwards to [[singleton]]: Time.get_time_string_from_system */
  final def getTimeStringFromSystem(utc: Boolean = false): String =
    singleton.getTimeStringFromSystem(utc)

  /** Forwards to [[singleton]]: Time.get_unix_time_from_system */
  final def getUnixTimeFromSystem(): Double =
    singleton.getUnixTimeFromSystem()

  /** Forwards to [[singleton]]: Time.get_ticks_msec */
  final def getTicksMsec(): Long =
    singleton.getTicksMsec()

  /** Forwards to [[singleton]]: Time.get_ticks_usec */
  final def getTicksUsec(): Long =
    singleton.getTicksUsec()

  /** Godot enum `Time.Month`. */
  opaque type Month <: Long = Long

  object Month {
    final val January: Month = 1L.asInstanceOf[Month]
    final val February: Month = 2L.asInstanceOf[Month]
    final val March: Month = 3L.asInstanceOf[Month]
    final val April: Month = 4L.asInstanceOf[Month]
    final val May: Month = 5L.asInstanceOf[Month]
    final val June: Month = 6L.asInstanceOf[Month]
    final val July: Month = 7L.asInstanceOf[Month]
    final val August: Month = 8L.asInstanceOf[Month]
    final val September: Month = 9L.asInstanceOf[Month]
    final val October: Month = 10L.asInstanceOf[Month]
    final val November: Month = 11L.asInstanceOf[Month]
    final val December: Month = 12L.asInstanceOf[Month]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Month = value.asInstanceOf[Month]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Month] = scala.IArray[Long](1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L).asInstanceOf[scala.IArray[Month]]

    extension (self: Month)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "January"
        case 2L => "February"
        case 3L => "March"
        case 4L => "April"
        case 5L => "May"
        case 6L => "June"
        case 7L => "July"
        case 8L => "August"
        case 9L => "September"
        case 10L => "October"
        case 11L => "November"
        case 12L => "December"
        case other => other.toString
      }
  }

  /** Godot enum `Time.Weekday`. */
  opaque type Weekday <: Long = Long

  object Weekday {
    final val Sunday: Weekday = 0L.asInstanceOf[Weekday]
    final val Monday: Weekday = 1L.asInstanceOf[Weekday]
    final val Tuesday: Weekday = 2L.asInstanceOf[Weekday]
    final val Wednesday: Weekday = 3L.asInstanceOf[Weekday]
    final val Thursday: Weekday = 4L.asInstanceOf[Weekday]
    final val Friday: Weekday = 5L.asInstanceOf[Weekday]
    final val Saturday: Weekday = 6L.asInstanceOf[Weekday]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Weekday = value.asInstanceOf[Weekday]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Weekday] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[Weekday]]

    extension (self: Weekday)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Sunday"
        case 1L => "Monday"
        case 2L => "Tuesday"
        case 3L => "Wednesday"
        case 4L => "Thursday"
        case 5L => "Friday"
        case 6L => "Saturday"
        case other => other.toString
      }
  }
}
