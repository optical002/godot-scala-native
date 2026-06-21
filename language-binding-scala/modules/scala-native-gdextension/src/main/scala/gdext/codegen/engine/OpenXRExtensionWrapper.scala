package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRExtensionWrapper`, extends `Object`. */
abstract class OpenXRExtensionWrapper extends Object {

  /** OpenXRExtensionWrapper.get_openxr_api */
  final def getOpenxrApi(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRExtensionWrapper", "get_openxr_api", 1637791613L), hostObject.objectPtr)

  /** OpenXRExtensionWrapper.register_extension_wrapper */
  final def registerExtensionWrapper(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRExtensionWrapper", "register_extension_wrapper", 3218959716L), hostObject.objectPtr)

}

object OpenXRExtensionWrapper {
  /** Class metadata for Gd[OpenXRExtensionWrapper] lifetime management and casting. */
  given GodotClass[OpenXRExtensionWrapper] with {
    def className = "OpenXRExtensionWrapper"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRExtensionWrapper = new OpenXRExtensionWrapper {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRExtensionWrapper): GodotObject = t.hostObject
  }
}
