package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneCollisionSphere3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionSphere3D extends SpringBoneCollision3D {

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

object SpringBoneCollisionSphere3D {
  /** Class metadata for Gd[SpringBoneCollisionSphere3D] lifetime management and casting. */
  given GodotClass[SpringBoneCollisionSphere3D] with {
    def className = "SpringBoneCollisionSphere3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringBoneCollisionSphere3D = new SpringBoneCollisionSphere3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringBoneCollisionSphere3D): GodotObject = t.hostObject
  }
}
