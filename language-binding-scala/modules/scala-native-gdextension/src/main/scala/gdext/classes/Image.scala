package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def getFormat(): Long = {
    if (gdext.classes.Image.mb_get_format == null) gdext.classes.Image.mb_get_format = MethodBind.get("Image", "get_format", 3847873762L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_format, livePtr)
  }

  /** Image.get_data_size */
  final def getDataSize(): Long = {
    if (gdext.classes.Image.mb_get_data_size == null) gdext.classes.Image.mb_get_data_size = MethodBind.get("Image", "get_data_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_get_data_size, livePtr)
  }

  /** Image.convert */
  final def convert(format: Long): Unit = {
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
  final def resizeToPo2(square: Boolean, interpolation: Long): Unit = {
    if (gdext.classes.Image.mb_resize_to_po2 == null) gdext.classes.Image.mb_resize_to_po2 = MethodBind.get("Image", "resize_to_po2", 4189212329L)
    Ptrcall.callVoid2(gdext.classes.Image.mb_resize_to_po2, livePtr, square, interpolation)
  }

  /** Image.resize */
  final def resize(width: Long, height: Long, interpolation: Long): Unit = {
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
  final def generateMipmaps(renormalize: Boolean): Long = {
    if (gdext.classes.Image.mb_generate_mipmaps == null) gdext.classes.Image.mb_generate_mipmaps = MethodBind.get("Image", "generate_mipmaps", 1633102583L)
    Ptrcall.call1[Boolean, Long](gdext.classes.Image.mb_generate_mipmaps, livePtr, renormalize)
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
  final def load(path: String): Long = {
    if (gdext.classes.Image.mb_load == null) gdext.classes.Image.mb_load = MethodBind.get("Image", "load", 166001499L)
    Ptrcall.call1[String, Long](gdext.classes.Image.mb_load, livePtr, path)
  }

  /** Image.save_png */
  final def savePng(path: String): Long = {
    if (gdext.classes.Image.mb_save_png == null) gdext.classes.Image.mb_save_png = MethodBind.get("Image", "save_png", 2113323047L)
    Ptrcall.call1[String, Long](gdext.classes.Image.mb_save_png, livePtr, path)
  }

  /** Image.save_jpg */
  final def saveJpg(path: String, quality: Double): Long = {
    if (gdext.classes.Image.mb_save_jpg == null) gdext.classes.Image.mb_save_jpg = MethodBind.get("Image", "save_jpg", 2800019068L)
    Ptrcall.call2[String, Double, Long](gdext.classes.Image.mb_save_jpg, livePtr, path, quality)
  }

  /** Image.save_exr */
  final def saveExr(path: String, grayscale: Boolean): Long = {
    if (gdext.classes.Image.mb_save_exr == null) gdext.classes.Image.mb_save_exr = MethodBind.get("Image", "save_exr", 3108122999L)
    Ptrcall.call2[String, Boolean, Long](gdext.classes.Image.mb_save_exr, livePtr, path, grayscale)
  }

  /** Image.save_dds */
  final def saveDds(path: String): Long = {
    if (gdext.classes.Image.mb_save_dds == null) gdext.classes.Image.mb_save_dds = MethodBind.get("Image", "save_dds", 2113323047L)
    Ptrcall.call1[String, Long](gdext.classes.Image.mb_save_dds, livePtr, path)
  }

  /** Image.save_webp */
  final def saveWebp(path: String, lossy: Boolean, quality: Double): Long = {
    if (gdext.classes.Image.mb_save_webp == null) gdext.classes.Image.mb_save_webp = MethodBind.get("Image", "save_webp", 2781156876L)
    Ptrcall.call3[String, Boolean, Double, Long](gdext.classes.Image.mb_save_webp, livePtr, path, lossy, quality)
  }

  /** Image.detect_alpha */
  final def detectAlpha(): Long = {
    if (gdext.classes.Image.mb_detect_alpha == null) gdext.classes.Image.mb_detect_alpha = MethodBind.get("Image", "detect_alpha", 2030116505L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_detect_alpha, livePtr)
  }

  /** Image.is_invisible */
  final def isInvisible(): Boolean = {
    if (gdext.classes.Image.mb_is_invisible == null) gdext.classes.Image.mb_is_invisible = MethodBind.get("Image", "is_invisible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_is_invisible, livePtr)
  }

  /** Image.detect_used_channels */
  final def detectUsedChannels(source: Long): Long = {
    if (gdext.classes.Image.mb_detect_used_channels == null) gdext.classes.Image.mb_detect_used_channels = MethodBind.get("Image", "detect_used_channels", 2703139984L)
    Ptrcall.call1[Long, Long](gdext.classes.Image.mb_detect_used_channels, livePtr, source)
  }

  /** Image.compress */
  final def compress(mode: Long, source: Long, astc_format: Long): Long = {
    if (gdext.classes.Image.mb_compress == null) gdext.classes.Image.mb_compress = MethodBind.get("Image", "compress", 2975424957L)
    Ptrcall.call3[Long, Long, Long, Long](gdext.classes.Image.mb_compress, livePtr, mode, source, astc_format)
  }

  /** Image.compress_from_channels */
  final def compressFromChannels(mode: Long, channels: Long, astc_format: Long): Long = {
    if (gdext.classes.Image.mb_compress_from_channels == null) gdext.classes.Image.mb_compress_from_channels = MethodBind.get("Image", "compress_from_channels", 4212890953L)
    Ptrcall.call3[Long, Long, Long, Long](gdext.classes.Image.mb_compress_from_channels, livePtr, mode, channels, astc_format)
  }

  /** Image.decompress */
  final def decompress(): Long = {
    if (gdext.classes.Image.mb_decompress == null) gdext.classes.Image.mb_decompress = MethodBind.get("Image", "decompress", 166280745L)
    Ptrcall.call0[Long](gdext.classes.Image.mb_decompress, livePtr)
  }

  /** Image.is_compressed */
  final def isCompressed(): Boolean = {
    if (gdext.classes.Image.mb_is_compressed == null) gdext.classes.Image.mb_is_compressed = MethodBind.get("Image", "is_compressed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Image.mb_is_compressed, livePtr)
  }

  /** Image.rotate_90 */
  final def rotate90(direction: Long): Unit = {
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
  final def bumpMapToNormalMap(bump_scale: Double): Unit = {
    if (gdext.classes.Image.mb_bump_map_to_normal_map == null) gdext.classes.Image.mb_bump_map_to_normal_map = MethodBind.get("Image", "bump_map_to_normal_map", 3423495036L)
    Ptrcall.callVoid1(gdext.classes.Image.mb_bump_map_to_normal_map, livePtr, bump_scale)
  }

  /** Image.blit_rect */
  final def blitRect(src: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blit_rect == null) gdext.classes.Image.mb_blit_rect = MethodBind.get("Image", "blit_rect", 2903928755L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_blit_rect, livePtr, Wrappers.handle(src), src_rect, dst)
  }

  /** Image.blit_rect_mask */
  final def blitRectMask(src: Image, mask: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blit_rect_mask == null) gdext.classes.Image.mb_blit_rect_mask = MethodBind.get("Image", "blit_rect_mask", 3383581145L)
    Ptrcall.callVoid4(gdext.classes.Image.mb_blit_rect_mask, livePtr, Wrappers.handle(src), Wrappers.handle(mask), src_rect, dst)
  }

  /** Image.blend_rect */
  final def blendRect(src: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blend_rect == null) gdext.classes.Image.mb_blend_rect = MethodBind.get("Image", "blend_rect", 2903928755L)
    Ptrcall.callVoid3(gdext.classes.Image.mb_blend_rect, livePtr, Wrappers.handle(src), src_rect, dst)
  }

  /** Image.blend_rect_mask */
  final def blendRectMask(src: Image, mask: Image, src_rect: gdext.builtin.Rect2i, dst: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Image.mb_blend_rect_mask == null) gdext.classes.Image.mb_blend_rect_mask = MethodBind.get("Image", "blend_rect_mask", 3383581145L)
    Ptrcall.callVoid4(gdext.classes.Image.mb_blend_rect_mask, livePtr, Wrappers.handle(src), Wrappers.handle(mask), src_rect, dst)
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
  final def loadSvgFromString(svg_str: String, scale: Double): Long = {
    if (gdext.classes.Image.mb_load_svg_from_string == null) gdext.classes.Image.mb_load_svg_from_string = MethodBind.get("Image", "load_svg_from_string", 3254053600L)
    Ptrcall.call2[String, Double, Long](gdext.classes.Image.mb_load_svg_from_string, livePtr, svg_str, scale)
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
  final def create(width: Long, height: Long, use_mipmaps: Boolean, format: Long): Image = {
    if (gdext.classes.Image.mb_create == null) gdext.classes.Image.mb_create = MethodBind.get("Image", "create", 986942177L)
    Wrappers.owned[Image](Ptrcall.call4[Long, Long, Boolean, Long, Long](gdext.classes.Image.mb_create, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], width, height, use_mipmaps, format))
  }

  /** Image.create_empty. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createEmpty(width: Long, height: Long, use_mipmaps: Boolean, format: Long): Image = {
    if (gdext.classes.Image.mb_create_empty == null) gdext.classes.Image.mb_create_empty = MethodBind.get("Image", "create_empty", 986942177L)
    Wrappers.owned[Image](Ptrcall.call4[Long, Long, Boolean, Long, Long](gdext.classes.Image.mb_create_empty, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], width, height, use_mipmaps, format))
  }

  /** Image.load_from_file. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def loadFromFile(path: String): Image = {
    if (gdext.classes.Image.mb_load_from_file == null) gdext.classes.Image.mb_load_from_file = MethodBind.get("Image", "load_from_file", 736337515L)
    Wrappers.owned[Image](Ptrcall.call1[String, Long](gdext.classes.Image.mb_load_from_file, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], path))
  }
}
