package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicsMaterial`, extends `Resource`. */
abstract class PhysicsMaterial extends Resource {
  override def godotClassName: String = "PhysicsMaterial"

  /** PhysicsMaterial.set_friction */
  final def setFriction(friction: Double): Unit = {
    if (gdext.classes.PhysicsMaterial.mb_set_friction == null) gdext.classes.PhysicsMaterial.mb_set_friction = MethodBind.get("PhysicsMaterial", "set_friction", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsMaterial.mb_set_friction, livePtr, friction)
  }

  /** PhysicsMaterial.get_friction */
  final def getFriction(): Double = {
    if (gdext.classes.PhysicsMaterial.mb_get_friction == null) gdext.classes.PhysicsMaterial.mb_get_friction = MethodBind.get("PhysicsMaterial", "get_friction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsMaterial.mb_get_friction, livePtr)
  }

  /** PhysicsMaterial.set_rough */
  final def setRough(rough: Boolean): Unit = {
    if (gdext.classes.PhysicsMaterial.mb_set_rough == null) gdext.classes.PhysicsMaterial.mb_set_rough = MethodBind.get("PhysicsMaterial", "set_rough", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsMaterial.mb_set_rough, livePtr, rough)
  }

  /** PhysicsMaterial.is_rough */
  final def isRough(): Boolean = {
    if (gdext.classes.PhysicsMaterial.mb_is_rough == null) gdext.classes.PhysicsMaterial.mb_is_rough = MethodBind.get("PhysicsMaterial", "is_rough", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsMaterial.mb_is_rough, livePtr)
  }

  /** PhysicsMaterial.set_bounce */
  final def setBounce(bounce: Double): Unit = {
    if (gdext.classes.PhysicsMaterial.mb_set_bounce == null) gdext.classes.PhysicsMaterial.mb_set_bounce = MethodBind.get("PhysicsMaterial", "set_bounce", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PhysicsMaterial.mb_set_bounce, livePtr, bounce)
  }

  /** PhysicsMaterial.get_bounce */
  final def getBounce(): Double = {
    if (gdext.classes.PhysicsMaterial.mb_get_bounce == null) gdext.classes.PhysicsMaterial.mb_get_bounce = MethodBind.get("PhysicsMaterial", "get_bounce", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PhysicsMaterial.mb_get_bounce, livePtr)
  }

  /** PhysicsMaterial.set_absorbent */
  final def setAbsorbent(absorbent: Boolean): Unit = {
    if (gdext.classes.PhysicsMaterial.mb_set_absorbent == null) gdext.classes.PhysicsMaterial.mb_set_absorbent = MethodBind.get("PhysicsMaterial", "set_absorbent", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.PhysicsMaterial.mb_set_absorbent, livePtr, absorbent)
  }

  /** PhysicsMaterial.is_absorbent */
  final def isAbsorbent(): Boolean = {
    if (gdext.classes.PhysicsMaterial.mb_is_absorbent == null) gdext.classes.PhysicsMaterial.mb_is_absorbent = MethodBind.get("PhysicsMaterial", "is_absorbent", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicsMaterial.mb_is_absorbent, livePtr)
  }

}

object PhysicsMaterial {
  private[classes] var mb_set_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rough: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rough: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bounce: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounce: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_absorbent: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_absorbent: GDExtensionMethodBindPtr = null
}
