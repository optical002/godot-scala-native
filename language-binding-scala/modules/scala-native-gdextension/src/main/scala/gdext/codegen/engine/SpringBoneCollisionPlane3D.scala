package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SpringBoneCollisionPlane3D`, extends `SpringBoneCollision3D`. */
abstract class SpringBoneCollisionPlane3D extends SpringBoneCollision3D {

}

object SpringBoneCollisionPlane3D {
  /** Class metadata for Gd[SpringBoneCollisionPlane3D] lifetime management and casting. */
  given GodotClass[SpringBoneCollisionPlane3D] with {
    def className = "SpringBoneCollisionPlane3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SpringBoneCollisionPlane3D = new SpringBoneCollisionPlane3D {}.withHost(o.objectPtr)
    def unwrap(t: SpringBoneCollisionPlane3D): GodotObject = t.hostObject
  }
}
