package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAruco`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAruco extends OpenXRSpatialCapabilityConfigurationBaseHeader {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationAruco"

  /** OpenXRSpatialCapabilityConfigurationAruco.set_aruco_dict */
  final def setArucoDict(aruco_dict: Long): Unit = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "set_aruco_dict", 2268055963L)
    Ptrcall.callVoid1(gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_set_aruco_dict, livePtr, aruco_dict)
  }

  /** OpenXRSpatialCapabilityConfigurationAruco.get_aruco_dict */
  final def getArucoDict(): Long = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict == null) gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict = MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "get_aruco_dict", 1080386209L)
    Ptrcall.call0[Long](gdext.classes.OpenXRSpatialCapabilityConfigurationAruco.mb_get_aruco_dict, livePtr)
  }

}

object OpenXRSpatialCapabilityConfigurationAruco {
  private[classes] var mb_set_aruco_dict: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aruco_dict: GDExtensionMethodBindPtr = null
}
