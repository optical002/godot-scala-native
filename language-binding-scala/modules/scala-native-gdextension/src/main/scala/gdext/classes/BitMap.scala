package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BitMap`, extends `Resource`. */
abstract class BitMap extends Resource {
  override def godotClassName: String = "BitMap"

  /** BitMap.create */
  final def create(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.BitMap.mb_create == null) gdext.classes.BitMap.mb_create = MethodBind.get("BitMap", "create", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.BitMap.mb_create, livePtr, size)
  }

  /** BitMap.create_from_image_alpha */
  final def createFromImageAlpha(image: Image, threshold: Double): Unit = {
    if (gdext.classes.BitMap.mb_create_from_image_alpha == null) gdext.classes.BitMap.mb_create_from_image_alpha = MethodBind.get("BitMap", "create_from_image_alpha", 106271684L)
    Ptrcall.callVoid2(gdext.classes.BitMap.mb_create_from_image_alpha, livePtr, Wrappers.handle(image), threshold)
  }

  /** BitMap.set_bitv */
  final def setBitv(position: gdext.builtin.Vector2i, bit: Boolean): Unit = {
    if (gdext.classes.BitMap.mb_set_bitv == null) gdext.classes.BitMap.mb_set_bitv = MethodBind.get("BitMap", "set_bitv", 4153096796L)
    Ptrcall.callVoid2(gdext.classes.BitMap.mb_set_bitv, livePtr, position, bit)
  }

  /** BitMap.set_bit */
  final def setBit(x: Long, y: Long, bit: Boolean): Unit = {
    if (gdext.classes.BitMap.mb_set_bit == null) gdext.classes.BitMap.mb_set_bit = MethodBind.get("BitMap", "set_bit", 1383440665L)
    Ptrcall.callVoid3(gdext.classes.BitMap.mb_set_bit, livePtr, x, y, bit)
  }

  /** BitMap.get_bitv */
  final def getBitv(position: gdext.builtin.Vector2i): Boolean = {
    if (gdext.classes.BitMap.mb_get_bitv == null) gdext.classes.BitMap.mb_get_bitv = MethodBind.get("BitMap", "get_bitv", 3900751641L)
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](gdext.classes.BitMap.mb_get_bitv, livePtr, position)
  }

  /** BitMap.get_bit */
  final def getBit(x: Long, y: Long): Boolean = {
    if (gdext.classes.BitMap.mb_get_bit == null) gdext.classes.BitMap.mb_get_bit = MethodBind.get("BitMap", "get_bit", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.BitMap.mb_get_bit, livePtr, x, y)
  }

  /** BitMap.set_bit_rect */
  final def setBitRect(rect: gdext.builtin.Rect2i, bit: Boolean): Unit = {
    if (gdext.classes.BitMap.mb_set_bit_rect == null) gdext.classes.BitMap.mb_set_bit_rect = MethodBind.get("BitMap", "set_bit_rect", 472162941L)
    Ptrcall.callVoid2(gdext.classes.BitMap.mb_set_bit_rect, livePtr, rect, bit)
  }

  /** BitMap.get_true_bit_count */
  final def getTrueBitCount(): Long = {
    if (gdext.classes.BitMap.mb_get_true_bit_count == null) gdext.classes.BitMap.mb_get_true_bit_count = MethodBind.get("BitMap", "get_true_bit_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BitMap.mb_get_true_bit_count, livePtr)
  }

  /** BitMap.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.BitMap.mb_get_size == null) gdext.classes.BitMap.mb_get_size = MethodBind.get("BitMap", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.BitMap.mb_get_size, livePtr)
  }

  /** BitMap.resize */
  final def resize(new_size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.BitMap.mb_resize == null) gdext.classes.BitMap.mb_resize = MethodBind.get("BitMap", "resize", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.BitMap.mb_resize, livePtr, new_size)
  }

  /** BitMap.grow_mask */
  final def growMask(pixels: Long, rect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.BitMap.mb_grow_mask == null) gdext.classes.BitMap.mb_grow_mask = MethodBind.get("BitMap", "grow_mask", 3317281434L)
    Ptrcall.callVoid2(gdext.classes.BitMap.mb_grow_mask, livePtr, pixels, rect)
  }

  /** BitMap.convert_to_image. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def convertToImage(): Image = {
    if (gdext.classes.BitMap.mb_convert_to_image == null) gdext.classes.BitMap.mb_convert_to_image = MethodBind.get("BitMap", "convert_to_image", 4190603485L)
    Wrappers.owned[Image](Ptrcall.call0[Long](gdext.classes.BitMap.mb_convert_to_image, livePtr))
  }

}

object BitMap {
  private[classes] var mb_create: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_from_image_alpha: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bitv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bitv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bit_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_true_bit_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_grow_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_to_image: GDExtensionMethodBindPtr = null
}
