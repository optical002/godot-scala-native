package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Logger`, extends `RefCounted`. */
abstract class Logger extends RefCounted {

}

object Logger {
  /** Class metadata for Gd[Logger] lifetime management and casting. */
  given GodotClass[Logger] with {
    def className = "Logger"
    def isRefCounted = true
    def wrap(o: GodotObject): Logger = new Logger {}.withHost(o.objectPtr)
    def unwrap(t: Logger): GodotObject = t.hostObject
  }
}
