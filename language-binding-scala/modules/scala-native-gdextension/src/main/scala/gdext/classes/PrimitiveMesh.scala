package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PrimitiveMesh`, extends `Mesh`. */
abstract class PrimitiveMesh extends Mesh {
  override def godotClassName: String = "PrimitiveMesh"

  /** PrimitiveMesh.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrimitiveMesh", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** PrimitiveMesh.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PrimitiveMesh", "get_material", 5934680L), hostObject.objectPtr)

  /** PrimitiveMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrimitiveMesh", "set_custom_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** PrimitiveMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("PrimitiveMesh", "get_custom_aabb", 1068685055L), hostObject.objectPtr)

  /** PrimitiveMesh.set_flip_faces */
  final def setFlipFaces(flip_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrimitiveMesh", "set_flip_faces", 2586408642L), hostObject.objectPtr, flip_faces)

  /** PrimitiveMesh.get_flip_faces */
  final def getFlipFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PrimitiveMesh", "get_flip_faces", 36873697L), hostObject.objectPtr)

  /** PrimitiveMesh.set_add_uv2 */
  final def setAddUv2(add_uv2: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrimitiveMesh", "set_add_uv2", 2586408642L), hostObject.objectPtr, add_uv2)

  /** PrimitiveMesh.get_add_uv2 */
  final def getAddUv2(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PrimitiveMesh", "get_add_uv2", 36873697L), hostObject.objectPtr)

  /** PrimitiveMesh.set_uv2_padding */
  final def setUv2Padding(uv2_padding: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrimitiveMesh", "set_uv2_padding", 373806689L), hostObject.objectPtr, uv2_padding)

  /** PrimitiveMesh.get_uv2_padding */
  final def getUv2Padding(): Double =
    Ptrcall.call0[Double](MethodBind.get("PrimitiveMesh", "get_uv2_padding", 1740695150L), hostObject.objectPtr)

  /** PrimitiveMesh.request_update */
  final def requestUpdate(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PrimitiveMesh", "request_update", 3218959716L), hostObject.objectPtr)

}
