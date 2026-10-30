package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAprilTag`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAprilTag extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationAprilTag"

  /** OpenXRSpatialCapabilityConfigurationAprilTag.set_april_dict */
  final def setAprilDict(aprilDict: gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.AprilTagDict): Unit = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "set_april_dict", 3902905799L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict, livePtr, aprilDict)
  }

  /** OpenXRSpatialCapabilityConfigurationAprilTag.get_april_dict */
  final def getAprilDict(): gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.AprilTagDict = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "get_april_dict", 440273016L)
    gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.AprilTagDict(Ptrcall.call0[Long](gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict, livePtr))
  }

}

object OpenXRSpatialCapabilityConfigurationAprilTag {
  private[classes] var mb_set_april_dict: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_april_dict: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialCapabilityConfigurationAprilTag.AprilTagDict`. */
  opaque type AprilTagDict <: Long = Long

  object AprilTagDict {
    final val Dict16h5: AprilTagDict = 1L.asInstanceOf[AprilTagDict]
    final val Dict25h9: AprilTagDict = 2L.asInstanceOf[AprilTagDict]
    final val Dict36h10: AprilTagDict = 3L.asInstanceOf[AprilTagDict]
    final val Dict36h11: AprilTagDict = 4L.asInstanceOf[AprilTagDict]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): AprilTagDict = value.asInstanceOf[AprilTagDict]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[AprilTagDict] = scala.IArray[Long](1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[AprilTagDict]]

    extension (self: AprilTagDict)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Dict16h5"
        case 2L => "Dict25h9"
        case 3L => "Dict36h10"
        case 4L => "Dict36h11"
        case other => other.toString
      }
  }
}
