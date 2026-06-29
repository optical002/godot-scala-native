package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PointLight2D`, extends `Light2D`. */
abstract class PointLight2D extends Light2D {
  override def godotClassName: String = "PointLight2D"

  /** PointLight2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("PointLight2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** PointLight2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PointLight2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** PointLight2D.set_texture_offset */
  final def setTextureOffset(texture_offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PointLight2D", "set_texture_offset", 743155724L), hostObject.objectPtr, texture_offset)

  /** PointLight2D.get_texture_offset */
  final def getTextureOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PointLight2D", "get_texture_offset", 3341600327L), hostObject.objectPtr)

  /** PointLight2D.set_texture_scale */
  final def setTextureScale(texture_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PointLight2D", "set_texture_scale", 373806689L), hostObject.objectPtr, texture_scale)

  /** PointLight2D.get_texture_scale */
  final def getTextureScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("PointLight2D", "get_texture_scale", 1740695150L), hostObject.objectPtr)

}
