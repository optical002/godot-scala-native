package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRBindingModifierEditor`, extends `PanelContainer`. */
abstract class OpenXRBindingModifierEditor extends PanelContainer {

  /** OpenXRBindingModifierEditor.get_binding_modifier */
  final def getBindingModifier(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRBindingModifierEditor", "get_binding_modifier", 2930765082L), hostObject.objectPtr)

  /** OpenXRBindingModifierEditor.setup */
  final def setup(action_map: OpenXRActionMap, binding_modifier: OpenXRBindingModifier): Unit =
    Ptrcall.callVoid2(MethodBind.get("OpenXRBindingModifierEditor", "setup", 1284787389L), hostObject.objectPtr, action_map.hostObject, binding_modifier.hostObject)

}

object OpenXRBindingModifierEditor {
  /** Class metadata for Gd[OpenXRBindingModifierEditor] lifetime management and casting. */
  given GodotClass[OpenXRBindingModifierEditor] with {
    def className = "OpenXRBindingModifierEditor"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRBindingModifierEditor = new OpenXRBindingModifierEditor {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRBindingModifierEditor): GodotObject = t.hostObject
  }
}
