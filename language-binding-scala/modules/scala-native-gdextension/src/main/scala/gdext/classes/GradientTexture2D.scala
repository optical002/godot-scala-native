package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GradientTexture2D`, extends `Texture2D`. */
abstract class GradientTexture2D extends Texture2D {

  /** GradientTexture2D.set_gradient */
  final def setGradient(gradient: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_gradient", 2756054477L), hostObject.objectPtr, gradient.hostObject)

  /** GradientTexture2D.get_gradient */
  final def getGradient(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GradientTexture2D", "get_gradient", 132272999L), hostObject.objectPtr)

  /** GradientTexture2D.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** GradientTexture2D.set_height */
  final def setHeight(height: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_height", 1286410249L), hostObject.objectPtr, height)

  /** GradientTexture2D.set_use_hdr */
  final def setUseHdr(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_use_hdr", 2586408642L), hostObject.objectPtr, enabled)

  /** GradientTexture2D.is_using_hdr */
  final def isUsingHdr(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GradientTexture2D", "is_using_hdr", 36873697L), hostObject.objectPtr)

  /** GradientTexture2D.set_fill */
  final def setFill(fill: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_fill", 3623927636L), hostObject.objectPtr, fill)

  /** GradientTexture2D.get_fill */
  final def getFill(): Long =
    Ptrcall.call0[Long](MethodBind.get("GradientTexture2D", "get_fill", 1876227217L), hostObject.objectPtr)

  /** GradientTexture2D.set_fill_from */
  final def setFillFrom(fill_from: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_fill_from", 743155724L), hostObject.objectPtr, fill_from)

  /** GradientTexture2D.get_fill_from */
  final def getFillFrom(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("GradientTexture2D", "get_fill_from", 3341600327L), hostObject.objectPtr)

  /** GradientTexture2D.set_fill_to */
  final def setFillTo(fill_to: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_fill_to", 743155724L), hostObject.objectPtr, fill_to)

  /** GradientTexture2D.get_fill_to */
  final def getFillTo(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("GradientTexture2D", "get_fill_to", 3341600327L), hostObject.objectPtr)

  /** GradientTexture2D.set_repeat */
  final def setRepeat(repeat: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GradientTexture2D", "set_repeat", 1357597002L), hostObject.objectPtr, repeat)

  /** GradientTexture2D.get_repeat */
  final def getRepeat(): Long =
    Ptrcall.call0[Long](MethodBind.get("GradientTexture2D", "get_repeat", 3351758665L), hostObject.objectPtr)

}

object GradientTexture2D {
  /** Class metadata for Gd[GradientTexture2D] lifetime management and casting. */
  given GodotClass[GradientTexture2D] with {
    def className = "GradientTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): GradientTexture2D = new GradientTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: GradientTexture2D): GodotObject = t.hostObject
  }
}
