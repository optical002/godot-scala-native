package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
