package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OccluderPolygon2D`, extends `Resource`. */
abstract class OccluderPolygon2D extends Resource {

  /** OccluderPolygon2D.set_closed */
  final def setClosed(closed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderPolygon2D", "set_closed", 2586408642L), hostObject.objectPtr, closed)

  /** OccluderPolygon2D.is_closed */
  final def isClosed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OccluderPolygon2D", "is_closed", 36873697L), hostObject.objectPtr)

  /** OccluderPolygon2D.set_cull_mode */
  final def setCullMode(cull_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderPolygon2D", "set_cull_mode", 3500863002L), hostObject.objectPtr, cull_mode)

  /** OccluderPolygon2D.get_cull_mode */
  final def getCullMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("OccluderPolygon2D", "get_cull_mode", 33931036L), hostObject.objectPtr)

}

object OccluderPolygon2D {
  /** Class metadata for Gd[OccluderPolygon2D] lifetime management and casting. */
  given GodotClass[OccluderPolygon2D] with {
    def className = "OccluderPolygon2D"
    def isRefCounted = true
    def wrap(o: GodotObject): OccluderPolygon2D = new OccluderPolygon2D {}.withHost(o.objectPtr)
    def unwrap(t: OccluderPolygon2D): GodotObject = t.hostObject
  }
}
