
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*
import godot.types.ConstPtr
import godot.types.CStruct23



type GDExtensionVariantType = CUnsignedInt
object GDExtensionVariantType {
  final val GDEXTENSION_VARIANT_TYPE_NIL: GDExtensionVariantType = 0.toUInt
  final val GDEXTENSION_VARIANT_TYPE_BOOL: GDExtensionVariantType = 1.toUInt
  final val GDEXTENSION_VARIANT_TYPE_INT: GDExtensionVariantType = 2.toUInt
  final val GDEXTENSION_VARIANT_TYPE_FLOAT: GDExtensionVariantType = 3.toUInt
  final val GDEXTENSION_VARIANT_TYPE_STRING: GDExtensionVariantType = 4.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR2: GDExtensionVariantType = 5.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR2I: GDExtensionVariantType = 6.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RECT2: GDExtensionVariantType = 7.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RECT2I: GDExtensionVariantType = 8.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR3: GDExtensionVariantType = 9.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR3I: GDExtensionVariantType = 10.toUInt
  final val GDEXTENSION_VARIANT_TYPE_TRANSFORM2D: GDExtensionVariantType = 11.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR4: GDExtensionVariantType = 12.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR4I: GDExtensionVariantType = 13.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PLANE: GDExtensionVariantType = 14.toUInt
  final val GDEXTENSION_VARIANT_TYPE_QUATERNION: GDExtensionVariantType = 15.toUInt
  final val GDEXTENSION_VARIANT_TYPE_AABB: GDExtensionVariantType = 16.toUInt
  final val GDEXTENSION_VARIANT_TYPE_BASIS: GDExtensionVariantType = 17.toUInt
  final val GDEXTENSION_VARIANT_TYPE_TRANSFORM3D: GDExtensionVariantType = 18.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PROJECTION: GDExtensionVariantType = 19.toUInt
  final val GDEXTENSION_VARIANT_TYPE_COLOR: GDExtensionVariantType = 20.toUInt
  final val GDEXTENSION_VARIANT_TYPE_STRING_NAME: GDExtensionVariantType = 21.toUInt
  final val GDEXTENSION_VARIANT_TYPE_NODE_PATH: GDExtensionVariantType = 22.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RID: GDExtensionVariantType = 23.toUInt
  final val GDEXTENSION_VARIANT_TYPE_OBJECT: GDExtensionVariantType = 24.toUInt
  final val GDEXTENSION_VARIANT_TYPE_CALLABLE: GDExtensionVariantType = 25.toUInt
  final val GDEXTENSION_VARIANT_TYPE_SIGNAL: GDExtensionVariantType = 26.toUInt
  final val GDEXTENSION_VARIANT_TYPE_DICTIONARY: GDExtensionVariantType = 27.toUInt
  final val GDEXTENSION_VARIANT_TYPE_ARRAY: GDExtensionVariantType = 28.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_BYTE_ARRAY: GDExtensionVariantType = 29.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY: GDExtensionVariantType = 30.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_INT64_ARRAY: GDExtensionVariantType = 31.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY: GDExtensionVariantType = 32.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT64_ARRAY: GDExtensionVariantType = 33.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_STRING_ARRAY: GDExtensionVariantType = 34.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR2_ARRAY: GDExtensionVariantType = 35.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY: GDExtensionVariantType = 36.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_COLOR_ARRAY: GDExtensionVariantType = 37.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR4_ARRAY: GDExtensionVariantType = 38.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VARIANT_MAX: GDExtensionVariantType = 39.toUInt
}

type GDExtensionVariantOperator = CUnsignedInt
object GDExtensionVariantOperator {
  final val GDEXTENSION_VARIANT_OP_EQUAL: GDExtensionVariantOperator = 0.toUInt
  final val GDEXTENSION_VARIANT_OP_NOT_EQUAL: GDExtensionVariantOperator = 1.toUInt
  final val GDEXTENSION_VARIANT_OP_LESS: GDExtensionVariantOperator = 2.toUInt
  final val GDEXTENSION_VARIANT_OP_LESS_EQUAL: GDExtensionVariantOperator = 3.toUInt
  final val GDEXTENSION_VARIANT_OP_GREATER: GDExtensionVariantOperator = 4.toUInt
  final val GDEXTENSION_VARIANT_OP_GREATER_EQUAL: GDExtensionVariantOperator = 5.toUInt
  final val GDEXTENSION_VARIANT_OP_ADD: GDExtensionVariantOperator = 6.toUInt
  final val GDEXTENSION_VARIANT_OP_SUBTRACT: GDExtensionVariantOperator = 7.toUInt
  final val GDEXTENSION_VARIANT_OP_MULTIPLY: GDExtensionVariantOperator = 8.toUInt
  final val GDEXTENSION_VARIANT_OP_DIVIDE: GDExtensionVariantOperator = 9.toUInt
  final val GDEXTENSION_VARIANT_OP_NEGATE: GDExtensionVariantOperator = 10.toUInt
  final val GDEXTENSION_VARIANT_OP_POSITIVE: GDExtensionVariantOperator = 11.toUInt
  final val GDEXTENSION_VARIANT_OP_MODULE: GDExtensionVariantOperator = 12.toUInt
  final val GDEXTENSION_VARIANT_OP_POWER: GDExtensionVariantOperator = 13.toUInt
  final val GDEXTENSION_VARIANT_OP_SHIFT_LEFT: GDExtensionVariantOperator = 14.toUInt
  final val GDEXTENSION_VARIANT_OP_SHIFT_RIGHT: GDExtensionVariantOperator = 15.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_AND: GDExtensionVariantOperator = 16.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_OR: GDExtensionVariantOperator = 17.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_XOR: GDExtensionVariantOperator = 18.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_NEGATE: GDExtensionVariantOperator = 19.toUInt
  final val GDEXTENSION_VARIANT_OP_AND: GDExtensionVariantOperator = 20.toUInt
  final val GDEXTENSION_VARIANT_OP_OR: GDExtensionVariantOperator = 21.toUInt
  final val GDEXTENSION_VARIANT_OP_XOR: GDExtensionVariantOperator = 22.toUInt
  final val GDEXTENSION_VARIANT_OP_NOT: GDExtensionVariantOperator = 23.toUInt
  final val GDEXTENSION_VARIANT_OP_IN: GDExtensionVariantOperator = 24.toUInt
  final val GDEXTENSION_VARIANT_OP_MAX: GDExtensionVariantOperator = 25.toUInt
}

