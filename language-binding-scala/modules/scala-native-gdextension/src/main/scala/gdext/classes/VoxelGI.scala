package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VoxelGI`, extends `VisualInstance3D`. */
abstract class VoxelGI extends VisualInstance3D {
  override def godotClassName: String = "VoxelGI"

  /** VoxelGI.set_probe_data */
  final def setProbeData(data: VoxelGIData): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGI", "set_probe_data", 1637849675L), hostObject.objectPtr, data.hostObject)

  /** VoxelGI.get_probe_data */
  final def getProbeData(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VoxelGI", "get_probe_data", 1730645405L), hostObject.objectPtr)

  /** VoxelGI.set_subdiv */
  final def setSubdiv(subdiv: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGI", "set_subdiv", 2240898472L), hostObject.objectPtr, subdiv)

  /** VoxelGI.get_subdiv */
  final def getSubdiv(): Long =
    Ptrcall.call0[Long](MethodBind.get("VoxelGI", "get_subdiv", 4261647950L), hostObject.objectPtr)

  /** VoxelGI.set_size */
  final def setSize(size: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGI", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** VoxelGI.get_size */
  final def getSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VoxelGI", "get_size", 3360562783L), hostObject.objectPtr)

  /** VoxelGI.set_camera_attributes */
  final def setCameraAttributes(camera_attributes: CameraAttributes): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGI", "set_camera_attributes", 2817810567L), hostObject.objectPtr, camera_attributes.hostObject)

  /** VoxelGI.get_camera_attributes */
  final def getCameraAttributes(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VoxelGI", "get_camera_attributes", 3921283215L), hostObject.objectPtr)

  /** VoxelGI.bake */
  final def bake(from_node: Node, create_visual_debug: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("VoxelGI", "bake", 2781551026L), hostObject.objectPtr, from_node.hostObject, create_visual_debug)

  /** VoxelGI.debug_bake */
  final def debugBake(): Unit =
    Ptrcall.callVoid0(MethodBind.get("VoxelGI", "debug_bake", 3218959716L), hostObject.objectPtr)

}
