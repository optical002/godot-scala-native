package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Image`, extends `Resource`. */
abstract class Image extends Resource {
  override def godotClassName: String = "Image"

  /** Image.get_width */
  final def getWidth(): Long = {
    if (gdext.classes.Image.mb_get_width == null) gdext.classes.Image.mb_get_width = MethodBind.get("Image", "get_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_width, livePtr)
  }

  /** Image.get_height */
  final def getHeight(): Long = {
    if (gdext.classes.Image.mb_get_height == null) gdext.classes.Image.mb_get_height = MethodBind.get("Image", "get_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_height, livePtr)
  }

  /** Image.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.Image.mb_get_size == null) gdext.classes.Image.mb_get_size = MethodBind.get("Image", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Image.mb_get_size, livePtr)
  }

  /** Image.has_mipmaps */
  final def hasMipmaps(): Boolean = {
    if (gdext.classes.Image.mb_has_mipmaps == null) gdext.classes.Image.mb_has_mipmaps = MethodBind.get("Image", "has_mipmaps", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_has_mipmaps, livePtr)
  }

  /** Image.get_format */
  final def getFormat(): gdext.classes.Image.Format = {
    if (gdext.classes.Image.mb_get_format == null) gdext.classes.Image.mb_get_format = MethodBind.get("Image", "get_format", 3847873762L)
    gdext.classes.Image.Format(Ptrcall.call0[Long](gdext.classes.Image.mb_get_format, livePtr))
  }

  /** Image.get_data_size */
  final def getDataSize(): Long = {
    if (gdext.classes.Image.mb_get_data_size == null) gdext.classes.Image.mb_get_data_size = MethodBind.get("Image", "get_data_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_data_size, livePtr)
  }

  /** Image.convert */
  final def convert(format: gdext.classes.Image.Format): Unit = {
    if (gdext.classes.Image.mb_convert == null) gdext.classes.Image.mb_convert = MethodBind.get("Image", "convert", 2120693146L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_convert, livePtr, format)
  }

  /** Image.get_mipmap_count */
  final def getMipmapCount(): Long = {
    if (gdext.classes.Image.mb_get_mipmap_count == null) gdext.classes.Image.mb_get_mipmap_count = MethodBind.get("Image", "get_mipmap_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_mipmap_count, livePtr)
  }

  /** Image.get_mipmap_offset */
  final def getMipmapOffset(mipmap: Long): Long = {
    if (gdext.classes.Image.mb_get_mipmap_offset == null) gdext.classes.Image.mb_get_mipmap_offset = MethodBind.get("Image", "get_mipmap_offset", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.Image.mb_get_mipmap_offset, livePtr, mipmap)
  }

  /** Image.resize_to_po2 */
  final def resizeToPo2(square: Boolean = false, interpolation: gdext.classes.Image.Interpolation = gdext.classes.Image.Interpolation(1L)): Unit = {
    if (gdext.classes.Image.mb_resize_to_po2 == null) gdext.classes.Image.mb_resize_to_po2 = MethodBind.get("Image", "resize_to_po2", 4189212329L)
    Ptrcall.callVoid2(gdext.classes.Image.mb_resize_to_po2, livePtr, square, interpolation)
  }

  /** Image.resize */
  final def resize(width: Long, height: Long, interpolation: gdext.classes.Image.Interpolation = gdext.classes.Image.Interpolation(1L)): Unit = {
    if (gdext.classes.Image.mb_resize == null) gdext.classes.Image.mb_resize = MethodBind.get("Image", "resize", 994498151L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_resize, livePtr, width, height, interpolation)
  }

  /** Image.shrink_x2 */
  final def shrinkX2(): Unit = {
    if (gdext.classes.Image.mb_shrink_x2 == null) gdext.classes.Image.mb_shrink_x2 = MethodBind.get("Image", "shrink_x2", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_shrink_x2, livePtr)
  }

  /** Image.crop */
  final def crop(width: Long, height: Long): Unit = {
    if (gdext.classes.Image.mb_crop == null) gdext.classes.Image.mb_crop = MethodBind.get("Image", "crop", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.Image.mb_crop, livePtr, width, height)
  }

  /** Image.flip_x */
  final def flipX(): Unit = {
    if (gdext.classes.Image.mb_flip_x == null) gdext.classes.Image.mb_flip_x = MethodBind.get("Image", "flip_x", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_flip_x, livePtr)
  }

  /** Image.flip_y */
  final def flipY(): Unit = {
    if (gdext.classes.Image.mb_flip_y == null) gdext.classes.Image.mb_flip_y = MethodBind.get("Image", "flip_y", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_flip_y, livePtr)
  }

  /** Image.generate_mipmaps */
  final def generateMipmaps(renormalize: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.Image.mb_generate_mipmaps == null) gdext.classes.Image.mb_generate_mipmaps = MethodBind.get("Image", "generate_mipmaps", 1633102583L)
    gdext.classes.Error(Ptrcall.call1[Boolean, Long](gdext.classes.Image.mb_generate_mipmaps, livePtr, renormalize))
  }

  /** Image.clear_mipmaps */
  final def clearMipmaps(): Unit = {
    if (gdext.classes.Image.mb_clear_mipmaps == null) gdext.classes.Image.mb_clear_mipmaps = MethodBind.get("Image", "clear_mipmaps", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_clear_mipmaps, livePtr)
  }

  /** Image.is_empty */
  final def isEmpty(): Boolean = {
    if (gdext.classes.Image.mb_is_empty == null) gdext.classes.Image.mb_is_empty = MethodBind.get("Image", "is_empty", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_is_empty, livePtr)
  }

  /** Image.load */
  final def load(path: String): gdext.classes.Error = {
    if (gdext.classes.Image.mb_load == null) gdext.classes.Image.mb_load = MethodBind.get("Image", "load", 166001499L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.Image.mb_load, livePtr, path))
  }

  /** Image.save_png */
  final def savePng(path: String): gdext.classes.Error = {
    if (gdext.classes.Image.mb_save_png == null) gdext.classes.Image.mb_save_png = MethodBind.get("Image", "save_png", 2113323047L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.Image.mb_save_png, livePtr, path))
  }

  /** Image.save_jpg */
  final def saveJpg(path: String, quality: Double = 0.75): gdext.classes.Error = {
    if (gdext.classes.Image.mb_save_jpg == null) gdext.classes.Image.mb_save_jpg = MethodBind.get("Image", "save_jpg", 2800019068L)
    gdext.classes.Error(Ptrcall.call2[String, Double, Long](gdext.classes.Image.mb_save_jpg, livePtr, path, quality))
  }

  /** Image.save_exr */
  final def saveExr(path: String, grayscale: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.Image.mb_save_exr == null) gdext.classes.Image.mb_save_exr = MethodBind.get("Image", "save_exr", 3108122999L)
    gdext.classes.Error(Ptrcall.call2[String, Boolean, Long](gdext.classes.Image.mb_save_exr, livePtr, path, grayscale))
  }

  /** Image.save_dds */
  final def saveDds(path: String): gdext.classes.Error = {
    if (gdext.classes.Image.mb_save_dds == null) gdext.classes.Image.mb_save_dds = MethodBind.get("Image", "save_dds", 2113323047L)
    gdext.classes.Error(Ptrcall.call1[String, Long](gdext.classes.Image.mb_save_dds, livePtr, path))
  }

  /** Image.save_webp */
  final def saveWebp(path: String, lossy: Boolean = false, quality: Double = 0.75): gdext.classes.Error = {
    if (gdext.classes.Image.mb_save_webp == null) gdext.classes.Image.mb_save_webp = MethodBind.get("Image", "save_webp", 2781156876L)
    gdext.classes.Error(Ptrcall.call3[String, Boolean, Double, Long](gdext.classes.Image.mb_save_webp, livePtr, path, lossy, quality))
  }

  /** Image.detect_alpha */
  final def detectAlpha(): gdext.classes.Image.AlphaMode = {
    if (gdext.classes.Image.mb_detect_alpha == null) gdext.classes.Image.mb_detect_alpha = MethodBind.get("Image", "detect_alpha", 2030116505L)
    gdext.classes.Image.AlphaMode(Ptrcall.call0[Long](gdext.classes.Image.mb_detect_alpha, livePtr))
  }

  /** Image.is_invisible */
  final def isInvisible(): Boolean = {
    if (gdext.classes.Image.mb_is_invisible == null) gdext.classes.Image.mb_is_invisible = MethodBind.get("Image", "is_invisible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_is_invisible, livePtr)
  }

  /** Image.detect_used_channels */
  final def detectUsedChannels(source: gdext.classes.Image.CompressSource = gdext.classes.Image.CompressSource(0L)): gdext.classes.Image.UsedChannels = {
    if (gdext.classes.Image.mb_detect_used_channels == null) gdext.classes.Image.mb_detect_used_channels = MethodBind.get("Image", "detect_used_channels", 2703139984L)
    gdext.classes.Image.UsedChannels(Ptrcall.call1[Long, Long](gdext.classes.Image.mb_detect_used_channels, livePtr, source))
  }

  /** Image.compress */
  final def compress(mode: gdext.classes.Image.CompressMode, source: gdext.classes.Image.CompressSource = gdext.classes.Image.CompressSource(0L), astcFormat: gdext.classes.Image.ASTCFormat = gdext.classes.Image.ASTCFormat(0L)): gdext.classes.Error = {
    if (gdext.classes.Image.mb_compress == null) gdext.classes.Image.mb_compress = MethodBind.get("Image", "compress", 2975424957L)
    gdext.classes.Error(Ptrcall.call3[Long, Long, Long, Long](gdext.classes.Image.mb_compress, livePtr, mode, source, astcFormat))
  }

  /** Image.compress_from_channels */
  final def compressFromChannels(mode: gdext.classes.Image.CompressMode, channels: gdext.classes.Image.UsedChannels, astcFormat: gdext.classes.Image.ASTCFormat = gdext.classes.Image.ASTCFormat(0L)): gdext.classes.Error = {
    if (gdext.classes.Image.mb_compress_from_channels == null) gdext.classes.Image.mb_compress_from_channels = MethodBind.get("Image", "compress_from_channels", 4212890953L)
    gdext.classes.Error(Ptrcall.call3[Long, Long, Long, Long](gdext.classes.Image.mb_compress_from_channels, livePtr, mode, channels, astcFormat))
  }

  /** Image.decompress */
  final def decompress(): gdext.classes.Error = {
    if (gdext.classes.Image.mb_decompress == null) gdext.classes.Image.mb_decompress = MethodBind.get("Image", "decompress", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.Image.mb_decompress, livePtr))
  }

  /** Image.is_compressed */
  final def isCompressed(): Boolean = {
    if (gdext.classes.Image.mb_is_compressed == null) gdext.classes.Image.mb_is_compressed = MethodBind.get("Image", "is_compressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_is_compressed, livePtr)
  }

  /** Image.rotate_90 */
  final def rotate90(direction: gdext.classes.ClockDirection): Unit = {
    if (gdext.classes.Image.mb_rotate_90 == null) gdext.classes.Image.mb_rotate_90 = MethodBind.get("Image", "rotate_90", 1901204267L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_rotate_90, livePtr, direction)
  }

  /** Image.rotate_180 */
  final def rotate180(): Unit = {
    if (gdext.classes.Image.mb_rotate_180 == null) gdext.classes.Image.mb_rotate_180 = MethodBind.get("Image", "rotate_180", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_rotate_180, livePtr)
  }

  /** Image.fix_alpha_edges */
  final def fixAlphaEdges(): Unit = {
    if (gdext.classes.Image.mb_fix_alpha_edges == null) gdext.classes.Image.mb_fix_alpha_edges = MethodBind.get("Image", "fix_alpha_edges", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_fix_alpha_edges, livePtr)
  }

  /** Image.premultiply_alpha */
  final def premultiplyAlpha(): Unit = {
    if (gdext.classes.Image.mb_premultiply_alpha == null) gdext.classes.Image.mb_premultiply_alpha = MethodBind.get("Image", "premultiply_alpha", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_premultiply_alpha, livePtr)
  }

  /** Image.srgb_to_linear */
  final def srgbToLinear(): Unit = {
    if (gdext.classes.Image.mb_srgb_to_linear == null) gdext.classes.Image.mb_srgb_to_linear = MethodBind.get("Image", "srgb_to_linear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_srgb_to_linear, livePtr)
  }

  /** Image.linear_to_srgb */
  final def linearToSrgb(): Unit = {
    if (gdext.classes.Image.mb_linear_to_srgb == null) gdext.classes.Image.mb_linear_to_srgb = MethodBind.get("Image", "linear_to_srgb", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_linear_to_srgb, livePtr)
  }

  /** Image.normal_map_to_xy */
  final def normalMapToXy(): Unit = {
    if (gdext.classes.Image.mb_normal_map_to_xy == null) gdext.classes.Image.mb_normal_map_to_xy = MethodBind.get("Image", "normal_map_to_xy", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Image.mb_normal_map_to_xy, livePtr)
  }

  /** Image.rgbe_to_srgb. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def rgbeToSrgb(): Image = {
    if (gdext.classes.Image.mb_rgbe_to_srgb == null) gdext.classes.Image.mb_rgbe_to_srgb = MethodBind.get("Image", "rgbe_to_srgb", 564927088L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.Image.mb_rgbe_to_srgb, livePtr))
  }

  /** Image.bump_map_to_normal_map */
  final def bumpMapToNormalMap(bumpScale: Double = 1.0): Unit = {
    if (gdext.classes.Image.mb_bump_map_to_normal_map == null) gdext.classes.Image.mb_bump_map_to_normal_map = MethodBind.get("Image", "bump_map_to_normal_map", 3423495036L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_bump_map_to_normal_map, livePtr, bumpScale)
  }

  /** Image.blit_rect */
  final def blitRect(src: Image, srcRect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blit_rect == null) gdext.classes.Image.mb_blit_rect = MethodBind.get("Image", "blit_rect", 2903928755L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_blit_rect, livePtr, Wrappers.handle(src), srcRect, dst)
  }

  /** Image.blit_rect_mask */
  final def blitRectMask(src: Image, mask: Image, srcRect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blit_rect_mask == null) gdext.classes.Image.mb_blit_rect_mask = MethodBind.get("Image", "blit_rect_mask", 3383581145L)
    Ptrcall.callVoid4(gdext.classes.Image.mb_blit_rect_mask, livePtr, Wrappers.handle(src), Wrappers.handle(mask), srcRect, dst)
  }

  /** Image.blend_rect */
  final def blendRect(src: Image, srcRect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blend_rect == null) gdext.classes.Image.mb_blend_rect = MethodBind.get("Image", "blend_rect", 2903928755L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_blend_rect, livePtr, Wrappers.handle(src), srcRect, dst)
  }

  /** Image.blend_rect_mask */
  final def blendRectMask(src: Image, mask: Image, srcRect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blend_rect_mask == null) gdext.classes.Image.mb_blend_rect_mask = MethodBind.get("Image", "blend_rect_mask", 3383581145L)
    Ptrcall.callVoid4(gdext.classes.Image.mb_blend_rect_mask, livePtr, Wrappers.handle(src), Wrappers.handle(mask), srcRect, dst)
  }

  /** Image.fill */
  final def fill(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Image.mb_fill == null) gdext.classes.Image.mb_fill = MethodBind.get("Image", "fill", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_fill, livePtr, color)
  }

  /** Image.fill_rect */
  final def fillRect(rect: gdext.builtin.Rect2i, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Image.mb_fill_rect == null) gdext.classes.Image.mb_fill_rect = MethodBind.get("Image", "fill_rect", 514693913L)
    Ptrcall.callVoid2(gdext.classes.Image.mb_fill_rect, livePtr, rect, color)
  }

  /** Image.get_used_rect */
  final def getUsedRect(): gdext.builtin.Rect2i = {
    if (gdext.classes.Image.mb_get_used_rect == null) gdext.classes.Image.mb_get_used_rect = MethodBind.get("Image", "get_used_rect", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.Image.mb_get_used_rect, livePtr)
  }

  /** Image.get_region. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getRegion(region: gdext.builtin.Rect2i): Image = {
    if (gdext.classes.Image.mb_get_region == null) gdext.classes.Image.mb_get_region = MethodBind.get("Image", "get_region", 2601441065L)
    Wrappers.owned[Image](Ptrcall.call1[gdext.builtin.Rect2i, Long](gdext.classes.Image.mb_get_region, livePtr, region))
  }

  /** Image.copy_from */
  final def copyFrom(src: Image): Unit = {
    if (gdext.classes.Image.mb_copy_from == null) gdext.classes.Image.mb_copy_from = MethodBind.get("Image", "copy_from", 532598488L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_copy_from, livePtr, Wrappers.handle(src))
  }

  /** Image.get_pixelv */
  final def getPixelv(point: gdext.builtin.Vector2i): gdext.builtin.Color = {
    if (gdext.classes.Image.mb_get_pixelv == null) gdext.classes.Image.mb_get_pixelv = MethodBind.get("Image", "get_pixelv", 1532707496L)
    Ptrcall.call1[gdext.builtin.Vector2i, gdext.builtin.Color](gdext.classes.Image.mb_get_pixelv, livePtr, point)
  }

  /** Image.get_pixel */
  final def getPixel(x: Long, y: Long): gdext.builtin.Color = {
    if (gdext.classes.Image.mb_get_pixel == null) gdext.classes.Image.mb_get_pixel = MethodBind.get("Image", "get_pixel", 2165839948L)
    Ptrcall.call2[Long, Long, gdext.builtin.Color](gdext.classes.Image.mb_get_pixel, livePtr, x, y)
  }

  /** Image.set_pixelv */
  final def setPixelv(point: gdext.builtin.Vector2i, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Image.mb_set_pixelv == null) gdext.classes.Image.mb_set_pixelv = MethodBind.get("Image", "set_pixelv", 287851464L)
    Ptrcall.callVoid2(gdext.classes.Image.mb_set_pixelv, livePtr, point, color)
  }

  /** Image.set_pixel */
  final def setPixel(x: Long, y: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Image.mb_set_pixel == null) gdext.classes.Image.mb_set_pixel = MethodBind.get("Image", "set_pixel", 3733378741L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_set_pixel, livePtr, x, y, color)
  }

  /** Image.adjust_bcs */
  final def adjustBcs(brightness: Double, contrast: Double, saturation: Double): Unit = {
    if (gdext.classes.Image.mb_adjust_bcs == null) gdext.classes.Image.mb_adjust_bcs = MethodBind.get("Image", "adjust_bcs", 2385087082L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_adjust_bcs, livePtr, brightness, contrast, saturation)
  }

  /** Image.load_svg_from_string */
  final def loadSvgFromString(svgStr: String, scale: Double = 1.0): gdext.classes.Error = {
    if (gdext.classes.Image.mb_load_svg_from_string == null) gdext.classes.Image.mb_load_svg_from_string = MethodBind.get("Image", "load_svg_from_string", 3254053600L)
    gdext.classes.Error(Ptrcall.call2[String, Double, Long](gdext.classes.Image.mb_load_svg_from_string, livePtr, svgStr, scale))
  }

}

object Image {
  private[classes] var mb_get_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_data_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mipmap_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mipmap_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_resize_to_po2: GDExtensionMethodBindPtr = null
  private[classes] var mb_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_shrink_x2: GDExtensionMethodBindPtr = null
  private[classes] var mb_crop: GDExtensionMethodBindPtr = null
  private[classes] var mb_flip_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_flip_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_mipmaps: GDExtensionMethodBindPtr = null
  private[classes] var mb_create: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_empty: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_empty: GDExtensionMethodBindPtr = null
  private[classes] var mb_load: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_from_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_png: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_jpg: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_exr: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_dds: GDExtensionMethodBindPtr = null
  private[classes] var mb_save_webp: GDExtensionMethodBindPtr = null
  private[classes] var mb_detect_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_invisible: GDExtensionMethodBindPtr = null
  private[classes] var mb_detect_used_channels: GDExtensionMethodBindPtr = null
  private[classes] var mb_compress: GDExtensionMethodBindPtr = null
  private[classes] var mb_compress_from_channels: GDExtensionMethodBindPtr = null
  private[classes] var mb_decompress: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_compressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_90: GDExtensionMethodBindPtr = null
  private[classes] var mb_rotate_180: GDExtensionMethodBindPtr = null
  private[classes] var mb_fix_alpha_edges: GDExtensionMethodBindPtr = null
  private[classes] var mb_premultiply_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_srgb_to_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_linear_to_srgb: GDExtensionMethodBindPtr = null
  private[classes] var mb_normal_map_to_xy: GDExtensionMethodBindPtr = null
  private[classes] var mb_rgbe_to_srgb: GDExtensionMethodBindPtr = null
  private[classes] var mb_bump_map_to_normal_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_blit_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_blit_rect_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_blend_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_blend_rect_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_fill: GDExtensionMethodBindPtr = null
  private[classes] var mb_fill_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_used_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_copy_from: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pixelv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pixel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pixelv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pixel: GDExtensionMethodBindPtr = null
  private[classes] var mb_adjust_bcs: GDExtensionMethodBindPtr = null
  private[classes] var mb_load_svg_from_string: GDExtensionMethodBindPtr = null

  /** Image.create. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def create(width: Long, height: Long, useMipmaps: Boolean, format: gdext.classes.Image.Format): Image = {
    if (gdext.classes.Image.mb_create == null) gdext.classes.Image.mb_create = MethodBind.get("Image", "create", 986942177L)
    Wrappers.owned[Image](Ptrcall.call4[Long, Long, Boolean, Long, Long](gdext.classes.Image.mb_create, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], width, height, useMipmaps, format))
  }

  /** Image.create_empty. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createEmpty(width: Long, height: Long, useMipmaps: Boolean, format: gdext.classes.Image.Format): Image = {
    if (gdext.classes.Image.mb_create_empty == null) gdext.classes.Image.mb_create_empty = MethodBind.get("Image", "create_empty", 986942177L)
    Wrappers.owned[Image](Ptrcall.call4[Long, Long, Boolean, Long, Long](gdext.classes.Image.mb_create_empty, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], width, height, useMipmaps, format))
  }

  /** Image.load_from_file. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadFromFile(path: String): Image = {
    if (gdext.classes.Image.mb_load_from_file == null) gdext.classes.Image.mb_load_from_file = MethodBind.get("Image", "load_from_file", 736337515L)
    Wrappers.owned[Image](Ptrcall.call1[String, Long](gdext.classes.Image.mb_load_from_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }

  /** Godot enum `Image.Format`. */
  opaque type Format <: Long = Long

  object Format {
    final val L8: Format = 0L.asInstanceOf[Format]
    final val La8: Format = 1L.asInstanceOf[Format]
    final val R8: Format = 2L.asInstanceOf[Format]
    final val Rg8: Format = 3L.asInstanceOf[Format]
    final val Rgb8: Format = 4L.asInstanceOf[Format]
    final val Rgba8: Format = 5L.asInstanceOf[Format]
    final val Rgba4444: Format = 6L.asInstanceOf[Format]
    final val Rgb565: Format = 7L.asInstanceOf[Format]
    final val Rf: Format = 8L.asInstanceOf[Format]
    final val Rgf: Format = 9L.asInstanceOf[Format]
    final val Rgbf: Format = 10L.asInstanceOf[Format]
    final val Rgbaf: Format = 11L.asInstanceOf[Format]
    final val Rh: Format = 12L.asInstanceOf[Format]
    final val Rgh: Format = 13L.asInstanceOf[Format]
    final val Rgbh: Format = 14L.asInstanceOf[Format]
    final val Rgbah: Format = 15L.asInstanceOf[Format]
    final val Rgbe9995: Format = 16L.asInstanceOf[Format]
    final val Dxt1: Format = 17L.asInstanceOf[Format]
    final val Dxt3: Format = 18L.asInstanceOf[Format]
    final val Dxt5: Format = 19L.asInstanceOf[Format]
    final val RgtcR: Format = 20L.asInstanceOf[Format]
    final val RgtcRg: Format = 21L.asInstanceOf[Format]
    final val BptcRgba: Format = 22L.asInstanceOf[Format]
    final val BptcRgbf: Format = 23L.asInstanceOf[Format]
    final val BptcRgbfu: Format = 24L.asInstanceOf[Format]
    final val Etc: Format = 25L.asInstanceOf[Format]
    final val Etc2R11: Format = 26L.asInstanceOf[Format]
    final val Etc2R11s: Format = 27L.asInstanceOf[Format]
    final val Etc2Rg11: Format = 28L.asInstanceOf[Format]
    final val Etc2Rg11s: Format = 29L.asInstanceOf[Format]
    final val Etc2Rgb8: Format = 30L.asInstanceOf[Format]
    final val Etc2Rgba8: Format = 31L.asInstanceOf[Format]
    final val Etc2Rgb8a1: Format = 32L.asInstanceOf[Format]
    final val Etc2RaAsRg: Format = 33L.asInstanceOf[Format]
    final val Dxt5RaAsRg: Format = 34L.asInstanceOf[Format]
    final val Astc4x4: Format = 35L.asInstanceOf[Format]
    final val Astc4x4Hdr: Format = 36L.asInstanceOf[Format]
    final val Astc8x8: Format = 37L.asInstanceOf[Format]
    final val Astc8x8Hdr: Format = 38L.asInstanceOf[Format]
    final val R16: Format = 39L.asInstanceOf[Format]
    final val Rg16: Format = 40L.asInstanceOf[Format]
    final val Rgb16: Format = 41L.asInstanceOf[Format]
    final val Rgba16: Format = 42L.asInstanceOf[Format]
    final val R16i: Format = 43L.asInstanceOf[Format]
    final val Rg16i: Format = 44L.asInstanceOf[Format]
    final val Rgb16i: Format = 45L.asInstanceOf[Format]
    final val Rgba16i: Format = 46L.asInstanceOf[Format]
    final val Max: Format = 47L.asInstanceOf[Format]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Format = value.asInstanceOf[Format]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Format] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L, 29L, 30L, 31L, 32L, 33L, 34L, 35L, 36L, 37L, 38L, 39L, 40L, 41L, 42L, 43L, 44L, 45L, 46L, 47L).asInstanceOf[scala.IArray[Format]]

    extension (self: Format)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "L8"
        case 1L => "La8"
        case 2L => "R8"
        case 3L => "Rg8"
        case 4L => "Rgb8"
        case 5L => "Rgba8"
        case 6L => "Rgba4444"
        case 7L => "Rgb565"
        case 8L => "Rf"
        case 9L => "Rgf"
        case 10L => "Rgbf"
        case 11L => "Rgbaf"
        case 12L => "Rh"
        case 13L => "Rgh"
        case 14L => "Rgbh"
        case 15L => "Rgbah"
        case 16L => "Rgbe9995"
        case 17L => "Dxt1"
        case 18L => "Dxt3"
        case 19L => "Dxt5"
        case 20L => "RgtcR"
        case 21L => "RgtcRg"
        case 22L => "BptcRgba"
        case 23L => "BptcRgbf"
        case 24L => "BptcRgbfu"
        case 25L => "Etc"
        case 26L => "Etc2R11"
        case 27L => "Etc2R11s"
        case 28L => "Etc2Rg11"
        case 29L => "Etc2Rg11s"
        case 30L => "Etc2Rgb8"
        case 31L => "Etc2Rgba8"
        case 32L => "Etc2Rgb8a1"
        case 33L => "Etc2RaAsRg"
        case 34L => "Dxt5RaAsRg"
        case 35L => "Astc4x4"
        case 36L => "Astc4x4Hdr"
        case 37L => "Astc8x8"
        case 38L => "Astc8x8Hdr"
        case 39L => "R16"
        case 40L => "Rg16"
        case 41L => "Rgb16"
        case 42L => "Rgba16"
        case 43L => "R16i"
        case 44L => "Rg16i"
        case 45L => "Rgb16i"
        case 46L => "Rgba16i"
        case 47L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Image.Interpolation`. */
  opaque type Interpolation <: Long = Long

  object Interpolation {
    final val Nearest: Interpolation = 0L.asInstanceOf[Interpolation]
    final val Bilinear: Interpolation = 1L.asInstanceOf[Interpolation]
    final val Cubic: Interpolation = 2L.asInstanceOf[Interpolation]
    final val Trilinear: Interpolation = 3L.asInstanceOf[Interpolation]
    final val Lanczos: Interpolation = 4L.asInstanceOf[Interpolation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Interpolation = value.asInstanceOf[Interpolation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Interpolation] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Interpolation]]

    extension (self: Interpolation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Bilinear"
        case 2L => "Cubic"
        case 3L => "Trilinear"
        case 4L => "Lanczos"
        case other => other.toString
      }
  }

  /** Godot enum `Image.AlphaMode`. */
  opaque type AlphaMode <: Long = Long

  object AlphaMode {
    final val None: AlphaMode = 0L.asInstanceOf[AlphaMode]
    final val Bit: AlphaMode = 1L.asInstanceOf[AlphaMode]
    final val Blend: AlphaMode = 2L.asInstanceOf[AlphaMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AlphaMode = value.asInstanceOf[AlphaMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AlphaMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[AlphaMode]]

    extension (self: AlphaMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Bit"
        case 2L => "Blend"
        case other => other.toString
      }
  }

  /** Godot enum `Image.CompressMode`. */
  opaque type CompressMode <: Long = Long

  object CompressMode {
    final val S3tc: CompressMode = 0L.asInstanceOf[CompressMode]
    final val Etc: CompressMode = 1L.asInstanceOf[CompressMode]
    final val Etc2: CompressMode = 2L.asInstanceOf[CompressMode]
    final val Bptc: CompressMode = 3L.asInstanceOf[CompressMode]
    final val Astc: CompressMode = 4L.asInstanceOf[CompressMode]
    final val Max: CompressMode = 5L.asInstanceOf[CompressMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressMode = value.asInstanceOf[CompressMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[CompressMode]]

    extension (self: CompressMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "S3tc"
        case 1L => "Etc"
        case 2L => "Etc2"
        case 3L => "Bptc"
        case 4L => "Astc"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Image.UsedChannels`. */
  opaque type UsedChannels <: Long = Long

  object UsedChannels {
    final val L: UsedChannels = 0L.asInstanceOf[UsedChannels]
    final val La: UsedChannels = 1L.asInstanceOf[UsedChannels]
    final val R: UsedChannels = 2L.asInstanceOf[UsedChannels]
    final val Rg: UsedChannels = 3L.asInstanceOf[UsedChannels]
    final val Rgb: UsedChannels = 4L.asInstanceOf[UsedChannels]
    final val Rgba: UsedChannels = 5L.asInstanceOf[UsedChannels]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UsedChannels = value.asInstanceOf[UsedChannels]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UsedChannels] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[UsedChannels]]

    extension (self: UsedChannels)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "L"
        case 1L => "La"
        case 2L => "R"
        case 3L => "Rg"
        case 4L => "Rgb"
        case 5L => "Rgba"
        case other => other.toString
      }
  }

  /** Godot enum `Image.CompressSource`. */
  opaque type CompressSource <: Long = Long

  object CompressSource {
    final val Generic: CompressSource = 0L.asInstanceOf[CompressSource]
    final val Srgb: CompressSource = 1L.asInstanceOf[CompressSource]
    final val Normal: CompressSource = 2L.asInstanceOf[CompressSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CompressSource = value.asInstanceOf[CompressSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CompressSource] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CompressSource]]

    extension (self: CompressSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Generic"
        case 1L => "Srgb"
        case 2L => "Normal"
        case other => other.toString
      }
  }

  /** Godot enum `Image.ASTCFormat`. */
  opaque type ASTCFormat <: Long = Long

  object ASTCFormat {
    final val Format4x4: ASTCFormat = 0L.asInstanceOf[ASTCFormat]
    final val Format8x8: ASTCFormat = 1L.asInstanceOf[ASTCFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ASTCFormat = value.asInstanceOf[ASTCFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ASTCFormat] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ASTCFormat]]

    extension (self: ASTCFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Format4x4"
        case 1L => "Format8x8"
        case other => other.toString
      }
  }
}
