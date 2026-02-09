
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*


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
