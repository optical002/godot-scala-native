package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneCollisionCapsule3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionCapsule3D extends SpringBoneCollision3D {

  /** SpringBoneCollisionCapsule3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionCapsule3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SpringBoneCollisionCapsule3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringBoneCollisionCapsule3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** SpringBoneCollisionCapsule3D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionCapsule3D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** SpringBoneCollisionCapsule3D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringBoneCollisionCapsule3D", "get_height", 1740695150L), hostObject.objectPtr)

  /** SpringBoneCollisionCapsule3D.set_mid_height */
  final def setMidHeight(mid_height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionCapsule3D", "set_mid_height", 373806689L), hostObject.objectPtr, mid_height)

  /** SpringBoneCollisionCapsule3D.get_mid_height */
  final def getMidHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringBoneCollisionCapsule3D", "get_mid_height", 1740695150L), hostObject.objectPtr)

  /** SpringBoneCollisionCapsule3D.set_inside */
  final def setInside(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionCapsule3D", "set_inside", 2586408642L), hostObject.objectPtr, enabled)

  /** SpringBoneCollisionCapsule3D.is_inside */
  final def isInside(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpringBoneCollisionCapsule3D", "is_inside", 36873697L), hostObject.objectPtr)

}

object SpringBoneCollisionCapsule3D {
  /** Class metadata for Gd[SpringBoneCollisionCapsule3D] lifetime management and casting. */
  given GodotClass[SpringBoneCollisionCapsule3D] with {
    def className = "SpringBoneCollisionCapsule3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringBoneCollisionCapsule3D = new SpringBoneCollisionCapsule3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringBoneCollisionCapsule3D): GodotObject = t.hostObject
  }
}
