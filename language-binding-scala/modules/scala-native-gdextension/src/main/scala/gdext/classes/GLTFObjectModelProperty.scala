package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFObjectModelProperty`, extends `RefCounted`. */
abstract class GLTFObjectModelProperty extends RefCounted {
  override def godotClassName: String = "GLTFObjectModelProperty"

  /** GLTFObjectModelProperty.get_accessor_type */
  final def getAccessorType(): Long = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type == null) gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type = MethodBind.get("GLTFObjectModelProperty", "get_accessor_type", 1998183368L)
    Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type, livePtr)
  }

  /** GLTFObjectModelProperty.get_gltf_to_godot_expression. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGltfToGodotExpression(): Expression = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression == null) gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression = MethodBind.get("GLTFObjectModelProperty", "get_gltf_to_godot_expression", 2240072449L)
    Wrappers.owned[Expression](Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression, livePtr))
  }

  /** GLTFObjectModelProperty.set_gltf_to_godot_expression */
  final def setGltfToGodotExpression(gltf_to_godot_expr: Expression): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression == null) gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression = MethodBind.get("GLTFObjectModelProperty", "set_gltf_to_godot_expression", 1815845073L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression, livePtr, Wrappers.handle(gltf_to_godot_expr))
  }

  /** GLTFObjectModelProperty.get_godot_to_gltf_expression. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGodotToGltfExpression(): Expression = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression == null) gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression = MethodBind.get("GLTFObjectModelProperty", "get_godot_to_gltf_expression", 2240072449L)
    Wrappers.owned[Expression](Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression, livePtr))
  }

  /** GLTFObjectModelProperty.set_godot_to_gltf_expression */
  final def setGodotToGltfExpression(godot_to_gltf_expr: Expression): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression == null) gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression = MethodBind.get("GLTFObjectModelProperty", "set_godot_to_gltf_expression", 1815845073L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression, livePtr, Wrappers.handle(godot_to_gltf_expr))
  }

  /** GLTFObjectModelProperty.has_node_paths */
  final def hasNodePaths(): Boolean = {
    if (gdext.classes.GLTFObjectModelProperty.mb_has_node_paths == null) gdext.classes.GLTFObjectModelProperty.mb_has_node_paths = MethodBind.get("GLTFObjectModelProperty", "has_node_paths", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFObjectModelProperty.mb_has_node_paths, livePtr)
  }

  /** GLTFObjectModelProperty.get_object_model_type */
  final def getObjectModelType(): Long = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type == null) gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type = MethodBind.get("GLTFObjectModelProperty", "get_object_model_type", 1094778507L)
    Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type, livePtr)
  }

  /** GLTFObjectModelProperty.set_object_model_type */
  final def setObjectModelType(`type`: Long): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_object_model_type == null) gdext.classes.GLTFObjectModelProperty.mb_set_object_model_type = MethodBind.get("GLTFObjectModelProperty", "set_object_model_type", 4108684086L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_object_model_type, livePtr, `type`)
  }

  /** GLTFObjectModelProperty.has_json_pointers */
  final def hasJsonPointers(): Boolean = {
    if (gdext.classes.GLTFObjectModelProperty.mb_has_json_pointers == null) gdext.classes.GLTFObjectModelProperty.mb_has_json_pointers = MethodBind.get("GLTFObjectModelProperty", "has_json_pointers", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFObjectModelProperty.mb_has_json_pointers, livePtr)
  }

  /** GLTFObjectModelProperty.get_variant_type */
  final def getVariantType(): Long = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_variant_type == null) gdext.classes.GLTFObjectModelProperty.mb_get_variant_type = MethodBind.get("GLTFObjectModelProperty", "get_variant_type", 3416842102L)
    Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_variant_type, livePtr)
  }

  /** GLTFObjectModelProperty.set_variant_type */
  final def setVariantType(variant_type: Long): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_variant_type == null) gdext.classes.GLTFObjectModelProperty.mb_set_variant_type = MethodBind.get("GLTFObjectModelProperty", "set_variant_type", 2887708385L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_variant_type, livePtr, variant_type)
  }

  /** GLTFObjectModelProperty.set_types */
  final def setTypes(variant_type: Long, obj_model_type: Long): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_types == null) gdext.classes.GLTFObjectModelProperty.mb_set_types = MethodBind.get("GLTFObjectModelProperty", "set_types", 4150728237L)
    Ptrcall.callVoid2(gdext.classes.GLTFObjectModelProperty.mb_set_types, livePtr, variant_type, obj_model_type)
  }

}

object GLTFObjectModelProperty {
  private[classes] var mb_get_accessor_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gltf_to_godot_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gltf_to_godot_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_godot_to_gltf_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_godot_to_gltf_expression: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_node_paths: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_object_model_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_object_model_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_json_pointers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_variant_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_variant_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_types: GDExtensionMethodBindPtr = null
}
