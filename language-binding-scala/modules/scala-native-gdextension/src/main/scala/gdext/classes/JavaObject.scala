package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaObject`, extends `RefCounted`. */
abstract class JavaObject extends RefCounted {
  override def godotClassName: String = "JavaObject"

  /** JavaObject.get_java_class */
  final def getJavaClass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaObject", "get_java_class", 541536347L), hostObject.objectPtr)

  /** JavaObject.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("JavaObject", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}
