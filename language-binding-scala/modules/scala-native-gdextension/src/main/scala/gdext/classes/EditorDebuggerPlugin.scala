package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorDebuggerPlugin`, extends `RefCounted`. */
abstract class EditorDebuggerPlugin extends RefCounted {
  override def godotClassName: String = "EditorDebuggerPlugin"

  /** EditorDebuggerPlugin.get_session. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSession(id: Long): EditorDebuggerSession = {
    if (gdext.classes.EditorDebuggerPlugin.mb_get_session == null) gdext.classes.EditorDebuggerPlugin.mb_get_session = MethodBind.get("EditorDebuggerPlugin", "get_session", 3061968499L)
    Wrappers.owned[EditorDebuggerSession](Ptrcall.call1[Long, Long](gdext.classes.EditorDebuggerPlugin.mb_get_session, livePtr, id))
  }

}

object EditorDebuggerPlugin {
  private[classes] var mb_get_session: GDExtensionMethodBindPtr = null
}
