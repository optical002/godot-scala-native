package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AESContext`, extends `RefCounted`. */
abstract class AESContext extends RefCounted {
  override def godotClassName: String = "AESContext"

  /** AESContext.finish */
  final def finish(): Unit = {
    if (gdext.classes.AESContext.mb_finish == null) gdext.classes.AESContext.mb_finish = MethodBind.get("AESContext", "finish", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AESContext.mb_finish, livePtr)
  }

}

object AESContext {
  private[classes] var mb_finish: GDExtensionMethodBindPtr = null
}
