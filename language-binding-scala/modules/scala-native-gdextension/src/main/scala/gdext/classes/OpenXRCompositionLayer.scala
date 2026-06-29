package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRCompositionLayer`, extends `Node3D`. */
abstract class OpenXRCompositionLayer extends Node3D {
  override def godotClassName: String = "OpenXRCompositionLayer"

  /** OpenXRCompositionLayer.set_layer_viewport */
  final def setLayerViewport(viewport: SubViewport): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_layer_viewport", 3888077664L), hostObject.objectPtr, viewport.hostObject)

  /** OpenXRCompositionLayer.get_layer_viewport */
  final def getLayerViewport(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRCompositionLayer", "get_layer_viewport", 3750751911L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_use_android_surface */
  final def setUseAndroidSurface(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_use_android_surface", 2586408642L), hostObject.objectPtr, enable)

  /** OpenXRCompositionLayer.get_use_android_surface */
  final def getUseAndroidSurface(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRCompositionLayer", "get_use_android_surface", 36873697L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_android_surface_size */
  final def setAndroidSurfaceSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_android_surface_size", 1130785943L), hostObject.objectPtr, size)

  /** OpenXRCompositionLayer.get_android_surface_size */
  final def getAndroidSurfaceSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("OpenXRCompositionLayer", "get_android_surface_size", 3690982128L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_enable_hole_punch */
  final def setEnableHolePunch(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_enable_hole_punch", 2586408642L), hostObject.objectPtr, enable)

  /** OpenXRCompositionLayer.get_enable_hole_punch */
  final def getEnableHolePunch(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRCompositionLayer", "get_enable_hole_punch", 36873697L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_sort_order */
  final def setSortOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_sort_order", 1286410249L), hostObject.objectPtr, order)

  /** OpenXRCompositionLayer.get_sort_order */
  final def getSortOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_sort_order", 3905245786L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_alpha_blend */
  final def setAlphaBlend(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_alpha_blend", 2586408642L), hostObject.objectPtr, enabled)

  /** OpenXRCompositionLayer.get_alpha_blend */
  final def getAlphaBlend(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRCompositionLayer", "get_alpha_blend", 36873697L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.get_android_surface */
  final def getAndroidSurface(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OpenXRCompositionLayer", "get_android_surface", 3277089691L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.is_natively_supported */
  final def isNativelySupported(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRCompositionLayer", "is_natively_supported", 36873697L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.is_protected_content */
  final def isProtectedContent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRCompositionLayer", "is_protected_content", 36873697L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_protected_content */
  final def setProtectedContent(protected_content: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_protected_content", 2586408642L), hostObject.objectPtr, protected_content)

  /** OpenXRCompositionLayer.set_min_filter */
  final def setMinFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_min_filter", 3653437593L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_min_filter */
  final def getMinFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_min_filter", 845677307L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_mag_filter */
  final def setMagFilter(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_mag_filter", 3653437593L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_mag_filter */
  final def getMagFilter(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_mag_filter", 845677307L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_mipmap_mode */
  final def setMipmapMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_mipmap_mode", 3271133183L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_mipmap_mode */
  final def getMipmapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_mipmap_mode", 3962697095L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_horizontal_wrap */
  final def setHorizontalWrap(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_horizontal_wrap", 15634990L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_horizontal_wrap */
  final def getHorizontalWrap(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_horizontal_wrap", 2798816834L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_vertical_wrap */
  final def setVerticalWrap(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_vertical_wrap", 15634990L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_vertical_wrap */
  final def getVerticalWrap(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_vertical_wrap", 2798816834L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_red_swizzle */
  final def setRedSwizzle(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_red_swizzle", 741598951L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_red_swizzle */
  final def getRedSwizzle(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_red_swizzle", 2334776767L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_green_swizzle */
  final def setGreenSwizzle(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_green_swizzle", 741598951L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_green_swizzle */
  final def getGreenSwizzle(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_green_swizzle", 2334776767L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_blue_swizzle */
  final def setBlueSwizzle(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_blue_swizzle", 741598951L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_blue_swizzle */
  final def getBlueSwizzle(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_blue_swizzle", 2334776767L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_alpha_swizzle */
  final def setAlphaSwizzle(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_alpha_swizzle", 741598951L), hostObject.objectPtr, mode)

  /** OpenXRCompositionLayer.get_alpha_swizzle */
  final def getAlphaSwizzle(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRCompositionLayer", "get_alpha_swizzle", 2334776767L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_max_anisotropy */
  final def setMaxAnisotropy(value: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_max_anisotropy", 373806689L), hostObject.objectPtr, value)

  /** OpenXRCompositionLayer.get_max_anisotropy */
  final def getMaxAnisotropy(): Double =
    Ptrcall.call0[Double](MethodBind.get("OpenXRCompositionLayer", "get_max_anisotropy", 1740695150L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayer", "set_border_color", 2920490490L), hostObject.objectPtr, color)

  /** OpenXRCompositionLayer.get_border_color */
  final def getBorderColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("OpenXRCompositionLayer", "get_border_color", 3444240500L), hostObject.objectPtr)

  /** OpenXRCompositionLayer.intersects_ray */
  final def intersectsRay(origin: gdext.builtin.Vector3, direction: gdext.builtin.Vector3): gdext.builtin.Vector2 =
    Ptrcall.call2[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector2](MethodBind.get("OpenXRCompositionLayer", "intersects_ray", 1091262597L), hostObject.objectPtr, origin, direction)

}
