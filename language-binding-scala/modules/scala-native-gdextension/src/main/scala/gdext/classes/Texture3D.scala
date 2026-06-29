package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture3D`, extends `Texture`. */
abstract class Texture3D extends Texture {
  override def godotClassName: String = "Texture3D"

  /** Texture3D.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture3D", "get_format", 3847873762L), hostObject.objectPtr)

  /** Texture3D.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture3D", "get_width", 3905245786L), hostObject.objectPtr)

  /** Texture3D.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture3D", "get_height", 3905245786L), hostObject.objectPtr)

  /** Texture3D.get_depth */
  final def getDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture3D", "get_depth", 3905245786L), hostObject.objectPtr)

  /** Texture3D.has_mipmaps */
  final def hasMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Texture3D", "has_mipmaps", 36873697L), hostObject.objectPtr)

  /** Texture3D.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture3D", "create_placeholder", 121922552L), hostObject.objectPtr)

}
