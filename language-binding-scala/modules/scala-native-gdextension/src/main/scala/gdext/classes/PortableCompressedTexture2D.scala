package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PortableCompressedTexture2D`, extends `Texture2D`. */
abstract class PortableCompressedTexture2D extends Texture2D {
  override def godotClassName: String = "PortableCompressedTexture2D"

  /** PortableCompressedTexture2D.create_from_image */
  final def createFromImage(image: Image, compressionMode: gdext.classes.PortableCompressedTexture2D.CompressionMode, normalMap: Boolean = false, lossyQuality: Double = 0.8): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_create_from_image == null) gdext.classes.PortableCompressedTexture2D.mb_create_from_image = MethodBind.get("PortableCompressedTexture2D", "create_from_image", 3679243433L)
    Ptrcall.callVoid4(gdext.classes.PortableCompressedTexture2D.mb_create_from_image, livePtr, Wrappers.handle(image), compressionMode, normalMap, lossyQuality)
  }

  /** PortableCompressedTexture2D.get_format */
  final def getFormat(): gdext.classes.Image.Format = {
    if (gdext.classes.PortableCompressedTexture2D.mb_get_format == null) gdext.classes.PortableCompressedTexture2D.mb_get_format = MethodBind.get("PortableCompressedTexture2D", "get_format", 3847873762L)
    gdext.classes.Image.Format(Ptrcall.call0[Long](gdext.classes.PortableCompressedTexture2D.mb_get_format, livePtr))
  }

  /** PortableCompressedTexture2D.get_compression_mode */
  final def getCompressionMode(): gdext.classes.PortableCompressedTexture2D.CompressionMode = {
    if (gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode == null) gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode = MethodBind.get("PortableCompressedTexture2D", "get_compression_mode", 3265612739L)
    gdext.classes.PortableCompressedTexture2D.CompressionMode(Ptrcall.call0[Long](gdext.classes.PortableCompressedTexture2D.mb_get_compression_mode, livePtr))
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
  final def setBasisuCompressorParams(uastcLevel: Long, rdoQualityLoss: Double): Unit = {
    if (gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params == null) gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params = MethodBind.get("PortableCompressedTexture2D", "set_basisu_compressor_params", 1602489585L)
    Ptrcall.callVoid2(gdext.classes.PortableCompressedTexture2D.mb_set_basisu_compressor_params, livePtr, uastcLevel, rdoQualityLoss)
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

  /** Godot enum `PortableCompressedTexture2D.CompressionMode`. */
  opaque type CompressionMode <: Long = Long

  object CompressionMode {
    final val Lossless: CompressionMode = 0L.asInstanceOf[CompressionMode]
    final val Lossy: CompressionMode = 1L.asInstanceOf[CompressionMode]
    final val BasisUniversal: CompressionMode = 2L.asInstanceOf[CompressionMode]
    final val S3tc: CompressionMode = 3L.asInstanceOf[CompressionMode]
    final val Etc2: CompressionMode = 4L.asInstanceOf[CompressionMode]
    final val Bptc: CompressionMode = 5L.asInstanceOf[CompressionMode]
    final val Astc: CompressionMode = 6L.asInstanceOf[CompressionMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressionMode = value.asInstanceOf[CompressionMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressionMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[CompressionMode]]

    extension (self: CompressionMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Lossless"
        case 1L => "Lossy"
        case 2L => "BasisUniversal"
        case 3L => "S3tc"
        case 4L => "Etc2"
        case 5L => "Bptc"
        case 6L => "Astc"
        case other => other.toString
      }
  }
}
