package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ShaderMaterial`, extends `Material`. */
abstract class ShaderMaterial extends Material {
  override def godotClassName: String = "ShaderMaterial"

  /** ShaderMaterial.set_shader */
  final def setShader(shader: Shader): Unit =
    Ptrcall.callVoid1(MethodBind.get("ShaderMaterial", "set_shader", 3341921675L), hostObject.objectPtr, shader.hostObject)

  /** ShaderMaterial.get_shader */
  final def getShader(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ShaderMaterial", "get_shader", 2078273437L), hostObject.objectPtr)

}
