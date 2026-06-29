package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CurveTexture`, extends `Texture2D`. */
abstract class CurveTexture extends Texture2D {
  override def godotClassName: String = "CurveTexture"

  /** CurveTexture.set_width */
  final def setWidth(width: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveTexture", "set_width", 1286410249L), hostObject.objectPtr, width)

  /** CurveTexture.set_curve */
  final def setCurve(curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveTexture", "set_curve", 270443179L), hostObject.objectPtr, curve.hostObject)

  /** CurveTexture.get_curve */
  final def getCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CurveTexture", "get_curve", 2460114913L), hostObject.objectPtr)

  /** CurveTexture.set_texture_mode */
  final def setTextureMode(texture_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CurveTexture", "set_texture_mode", 1321955367L), hostObject.objectPtr, texture_mode)

  /** CurveTexture.get_texture_mode */
  final def getTextureMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("CurveTexture", "get_texture_mode", 715756376L), hostObject.objectPtr)

}
