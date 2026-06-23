package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaScriptObject`, extends `RefCounted`. */
abstract class JavaScriptObject extends RefCounted {

}

object JavaScriptObject {
  /** Class metadata for Gd[JavaScriptObject] lifetime management and casting. */
  given GodotClass[JavaScriptObject] with {
    def className = "JavaScriptObject"
    def isRefCounted = true
    def wrap(o: GodotObject): JavaScriptObject = new JavaScriptObject {}.withHost(o.objectPtr)
    def unwrap(t: JavaScriptObject): GodotObject = t.hostObject
  }
}
