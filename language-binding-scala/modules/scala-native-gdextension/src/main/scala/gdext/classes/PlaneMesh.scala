package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PlaneMesh`, extends `PrimitiveMesh`. */
abstract class PlaneMesh extends PrimitiveMesh {
  override def godotClassName: String = "PlaneMesh"

  /** PlaneMesh.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.PlaneMesh.mb_set_size == null) gdext.classes.PlaneMesh.mb_set_size = MethodBind.get("PlaneMesh", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.PlaneMesh.mb_set_size, livePtr, size)
  }

  /** PlaneMesh.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.PlaneMesh.mb_get_size == null) gdext.classes.PlaneMesh.mb_get_size = MethodBind.get("PlaneMesh", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.PlaneMesh.mb_get_size, livePtr)
  }

  /** PlaneMesh.set_subdivide_width */
  final def setSubdivideWidth(subdivide: Long): Unit = {
    if (gdext.classes.PlaneMesh.mb_set_subdivide_width == null) gdext.classes.PlaneMesh.mb_set_subdivide_width = MethodBind.get("PlaneMesh", "set_subdivide_width", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PlaneMesh.mb_set_subdivide_width, livePtr, subdivide)
  }

  /** PlaneMesh.get_subdivide_width */
  final def getSubdivideWidth(): Long = {
    if (gdext.classes.PlaneMesh.mb_get_subdivide_width == null) gdext.classes.PlaneMesh.mb_get_subdivide_width = MethodBind.get("PlaneMesh", "get_subdivide_width", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PlaneMesh.mb_get_subdivide_width, livePtr)
  }

  /** PlaneMesh.set_subdivide_depth */
  final def setSubdivideDepth(subdivide: Long): Unit = {
    if (gdext.classes.PlaneMesh.mb_set_subdivide_depth == null) gdext.classes.PlaneMesh.mb_set_subdivide_depth = MethodBind.get("PlaneMesh", "set_subdivide_depth", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.PlaneMesh.mb_set_subdivide_depth, livePtr, subdivide)
  }

  /** PlaneMesh.get_subdivide_depth */
  final def getSubdivideDepth(): Long = {
    if (gdext.classes.PlaneMesh.mb_get_subdivide_depth == null) gdext.classes.PlaneMesh.mb_get_subdivide_depth = MethodBind.get("PlaneMesh", "get_subdivide_depth", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.PlaneMesh.mb_get_subdivide_depth, livePtr)
  }

  /** PlaneMesh.set_center_offset */
  final def setCenterOffset(offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.PlaneMesh.mb_set_center_offset == null) gdext.classes.PlaneMesh.mb_set_center_offset = MethodBind.get("PlaneMesh", "set_center_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.PlaneMesh.mb_set_center_offset, livePtr, offset)
  }

  /** PlaneMesh.get_center_offset */
  final def getCenterOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.PlaneMesh.mb_get_center_offset == null) gdext.classes.PlaneMesh.mb_get_center_offset = MethodBind.get("PlaneMesh", "get_center_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.PlaneMesh.mb_get_center_offset, livePtr)
  }

  /** PlaneMesh.set_orientation */
  final def setOrientation(orientation: gdext.classes.PlaneMesh.Orientation): Unit = {
    if (gdext.classes.PlaneMesh.mb_set_orientation == null) gdext.classes.PlaneMesh.mb_set_orientation = MethodBind.get("PlaneMesh", "set_orientation", 2751399687L)
    Ptrcall.callVoid1(gdext.classes.PlaneMesh.mb_set_orientation, livePtr, orientation)
  }

  /** PlaneMesh.get_orientation */
  final def getOrientation(): gdext.classes.PlaneMesh.Orientation = {
    if (gdext.classes.PlaneMesh.mb_get_orientation == null) gdext.classes.PlaneMesh.mb_get_orientation = MethodBind.get("PlaneMesh", "get_orientation", 3227599250L)
    gdext.classes.PlaneMesh.Orientation(Ptrcall.call0[Long](gdext.classes.PlaneMesh.mb_get_orientation, livePtr))
  }

}

object PlaneMesh {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_width: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdivide_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdivide_depth: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_center_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_center_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_orientation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_orientation: GDExtensionMethodBindPtr = null

  /** Godot enum `PlaneMesh.Orientation`. */
  opaque type Orientation <: Long = Long

  object Orientation {
    final val X: Orientation = 0L.asInstanceOf[Orientation]
    final val Y: Orientation = 1L.asInstanceOf[Orientation]
    final val Z: Orientation = 2L.asInstanceOf[Orientation]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Orientation = value.asInstanceOf[Orientation]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Orientation] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Orientation]]

    extension (self: Orientation)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "X"
        case 1L => "Y"
        case 2L => "Z"
        case other => other.toString
      }
  }
}
