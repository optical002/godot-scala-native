package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRServer`, extends `Object`. */
abstract class XRServer extends Object {
  override def godotClassName: String = "XRServer"

  /** XRServer.get_world_scale */
  final def getWorldScale(): Double = {
    if (gdext.classes.XRServer.mb_get_world_scale == null) gdext.classes.XRServer.mb_get_world_scale = MethodBind.get("XRServer", "get_world_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.XRServer.mb_get_world_scale, livePtr)
  }

  /** XRServer.set_world_scale */
  final def setWorldScale(scale: Double): Unit = {
    if (gdext.classes.XRServer.mb_set_world_scale == null) gdext.classes.XRServer.mb_set_world_scale = MethodBind.get("XRServer", "set_world_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_set_world_scale, livePtr, scale)
  }

  /** XRServer.get_world_origin */
  final def getWorldOrigin(): gdext.builtin.Transform3D = {
    if (gdext.classes.XRServer.mb_get_world_origin == null) gdext.classes.XRServer.mb_get_world_origin = MethodBind.get("XRServer", "get_world_origin", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.XRServer.mb_get_world_origin, livePtr)
  }

  /** XRServer.set_world_origin */
  final def setWorldOrigin(world_origin: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRServer.mb_set_world_origin == null) gdext.classes.XRServer.mb_set_world_origin = MethodBind.get("XRServer", "set_world_origin", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_set_world_origin, livePtr, world_origin)
  }

  /** XRServer.get_reference_frame */
  final def getReferenceFrame(): gdext.builtin.Transform3D = {
    if (gdext.classes.XRServer.mb_get_reference_frame == null) gdext.classes.XRServer.mb_get_reference_frame = MethodBind.get("XRServer", "get_reference_frame", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.XRServer.mb_get_reference_frame, livePtr)
  }

  /** XRServer.clear_reference_frame */
  final def clearReferenceFrame(): Unit = {
    if (gdext.classes.XRServer.mb_clear_reference_frame == null) gdext.classes.XRServer.mb_clear_reference_frame = MethodBind.get("XRServer", "clear_reference_frame", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.XRServer.mb_clear_reference_frame, livePtr)
  }

  /** XRServer.center_on_hmd */
  final def centerOnHmd(rotation_mode: Long, keep_height: Boolean): Unit = {
    if (gdext.classes.XRServer.mb_center_on_hmd == null) gdext.classes.XRServer.mb_center_on_hmd = MethodBind.get("XRServer", "center_on_hmd", 1450904707L)
    Ptrcall.callVoid2(gdext.classes.XRServer.mb_center_on_hmd, livePtr, rotation_mode, keep_height)
  }

  /** XRServer.get_hmd_transform */
  final def getHmdTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.XRServer.mb_get_hmd_transform == null) gdext.classes.XRServer.mb_get_hmd_transform = MethodBind.get("XRServer", "get_hmd_transform", 4183770049L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.XRServer.mb_get_hmd_transform, livePtr)
  }

  /** XRServer.set_camera_locked_to_origin */
  final def setCameraLockedToOrigin(enabled: Boolean): Unit = {
    if (gdext.classes.XRServer.mb_set_camera_locked_to_origin == null) gdext.classes.XRServer.mb_set_camera_locked_to_origin = MethodBind.get("XRServer", "set_camera_locked_to_origin", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_set_camera_locked_to_origin, livePtr, enabled)
  }

  /** XRServer.is_camera_locked_to_origin */
  final def isCameraLockedToOrigin(): Boolean = {
    if (gdext.classes.XRServer.mb_is_camera_locked_to_origin == null) gdext.classes.XRServer.mb_is_camera_locked_to_origin = MethodBind.get("XRServer", "is_camera_locked_to_origin", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRServer.mb_is_camera_locked_to_origin, livePtr)
  }

  /** XRServer.add_interface */
  final def addInterface(interface: XRInterface): Unit = {
    if (gdext.classes.XRServer.mb_add_interface == null) gdext.classes.XRServer.mb_add_interface = MethodBind.get("XRServer", "add_interface", 1898711491L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_add_interface, livePtr, Wrappers.handle(interface))
  }

  /** XRServer.get_interface_count */
  final def getInterfaceCount(): Long = {
    if (gdext.classes.XRServer.mb_get_interface_count == null) gdext.classes.XRServer.mb_get_interface_count = MethodBind.get("XRServer", "get_interface_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.XRServer.mb_get_interface_count, livePtr)
  }

  /** XRServer.remove_interface */
  final def removeInterface(interface: XRInterface): Unit = {
    if (gdext.classes.XRServer.mb_remove_interface == null) gdext.classes.XRServer.mb_remove_interface = MethodBind.get("XRServer", "remove_interface", 1898711491L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_remove_interface, livePtr, Wrappers.handle(interface))
  }

  /** XRServer.get_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getInterface(idx: Long): XRInterface = {
    if (gdext.classes.XRServer.mb_get_interface == null) gdext.classes.XRServer.mb_get_interface = MethodBind.get("XRServer", "get_interface", 4237347919L)
    Wrappers.owned[XRInterface](Ptrcall.call1[Long, Long](gdext.classes.XRServer.mb_get_interface, livePtr, idx))
  }

  /** XRServer.find_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def findInterface(name: String): XRInterface = {
    if (gdext.classes.XRServer.mb_find_interface == null) gdext.classes.XRServer.mb_find_interface = MethodBind.get("XRServer", "find_interface", 1395192955L)
    Wrappers.owned[XRInterface](Ptrcall.call1[String, Long](gdext.classes.XRServer.mb_find_interface, livePtr, name))
  }

  /** XRServer.add_tracker */
  final def addTracker(tracker: XRTracker): Unit = {
    if (gdext.classes.XRServer.mb_add_tracker == null) gdext.classes.XRServer.mb_add_tracker = MethodBind.get("XRServer", "add_tracker", 684804553L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_add_tracker, livePtr, Wrappers.handle(tracker))
  }

  /** XRServer.remove_tracker */
  final def removeTracker(tracker: XRTracker): Unit = {
    if (gdext.classes.XRServer.mb_remove_tracker == null) gdext.classes.XRServer.mb_remove_tracker = MethodBind.get("XRServer", "remove_tracker", 684804553L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_remove_tracker, livePtr, Wrappers.handle(tracker))
  }

  /** XRServer.get_tracker. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTracker(tracker_name: gdext.builtin.StringName): XRTracker = {
    if (gdext.classes.XRServer.mb_get_tracker == null) gdext.classes.XRServer.mb_get_tracker = MethodBind.get("XRServer", "get_tracker", 147382240L)
    Wrappers.owned[XRTracker](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.XRServer.mb_get_tracker, livePtr, tracker_name))
  }

  /** XRServer.get_primary_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPrimaryInterface(): XRInterface = {
    if (gdext.classes.XRServer.mb_get_primary_interface == null) gdext.classes.XRServer.mb_get_primary_interface = MethodBind.get("XRServer", "get_primary_interface", 2143545064L)
    Wrappers.owned[XRInterface](Ptrcall.call0[Long](gdext.classes.XRServer.mb_get_primary_interface, livePtr))
  }

  /** XRServer.set_primary_interface */
  final def setPrimaryInterface(interface: XRInterface): Unit = {
    if (gdext.classes.XRServer.mb_set_primary_interface == null) gdext.classes.XRServer.mb_set_primary_interface = MethodBind.get("XRServer", "set_primary_interface", 1898711491L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_set_primary_interface, livePtr, Wrappers.handle(interface))
  }

}

object XRServer {
  private[classes] var mb_get_world_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_world_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_world_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_world_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_reference_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_center_on_hmd: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hmd_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_locked_to_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_camera_locked_to_origin: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interface_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_find_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_primary_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_primary_interface: GDExtensionMethodBindPtr = null

  private var instance: XRServer = null

  /** The process-global XRServer singleton instance. */
  def singleton: XRServer = {
    if (instance == null)
      instance = Wrappers.borrowed[XRServer](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("XRServer").ptr)))
    instance
  }
}
