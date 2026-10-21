package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CanvasGroup`, extends `Node2D`. */
abstract class CanvasGroup extends Node2D {
  override def godotClassName: String = "CanvasGroup"

  /** CanvasGroup.set_fit_margin */
  final def setFitMargin(fit_margin: Double): Unit = {
    if (gdext.classes.CanvasGroup.mb_set_fit_margin == null) gdext.classes.CanvasGroup.mb_set_fit_margin = MethodBind.get("CanvasGroup", "set_fit_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CanvasGroup.mb_set_fit_margin, livePtr, fit_margin)
  }

  /** CanvasGroup.get_fit_margin */
  final def getFitMargin(): Double = {
    if (gdext.classes.CanvasGroup.mb_get_fit_margin == null) gdext.classes.CanvasGroup.mb_get_fit_margin = MethodBind.get("CanvasGroup", "get_fit_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CanvasGroup.mb_get_fit_margin, livePtr)
  }

  /** CanvasGroup.set_clear_margin */
  final def setClearMargin(clear_margin: Double): Unit = {
    if (gdext.classes.CanvasGroup.mb_set_clear_margin == null) gdext.classes.CanvasGroup.mb_set_clear_margin = MethodBind.get("CanvasGroup", "set_clear_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CanvasGroup.mb_set_clear_margin, livePtr, clear_margin)
  }

  /** CanvasGroup.get_clear_margin */
  final def getClearMargin(): Double = {
    if (gdext.classes.CanvasGroup.mb_get_clear_margin == null) gdext.classes.CanvasGroup.mb_get_clear_margin = MethodBind.get("CanvasGroup", "get_clear_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CanvasGroup.mb_get_clear_margin, livePtr)
  }

  /** CanvasGroup.set_use_mipmaps */
  final def setUseMipmaps(use_mipmaps: Boolean): Unit = {
    if (gdext.classes.CanvasGroup.mb_set_use_mipmaps == null) gdext.classes.CanvasGroup.mb_set_use_mipmaps = MethodBind.get("CanvasGroup", "set_use_mipmaps", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CanvasGroup.mb_set_use_mipmaps, livePtr, use_mipmaps)
  }

  /** CanvasGroup.is_using_mipmaps */
  final def isUsingMipmaps(): Boolean = {
    if (gdext.classes.CanvasGroup.mb_is_using_mipmaps == null) gdext.classes.CanvasGroup.mb_is_using_mipmaps = MethodBind.get("CanvasGroup", "is_using_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CanvasGroup.mb_is_using_mipmaps, livePtr)
  }

}

object CanvasGroup {
  private[classes] var mb_set_fit_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fit_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clear_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clear_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_mipmaps: GDExtensionMethodBindPtr = null
}
