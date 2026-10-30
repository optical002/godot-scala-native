package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `JavaScriptObject`, extends `RefCounted`. */
abstract class JavaScriptObject extends RefCounted {
  override def godotClassName: String = "JavaScriptObject"

}
