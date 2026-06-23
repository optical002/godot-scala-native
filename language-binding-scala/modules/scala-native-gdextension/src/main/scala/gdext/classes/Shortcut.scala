package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Shortcut`, extends `Resource`. */
abstract class Shortcut extends Resource {

  /** Shortcut.has_valid_event */
  final def hasValidEvent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Shortcut", "has_valid_event", 36873697L), hostObject.objectPtr)

  /** Shortcut.matches_event */
  final def matchesEvent(event: InputEvent): Boolean =
    Ptrcall.call1[GodotObject, Boolean](MethodBind.get("Shortcut", "matches_event", 3738334489L), hostObject.objectPtr, event.hostObject)

  /** Shortcut.get_as_text */
  final def getAsText(): String =
    Ptrcall.call0[String](MethodBind.get("Shortcut", "get_as_text", 201670096L), hostObject.objectPtr)

}

object Shortcut {
  /** Class metadata for Gd[Shortcut] lifetime management and casting. */
  given GodotClass[Shortcut] with {
    def className = "Shortcut"
    def isRefCounted = true
    def wrap(o: GodotObject): Shortcut = new Shortcut {}.withHost(o.objectPtr)
    def unwrap(t: Shortcut): GodotObject = t.hostObject
  }
}
