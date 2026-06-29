package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFObjectModelProperty`, extends `RefCounted`. */
abstract class GLTFObjectModelProperty extends RefCounted {
  override def godotClassName: String = "GLTFObjectModelProperty"

  /** GLTFObjectModelProperty.get_accessor_type */
  final def getAccessorType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFObjectModelProperty", "get_accessor_type", 1998183368L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.get_gltf_to_godot_expression */
  final def getGltfToGodotExpression(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFObjectModelProperty", "get_gltf_to_godot_expression", 2240072449L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.set_gltf_to_godot_expression */
  final def setGltfToGodotExpression(gltf_to_godot_expr: Expression): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFObjectModelProperty", "set_gltf_to_godot_expression", 1815845073L), hostObject.objectPtr, gltf_to_godot_expr.hostObject)

  /** GLTFObjectModelProperty.get_godot_to_gltf_expression */
  final def getGodotToGltfExpression(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFObjectModelProperty", "get_godot_to_gltf_expression", 2240072449L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.set_godot_to_gltf_expression */
  final def setGodotToGltfExpression(godot_to_gltf_expr: Expression): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFObjectModelProperty", "set_godot_to_gltf_expression", 1815845073L), hostObject.objectPtr, godot_to_gltf_expr.hostObject)

  /** GLTFObjectModelProperty.has_node_paths */
  final def hasNodePaths(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFObjectModelProperty", "has_node_paths", 36873697L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.get_object_model_type */
  final def getObjectModelType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFObjectModelProperty", "get_object_model_type", 1094778507L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.set_object_model_type */
  final def setObjectModelType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFObjectModelProperty", "set_object_model_type", 4108684086L), hostObject.objectPtr, `type`)

  /** GLTFObjectModelProperty.has_json_pointers */
  final def hasJsonPointers(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GLTFObjectModelProperty", "has_json_pointers", 36873697L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.get_variant_type */
  final def getVariantType(): Long =
    Ptrcall.call0[Long](MethodBind.get("GLTFObjectModelProperty", "get_variant_type", 3416842102L), hostObject.objectPtr)

  /** GLTFObjectModelProperty.set_variant_type */
  final def setVariantType(variant_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFObjectModelProperty", "set_variant_type", 2887708385L), hostObject.objectPtr, variant_type)

  /** GLTFObjectModelProperty.set_types */
  final def setTypes(variant_type: Long, obj_model_type: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("GLTFObjectModelProperty", "set_types", 4150728237L), hostObject.objectPtr, variant_type, obj_model_type)

}
