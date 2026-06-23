package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `EditorResourceConversionPlugin`, extends `RefCounted`. */
abstract class EditorResourceConversionPlugin extends RefCounted {

}

object EditorResourceConversionPlugin {
  /** Class metadata for Gd[EditorResourceConversionPlugin] lifetime management and casting. */
  given GodotClass[EditorResourceConversionPlugin] with {
    def className = "EditorResourceConversionPlugin"
    def isRefCounted = true
    def wrap(o: GodotObject): EditorResourceConversionPlugin = new EditorResourceConversionPlugin {}.withHost(o.objectPtr)
    def unwrap(t: EditorResourceConversionPlugin): GodotObject = t.hostObject
  }
}
