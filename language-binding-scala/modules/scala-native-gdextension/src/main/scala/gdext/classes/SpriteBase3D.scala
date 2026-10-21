package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpriteBase3D`, extends `GeometryInstance3D`. */
abstract class SpriteBase3D extends GeometryInstance3D {
  override def godotClassName: String = "SpriteBase3D"

  /** SpriteBase3D.set_centered */
  final def setCentered(centered: Boolean): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_centered == null) gdext.classes.SpriteBase3D.mb_set_centered = MethodBind.get("SpriteBase3D", "set_centered", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_centered, livePtr, centered)
  }

  /** SpriteBase3D.is_centered */
  final def isCentered(): Boolean = {
    if (gdext.classes.SpriteBase3D.mb_is_centered == null) gdext.classes.SpriteBase3D.mb_is_centered = MethodBind.get("SpriteBase3D", "is_centered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpriteBase3D.mb_is_centered, livePtr)
  }

  /** SpriteBase3D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_offset == null) gdext.classes.SpriteBase3D.mb_set_offset = MethodBind.get("SpriteBase3D", "set_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_offset, livePtr, offset)
  }

  /** SpriteBase3D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.SpriteBase3D.mb_get_offset == null) gdext.classes.SpriteBase3D.mb_get_offset = MethodBind.get("SpriteBase3D", "get_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.SpriteBase3D.mb_get_offset, livePtr)
  }

  /** SpriteBase3D.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_flip_h == null) gdext.classes.SpriteBase3D.mb_set_flip_h = MethodBind.get("SpriteBase3D", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_flip_h, livePtr, flip_h)
  }

  /** SpriteBase3D.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.SpriteBase3D.mb_is_flipped_h == null) gdext.classes.SpriteBase3D.mb_is_flipped_h = MethodBind.get("SpriteBase3D", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpriteBase3D.mb_is_flipped_h, livePtr)
  }

  /** SpriteBase3D.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_flip_v == null) gdext.classes.SpriteBase3D.mb_set_flip_v = MethodBind.get("SpriteBase3D", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_flip_v, livePtr, flip_v)
  }

  /** SpriteBase3D.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.SpriteBase3D.mb_is_flipped_v == null) gdext.classes.SpriteBase3D.mb_is_flipped_v = MethodBind.get("SpriteBase3D", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SpriteBase3D.mb_is_flipped_v, livePtr)
  }

  /** SpriteBase3D.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_modulate == null) gdext.classes.SpriteBase3D.mb_set_modulate = MethodBind.get("SpriteBase3D", "set_modulate", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_modulate, livePtr, modulate)
  }

  /** SpriteBase3D.get_modulate */
  final def getModulate(): gdext.builtin.Color = {
    if (gdext.classes.SpriteBase3D.mb_get_modulate == null) gdext.classes.SpriteBase3D.mb_get_modulate = MethodBind.get("SpriteBase3D", "get_modulate", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.SpriteBase3D.mb_get_modulate, livePtr)
  }

  /** SpriteBase3D.set_render_priority */
  final def setRenderPriority(priority: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_render_priority == null) gdext.classes.SpriteBase3D.mb_set_render_priority = MethodBind.get("SpriteBase3D", "set_render_priority", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_render_priority, livePtr, priority)
  }

  /** SpriteBase3D.get_render_priority */
  final def getRenderPriority(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_render_priority == null) gdext.classes.SpriteBase3D.mb_get_render_priority = MethodBind.get("SpriteBase3D", "get_render_priority", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_render_priority, livePtr)
  }

  /** SpriteBase3D.set_pixel_size */
  final def setPixelSize(pixel_size: Double): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_pixel_size == null) gdext.classes.SpriteBase3D.mb_set_pixel_size = MethodBind.get("SpriteBase3D", "set_pixel_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_pixel_size, livePtr, pixel_size)
  }

  /** SpriteBase3D.get_pixel_size */
  final def getPixelSize(): Double = {
    if (gdext.classes.SpriteBase3D.mb_get_pixel_size == null) gdext.classes.SpriteBase3D.mb_get_pixel_size = MethodBind.get("SpriteBase3D", "get_pixel_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpriteBase3D.mb_get_pixel_size, livePtr)
  }

  /** SpriteBase3D.set_axis */
  final def setAxis(axis: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_axis == null) gdext.classes.SpriteBase3D.mb_set_axis = MethodBind.get("SpriteBase3D", "set_axis", 1144690656L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_axis, livePtr, axis)
  }

  /** SpriteBase3D.get_axis */
  final def getAxis(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_axis == null) gdext.classes.SpriteBase3D.mb_get_axis = MethodBind.get("SpriteBase3D", "get_axis", 3050976882L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_axis, livePtr)
  }

  /** SpriteBase3D.set_draw_flag */
  final def setDrawFlag(flag: Long, enabled: Boolean): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_draw_flag == null) gdext.classes.SpriteBase3D.mb_set_draw_flag = MethodBind.get("SpriteBase3D", "set_draw_flag", 1135633219L)
    Ptrcall.callVoid2(gdext.classes.SpriteBase3D.mb_set_draw_flag, livePtr, flag, enabled)
  }

  /** SpriteBase3D.get_draw_flag */
  final def getDrawFlag(flag: Long): Boolean = {
    if (gdext.classes.SpriteBase3D.mb_get_draw_flag == null) gdext.classes.SpriteBase3D.mb_get_draw_flag = MethodBind.get("SpriteBase3D", "get_draw_flag", 1733036628L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SpriteBase3D.mb_get_draw_flag, livePtr, flag)
  }

  /** SpriteBase3D.set_alpha_cut_mode */
  final def setAlphaCutMode(mode: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_alpha_cut_mode == null) gdext.classes.SpriteBase3D.mb_set_alpha_cut_mode = MethodBind.get("SpriteBase3D", "set_alpha_cut_mode", 227561226L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_alpha_cut_mode, livePtr, mode)
  }

  /** SpriteBase3D.get_alpha_cut_mode */
  final def getAlphaCutMode(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_alpha_cut_mode == null) gdext.classes.SpriteBase3D.mb_get_alpha_cut_mode = MethodBind.get("SpriteBase3D", "get_alpha_cut_mode", 336003791L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_alpha_cut_mode, livePtr)
  }

  /** SpriteBase3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_alpha_scissor_threshold == null) gdext.classes.SpriteBase3D.mb_set_alpha_scissor_threshold = MethodBind.get("SpriteBase3D", "set_alpha_scissor_threshold", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_alpha_scissor_threshold, livePtr, threshold)
  }

  /** SpriteBase3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double = {
    if (gdext.classes.SpriteBase3D.mb_get_alpha_scissor_threshold == null) gdext.classes.SpriteBase3D.mb_get_alpha_scissor_threshold = MethodBind.get("SpriteBase3D", "get_alpha_scissor_threshold", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpriteBase3D.mb_get_alpha_scissor_threshold, livePtr)
  }

  /** SpriteBase3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_alpha_hash_scale == null) gdext.classes.SpriteBase3D.mb_set_alpha_hash_scale = MethodBind.get("SpriteBase3D", "set_alpha_hash_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_alpha_hash_scale, livePtr, threshold)
  }

  /** SpriteBase3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double = {
    if (gdext.classes.SpriteBase3D.mb_get_alpha_hash_scale == null) gdext.classes.SpriteBase3D.mb_get_alpha_hash_scale = MethodBind.get("SpriteBase3D", "get_alpha_hash_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpriteBase3D.mb_get_alpha_hash_scale, livePtr)
  }

  /** SpriteBase3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing == null) gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing = MethodBind.get("SpriteBase3D", "set_alpha_antialiasing", 3212649852L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing, livePtr, alpha_aa)
  }

  /** SpriteBase3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing == null) gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing = MethodBind.get("SpriteBase3D", "get_alpha_antialiasing", 2889939400L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing, livePtr)
  }

  /** SpriteBase3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing_edge == null) gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing_edge = MethodBind.get("SpriteBase3D", "set_alpha_antialiasing_edge", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_alpha_antialiasing_edge, livePtr, edge)
  }

  /** SpriteBase3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double = {
    if (gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing_edge == null) gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing_edge = MethodBind.get("SpriteBase3D", "get_alpha_antialiasing_edge", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SpriteBase3D.mb_get_alpha_antialiasing_edge, livePtr)
  }

  /** SpriteBase3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_billboard_mode == null) gdext.classes.SpriteBase3D.mb_set_billboard_mode = MethodBind.get("SpriteBase3D", "set_billboard_mode", 4202036497L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_billboard_mode, livePtr, mode)
  }

  /** SpriteBase3D.get_billboard_mode */
  final def getBillboardMode(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_billboard_mode == null) gdext.classes.SpriteBase3D.mb_get_billboard_mode = MethodBind.get("SpriteBase3D", "get_billboard_mode", 1283840139L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_billboard_mode, livePtr)
  }

  /** SpriteBase3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit = {
    if (gdext.classes.SpriteBase3D.mb_set_texture_filter == null) gdext.classes.SpriteBase3D.mb_set_texture_filter = MethodBind.get("SpriteBase3D", "set_texture_filter", 22904437L)
    Ptrcall.callVoid1(gdext.classes.SpriteBase3D.mb_set_texture_filter, livePtr, mode)
  }

  /** SpriteBase3D.get_texture_filter */
  final def getTextureFilter(): Long = {
    if (gdext.classes.SpriteBase3D.mb_get_texture_filter == null) gdext.classes.SpriteBase3D.mb_get_texture_filter = MethodBind.get("SpriteBase3D", "get_texture_filter", 3289213076L)
    Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_get_texture_filter, livePtr)
  }

  /** SpriteBase3D.get_item_rect */
  final def getItemRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.SpriteBase3D.mb_get_item_rect == null) gdext.classes.SpriteBase3D.mb_get_item_rect = MethodBind.get("SpriteBase3D", "get_item_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.SpriteBase3D.mb_get_item_rect, livePtr)
  }

  /** SpriteBase3D.generate_triangle_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def generateTriangleMesh(): TriangleMesh = {
    if (gdext.classes.SpriteBase3D.mb_generate_triangle_mesh == null) gdext.classes.SpriteBase3D.mb_generate_triangle_mesh = MethodBind.get("SpriteBase3D", "generate_triangle_mesh", 3476533166L)
    Wrappers.owned[TriangleMesh](Ptrcall.call0[Long](gdext.classes.SpriteBase3D.mb_generate_triangle_mesh, livePtr))
  }

}

object SpriteBase3D {
  private[classes] var mb_set_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_modulate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_render_priority: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pixel_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_cut_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_cut_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_scissor_threshold: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_hash_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_antialiasing_edge: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_billboard_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_item_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_generate_triangle_mesh: GDExtensionMethodBindPtr = null
}
