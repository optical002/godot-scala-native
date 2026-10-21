package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRExtensionWrapper`, extends `Object`. */
abstract class OpenXRExtensionWrapper extends Object {
  override def godotClassName: String = "OpenXRExtensionWrapper"

  /** OpenXRExtensionWrapper.get_openxr_api. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOpenxrApi(): OpenXRAPIExtension = {
    if (gdext.classes.OpenXRExtensionWrapper.mb_get_openxr_api == null) gdext.classes.OpenXRExtensionWrapper.mb_get_openxr_api = MethodBind.get("OpenXRExtensionWrapper", "get_openxr_api", 1637791613L)
    Wrappers.owned[OpenXRAPIExtension](Ptrcall.call0[Long](gdext.classes.OpenXRExtensionWrapper.mb_get_openxr_api, livePtr))
  }

  /** OpenXRExtensionWrapper.register_extension_wrapper */
  final def registerExtensionWrapper(): Unit = {
    if (gdext.classes.OpenXRExtensionWrapper.mb_register_extension_wrapper == null) gdext.classes.OpenXRExtensionWrapper.mb_register_extension_wrapper = MethodBind.get("OpenXRExtensionWrapper", "register_extension_wrapper", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRExtensionWrapper.mb_register_extension_wrapper, livePtr)
  }

}

object OpenXRExtensionWrapper {
  private[classes] var mb_get_openxr_api: GDExtensionMethodBindPtr = null
  private[classes] var mb_register_extension_wrapper: GDExtensionMethodBindPtr = null
}
