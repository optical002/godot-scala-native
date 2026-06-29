package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRExtensionWrapper`, extends `Object`. */
abstract class OpenXRExtensionWrapper extends Object {
  override def godotClassName: String = "OpenXRExtensionWrapper"

  /** OpenXRExtensionWrapper.get_openxr_api */
  final def getOpenxrApi(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRExtensionWrapper", "get_openxr_api", 1637791613L), hostObject.objectPtr)

  /** OpenXRExtensionWrapper.register_extension_wrapper */
  final def registerExtensionWrapper(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRExtensionWrapper", "register_extension_wrapper", 3218959716L), hostObject.objectPtr)

}
