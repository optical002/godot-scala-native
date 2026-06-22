package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GDScript`, extends `Script`. */
abstract class GDScript extends Script {

}

object GDScript {
  /** Class metadata for Gd[GDScript] lifetime management and casting. */
  given GodotClass[GDScript] with {
    def className = "GDScript"
    def isRefCounted = true
    def wrap(o: GodotObject): GDScript = new GDScript {}.withHost(o.objectPtr)
    def unwrap(t: GDScript): GodotObject = t.hostObject
  }
}
