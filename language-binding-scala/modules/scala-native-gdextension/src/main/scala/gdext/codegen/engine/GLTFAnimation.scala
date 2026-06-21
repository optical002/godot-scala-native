package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFAnimation`, extends `Resource`. */
abstract class GLTFAnimation extends Resource {

  /** GLTFAnimation.get_original_name */
  final def getOriginalName(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFAnimation", "get_original_name", 2841200299L), hostObject.objectPtr)

  /** GLTFAnimation.set_original_name */
  final def setOriginalName(original_name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAnimation", "set_original_name", 83702148L), hostObject.objectPtr, original_name)

  /** GLTFAnimation.get_loop */
  final def getLoop(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFAnimation", "get_loop", 36873697L), hostObject.objectPtr)

  /** GLTFAnimation.set_loop */
  final def setLoop(loop: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFAnimation", "set_loop", 2586408642L), hostObject.objectPtr, loop)

}

object GLTFAnimation {
  /** Class metadata for Gd[GLTFAnimation] lifetime management and casting. */
  given GodotClass[GLTFAnimation] with {
    def className = "GLTFAnimation"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFAnimation = new GLTFAnimation {}.withHost(o.objectPtr)
    def unwrap(t: GLTFAnimation): GodotObject = t.hostObject
  }
}
