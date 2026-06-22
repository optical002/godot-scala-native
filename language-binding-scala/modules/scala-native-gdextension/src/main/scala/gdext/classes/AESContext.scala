package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `AESContext`, extends `RefCounted`. */
abstract class AESContext extends RefCounted {

  /** AESContext.finish */
  final def finish(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AESContext", "finish", 3218959716L), hostObject.objectPtr)

}

object AESContext {
  /** Class metadata for Gd[AESContext] lifetime management and casting. */
  given GodotClass[AESContext] with {
    def className = "AESContext"
    def isRefCounted = true
    def wrap(o: GodotObject): AESContext = new AESContext {}.withHost(o.objectPtr)
    def unwrap(t: AESContext): GodotObject = t.hostObject
  }
}
