package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JNISingleton`, extends `Object`. */
abstract class JNISingleton extends Object {

  /** JNISingleton.has_java_method */
  final def hasJavaMethod(method: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("JNISingleton", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}

object JNISingleton {
  /** Class metadata for Gd[JNISingleton] lifetime management and casting. */
  given GodotClass[JNISingleton] with {
    def className = "JNISingleton"
    def isRefCounted = false
    def wrap(o: GodotObject): JNISingleton = new JNISingleton {}.withHost(o.objectPtr)
    def unwrap(t: JNISingleton): GodotObject = t.hostObject
  }
}
