package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
