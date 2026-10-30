package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GodotInstance`, extends `Object`. */
abstract class GodotInstance extends Object {
  override def godotClassName: String = "GodotInstance"

  /** GodotInstance.start */
  final def start(): Boolean = {
    if (gdext.classes.GodotInstance.mb_start == null) gdext.classes.GodotInstance.mb_start = MethodBind.get("GodotInstance", "start", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GodotInstance.mb_start, livePtr)
  }

  /** GodotInstance.is_started */
  final def isStarted(): Boolean = {
    if (gdext.classes.GodotInstance.mb_is_started == null) gdext.classes.GodotInstance.mb_is_started = MethodBind.get("GodotInstance", "is_started", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GodotInstance.mb_is_started, livePtr)
  }

  /** GodotInstance.iteration */
  final def iteration(): Boolean = {
    if (gdext.classes.GodotInstance.mb_iteration == null) gdext.classes.GodotInstance.mb_iteration = MethodBind.get("GodotInstance", "iteration", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.GodotInstance.mb_iteration, livePtr)
  }

  /** GodotInstance.focus_in */
  final def focusIn(): Unit = {
    if (gdext.classes.GodotInstance.mb_focus_in == null) gdext.classes.GodotInstance.mb_focus_in = MethodBind.get("GodotInstance", "focus_in", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GodotInstance.mb_focus_in, livePtr)
  }

  /** GodotInstance.focus_out */
  final def focusOut(): Unit = {
    if (gdext.classes.GodotInstance.mb_focus_out == null) gdext.classes.GodotInstance.mb_focus_out = MethodBind.get("GodotInstance", "focus_out", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GodotInstance.mb_focus_out, livePtr)
  }

  /** GodotInstance.pause */
  final def pause(): Unit = {
    if (gdext.classes.GodotInstance.mb_pause == null) gdext.classes.GodotInstance.mb_pause = MethodBind.get("GodotInstance", "pause", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GodotInstance.mb_pause, livePtr)
  }

  /** GodotInstance.resume */
  final def resume(): Unit = {
    if (gdext.classes.GodotInstance.mb_resume == null) gdext.classes.GodotInstance.mb_resume = MethodBind.get("GodotInstance", "resume", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GodotInstance.mb_resume, livePtr)
  }

}

object GodotInstance {
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_started: GDExtensionMethodBindPtr = null
  private[classes] var mb_iteration: GDExtensionMethodBindPtr = null
  private[classes] var mb_focus_in: GDExtensionMethodBindPtr = null
  private[classes] var mb_focus_out: GDExtensionMethodBindPtr = null
  private[classes] var mb_pause: GDExtensionMethodBindPtr = null
  private[classes] var mb_resume: GDExtensionMethodBindPtr = null
}
