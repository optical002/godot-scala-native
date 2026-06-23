package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `StyleBoxEmpty`, extends `StyleBox`. */
abstract class StyleBoxEmpty extends StyleBox {

}

object StyleBoxEmpty {
  /** Class metadata for Gd[StyleBoxEmpty] lifetime management and casting. */
  given GodotClass[StyleBoxEmpty] with {
    def className = "StyleBoxEmpty"
    def isRefCounted = true
    def wrap(o: GodotObject): StyleBoxEmpty = new StyleBoxEmpty {}.withHost(o.objectPtr)
    def unwrap(t: StyleBoxEmpty): GodotObject = t.hostObject
  }
}
