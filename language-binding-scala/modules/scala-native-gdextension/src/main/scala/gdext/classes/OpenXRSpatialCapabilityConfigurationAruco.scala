package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAruco`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAruco extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationAruco"

  /** OpenXRSpatialCapabilityConfigurationAruco.set_aruco_dict */
  final def setArucoDict(arucoDict: gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.ArucoDict): Unit = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "set_aruco_dict", 2268055963L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict, livePtr, arucoDict)
  }

  /** OpenXRSpatialCapabilityConfigurationAruco.get_aruco_dict */
  final def getArucoDict(): gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.ArucoDict = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "get_aruco_dict", 1080386209L)
    gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.ArucoDict(Ptrcall.call0[Long](gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict, livePtr))
  }

}

object OpenXRSpatialCapabilityConfigurationAruco {
  private[classes] var mb_set_aruco_dict: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aruco_dict: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialCapabilityConfigurationAruco.ArucoDict`. */
  opaque type ArucoDict <: Long = Long

  object ArucoDict {
    final val Dict4x450: ArucoDict = 1L.asInstanceOf[ArucoDict]
    final val Dict4x4100: ArucoDict = 2L.asInstanceOf[ArucoDict]
    final val Dict4x4250: ArucoDict = 3L.asInstanceOf[ArucoDict]
    final val Dict4x41000: ArucoDict = 4L.asInstanceOf[ArucoDict]
    final val Dict5x550: ArucoDict = 5L.asInstanceOf[ArucoDict]
    final val Dict5x5100: ArucoDict = 6L.asInstanceOf[ArucoDict]
    final val Dict5x5250: ArucoDict = 7L.asInstanceOf[ArucoDict]
    final val Dict5x51000: ArucoDict = 8L.asInstanceOf[ArucoDict]
    final val Dict6x650: ArucoDict = 9L.asInstanceOf[ArucoDict]
    final val Dict6x6100: ArucoDict = 10L.asInstanceOf[ArucoDict]
    final val Dict6x6250: ArucoDict = 11L.asInstanceOf[ArucoDict]
    final val Dict6x61000: ArucoDict = 12L.asInstanceOf[ArucoDict]
    final val Dict7x750: ArucoDict = 13L.asInstanceOf[ArucoDict]
    final val Dict7x7100: ArucoDict = 14L.asInstanceOf[ArucoDict]
    final val Dict7x7250: ArucoDict = 15L.asInstanceOf[ArucoDict]
    final val Dict7x71000: ArucoDict = 16L.asInstanceOf[ArucoDict]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ArucoDict = value.asInstanceOf[ArucoDict]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ArucoDict] = scala.IArray[Long](1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L).asInstanceOf[scala.IArray[ArucoDict]]

    extension (self: ArucoDict)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Dict4x450"
        case 2L => "Dict4x4100"
        case 3L => "Dict4x4250"
        case 4L => "Dict4x41000"
        case 5L => "Dict5x550"
        case 6L => "Dict5x5100"
        case 7L => "Dict5x5250"
        case 8L => "Dict5x51000"
        case 9L => "Dict6x650"
        case 10L => "Dict6x6100"
        case 11L => "Dict6x6250"
        case 12L => "Dict6x61000"
        case 13L => "Dict7x750"
        case 14L => "Dict7x7100"
        case 15L => "Dict7x7250"
        case 16L => "Dict7x71000"
        case other => other.toString
      }
  }
}
