package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRInteractionProfileEditorBase`, extends `HBoxContainer`. */
abstract class OpenXRInteractionProfileEditorBase extends HBoxContainer {
  override def godotClassName: String = "OpenXRInteractionProfileEditorBase"

  /** OpenXRInteractionProfileEditorBase.setup */
  final def setup(action_map: OpenXRActionMap, interaction_profile: OpenXRInteractionProfile): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRInteractionProfileEditorBase", "setup", 421962938L), hostObject.objectPtr, action_map.hostObject, interaction_profile.hostObject)

}
