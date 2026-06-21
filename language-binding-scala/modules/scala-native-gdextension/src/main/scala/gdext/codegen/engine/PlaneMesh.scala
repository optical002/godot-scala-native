package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaneMesh`, extends `PrimitiveMesh`. */
abstract class PlaneMesh extends PrimitiveMesh {

  /** PlaneMesh.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaneMesh", "set_size", 743155724L), hostObject.objectPtr, size)

  /** PlaneMesh.get_size */
  final def getSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("PlaneMesh", "get_size", 3341600327L), hostObject.objectPtr)

  /** PlaneMesh.set_subdivide_width */
  final def setSubdivideWidth(subdivide: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaneMesh", "set_subdivide_width", 1286410249L), hostObject.objectPtr, subdivide)

  /** PlaneMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("PlaneMesh", "get_subdivide_width", 3905245786L), hostObject.objectPtr)

  /** PlaneMesh.set_subdivide_depth */
  final def setSubdivideDepth(subdivide: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaneMesh", "set_subdivide_depth", 1286410249L), hostObject.objectPtr, subdivide)

  /** PlaneMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("PlaneMesh", "get_subdivide_depth", 3905245786L), hostObject.objectPtr)

  /** PlaneMesh.set_center_offset */
  final def setCenterOffset(offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaneMesh", "set_center_offset", 3460891852L), hostObject.objectPtr, offset)

  /** PlaneMesh.get_center_offset */
  final def getCenterOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PlaneMesh", "get_center_offset", 3360562783L), hostObject.objectPtr)

  /** PlaneMesh.set_orientation */
  final def setOrientation(orientation: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaneMesh", "set_orientation", 2751399687L), hostObject.objectPtr, orientation)

  /** PlaneMesh.get_orientation */
  final def getOrientation(): Long =
    Ptrcall.call0[Long](MethodBind.get("PlaneMesh", "get_orientation", 3227599250L), hostObject.objectPtr)

}

object PlaneMesh {
  /** Class metadata for Gd[PlaneMesh] lifetime management and casting. */
  given GodotClass[PlaneMesh] with {
    def className = "PlaneMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaneMesh = new PlaneMesh {}.withHost(o.objectPtr)
    def unwrap(t: PlaneMesh): GodotObject = t.hostObject
  }
}
