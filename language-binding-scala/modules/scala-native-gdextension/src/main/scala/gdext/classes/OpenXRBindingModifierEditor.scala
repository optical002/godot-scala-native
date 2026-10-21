package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRBindingModifierEditor`, extends `PanelContainer`. */
abstract class OpenXRBindingModifierEditor extends PanelContainer {
  override def godotClassName: String = "OpenXRBindingModifierEditor"

  /** OpenXRBindingModifierEditor.get_binding_modifier. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBindingModifier(): OpenXRBindingModifier = {
    if (gdext.classes.OpenXRBindingModifierEditor.mb_get_binding_modifier == null) gdext.classes.OpenXRBindingModifierEditor.mb_get_binding_modifier = MethodBind.get("OpenXRBindingModifierEditor", "get_binding_modifier", 2930765082L)
    Wrappers.owned[OpenXRBindingModifier](Ptrcall.call0[Long](gdext.classes.OpenXRBindingModifierEditor.mb_get_binding_modifier, livePtr))
  }

  /** OpenXRBindingModifierEditor.setup */
  final def setup(action_map: OpenXRActionMap, binding_modifier: OpenXRBindingModifier): Unit = {
    if (gdext.classes.OpenXRBindingModifierEditor.mb_setup == null) gdext.classes.OpenXRBindingModifierEditor.mb_setup = MethodBind.get("OpenXRBindingModifierEditor", "setup", 1284787389L)
    Ptrcall.callVoid2(gdext.classes.OpenXRBindingModifierEditor.mb_setup, livePtr, Wrappers.handle(action_map), Wrappers.handle(binding_modifier))
  }

}

object OpenXRBindingModifierEditor {
  private[classes] var mb_get_binding_modifier: GDExtensionMethodBindPtr = null
  private[classes] var mb_setup: GDExtensionMethodBindPtr = null
}
