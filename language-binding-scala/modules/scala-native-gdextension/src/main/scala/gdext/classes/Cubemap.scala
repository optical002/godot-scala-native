package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Cubemap`, extends `ImageTextureLayered`. */
abstract class Cubemap extends ImageTextureLayered {
  override def godotClassName: String = "Cubemap"

  /** Cubemap.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Cubemap", "create_placeholder", 121922552L), hostObject.objectPtr)

}
