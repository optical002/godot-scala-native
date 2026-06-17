package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaObject`, extends `RefCounted`. */
abstract class JavaObject extends RefCounted {

  /** JavaObject.get_java_class */
  final def getJavaClass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaObject", "get_java_class", 541536347L), hostObject.objectPtr)

  /** JavaObject.has_java_method */
  final def hasJavaMethod(method: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("JavaObject", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}

object JavaObject {
  /** Class metadata for Gd[JavaObject] lifetime management and casting. */
  given GodotClass[JavaObject] with {
    def className = "JavaObject"
    def isRefCounted = true
    def wrap(o: GodotObject): JavaObject = new JavaObject {}.withHost(o.objectPtr)
    def unwrap(t: JavaObject): GodotObject = t.hostObject
  }
}
