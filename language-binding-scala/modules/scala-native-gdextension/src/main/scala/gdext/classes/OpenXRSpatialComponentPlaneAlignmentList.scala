package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneAlignmentList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneAlignmentList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneAlignmentList"

  /** OpenXRSpatialComponentPlaneAlignmentList.get_plane_alignment */
  final def getPlaneAlignment(index: Long): gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment = {
    if (gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment == null) gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment = MethodBind.get("OpenXRSpatialComponentPlaneAlignmentList", "get_plane_alignment", 3340200270L)
    gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment(Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentPlaneAlignmentList.mb_get_plane_alignment, livePtr, index))
  }

}

object OpenXRSpatialComponentPlaneAlignmentList {
  private[classes] var mb_get_plane_alignment: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialComponentPlaneAlignmentList.PlaneAlignment`. */
  opaque type PlaneAlignment <: Long = Long

  object PlaneAlignment {
    final val HorizontalUpward: PlaneAlignment = 0L.asInstanceOf[PlaneAlignment]
    final val HorizontalDownward: PlaneAlignment = 1L.asInstanceOf[PlaneAlignment]
    final val Vertical: PlaneAlignment = 2L.asInstanceOf[PlaneAlignment]
    final val Arbitrary: PlaneAlignment = 3L.asInstanceOf[PlaneAlignment]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PlaneAlignment = value.asInstanceOf[PlaneAlignment]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PlaneAlignment] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[PlaneAlignment]]

    extension (self: PlaneAlignment)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "HorizontalUpward"
        case 1L => "HorizontalDownward"
        case 2L => "Vertical"
        case 3L => "Arbitrary"
        case other => other.toString
      }
  }
}
