package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EngineProfiler`, extends `RefCounted`. */
abstract class EngineProfiler extends RefCounted {

}

object EngineProfiler {
  /** Class metadata for Gd[EngineProfiler] lifetime management and casting. */
  given GodotClass[EngineProfiler] with {
    def className = "EngineProfiler"
    def isRefCounted = true
    def wrap(o: GodotObject): EngineProfiler = new EngineProfiler {}.withHost(o.objectPtr)
    def unwrap(t: EngineProfiler): GodotObject = t.hostObject
  }
}
