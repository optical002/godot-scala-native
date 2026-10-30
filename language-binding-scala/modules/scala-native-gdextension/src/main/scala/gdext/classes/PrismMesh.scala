package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PrismMesh`, extends `PrimitiveMesh`. */
abstract class PrismMesh extends PrimitiveMesh {
  override def godotClassName: String = "PrismMesh"

  /** PrismMesh.set_left_to_right */
  final def setLeftToRight(leftToRight: Double): Unit = {
    if (gdext.classes.PrismMesh.mb_set_left_to_right == null) gdext.classes.PrismMesh.mb_set_left_to_right = MethodBind.get("PrismMesh", "set_left_to_right", 373806689L)
    Ptrcall.callVoid1(gdext.classes.PrismMesh.mb_set_left_to_right, livePtr, leftToRight)
  }

  /** PrismMesh.get_left_to_right */
  final def getLeftToRight(): Double = {
    if (gdext.classes.PrismMesh.mb_get_left_to_right == null) gdext.classes.PrismMesh.mb_get_left_to_right = MethodBind.get("PrismMesh", "get_left_to_right", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.PrismMesh.mb_get_left_to_right, livePtr)
  }

  /** PrismMesh.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PrismMesh.mb_set_size == null) gdext.classes.PrismMesh.mb_set_size = MethodBind.get("PrismMesh", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PrismMesh.mb_set_size, livePtr, size)
  }

  /** PrismMesh.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.PrismMesh.mb_get_size == null) gdext.classes.PrismMesh.mb_get_size = MethodBind.get("PrismMesh", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PrismMesh.mb_get_size, livePtr)
  }

  /** PrismMesh.set_subdivide_width */
  final def setSubdivideWidth(segments: Long): Unit = {
    if (gdext.classes.PrismMesh.mb_set_subdivide_width == null) gdext.classes.PrismMesh.mb_set_subdivide_width = MethodBind.get("PrismMesh", "set_subdivide_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PrismMesh.mb_set_subdivide_width, livePtr, segments)
  }

  /** PrismMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long = {
    if (gdext.classes.PrismMesh.mb_get_subdivide_width == null) gdext.classes.PrismMesh.mb_get_subdivide_width = MethodBind.get("PrismMesh", "get_subdivide_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PrismMesh.mb_get_subdivide_width, livePtr)
  }

  /** PrismMesh.set_subdivide_height */
  final def setSubdivideHeight(segments: Long): Unit = {
    if (gdext.classes.PrismMesh.mb_set_subdivide_height == null) gdext.classes.PrismMesh.mb_set_subdivide_height = MethodBind.get("PrismMesh", "set_subdivide_height", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PrismMesh.mb_set_subdivide_height, livePtr, segments)
  }

  /** PrismMesh.get_subdivide_height */
  final def getSubdivideHeight(): Long = {
    if (gdext.classes.PrismMesh.mb_get_subdivide_height == null) gdext.classes.PrismMesh.mb_get_subdivide_height = MethodBind.get("PrismMesh", "get_subdivide_height", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PrismMesh.mb_get_subdivide_height, livePtr)
  }

  /** PrismMesh.set_subdivide_depth */
  final def setSubdivideDepth(segments: Long): Unit = {
    if (gdext.classes.PrismMesh.mb_set_subdivide_depth == null) gdext.classes.PrismMesh.mb_set_subdivide_depth = MethodBind.get("PrismMesh", "set_subdivide_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PrismMesh.mb_set_subdivide_depth, livePtr, segments)
  }

  /** PrismMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long = {
    if (gdext.classes.PrismMesh.mb_get_subdivide_depth == null) gdext.classes.PrismMesh.mb_get_subdivide_depth = MethodBind.get("PrismMesh", "get_subdivide_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PrismMesh.mb_get_subdivide_depth, livePtr)
  }

}

object PrismMesh {
  private[classes] var mb_set_left_to_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_left_to_right: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_depth: GDExtensionMethodBindPtr = null
}
