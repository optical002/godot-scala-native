package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFObjectModelProperty`, extends `RefCounted`. */
abstract class GLTFObjectModelProperty extends RefCounted {
  override def godotClassName: String = "GLTFObjectModelProperty"

  /** GLTFObjectModelProperty.get_accessor_type */
  final def getAccessorType(): gdext.classes.GLTFAccessor.GLTFAccessorType = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type == null) gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type = MethodBind.get("GLTFObjectModelProperty", "get_accessor_type", 1998183368L)
    gdext.classes.GLTFAccessor.GLTFAccessorType(Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_accessor_type, livePtr))
  }

  /** GLTFObjectModelProperty.get_gltf_to_godot_expression. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGltfToGodotExpression(): Expression = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression == null) gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression = MethodBind.get("GLTFObjectModelProperty", "get_gltf_to_godot_expression", 2240072449L)
    Wrappers.owned[Expression](Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_gltf_to_godot_expression, livePtr))
  }

  /** GLTFObjectModelProperty.set_gltf_to_godot_expression */
  final def setGltfToGodotExpression(gltfToGodotExpr: Expression): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression == null) gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression = MethodBind.get("GLTFObjectModelProperty", "set_gltf_to_godot_expression", 1815845073L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_gltf_to_godot_expression, livePtr, Wrappers.handle(gltfToGodotExpr))
  }

  /** GLTFObjectModelProperty.get_godot_to_gltf_expression. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGodotToGltfExpression(): Expression = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression == null) gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression = MethodBind.get("GLTFObjectModelProperty", "get_godot_to_gltf_expression", 2240072449L)
    Wrappers.owned[Expression](Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_godot_to_gltf_expression, livePtr))
  }

  /** GLTFObjectModelProperty.set_godot_to_gltf_expression */
  final def setGodotToGltfExpression(godotToGltfExpr: Expression): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression == null) gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression = MethodBind.get("GLTFObjectModelProperty", "set_godot_to_gltf_expression", 1815845073L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_godot_to_gltf_expression, livePtr, Wrappers.handle(godotToGltfExpr))
  }

  /** GLTFObjectModelProperty.has_node_paths */
  final def hasNodePaths(): Boolean = {
    if (gdext.classes.GLTFObjectModelProperty.mb_has_node_paths == null) gdext.classes.GLTFObjectModelProperty.mb_has_node_paths = MethodBind.get("GLTFObjectModelProperty", "has_node_paths", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GLTFObjectModelProperty.mb_has_node_paths, livePtr)
  }

  /** GLTFObjectModelProperty.get_object_model_type */
  final def getObjectModelType(): gdext.classes.GLTFObjectModelProperty.GLTFObjectModelType = {
    if (gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type == null) gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type = MethodBind.get("GLTFObjectModelProperty", "get_object_model_type", 1094778507L)
    gdext.classes.GLTFObjectModelProperty.GLTFObjectModelType(Ptrcall.call0[Long](gdext.classes.GLTFObjectModelProperty.mb_get_object_model_type, livePtr))
  }

  /** GLTFObjectModelProperty.set_object_model_type */
  final def setObjectModelType(`type`: gdext.classes.GLTFObjectModelProperty.GLTFObjectModelType): Unit = {
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
  final def setVariantType(variantType: Long): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_variant_type == null) gdext.classes.GLTFObjectModelProperty.mb_set_variant_type = MethodBind.get("GLTFObjectModelProperty", "set_variant_type", 2887708385L)
    Ptrcall.callVoid1(gdext.classes.GLTFObjectModelProperty.mb_set_variant_type, livePtr, variantType)
  }

  /** GLTFObjectModelProperty.set_types */
  final def setTypes(variantType: Long, objModelType: gdext.classes.GLTFObjectModelProperty.GLTFObjectModelType): Unit = {
    if (gdext.classes.GLTFObjectModelProperty.mb_set_types == null) gdext.classes.GLTFObjectModelProperty.mb_set_types = MethodBind.get("GLTFObjectModelProperty", "set_types", 4150728237L)
    Ptrcall.callVoid2(gdext.classes.GLTFObjectModelProperty.mb_set_types, livePtr, variantType, objModelType)
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

  /** Godot enum `GLTFObjectModelProperty.GLTFObjectModelType`. */
  opaque type GLTFObjectModelType <: Long = Long

  object GLTFObjectModelType {
    final val Unknown: GLTFObjectModelType = 0L.asInstanceOf[GLTFObjectModelType]
    final val Bool: GLTFObjectModelType = 1L.asInstanceOf[GLTFObjectModelType]
    final val Float: GLTFObjectModelType = 2L.asInstanceOf[GLTFObjectModelType]
    final val FloatArray: GLTFObjectModelType = 3L.asInstanceOf[GLTFObjectModelType]
    final val Float2: GLTFObjectModelType = 4L.asInstanceOf[GLTFObjectModelType]
    final val Float3: GLTFObjectModelType = 5L.asInstanceOf[GLTFObjectModelType]
    final val Float4: GLTFObjectModelType = 6L.asInstanceOf[GLTFObjectModelType]
    final val Float2x2: GLTFObjectModelType = 7L.asInstanceOf[GLTFObjectModelType]
    final val Float3x3: GLTFObjectModelType = 8L.asInstanceOf[GLTFObjectModelType]
    final val Float4x4: GLTFObjectModelType = 9L.asInstanceOf[GLTFObjectModelType]
    final val Int: GLTFObjectModelType = 10L.asInstanceOf[GLTFObjectModelType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GLTFObjectModelType = value.asInstanceOf[GLTFObjectModelType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GLTFObjectModelType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L).asInstanceOf[scala.IArray[GLTFObjectModelType]]

    extension (self: GLTFObjectModelType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Bool"
        case 2L => "Float"
        case 3L => "FloatArray"
        case 4L => "Float2"
        case 5L => "Float3"
        case 6L => "Float4"
        case 7L => "Float2x2"
        case 8L => "Float3x3"
        case 9L => "Float4x4"
        case 10L => "Int"
        case other => other.toString
      }
  }
}
