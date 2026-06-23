package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `Image`, extends `Resource`. */
abstract class Image extends Resource {

  /** Image.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "get_width", 3905245786L), hostObject.objectPtr)

  /** Image.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "get_height", 3905245786L), hostObject.objectPtr)

  /** Image.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Image", "get_size", 3690982128L), hostObject.objectPtr)

  /** Image.has_mipmaps */
  final def hasMipmaps(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Image", "has_mipmaps", 36873697L), hostObject.objectPtr)

  /** Image.get_format */
  final def getFormat(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "get_format", 3847873762L), hostObject.objectPtr)

  /** Image.get_data_size */
  final def getDataSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "get_data_size", 3905245786L), hostObject.objectPtr)

  /** Image.convert */
  final def convert(format: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Image", "convert", 2120693146L), hostObject.objectPtr, format)

  /** Image.get_mipmap_count */
  final def getMipmapCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "get_mipmap_count", 3905245786L), hostObject.objectPtr)

  /** Image.get_mipmap_offset */
  final def getMipmapOffset(mipmap: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Image", "get_mipmap_offset", 923996154L), hostObject.objectPtr, mipmap)

  /** Image.resize_to_po2 */
  final def resizeToPo2(square: Boolean, interpolation: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Image", "resize_to_po2", 4189212329L), hostObject.objectPtr, square, interpolation)

  /** Image.resize */
  final def resize(width: Long, height: Long, interpolation: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Image", "resize", 994498151L), hostObject.objectPtr, width, height, interpolation)

  /** Image.shrink_x2 */
  final def shrinkX2(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "shrink_x2", 3218959716L), hostObject.objectPtr)

  /** Image.crop */
  final def crop(width: Long, height: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Image", "crop", 3937882851L), hostObject.objectPtr, width, height)

  /** Image.flip_x */
  final def flipX(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "flip_x", 3218959716L), hostObject.objectPtr)

  /** Image.flip_y */
  final def flipY(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "flip_y", 3218959716L), hostObject.objectPtr)

  /** Image.generate_mipmaps */
  final def generateMipmaps(renormalize: Boolean): Long =
    Ptrcall.call1[Boolean, Long](MethodBind.get("Image", "generate_mipmaps", 1633102583L), hostObject.objectPtr, renormalize)

  /** Image.clear_mipmaps */
  final def clearMipmaps(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "clear_mipmaps", 3218959716L), hostObject.objectPtr)

  /** Image.is_empty */
  final def isEmpty(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Image", "is_empty", 36873697L), hostObject.objectPtr)

  /** Image.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Image", "load", 166001499L), hostObject.objectPtr, path)

  /** Image.save_png */
  final def savePng(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Image", "save_png", 2113323047L), hostObject.objectPtr, path)

  /** Image.save_jpg */
  final def saveJpg(path: String, quality: Double): Long =
    Ptrcall.call2[String, Double, Long](MethodBind.get("Image", "save_jpg", 2800019068L), hostObject.objectPtr, path, quality)

  /** Image.save_exr */
  final def saveExr(path: String, grayscale: Boolean): Long =
    Ptrcall.call2[String, Boolean, Long](MethodBind.get("Image", "save_exr", 3108122999L), hostObject.objectPtr, path, grayscale)

  /** Image.save_dds */
  final def saveDds(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("Image", "save_dds", 2113323047L), hostObject.objectPtr, path)

  /** Image.save_webp */
  final def saveWebp(path: String, lossy: Boolean, quality: Double): Long =
    Ptrcall.call3[String, Boolean, Double, Long](MethodBind.get("Image", "save_webp", 2781156876L), hostObject.objectPtr, path, lossy, quality)

  /** Image.detect_alpha */
  final def detectAlpha(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "detect_alpha", 2030116505L), hostObject.objectPtr)

  /** Image.is_invisible */
  final def isInvisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Image", "is_invisible", 36873697L), hostObject.objectPtr)

  /** Image.detect_used_channels */
  final def detectUsedChannels(source: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("Image", "detect_used_channels", 2703139984L), hostObject.objectPtr, source)

  /** Image.compress */
  final def compress(mode: Long, source: Long, astc_format: Long): Long =
    Ptrcall.call3[Long, Long, Long, Long](MethodBind.get("Image", "compress", 2975424957L), hostObject.objectPtr, mode, source, astc_format)

  /** Image.compress_from_channels */
  final def compressFromChannels(mode: Long, channels: Long, astc_format: Long): Long =
    Ptrcall.call3[Long, Long, Long, Long](MethodBind.get("Image", "compress_from_channels", 4212890953L), hostObject.objectPtr, mode, channels, astc_format)

  /** Image.decompress */
  final def decompress(): Long =
    Ptrcall.call0[Long](MethodBind.get("Image", "decompress", 166280745L), hostObject.objectPtr)

  /** Image.is_compressed */
  final def isCompressed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Image", "is_compressed", 36873697L), hostObject.objectPtr)

  /** Image.rotate_90 */
  final def rotate90(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Image", "rotate_90", 1901204267L), hostObject.objectPtr, direction)

  /** Image.rotate_180 */
  final def rotate180(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "rotate_180", 3218959716L), hostObject.objectPtr)

  /** Image.fix_alpha_edges */
  final def fixAlphaEdges(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "fix_alpha_edges", 3218959716L), hostObject.objectPtr)

  /** Image.premultiply_alpha */
  final def premultiplyAlpha(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "premultiply_alpha", 3218959716L), hostObject.objectPtr)

  /** Image.srgb_to_linear */
  final def srgbToLinear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "srgb_to_linear", 3218959716L), hostObject.objectPtr)

  /** Image.linear_to_srgb */
  final def linearToSrgb(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "linear_to_srgb", 3218959716L), hostObject.objectPtr)

  /** Image.normal_map_to_xy */
  final def normalMapToXy(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Image", "normal_map_to_xy", 3218959716L), hostObject.objectPtr)

  /** Image.rgbe_to_srgb */
  final def rgbeToSrgb(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Image", "rgbe_to_srgb", 564927088L), hostObject.objectPtr)

  /** Image.bump_map_to_normal_map */
  final def bumpMapToNormalMap(bump_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Image", "bump_map_to_normal_map", 3423495036L), hostObject.objectPtr, bump_scale)

  /** Image.blit_rect */
  final def blitRect(src: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid3(MethodBind.get("Image", "blit_rect", 2903928755L), hostObject.objectPtr, src.hostObject, src_rect, dst)

  /** Image.blit_rect_mask */
  final def blitRectMask(src: Image, mask: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid4(MethodBind.get("Image", "blit_rect_mask", 3383581145L), hostObject.objectPtr, src.hostObject, mask.hostObject, src_rect, dst)

  /** Image.blend_rect */
  final def blendRect(src: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid3(MethodBind.get("Image", "blend_rect", 2903928755L), hostObject.objectPtr, src.hostObject, src_rect, dst)

  /** Image.blend_rect_mask */
  final def blendRectMask(src: Image, mask: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid4(MethodBind.get("Image", "blend_rect_mask", 3383581145L), hostObject.objectPtr, src.hostObject, mask.hostObject, src_rect, dst)

  /** Image.fill */
  final def fill(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Image", "fill", 2920490490L), hostObject.objectPtr, color)

  /** Image.fill_rect */
  final def fillRect(rect: gdext.builtin.Rect2i, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Image", "fill_rect", 514693913L), hostObject.objectPtr, rect, color)

  /** Image.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("Image", "get_used_rect", 410525958L), hostObject.objectPtr)

  /** Image.get_region */
  final def getRegion(region: gdext.builtin.Rect2i): GodotObject =
    Ptrcall.call1[gdext.builtin.Rect2i, GodotObject](MethodBind.get("Image", "get_region", 2601441065L), hostObject.objectPtr, region)

  /** Image.copy_from */
  final def copyFrom(src: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("Image", "copy_from", 532598488L), hostObject.objectPtr, src.hostObject)

  /** Image.get_pixelv */
  final def getPixelv(point: gdext.builtin.Vector2i): gdext.builtin.Color =
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Color](MethodBind.get("Image", "get_pixelv", 1532707496L), hostObject.objectPtr, point)

  /** Image.get_pixel */
  final def getPixel(x: Long, y: Long): gdext.builtin.Color =
    Ptrcall.call2[Long, Long, gdext.builtin.Color](MethodBind.get("Image", "get_pixel", 2165839948L), hostObject.objectPtr, x, y)

  /** Image.set_pixelv */
  final def setPixelv(point: gdext.builtin.Vector2i, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Image", "set_pixelv", 287851464L), hostObject.objectPtr, point, color)

  /** Image.set_pixel */
  final def setPixel(x: Long, y: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("Image", "set_pixel", 3733378741L), hostObject.objectPtr, x, y, color)

  /** Image.adjust_bcs */
  final def adjustBcs(brightness: Double, contrast: Double, saturation: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Image", "adjust_bcs", 2385087082L), hostObject.objectPtr, brightness, contrast, saturation)

  /** Image.load_svg_from_string */
  final def loadSvgFromString(svg_str: String, scale: Double): Long =
    Ptrcall.call2[String, Double, Long](MethodBind.get("Image", "load_svg_from_string", 3254053600L), hostObject.objectPtr, svg_str, scale)

}

object Image {
  /** Class metadata for Gd[Image] lifetime management and casting. */
  given GodotClass[Image] with {
    def className = "Image"
    def isRefCounted = true
    def wrap(o: GodotObject): Image = new Image {}.withHost(o.objectPtr)
    def unwrap(t: Image): GodotObject = t.hostObject
  }
}
