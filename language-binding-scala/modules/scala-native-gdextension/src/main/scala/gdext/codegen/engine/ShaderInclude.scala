package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderInclude`, extends `Resource`. */
abstract class ShaderInclude extends Resource {

  /** ShaderInclude.set_code */
  final def setCode(code: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShaderInclude", "set_code", 83702148L), hostObject.objectPtr, code)

  /** ShaderInclude.get_code */
  final def getCode(): String =
    Ptrcall.call0[String](MethodBind.get("ShaderInclude", "get_code", 201670096L), hostObject.objectPtr)

}

object ShaderInclude {
  /** Class metadata for Gd[ShaderInclude] lifetime management and casting. */
  given GodotClass[ShaderInclude] with {
    def className = "ShaderInclude"
    def isRefCounted = true
    def wrap(o: GodotObject): ShaderInclude = new ShaderInclude {}.withHost(o.objectPtr)
    def unwrap(t: ShaderInclude): GodotObject = t.hostObject
  }
}
