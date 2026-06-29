package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CapsuleShape2D`, extends `Shape2D`. */
abstract class CapsuleShape2D extends Shape2D {
  override def godotClassName: String = "CapsuleShape2D"

  /** CapsuleShape2D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleShape2D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** CapsuleShape2D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CapsuleShape2D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** CapsuleShape2D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleShape2D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** CapsuleShape2D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CapsuleShape2D", "get_height", 1740695150L), hostObject.objectPtr)

  /** CapsuleShape2D.set_mid_height */
  final def setMidHeight(mid_height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CapsuleShape2D", "set_mid_height", 373806689L), hostObject.objectPtr, mid_height)

  /** CapsuleShape2D.get_mid_height */
  final def getMidHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CapsuleShape2D", "get_mid_height", 1740695150L), hostObject.objectPtr)

}
