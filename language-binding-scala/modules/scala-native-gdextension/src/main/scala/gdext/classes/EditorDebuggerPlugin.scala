package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorDebuggerPlugin`, extends `RefCounted`. */
abstract class EditorDebuggerPlugin extends RefCounted {
  override def godotClassName: String = "EditorDebuggerPlugin"

  /** EditorDebuggerPlugin.get_session */
  final def getSession(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("EditorDebuggerPlugin", "get_session", 3061968499L), hostObject.objectPtr, id)

}
