package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaClass`, extends `RefCounted`. */
abstract class JavaClass extends RefCounted {

  /** JavaClass.get_java_class_name */
  final def getJavaClassName(): String =
    Ptrcall.call0[String](MethodBind.get("JavaClass", "get_java_class_name", 201670096L), hostObject.objectPtr)

  /** JavaClass.get_java_parent_class */
  final def getJavaParentClass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaClass", "get_java_parent_class", 541536347L), hostObject.objectPtr)

  /** JavaClass.has_java_method */
  final def hasJavaMethod(method: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("JavaClass", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}

object JavaClass {
  /** Class metadata for Gd[JavaClass] lifetime management and casting. */
  given GodotClass[JavaClass] with {
    def className = "JavaClass"
    def isRefCounted = true
    def wrap(o: GodotObject): JavaClass = new JavaClass {}.withHost(o.objectPtr)
    def unwrap(t: JavaClass): GodotObject = t.hostObject
  }
}
