package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScenePostImport`, extends `RefCounted`. */
abstract class EditorScenePostImport extends RefCounted {
  override def godotClassName: String = "EditorScenePostImport"

  /** EditorScenePostImport.get_source_file */
  final def getSourceFile(): String =
    Ptrcall.call0[String](MethodBind.get("EditorScenePostImport", "get_source_file", 201670096L), hostObject.objectPtr)

}
