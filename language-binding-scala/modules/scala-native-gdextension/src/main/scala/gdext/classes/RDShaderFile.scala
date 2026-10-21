package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RDShaderFile`, extends `Resource`. */
abstract class RDShaderFile extends Resource {
  override def godotClassName: String = "RDShaderFile"

  /** RDShaderFile.set_bytecode */
  final def setBytecode(bytecode: RDShaderSPIRV, version: gdext.builtin.StringName): Unit = {
    if (gdext.classes.RDShaderFile.mb_set_bytecode == null) gdext.classes.RDShaderFile.mb_set_bytecode = MethodBind.get("RDShaderFile", "set_bytecode", 1526857008L)
    Ptrcall.callVoid2(gdext.classes.RDShaderFile.mb_set_bytecode, livePtr, Wrappers.handle(bytecode), version)
  }

  /** RDShaderFile.get_spirv. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSpirv(version: gdext.builtin.StringName): RDShaderSPIRV = {
    if (gdext.classes.RDShaderFile.mb_get_spirv == null) gdext.classes.RDShaderFile.mb_get_spirv = MethodBind.get("RDShaderFile", "get_spirv", 2689310080L)
    Wrappers.owned[RDShaderSPIRV](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.RDShaderFile.mb_get_spirv, livePtr, version))
  }

  /** RDShaderFile.set_base_error */
  final def setBaseError(error: String): Unit = {
    if (gdext.classes.RDShaderFile.mb_set_base_error == null) gdext.classes.RDShaderFile.mb_set_base_error = MethodBind.get("RDShaderFile", "set_base_error", 83702148L)
    Ptrcall.callVoid1(gdext.classes.RDShaderFile.mb_set_base_error, livePtr, error)
  }

  /** RDShaderFile.get_base_error */
  final def getBaseError(): String = {
    if (gdext.classes.RDShaderFile.mb_get_base_error == null) gdext.classes.RDShaderFile.mb_get_base_error = MethodBind.get("RDShaderFile", "get_base_error", 201670096L)
    Ptrcall.call0[String](gdext.classes.RDShaderFile.mb_get_base_error, livePtr)
  }

}

object RDShaderFile {
  private[classes] var mb_set_bytecode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spirv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_base_error: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_error: GDExtensionMethodBindPtr = null
}