type GDExtensionCallErrorType = CUnsignedInt
object GDExtensionCallErrorType {
  final val GDEXTENSION_CALL_OK: GDExtensionCallErrorType = 0.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_METHOD: GDExtensionCallErrorType = 1.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_ARGUMENT: GDExtensionCallErrorType = 2.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_MANY_ARGUMENTS: GDExtensionCallErrorType = 3.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_FEW_ARGUMENTS: GDExtensionCallErrorType = 4.toUInt
  final val GDEXTENSION_CALL_ERROR_INSTANCE_IS_NULL: GDExtensionCallErrorType = 5.toUInt
  final val GDEXTENSION_CALL_ERROR_METHOD_NOT_CONST: GDExtensionCallErrorType = 6.toUInt
}

type GDExtensionClassMethodFlags = CInt
object GDExtensionClassMethodFlags {
  final val GDEXTENSION_METHOD_FLAG_NORMAL: GDExtensionClassMethodFlags = 1
  final val GDEXTENSION_METHOD_FLAGS_DEFAULT: GDExtensionClassMethodFlags = 1
  final val GDEXTENSION_METHOD_FLAG_EDITOR: GDExtensionClassMethodFlags = 2
  final val GDEXTENSION_METHOD_FLAG_CONST: GDExtensionClassMethodFlags = 4
  final val GDEXTENSION_METHOD_FLAG_VIRTUAL: GDExtensionClassMethodFlags = 8
  final val GDEXTENSION_METHOD_FLAG_VARARG: GDExtensionClassMethodFlags = 16
  final val GDEXTENSION_METHOD_FLAG_STATIC: GDExtensionClassMethodFlags = 32
  final val GDEXTENSION_METHOD_FLAG_VIRTUAL_REQUIRED: GDExtensionClassMethodFlags = 128
}

type GDExtensionClassMethodArgumentMetadata = CUnsignedInt
object GDExtensionClassMethodArgumentMetadata {
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_NONE: GDExtensionClassMethodArgumentMetadata = 0.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT8: GDExtensionClassMethodArgumentMetadata = 1.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT16: GDExtensionClassMethodArgumentMetadata = 2.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT32: GDExtensionClassMethodArgumentMetadata = 3.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT64: GDExtensionClassMethodArgumentMetadata = 4.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT8: GDExtensionClassMethodArgumentMetadata = 5.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT16: GDExtensionClassMethodArgumentMetadata = 6.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT32: GDExtensionClassMethodArgumentMetadata = 7.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT64: GDExtensionClassMethodArgumentMetadata = 8.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_REAL_IS_FLOAT: GDExtensionClassMethodArgumentMetadata = 9.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_REAL_IS_DOUBLE: GDExtensionClassMethodArgumentMetadata = 10.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_CHAR16: GDExtensionClassMethodArgumentMetadata = 11.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_CHAR32: GDExtensionClassMethodArgumentMetadata = 12.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_OBJECT_IS_REQUIRED: GDExtensionClassMethodArgumentMetadata = 13.toUInt
}

type GDExtensionInitializationLevel = CUnsignedInt
object GDExtensionInitializationLevel {
  final val GDEXTENSION_INITIALIZATION_CORE: GDExtensionInitializationLevel = 0.toUInt
  final val GDEXTENSION_INITIALIZATION_SERVERS: GDExtensionInitializationLevel = 1.toUInt
  final val GDEXTENSION_INITIALIZATION_SCENE: GDExtensionInitializationLevel = 2.toUInt
  final val GDEXTENSION_INITIALIZATION_EDITOR: GDExtensionInitializationLevel = 3.toUInt
  final val GDEXTENSION_MAX_INITIALIZATION_LEVEL: GDExtensionInitializationLevel = 4.toUInt
}
