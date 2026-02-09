
package godot.gdextensioninterface.codegen.types

import scala.scalanative.unsafe.*
import scala.scalanative.unsigned.*


object GDExtensionInitializationLevel {
  final val GDEXTENSION_INITIALIZATION_CORE: CUnsignedInt = 0.toUInt
  final val GDEXTENSION_INITIALIZATION_SERVERS: CUnsignedInt = 1.toUInt
  final val GDEXTENSION_INITIALIZATION_SCENE: CUnsignedInt = 2.toUInt
  final val GDEXTENSION_INITIALIZATION_EDITOR: CUnsignedInt = 3.toUInt
  final val GDEXTENSION_MAX_INITIALIZATION_LEVEL: CUnsignedInt = 4.toUInt
}
