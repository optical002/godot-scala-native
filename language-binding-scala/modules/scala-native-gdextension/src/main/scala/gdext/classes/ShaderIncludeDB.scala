package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ShaderIncludeDB`, extends `Object`. */
abstract class ShaderIncludeDB extends Object {
  override def godotClassName: String = "ShaderIncludeDB"

}

object ShaderIncludeDB {
  private[classes] var mb_has_built_in_include_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_built_in_include_file: GDExtensionMethodBindPtr = null

  /** ShaderIncludeDB.has_built_in_include_file */
  final def hasBuiltInIncludeFile(filename: String): Boolean = {
    if (gdext.classes.ShaderIncludeDB.mb_has_built_in_include_file == null) gdext.classes.ShaderIncludeDB.mb_has_built_in_include_file = MethodBind.get("ShaderIncludeDB", "has_built_in_include_file", 2323990056L)
    Ptrcall.call1[String, Boolean](gdext.classes.ShaderIncludeDB.mb_has_built_in_include_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], filename)
  }

  /** ShaderIncludeDB.get_built_in_include_file */
  final def getBuiltInIncludeFile(filename: String): String = {
    if (gdext.classes.ShaderIncludeDB.mb_get_built_in_include_file == null) gdext.classes.ShaderIncludeDB.mb_get_built_in_include_file = MethodBind.get("ShaderIncludeDB", "get_built_in_include_file", 1703090593L)
    Ptrcall.call1[String, String](gdext.classes.ShaderIncludeDB.mb_get_built_in_include_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], filename)
  }
}
