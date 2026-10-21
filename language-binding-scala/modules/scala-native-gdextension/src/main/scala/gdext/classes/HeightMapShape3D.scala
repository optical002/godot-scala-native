package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HeightMapShape3D`, extends `Shape3D`. */
abstract class HeightMapShape3D extends Shape3D {
  override def godotClassName: String = "HeightMapShape3D"

  /** HeightMapShape3D.set_map_width */
  final def setMapWidth(width: Long): Unit = {
    if (gdext.classes.HeightMapShape3D.mb_set_map_width == null) gdext.classes.HeightMapShape3D.mb_set_map_width = MethodBind.get("HeightMapShape3D", "set_map_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HeightMapShape3D.mb_set_map_width, livePtr, width)
  }

  /** HeightMapShape3D.get_map_width */
  final def getMapWidth(): Long = {
    if (gdext.classes.HeightMapShape3D.mb_get_map_width == null) gdext.classes.HeightMapShape3D.mb_get_map_width = MethodBind.get("HeightMapShape3D", "get_map_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HeightMapShape3D.mb_get_map_width, livePtr)
  }

  /** HeightMapShape3D.set_map_depth */
  final def setMapDepth(height: Long): Unit = {
    if (gdext.classes.HeightMapShape3D.mb_set_map_depth == null) gdext.classes.HeightMapShape3D.mb_set_map_depth = MethodBind.get("HeightMapShape3D", "set_map_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HeightMapShape3D.mb_set_map_depth, livePtr, height)
  }

  /** HeightMapShape3D.get_map_depth */
  final def getMapDepth(): Long = {
    if (gdext.classes.HeightMapShape3D.mb_get_map_depth == null) gdext.classes.HeightMapShape3D.mb_get_map_depth = MethodBind.get("HeightMapShape3D", "get_map_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HeightMapShape3D.mb_get_map_depth, livePtr)
  }

  /** HeightMapShape3D.get_min_height */
  final def getMinHeight(): Double = {
    if (gdext.classes.HeightMapShape3D.mb_get_min_height == null) gdext.classes.HeightMapShape3D.mb_get_min_height = MethodBind.get("HeightMapShape3D", "get_min_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.HeightMapShape3D.mb_get_min_height, livePtr)
  }

  /** HeightMapShape3D.get_max_height */
  final def getMaxHeight(): Double = {
    if (gdext.classes.HeightMapShape3D.mb_get_max_height == null) gdext.classes.HeightMapShape3D.mb_get_max_height = MethodBind.get("HeightMapShape3D", "get_max_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.HeightMapShape3D.mb_get_max_height, livePtr)
  }

  /** HeightMapShape3D.update_map_data_from_image */
  final def updateMapDataFromImage(image: Image, height_min: Double, height_max: Double): Unit = {
    if (gdext.classes.HeightMapShape3D.mb_update_map_data_from_image == null) gdext.classes.HeightMapShape3D.mb_update_map_data_from_image = MethodBind.get("HeightMapShape3D", "update_map_data_from_image", 2636652979L)
    Ptrcall.callVoid3(gdext.classes.HeightMapShape3D.mb_update_map_data_from_image, livePtr, Wrappers.handle(image), height_min, height_max)
  }

}

object HeightMapShape3D {
  private[classes] var mb_set_map_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_map_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_map_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_map_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_map_data_from_image: GDExtensionMethodBindPtr = null
}
