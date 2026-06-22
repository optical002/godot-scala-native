package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasGroup`, extends `Node2D`. */
abstract class CanvasGroup extends Node2D {

  /** CanvasGroup.set_fit_margin */
  final def setFitMargin(fit_margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasGroup", "set_fit_margin", 373806689L), hostObject.objectPtr, fit_margin)

  /** CanvasGroup.get_fit_margin */
  final def getFitMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CanvasGroup", "get_fit_margin", 1740695150L), hostObject.objectPtr)

  /** CanvasGroup.set_clear_margin */
  final def setClearMargin(clear_margin: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasGroup", "set_clear_margin", 373806689L), hostObject.objectPtr, clear_margin)

  /** CanvasGroup.get_clear_margin */
  final def getClearMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("CanvasGroup", "get_clear_margin", 1740695150L), hostObject.objectPtr)

  /** CanvasGroup.set_use_mipmaps */
  final def setUseMipmaps(use_mipmaps: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasGroup", "set_use_mipmaps", 2586408642L), hostObject.objectPtr, use_mipmaps)

  /** CanvasGroup.is_using_mipmaps */
  final def isUsingMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CanvasGroup", "is_using_mipmaps", 36873697L), hostObject.objectPtr)

}

object CanvasGroup {
  /** Class metadata for Gd[CanvasGroup] lifetime management and casting. */
  given GodotClass[CanvasGroup] with {
    def className = "CanvasGroup"
    def isRefCounted = false
    def wrap(o: GodotObject): CanvasGroup = new CanvasGroup {}.withHost(o.objectPtr)
    def unwrap(t: CanvasGroup): GodotObject = t.hostObject
  }
}
