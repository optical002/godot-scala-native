package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ConcavePolygonShape3D`, extends `Shape3D`. */
abstract class ConcavePolygonShape3D extends Shape3D {

  /** ConcavePolygonShape3D.set_backface_collision_enabled */
  final def setBackfaceCollisionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ConcavePolygonShape3D", "set_backface_collision_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** ConcavePolygonShape3D.is_backface_collision_enabled */
  final def isBackfaceCollisionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ConcavePolygonShape3D", "is_backface_collision_enabled", 36873697L), hostObject.objectPtr)

}

object ConcavePolygonShape3D {
  /** Class metadata for Gd[ConcavePolygonShape3D] lifetime management and casting. */
  given GodotClass[ConcavePolygonShape3D] with {
    def className = "ConcavePolygonShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ConcavePolygonShape3D = new ConcavePolygonShape3D {}.withHost(o.objectPtr)
    def unwrap(t: ConcavePolygonShape3D): GodotObject = t.hostObject
  }
}
