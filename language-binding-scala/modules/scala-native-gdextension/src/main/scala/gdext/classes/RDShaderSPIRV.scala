package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDShaderSPIRV`, extends `Resource`. */
abstract class RDShaderSPIRV extends Resource {
  override def godotClassName: String = "RDShaderSPIRV"

  /** RDShaderSPIRV.set_stage_compile_error */
  final def setStageCompileError(stage: Long, compile_error: String): Unit = {
    if (gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error == null) gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error = MethodBind.get("RDShaderSPIRV", "set_stage_compile_error", 620821314L)
    Ptrcall.callVoid2(gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error, livePtr, stage, compile_error)
  }

  /** RDShaderSPIRV.get_stage_compile_error */
  final def getStageCompileError(stage: Long): String = {
    if (gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error == null) gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error = MethodBind.get("RDShaderSPIRV", "get_stage_compile_error", 3354920045L)
    Ptrcall.call1[Long, String](gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error, livePtr, stage)
  }

}

object RDShaderSPIRV {
  private[classes] var mb_set_stage_compile_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stage_compile_error: GDExtensionMethodBindPtr = null
}
