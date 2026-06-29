package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ExternalTexture`, extends `Texture2D`. */
abstract class ExternalTexture extends Texture2D {
  override def godotClassName: String = "ExternalTexture"

  /** ExternalTexture.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ExternalTexture", "set_size", 743155724L), hostObject.objectPtr, size)

  /** ExternalTexture.get_external_texture_id */
  final def getExternalTextureId(): Long =
    Ptrcall.call0[Long](MethodBind.get("ExternalTexture", "get_external_texture_id", 3905245786L), hostObject.objectPtr)

  /** ExternalTexture.set_external_buffer_id */
  final def setExternalBufferId(external_buffer_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ExternalTexture", "set_external_buffer_id", 1286410249L), hostObject.objectPtr, external_buffer_id)

}
