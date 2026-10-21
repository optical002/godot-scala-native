package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EngineDebugger`, extends `Object`. */
abstract class EngineDebugger extends Object {
  override def godotClassName: String = "EngineDebugger"

  /** EngineDebugger.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.EngineDebugger.mb_is_active == null) gdext.classes.EngineDebugger.mb_is_active = MethodBind.get("EngineDebugger", "is_active", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.EngineDebugger.mb_is_active, livePtr)
  }

  /** EngineDebugger.register_profiler */
  final def registerProfiler(name: gdext.builtin.StringName, profiler: EngineProfiler): Unit = {
    if (gdext.classes.EngineDebugger.mb_register_profiler == null) gdext.classes.EngineDebugger.mb_register_profiler = MethodBind.get("EngineDebugger", "register_profiler", 3651669560L)
    Ptrcall.callVoid2(gdext.classes.EngineDebugger.mb_register_profiler, livePtr, name, Wrappers.handle(profiler))
  }

  /** EngineDebugger.unregister_profiler */
  final def unregisterProfiler(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.EngineDebugger.mb_unregister_profiler == null) gdext.classes.EngineDebugger.mb_unregister_profiler = MethodBind.get("EngineDebugger", "unregister_profiler", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.EngineDebugger.mb_unregister_profiler, livePtr, name)
  }

  /** EngineDebugger.is_profiling */
  final def isProfiling(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EngineDebugger.mb_is_profiling == null) gdext.classes.EngineDebugger.mb_is_profiling = MethodBind.get("EngineDebugger", "is_profiling", 2041966384L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.EngineDebugger.mb_is_profiling, livePtr, name)
  }

  /** EngineDebugger.has_profiler */
  final def hasProfiler(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EngineDebugger.mb_has_profiler == null) gdext.classes.EngineDebugger.mb_has_profiler = MethodBind.get("EngineDebugger", "has_profiler", 2041966384L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.EngineDebugger.mb_has_profiler, livePtr, name)
  }

  /** EngineDebugger.unregister_message_capture */
  final def unregisterMessageCapture(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.EngineDebugger.mb_unregister_message_capture == null) gdext.classes.EngineDebugger.mb_unregister_message_capture = MethodBind.get("EngineDebugger", "unregister_message_capture", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.EngineDebugger.mb_unregister_message_capture, livePtr, name)
  }

  /** EngineDebugger.has_capture */
  final def hasCapture(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EngineDebugger.mb_has_capture == null) gdext.classes.EngineDebugger.mb_has_capture = MethodBind.get("EngineDebugger", "has_capture", 2041966384L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.EngineDebugger.mb_has_capture, livePtr, name)
  }

  /** EngineDebugger.line_poll */
  final def linePoll(): Unit = {
    if (gdext.classes.EngineDebugger.mb_line_poll == null) gdext.classes.EngineDebugger.mb_line_poll = MethodBind.get("EngineDebugger", "line_poll", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EngineDebugger.mb_line_poll, livePtr)
  }

  /** EngineDebugger.debug */
  final def debug(can_continue: Boolean, is_error_breakpoint: Boolean): Unit = {
    if (gdext.classes.EngineDebugger.mb_debug == null) gdext.classes.EngineDebugger.mb_debug = MethodBind.get("EngineDebugger", "debug", 2751962654L)
    Ptrcall.callVoid2(gdext.classes.EngineDebugger.mb_debug, livePtr, can_continue, is_error_breakpoint)
  }

  /** EngineDebugger.script_debug */
  final def scriptDebug(language: ScriptLanguage, can_continue: Boolean, is_error_breakpoint: Boolean): Unit = {
    if (gdext.classes.EngineDebugger.mb_script_debug == null) gdext.classes.EngineDebugger.mb_script_debug = MethodBind.get("EngineDebugger", "script_debug", 2442343672L)
    Ptrcall.callVoid3(gdext.classes.EngineDebugger.mb_script_debug, livePtr, Wrappers.handle(language), can_continue, is_error_breakpoint)
  }

  /** EngineDebugger.set_lines_left */
  final def setLinesLeft(lines: Long): Unit = {
    if (gdext.classes.EngineDebugger.mb_set_lines_left == null) gdext.classes.EngineDebugger.mb_set_lines_left = MethodBind.get("EngineDebugger", "set_lines_left", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.EngineDebugger.mb_set_lines_left, livePtr, lines)
  }

  /** EngineDebugger.get_lines_left */
  final def getLinesLeft(): Long = {
    if (gdext.classes.EngineDebugger.mb_get_lines_left == null) gdext.classes.EngineDebugger.mb_get_lines_left = MethodBind.get("EngineDebugger", "get_lines_left", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EngineDebugger.mb_get_lines_left, livePtr)
  }

  /** EngineDebugger.set_depth */
  final def setDepth(depth: Long): Unit = {
    if (gdext.classes.EngineDebugger.mb_set_depth == null) gdext.classes.EngineDebugger.mb_set_depth = MethodBind.get("EngineDebugger", "set_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.EngineDebugger.mb_set_depth, livePtr, depth)
  }

  /** EngineDebugger.get_depth */
  final def getDepth(): Long = {
    if (gdext.classes.EngineDebugger.mb_get_depth == null) gdext.classes.EngineDebugger.mb_get_depth = MethodBind.get("EngineDebugger", "get_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.EngineDebugger.mb_get_depth, livePtr)
  }

  /** EngineDebugger.is_breakpoint */
  final def isBreakpoint(line: Long, source: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.EngineDebugger.mb_is_breakpoint == null) gdext.classes.EngineDebugger.mb_is_breakpoint = MethodBind.get("EngineDebugger", "is_breakpoint", 921227809L)
    Ptrcall.call2[Long, gdext.builtin.StringName, Boolean](gdext.classes.EngineDebugger.mb_is_breakpoint, livePtr, line, source)
  }

  /** EngineDebugger.is_skipping_breakpoints */
  final def isSkippingBreakpoints(): Boolean = {
    if (gdext.classes.EngineDebugger.mb_is_skipping_breakpoints == null) gdext.classes.EngineDebugger.mb_is_skipping_breakpoints = MethodBind.get("EngineDebugger", "is_skipping_breakpoints", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.EngineDebugger.mb_is_skipping_breakpoints, livePtr)
  }

  /** EngineDebugger.insert_breakpoint */
  final def insertBreakpoint(line: Long, source: gdext.builtin.StringName): Unit = {
    if (gdext.classes.EngineDebugger.mb_insert_breakpoint == null) gdext.classes.EngineDebugger.mb_insert_breakpoint = MethodBind.get("EngineDebugger", "insert_breakpoint", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.EngineDebugger.mb_insert_breakpoint, livePtr, line, source)
  }

  /** EngineDebugger.remove_breakpoint */
  final def removeBreakpoint(line: Long, source: gdext.builtin.StringName): Unit = {
    if (gdext.classes.EngineDebugger.mb_remove_breakpoint == null) gdext.classes.EngineDebugger.mb_remove_breakpoint = MethodBind.get("EngineDebugger", "remove_breakpoint", 3780747571L)
    Ptrcall.callVoid2(gdext.classes.EngineDebugger.mb_remove_breakpoint, livePtr, line, source)
  }

  /** EngineDebugger.clear_breakpoints */
  final def clearBreakpoints(): Unit = {
    if (gdext.classes.EngineDebugger.mb_clear_breakpoints == null) gdext.classes.EngineDebugger.mb_clear_breakpoints = MethodBind.get("EngineDebugger", "clear_breakpoints", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.EngineDebugger.mb_clear_breakpoints, livePtr)
  }

}

object EngineDebugger {
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_profiler: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_profiler: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_profiling: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_profiler: GDExtensionMethodBindPtr = null
  private[classes] var mb_unregister_message_capture: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_capture: GDExtensionMethodBindPtr = null
  private[classes] var mb_line_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_debug: GDExtensionMethodBindPtr = null
  private[classes] var mb_script_debug: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lines_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lines_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_breakpoint: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_skipping_breakpoints: GDExtensionMethodBindPtr = null
  private[classes] var mb_insert_breakpoint: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_breakpoint: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_breakpoints: GDExtensionMethodBindPtr = null

  private var instance: EngineDebugger = null

  /** The process-global EngineDebugger singleton instance. */
  def singleton: EngineDebugger = {
    if (instance == null)
      instance = Wrappers.borrowed[EngineDebugger](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("EngineDebugger").ptr)))
    instance
  }
}
