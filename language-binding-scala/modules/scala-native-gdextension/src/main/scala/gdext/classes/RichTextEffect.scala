package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RichTextEffect`, extends `Resource`. */
abstract class RichTextEffect extends Resource {

}

object RichTextEffect {
  /** Class metadata for Gd[RichTextEffect] lifetime management and casting. */
  given GodotClass[RichTextEffect] with {
    def className = "RichTextEffect"
    def isRefCounted = true
    def wrap(o: GodotObject): RichTextEffect = new RichTextEffect {}.withHost(o.objectPtr)
    def unwrap(t: RichTextEffect): GodotObject = t.hostObject
  }
}
