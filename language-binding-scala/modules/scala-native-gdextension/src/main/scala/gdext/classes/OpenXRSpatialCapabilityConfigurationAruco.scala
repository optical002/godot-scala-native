package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAruco`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAruco extends OpenXRSpatialCapabilityConfigurationBaseHeader {

  /** OpenXRSpatialCapabilityConfigurationAruco.set_aruco_dict */
  final def setArucoDict(aruco_dict: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "set_aruco_dict", 2268055963L), hostObject.objectPtr, aruco_dict)

  /** OpenXRSpatialCapabilityConfigurationAruco.get_aruco_dict */
  final def getArucoDict(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRSpatialCapabilityConfigurationAruco", "get_aruco_dict", 1080386209L), hostObject.objectPtr)

}

object OpenXRSpatialCapabilityConfigurationAruco {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationAruco] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationAruco] with {
    def className = "OpenXRSpatialCapabilityConfigurationAruco"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationAruco = new OpenXRSpatialCapabilityConfigurationAruco {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationAruco): GodotObject = t.hostObject
  }
}
