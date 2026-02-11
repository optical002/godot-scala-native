
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*
import scala.scalanative.unsigned.UInt.*



object GDExtensionVariantType {
  final val GDEXTENSION_VARIANT_TYPE_NIL: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_VARIANT_TYPE_BOOL: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_VARIANT_TYPE_INT: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_VARIANT_TYPE_FLOAT: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_VARIANT_TYPE_STRING: CUnsignedInt = 4.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR2: CUnsignedInt = 5.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR2I: CUnsignedInt = 6.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RECT2: CUnsignedInt = 7.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RECT2I: CUnsignedInt = 8.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR3: CUnsignedInt = 9.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR3I: CUnsignedInt = 10.toUInt
  final val GDEXTENSION_VARIANT_TYPE_TRANSFORM2D: CUnsignedInt = 11.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR4: CUnsignedInt = 12.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VECTOR4I: CUnsignedInt = 13.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PLANE: CUnsignedInt = 14.toUInt
  final val GDEXTENSION_VARIANT_TYPE_QUATERNION: CUnsignedInt = 15.toUInt
  final val GDEXTENSION_VARIANT_TYPE_AABB: CUnsignedInt = 16.toUInt
  final val GDEXTENSION_VARIANT_TYPE_BASIS: CUnsignedInt = 17.toUInt
  final val GDEXTENSION_VARIANT_TYPE_TRANSFORM3D: CUnsignedInt = 18.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PROJECTION: CUnsignedInt = 19.toUInt
  final val GDEXTENSION_VARIANT_TYPE_COLOR: CUnsignedInt = 20.toUInt
  final val GDEXTENSION_VARIANT_TYPE_STRING_NAME: CUnsignedInt = 21.toUInt
  final val GDEXTENSION_VARIANT_TYPE_NODE_PATH: CUnsignedInt = 22.toUInt
  final val GDEXTENSION_VARIANT_TYPE_RID: CUnsignedInt = 23.toUInt
  final val GDEXTENSION_VARIANT_TYPE_OBJECT: CUnsignedInt = 24.toUInt
  final val GDEXTENSION_VARIANT_TYPE_CALLABLE: CUnsignedInt = 25.toUInt
  final val GDEXTENSION_VARIANT_TYPE_SIGNAL: CUnsignedInt = 26.toUInt
  final val GDEXTENSION_VARIANT_TYPE_DICTIONARY: CUnsignedInt = 27.toUInt
  final val GDEXTENSION_VARIANT_TYPE_ARRAY: CUnsignedInt = 28.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_BYTE_ARRAY: CUnsignedInt = 29.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_INT32_ARRAY: CUnsignedInt = 30.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_INT64_ARRAY: CUnsignedInt = 31.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT32_ARRAY: CUnsignedInt = 32.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_FLOAT64_ARRAY: CUnsignedInt = 33.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_STRING_ARRAY: CUnsignedInt = 34.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR2_ARRAY: CUnsignedInt = 35.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR3_ARRAY: CUnsignedInt = 36.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_COLOR_ARRAY: CUnsignedInt = 37.toUInt
  final val GDEXTENSION_VARIANT_TYPE_PACKED_VECTOR4_ARRAY: CUnsignedInt = 38.toUInt
  final val GDEXTENSION_VARIANT_TYPE_VARIANT_MAX: CUnsignedInt = 39.toUInt
}

