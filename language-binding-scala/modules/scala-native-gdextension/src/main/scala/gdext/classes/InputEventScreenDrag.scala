package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventScreenDrag`, extends `InputEventFromWindow`. */
abstract class InputEventScreenDrag extends InputEventFromWindow {
  override def godotClassName: String = "InputEventScreenDrag"

  /** InputEventScreenDrag.set_index */
  final def setIndex(index: Long): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_index == null) gdext.classes.InputEventScreenDrag.mb_set_index = MethodBind.get("InputEventScreenDrag", "set_index", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_index, livePtr, index)
  }

  /** InputEventScreenDrag.get_index */
  final def getIndex(): Long = {
    if (gdext.classes.InputEventScreenDrag.mb_get_index == null) gdext.classes.InputEventScreenDrag.mb_get_index = MethodBind.get("InputEventScreenDrag", "get_index", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.InputEventScreenDrag.mb_get_index, livePtr)
  }

  /** InputEventScreenDrag.set_tilt */
  final def setTilt(tilt: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_tilt == null) gdext.classes.InputEventScreenDrag.mb_set_tilt = MethodBind.get("InputEventScreenDrag", "set_tilt", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_tilt, livePtr, tilt)
  }

  /** InputEventScreenDrag.get_tilt */
  final def getTilt(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_tilt == null) gdext.classes.InputEventScreenDrag.mb_get_tilt = MethodBind.get("InputEventScreenDrag", "get_tilt", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_tilt, livePtr)
  }

  /** InputEventScreenDrag.set_pressure */
  final def setPressure(pressure: Double): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_pressure == null) gdext.classes.InputEventScreenDrag.mb_set_pressure = MethodBind.get("InputEventScreenDrag", "set_pressure", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_pressure, livePtr, pressure)
  }

  /** InputEventScreenDrag.get_pressure */
  final def getPressure(): Double = {
    if (gdext.classes.InputEventScreenDrag.mb_get_pressure == null) gdext.classes.InputEventScreenDrag.mb_get_pressure = MethodBind.get("InputEventScreenDrag", "get_pressure", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventScreenDrag.mb_get_pressure, livePtr)
  }

  /** InputEventScreenDrag.set_pen_inverted */
  final def setPenInverted(pen_inverted: Boolean): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_pen_inverted == null) gdext.classes.InputEventScreenDrag.mb_set_pen_inverted = MethodBind.get("InputEventScreenDrag", "set_pen_inverted", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_pen_inverted, livePtr, pen_inverted)
  }

  /** InputEventScreenDrag.get_pen_inverted */
  final def getPenInverted(): Boolean = {
    if (gdext.classes.InputEventScreenDrag.mb_get_pen_inverted == null) gdext.classes.InputEventScreenDrag.mb_get_pen_inverted = MethodBind.get("InputEventScreenDrag", "get_pen_inverted", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventScreenDrag.mb_get_pen_inverted, livePtr)
  }

  /** InputEventScreenDrag.set_position */
  final def setPosition(position: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_position == null) gdext.classes.InputEventScreenDrag.mb_set_position = MethodBind.get("InputEventScreenDrag", "set_position", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_position, livePtr, position)
  }

  /** InputEventScreenDrag.get_position */
  final def getPosition(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_position == null) gdext.classes.InputEventScreenDrag.mb_get_position = MethodBind.get("InputEventScreenDrag", "get_position", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_position, livePtr)
  }

  /** InputEventScreenDrag.set_relative */
  final def setRelative(relative: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_relative == null) gdext.classes.InputEventScreenDrag.mb_set_relative = MethodBind.get("InputEventScreenDrag", "set_relative", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_relative, livePtr, relative)
  }

  /** InputEventScreenDrag.get_relative */
  final def getRelative(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_relative == null) gdext.classes.InputEventScreenDrag.mb_get_relative = MethodBind.get("InputEventScreenDrag", "get_relative", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_relative, livePtr)
  }

  /** InputEventScreenDrag.set_screen_relative */
  final def setScreenRelative(relative: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_screen_relative == null) gdext.classes.InputEventScreenDrag.mb_set_screen_relative = MethodBind.get("InputEventScreenDrag", "set_screen_relative", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_screen_relative, livePtr, relative)
  }

  /** InputEventScreenDrag.get_screen_relative */
  final def getScreenRelative(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_screen_relative == null) gdext.classes.InputEventScreenDrag.mb_get_screen_relative = MethodBind.get("InputEventScreenDrag", "get_screen_relative", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_screen_relative, livePtr)
  }

  /** InputEventScreenDrag.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_velocity == null) gdext.classes.InputEventScreenDrag.mb_set_velocity = MethodBind.get("InputEventScreenDrag", "set_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_velocity, livePtr, velocity)
  }

  /** InputEventScreenDrag.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_velocity == null) gdext.classes.InputEventScreenDrag.mb_get_velocity = MethodBind.get("InputEventScreenDrag", "get_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_velocity, livePtr)
  }

  /** InputEventScreenDrag.set_screen_velocity */
  final def setScreenVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventScreenDrag.mb_set_screen_velocity == null) gdext.classes.InputEventScreenDrag.mb_set_screen_velocity = MethodBind.get("InputEventScreenDrag", "set_screen_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventScreenDrag.mb_set_screen_velocity, livePtr, velocity)
  }

  /** InputEventScreenDrag.get_screen_velocity */
  final def getScreenVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventScreenDrag.mb_get_screen_velocity == null) gdext.classes.InputEventScreenDrag.mb_get_screen_velocity = MethodBind.get("InputEventScreenDrag", "get_screen_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventScreenDrag.mb_get_screen_velocity, livePtr)
  }

}

object InputEventScreenDrag {
  private[classes] var mb_set_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_index: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pen_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pen_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_velocity: GDExtensionMethodBindPtr = null
}
