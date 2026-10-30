package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialComponentPlaneSemanticLabelList`, extends `OpenXRSpatialComponentData`. */
abstract class OpenXRSpatialComponentPlaneSemanticLabelList extends OpenXRSpatialComponentData {
  override def godotClassName: String = "OpenXRSpatialComponentPlaneSemanticLabelList"

  /** OpenXRSpatialComponentPlaneSemanticLabelList.get_plane_semantic_label */
  final def getPlaneSemanticLabel(index: Long): gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.PlaneSemanticLabel = {
    if (gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label == null) gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label = MethodBind.get("OpenXRSpatialComponentPlaneSemanticLabelList", "get_plane_semantic_label", 1889332427L)
    gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.PlaneSemanticLabel(Ptrcall.call1[Long, Long](gdext.classes.OpenXRSpatialComponentPlaneSemanticLabelList.mb_get_plane_semantic_label, livePtr, index))
  }

}

object OpenXRSpatialComponentPlaneSemanticLabelList {
  private[classes] var mb_get_plane_semantic_label: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialComponentPlaneSemanticLabelList.PlaneSemanticLabel`. */
  opaque type PlaneSemanticLabel <: Long = Long

  object PlaneSemanticLabel {
    final val Uncategorized: PlaneSemanticLabel = 1L.asInstanceOf[PlaneSemanticLabel]
    final val Floor: PlaneSemanticLabel = 2L.asInstanceOf[PlaneSemanticLabel]
    final val Wall: PlaneSemanticLabel = 3L.asInstanceOf[PlaneSemanticLabel]
    final val Ceiling: PlaneSemanticLabel = 4L.asInstanceOf[PlaneSemanticLabel]
    final val Table: PlaneSemanticLabel = 5L.asInstanceOf[PlaneSemanticLabel]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PlaneSemanticLabel = value.asInstanceOf[PlaneSemanticLabel]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PlaneSemanticLabel] = scala.IArray[Long](1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[PlaneSemanticLabel]]

    extension (self: PlaneSemanticLabel)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Uncategorized"
        case 2L => "Floor"
        case 3L => "Wall"
        case 4L => "Ceiling"
        case 5L => "Table"
        case other => other.toString
      }
  }
}
