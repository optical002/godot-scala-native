package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventMouseMotion`, extends `InputEventMouse`. */
abstract class InputEventMouseMotion extends InputEventMouse {

  /** InputEventMouseMotion.set_tilt */
  final def setTilt(tilt: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_tilt", 743155724L), hostObject.objectPtr, tilt)

  /** InputEventMouseMotion.get_tilt */
  final def getTilt(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventMouseMotion", "get_tilt", 3341600327L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_pressure */
  final def setPressure(pressure: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_pressure", 373806689L), hostObject.objectPtr, pressure)

  /** InputEventMouseMotion.get_pressure */
  final def getPressure(): Double =
    Ptrcall.call0[Double](MethodBind.get("InputEventMouseMotion", "get_pressure", 1740695150L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_pen_inverted */
  final def setPenInverted(pen_inverted: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_pen_inverted", 2586408642L), hostObject.objectPtr, pen_inverted)

  /** InputEventMouseMotion.get_pen_inverted */
  final def getPenInverted(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("InputEventMouseMotion", "get_pen_inverted", 36873697L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_relative */
  final def setRelative(relative: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_relative", 743155724L), hostObject.objectPtr, relative)

  /** InputEventMouseMotion.get_relative */
  final def getRelative(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventMouseMotion", "get_relative", 3341600327L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_screen_relative */
  final def setScreenRelative(relative: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_screen_relative", 743155724L), hostObject.objectPtr, relative)

  /** InputEventMouseMotion.get_screen_relative */
  final def getScreenRelative(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventMouseMotion", "get_screen_relative", 3341600327L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_velocity */
  final def setVelocity(velocity: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** InputEventMouseMotion.get_velocity */
  final def getVelocity(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventMouseMotion", "get_velocity", 3341600327L), hostObject.objectPtr)

  /** InputEventMouseMotion.set_screen_velocity */
  final def setScreenVelocity(velocity: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventMouseMotion", "set_screen_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** InputEventMouseMotion.get_screen_velocity */
  final def getScreenVelocity(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("InputEventMouseMotion", "get_screen_velocity", 3341600327L), hostObject.objectPtr)

}

object InputEventMouseMotion {
  /** Class metadata for Gd[InputEventMouseMotion] lifetime management and casting. */
  given GodotClass[InputEventMouseMotion] with {
    def className = "InputEventMouseMotion"
    def isRefCounted = true
    def wrap(o: GodotObject): InputEventMouseMotion = new InputEventMouseMotion {}.withHost(o.objectPtr)
    def unwrap(t: InputEventMouseMotion): GodotObject = t.hostObject
  }
}
