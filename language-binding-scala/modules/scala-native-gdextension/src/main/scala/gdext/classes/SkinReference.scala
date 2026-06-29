package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SkinReference`, extends `RefCounted`. */
abstract class SkinReference extends RefCounted {
  override def godotClassName: String = "SkinReference"

  /** SkinReference.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkinReference", "get_skin", 2074563878L), hostObject.objectPtr)

}
