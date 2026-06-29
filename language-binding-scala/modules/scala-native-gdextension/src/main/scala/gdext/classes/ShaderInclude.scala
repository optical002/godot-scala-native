package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderInclude`, extends `Resource`. */
abstract class ShaderInclude extends Resource {
  override def godotClassName: String = "ShaderInclude"

  /** ShaderInclude.set_code */
  final def setCode(code: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShaderInclude", "set_code", 83702148L), hostObject.objectPtr, code)

  /** ShaderInclude.get_code */
  final def getCode(): String =
    Ptrcall.call0[String](MethodBind.get("ShaderInclude", "get_code", 201670096L), hostObject.objectPtr)

}