object GDExtensionVariantOperator {
  final val GDEXTENSION_VARIANT_OP_EQUAL: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_VARIANT_OP_NOT_EQUAL: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_VARIANT_OP_LESS: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_VARIANT_OP_LESS_EQUAL: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_VARIANT_OP_GREATER: CUnsignedInt = 4.toUInt
  final val GDEXTENSION_VARIANT_OP_GREATER_EQUAL: CUnsignedInt = 5.toUInt
  final val GDEXTENSION_VARIANT_OP_ADD: CUnsignedInt = 6.toUInt
  final val GDEXTENSION_VARIANT_OP_SUBTRACT: CUnsignedInt = 7.toUInt
  final val GDEXTENSION_VARIANT_OP_MULTIPLY: CUnsignedInt = 8.toUInt
  final val GDEXTENSION_VARIANT_OP_DIVIDE: CUnsignedInt = 9.toUInt
  final val GDEXTENSION_VARIANT_OP_NEGATE: CUnsignedInt = 10.toUInt
  final val GDEXTENSION_VARIANT_OP_POSITIVE: CUnsignedInt = 11.toUInt
  final val GDEXTENSION_VARIANT_OP_MODULE: CUnsignedInt = 12.toUInt
  final val GDEXTENSION_VARIANT_OP_POWER: CUnsignedInt = 13.toUInt
  final val GDEXTENSION_VARIANT_OP_SHIFT_LEFT: CUnsignedInt = 14.toUInt
  final val GDEXTENSION_VARIANT_OP_SHIFT_RIGHT: CUnsignedInt = 15.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_AND: CUnsignedInt = 16.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_OR: CUnsignedInt = 17.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_XOR: CUnsignedInt = 18.toUInt
  final val GDEXTENSION_VARIANT_OP_BIT_NEGATE: CUnsignedInt = 19.toUInt
  final val GDEXTENSION_VARIANT_OP_AND: CUnsignedInt = 20.toUInt
  final val GDEXTENSION_VARIANT_OP_OR: CUnsignedInt = 21.toUInt
  final val GDEXTENSION_VARIANT_OP_XOR: CUnsignedInt = 22.toUInt
  final val GDEXTENSION_VARIANT_OP_NOT: CUnsignedInt = 23.toUInt
  final val GDEXTENSION_VARIANT_OP_IN: CUnsignedInt = 24.toUInt
  final val GDEXTENSION_VARIANT_OP_MAX: CUnsignedInt = 25.toUInt
}

object GDExtensionCallErrorType {
  final val GDEXTENSION_CALL_OK: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_METHOD: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_ARGUMENT: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_MANY_ARGUMENTS: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_FEW_ARGUMENTS: CUnsignedInt = 4.toUInt
  final val GDEXTENSION_CALL_ERROR_INSTANCE_IS_NULL: CUnsignedInt = 5.toUInt
  final val GDEXTENSION_CALL_ERROR_METHOD_NOT_CONST: CUnsignedInt = 6.toUInt
}

object GDExtensionClassMethodFlags {
  final val GDEXTENSION_METHOD_FLAG_NORMAL: CInt = 1
  final val GDEXTENSION_METHOD_FLAGS_DEFAULT: CInt = 1
  final val GDEXTENSION_METHOD_FLAG_EDITOR: CInt = 2
  final val GDEXTENSION_METHOD_FLAG_CONST: CInt = 4
  final val GDEXTENSION_METHOD_FLAG_VIRTUAL: CInt = 8
  final val GDEXTENSION_METHOD_FLAG_VARARG: CInt = 16
  final val GDEXTENSION_METHOD_FLAG_STATIC: CInt = 32
  final val GDEXTENSION_METHOD_FLAG_VIRTUAL_REQUIRED: CInt = 128
}

object GDExtensionClassMethodArgumentMetadata {
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_NONE: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT8: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT16: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT32: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_INT64: CUnsignedInt = 4.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT8: CUnsignedInt = 5.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT16: CUnsignedInt = 6.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT32: CUnsignedInt = 7.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_UINT64: CUnsignedInt = 8.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_REAL_IS_FLOAT: CUnsignedInt = 9.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_REAL_IS_DOUBLE: CUnsignedInt = 10.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_CHAR16: CUnsignedInt = 11.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_INT_IS_CHAR32: CUnsignedInt = 12.toUInt
  final val GDEXTENSION_METHOD_ARGUMENT_METADATA_OBJECT_IS_REQUIRED: CUnsignedInt = 13.toUInt
}

object GDExtensionInitializationLevel {
  final val GDEXTENSION_INITIALIZATION_CORE: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_INITIALIZATION_SERVERS: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_INITIALIZATION_SCENE: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_INITIALIZATION_EDITOR: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_MAX_INITIALIZATION_LEVEL: CUnsignedInt = 4.toUInt
}
