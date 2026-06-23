package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptExtension`, extends `Script`. */
abstract class ScriptExtension extends Script {

}

object ScriptExtension {
  /** Class metadata for Gd[ScriptExtension] lifetime management and casting. */
  given GodotClass[ScriptExtension] with {
    def className = "ScriptExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): ScriptExtension = new ScriptExtension {}.withHost(o.objectPtr)
    def unwrap(t: ScriptExtension): GodotObject = t.hostObject
  }
}
