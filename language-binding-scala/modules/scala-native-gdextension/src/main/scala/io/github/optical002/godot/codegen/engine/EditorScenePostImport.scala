package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorScenePostImport`, extends `RefCounted`. */
abstract class EditorScenePostImport extends RefCounted {

  /** EditorScenePostImport.get_source_file */
  final def getSourceFile(): String =
    Ptrcall.call0[String](MethodBind.get("EditorScenePostImport", "get_source_file", 201670096L), hostObject.objectPtr)

}

object EditorScenePostImport {
  /** Class metadata for Gd[EditorScenePostImport] lifetime management and casting. */
  given GodotClass[EditorScenePostImport] with {
    def className = "EditorScenePostImport"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorScenePostImport = new EditorScenePostImport {}.withHost(o.objectPtr)
    def unwrap(t: EditorScenePostImport): GodotObject = t.hostObject
  }
}
