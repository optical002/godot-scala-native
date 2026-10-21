package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAprilTag`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAprilTag extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationAprilTag"

  /** OpenXRSpatialCapabilityConfigurationAprilTag.set_april_dict */
  final def setAprilDict(april_dict: Long): Unit = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "set_april_dict", 3902905799L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_set_april_dict, livePtr, april_dict)
  }

  /** OpenXRSpatialCapabilityConfigurationAprilTag.get_april_dict */
  final def getAprilDict(): Long = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "get_april_dict", 440273016L)
    Ptrcall.call0[Long](gdext.classes.OpenXRSpatialCapabilityConfigurationAprilTag.mb_get_april_dict, livePtr)
  }

}

object OpenXRSpatialCapabilityConfigurationAprilTag {
  private[classes] var mb_set_april_dict: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_april_dict: GDExtensionMethodBindPtr = null
}
