package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CapsuleShape3D`, extends `Shape3D`. */
abstract class CapsuleShape3D extends Shape3D {
  override def godotClassName: String = "CapsuleShape3D"

  /** CapsuleShape3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CapsuleShape3D.mb_set_radius == null) gdext.classes.CapsuleShape3D.mb_set_radius = MethodBind.get("CapsuleShape3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape3D.mb_set_radius, livePtr, radius)
  }

  /** CapsuleShape3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CapsuleShape3D.mb_get_radius == null) gdext.classes.CapsuleShape3D.mb_get_radius = MethodBind.get("CapsuleShape3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape3D.mb_get_radius, livePtr)
  }

  /** CapsuleShape3D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.CapsuleShape3D.mb_set_height == null) gdext.classes.CapsuleShape3D.mb_set_height = MethodBind.get("CapsuleShape3D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape3D.mb_set_height, livePtr, height)
  }

  /** CapsuleShape3D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.CapsuleShape3D.mb_get_height == null) gdext.classes.CapsuleShape3D.mb_get_height = MethodBind.get("CapsuleShape3D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape3D.mb_get_height, livePtr)
  }

  /** CapsuleShape3D.set_mid_height */
  final def setMidHeight(midHeight: Double): Unit = {
    if (gdext.classes.CapsuleShape3D.mb_set_mid_height == null) gdext.classes.CapsuleShape3D.mb_set_mid_height = MethodBind.get("CapsuleShape3D", "set_mid_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CapsuleShape3D.mb_set_mid_height, livePtr, midHeight)
  }

  /** CapsuleShape3D.get_mid_height */
  final def getMidHeight(): Double = {
    if (gdext.classes.CapsuleShape3D.mb_get_mid_height == null) gdext.classes.CapsuleShape3D.mb_get_mid_height = MethodBind.get("CapsuleShape3D", "get_mid_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CapsuleShape3D.mb_get_mid_height, livePtr)
  }

}

object CapsuleShape3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mid_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mid_height: GDExtensionMethodBindPtr = null
}
