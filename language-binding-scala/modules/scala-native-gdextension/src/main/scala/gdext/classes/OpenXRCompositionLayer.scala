package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRCompositionLayer`, extends `Node3D`. */
abstract class OpenXRCompositionLayer extends Node3D {
  override def godotClassName: String = "OpenXRCompositionLayer"

  /** OpenXRCompositionLayer.set_layer_viewport */
  final def setLayerViewport(viewport: SubViewport): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_layer_viewport == null) gdext.classes.OpenXRCompositionLayer.mb_set_layer_viewport = MethodBind.get("OpenXRCompositionLayer", "set_layer_viewport", 3888077664L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_layer_viewport, livePtr, Wrappers.handle(viewport))
  }

  /** OpenXRCompositionLayer.get_layer_viewport */
  final def getLayerViewport(): SubViewport = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_layer_viewport == null) gdext.classes.OpenXRCompositionLayer.mb_get_layer_viewport = MethodBind.get("OpenXRCompositionLayer", "get_layer_viewport", 3750751911L)
    Wrappers.borrowed[SubViewport](Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_layer_viewport, livePtr))
  }

  /** OpenXRCompositionLayer.set_use_android_surface */
  final def setUseAndroidSurface(enable: Boolean): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_use_android_surface == null) gdext.classes.OpenXRCompositionLayer.mb_set_use_android_surface = MethodBind.get("OpenXRCompositionLayer", "set_use_android_surface", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_use_android_surface, livePtr, enable)
  }

  /** OpenXRCompositionLayer.get_use_android_surface */
  final def getUseAndroidSurface(): Boolean = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_use_android_surface == null) gdext.classes.OpenXRCompositionLayer.mb_get_use_android_surface = MethodBind.get("OpenXRCompositionLayer", "get_use_android_surface", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRCompositionLayer.mb_get_use_android_surface, livePtr)
  }

  /** OpenXRCompositionLayer.set_android_surface_size */
  final def setAndroidSurfaceSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_android_surface_size == null) gdext.classes.OpenXRCompositionLayer.mb_set_android_surface_size = MethodBind.get("OpenXRCompositionLayer", "set_android_surface_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_android_surface_size, livePtr, size)
  }

  /** OpenXRCompositionLayer.get_android_surface_size */
  final def getAndroidSurfaceSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_android_surface_size == null) gdext.classes.OpenXRCompositionLayer.mb_get_android_surface_size = MethodBind.get("OpenXRCompositionLayer", "get_android_surface_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.OpenXRCompositionLayer.mb_get_android_surface_size, livePtr)
  }

  /** OpenXRCompositionLayer.set_enable_hole_punch */
  final def setEnableHolePunch(enable: Boolean): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_enable_hole_punch == null) gdext.classes.OpenXRCompositionLayer.mb_set_enable_hole_punch = MethodBind.get("OpenXRCompositionLayer", "set_enable_hole_punch", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_enable_hole_punch, livePtr, enable)
  }

  /** OpenXRCompositionLayer.get_enable_hole_punch */
  final def getEnableHolePunch(): Boolean = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_enable_hole_punch == null) gdext.classes.OpenXRCompositionLayer.mb_get_enable_hole_punch = MethodBind.get("OpenXRCompositionLayer", "get_enable_hole_punch", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRCompositionLayer.mb_get_enable_hole_punch, livePtr)
  }

  /** OpenXRCompositionLayer.set_sort_order */
  final def setSortOrder(order: Long): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_sort_order == null) gdext.classes.OpenXRCompositionLayer.mb_set_sort_order = MethodBind.get("OpenXRCompositionLayer", "set_sort_order", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_sort_order, livePtr, order)
  }

  /** OpenXRCompositionLayer.get_sort_order */
  final def getSortOrder(): Long = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_sort_order == null) gdext.classes.OpenXRCompositionLayer.mb_get_sort_order = MethodBind.get("OpenXRCompositionLayer", "get_sort_order", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_sort_order, livePtr)
  }

  /** OpenXRCompositionLayer.set_alpha_blend */
  final def setAlphaBlend(enabled: Boolean): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_alpha_blend == null) gdext.classes.OpenXRCompositionLayer.mb_set_alpha_blend = MethodBind.get("OpenXRCompositionLayer", "set_alpha_blend", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_alpha_blend, livePtr, enabled)
  }

  /** OpenXRCompositionLayer.get_alpha_blend */
  final def getAlphaBlend(): Boolean = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_alpha_blend == null) gdext.classes.OpenXRCompositionLayer.mb_get_alpha_blend = MethodBind.get("OpenXRCompositionLayer", "get_alpha_blend", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRCompositionLayer.mb_get_alpha_blend, livePtr)
  }

  /** OpenXRCompositionLayer.get_android_surface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAndroidSurface(): JavaObject = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_android_surface == null) gdext.classes.OpenXRCompositionLayer.mb_get_android_surface = MethodBind.get("OpenXRCompositionLayer", "get_android_surface", 3277089691L)
    Wrappers.owned[JavaObject](Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_android_surface, livePtr))
  }

  /** OpenXRCompositionLayer.is_natively_supported */
  final def isNativelySupported(): Boolean = {
    if (gdext.classes.OpenXRCompositionLayer.mb_is_natively_supported == null) gdext.classes.OpenXRCompositionLayer.mb_is_natively_supported = MethodBind.get("OpenXRCompositionLayer", "is_natively_supported", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRCompositionLayer.mb_is_natively_supported, livePtr)
  }

  /** OpenXRCompositionLayer.is_protected_content */
  final def isProtectedContent(): Boolean = {
    if (gdext.classes.OpenXRCompositionLayer.mb_is_protected_content == null) gdext.classes.OpenXRCompositionLayer.mb_is_protected_content = MethodBind.get("OpenXRCompositionLayer", "is_protected_content", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRCompositionLayer.mb_is_protected_content, livePtr)
  }

  /** OpenXRCompositionLayer.set_protected_content */
  final def setProtectedContent(protectedContent: Boolean): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_protected_content == null) gdext.classes.OpenXRCompositionLayer.mb_set_protected_content = MethodBind.get("OpenXRCompositionLayer", "set_protected_content", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_protected_content, livePtr, protectedContent)
  }

  /** OpenXRCompositionLayer.set_min_filter */
  final def setMinFilter(mode: gdext.classes.OpenXRCompositionLayer.Filter): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_min_filter == null) gdext.classes.OpenXRCompositionLayer.mb_set_min_filter = MethodBind.get("OpenXRCompositionLayer", "set_min_filter", 3653437593L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_min_filter, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_min_filter */
  final def getMinFilter(): gdext.classes.OpenXRCompositionLayer.Filter = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_min_filter == null) gdext.classes.OpenXRCompositionLayer.mb_get_min_filter = MethodBind.get("OpenXRCompositionLayer", "get_min_filter", 845677307L)
    gdext.classes.OpenXRCompositionLayer.Filter(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_min_filter, livePtr))
  }

  /** OpenXRCompositionLayer.set_mag_filter */
  final def setMagFilter(mode: gdext.classes.OpenXRCompositionLayer.Filter): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_mag_filter == null) gdext.classes.OpenXRCompositionLayer.mb_set_mag_filter = MethodBind.get("OpenXRCompositionLayer", "set_mag_filter", 3653437593L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_mag_filter, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_mag_filter */
  final def getMagFilter(): gdext.classes.OpenXRCompositionLayer.Filter = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_mag_filter == null) gdext.classes.OpenXRCompositionLayer.mb_get_mag_filter = MethodBind.get("OpenXRCompositionLayer", "get_mag_filter", 845677307L)
    gdext.classes.OpenXRCompositionLayer.Filter(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_mag_filter, livePtr))
  }

  /** OpenXRCompositionLayer.set_mipmap_mode */
  final def setMipmapMode(mode: gdext.classes.OpenXRCompositionLayer.MipmapMode): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_mipmap_mode == null) gdext.classes.OpenXRCompositionLayer.mb_set_mipmap_mode = MethodBind.get("OpenXRCompositionLayer", "set_mipmap_mode", 3271133183L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_mipmap_mode, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_mipmap_mode */
  final def getMipmapMode(): gdext.classes.OpenXRCompositionLayer.MipmapMode = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_mipmap_mode == null) gdext.classes.OpenXRCompositionLayer.mb_get_mipmap_mode = MethodBind.get("OpenXRCompositionLayer", "get_mipmap_mode", 3962697095L)
    gdext.classes.OpenXRCompositionLayer.MipmapMode(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_mipmap_mode, livePtr))
  }

  /** OpenXRCompositionLayer.set_horizontal_wrap */
  final def setHorizontalWrap(mode: gdext.classes.OpenXRCompositionLayer.Wrap): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_horizontal_wrap == null) gdext.classes.OpenXRCompositionLayer.mb_set_horizontal_wrap = MethodBind.get("OpenXRCompositionLayer", "set_horizontal_wrap", 15634990L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_horizontal_wrap, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_horizontal_wrap */
  final def getHorizontalWrap(): gdext.classes.OpenXRCompositionLayer.Wrap = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_horizontal_wrap == null) gdext.classes.OpenXRCompositionLayer.mb_get_horizontal_wrap = MethodBind.get("OpenXRCompositionLayer", "get_horizontal_wrap", 2798816834L)
    gdext.classes.OpenXRCompositionLayer.Wrap(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_horizontal_wrap, livePtr))
  }

  /** OpenXRCompositionLayer.set_vertical_wrap */
  final def setVerticalWrap(mode: gdext.classes.OpenXRCompositionLayer.Wrap): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_vertical_wrap == null) gdext.classes.OpenXRCompositionLayer.mb_set_vertical_wrap = MethodBind.get("OpenXRCompositionLayer", "set_vertical_wrap", 15634990L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_vertical_wrap, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_vertical_wrap */
  final def getVerticalWrap(): gdext.classes.OpenXRCompositionLayer.Wrap = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_vertical_wrap == null) gdext.classes.OpenXRCompositionLayer.mb_get_vertical_wrap = MethodBind.get("OpenXRCompositionLayer", "get_vertical_wrap", 2798816834L)
    gdext.classes.OpenXRCompositionLayer.Wrap(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_vertical_wrap, livePtr))
  }

  /** OpenXRCompositionLayer.set_red_swizzle */
  final def setRedSwizzle(mode: gdext.classes.OpenXRCompositionLayer.Swizzle): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_red_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_set_red_swizzle = MethodBind.get("OpenXRCompositionLayer", "set_red_swizzle", 741598951L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_red_swizzle, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_red_swizzle */
  final def getRedSwizzle(): gdext.classes.OpenXRCompositionLayer.Swizzle = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_red_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_get_red_swizzle = MethodBind.get("OpenXRCompositionLayer", "get_red_swizzle", 2334776767L)
    gdext.classes.OpenXRCompositionLayer.Swizzle(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_red_swizzle, livePtr))
  }

  /** OpenXRCompositionLayer.set_green_swizzle */
  final def setGreenSwizzle(mode: gdext.classes.OpenXRCompositionLayer.Swizzle): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_green_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_set_green_swizzle = MethodBind.get("OpenXRCompositionLayer", "set_green_swizzle", 741598951L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_green_swizzle, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_green_swizzle */
  final def getGreenSwizzle(): gdext.classes.OpenXRCompositionLayer.Swizzle = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_green_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_get_green_swizzle = MethodBind.get("OpenXRCompositionLayer", "get_green_swizzle", 2334776767L)
    gdext.classes.OpenXRCompositionLayer.Swizzle(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_green_swizzle, livePtr))
  }

  /** OpenXRCompositionLayer.set_blue_swizzle */
  final def setBlueSwizzle(mode: gdext.classes.OpenXRCompositionLayer.Swizzle): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_blue_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_set_blue_swizzle = MethodBind.get("OpenXRCompositionLayer", "set_blue_swizzle", 741598951L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_blue_swizzle, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_blue_swizzle */
  final def getBlueSwizzle(): gdext.classes.OpenXRCompositionLayer.Swizzle = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_blue_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_get_blue_swizzle = MethodBind.get("OpenXRCompositionLayer", "get_blue_swizzle", 2334776767L)
    gdext.classes.OpenXRCompositionLayer.Swizzle(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_blue_swizzle, livePtr))
  }

  /** OpenXRCompositionLayer.set_alpha_swizzle */
  final def setAlphaSwizzle(mode: gdext.classes.OpenXRCompositionLayer.Swizzle): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_alpha_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_set_alpha_swizzle = MethodBind.get("OpenXRCompositionLayer", "set_alpha_swizzle", 741598951L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_alpha_swizzle, livePtr, mode)
  }

  /** OpenXRCompositionLayer.get_alpha_swizzle */
  final def getAlphaSwizzle(): gdext.classes.OpenXRCompositionLayer.Swizzle = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_alpha_swizzle == null) gdext.classes.OpenXRCompositionLayer.mb_get_alpha_swizzle = MethodBind.get("OpenXRCompositionLayer", "get_alpha_swizzle", 2334776767L)
    gdext.classes.OpenXRCompositionLayer.Swizzle(Ptrcall.call0[Long](gdext.classes.OpenXRCompositionLayer.mb_get_alpha_swizzle, livePtr))
  }

  /** OpenXRCompositionLayer.set_max_anisotropy */
  final def setMaxAnisotropy(value: Double): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_max_anisotropy == null) gdext.classes.OpenXRCompositionLayer.mb_set_max_anisotropy = MethodBind.get("OpenXRCompositionLayer", "set_max_anisotropy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_max_anisotropy, livePtr, value)
  }

  /** OpenXRCompositionLayer.get_max_anisotropy */
  final def getMaxAnisotropy(): Double = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_max_anisotropy == null) gdext.classes.OpenXRCompositionLayer.mb_get_max_anisotropy = MethodBind.get("OpenXRCompositionLayer", "get_max_anisotropy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.OpenXRCompositionLayer.mb_get_max_anisotropy, livePtr)
  }

  /** OpenXRCompositionLayer.set_border_color */
  final def setBorderColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.OpenXRCompositionLayer.mb_set_border_color == null) gdext.classes.OpenXRCompositionLayer.mb_set_border_color = MethodBind.get("OpenXRCompositionLayer", "set_border_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayer.mb_set_border_color, livePtr, color)
  }

  /** OpenXRCompositionLayer.get_border_color */
  final def getBorderColor(): gdext.builtin.Color = {
    if (gdext.classes.OpenXRCompositionLayer.mb_get_border_color == null) gdext.classes.OpenXRCompositionLayer.mb_get_border_color = MethodBind.get("OpenXRCompositionLayer", "get_border_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.OpenXRCompositionLayer.mb_get_border_color, livePtr)
  }

  /** OpenXRCompositionLayer.intersects_ray */
  final def intersectsRay(origin: gdext.builtin.Vector3, direction: gdext.builtin.Vector3): gdext.builtin.Vector2 = {
    if (gdext.classes.OpenXRCompositionLayer.mb_intersects_ray == null) gdext.classes.OpenXRCompositionLayer.mb_intersects_ray = MethodBind.get("OpenXRCompositionLayer", "intersects_ray", 1091262597L)
    Ptrcall.call2[gdext.builtin.Vector3, gdext.builtin.Vector3, gdext.builtin.Vector2](gdext.classes.OpenXRCompositionLayer.mb_intersects_ray, livePtr, origin, direction)
  }

}

object OpenXRCompositionLayer {
  private[classes] var mb_set_layer_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_viewport: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_android_surface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_android_surface: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_android_surface_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_android_surface_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_hole_punch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_hole_punch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sort_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sort_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_blend: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_android_surface: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_natively_supported: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_protected_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_protected_content: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mag_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mipmap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mipmap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_horizontal_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_horizontal_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_wrap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_red_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_red_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_green_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_green_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blue_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blue_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_swizzle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_anisotropy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_intersects_ray: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRCompositionLayer.Filter`. */
  opaque type Filter <: Long = Long

  object Filter {
    final val Nearest: Filter = 0L.asInstanceOf[Filter]
    final val Linear: Filter = 1L.asInstanceOf[Filter]
    final val Cubic: Filter = 2L.asInstanceOf[Filter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Filter = value.asInstanceOf[Filter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Filter] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Filter]]

    extension (self: Filter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Nearest"
        case 1L => "Linear"
        case 2L => "Cubic"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRCompositionLayer.MipmapMode`. */
  opaque type MipmapMode <: Long = Long

  object MipmapMode {
    final val Disabled: MipmapMode = 0L.asInstanceOf[MipmapMode]
    final val Nearest: MipmapMode = 1L.asInstanceOf[MipmapMode]
    final val Linear: MipmapMode = 2L.asInstanceOf[MipmapMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MipmapMode = value.asInstanceOf[MipmapMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MipmapMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[MipmapMode]]

    extension (self: MipmapMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Nearest"
        case 2L => "Linear"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRCompositionLayer.Wrap`. */
  opaque type Wrap <: Long = Long

  object Wrap {
    final val ClampToBorder: Wrap = 0L.asInstanceOf[Wrap]
    final val ClampToEdge: Wrap = 1L.asInstanceOf[Wrap]
    final val Repeat: Wrap = 2L.asInstanceOf[Wrap]
    final val MirroredRepeat: Wrap = 3L.asInstanceOf[Wrap]
    final val MirrorClampToEdge: Wrap = 4L.asInstanceOf[Wrap]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Wrap = value.asInstanceOf[Wrap]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Wrap] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Wrap]]

    extension (self: Wrap)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ClampToBorder"
        case 1L => "ClampToEdge"
        case 2L => "Repeat"
        case 3L => "MirroredRepeat"
        case 4L => "MirrorClampToEdge"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRCompositionLayer.Swizzle`. */
  opaque type Swizzle <: Long = Long

  object Swizzle {
    final val Red: Swizzle = 0L.asInstanceOf[Swizzle]
    final val Green: Swizzle = 1L.asInstanceOf[Swizzle]
    final val Blue: Swizzle = 2L.asInstanceOf[Swizzle]
    final val Alpha: Swizzle = 3L.asInstanceOf[Swizzle]
    final val Zero: Swizzle = 4L.asInstanceOf[Swizzle]
    final val One: Swizzle = 5L.asInstanceOf[Swizzle]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Swizzle = value.asInstanceOf[Swizzle]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Swizzle] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[Swizzle]]

    extension (self: Swizzle)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Red"
        case 1L => "Green"
        case 2L => "Blue"
        case 3L => "Alpha"
        case 4L => "Zero"
        case 5L => "One"
        case other => other.toString
      }
  }
}
