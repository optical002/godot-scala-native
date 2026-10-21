package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRInteractionProfileEditorBase`, extends `HBoxContainer`. */
abstract class OpenXRInteractionProfileEditorBase extends HBoxContainer {
  override def godotClassName: String = "OpenXRInteractionProfileEditorBase"

  /** OpenXRInteractionProfileEditorBase.setup */
  final def setup(action_map: OpenXRActionMap, interaction_profile: OpenXRInteractionProfile): Unit = {
    if (gdext.classes.OpenXRInteractionProfileEditorBase.mb_setup == null) gdext.classes.OpenXRInteractionProfileEditorBase.mb_setup = MethodBind.get("OpenXRInteractionProfileEditorBase", "setup", 421962938L)
    Ptrcall.callVoid2(gdext.classes.OpenXRInteractionProfileEditorBase.mb_setup, livePtr, Wrappers.handle(action_map), Wrappers.handle(interaction_profile))
  }

}

object OpenXRInteractionProfileEditorBase {
  private[classes] var mb_setup: GDExtensionMethodBindPtr = null
}
