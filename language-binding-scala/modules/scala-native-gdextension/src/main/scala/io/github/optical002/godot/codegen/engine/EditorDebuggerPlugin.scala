package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorDebuggerPlugin`, extends `RefCounted`. */
abstract class EditorDebuggerPlugin extends RefCounted {

  /** EditorDebuggerPlugin.get_session */
  final def getSession(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("EditorDebuggerPlugin", "get_session", 3061968499L), hostObject.objectPtr, id)

}

object EditorDebuggerPlugin {
  /** Class metadata for Gd[EditorDebuggerPlugin] lifetime management and casting. */
  given GodotClass[EditorDebuggerPlugin] with {
    def className = "EditorDebuggerPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorDebuggerPlugin = new EditorDebuggerPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorDebuggerPlugin): GodotObject = t.hostObject
  }
}
