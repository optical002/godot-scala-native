package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MeshTexture`, extends `Texture2D`. */
abstract class MeshTexture extends Texture2D {
  override def godotClassName: String = "MeshTexture"

  /** MeshTexture.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.MeshTexture.mb_set_mesh == null) gdext.classes.MeshTexture.mb_set_mesh = MethodBind.get("MeshTexture", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.MeshTexture.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** MeshTexture.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.MeshTexture.mb_get_mesh == null) gdext.classes.MeshTexture.mb_get_mesh = MethodBind.get("MeshTexture", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.MeshTexture.mb_get_mesh, livePtr))
  }

  /** MeshTexture.set_image_size */
  final def setImageSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.MeshTexture.mb_set_image_size == null) gdext.classes.MeshTexture.mb_set_image_size = MethodBind.get("MeshTexture", "set_image_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.MeshTexture.mb_set_image_size, livePtr, size)
  }

  /** MeshTexture.get_image_size */
  final def getImageSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.MeshTexture.mb_get_image_size == null) gdext.classes.MeshTexture.mb_get_image_size = MethodBind.get("MeshTexture", "get_image_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.MeshTexture.mb_get_image_size, livePtr)
  }

  /** MeshTexture.set_base_texture */
  final def setBaseTexture(texture: Texture2D): Unit = {
    if (gdext.classes.MeshTexture.mb_set_base_texture == null) gdext.classes.MeshTexture.mb_set_base_texture = MethodBind.get("MeshTexture", "set_base_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.MeshTexture.mb_set_base_texture, livePtr, Wrappers.handle(texture))
  }

  /** MeshTexture.get_base_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBaseTexture(): Texture2D = {
    if (gdext.classes.MeshTexture.mb_get_base_texture == null) gdext.classes.MeshTexture.mb_get_base_texture = MethodBind.get("MeshTexture", "get_base_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.MeshTexture.mb_get_base_texture, livePtr))
  }

}

object MeshTexture {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_image_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_image_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_base_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_base_texture: GDExtensionMethodBindPtr = null
}
