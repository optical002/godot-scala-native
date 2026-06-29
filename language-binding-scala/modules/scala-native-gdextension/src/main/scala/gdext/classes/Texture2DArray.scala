package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2DArray`, extends `ImageTextureLayered`. */
abstract class Texture2DArray extends ImageTextureLayered {
  override def godotClassName: String = "Texture2DArray"

  /** Texture2DArray.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2DArray", "create_placeholder", 121922552L), hostObject.objectPtr)

}
