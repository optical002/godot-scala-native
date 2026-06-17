package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `LightOccluder2D`, extends `Node2D`. */
abstract class LightOccluder2D extends Node2D {

  /** LightOccluder2D.set_occluder_polygon */
  final def setOccluderPolygon(polygon: OccluderPolygon2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightOccluder2D", "set_occluder_polygon", 3258315893L), hostObject.objectPtr, polygon.hostObject)

  /** LightOccluder2D.get_occluder_polygon */
  final def getOccluderPolygon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LightOccluder2D", "get_occluder_polygon", 3962317075L), hostObject.objectPtr)

  /** LightOccluder2D.set_occluder_light_mask */
  final def setOccluderLightMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightOccluder2D", "set_occluder_light_mask", 1286410249L), hostObject.objectPtr, mask)

  /** LightOccluder2D.get_occluder_light_mask */
  final def getOccluderLightMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightOccluder2D", "get_occluder_light_mask", 3905245786L), hostObject.objectPtr)

  /** LightOccluder2D.set_as_sdf_collision */
  final def setAsSdfCollision(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightOccluder2D", "set_as_sdf_collision", 2586408642L), hostObject.objectPtr, enable)

  /** LightOccluder2D.is_set_as_sdf_collision */
  final def isSetAsSdfCollision(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightOccluder2D", "is_set_as_sdf_collision", 36873697L), hostObject.objectPtr)

}

object LightOccluder2D {
  /** Class metadata for Gd[LightOccluder2D] lifetime management and casting. */
  given GodotClass[LightOccluder2D] with {
    def className = "LightOccluder2D"
    def isRefCounted = false
    def wrap(o: GodotObject): LightOccluder2D = new LightOccluder2D {}.withHost(o.objectPtr)
    def unwrap(t: LightOccluder2D): GodotObject = t.hostObject
  }
}
