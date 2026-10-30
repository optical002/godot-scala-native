package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CenterContainer`, extends `Container`. */
abstract class CenterContainer extends Container {
  override def godotClassName: String = "CenterContainer"

  /** CenterContainer.set_use_top_left */
  final def setUseTopLeft(enable: Boolean): Unit = {
    if (gdext.classes.CenterContainer.mb_set_use_top_left == null) gdext.classes.CenterContainer.mb_set_use_top_left = MethodBind.get("CenterContainer", "set_use_top_left", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CenterContainer.mb_set_use_top_left, livePtr, enable)
  }

  /** CenterContainer.is_using_top_left */
  final def isUsingTopLeft(): Boolean = {
    if (gdext.classes.CenterContainer.mb_is_using_top_left == null) gdext.classes.CenterContainer.mb_is_using_top_left = MethodBind.get("CenterContainer", "is_using_top_left", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CenterContainer.mb_is_using_top_left, livePtr)
  }

}

object CenterContainer {
  private[classes] var mb_set_use_top_left: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_top_left: GDExtensionMethodBindPtr = null
}
