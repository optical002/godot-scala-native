package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JavaClass`, extends `RefCounted`. */
abstract class JavaClass extends RefCounted {
  override def godotClassName: String = "JavaClass"

  /** JavaClass.get_java_class_name */
  final def getJavaClassName(): String = {
    if (gdext.classes.JavaClass.mb_get_java_class_name == null) gdext.classes.JavaClass.mb_get_java_class_name = MethodBind.get("JavaClass", "get_java_class_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.JavaClass.mb_get_java_class_name, livePtr)
  }

  /** JavaClass.get_java_parent_class. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getJavaParentClass(): JavaClass = {
    if (gdext.classes.JavaClass.mb_get_java_parent_class == null) gdext.classes.JavaClass.mb_get_java_parent_class = MethodBind.get("JavaClass", "get_java_parent_class", 541536347L)
    Wrappers.owned[JavaClass](Ptrcall.call0[Long](gdext.classes.JavaClass.mb_get_java_parent_class, livePtr))
  }

  /** JavaClass.has_java_method */
  final def hasJavaMethod(method: String): Boolean = {
    if (gdext.classes.JavaClass.mb_has_java_method == null) gdext.classes.JavaClass.mb_has_java_method = MethodBind.get("JavaClass", "has_java_method", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.JavaClass.mb_has_java_method, livePtr, SnArg(method))
  }

}

object JavaClass {
  private[classes] var mb_get_java_class_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_java_parent_class: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_java_method: GDExtensionMethodBindPtr = null
}
