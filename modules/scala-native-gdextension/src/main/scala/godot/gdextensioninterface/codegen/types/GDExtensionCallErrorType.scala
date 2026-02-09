
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*


object GDExtensionCallErrorType {
  final val GDEXTENSION_CALL_OK: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_METHOD: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_CALL_ERROR_INVALID_ARGUMENT: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_MANY_ARGUMENTS: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_CALL_ERROR_TOO_FEW_ARGUMENTS: CUnsignedInt = 4.toUInt
  final val GDEXTENSION_CALL_ERROR_INSTANCE_IS_NULL: CUnsignedInt = 5.toUInt
  final val GDEXTENSION_CALL_ERROR_METHOD_NOT_CONST: CUnsignedInt = 6.toUInt
}
