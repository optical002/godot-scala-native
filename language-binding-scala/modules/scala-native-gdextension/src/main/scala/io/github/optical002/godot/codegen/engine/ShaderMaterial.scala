package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderMaterial`, extends `Material`. */
abstract class ShaderMaterial extends Material {

  /** ShaderMaterial.set_shader */
  final def setShader(shader: Shader): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShaderMaterial", "set_shader", 3341921675L), hostObject.objectPtr, shader.hostObject)

  /** ShaderMaterial.get_shader */
  final def getShader(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ShaderMaterial", "get_shader", 2078273437L), hostObject.objectPtr)

}

object ShaderMaterial {
  /** Class metadata for Gd[ShaderMaterial] lifetime management and casting. */
  given GodotClass[ShaderMaterial] with {
    def className = "ShaderMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): ShaderMaterial = new ShaderMaterial {}.withHost(o.objectPtr)
    def unwrap(t: ShaderMaterial): GodotObject = t.hostObject
  }
}
