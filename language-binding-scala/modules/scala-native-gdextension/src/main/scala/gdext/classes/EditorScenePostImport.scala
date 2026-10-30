package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorScenePostImport`, extends `RefCounted`. */
abstract class EditorScenePostImport extends RefCounted {
  override def godotClassName: String = "EditorScenePostImport"

  /** EditorScenePostImport.get_source_file */
  final def getSourceFile(): String = {
    if (gdext.classes.EditorScenePostImport.mb_get_source_file == null) gdext.classes.EditorScenePostImport.mb_get_source_file = MethodBind.get("EditorScenePostImport", "get_source_file", 201670096L)
    Ptrcall.call0[String](gdext.classes.EditorScenePostImport.mb_get_source_file, livePtr)
  }

}

object EditorScenePostImport {
  private[classes] var mb_get_source_file: GDExtensionMethodBindPtr = null
}
