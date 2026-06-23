package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MeshTexture`, extends `Texture2D`. */
abstract class MeshTexture extends Texture2D {

  /** MeshTexture.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshTexture", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** MeshTexture.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshTexture", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** MeshTexture.set_image_size */
  final def setImageSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshTexture", "set_image_size", 743155724L), hostObject.objectPtr, size)

  /** MeshTexture.get_image_size */
  final def getImageSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("MeshTexture", "get_image_size", 3341600327L), hostObject.objectPtr)

  /** MeshTexture.set_base_texture */
  final def setBaseTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("MeshTexture", "set_base_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** MeshTexture.get_base_texture */
  final def getBaseTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MeshTexture", "get_base_texture", 3635182373L), hostObject.objectPtr)

}

object MeshTexture {
  /** Class metadata for Gd[MeshTexture] lifetime management and casting. */
  given GodotClass[MeshTexture] with {
    def className = "MeshTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): MeshTexture = new MeshTexture {}.withHost(o.objectPtr)
    def unwrap(t: MeshTexture): GodotObject = t.hostObject
  }
}
