package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SubViewportContainer`, extends `Container`. */
abstract class SubViewportContainer extends Container {
  override def godotClassName: String = "SubViewportContainer"

  /** SubViewportContainer.set_stretch */
  final def setStretch(enable: Boolean): Unit = {
    if (gdext.classes.SubViewportContainer.mb_set_stretch == null) gdext.classes.SubViewportContainer.mb_set_stretch = MethodBind.get("SubViewportContainer", "set_stretch", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SubViewportContainer.mb_set_stretch, livePtr, enable)
  }

  /** SubViewportContainer.is_stretch_enabled */
  final def isStretchEnabled(): Boolean = {
    if (gdext.classes.SubViewportContainer.mb_is_stretch_enabled == null) gdext.classes.SubViewportContainer.mb_is_stretch_enabled = MethodBind.get("SubViewportContainer", "is_stretch_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SubViewportContainer.mb_is_stretch_enabled, livePtr)
  }

  /** SubViewportContainer.set_stretch_shrink */
  final def setStretchShrink(amount: Long): Unit = {
    if (gdext.classes.SubViewportContainer.mb_set_stretch_shrink == null) gdext.classes.SubViewportContainer.mb_set_stretch_shrink = MethodBind.get("SubViewportContainer", "set_stretch_shrink", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SubViewportContainer.mb_set_stretch_shrink, livePtr, amount)
  }

  /** SubViewportContainer.get_stretch_shrink */
  final def getStretchShrink(): Long = {
    if (gdext.classes.SubViewportContainer.mb_get_stretch_shrink == null) gdext.classes.SubViewportContainer.mb_get_stretch_shrink = MethodBind.get("SubViewportContainer", "get_stretch_shrink", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SubViewportContainer.mb_get_stretch_shrink, livePtr)
  }

  /** SubViewportContainer.set_mouse_target */
  final def setMouseTarget(amount: Boolean): Unit = {
    if (gdext.classes.SubViewportContainer.mb_set_mouse_target == null) gdext.classes.SubViewportContainer.mb_set_mouse_target = MethodBind.get("SubViewportContainer", "set_mouse_target", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SubViewportContainer.mb_set_mouse_target, livePtr, amount)
  }

  /** SubViewportContainer.is_mouse_target_enabled */
  final def isMouseTargetEnabled(): Boolean = {
    if (gdext.classes.SubViewportContainer.mb_is_mouse_target_enabled == null) gdext.classes.SubViewportContainer.mb_is_mouse_target_enabled = MethodBind.get("SubViewportContainer", "is_mouse_target_enabled", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.SubViewportContainer.mb_is_mouse_target_enabled, livePtr)
  }

}

object SubViewportContainer {
  private[classes] var mb_set_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_stretch_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_shrink: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_shrink: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mouse_target: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_mouse_target_enabled: GDExtensionMethodBindPtr = null
}
