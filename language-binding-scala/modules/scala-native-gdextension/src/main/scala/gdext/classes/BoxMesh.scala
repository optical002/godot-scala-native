package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxMesh`, extends `PrimitiveMesh`. */
abstract class BoxMesh extends PrimitiveMesh {
  override def godotClassName: String = "BoxMesh"

  /** BoxMesh.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxMesh", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxMesh.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("BoxMesh", "get_size", 3360562783L), hostObject.objectPtr)

  /** BoxMesh.set_subdivide_width */
  final def setSubdivideWidth(subdivide: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxMesh", "set_subdivide_width", 1286410249L), hostObject.objectPtr, subdivide)

  /** BoxMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoxMesh", "get_subdivide_width", 3905245786L), hostObject.objectPtr)

  /** BoxMesh.set_subdivide_height */
  final def setSubdivideHeight(divisions: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxMesh", "set_subdivide_height", 1286410249L), hostObject.objectPtr, divisions)

  /** BoxMesh.get_subdivide_height */
  final def getSubdivideHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoxMesh", "get_subdivide_height", 3905245786L), hostObject.objectPtr)

  /** BoxMesh.set_subdivide_depth */
  final def setSubdivideDepth(divisions: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxMesh", "set_subdivide_depth", 1286410249L), hostObject.objectPtr, divisions)

  /** BoxMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long =
    Ptrcall.call0[Long](MethodBind.get("BoxMesh", "get_subdivide_depth", 3905245786L), hostObject.objectPtr)

}
