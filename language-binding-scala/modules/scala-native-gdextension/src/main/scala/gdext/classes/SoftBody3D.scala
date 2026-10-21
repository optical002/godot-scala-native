package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SoftBody3D`, extends `MeshInstance3D`. */
abstract class SoftBody3D extends MeshInstance3D {
  override def godotClassName: String = "SoftBody3D"

  /** SoftBody3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_collision_mask == null) gdext.classes.SoftBody3D.mb_set_collision_mask = MethodBind.get("SoftBody3D", "set_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_collision_mask, livePtr, collision_mask)
  }

  /** SoftBody3D.get_collision_mask */
  final def getCollisionMask(): Long = {
    if (gdext.classes.SoftBody3D.mb_get_collision_mask == null) gdext.classes.SoftBody3D.mb_get_collision_mask = MethodBind.get("SoftBody3D", "get_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SoftBody3D.mb_get_collision_mask, livePtr)
  }

  /** SoftBody3D.set_collision_layer */
  final def setCollisionLayer(collision_layer: Long): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_collision_layer == null) gdext.classes.SoftBody3D.mb_set_collision_layer = MethodBind.get("SoftBody3D", "set_collision_layer", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_collision_layer, livePtr, collision_layer)
  }

  /** SoftBody3D.get_collision_layer */
  final def getCollisionLayer(): Long = {
    if (gdext.classes.SoftBody3D.mb_get_collision_layer == null) gdext.classes.SoftBody3D.mb_get_collision_layer = MethodBind.get("SoftBody3D", "get_collision_layer", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.SoftBody3D.mb_get_collision_layer, livePtr)
  }

  /** SoftBody3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_collision_mask_value == null) gdext.classes.SoftBody3D.mb_set_collision_mask_value = MethodBind.get("SoftBody3D", "set_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SoftBody3D.mb_set_collision_mask_value, livePtr, layer_number, value)
  }

  /** SoftBody3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.SoftBody3D.mb_get_collision_mask_value == null) gdext.classes.SoftBody3D.mb_get_collision_mask_value = MethodBind.get("SoftBody3D", "get_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SoftBody3D.mb_get_collision_mask_value, livePtr, layer_number)
  }

  /** SoftBody3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_collision_layer_value == null) gdext.classes.SoftBody3D.mb_set_collision_layer_value = MethodBind.get("SoftBody3D", "set_collision_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.SoftBody3D.mb_set_collision_layer_value, livePtr, layer_number, value)
  }

  /** SoftBody3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.SoftBody3D.mb_get_collision_layer_value == null) gdext.classes.SoftBody3D.mb_get_collision_layer_value = MethodBind.get("SoftBody3D", "get_collision_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SoftBody3D.mb_get_collision_layer_value, livePtr, layer_number)
  }

  /** SoftBody3D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_disable_mode == null) gdext.classes.SoftBody3D.mb_set_disable_mode = MethodBind.get("SoftBody3D", "set_disable_mode", 1104158384L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_disable_mode, livePtr, mode)
  }

  /** SoftBody3D.get_disable_mode */
  final def getDisableMode(): Long = {
    if (gdext.classes.SoftBody3D.mb_get_disable_mode == null) gdext.classes.SoftBody3D.mb_get_disable_mode = MethodBind.get("SoftBody3D", "get_disable_mode", 4135042476L)
    Ptrcall.call0[Long](gdext.classes.SoftBody3D.mb_get_disable_mode, livePtr)
  }

  /** SoftBody3D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.SoftBody3D.mb_add_collision_exception_with == null) gdext.classes.SoftBody3D.mb_add_collision_exception_with = MethodBind.get("SoftBody3D", "add_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_add_collision_exception_with, livePtr, Wrappers.handle(body))
  }

  /** SoftBody3D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit = {
    if (gdext.classes.SoftBody3D.mb_remove_collision_exception_with == null) gdext.classes.SoftBody3D.mb_remove_collision_exception_with = MethodBind.get("SoftBody3D", "remove_collision_exception_with", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_remove_collision_exception_with, livePtr, Wrappers.handle(body))
  }

  /** SoftBody3D.set_simulation_precision */
  final def setSimulationPrecision(simulation_precision: Long): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_simulation_precision == null) gdext.classes.SoftBody3D.mb_set_simulation_precision = MethodBind.get("SoftBody3D", "set_simulation_precision", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_simulation_precision, livePtr, simulation_precision)
  }

  /** SoftBody3D.get_simulation_precision */
  final def getSimulationPrecision(): Long = {
    if (gdext.classes.SoftBody3D.mb_get_simulation_precision == null) gdext.classes.SoftBody3D.mb_get_simulation_precision = MethodBind.get("SoftBody3D", "get_simulation_precision", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.SoftBody3D.mb_get_simulation_precision, livePtr)
  }

  /** SoftBody3D.set_total_mass */
  final def setTotalMass(mass: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_total_mass == null) gdext.classes.SoftBody3D.mb_set_total_mass = MethodBind.get("SoftBody3D", "set_total_mass", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_total_mass, livePtr, mass)
  }

  /** SoftBody3D.get_total_mass */
  final def getTotalMass(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_total_mass == null) gdext.classes.SoftBody3D.mb_get_total_mass = MethodBind.get("SoftBody3D", "get_total_mass", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_total_mass, livePtr)
  }

  /** SoftBody3D.set_linear_stiffness */
  final def setLinearStiffness(linear_stiffness: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_linear_stiffness == null) gdext.classes.SoftBody3D.mb_set_linear_stiffness = MethodBind.get("SoftBody3D", "set_linear_stiffness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_linear_stiffness, livePtr, linear_stiffness)
  }

  /** SoftBody3D.get_linear_stiffness */
  final def getLinearStiffness(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_linear_stiffness == null) gdext.classes.SoftBody3D.mb_get_linear_stiffness = MethodBind.get("SoftBody3D", "get_linear_stiffness", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_linear_stiffness, livePtr)
  }

  /** SoftBody3D.set_shrinking_factor */
  final def setShrinkingFactor(shrinking_factor: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_shrinking_factor == null) gdext.classes.SoftBody3D.mb_set_shrinking_factor = MethodBind.get("SoftBody3D", "set_shrinking_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_shrinking_factor, livePtr, shrinking_factor)
  }

  /** SoftBody3D.get_shrinking_factor */
  final def getShrinkingFactor(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_shrinking_factor == null) gdext.classes.SoftBody3D.mb_get_shrinking_factor = MethodBind.get("SoftBody3D", "get_shrinking_factor", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_shrinking_factor, livePtr)
  }

  /** SoftBody3D.set_pressure_coefficient */
  final def setPressureCoefficient(pressure_coefficient: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_pressure_coefficient == null) gdext.classes.SoftBody3D.mb_set_pressure_coefficient = MethodBind.get("SoftBody3D", "set_pressure_coefficient", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_pressure_coefficient, livePtr, pressure_coefficient)
  }

  /** SoftBody3D.get_pressure_coefficient */
  final def getPressureCoefficient(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_pressure_coefficient == null) gdext.classes.SoftBody3D.mb_get_pressure_coefficient = MethodBind.get("SoftBody3D", "get_pressure_coefficient", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_pressure_coefficient, livePtr)
  }

  /** SoftBody3D.set_damping_coefficient */
  final def setDampingCoefficient(damping_coefficient: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_damping_coefficient == null) gdext.classes.SoftBody3D.mb_set_damping_coefficient = MethodBind.get("SoftBody3D", "set_damping_coefficient", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_damping_coefficient, livePtr, damping_coefficient)
  }

  /** SoftBody3D.get_damping_coefficient */
  final def getDampingCoefficient(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_damping_coefficient == null) gdext.classes.SoftBody3D.mb_get_damping_coefficient = MethodBind.get("SoftBody3D", "get_damping_coefficient", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_damping_coefficient, livePtr)
  }

  /** SoftBody3D.set_drag_coefficient */
  final def setDragCoefficient(drag_coefficient: Double): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_drag_coefficient == null) gdext.classes.SoftBody3D.mb_set_drag_coefficient = MethodBind.get("SoftBody3D", "set_drag_coefficient", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_drag_coefficient, livePtr, drag_coefficient)
  }

  /** SoftBody3D.get_drag_coefficient */
  final def getDragCoefficient(): Double = {
    if (gdext.classes.SoftBody3D.mb_get_drag_coefficient == null) gdext.classes.SoftBody3D.mb_get_drag_coefficient = MethodBind.get("SoftBody3D", "get_drag_coefficient", 191475506L)
    Ptrcall.call0[Double](gdext.classes.SoftBody3D.mb_get_drag_coefficient, livePtr)
  }

  /** SoftBody3D.get_point_transform */
  final def getPointTransform(point_index: Long): gdext.builtin.Vector3 = {
    if (gdext.classes.SoftBody3D.mb_get_point_transform == null) gdext.classes.SoftBody3D.mb_get_point_transform = MethodBind.get("SoftBody3D", "get_point_transform", 871989493L)
    Ptrcall.call1[Long, gdext.builtin.Vector3](gdext.classes.SoftBody3D.mb_get_point_transform, livePtr, point_index)
  }

  /** SoftBody3D.apply_impulse */
  final def applyImpulse(point_index: Long, impulse: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SoftBody3D.mb_apply_impulse == null) gdext.classes.SoftBody3D.mb_apply_impulse = MethodBind.get("SoftBody3D", "apply_impulse", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.SoftBody3D.mb_apply_impulse, livePtr, point_index, impulse)
  }

  /** SoftBody3D.apply_force */
  final def applyForce(point_index: Long, force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SoftBody3D.mb_apply_force == null) gdext.classes.SoftBody3D.mb_apply_force = MethodBind.get("SoftBody3D", "apply_force", 1530502735L)
    Ptrcall.callVoid2(gdext.classes.SoftBody3D.mb_apply_force, livePtr, point_index, force)
  }

  /** SoftBody3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SoftBody3D.mb_apply_central_impulse == null) gdext.classes.SoftBody3D.mb_apply_central_impulse = MethodBind.get("SoftBody3D", "apply_central_impulse", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_apply_central_impulse, livePtr, impulse)
  }

  /** SoftBody3D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.SoftBody3D.mb_apply_central_force == null) gdext.classes.SoftBody3D.mb_apply_central_force = MethodBind.get("SoftBody3D", "apply_central_force", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_apply_central_force, livePtr, force)
  }

  /** SoftBody3D.is_point_pinned */
  final def isPointPinned(point_index: Long): Boolean = {
    if (gdext.classes.SoftBody3D.mb_is_point_pinned == null) gdext.classes.SoftBody3D.mb_is_point_pinned = MethodBind.get("SoftBody3D", "is_point_pinned", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.SoftBody3D.mb_is_point_pinned, livePtr, point_index)
  }

  /** SoftBody3D.set_ray_pickable */
  final def setRayPickable(ray_pickable: Boolean): Unit = {
    if (gdext.classes.SoftBody3D.mb_set_ray_pickable == null) gdext.classes.SoftBody3D.mb_set_ray_pickable = MethodBind.get("SoftBody3D", "set_ray_pickable", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SoftBody3D.mb_set_ray_pickable, livePtr, ray_pickable)
  }

  /** SoftBody3D.is_ray_pickable */
  final def isRayPickable(): Boolean = {
    if (gdext.classes.SoftBody3D.mb_is_ray_pickable == null) gdext.classes.SoftBody3D.mb_is_ray_pickable = MethodBind.get("SoftBody3D", "is_ray_pickable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SoftBody3D.mb_is_ray_pickable, livePtr)
  }

}

object SoftBody3D {
  private[classes] var mb_set_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_disable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_disable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_collision_exception_with: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_collision_exception_with: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_simulation_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_simulation_precision: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_total_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_total_mass: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shrinking_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shrinking_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pressure_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pressure_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drag_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drag_coefficient: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_point_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_central_impulse: GDExtensionMethodBindPtr = null
  private[classes] var mb_apply_central_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_point_pinned: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ray_pickable: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ray_pickable: GDExtensionMethodBindPtr = null
}
