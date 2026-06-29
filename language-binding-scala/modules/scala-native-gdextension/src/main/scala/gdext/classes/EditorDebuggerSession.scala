package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorDebuggerSession`, extends `RefCounted`. */
abstract class EditorDebuggerSession extends RefCounted {
  override def godotClassName: String = "EditorDebuggerSession"

  /** EditorDebuggerSession.is_breaked */
  final def isBreaked(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDebuggerSession", "is_breaked", 2240911060L), hostObject.objectPtr)

  /** EditorDebuggerSession.is_debuggable */
  final def isDebuggable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDebuggerSession", "is_debuggable", 2240911060L), hostObject.objectPtr)

  /** EditorDebuggerSession.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EditorDebuggerSession", "is_active", 2240911060L), hostObject.objectPtr)

  /** EditorDebuggerSession.add_session_tab */
  final def addSessionTab(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDebuggerSession", "add_session_tab", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorDebuggerSession.remove_session_tab */
  final def removeSessionTab(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("EditorDebuggerSession", "remove_session_tab", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** EditorDebuggerSession.set_breakpoint */
  final def setBreakpoint(path: String, line: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("EditorDebuggerSession", "set_breakpoint", 4108344793L), hostObject.objectPtr, path, line, enabled)

}
