package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SpriteBase3D`, extends `GeometryInstance3D`. */
abstract class SpriteBase3D extends GeometryInstance3D {
  override def godotClassName: String = "SpriteBase3D"

  /** SpriteBase3D.set_centered */
  final def setCentered(centered: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_centered", 2586408642L), hostObject.objectPtr, centered)

  /** SpriteBase3D.is_centered */
  final def isCentered(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpriteBase3D", "is_centered", 36873697L), hostObject.objectPtr)

  /** SpriteBase3D.set_offset */
  final def setOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_offset", 743155724L), hostObject.objectPtr, offset)

  /** SpriteBase3D.get_offset */
  final def getOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("SpriteBase3D", "get_offset", 3341600327L), hostObject.objectPtr)

  /** SpriteBase3D.set_flip_h */
  final def setFlipH(flip_h: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_flip_h", 2586408642L), hostObject.objectPtr, flip_h)

  /** SpriteBase3D.is_flipped_h */
  final def isFlippedH(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpriteBase3D", "is_flipped_h", 36873697L), hostObject.objectPtr)

  /** SpriteBase3D.set_flip_v */
  final def setFlipV(flip_v: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_flip_v", 2586408642L), hostObject.objectPtr, flip_v)

  /** SpriteBase3D.is_flipped_v */
  final def isFlippedV(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpriteBase3D", "is_flipped_v", 36873697L), hostObject.objectPtr)

  /** SpriteBase3D.set_modulate */
  final def setModulate(modulate: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_modulate", 2920490490L), hostObject.objectPtr, modulate)

  /** SpriteBase3D.get_modulate */
  final def getModulate(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("SpriteBase3D", "get_modulate", 3444240500L), hostObject.objectPtr)

  /** SpriteBase3D.set_render_priority */
  final def setRenderPriority(priority: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_render_priority", 1286410249L), hostObject.objectPtr, priority)

  /** SpriteBase3D.get_render_priority */
  final def getRenderPriority(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_render_priority", 3905245786L), hostObject.objectPtr)

  /** SpriteBase3D.set_pixel_size */
  final def setPixelSize(pixel_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_pixel_size", 373806689L), hostObject.objectPtr, pixel_size)

  /** SpriteBase3D.get_pixel_size */
  final def getPixelSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpriteBase3D", "get_pixel_size", 1740695150L), hostObject.objectPtr)

  /** SpriteBase3D.set_axis */
  final def setAxis(axis: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_axis", 1144690656L), hostObject.objectPtr, axis)

  /** SpriteBase3D.get_axis */
  final def getAxis(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_axis", 3050976882L), hostObject.objectPtr)

  /** SpriteBase3D.set_draw_flag */
  final def setDrawFlag(flag: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteBase3D", "set_draw_flag", 1135633219L), hostObject.objectPtr, flag, enabled)

  /** SpriteBase3D.get_draw_flag */
  final def getDrawFlag(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SpriteBase3D", "get_draw_flag", 1733036628L), hostObject.objectPtr, flag)

  /** SpriteBase3D.set_alpha_cut_mode */
  final def setAlphaCutMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_alpha_cut_mode", 227561226L), hostObject.objectPtr, mode)

  /** SpriteBase3D.get_alpha_cut_mode */
  final def getAlphaCutMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_alpha_cut_mode", 336003791L), hostObject.objectPtr)

  /** SpriteBase3D.set_alpha_scissor_threshold */
  final def setAlphaScissorThreshold(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_alpha_scissor_threshold", 373806689L), hostObject.objectPtr, threshold)

  /** SpriteBase3D.get_alpha_scissor_threshold */
  final def getAlphaScissorThreshold(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpriteBase3D", "get_alpha_scissor_threshold", 1740695150L), hostObject.objectPtr)

  /** SpriteBase3D.set_alpha_hash_scale */
  final def setAlphaHashScale(threshold: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_alpha_hash_scale", 373806689L), hostObject.objectPtr, threshold)

  /** SpriteBase3D.get_alpha_hash_scale */
  final def getAlphaHashScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpriteBase3D", "get_alpha_hash_scale", 1740695150L), hostObject.objectPtr)

  /** SpriteBase3D.set_alpha_antialiasing */
  final def setAlphaAntialiasing(alpha_aa: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_alpha_antialiasing", 3212649852L), hostObject.objectPtr, alpha_aa)

  /** SpriteBase3D.get_alpha_antialiasing */
  final def getAlphaAntialiasing(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_alpha_antialiasing", 2889939400L), hostObject.objectPtr)

  /** SpriteBase3D.set_alpha_antialiasing_edge */
  final def setAlphaAntialiasingEdge(edge: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_alpha_antialiasing_edge", 373806689L), hostObject.objectPtr, edge)

  /** SpriteBase3D.get_alpha_antialiasing_edge */
  final def getAlphaAntialiasingEdge(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpriteBase3D", "get_alpha_antialiasing_edge", 1740695150L), hostObject.objectPtr)

  /** SpriteBase3D.set_billboard_mode */
  final def setBillboardMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_billboard_mode", 4202036497L), hostObject.objectPtr, mode)

  /** SpriteBase3D.get_billboard_mode */
  final def getBillboardMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_billboard_mode", 1283840139L), hostObject.objectPtr)

  /** SpriteBase3D.set_texture_filter */
  final def setTextureFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteBase3D", "set_texture_filter", 22904437L), hostObject.objectPtr, mode)

  /** SpriteBase3D.get_texture_filter */
  final def getTextureFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("SpriteBase3D", "get_texture_filter", 3289213076L), hostObject.objectPtr)

  /** SpriteBase3D.get_item_rect */
  final def getItemRect(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("SpriteBase3D", "get_item_rect", 1639390495L), hostObject.objectPtr)

  /** SpriteBase3D.generate_triangle_mesh */
  final def generateTriangleMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SpriteBase3D", "generate_triangle_mesh", 3476533166L), hostObject.objectPtr)

}
