package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRServer`, extends `Object`. */
abstract class XRServer extends Object {
  override def godotClassName: String = "XRServer"

  /** XRServer.get_world_scale */
  final def getWorldScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("XRServer", "get_world_scale", 1740695150L), hostObject.objectPtr)

  /** XRServer.set_world_scale */
  final def setWorldScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "set_world_scale", 373806689L), hostObject.objectPtr, scale)

  /** XRServer.get_world_origin */
  final def getWorldOrigin(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("XRServer", "get_world_origin", 3229777777L), hostObject.objectPtr)

  /** XRServer.set_world_origin */
  final def setWorldOrigin(world_origin: gdext.builtin.Transform3D): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "set_world_origin", 2952846383L), hostObject.objectPtr, world_origin)

  /** XRServer.get_reference_frame */
  final def getReferenceFrame(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("XRServer", "get_reference_frame", 3229777777L), hostObject.objectPtr)

  /** XRServer.clear_reference_frame */
  final def clearReferenceFrame(): Unit =
    Ptrcall.callVoid0(MethodBind.get("XRServer", "clear_reference_frame", 3218959716L), hostObject.objectPtr)

  /** XRServer.center_on_hmd */
  final def centerOnHmd(rotation_mode: Long, keep_height: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRServer", "center_on_hmd", 1450904707L), hostObject.objectPtr, rotation_mode, keep_height)

  /** XRServer.get_hmd_transform */
  final def getHmdTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("XRServer", "get_hmd_transform", 4183770049L), hostObject.objectPtr)

  /** XRServer.set_camera_locked_to_origin */
  final def setCameraLockedToOrigin(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "set_camera_locked_to_origin", 2586408642L), hostObject.objectPtr, enabled)

  /** XRServer.is_camera_locked_to_origin */
  final def isCameraLockedToOrigin(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("XRServer", "is_camera_locked_to_origin", 36873697L), hostObject.objectPtr)

  /** XRServer.add_interface */
  final def addInterface(interface: XRInterface): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "add_interface", 1898711491L), hostObject.objectPtr, interface.hostObject)

  /** XRServer.get_interface_count */
  final def getInterfaceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRServer", "get_interface_count", 3905245786L), hostObject.objectPtr)

  /** XRServer.remove_interface */
  final def removeInterface(interface: XRInterface): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "remove_interface", 1898711491L), hostObject.objectPtr, interface.hostObject)

  /** XRServer.get_interface */
  final def getInterface(idx: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("XRServer", "get_interface", 4237347919L), hostObject.objectPtr, idx)

  /** XRServer.find_interface */
  final def findInterface(name: String): GodotObject =
    Ptrcall.call1[String, GodotObject](MethodBind.get("XRServer", "find_interface", 1395192955L), hostObject.objectPtr, name)

  /** XRServer.add_tracker */
  final def addTracker(tracker: XRTracker): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "add_tracker", 684804553L), hostObject.objectPtr, tracker.hostObject)

  /** XRServer.remove_tracker */
  final def removeTracker(tracker: XRTracker): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "remove_tracker", 684804553L), hostObject.objectPtr, tracker.hostObject)

  /** XRServer.get_tracker */
  final def getTracker(tracker_name: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("XRServer", "get_tracker", 147382240L), hostObject.objectPtr, tracker_name)

  /** XRServer.get_primary_interface */
  final def getPrimaryInterface(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("XRServer", "get_primary_interface", 2143545064L), hostObject.objectPtr)

  /** XRServer.set_primary_interface */
  final def setPrimaryInterface(interface: XRInterface): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRServer", "set_primary_interface", 1898711491L), hostObject.objectPtr, interface.hostObject)

}

object XRServer {
  /** The process-global XRServer singleton instance. */
  def singleton: XRServer = new XRServer {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("XRServer").ptr))
}
