package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicsMaterial`, extends `Resource`. */
abstract class PhysicsMaterial extends Resource {
  override def godotClassName: String = "PhysicsMaterial"

  /** PhysicsMaterial.set_friction */
  final def setFriction(friction: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsMaterial", "set_friction", 373806689L), hostObject.objectPtr, friction)

  /** PhysicsMaterial.get_friction */
  final def getFriction(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsMaterial", "get_friction", 1740695150L), hostObject.objectPtr)

  /** PhysicsMaterial.set_rough */
  final def setRough(rough: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsMaterial", "set_rough", 2586408642L), hostObject.objectPtr, rough)

  /** PhysicsMaterial.is_rough */
  final def isRough(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsMaterial", "is_rough", 36873697L), hostObject.objectPtr)

  /** PhysicsMaterial.set_bounce */
  final def setBounce(bounce: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsMaterial", "set_bounce", 373806689L), hostObject.objectPtr, bounce)

  /** PhysicsMaterial.get_bounce */
  final def getBounce(): Double =
    Ptrcall.call0[Double](MethodBind.get("PhysicsMaterial", "get_bounce", 1740695150L), hostObject.objectPtr)

  /** PhysicsMaterial.set_absorbent */
  final def setAbsorbent(absorbent: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("PhysicsMaterial", "set_absorbent", 2586408642L), hostObject.objectPtr, absorbent)

  /** PhysicsMaterial.is_absorbent */
  final def isAbsorbent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicsMaterial", "is_absorbent", 36873697L), hostObject.objectPtr)

}
