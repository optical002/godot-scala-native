package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GDExtension`, extends `Resource`. */
abstract class GDExtension extends Resource {
  override def godotClassName: String = "GDExtension"

  /** GDExtension.is_library_open */
  final def isLibraryOpen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GDExtension", "is_library_open", 36873697L), hostObject.objectPtr)

  /** GDExtension.get_minimum_library_initialization_level */
  final def getMinimumLibraryInitializationLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("GDExtension", "get_minimum_library_initialization_level", 964858755L), hostObject.objectPtr)

}
