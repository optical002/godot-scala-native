package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `InputEventShortcut`, extends `InputEvent`. */
abstract class InputEventShortcut extends InputEvent {
  override def godotClassName: String = "InputEventShortcut"

  /** InputEventShortcut.set_shortcut */
  final def setShortcut(shortcut: Shortcut): Unit =
    Ptrcall.callVoid1(MethodBind.get("InputEventShortcut", "set_shortcut", 857163497L), hostObject.objectPtr, shortcut.hostObject)

  /** InputEventShortcut.get_shortcut */
  final def getShortcut(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("InputEventShortcut", "get_shortcut", 3766804753L), hostObject.objectPtr)

}
