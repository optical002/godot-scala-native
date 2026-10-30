package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `InputEventShortcut`, extends `InputEvent`. */
abstract class InputEventShortcut extends InputEvent {
  override def godotClassName: String = "InputEventShortcut"

  /** InputEventShortcut.set_shortcut */
  final def setShortcut(shortcut: Shortcut): Unit = {
    if (gdext.classes.InputEventShortcut.mb_set_shortcut == null) gdext.classes.InputEventShortcut.mb_set_shortcut = MethodBind.get("InputEventShortcut", "set_shortcut", 857163497L)
    Ptrcall.callVoid1(gdext.classes.InputEventShortcut.mb_set_shortcut, livePtr, Wrappers.handle(shortcut))
  }

  /** InputEventShortcut.get_shortcut. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getShortcut(): Shortcut = {
    if (gdext.classes.InputEventShortcut.mb_get_shortcut == null) gdext.classes.InputEventShortcut.mb_get_shortcut = MethodBind.get("InputEventShortcut", "get_shortcut", 3766804753L)
    Wrappers.owned[Shortcut](Ptrcall.call0[Long](gdext.classes.InputEventShortcut.mb_get_shortcut, livePtr))
  }

}

object InputEventShortcut {
  private[classes] var mb_set_shortcut: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shortcut: GDExtensionMethodBindPtr = null
}
