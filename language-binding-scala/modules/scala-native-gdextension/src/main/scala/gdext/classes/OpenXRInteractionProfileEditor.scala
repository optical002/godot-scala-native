package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInteractionProfileEditor`, extends `OpenXRInteractionProfileEditorBase`. */
abstract class OpenXRInteractionProfileEditor extends OpenXRInteractionProfileEditorBase {

}

object OpenXRInteractionProfileEditor {
  /** Class metadata for Gd[OpenXRInteractionProfileEditor] lifetime management and casting. */
  given GodotClass[OpenXRInteractionProfileEditor] with {
    def className = "OpenXRInteractionProfileEditor"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRInteractionProfileEditor = new OpenXRInteractionProfileEditor {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRInteractionProfileEditor): GodotObject = t.hostObject
  }
}
