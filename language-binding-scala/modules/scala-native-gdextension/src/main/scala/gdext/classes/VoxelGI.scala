package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VoxelGI`, extends `VisualInstance3D`. */
abstract class VoxelGI extends VisualInstance3D {
  override def godotClassName: String = "VoxelGI"

  /** VoxelGI.set_probe_data */
  final def setProbeData(data: VoxelGIData): Unit = {
    if (gdext.classes.VoxelGI.mb_set_probe_data == null) gdext.classes.VoxelGI.mb_set_probe_data = MethodBind.get("VoxelGI", "set_probe_data", 1637849675L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_probe_data, livePtr, Wrappers.handle(data))
  }

  /** VoxelGI.get_probe_data. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProbeData(): VoxelGIData = {
    if (gdext.classes.VoxelGI.mb_get_probe_data == null) gdext.classes.VoxelGI.mb_get_probe_data = MethodBind.get("VoxelGI", "get_probe_data", 1730645405L)
    Wrappers.owned[VoxelGIData](Ptrcall.call0[Long](gdext.classes.VoxelGI.mb_get_probe_data, livePtr))
  }

  /** VoxelGI.set_subdiv */
  final def setSubdiv(subdiv: gdext.classes.VoxelGI.Subdiv): Unit = {
    if (gdext.classes.VoxelGI.mb_set_subdiv == null) gdext.classes.VoxelGI.mb_set_subdiv = MethodBind.get("VoxelGI", "set_subdiv", 2240898472L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_subdiv, livePtr, subdiv)
  }

  /** VoxelGI.get_subdiv */
  final def getSubdiv(): gdext.classes.VoxelGI.Subdiv = {
    if (gdext.classes.VoxelGI.mb_get_subdiv == null) gdext.classes.VoxelGI.mb_get_subdiv = MethodBind.get("VoxelGI", "get_subdiv", 4261647950L)
    gdext.classes.VoxelGI.Subdiv(Ptrcall.call0[Long](gdext.classes.VoxelGI.mb_get_subdiv, livePtr))
  }

  /** VoxelGI.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.VoxelGI.mb_set_size == null) gdext.classes.VoxelGI.mb_set_size = MethodBind.get("VoxelGI", "set_size", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_size, livePtr, size)
  }

  /** VoxelGI.get_size */
  final def getSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.VoxelGI.mb_get_size == null) gdext.classes.VoxelGI.mb_get_size = MethodBind.get("VoxelGI", "get_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VoxelGI.mb_get_size, livePtr)
  }

  /** VoxelGI.set_camera_attributes */
  final def setCameraAttributes(cameraAttributes: CameraAttributes): Unit = {
    if (gdext.classes.VoxelGI.mb_set_camera_attributes == null) gdext.classes.VoxelGI.mb_set_camera_attributes = MethodBind.get("VoxelGI", "set_camera_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_camera_attributes, livePtr, Wrappers.handle(cameraAttributes))
  }

  /** VoxelGI.get_camera_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCameraAttributes(): CameraAttributes = {
    if (gdext.classes.VoxelGI.mb_get_camera_attributes == null) gdext.classes.VoxelGI.mb_get_camera_attributes = MethodBind.get("VoxelGI", "get_camera_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.VoxelGI.mb_get_camera_attributes, livePtr))
  }

  /** VoxelGI.bake */
  final def bake(fromNode: Node = null, createVisualDebug: Boolean = false): Unit = {
    if (gdext.classes.VoxelGI.mb_bake == null) gdext.classes.VoxelGI.mb_bake = MethodBind.get("VoxelGI", "bake", 2781551026L)
    Ptrcall.callVoid2(gdext.classes.VoxelGI.mb_bake, livePtr, Wrappers.handle(fromNode), createVisualDebug)
  }

  /** VoxelGI.debug_bake */
  final def debugBake(): Unit = {
    if (gdext.classes.VoxelGI.mb_debug_bake == null) gdext.classes.VoxelGI.mb_debug_bake = MethodBind.get("VoxelGI", "debug_bake", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.VoxelGI.mb_debug_bake, livePtr)
  }

}

object VoxelGI {
  private[classes] var mb_set_probe_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_probe_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_subdiv: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_subdiv: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_camera_attributes: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake: GDExtensionMethodBindPtr = null
  private[classes] var mb_debug_bake: GDExtensionMethodBindPtr = null

  /** Godot enum `VoxelGI.Subdiv`. */
  opaque type Subdiv <: Long = Long

  object Subdiv {
    final val Subdiv64: Subdiv = 0L.asInstanceOf[Subdiv]
    final val Subdiv128: Subdiv = 1L.asInstanceOf[Subdiv]
    final val Subdiv256: Subdiv = 2L.asInstanceOf[Subdiv]
    final val Subdiv512: Subdiv = 3L.asInstanceOf[Subdiv]
    final val Max: Subdiv = 4L.asInstanceOf[Subdiv]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Subdiv = value.asInstanceOf[Subdiv]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Subdiv] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Subdiv]]

    extension (self: Subdiv)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Subdiv64"
        case 1L => "Subdiv128"
        case 2L => "Subdiv256"
        case 3L => "Subdiv512"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
