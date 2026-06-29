package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RDShaderSPIRV`, extends `Resource`. */
abstract class RDShaderSPIRV extends Resource {
  override def godotClassName: String = "RDShaderSPIRV"

  /** RDShaderSPIRV.set_stage_compile_error */
  final def setStageCompileError(stage: Long, compile_error: String): Unit =
    Ptrcall.callVoid2(MethodBind.get("RDShaderSPIRV", "set_stage_compile_error", 620821314L), hostObject.objectPtr, stage, compile_error)

  /** RDShaderSPIRV.get_stage_compile_error */
  final def getStageCompileError(stage: Long): String =
    Ptrcall.call1[Long, String](MethodBind.get("RDShaderSPIRV", "get_stage_compile_error", 3354920045L), hostObject.objectPtr, stage)

}
