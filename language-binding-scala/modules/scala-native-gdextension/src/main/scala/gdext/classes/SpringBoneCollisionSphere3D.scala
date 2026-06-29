package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneCollisionSphere3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionSphere3D extends SpringBoneCollision3D {
  override def godotClassName: String = "SpringBoneCollisionSphere3D"

  /** SpringBoneCollisionSphere3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionSphere3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SpringBoneCollisionSphere3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SpringBoneCollisionSphere3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** SpringBoneCollisionSphere3D.set_inside */
  final def setInside(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpringBoneCollisionSphere3D", "set_inside", 2586408642L), hostObject.objectPtr, enabled)

  /** SpringBoneCollisionSphere3D.is_inside */
  final def isInside(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SpringBoneCollisionSphere3D", "is_inside", 36873697L), hostObject.objectPtr)

}
