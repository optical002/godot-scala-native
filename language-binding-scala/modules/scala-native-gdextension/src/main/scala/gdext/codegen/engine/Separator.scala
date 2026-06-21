package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Separator`, extends `Control`. */
abstract class Separator extends Control {

}

object Separator {
  /** Class metadata for Gd[Separator] lifetime management and casting. */
  given GodotClass[Separator] with {
    def className = "Separator"
    def isRefCounted = false
    def wrap(o: GodotObject): Separator = new Separator {}.withHost(o.objectPtr)
    def unwrap(t: Separator): GodotObject = t.hostObject
  }
}
