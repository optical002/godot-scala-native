package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RDShaderSPIRV`, extends `Resource`. */
abstract class RDShaderSPIRV extends Resource {

  /** RDShaderSPIRV.set_stage_compile_error */
  final def setStageCompileError(stage: Long, compile_error: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("RDShaderSPIRV", "set_stage_compile_error", 620821314L), hostObject.objectPtr, stage, compile_error)

  /** RDShaderSPIRV.get_stage_compile_error */
  final def getStageCompileError(stage: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("RDShaderSPIRV", "get_stage_compile_error", 3354920045L), hostObject.objectPtr, stage)

}

object RDShaderSPIRV {
  /** Class metadata for Gd[RDShaderSPIRV] lifetime management and casting. */
  given GodotClass[RDShaderSPIRV] with {
    def className = "RDShaderSPIRV"
    def isRefCounted = true
    def wrap(o: GodotObject): RDShaderSPIRV = new RDShaderSPIRV {}.withHost(o.objectPtr)
    def unwrap(t: RDShaderSPIRV): GodotObject = t.hostObject
  }
}
