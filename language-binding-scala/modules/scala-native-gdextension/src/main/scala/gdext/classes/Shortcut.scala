package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Shortcut`, extends `Resource`. */
abstract class Shortcut extends Resource {
  override def godotClassName: String = "Shortcut"

  /** Shortcut.has_valid_event */
  final def hasValidEvent(): Boolean = {
    if (gdext.classes.Shortcut.mb_has_valid_event == null) gdext.classes.Shortcut.mb_has_valid_event = MethodBind.get("Shortcut", "has_valid_event", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Shortcut.mb_has_valid_event, livePtr)
  }

  /** Shortcut.matches_event */
  final def matchesEvent(event: InputEvent): Boolean = {
    if (gdext.classes.Shortcut.mb_matches_event == null) gdext.classes.Shortcut.mb_matches_event = MethodBind.get("Shortcut", "matches_event", 3738334489L)
    Ptrcall.call1[GodotObject, Boolean](gdext.classes.Shortcut.mb_matches_event, livePtr, Wrappers.handle(event))
  }

  /** Shortcut.get_as_text */
  final def getAsText(): String = {
    if (gdext.classes.Shortcut.mb_get_as_text == null) gdext.classes.Shortcut.mb_get_as_text = MethodBind.get("Shortcut", "get_as_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Shortcut.mb_get_as_text, livePtr)
  }

}

object Shortcut {
  private[classes] var mb_has_valid_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_matches_event: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_as_text: GDExtensionMethodBindPtr = null
}
