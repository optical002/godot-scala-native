package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JavaObject`, extends `RefCounted`. */
abstract class JavaObject extends RefCounted {
  override def godotClassName: String = "JavaObject"

  /** JavaObject.get_java_class. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getJavaClass(): JavaClass = {
    if (gdext.classes.JavaObject.mb_get_java_class == null) gdext.classes.JavaObject.mb_get_java_class = MethodBind.get("JavaObject", "get_java_class", 541536347L)
    Wrappers.owned[JavaClass](Ptrcall.call0[Long](gdext.classes.JavaObject.mb_get_java_class, livePtr))
  }

  /** JavaObject.has_java_method */
  final def hasJavaMethod(method: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.JavaObject.mb_has_java_method == null) gdext.classes.JavaObject.mb_has_java_method = MethodBind.get("JavaObject", "has_java_method", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.JavaObject.mb_has_java_method, livePtr, method)
  }

}

object JavaObject {
  private[classes] var mb_get_java_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_java_method: GDExtensionMethodBindPtr = null
}
