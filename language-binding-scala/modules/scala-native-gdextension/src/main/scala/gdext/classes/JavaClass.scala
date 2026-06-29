package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaClass`, extends `RefCounted`. */
abstract class JavaClass extends RefCounted {
  override def godotClassName: String = "JavaClass"

  /** JavaClass.get_java_class_name */
  final def getJavaClassName(): String =
    Ptrcall.call0[String](MethodBind.get("JavaClass", "get_java_class_name", 201670096L), hostObject.objectPtr)

  /** JavaClass.get_java_parent_class */
  final def getJavaParentClass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaClass", "get_java_parent_class", 541536347L), hostObject.objectPtr)

  /** JavaClass.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("JavaClass", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}
