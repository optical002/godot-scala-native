package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VoxelGIData`, extends `Resource`. */
abstract class VoxelGIData extends Resource {
  override def godotClassName: String = "VoxelGIData"

  /** VoxelGIData.get_bounds */
  final def getBounds(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("VoxelGIData", "get_bounds", 1068685055L), hostObject.objectPtr)

  /** VoxelGIData.get_octree_size */
  final def getOctreeSize(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VoxelGIData", "get_octree_size", 3360562783L), hostObject.objectPtr)

  /** VoxelGIData.get_to_cell_xform */
  final def getToCellXform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("VoxelGIData", "get_to_cell_xform", 3229777777L), hostObject.objectPtr)

  /** VoxelGIData.set_dynamic_range */
  final def setDynamicRange(dynamic_range: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_dynamic_range", 373806689L), hostObject.objectPtr, dynamic_range)

  /** VoxelGIData.get_dynamic_range */
  final def getDynamicRange(): Double =
    Ptrcall.call0[Double](MethodBind.get("VoxelGIData", "get_dynamic_range", 1740695150L), hostObject.objectPtr)

  /** VoxelGIData.set_energy */
  final def setEnergy(energy: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_energy", 373806689L), hostObject.objectPtr, energy)

  /** VoxelGIData.get_energy */
  final def getEnergy(): Double =
    Ptrcall.call0[Double](MethodBind.get("VoxelGIData", "get_energy", 1740695150L), hostObject.objectPtr)

  /** VoxelGIData.set_bias */
  final def setBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_bias", 373806689L), hostObject.objectPtr, bias)

  /** VoxelGIData.get_bias */
  final def getBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("VoxelGIData", "get_bias", 1740695150L), hostObject.objectPtr)

  /** VoxelGIData.set_normal_bias */
  final def setNormalBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_normal_bias", 373806689L), hostObject.objectPtr, bias)

  /** VoxelGIData.get_normal_bias */
  final def getNormalBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("VoxelGIData", "get_normal_bias", 1740695150L), hostObject.objectPtr)

  /** VoxelGIData.set_propagation */
  final def setPropagation(propagation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_propagation", 373806689L), hostObject.objectPtr, propagation)

  /** VoxelGIData.get_propagation */
  final def getPropagation(): Double =
    Ptrcall.call0[Double](MethodBind.get("VoxelGIData", "get_propagation", 1740695150L), hostObject.objectPtr)

  /** VoxelGIData.set_interior */
  final def setInterior(interior: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_interior", 2586408642L), hostObject.objectPtr, interior)

  /** VoxelGIData.is_interior */
  final def isInterior(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VoxelGIData", "is_interior", 36873697L), hostObject.objectPtr)

  /** VoxelGIData.set_use_two_bounces */
  final def setUseTwoBounces(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VoxelGIData", "set_use_two_bounces", 2586408642L), hostObject.objectPtr, enable)

  /** VoxelGIData.is_using_two_bounces */
  final def isUsingTwoBounces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VoxelGIData", "is_using_two_bounces", 36873697L), hostObject.objectPtr)

}
