package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GDExtension`, extends `Resource`. */
abstract class GDExtension extends Resource {
  override def godotClassName: String = "GDExtension"

  /** GDExtension.is_library_open */
  final def isLibraryOpen(): Boolean = {
    if (gdext.classes.GDExtension.mb_is_library_open == null) gdext.classes.GDExtension.mb_is_library_open = MethodBind.get("GDExtension", "is_library_open", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GDExtension.mb_is_library_open, livePtr)
  }

  /** GDExtension.get_minimum_library_initialization_level */
  final def getMinimumLibraryInitializationLevel(): Long = {
    if (gdext.classes.GDExtension.mb_get_minimum_library_initialization_level == null) gdext.classes.GDExtension.mb_get_minimum_library_initialization_level = MethodBind.get("GDExtension", "get_minimum_library_initialization_level", 964858755L)
    Ptrcall.call0[Long](gdext.classes.GDExtension.mb_get_minimum_library_initialization_level, livePtr)
  }

}

object GDExtension {
  private[classes] var mb_is_library_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimum_library_initialization_level: GDExtensionMethodBindPtr = null
}
