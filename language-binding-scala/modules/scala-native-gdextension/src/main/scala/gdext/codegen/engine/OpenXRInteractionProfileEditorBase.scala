package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInteractionProfileEditorBase`, extends `HBoxContainer`. */
abstract class OpenXRInteractionProfileEditorBase extends HBoxContainer {

  /** OpenXRInteractionProfileEditorBase.setup */
  final def setup(action_map: OpenXRActionMap, interaction_profile: OpenXRInteractionProfile): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInteractionProfileEditorBase", "setup", 421962938L), hostObject.objectPtr, action_map.hostObject, interaction_profile.hostObject)

}

object OpenXRInteractionProfileEditorBase {
  /** Class metadata for Gd[OpenXRInteractionProfileEditorBase] lifetime management and casting. */
  given GodotClass[OpenXRInteractionProfileEditorBase] with {
    def className = "OpenXRInteractionProfileEditorBase"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRInteractionProfileEditorBase = new OpenXRInteractionProfileEditorBase {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRInteractionProfileEditorBase): GodotObject = t.hostObject
  }
}
