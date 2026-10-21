package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VoxelGIData`, extends `Resource`. */
abstract class VoxelGIData extends Resource {
  override def godotClassName: String = "VoxelGIData"

  /** VoxelGIData.get_bounds */
  final def getBounds(): gdext.builtin.AABB = {
    if (gdext.classes.VoxelGIData.mb_get_bounds == null) gdext.classes.VoxelGIData.mb_get_bounds = MethodBind.get("VoxelGIData", "get_bounds", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.VoxelGIData.mb_get_bounds, livePtr)
  }

  /** VoxelGIData.get_octree_size */
  final def getOctreeSize(): gdext.builtin.Vector3 = {
    if (gdext.classes.VoxelGIData.mb_get_octree_size == null) gdext.classes.VoxelGIData.mb_get_octree_size = MethodBind.get("VoxelGIData", "get_octree_size", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VoxelGIData.mb_get_octree_size, livePtr)
  }

  /** VoxelGIData.get_to_cell_xform */
  final def getToCellXform(): gdext.builtin.Transform3D = {
    if (gdext.classes.VoxelGIData.mb_get_to_cell_xform == null) gdext.classes.VoxelGIData.mb_get_to_cell_xform = MethodBind.get("VoxelGIData", "get_to_cell_xform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.VoxelGIData.mb_get_to_cell_xform, livePtr)
  }

  /** VoxelGIData.set_dynamic_range */
  final def setDynamicRange(dynamic_range: Double): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_dynamic_range == null) gdext.classes.VoxelGIData.mb_set_dynamic_range = MethodBind.get("VoxelGIData", "set_dynamic_range", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_dynamic_range, livePtr, dynamic_range)
  }

  /** VoxelGIData.get_dynamic_range */
  final def getDynamicRange(): Double = {
    if (gdext.classes.VoxelGIData.mb_get_dynamic_range == null) gdext.classes.VoxelGIData.mb_get_dynamic_range = MethodBind.get("VoxelGIData", "get_dynamic_range", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VoxelGIData.mb_get_dynamic_range, livePtr)
  }

  /** VoxelGIData.set_energy */
  final def setEnergy(energy: Double): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_energy == null) gdext.classes.VoxelGIData.mb_set_energy = MethodBind.get("VoxelGIData", "set_energy", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_energy, livePtr, energy)
  }

  /** VoxelGIData.get_energy */
  final def getEnergy(): Double = {
    if (gdext.classes.VoxelGIData.mb_get_energy == null) gdext.classes.VoxelGIData.mb_get_energy = MethodBind.get("VoxelGIData", "get_energy", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VoxelGIData.mb_get_energy, livePtr)
  }

  /** VoxelGIData.set_bias */
  final def setBias(bias: Double): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_bias == null) gdext.classes.VoxelGIData.mb_set_bias = MethodBind.get("VoxelGIData", "set_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_bias, livePtr, bias)
  }

  /** VoxelGIData.get_bias */
  final def getBias(): Double = {
    if (gdext.classes.VoxelGIData.mb_get_bias == null) gdext.classes.VoxelGIData.mb_get_bias = MethodBind.get("VoxelGIData", "get_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VoxelGIData.mb_get_bias, livePtr)
  }

  /** VoxelGIData.set_normal_bias */
  final def setNormalBias(bias: Double): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_normal_bias == null) gdext.classes.VoxelGIData.mb_set_normal_bias = MethodBind.get("VoxelGIData", "set_normal_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_normal_bias, livePtr, bias)
  }

  /** VoxelGIData.get_normal_bias */
  final def getNormalBias(): Double = {
    if (gdext.classes.VoxelGIData.mb_get_normal_bias == null) gdext.classes.VoxelGIData.mb_get_normal_bias = MethodBind.get("VoxelGIData", "get_normal_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VoxelGIData.mb_get_normal_bias, livePtr)
  }

  /** VoxelGIData.set_propagation */
  final def setPropagation(propagation: Double): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_propagation == null) gdext.classes.VoxelGIData.mb_set_propagation = MethodBind.get("VoxelGIData", "set_propagation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_propagation, livePtr, propagation)
  }

  /** VoxelGIData.get_propagation */
  final def getPropagation(): Double = {
    if (gdext.classes.VoxelGIData.mb_get_propagation == null) gdext.classes.VoxelGIData.mb_get_propagation = MethodBind.get("VoxelGIData", "get_propagation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VoxelGIData.mb_get_propagation, livePtr)
  }

  /** VoxelGIData.set_interior */
  final def setInterior(interior: Boolean): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_interior == null) gdext.classes.VoxelGIData.mb_set_interior = MethodBind.get("VoxelGIData", "set_interior", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_interior, livePtr, interior)
  }

  /** VoxelGIData.is_interior */
  final def isInterior(): Boolean = {
    if (gdext.classes.VoxelGIData.mb_is_interior == null) gdext.classes.VoxelGIData.mb_is_interior = MethodBind.get("VoxelGIData", "is_interior", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VoxelGIData.mb_is_interior, livePtr)
  }

  /** VoxelGIData.set_use_two_bounces */
  final def setUseTwoBounces(enable: Boolean): Unit = {
    if (gdext.classes.VoxelGIData.mb_set_use_two_bounces == null) gdext.classes.VoxelGIData.mb_set_use_two_bounces = MethodBind.get("VoxelGIData", "set_use_two_bounces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VoxelGIData.mb_set_use_two_bounces, livePtr, enable)
  }

  /** VoxelGIData.is_using_two_bounces */
  final def isUsingTwoBounces(): Boolean = {
    if (gdext.classes.VoxelGIData.mb_is_using_two_bounces == null) gdext.classes.VoxelGIData.mb_is_using_two_bounces = MethodBind.get("VoxelGIData", "is_using_two_bounces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VoxelGIData.mb_is_using_two_bounces, livePtr)
  }

}

object VoxelGIData {
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_octree_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_to_cell_xform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_dynamic_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_dynamic_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_energy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_normal_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_propagation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_propagation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_interior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_two_bounces: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_two_bounces: GDExtensionMethodBindPtr = null
}
