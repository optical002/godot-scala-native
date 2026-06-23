package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VSeparator`, extends `Separator`. */
abstract class VSeparator extends Separator {

}

object VSeparator {
  /** Class metadata for Gd[VSeparator] lifetime management and casting. */
  given GodotClass[VSeparator] with {
    def className = "VSeparator"
    def isRefCounted = false
    def wrap(o: GodotObject): VSeparator = new VSeparator {}.withHost(o.objectPtr)
    def unwrap(t: VSeparator): GodotObject = t.hostObject
  }
}
