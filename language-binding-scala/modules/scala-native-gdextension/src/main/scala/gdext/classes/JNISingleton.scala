package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `JNISingleton`, extends `Object`. */
abstract class JNISingleton extends Object {
  override def godotClassName: String = "JNISingleton"

  /** JNISingleton.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("JNISingleton", "has_java_method", 2619796661L), hostObject.objectPtr, method)

}
