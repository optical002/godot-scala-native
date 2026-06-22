package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GDExtension`, extends `Resource`. */
abstract class GDExtension extends Resource {

  /** GDExtension.is_library_open */
  final def isLibraryOpen(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GDExtension", "is_library_open", 36873697L), hostObject.objectPtr)

  /** GDExtension.get_minimum_library_initialization_level */
  final def getMinimumLibraryInitializationLevel(): Long =
    Ptrcall.call0[Long](MethodBind.get("GDExtension", "get_minimum_library_initialization_level", 964858755L), hostObject.objectPtr)

}

object GDExtension {
  /** Class metadata for Gd[GDExtension] lifetime management and casting. */
  given GodotClass[GDExtension] with {
    def className = "GDExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): GDExtension = new GDExtension {}.withHost(o.objectPtr)
    def unwrap(t: GDExtension): GodotObject = t.hostObject
  }
}
