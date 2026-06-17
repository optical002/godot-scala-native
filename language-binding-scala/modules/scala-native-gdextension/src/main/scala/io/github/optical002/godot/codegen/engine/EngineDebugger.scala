package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `EngineDebugger`, extends `Object`. */
abstract class EngineDebugger extends Object {

  /** EngineDebugger.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EngineDebugger", "is_active", 2240911060L), hostObject.objectPtr)

  /** EngineDebugger.register_profiler */
  final def registerProfiler(name: io.github.optical002.godot.builtin.StringName, profiler: EngineProfiler): Unit =
    Ptrcall.callVoid2(MethodBind.get("EngineDebugger", "register_profiler", 3651669560L), hostObject.objectPtr, name, profiler.hostObject)

  /** EngineDebugger.unregister_profiler */
  final def unregisterProfiler(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("EngineDebugger", "unregister_profiler", 3304788590L), hostObject.objectPtr, name)

  /** EngineDebugger.is_profiling */
  final def isProfiling(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("EngineDebugger", "is_profiling", 2041966384L), hostObject.objectPtr, name)

  /** EngineDebugger.has_profiler */
  final def hasProfiler(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("EngineDebugger", "has_profiler", 2041966384L), hostObject.objectPtr, name)

  /** EngineDebugger.unregister_message_capture */
  final def unregisterMessageCapture(name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("EngineDebugger", "unregister_message_capture", 3304788590L), hostObject.objectPtr, name)

  /** EngineDebugger.has_capture */
  final def hasCapture(name: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("EngineDebugger", "has_capture", 2041966384L), hostObject.objectPtr, name)

  /** EngineDebugger.line_poll */
  final def linePoll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EngineDebugger", "line_poll", 3218959716L), hostObject.objectPtr)

  /** EngineDebugger.debug */
  final def debug(can_continue: Boolean, is_error_breakpoint: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("EngineDebugger", "debug", 2751962654L), hostObject.objectPtr, can_continue, is_error_breakpoint)

  /** EngineDebugger.script_debug */
  final def scriptDebug(language: ScriptLanguage, can_continue: Boolean, is_error_breakpoint: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("EngineDebugger", "script_debug", 2442343672L), hostObject.objectPtr, language.hostObject, can_continue, is_error_breakpoint)

  /** EngineDebugger.set_lines_left */
  final def setLinesLeft(lines: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EngineDebugger", "set_lines_left", 1286410249L), hostObject.objectPtr, lines)

  /** EngineDebugger.get_lines_left */
  final def getLinesLeft(): Long =
    Ptrcall.call0[Long](MethodBind.get("EngineDebugger", "get_lines_left", 3905245786L), hostObject.objectPtr)

  /** EngineDebugger.set_depth */
  final def setDepth(depth: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("EngineDebugger", "set_depth", 1286410249L), hostObject.objectPtr, depth)

  /** EngineDebugger.get_depth */
  final def getDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("EngineDebugger", "get_depth", 3905245786L), hostObject.objectPtr)

  /** EngineDebugger.is_breakpoint */
  final def isBreakpoint(line: Long, source: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call2[Long, io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("EngineDebugger", "is_breakpoint", 921227809L), hostObject.objectPtr, line, source)

  /** EngineDebugger.is_skipping_breakpoints */
  final def isSkippingBreakpoints(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("EngineDebugger", "is_skipping_breakpoints", 36873697L), hostObject.objectPtr)

  /** EngineDebugger.insert_breakpoint */
  final def insertBreakpoint(line: Long, source: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("EngineDebugger", "insert_breakpoint", 3780747571L), hostObject.objectPtr, line, source)

  /** EngineDebugger.remove_breakpoint */
  final def removeBreakpoint(line: Long, source: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("EngineDebugger", "remove_breakpoint", 3780747571L), hostObject.objectPtr, line, source)

  /** EngineDebugger.clear_breakpoints */
  final def clearBreakpoints(): Unit =
    Ptrcall.callVoid0(MethodBind.get("EngineDebugger", "clear_breakpoints", 3218959716L), hostObject.objectPtr)

}

object EngineDebugger {
  /** Class metadata for Gd[EngineDebugger] lifetime management and casting. */
  given GodotClass[EngineDebugger] with {
    def className = "EngineDebugger"
    def isRefCounted = false
    def wrap(o: GodotObject): EngineDebugger = new EngineDebugger {}.withHost(o.objectPtr)
    def unwrap(t: EngineDebugger): GodotObject = t.hostObject
  }

  /** The process-global EngineDebugger singleton instance. */
  def singleton: EngineDebugger = new EngineDebugger {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("EngineDebugger").ptr))
}
