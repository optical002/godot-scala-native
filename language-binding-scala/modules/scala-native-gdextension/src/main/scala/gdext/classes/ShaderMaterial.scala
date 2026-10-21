package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ShaderMaterial`, extends `Material`. */
abstract class ShaderMaterial extends Material {
  override def godotClassName: String = "ShaderMaterial"

  /** ShaderMaterial.set_shader */
  final def setShader(shader: Shader): Unit = {
    if (gdext.classes.ShaderMaterial.mb_set_shader == null) gdext.classes.ShaderMaterial.mb_set_shader = MethodBind.get("ShaderMaterial", "set_shader", 3341921675L)
    Ptrcall.callVoid1(gdext.classes.ShaderMaterial.mb_set_shader, livePtr, Wrappers.handle(shader))
  }

  /** ShaderMaterial.get_shader. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShader(): Shader = {
    if (gdext.classes.ShaderMaterial.mb_get_shader == null) gdext.classes.ShaderMaterial.mb_get_shader = MethodBind.get("ShaderMaterial", "get_shader", 2078273437L)
    Wrappers.owned[Shader](Ptrcall.call0[Long](gdext.classes.ShaderMaterial.mb_get_shader, livePtr))
  }

}

object ShaderMaterial {
  private[classes] var mb_set_shader: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shader: GDExtensionMethodBindPtr = null
}
