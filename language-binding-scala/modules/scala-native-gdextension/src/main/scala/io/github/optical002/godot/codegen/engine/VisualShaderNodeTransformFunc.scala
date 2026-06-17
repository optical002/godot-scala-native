package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTransformFunc`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTransformFunc extends VisualShaderNode {

  /** VisualShaderNodeTransformFunc.set_function */
  final def setFunction(func: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTransformFunc", "set_function", 2900990409L), hostObject.objectPtr, func)

  /** VisualShaderNodeTransformFunc.get_function */
  final def getFunction(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTransformFunc", "get_function", 2839926569L), hostObject.objectPtr)

}

object VisualShaderNodeTransformFunc {
  /** Class metadata for Gd[VisualShaderNodeTransformFunc] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTransformFunc] with {
    def className = "VisualShaderNodeTransformFunc"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTransformFunc = new VisualShaderNodeTransformFunc {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTransformFunc): GodotObject = t.hostObject
  }
}
