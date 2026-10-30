package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorDebuggerSession`, extends `RefCounted`. */
abstract class EditorDebuggerSession extends RefCounted {
  override def godotClassName: String = "EditorDebuggerSession"

  /** EditorDebuggerSession.is_breaked */
  final def isBreaked(): Boolean = {
    if (gdext.classes.EditorDebuggerSession.mb_is_breaked == null) gdext.classes.EditorDebuggerSession.mb_is_breaked = MethodBind.get("EditorDebuggerSession", "is_breaked", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDebuggerSession.mb_is_breaked, livePtr)
  }

  /** EditorDebuggerSession.is_debuggable */
  final def isDebuggable(): Boolean = {
    if (gdext.classes.EditorDebuggerSession.mb_is_debuggable == null) gdext.classes.EditorDebuggerSession.mb_is_debuggable = MethodBind.get("EditorDebuggerSession", "is_debuggable", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDebuggerSession.mb_is_debuggable, livePtr)
  }

  /** EditorDebuggerSession.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.EditorDebuggerSession.mb_is_active == null) gdext.classes.EditorDebuggerSession.mb_is_active = MethodBind.get("EditorDebuggerSession", "is_active", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.EditorDebuggerSession.mb_is_active, livePtr)
  }

  /** EditorDebuggerSession.add_session_tab */
  final def addSessionTab(control: Control): Unit = {
    if (gdext.classes.EditorDebuggerSession.mb_add_session_tab == null) gdext.classes.EditorDebuggerSession.mb_add_session_tab = MethodBind.get("EditorDebuggerSession", "add_session_tab", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorDebuggerSession.mb_add_session_tab, livePtr, Wrappers.handle(control))
  }

  /** EditorDebuggerSession.remove_session_tab */
  final def removeSessionTab(control: Control): Unit = {
    if (gdext.classes.EditorDebuggerSession.mb_remove_session_tab == null) gdext.classes.EditorDebuggerSession.mb_remove_session_tab = MethodBind.get("EditorDebuggerSession", "remove_session_tab", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.EditorDebuggerSession.mb_remove_session_tab, livePtr, Wrappers.handle(control))
  }

  /** EditorDebuggerSession.set_breakpoint */
  final def setBreakpoint(path: String, line: Long, enabled: Boolean): Unit = {
    if (gdext.classes.EditorDebuggerSession.mb_set_breakpoint == null) gdext.classes.EditorDebuggerSession.mb_set_breakpoint = MethodBind.get("EditorDebuggerSession", "set_breakpoint", 4108344793L)
    Ptrcall.callVoid3(gdext.classes.EditorDebuggerSession.mb_set_breakpoint, livePtr, path, line, enabled)
  }

}

object EditorDebuggerSession {
  private[classes] var mb_is_breaked: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_debuggable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_session_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_session_tab: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_breakpoint: GDExtensionMethodBindPtr = null
}
