package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CapsuleShape2D`, extends `Shape2D`. */
abstract class CapsuleShape2D extends Shape2D {
  override def godotClassName: String = "CapsuleShape2D"

  /** CapsuleShape2D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CapsuleShape2D.mb_set_radius == null) gdext.classes.CapsuleShape2D.mb_set_radius = MethodBind.get("CapsuleShape2D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape2D.mb_set_radius, livePtr, radius)
  }

  /** CapsuleShape2D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CapsuleShape2D.mb_get_radius == null) gdext.classes.CapsuleShape2D.mb_get_radius = MethodBind.get("CapsuleShape2D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape2D.mb_get_radius, livePtr)
  }

  /** CapsuleShape2D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.CapsuleShape2D.mb_set_height == null) gdext.classes.CapsuleShape2D.mb_set_height = MethodBind.get("CapsuleShape2D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape2D.mb_set_height, livePtr, height)
  }

  /** CapsuleShape2D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.CapsuleShape2D.mb_get_height == null) gdext.classes.CapsuleShape2D.mb_get_height = MethodBind.get("CapsuleShape2D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape2D.mb_get_height, livePtr)
  }

  /** CapsuleShape2D.set_mid_height */
  final def setMidHeight(mid_height: Double): Unit = {
    if (gdext.classes.CapsuleShape2D.mb_set_mid_height == null) gdext.classes.CapsuleShape2D.mb_set_mid_height = MethodBind.get("CapsuleShape2D", "set_mid_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape2D.mb_set_mid_height, livePtr, mid_height)
  }

  /** CapsuleShape2D.get_mid_height */
  final def getMidHeight(): Double = {
    if (gdext.classes.CapsuleShape2D.mb_get_mid_height == null) gdext.classes.CapsuleShape2D.mb_get_mid_height = MethodBind.get("CapsuleShape2D", "get_mid_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape2D.mb_get_mid_height, livePtr)
  }

}

object CapsuleShape2D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mid_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mid_height: GDExtensionMethodBindPtr = null
}
