package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PortableCompressedTexture2D`, extends `Texture2D`. */
abstract class PortableCompressedTexture2D extends Texture2D {
  override def godotClassName: String = "PortableCompressedTexture2D"

  /** PortableCompressedTexture2D.create_from_image */
  final def createFromImage(image: Image, compression_mode: Long, normal_map: Boolean, lossy_quality: Double): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_create_from_image == null) gdext.classes.PortableCompressedTexture2D.mb_create_from_image = MethodBind.get("PortableCompressedTexture2D", "create_from_image", 3679243433L)
    Ptrcall.callVoid4(gdext.classes.PortableCompressedTexture2D.mb_create_from_image, livePtr, Wrappers.handle(image), compression_mode, normal_map, lossy_quality)
  }

  /** PortableCompressedTexture2D.get_format */
  final def getFormat(): Long = {
    if (gdext.classes.PortableCompressedTexture2D.mb_get_format == null) gdext.classes.PortableCompressedTexture2D.mb_get_format = MethodBind.get("PortableCompressedTexture2D", "get_format", 3847873762L)
    Ptrcall.call0[Long](gdext.classes.PortableCompressedTexture2D.mb_get_format, livePtr)
  }

  /** PortableCompressedTexture2D.get_compression_mode */
  final def getCompressionMode(): Long = {
    if (gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode == null) gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode = MethodBind.get("PortableCompressedTexture2D", "get_compression_mode", 3265612739L)
    Ptrcall.call0[Long](gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode, livePtr)
  }

  /** PortableCompressedTexture2D.set_size_override */
  final def setSizeOverride(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_set_size_override == null) gdext.classes.PortableCompressedTexture2D.mb_set_size_override = MethodBind.get("PortableCompressedTexture2D", "set_size_override", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PortableCompressedTexture2D.mb_set_size_override, livePtr, size)
  }

  /** PortableCompressedTexture2D.get_size_override */
  final def getSizeOverride(): gdext.builtin.Vector2 = {
    if (gdext.classes.PortableCompressedTexture2D.mb_get_size_override == null) gdext.classes.PortableCompressedTexture2D.mb_get_size_override = MethodBind.get("PortableCompressedTexture2D", "get_size_override", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PortableCompressedTexture2D.mb_get_size_override, livePtr)
  }

  /** PortableCompressedTexture2D.set_keep_compressed_buffer */
  final def setKeepCompressedBuffer(keep: Boolean): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_set_keep_compressed_buffer == null) gdext.classes.PortableCompressedTexture2D.mb_set_keep_compressed_buffer = MethodBind.get("PortableCompressedTexture2D", "set_keep_compressed_buffer", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PortableCompressedTexture2D.mb_set_keep_compressed_buffer, livePtr, keep)
  }

  /** PortableCompressedTexture2D.is_keeping_compressed_buffer */
  final def isKeepingCompressedBuffer(): Boolean = {
    if (gdext.classes.PortableCompressedTexture2D.mb_is_keeping_compressed_buffer == null) gdext.classes.PortableCompressedTexture2D.mb_is_keeping_compressed_buffer = MethodBind.get("PortableCompressedTexture2D", "is_keeping_compressed_buffer", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PortableCompressedTexture2D.mb_is_keeping_compressed_buffer, livePtr)
  }

  /** PortableCompressedTexture2D.set_basisu_compressor_params */
  final def setBasisuCompressorParams(uastc_level: Long, rdo_quality_loss: Double): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params == null) gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params = MethodBind.get("PortableCompressedTexture2D", "set_basisu_compressor_params", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params, livePtr, uastc_level, rdo_quality_loss)
  }

}

object PortableCompressedTexture2D {
  private[classes] var mb_create_from_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_compression_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_compressed_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keeping_compressed_buffer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_basisu_compressor_params: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_all_compressed_buffers: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_keeping_all_compressed_buffers: GDExtensionMethodBindPtr = null

  /** PortableCompressedTexture2D.set_keep_all_compressed_buffers */
  final def setKeepAllCompressedBuffers(keep: Boolean): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_set_keep_all_compressed_buffers == null) gdext.classes.PortableCompressedTexture2D.mb_set_keep_all_compressed_buffers = MethodBind.get("PortableCompressedTexture2D", "set_keep_all_compressed_buffers", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PortableCompressedTexture2D.mb_set_keep_all_compressed_buffers, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], keep)
  }

  /** PortableCompressedTexture2D.is_keeping_all_compressed_buffers */
  final def isKeepingAllCompressedBuffers(): Boolean = {
    if (gdext.classes.PortableCompressedTexture2D.mb_is_keeping_all_compressed_buffers == null) gdext.classes.PortableCompressedTexture2D.mb_is_keeping_all_compressed_buffers = MethodBind.get("PortableCompressedTexture2D", "is_keeping_all_compressed_buffers", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.PortableCompressedTexture2D.mb_is_keeping_all_compressed_buffers, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }
}
