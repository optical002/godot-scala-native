package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ShaderInclude`, extends `Resource`. */
abstract class ShaderInclude extends Resource {
  override def godotClassName: String = "ShaderInclude"

  /** ShaderInclude.set_code */
  final def setCode(code: String): Unit = {
    if (gdext.classes.ShaderInclude.mb_set_code == null) gdext.classes.ShaderInclude.mb_set_code = MethodBind.get("ShaderInclude", "set_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ShaderInclude.mb_set_code, livePtr, code)
  }

  /** ShaderInclude.get_code */
  final def getCode(): String = {
    if (gdext.classes.ShaderInclude.mb_get_code == null) gdext.classes.ShaderInclude.mb_get_code = MethodBind.get("ShaderInclude", "get_code", 201670096L)
    Ptrcall.call0[String](gdext.classes.ShaderInclude.mb_get_code, livePtr)
  }

}

object ShaderInclude {
  private[classes] var mb_set_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code: GDExtensionMethodBindPtr = null
}
