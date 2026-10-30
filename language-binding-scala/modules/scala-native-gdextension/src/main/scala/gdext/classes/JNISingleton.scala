package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JNISingleton`, extends `Object`. */
abstract class JNISingleton extends Object {
  override def godotClassName: String = "JNISingleton"

  /** JNISingleton.has_java_method */
  final def hasJavaMethod(method: String): Boolean = {
    if (gdext.classes.JNISingleton.mb_has_java_method == null) gdext.classes.JNISingleton.mb_has_java_method = MethodBind.get("JNISingleton", "has_java_method", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.JNISingleton.mb_has_java_method, livePtr, SnArg(method))
  }

}

object JNISingleton {
  private[classes] var mb_has_java_method: GDExtensionMethodBindPtr = null
}
