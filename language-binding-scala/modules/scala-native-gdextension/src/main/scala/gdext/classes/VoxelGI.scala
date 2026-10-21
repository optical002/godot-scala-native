package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def setSubdiv(subdiv: Long): Unit = {
    if (gdext.classes.VoxelGI.mb_set_subdiv == null) gdext.classes.VoxelGI.mb_set_subdiv = MethodBind.get("VoxelGI", "set_subdiv", 2240898472L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_subdiv, livePtr, subdiv)
  }

  /** VoxelGI.get_subdiv */
  final def getSubdiv(): Long = {
    if (gdext.classes.VoxelGI.mb_get_subdiv == null) gdext.classes.VoxelGI.mb_get_subdiv = MethodBind.get("VoxelGI", "get_subdiv", 4261647950L)
    Ptrcall.call0[Long](gdext.classes.VoxelGI.mb_get_subdiv, livePtr)
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
  final def setCameraAttributes(camera_attributes: CameraAttributes): Unit = {
    if (gdext.classes.VoxelGI.mb_set_camera_attributes == null) gdext.classes.VoxelGI.mb_set_camera_attributes = MethodBind.get("VoxelGI", "set_camera_attributes", 2817810567L)
    Ptrcall.callVoid1(gdext.classes.VoxelGI.mb_set_camera_attributes, livePtr, Wrappers.handle(camera_attributes))
  }

  /** VoxelGI.get_camera_attributes. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCameraAttributes(): CameraAttributes = {
    if (gdext.classes.VoxelGI.mb_get_camera_attributes == null) gdext.classes.VoxelGI.mb_get_camera_attributes = MethodBind.get("VoxelGI", "get_camera_attributes", 3921283215L)
    Wrappers.owned[CameraAttributes](Ptrcall.call0[Long](gdext.classes.VoxelGI.mb_get_camera_attributes, livePtr))
  }

  /** VoxelGI.bake */
  final def bake(from_node: Node, create_visual_debug: Boolean): Unit = {
    if (gdext.classes.VoxelGI.mb_bake == null) gdext.classes.VoxelGI.mb_bake = MethodBind.get("VoxelGI", "bake", 2781551026L)
    Ptrcall.callVoid2(gdext.classes.VoxelGI.mb_bake, livePtr, Wrappers.handle(from_node), create_visual_debug)
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
}
