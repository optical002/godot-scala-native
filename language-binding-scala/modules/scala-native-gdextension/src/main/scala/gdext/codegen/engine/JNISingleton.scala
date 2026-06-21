package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `JNISingleton`, extends `Object`. */
abstract class JNISingleton extends Object {

  /** JNISingleton.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("JNISingleton", "has_java_method", 2619796661L), hostObject.objectPtr, method)

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
