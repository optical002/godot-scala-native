package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorTranslationParserPlugin`, extends `RefCounted`. */
abstract class EditorTranslationParserPlugin extends RefCounted {

}

object EditorTranslationParserPlugin {
  /** Class metadata for Gd[EditorTranslationParserPlugin] lifetime management and casting. */
  given GodotClass[EditorTranslationParserPlugin] with {
    def className = "EditorTranslationParserPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorTranslationParserPlugin = new EditorTranslationParserPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorTranslationParserPlugin): GodotObject = t.hostObject
  }
}
