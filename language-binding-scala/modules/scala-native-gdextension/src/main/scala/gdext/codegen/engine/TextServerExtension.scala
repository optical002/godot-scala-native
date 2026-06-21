package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServerExtension`, extends `TextServer`. */
abstract class TextServerExtension extends TextServer {

}

object TextServerExtension {
  /** Class metadata for Gd[TextServerExtension] lifetime management and casting. */
  given GodotClass[TextServerExtension] with {
    def className = "TextServerExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): TextServerExtension = new TextServerExtension {}.withHost(o.objectPtr)
    def unwrap(t: TextServerExtension): GodotObject = t.hostObject
  }
}
