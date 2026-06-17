package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
