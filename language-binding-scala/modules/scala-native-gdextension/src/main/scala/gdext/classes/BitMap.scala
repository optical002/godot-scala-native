package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BitMap`, extends `Resource`. */
abstract class BitMap extends Resource {

  /** BitMap.create */
  final def create(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("BitMap", "create", 1130785943L), hostObject.objectPtr, size)

  /** BitMap.create_from_image_alpha */
  final def createFromImageAlpha(image: Image, threshold: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("BitMap", "create_from_image_alpha", 106271684L), hostObject.objectPtr, image.hostObject, threshold)

  /** BitMap.set_bitv */
  final def setBitv(position: gdext.builtin.Vector2i, bit: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BitMap", "set_bitv", 4153096796L), hostObject.objectPtr, position, bit)

  /** BitMap.set_bit */
  final def setBit(x: Long, y: Long, bit: Boolean): Unit =
    Ptrcall.callVoid3(MethodBind.get("BitMap", "set_bit", 1383440665L), hostObject.objectPtr, x, y, bit)

  /** BitMap.get_bitv */
  final def getBitv(position: gdext.builtin.Vector2i): Boolean =
    Ptrcall.call1[gdext.builtin.Vector2i, Boolean](MethodBind.get("BitMap", "get_bitv", 3900751641L), hostObject.objectPtr, position)

  /** BitMap.get_bit */
  final def getBit(x: Long, y: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("BitMap", "get_bit", 2522259332L), hostObject.objectPtr, x, y)

  /** BitMap.set_bit_rect */
  final def setBitRect(rect: gdext.builtin.Rect2i, bit: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("BitMap", "set_bit_rect", 472162941L), hostObject.objectPtr, rect, bit)

  /** BitMap.get_true_bit_count */
  final def getTrueBitCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("BitMap", "get_true_bit_count", 3905245786L), hostObject.objectPtr)

  /** BitMap.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("BitMap", "get_size", 3690982128L), hostObject.objectPtr)

  /** BitMap.resize */
  final def resize(new_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("BitMap", "resize", 1130785943L), hostObject.objectPtr, new_size)

  /** BitMap.grow_mask */
  final def growMask(pixels: Long, rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("BitMap", "grow_mask", 3317281434L), hostObject.objectPtr, pixels, rect)

  /** BitMap.convert_to_image */
  final def convertToImage(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("BitMap", "convert_to_image", 4190603485L), hostObject.objectPtr)

}

object BitMap {
  /** Class metadata for Gd[BitMap] lifetime management and casting. */
  given GodotClass[BitMap] with {
    def className = "BitMap"
    def isRefCounted = true
    def wrap(o: GodotObject): BitMap = new BitMap {}.withHost(o.objectPtr)
    def unwrap(t: BitMap): GodotObject = t.hostObject
  }
}
