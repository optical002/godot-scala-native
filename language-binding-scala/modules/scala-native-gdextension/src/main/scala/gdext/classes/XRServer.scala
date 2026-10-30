package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setWorldOrigin(worldOrigin: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRServer.mb_set_world_origin == null) gdext.classes.XRServer.mb_set_world_origin = MethodBind.get("XRServer", "set_world_origin", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.XRServer.mb_set_world_origin, livePtr, worldOrigin)
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
  final def centerOnHmd(rotationMode: gdext.classes.XRServer.RotationMode, keepHeight: Boolean): Unit = {
    if (gdext.classes.XRServer.mb_center_on_hmd == null) gdext.classes.XRServer.mb_center_on_hmd = MethodBind.get("XRServer", "center_on_hmd", 1450904707L)
    Ptrcall.callVoid2(gdext.classes.XRServer.mb_center_on_hmd, livePtr, rotationMode, keepHeight)
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
  final def getTracker(trackerName: String): XRTracker = {
    if (gdext.classes.XRServer.mb_get_tracker == null) gdext.classes.XRServer.mb_get_tracker = MethodBind.get("XRServer", "get_tracker", 147382240L)
    Wrappers.owned[XRTracker](Ptrcall.call1[SnArg, Long](gdext.classes.XRServer.mb_get_tracker, livePtr, SnArg(trackerName)))
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

  /** Forwards to [[singleton]]: XRServer.get_world_scale */
  final def getWorldScale(): Double =
    singleton.getWorldScale()

  /** Forwards to [[singleton]]: XRServer.set_world_scale */
  final def setWorldScale(scale: Double): Unit =
    singleton.setWorldScale(scale)

  /** Forwards to [[singleton]]: XRServer.get_world_origin */
  final def getWorldOrigin(): gdext.builtin.Transform3D =
    singleton.getWorldOrigin()

  /** Forwards to [[singleton]]: XRServer.set_world_origin */
  final def setWorldOrigin(worldOrigin: gdext.builtin.Transform3D): Unit =
    singleton.setWorldOrigin(worldOrigin)

  /** Forwards to [[singleton]]: XRServer.get_reference_frame */
  final def getReferenceFrame(): gdext.builtin.Transform3D =
    singleton.getReferenceFrame()

  /** Forwards to [[singleton]]: XRServer.clear_reference_frame */
  final def clearReferenceFrame(): Unit =
    singleton.clearReferenceFrame()

  /** Forwards to [[singleton]]: XRServer.center_on_hmd */
  final def centerOnHmd(rotationMode: gdext.classes.XRServer.RotationMode, keepHeight: Boolean): Unit =
    singleton.centerOnHmd(rotationMode, keepHeight)

  /** Forwards to [[singleton]]: XRServer.get_hmd_transform */
  final def getHmdTransform(): gdext.builtin.Transform3D =
    singleton.getHmdTransform()

  /** Forwards to [[singleton]]: XRServer.set_camera_locked_to_origin */
  final def setCameraLockedToOrigin(enabled: Boolean): Unit =
    singleton.setCameraLockedToOrigin(enabled)

  /** Forwards to [[singleton]]: XRServer.is_camera_locked_to_origin */
  final def isCameraLockedToOrigin(): Boolean =
    singleton.isCameraLockedToOrigin()

  /** Forwards to [[singleton]]: XRServer.add_interface */
  final def addInterface(interface: XRInterface): Unit =
    singleton.addInterface(interface)

  /** Forwards to [[singleton]]: XRServer.get_interface_count */
  final def getInterfaceCount(): Long =
    singleton.getInterfaceCount()

  /** Forwards to [[singleton]]: XRServer.remove_interface */
  final def removeInterface(interface: XRInterface): Unit =
    singleton.removeInterface(interface)

  /** Forwards to [[singleton]]: XRServer.get_interface */
  final def getInterface(idx: Long): XRInterface =
    singleton.getInterface(idx)

  /** Forwards to [[singleton]]: XRServer.find_interface */
  final def findInterface(name: String): XRInterface =
    singleton.findInterface(name)

  /** Forwards to [[singleton]]: XRServer.add_tracker */
  final def addTracker(tracker: XRTracker): Unit =
    singleton.addTracker(tracker)

  /** Forwards to [[singleton]]: XRServer.remove_tracker */
  final def removeTracker(tracker: XRTracker): Unit =
    singleton.removeTracker(tracker)

  /** Forwards to [[singleton]]: XRServer.get_tracker */
  final def getTracker(trackerName: String): XRTracker =
    singleton.getTracker(trackerName)

  /** Forwards to [[singleton]]: XRServer.get_primary_interface */
  final def getPrimaryInterface(): XRInterface =
    singleton.getPrimaryInterface()

  /** Forwards to [[singleton]]: XRServer.set_primary_interface */
  final def setPrimaryInterface(interface: XRInterface): Unit =
    singleton.setPrimaryInterface(interface)

  /** Godot enum `XRServer.TrackerType`. */
  opaque type TrackerType <: Long = Long

  object TrackerType {
    final val Head: TrackerType = 1L.asInstanceOf[TrackerType]
    final val Controller: TrackerType = 2L.asInstanceOf[TrackerType]
    final val Basestation: TrackerType = 4L.asInstanceOf[TrackerType]
    final val Anchor: TrackerType = 8L.asInstanceOf[TrackerType]
    final val Hand: TrackerType = 16L.asInstanceOf[TrackerType]
    final val Body: TrackerType = 32L.asInstanceOf[TrackerType]
    final val Face: TrackerType = 64L.asInstanceOf[TrackerType]
    final val AnyKnown: TrackerType = 127L.asInstanceOf[TrackerType]
    final val Unknown: TrackerType = 128L.asInstanceOf[TrackerType]
    final val Any: TrackerType = 255L.asInstanceOf[TrackerType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TrackerType = value.asInstanceOf[TrackerType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TrackerType] = scala.IArray[Long](1L, 2L, 4L, 8L, 16L, 32L, 64L, 127L, 128L, 255L).asInstanceOf[scala.IArray[TrackerType]]

    extension (self: TrackerType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Head"
        case 2L => "Controller"
        case 4L => "Basestation"
        case 8L => "Anchor"
        case 16L => "Hand"
        case 32L => "Body"
        case 64L => "Face"
        case 127L => "AnyKnown"
        case 128L => "Unknown"
        case 255L => "Any"
        case other => other.toString
      }
  }

  /** Godot enum `XRServer.RotationMode`. */
  opaque type RotationMode <: Long = Long

  object RotationMode {
    final val ResetFullRotation: RotationMode = 0L.asInstanceOf[RotationMode]
    final val ResetButKeepTilt: RotationMode = 1L.asInstanceOf[RotationMode]
    final val DontResetRotation: RotationMode = 2L.asInstanceOf[RotationMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RotationMode = value.asInstanceOf[RotationMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RotationMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[RotationMode]]

    extension (self: RotationMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ResetFullRotation"
        case 1L => "ResetButKeepTilt"
        case 2L => "DontResetRotation"
        case other => other.toString
      }
  }
}
