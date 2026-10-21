package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DampedSpringJoint2D`, extends `Joint2D`. */
abstract class DampedSpringJoint2D extends Joint2D {
  override def godotClassName: String = "DampedSpringJoint2D"

  /** DampedSpringJoint2D.set_length */
  final def setLength(length: Double): Unit = {
    if (gdext.classes.DampedSpringJoint2D.mb_set_length == null) gdext.classes.DampedSpringJoint2D.mb_set_length = MethodBind.get("DampedSpringJoint2D", "set_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DampedSpringJoint2D.mb_set_length, livePtr, length)
  }

  /** DampedSpringJoint2D.get_length */
  final def getLength(): Double = {
    if (gdext.classes.DampedSpringJoint2D.mb_get_length == null) gdext.classes.DampedSpringJoint2D.mb_get_length = MethodBind.get("DampedSpringJoint2D", "get_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DampedSpringJoint2D.mb_get_length, livePtr)
  }

  /** DampedSpringJoint2D.set_rest_length */
  final def setRestLength(rest_length: Double): Unit = {
    if (gdext.classes.DampedSpringJoint2D.mb_set_rest_length == null) gdext.classes.DampedSpringJoint2D.mb_set_rest_length = MethodBind.get("DampedSpringJoint2D", "set_rest_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DampedSpringJoint2D.mb_set_rest_length, livePtr, rest_length)
  }

  /** DampedSpringJoint2D.get_rest_length */
  final def getRestLength(): Double = {
    if (gdext.classes.DampedSpringJoint2D.mb_get_rest_length == null) gdext.classes.DampedSpringJoint2D.mb_get_rest_length = MethodBind.get("DampedSpringJoint2D", "get_rest_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DampedSpringJoint2D.mb_get_rest_length, livePtr)
  }

  /** DampedSpringJoint2D.set_stiffness */
  final def setStiffness(stiffness: Double): Unit = {
    if (gdext.classes.DampedSpringJoint2D.mb_set_stiffness == null) gdext.classes.DampedSpringJoint2D.mb_set_stiffness = MethodBind.get("DampedSpringJoint2D", "set_stiffness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DampedSpringJoint2D.mb_set_stiffness, livePtr, stiffness)
  }

  /** DampedSpringJoint2D.get_stiffness */
  final def getStiffness(): Double = {
    if (gdext.classes.DampedSpringJoint2D.mb_get_stiffness == null) gdext.classes.DampedSpringJoint2D.mb_get_stiffness = MethodBind.get("DampedSpringJoint2D", "get_stiffness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DampedSpringJoint2D.mb_get_stiffness, livePtr)
  }

  /** DampedSpringJoint2D.set_damping */
  final def setDamping(damping: Double): Unit = {
    if (gdext.classes.DampedSpringJoint2D.mb_set_damping == null) gdext.classes.DampedSpringJoint2D.mb_set_damping = MethodBind.get("DampedSpringJoint2D", "set_damping", 373806689L)
    Ptrcall.callVoid1(gdext.classes.DampedSpringJoint2D.mb_set_damping, livePtr, damping)
  }

  /** DampedSpringJoint2D.get_damping */
  final def getDamping(): Double = {
    if (gdext.classes.DampedSpringJoint2D.mb_get_damping == null) gdext.classes.DampedSpringJoint2D.mb_get_damping = MethodBind.get("DampedSpringJoint2D", "get_damping", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.DampedSpringJoint2D.mb_get_damping, livePtr)
  }

}

object DampedSpringJoint2D {
  private[classes] var mb_set_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rest_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rest_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping: GDExtensionMethodBindPtr = null
}
