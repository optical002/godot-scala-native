package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTexture2D`, extends `Texture2D`. */
abstract class PlaceholderTexture2D extends Texture2D {

  /** PlaceholderTexture2D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTexture2D", "set_size", 743155724L), hostObject.objectPtr, size)

}

object PlaceholderTexture2D {
  /** Class metadata for Gd[PlaceholderTexture2D] lifetime management and casting. */
  given GodotClass[PlaceholderTexture2D] with {
    def className = "PlaceholderTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderTexture2D = new PlaceholderTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderTexture2D): GodotObject = t.hostObject
  }
}
