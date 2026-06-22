package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
