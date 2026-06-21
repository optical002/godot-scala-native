package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PortableCompressedTexture2D`, extends `Texture2D`. */
abstract class PortableCompressedTexture2D extends Texture2D {

  /** PortableCompressedTexture2D.create_from_image */
  final def createFromImage(image: Image, compression_mode: Long, normal_map: Boolean, lossy_quality: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("PortableCompressedTexture2D", "create_from_image", 3679243433L), hostObject.objectPtr, image.hostObject, compression_mode, normal_map, lossy_quality)

  /** PortableCompressedTexture2D.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("PortableCompressedTexture2D", "get_format", 3847873762L), hostObject.objectPtr)

  /** PortableCompressedTexture2D.get_compression_mode */
  final def getCompressionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("PortableCompressedTexture2D", "get_compression_mode", 3265612739L), hostObject.objectPtr)

  /** PortableCompressedTexture2D.set_size_override */
  final def setSizeOverride(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PortableCompressedTexture2D", "set_size_override", 743155724L), hostObject.objectPtr, size)

  /** PortableCompressedTexture2D.get_size_override */
  final def getSizeOverride(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PortableCompressedTexture2D", "get_size_override", 3341600327L), hostObject.objectPtr)

  /** PortableCompressedTexture2D.set_keep_compressed_buffer */
  final def setKeepCompressedBuffer(keep: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PortableCompressedTexture2D", "set_keep_compressed_buffer", 2586408642L), hostObject.objectPtr, keep)

  /** PortableCompressedTexture2D.is_keeping_compressed_buffer */
  final def isKeepingCompressedBuffer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PortableCompressedTexture2D", "is_keeping_compressed_buffer", 36873697L), hostObject.objectPtr)

  /** PortableCompressedTexture2D.set_basisu_compressor_params */
  final def setBasisuCompressorParams(uastc_level: Long, rdo_quality_loss: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("PortableCompressedTexture2D", "set_basisu_compressor_params", 1602489585L), hostObject.objectPtr, uastc_level, rdo_quality_loss)

}

object PortableCompressedTexture2D {
  /** Class metadata for Gd[PortableCompressedTexture2D] lifetime management and casting. */
  given GodotClass[PortableCompressedTexture2D] with {
    def className = "PortableCompressedTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PortableCompressedTexture2D = new PortableCompressedTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: PortableCompressedTexture2D): GodotObject = t.hostObject
  }
}
