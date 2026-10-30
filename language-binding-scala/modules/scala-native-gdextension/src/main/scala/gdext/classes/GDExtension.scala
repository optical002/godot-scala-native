package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def getMinimumLibraryInitializationLevel(): gdext.classes.GDExtension.InitializationLevel = {
    if (gdext.classes.GDExtension.mb_get_minimum_library_initialization_level == null) gdext.classes.GDExtension.mb_get_minimum_library_initialization_level = MethodBind.get("GDExtension", "get_minimum_library_initialization_level", 964858755L)
    gdext.classes.GDExtension.InitializationLevel(Ptrcall.call0[Long](gdext.classes.GDExtension.mb_get_minimum_library_initialization_level, livePtr))
  }

}

object GDExtension {
  private[classes] var mb_is_library_open: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimum_library_initialization_level: GDExtensionMethodBindPtr = null

  /** Godot enum `GDExtension.InitializationLevel`. */
  opaque type InitializationLevel <: Long = Long

  object InitializationLevel {
    final val Core: InitializationLevel = 0L.asInstanceOf[InitializationLevel]
    final val Servers: InitializationLevel = 1L.asInstanceOf[InitializationLevel]
    final val Scene: InitializationLevel = 2L.asInstanceOf[InitializationLevel]
    final val Editor: InitializationLevel = 3L.asInstanceOf[InitializationLevel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): InitializationLevel = value.asInstanceOf[InitializationLevel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[InitializationLevel] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[InitializationLevel]]

    extension (self: InitializationLevel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Core"
        case 1L => "Servers"
        case 2L => "Scene"
        case 3L => "Editor"
        case other => other.toString
      }
  }
}
