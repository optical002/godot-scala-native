package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PrimitiveMesh`, extends `Mesh`. */
abstract class PrimitiveMesh extends Mesh {
  override def godotClassName: String = "PrimitiveMesh"

  /** PrimitiveMesh.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_set_material == null) gdext.classes.PrimitiveMesh.mb_set_material = MethodBind.get("PrimitiveMesh", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.PrimitiveMesh.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** PrimitiveMesh.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.PrimitiveMesh.mb_get_material == null) gdext.classes.PrimitiveMesh.mb_get_material = MethodBind.get("PrimitiveMesh", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.PrimitiveMesh.mb_get_material, livePtr))
  }

  /** PrimitiveMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_set_custom_aabb == null) gdext.classes.PrimitiveMesh.mb_set_custom_aabb = MethodBind.get("PrimitiveMesh", "set_custom_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.PrimitiveMesh.mb_set_custom_aabb, livePtr, aabb)
  }

  /** PrimitiveMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB = {
    if (gdext.classes.PrimitiveMesh.mb_get_custom_aabb == null) gdext.classes.PrimitiveMesh.mb_get_custom_aabb = MethodBind.get("PrimitiveMesh", "get_custom_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.PrimitiveMesh.mb_get_custom_aabb, livePtr)
  }

  /** PrimitiveMesh.set_flip_faces */
  final def setFlipFaces(flipFaces: Boolean): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_set_flip_faces == null) gdext.classes.PrimitiveMesh.mb_set_flip_faces = MethodBind.get("PrimitiveMesh", "set_flip_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PrimitiveMesh.mb_set_flip_faces, livePtr, flipFaces)
  }

  /** PrimitiveMesh.get_flip_faces */
  final def getFlipFaces(): Boolean = {
    if (gdext.classes.PrimitiveMesh.mb_get_flip_faces == null) gdext.classes.PrimitiveMesh.mb_get_flip_faces = MethodBind.get("PrimitiveMesh", "get_flip_faces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PrimitiveMesh.mb_get_flip_faces, livePtr)
  }

  /** PrimitiveMesh.set_add_uv2 */
  final def setAddUv2(addUv2: Boolean): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_set_add_uv2 == null) gdext.classes.PrimitiveMesh.mb_set_add_uv2 = MethodBind.get("PrimitiveMesh", "set_add_uv2", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PrimitiveMesh.mb_set_add_uv2, livePtr, addUv2)
  }

  /** PrimitiveMesh.get_add_uv2 */
  final def getAddUv2(): Boolean = {
    if (gdext.classes.PrimitiveMesh.mb_get_add_uv2 == null) gdext.classes.PrimitiveMesh.mb_get_add_uv2 = MethodBind.get("PrimitiveMesh", "get_add_uv2", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PrimitiveMesh.mb_get_add_uv2, livePtr)
  }

  /** PrimitiveMesh.set_uv2_padding */
  final def setUv2Padding(uv2Padding: Double): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_set_uv2_padding == null) gdext.classes.PrimitiveMesh.mb_set_uv2_padding = MethodBind.get("PrimitiveMesh", "set_uv2_padding", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PrimitiveMesh.mb_set_uv2_padding, livePtr, uv2Padding)
  }

  /** PrimitiveMesh.get_uv2_padding */
  final def getUv2Padding(): Double = {
    if (gdext.classes.PrimitiveMesh.mb_get_uv2_padding == null) gdext.classes.PrimitiveMesh.mb_get_uv2_padding = MethodBind.get("PrimitiveMesh", "get_uv2_padding", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PrimitiveMesh.mb_get_uv2_padding, livePtr)
  }

  /** PrimitiveMesh.request_update */
  final def requestUpdate(): Unit = {
    if (gdext.classes.PrimitiveMesh.mb_request_update == null) gdext.classes.PrimitiveMesh.mb_request_update = MethodBind.get("PrimitiveMesh", "request_update", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PrimitiveMesh.mb_request_update, livePtr)
  }

}

object PrimitiveMesh {
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flip_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_add_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_add_uv2: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_uv2_padding: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_uv2_padding: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_update: GDExtensionMethodBindPtr = null
}
