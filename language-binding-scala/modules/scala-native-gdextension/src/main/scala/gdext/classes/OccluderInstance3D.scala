package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OccluderInstance3D`, extends `VisualInstance3D`. */
abstract class OccluderInstance3D extends VisualInstance3D {

  /** OccluderInstance3D.set_bake_mask */
  final def setBakeMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderInstance3D", "set_bake_mask", 1286410249L), hostObject.objectPtr, mask)

  /** OccluderInstance3D.get_bake_mask */
  final def getBakeMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("OccluderInstance3D", "get_bake_mask", 3905245786L), hostObject.objectPtr)

  /** OccluderInstance3D.set_bake_mask_value */
  final def setBakeMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("OccluderInstance3D", "set_bake_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** OccluderInstance3D.get_bake_mask_value */
  final def getBakeMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("OccluderInstance3D", "get_bake_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** OccluderInstance3D.set_bake_simplification_distance */
  final def setBakeSimplificationDistance(simplification_distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderInstance3D", "set_bake_simplification_distance", 373806689L), hostObject.objectPtr, simplification_distance)

  /** OccluderInstance3D.get_bake_simplification_distance */
  final def getBakeSimplificationDistance(): Double =
    Ptrcall.call0[Double](MethodBind.get("OccluderInstance3D", "get_bake_simplification_distance", 1740695150L), hostObject.objectPtr)

  /** OccluderInstance3D.set_occluder */
  final def setOccluder(occluder: Occluder3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderInstance3D", "set_occluder", 1664878165L), hostObject.objectPtr, occluder.hostObject)

  /** OccluderInstance3D.get_occluder */
  final def getOccluder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("OccluderInstance3D", "get_occluder", 1696836198L), hostObject.objectPtr)

}

object OccluderInstance3D {
  /** Class metadata for Gd[OccluderInstance3D] lifetime management and casting. */
  given GodotClass[OccluderInstance3D] with {
    def className = "OccluderInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): OccluderInstance3D = new OccluderInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: OccluderInstance3D): GodotObject = t.hostObject
  }
}
