package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `JavaObject`, extends `RefCounted`. */
abstract class JavaObject extends RefCounted {

  /** JavaObject.get_java_class */
  final def getJavaClass(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("JavaObject", "get_java_class", 541536347L), hostObject.objectPtr)

  /** JavaObject.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("JavaObject", "has_java_method", 2619796661L), hostObject.objectPtr, method)

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
