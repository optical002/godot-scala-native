package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2D`, extends `Texture`. */
abstract class Texture2D extends Texture {
  override def godotClassName: String = "Texture2D"

  /** Texture2D.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture2D", "get_width", 3905245786L), hostObject.objectPtr)

  /** Texture2D.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture2D", "get_height", 3905245786L), hostObject.objectPtr)

  /** Texture2D.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Texture2D", "get_size", 3341600327L), hostObject.objectPtr)

  /** Texture2D.has_alpha */
  final def hasAlpha(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Texture2D", "has_alpha", 36873697L), hostObject.objectPtr)

  /** Texture2D.get_image */
  final def getImage(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2D", "get_image", 4190603485L), hostObject.objectPtr)

  /** Texture2D.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2D", "create_placeholder", 121922552L), hostObject.objectPtr)

}
