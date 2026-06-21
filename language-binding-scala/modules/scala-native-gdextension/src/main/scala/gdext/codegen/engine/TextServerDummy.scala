package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `TextServerDummy`, extends `TextServerExtension`. */
abstract class TextServerDummy extends TextServerExtension {

}

object TextServerDummy {
  /** Class metadata for Gd[TextServerDummy] lifetime management and casting. */
  given GodotClass[TextServerDummy] with {
    def className = "TextServerDummy"
    def isRefCounted = true
    def wrap(o: GodotObject): TextServerDummy = new TextServerDummy {}.withHost(o.objectPtr)
    def unwrap(t: TextServerDummy): GodotObject = t.hostObject
  }
}
