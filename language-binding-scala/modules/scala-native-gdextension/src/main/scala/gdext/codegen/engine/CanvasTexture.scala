package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CanvasTexture`, extends `Texture2D`. */
abstract class CanvasTexture extends Texture2D {

  /** CanvasTexture.set_diffuse_texture */
  final def setDiffuseTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_diffuse_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** CanvasTexture.get_diffuse_texture */
  final def getDiffuseTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasTexture", "get_diffuse_texture", 3635182373L), hostObject.objectPtr)

  /** CanvasTexture.set_normal_texture */
  final def setNormalTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_normal_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** CanvasTexture.get_normal_texture */
  final def getNormalTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasTexture", "get_normal_texture", 3635182373L), hostObject.objectPtr)

  /** CanvasTexture.set_specular_texture */
  final def setSpecularTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_specular_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** CanvasTexture.get_specular_texture */
  final def getSpecularTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CanvasTexture", "get_specular_texture", 3635182373L), hostObject.objectPtr)

  /** CanvasTexture.set_specular_color */
  final def setSpecularColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_specular_color", 2920490490L), hostObject.objectPtr, color)

  /** CanvasTexture.get_specular_color */
  final def getSpecularColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CanvasTexture", "get_specular_color", 3444240500L), hostObject.objectPtr)

  /** CanvasTexture.set_specular_shininess */
  final def setSpecularShininess(shininess: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_specular_shininess", 373806689L), hostObject.objectPtr, shininess)

  /** CanvasTexture.get_specular_shininess */
  final def getSpecularShininess(): Double =
    Ptrcall.call0[Double](MethodBind.get("CanvasTexture", "get_specular_shininess", 1740695150L), hostObject.objectPtr)

  /** CanvasTexture.set_texture_filter */
  final def setTextureFilter(filter: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_texture_filter", 1037999706L), hostObject.objectPtr, filter)

  /** CanvasTexture.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasTexture", "get_texture_filter", 121960042L), hostObject.objectPtr)

  /** CanvasTexture.set_texture_repeat */
  final def setTextureRepeat(repeat: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CanvasTexture", "set_texture_repeat", 1716472974L), hostObject.objectPtr, repeat)

  /** CanvasTexture.get_texture_repeat */
  final def getTextureRepeat(): Long =
    Ptrcall.call0[Long](MethodBind.get("CanvasTexture", "get_texture_repeat", 2667158319L), hostObject.objectPtr)

}

object CanvasTexture {
  /** Class metadata for Gd[CanvasTexture] lifetime management and casting. */
  given GodotClass[CanvasTexture] with {
    def className = "CanvasTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): CanvasTexture = new CanvasTexture {}.withHost(o.objectPtr)
    def unwrap(t: CanvasTexture): GodotObject = t.hostObject
  }
}
