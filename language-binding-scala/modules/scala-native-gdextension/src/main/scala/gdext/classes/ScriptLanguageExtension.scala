package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ScriptLanguageExtension`, extends `ScriptLanguage`. */
abstract class ScriptLanguageExtension extends ScriptLanguage {

}

object ScriptLanguageExtension {
  /** Class metadata for Gd[ScriptLanguageExtension] lifetime management and casting. */
  given GodotClass[ScriptLanguageExtension] with {
    def className = "ScriptLanguageExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): ScriptLanguageExtension = new ScriptLanguageExtension {}.withHost(o.objectPtr)
    def unwrap(t: ScriptLanguageExtension): GodotObject = t.hostObject
  }
}
