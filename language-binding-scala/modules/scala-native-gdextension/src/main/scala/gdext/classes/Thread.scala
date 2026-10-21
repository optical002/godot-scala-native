package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Thread`, extends `RefCounted`. */
abstract class Thread extends RefCounted {
  override def godotClassName: String = "Thread"

  /** Thread.get_id */
  final def getId(): String = {
    if (gdext.classes.Thread.mb_get_id == null) gdext.classes.Thread.mb_get_id = MethodBind.get("Thread", "get_id", 201670096L)
    Ptrcall.call0[String](gdext.classes.Thread.mb_get_id, livePtr)
  }

  /** Thread.is_started */
  final def isStarted(): Boolean = {
    if (gdext.classes.Thread.mb_is_started == null) gdext.classes.Thread.mb_is_started = MethodBind.get("Thread", "is_started", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Thread.mb_is_started, livePtr)
  }

  /** Thread.is_alive */
  final def isAlive(): Boolean = {
    if (gdext.classes.Thread.mb_is_alive == null) gdext.classes.Thread.mb_is_alive = MethodBind.get("Thread", "is_alive", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Thread.mb_is_alive, livePtr)
  }

}

object Thread {
  private[classes] var mb_get_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_started: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_alive: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_thread_safety_checks_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_main_thread: GDExtensionMethodBindPtr = null

  /** Thread.set_thread_safety_checks_enabled */
  final def setThreadSafetyChecksEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.Thread.mb_set_thread_safety_checks_enabled == null) gdext.classes.Thread.mb_set_thread_safety_checks_enabled = MethodBind.get("Thread", "set_thread_safety_checks_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Thread.mb_set_thread_safety_checks_enabled, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], enabled)
  }

  /** Thread.is_main_thread */
  final def isMainThread(): Boolean = {
    if (gdext.classes.Thread.mb_is_main_thread == null) gdext.classes.Thread.mb_is_main_thread = MethodBind.get("Thread", "is_main_thread", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.Thread.mb_is_main_thread, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }
}
