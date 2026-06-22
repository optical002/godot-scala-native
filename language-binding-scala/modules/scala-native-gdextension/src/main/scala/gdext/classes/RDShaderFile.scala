package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RDShaderFile`, extends `Resource`. */
abstract class RDShaderFile extends Resource {

  /** RDShaderFile.set_bytecode */
  final def setBytecode(bytecode: RDShaderSPIRV, version: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("RDShaderFile", "set_bytecode", 1526857008L), hostObject.objectPtr, bytecode.hostObject, version)

  /** RDShaderFile.get_spirv */
  final def getSpirv(version: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("RDShaderFile", "get_spirv", 2689310080L), hostObject.objectPtr, version)

  /** RDShaderFile.set_base_error */
  final def setBaseError(error: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("RDShaderFile", "set_base_error", 83702148L), hostObject.objectPtr, error)

  /** RDShaderFile.get_base_error */
  final def getBaseError(): String =
    Ptrcall.call0[String](MethodBind.get("RDShaderFile", "get_base_error", 201670096L), hostObject.objectPtr)

}

object RDShaderFile {
  /** Class metadata for Gd[RDShaderFile] lifetime management and casting. */
  given GodotClass[RDShaderFile] with {
    def className = "RDShaderFile"
    def isRefCounted = true
    def wrap(o: GodotObject): RDShaderFile = new RDShaderFile {}.withHost(o.objectPtr)
    def unwrap(t: RDShaderFile): GodotObject = t.hostObject
  }
}
