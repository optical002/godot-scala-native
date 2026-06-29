package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CubemapArray`, extends `ImageTextureLayered`. */
abstract class CubemapArray extends ImageTextureLayered {
  override def godotClassName: String = "CubemapArray"

  /** CubemapArray.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CubemapArray", "create_placeholder", 121922552L), hostObject.objectPtr)

}
