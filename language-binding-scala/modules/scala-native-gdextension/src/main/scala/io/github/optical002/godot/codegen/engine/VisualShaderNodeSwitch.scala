package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeSwitch`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSwitch extends VisualShaderNode {

  /** VisualShaderNodeSwitch.set_op_type */
  final def setOpType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeSwitch", "set_op_type", 510471861L), hostObject.objectPtr, `type`)

  /** VisualShaderNodeSwitch.get_op_type */
  final def getOpType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeSwitch", "get_op_type", 2517845071L), hostObject.objectPtr)

}

object VisualShaderNodeSwitch {
  /** Class metadata for Gd[VisualShaderNodeSwitch] lifetime management and casting. */
  given GodotClass[VisualShaderNodeSwitch] with {
    def className = "VisualShaderNodeSwitch"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeSwitch = new VisualShaderNodeSwitch {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeSwitch): GodotObject = t.hostObject
  }
}
