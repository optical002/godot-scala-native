package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AESContext`, extends `RefCounted`. */
abstract class AESContext extends RefCounted {
  override def godotClassName: String = "AESContext"

  /** AESContext.finish */
  final def finish(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AESContext", "finish", 3218959716L), hostObject.objectPtr)

}
