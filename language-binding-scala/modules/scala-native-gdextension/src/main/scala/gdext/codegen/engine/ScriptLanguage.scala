package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptLanguage`, extends `Object`. */
abstract class ScriptLanguage extends Object {

}

object ScriptLanguage {
  /** Class metadata for Gd[ScriptLanguage] lifetime management and casting. */
  given GodotClass[ScriptLanguage] with {
    def className = "ScriptLanguage"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptLanguage = new ScriptLanguage {}.withHost(o.objectPtr)
    def unwrap(t: ScriptLanguage): GodotObject = t.hostObject
  }
}
