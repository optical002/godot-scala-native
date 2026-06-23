package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `HSeparator`, extends `Separator`. */
abstract class HSeparator extends Separator {

}

object HSeparator {
  /** Class metadata for Gd[HSeparator] lifetime management and casting. */
  given GodotClass[HSeparator] with {
    def className = "HSeparator"
    def isRefCounted = false
    def wrap(o: GodotObject): HSeparator = new HSeparator {}.withHost(o.objectPtr)
    def unwrap(t: HSeparator): GodotObject = t.hostObject
  }
}
