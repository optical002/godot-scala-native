package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ExternalTexture`, extends `Texture2D`. */
abstract class ExternalTexture extends Texture2D {
  override def godotClassName: String = "ExternalTexture"

  /** ExternalTexture.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ExternalTexture.mb_set_size == null) gdext.classes.ExternalTexture.mb_set_size = MethodBind.get("ExternalTexture", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ExternalTexture.mb_set_size, livePtr, size)
  }

  /** ExternalTexture.get_external_texture_id */
  final def getExternalTextureId(): Long = {
    if (gdext.classes.ExternalTexture.mb_get_external_texture_id == null) gdext.classes.ExternalTexture.mb_get_external_texture_id = MethodBind.get("ExternalTexture", "get_external_texture_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ExternalTexture.mb_get_external_texture_id, livePtr)
  }

  /** ExternalTexture.set_external_buffer_id */
  final def setExternalBufferId(externalBufferId: Long): Unit = {
    if (gdext.classes.ExternalTexture.mb_set_external_buffer_id == null) gdext.classes.ExternalTexture.mb_set_external_buffer_id = MethodBind.get("ExternalTexture", "set_external_buffer_id", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ExternalTexture.mb_set_external_buffer_id, livePtr, externalBufferId)
  }

}

object ExternalTexture {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_external_texture_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_external_buffer_id: GDExtensionMethodBindPtr = null
}
