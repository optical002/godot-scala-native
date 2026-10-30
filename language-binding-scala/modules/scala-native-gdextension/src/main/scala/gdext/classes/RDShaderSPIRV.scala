package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDShaderSPIRV`, extends `Resource`. */
abstract class RDShaderSPIRV extends Resource {
  override def godotClassName: String = "RDShaderSPIRV"

  /** RDShaderSPIRV.set_stage_compile_error */
  final def setStageCompileError(stage: gdext.classes.RenderingDevice.ShaderStage, compileError: String): Unit = {
    if (gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error == null) gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error = MethodBind.get("RDShaderSPIRV", "set_stage_compile_error", 620821314L)
    Ptrcall.callVoid2(gdext.classes.RDShaderSPIRV.mb_set_stage_compile_error, livePtr, stage, compileError)
  }

  /** RDShaderSPIRV.get_stage_compile_error */
  final def getStageCompileError(stage: gdext.classes.RenderingDevice.ShaderStage): String = {
    if (gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error == null) gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error = MethodBind.get("RDShaderSPIRV", "get_stage_compile_error", 3354920045L)
    Ptrcall.call1[Long, String](gdext.classes.RDShaderSPIRV.mb_get_stage_compile_error, livePtr, stage)
  }

}

object RDShaderSPIRV {
  private[classes] var mb_set_stage_compile_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stage_compile_error: GDExtensionMethodBindPtr = null
}
