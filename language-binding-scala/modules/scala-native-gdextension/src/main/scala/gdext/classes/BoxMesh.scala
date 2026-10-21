package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BoxMesh`, extends `PrimitiveMesh`. */
abstract class BoxMesh extends PrimitiveMesh {
  override def godotClassName: String = "BoxMesh"

  /** BoxMesh.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.BoxMesh.mb_set_size == null) gdext.classes.BoxMesh.mb_set_size = MethodBind.get("BoxMesh", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.BoxMesh.mb_set_size, livePtr, size)
  }

  /** BoxMesh.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.BoxMesh.mb_get_size == null) gdext.classes.BoxMesh.mb_get_size = MethodBind.get("BoxMesh", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.BoxMesh.mb_get_size, livePtr)
  }

  /** BoxMesh.set_subdivide_width */
  final def setSubdivideWidth(subdivide: Long): Unit = {
    if (gdext.classes.BoxMesh.mb_set_subdivide_width == null) gdext.classes.BoxMesh.mb_set_subdivide_width = MethodBind.get("BoxMesh", "set_subdivide_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoxMesh.mb_set_subdivide_width, livePtr, subdivide)
  }

  /** BoxMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long = {
    if (gdext.classes.BoxMesh.mb_get_subdivide_width == null) gdext.classes.BoxMesh.mb_get_subdivide_width = MethodBind.get("BoxMesh", "get_subdivide_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoxMesh.mb_get_subdivide_width, livePtr)
  }

  /** BoxMesh.set_subdivide_height */
  final def setSubdivideHeight(divisions: Long): Unit = {
    if (gdext.classes.BoxMesh.mb_set_subdivide_height == null) gdext.classes.BoxMesh.mb_set_subdivide_height = MethodBind.get("BoxMesh", "set_subdivide_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoxMesh.mb_set_subdivide_height, livePtr, divisions)
  }

  /** BoxMesh.get_subdivide_height */
  final def getSubdivideHeight(): Long = {
    if (gdext.classes.BoxMesh.mb_get_subdivide_height == null) gdext.classes.BoxMesh.mb_get_subdivide_height = MethodBind.get("BoxMesh", "get_subdivide_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoxMesh.mb_get_subdivide_height, livePtr)
  }

  /** BoxMesh.set_subdivide_depth */
  final def setSubdivideDepth(divisions: Long): Unit = {
    if (gdext.classes.BoxMesh.mb_set_subdivide_depth == null) gdext.classes.BoxMesh.mb_set_subdivide_depth = MethodBind.get("BoxMesh", "set_subdivide_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.BoxMesh.mb_set_subdivide_depth, livePtr, divisions)
  }

  /** BoxMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long = {
    if (gdext.classes.BoxMesh.mb_get_subdivide_depth == null) gdext.classes.BoxMesh.mb_get_subdivide_depth = MethodBind.get("BoxMesh", "get_subdivide_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.BoxMesh.mb_get_subdivide_depth, livePtr)
  }

}

object BoxMesh {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_depth: GDExtensionMethodBindPtr = null
}
