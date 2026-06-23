package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeTexture`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTexture extends VisualShaderNode {

  /** VisualShaderNodeTexture.set_source */
  final def setSource(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture", "set_source", 905262939L), hostObject.objectPtr, value)

  /** VisualShaderNodeTexture.get_source */
  final def getSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTexture", "get_source", 2896297444L), hostObject.objectPtr)

  /** VisualShaderNodeTexture.set_texture */
  final def setTexture(value: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture", "set_texture", 4051416890L), hostObject.objectPtr, value.hostObject)

  /** VisualShaderNodeTexture.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeTexture", "get_texture", 3635182373L), hostObject.objectPtr)

  /** VisualShaderNodeTexture.set_texture_type */
  final def setTextureType(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeTexture", "set_texture_type", 986314081L), hostObject.objectPtr, value)

  /** VisualShaderNodeTexture.get_texture_type */
  final def getTextureType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeTexture", "get_texture_type", 3290430153L), hostObject.objectPtr)

}

object VisualShaderNodeTexture {
  /** Class metadata for Gd[VisualShaderNodeTexture] lifetime management and casting. */
  given GodotClass[VisualShaderNodeTexture] with {
    def className = "VisualShaderNodeTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeTexture = new VisualShaderNodeTexture {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeTexture): GodotObject = t.hostObject
  }
}
