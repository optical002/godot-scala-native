package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFAnimation`, extends `Resource`. */
abstract class GLTFAnimation extends Resource {
  override def godotClassName: String = "GLTFAnimation"

  /** GLTFAnimation.get_original_name */
  final def getOriginalName(): String = {
    if (gdext.classes.GLTFAnimation.mb_get_original_name == null) gdext.classes.GLTFAnimation.mb_get_original_name = MethodBind.get("GLTFAnimation", "get_original_name", 2841200299L)
    Ptrcall.call0[String](gdext.classes.GLTFAnimation.mb_get_original_name, livePtr)
  }

  /** GLTFAnimation.set_original_name */
  final def setOriginalName(originalName: String): Unit = {
    if (gdext.classes.GLTFAnimation.mb_set_original_name == null) gdext.classes.GLTFAnimation.mb_set_original_name = MethodBind.get("GLTFAnimation", "set_original_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFAnimation.mb_set_original_name, livePtr, originalName)
  }

  /** GLTFAnimation.get_loop */
  final def getLoop(): Boolean = {
    if (gdext.classes.GLTFAnimation.mb_get_loop == null) gdext.classes.GLTFAnimation.mb_get_loop = MethodBind.get("GLTFAnimation", "get_loop", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFAnimation.mb_get_loop, livePtr)
  }

  /** GLTFAnimation.set_loop */
  final def setLoop(loop: Boolean): Unit = {
    if (gdext.classes.GLTFAnimation.mb_set_loop == null) gdext.classes.GLTFAnimation.mb_set_loop = MethodBind.get("GLTFAnimation", "set_loop", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GLTFAnimation.mb_set_loop, livePtr, loop)
  }

}

object GLTFAnimation {
  private[classes] var mb_get_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_original_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_loop: GDExtensionMethodBindPtr = null
}
