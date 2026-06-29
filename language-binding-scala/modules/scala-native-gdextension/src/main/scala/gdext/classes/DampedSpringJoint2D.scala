package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `DampedSpringJoint2D`, extends `Joint2D`. */
abstract class DampedSpringJoint2D extends Joint2D {
  override def godotClassName: String = "DampedSpringJoint2D"

  /** DampedSpringJoint2D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DampedSpringJoint2D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** DampedSpringJoint2D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("DampedSpringJoint2D", "get_length", 1740695150L), hostObject.objectPtr)

  /** DampedSpringJoint2D.set_rest_length */
  final def setRestLength(rest_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DampedSpringJoint2D", "set_rest_length", 373806689L), hostObject.objectPtr, rest_length)

  /** DampedSpringJoint2D.get_rest_length */
  final def getRestLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("DampedSpringJoint2D", "get_rest_length", 1740695150L), hostObject.objectPtr)

  /** DampedSpringJoint2D.set_stiffness */
  final def setStiffness(stiffness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DampedSpringJoint2D", "set_stiffness", 373806689L), hostObject.objectPtr, stiffness)

  /** DampedSpringJoint2D.get_stiffness */
  final def getStiffness(): Double =
    Ptrcall.call0[Double](MethodBind.get("DampedSpringJoint2D", "get_stiffness", 1740695150L), hostObject.objectPtr)

  /** DampedSpringJoint2D.set_damping */
  final def setDamping(damping: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DampedSpringJoint2D", "set_damping", 373806689L), hostObject.objectPtr, damping)

  /** DampedSpringJoint2D.get_damping */
  final def getDamping(): Double =
    Ptrcall.call0[Double](MethodBind.get("DampedSpringJoint2D", "get_damping", 1740695150L), hostObject.objectPtr)

}
