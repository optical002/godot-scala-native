package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Compositor`, extends `Resource`. */
abstract class Compositor extends Resource {

}

object Compositor {
  /** Class metadata for Gd[Compositor] lifetime management and casting. */
  given GodotClass[Compositor] with {
    def className = "Compositor"
    def isRefCounted = true
    def wrap(o: GodotObject): Compositor = new Compositor {}.withHost(o.objectPtr)
    def unwrap(t: Compositor): GodotObject = t.hostObject
  }
}
