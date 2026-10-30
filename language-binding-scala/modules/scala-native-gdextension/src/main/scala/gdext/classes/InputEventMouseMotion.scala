package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventMouseMotion`, extends `InputEventMouse`. */
abstract class InputEventMouseMotion extends InputEventMouse {
  override def godotClassName: String = "InputEventMouseMotion"

  /** InputEventMouseMotion.set_tilt */
  final def setTilt(tilt: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_tilt == null) gdext.classes.InputEventMouseMotion.mb_set_tilt = MethodBind.get("InputEventMouseMotion", "set_tilt", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_tilt, livePtr, tilt)
  }

  /** InputEventMouseMotion.get_tilt */
  final def getTilt(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouseMotion.mb_get_tilt == null) gdext.classes.InputEventMouseMotion.mb_get_tilt = MethodBind.get("InputEventMouseMotion", "get_tilt", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouseMotion.mb_get_tilt, livePtr)
  }

  /** InputEventMouseMotion.set_pressure */
  final def setPressure(pressure: Double): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_pressure == null) gdext.classes.InputEventMouseMotion.mb_set_pressure = MethodBind.get("InputEventMouseMotion", "set_pressure", 373806689L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_pressure, livePtr, pressure)
  }

  /** InputEventMouseMotion.get_pressure */
  final def getPressure(): Double = {
    if (gdext.classes.InputEventMouseMotion.mb_get_pressure == null) gdext.classes.InputEventMouseMotion.mb_get_pressure = MethodBind.get("InputEventMouseMotion", "get_pressure", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.InputEventMouseMotion.mb_get_pressure, livePtr)
  }

  /** InputEventMouseMotion.set_pen_inverted */
  final def setPenInverted(penInverted: Boolean): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_pen_inverted == null) gdext.classes.InputEventMouseMotion.mb_set_pen_inverted = MethodBind.get("InputEventMouseMotion", "set_pen_inverted", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_pen_inverted, livePtr, penInverted)
  }

  /** InputEventMouseMotion.get_pen_inverted */
  final def getPenInverted(): Boolean = {
    if (gdext.classes.InputEventMouseMotion.mb_get_pen_inverted == null) gdext.classes.InputEventMouseMotion.mb_get_pen_inverted = MethodBind.get("InputEventMouseMotion", "get_pen_inverted", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.InputEventMouseMotion.mb_get_pen_inverted, livePtr)
  }

  /** InputEventMouseMotion.set_relative */
  final def setRelative(relative: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_relative == null) gdext.classes.InputEventMouseMotion.mb_set_relative = MethodBind.get("InputEventMouseMotion", "set_relative", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_relative, livePtr, relative)
  }

  /** InputEventMouseMotion.get_relative */
  final def getRelative(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouseMotion.mb_get_relative == null) gdext.classes.InputEventMouseMotion.mb_get_relative = MethodBind.get("InputEventMouseMotion", "get_relative", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouseMotion.mb_get_relative, livePtr)
  }

  /** InputEventMouseMotion.set_screen_relative */
  final def setScreenRelative(relative: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_screen_relative == null) gdext.classes.InputEventMouseMotion.mb_set_screen_relative = MethodBind.get("InputEventMouseMotion", "set_screen_relative", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_screen_relative, livePtr, relative)
  }

  /** InputEventMouseMotion.get_screen_relative */
  final def getScreenRelative(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouseMotion.mb_get_screen_relative == null) gdext.classes.InputEventMouseMotion.mb_get_screen_relative = MethodBind.get("InputEventMouseMotion", "get_screen_relative", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouseMotion.mb_get_screen_relative, livePtr)
  }

  /** InputEventMouseMotion.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_velocity == null) gdext.classes.InputEventMouseMotion.mb_set_velocity = MethodBind.get("InputEventMouseMotion", "set_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_velocity, livePtr, velocity)
  }

  /** InputEventMouseMotion.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouseMotion.mb_get_velocity == null) gdext.classes.InputEventMouseMotion.mb_get_velocity = MethodBind.get("InputEventMouseMotion", "get_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouseMotion.mb_get_velocity, livePtr)
  }

  /** InputEventMouseMotion.set_screen_velocity */
  final def setScreenVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.InputEventMouseMotion.mb_set_screen_velocity == null) gdext.classes.InputEventMouseMotion.mb_set_screen_velocity = MethodBind.get("InputEventMouseMotion", "set_screen_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.InputEventMouseMotion.mb_set_screen_velocity, livePtr, velocity)
  }

  /** InputEventMouseMotion.get_screen_velocity */
  final def getScreenVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.InputEventMouseMotion.mb_get_screen_velocity == null) gdext.classes.InputEventMouseMotion.mb_get_screen_velocity = MethodBind.get("InputEventMouseMotion", "get_screen_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.InputEventMouseMotion.mb_get_screen_velocity, livePtr)
  }

}

object InputEventMouseMotion {
  private[classes] var mb_set_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tilt: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressure: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pen_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pen_inverted: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_relative: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_screen_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_screen_velocity: GDExtensionMethodBindPtr = null
}
