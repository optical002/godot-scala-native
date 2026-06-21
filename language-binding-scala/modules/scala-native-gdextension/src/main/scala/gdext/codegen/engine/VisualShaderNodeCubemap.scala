package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `VisualShaderNodeCubemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCubemap extends VisualShaderNode {

  /** VisualShaderNodeCubemap.set_source */
  final def setSource(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCubemap", "set_source", 1625400621L), hostObject.objectPtr, value)

  /** VisualShaderNodeCubemap.get_source */
  final def getSource(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeCubemap", "get_source", 2222048781L), hostObject.objectPtr)

  /** VisualShaderNodeCubemap.set_cube_map */
  final def setCubeMap(value: TextureLayered): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCubemap", "set_cube_map", 1278366092L), hostObject.objectPtr, value.hostObject)

  /** VisualShaderNodeCubemap.get_cube_map */
  final def getCubeMap(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VisualShaderNodeCubemap", "get_cube_map", 3984243839L), hostObject.objectPtr)

  /** VisualShaderNodeCubemap.set_texture_type */
  final def setTextureType(value: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VisualShaderNodeCubemap", "set_texture_type", 1899718876L), hostObject.objectPtr, value)

  /** VisualShaderNodeCubemap.get_texture_type */
  final def getTextureType(): Long =
    Ptrcall.call0[Long](MethodBind.get("VisualShaderNodeCubemap", "get_texture_type", 3356498888L), hostObject.objectPtr)

}

object VisualShaderNodeCubemap {
  /** Class metadata for Gd[VisualShaderNodeCubemap] lifetime management and casting. */
  given GodotClass[VisualShaderNodeCubemap] with {
    def className = "VisualShaderNodeCubemap"
    def isRefCounted = true
    def wrap(o: GodotObject): VisualShaderNodeCubemap = new VisualShaderNodeCubemap {}.withHost(o.objectPtr)
    def unwrap(t: VisualShaderNodeCubemap): GodotObject = t.hostObject
  }
}
