package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SoftBody3D`, extends `MeshInstance3D`. */
abstract class SoftBody3D extends MeshInstance3D {

  /** SoftBody3D.set_collision_mask */
  final def setCollisionMask(collision_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_collision_mask", 1286410249L), hostObject.objectPtr, collision_mask)

  /** SoftBody3D.get_collision_mask */
  final def getCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("SoftBody3D", "get_collision_mask", 3905245786L), hostObject.objectPtr)

  /** SoftBody3D.set_collision_layer */
  final def setCollisionLayer(collision_layer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_collision_layer", 1286410249L), hostObject.objectPtr, collision_layer)

  /** SoftBody3D.get_collision_layer */
  final def getCollisionLayer(): Long =
    Ptrcall.call0[Long](MethodBind.get("SoftBody3D", "get_collision_layer", 3905245786L), hostObject.objectPtr)

  /** SoftBody3D.set_collision_mask_value */
  final def setCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SoftBody3D", "set_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** SoftBody3D.get_collision_mask_value */
  final def getCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SoftBody3D", "get_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** SoftBody3D.set_collision_layer_value */
  final def setCollisionLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SoftBody3D", "set_collision_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** SoftBody3D.get_collision_layer_value */
  final def getCollisionLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SoftBody3D", "get_collision_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** SoftBody3D.set_disable_mode */
  final def setDisableMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_disable_mode", 1104158384L), hostObject.objectPtr, mode)

  /** SoftBody3D.get_disable_mode */
  final def getDisableMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SoftBody3D", "get_disable_mode", 4135042476L), hostObject.objectPtr)

  /** SoftBody3D.add_collision_exception_with */
  final def addCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "add_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

  /** SoftBody3D.remove_collision_exception_with */
  final def removeCollisionExceptionWith(body: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "remove_collision_exception_with", 1078189570L), hostObject.objectPtr, body.hostObject)

  /** SoftBody3D.set_simulation_precision */
  final def setSimulationPrecision(simulation_precision: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_simulation_precision", 1286410249L), hostObject.objectPtr, simulation_precision)

  /** SoftBody3D.get_simulation_precision */
  final def getSimulationPrecision(): Long =
    Ptrcall.call0[Long](MethodBind.get("SoftBody3D", "get_simulation_precision", 2455072627L), hostObject.objectPtr)

  /** SoftBody3D.set_total_mass */
  final def setTotalMass(mass: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_total_mass", 373806689L), hostObject.objectPtr, mass)

  /** SoftBody3D.get_total_mass */
  final def getTotalMass(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_total_mass", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.set_linear_stiffness */
  final def setLinearStiffness(linear_stiffness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_linear_stiffness", 373806689L), hostObject.objectPtr, linear_stiffness)

  /** SoftBody3D.get_linear_stiffness */
  final def getLinearStiffness(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_linear_stiffness", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.set_shrinking_factor */
  final def setShrinkingFactor(shrinking_factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_shrinking_factor", 373806689L), hostObject.objectPtr, shrinking_factor)

  /** SoftBody3D.get_shrinking_factor */
  final def getShrinkingFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_shrinking_factor", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.set_pressure_coefficient */
  final def setPressureCoefficient(pressure_coefficient: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_pressure_coefficient", 373806689L), hostObject.objectPtr, pressure_coefficient)

  /** SoftBody3D.get_pressure_coefficient */
  final def getPressureCoefficient(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_pressure_coefficient", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.set_damping_coefficient */
  final def setDampingCoefficient(damping_coefficient: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_damping_coefficient", 373806689L), hostObject.objectPtr, damping_coefficient)

  /** SoftBody3D.get_damping_coefficient */
  final def getDampingCoefficient(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_damping_coefficient", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.set_drag_coefficient */
  final def setDragCoefficient(drag_coefficient: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_drag_coefficient", 373806689L), hostObject.objectPtr, drag_coefficient)

  /** SoftBody3D.get_drag_coefficient */
  final def getDragCoefficient(): Double =
    Ptrcall.call0[Double](MethodBind.get("SoftBody3D", "get_drag_coefficient", 191475506L), hostObject.objectPtr)

  /** SoftBody3D.get_point_transform */
  final def getPointTransform(point_index: Long): gdext.builtin.Vector3 =
    Ptrcall.call1[Long, gdext.builtin.Vector3](MethodBind.get("SoftBody3D", "get_point_transform", 871989493L), hostObject.objectPtr, point_index)

  /** SoftBody3D.apply_impulse */
  final def applyImpulse(point_index: Long, impulse: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("SoftBody3D", "apply_impulse", 1530502735L), hostObject.objectPtr, point_index, impulse)

  /** SoftBody3D.apply_force */
  final def applyForce(point_index: Long, force: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid2(MethodBind.get("SoftBody3D", "apply_force", 1530502735L), hostObject.objectPtr, point_index, force)

  /** SoftBody3D.apply_central_impulse */
  final def applyCentralImpulse(impulse: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "apply_central_impulse", 3460891852L), hostObject.objectPtr, impulse)

  /** SoftBody3D.apply_central_force */
  final def applyCentralForce(force: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "apply_central_force", 3460891852L), hostObject.objectPtr, force)

  /** SoftBody3D.is_point_pinned */
  final def isPointPinned(point_index: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("SoftBody3D", "is_point_pinned", 1116898809L), hostObject.objectPtr, point_index)

  /** SoftBody3D.set_ray_pickable */
  final def setRayPickable(ray_pickable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SoftBody3D", "set_ray_pickable", 2586408642L), hostObject.objectPtr, ray_pickable)

  /** SoftBody3D.is_ray_pickable */
  final def isRayPickable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SoftBody3D", "is_ray_pickable", 36873697L), hostObject.objectPtr)

}

object SoftBody3D {
  /** Class metadata for Gd[SoftBody3D] lifetime management and casting. */
  given GodotClass[SoftBody3D] with {
    def className = "SoftBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): SoftBody3D = new SoftBody3D {}.withHost(o.objectPtr)
    def unwrap(t: SoftBody3D): GodotObject = t.hostObject
  }
}
