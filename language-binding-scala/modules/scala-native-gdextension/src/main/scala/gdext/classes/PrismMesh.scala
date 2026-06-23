package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PrismMesh`, extends `PrimitiveMesh`. */
abstract class PrismMesh extends PrimitiveMesh {

  /** PrismMesh.set_left_to_right */
  final def setLeftToRight(left_to_right: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrismMesh", "set_left_to_right", 373806689L), hostObject.objectPtr, left_to_right)

  /** PrismMesh.get_left_to_right */
  final def getLeftToRight(): Double =
    Ptrcall.call0[Double](MethodBind.get("PrismMesh", "get_left_to_right", 1740695150L), hostObject.objectPtr)

  /** PrismMesh.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrismMesh", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** PrismMesh.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("PrismMesh", "get_size", 3360562783L), hostObject.objectPtr)

  /** PrismMesh.set_subdivide_width */
  final def setSubdivideWidth(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrismMesh", "set_subdivide_width", 1286410249L), hostObject.objectPtr, segments)

  /** PrismMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("PrismMesh", "get_subdivide_width", 3905245786L), hostObject.objectPtr)

  /** PrismMesh.set_subdivide_height */
  final def setSubdivideHeight(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrismMesh", "set_subdivide_height", 1286410249L), hostObject.objectPtr, segments)

  /** PrismMesh.get_subdivide_height */
  final def getSubdivideHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("PrismMesh", "get_subdivide_height", 3905245786L), hostObject.objectPtr)

  /** PrismMesh.set_subdivide_depth */
  final def setSubdivideDepth(segments: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("PrismMesh", "set_subdivide_depth", 1286410249L), hostObject.objectPtr, segments)

  /** PrismMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("PrismMesh", "get_subdivide_depth", 3905245786L), hostObject.objectPtr)

}

object PrismMesh {
  /** Class metadata for Gd[PrismMesh] lifetime management and casting. */
  given GodotClass[PrismMesh] with {
    def className = "PrismMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PrismMesh = new PrismMesh {}.withHost(o.objectPtr)
    def unwrap(t: PrismMesh): GodotObject = t.hostObject
  }
}
