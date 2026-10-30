package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentMarkerList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentMarkerList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentMarkerList"

  /** OpenXRSpatialComponentMarkerList.get_marker_type */
  final def getMarkerType(index: Long): gdext.classes.OpenXRSpatialComponentMarkerList.MarkerType = {
    if (gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type == null) gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type = MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_type", 2627847866L)
    gdext.classes.OpenXRSpatialComponentMarkerList.MarkerType(Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_type, livePtr, index))
  }

  /** OpenXRSpatialComponentMarkerList.get_marker_id */
  final def getMarkerId(index: Long): Long = {
    if (gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id == null) gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id = MethodBind.get("OpenXRSpatialComponentMarkerList", "get_marker_id", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentMarkerList.mb_get_marker_id, livePtr, index)
  }

}

object OpenXRSpatialComponentMarkerList {
  private[classes] var mb_get_marker_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_marker_id: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialComponentMarkerList.MarkerType`. */
  opaque type MarkerType <: Long = Long

  object MarkerType {
    final val Unknown: MarkerType = 0L.asInstanceOf[MarkerType]
    final val Qrcode: MarkerType = 1L.asInstanceOf[MarkerType]
    final val MicroQrcode: MarkerType = 2L.asInstanceOf[MarkerType]
    final val Aruco: MarkerType = 3L.asInstanceOf[MarkerType]
    final val AprilTag: MarkerType = 4L.asInstanceOf[MarkerType]
    final val Max: MarkerType = 5L.asInstanceOf[MarkerType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): MarkerType = value.asInstanceOf[MarkerType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[MarkerType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[MarkerType]]

    extension (self: MarkerType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Qrcode"
        case 2L => "MicroQrcode"
        case 3L => "Aruco"
        case 4L => "AprilTag"
        case 5L => "Max"
        case other => other.toString
      }
  }
}
