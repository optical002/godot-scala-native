package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VehicleWheel3D`, extends `Node3D`. */
abstract class VehicleWheel3D extends Node3D {

  /** VehicleWheel3D.set_radius */
  final def setRadius(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_radius", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_suspension_rest_length */
  final def setSuspensionRestLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_suspension_rest_length", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_suspension_rest_length */
  final def getSuspensionRestLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_suspension_rest_length", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_suspension_travel */
  final def setSuspensionTravel(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_suspension_travel", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_suspension_travel */
  final def getSuspensionTravel(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_suspension_travel", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_suspension_stiffness */
  final def setSuspensionStiffness(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_suspension_stiffness", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_suspension_stiffness */
  final def getSuspensionStiffness(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_suspension_stiffness", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_suspension_max_force */
  final def setSuspensionMaxForce(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_suspension_max_force", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_suspension_max_force */
  final def getSuspensionMaxForce(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_suspension_max_force", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_damping_compression */
  final def setDampingCompression(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_damping_compression", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_damping_compression */
  final def getDampingCompression(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_damping_compression", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_damping_relaxation */
  final def setDampingRelaxation(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_damping_relaxation", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_damping_relaxation */
  final def getDampingRelaxation(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_damping_relaxation", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_use_as_traction */
  final def setUseAsTraction(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_use_as_traction", 2586408642L), hostObject.objectPtr, enable)

  /** VehicleWheel3D.is_used_as_traction */
  final def isUsedAsTraction(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VehicleWheel3D", "is_used_as_traction", 36873697L), hostObject.objectPtr)

  /** VehicleWheel3D.set_use_as_steering */
  final def setUseAsSteering(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_use_as_steering", 2586408642L), hostObject.objectPtr, enable)

  /** VehicleWheel3D.is_used_as_steering */
  final def isUsedAsSteering(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VehicleWheel3D", "is_used_as_steering", 36873697L), hostObject.objectPtr)

  /** VehicleWheel3D.set_friction_slip */
  final def setFrictionSlip(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_friction_slip", 373806689L), hostObject.objectPtr, length)

  /** VehicleWheel3D.get_friction_slip */
  final def getFrictionSlip(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_friction_slip", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.is_in_contact */
  final def isInContact(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("VehicleWheel3D", "is_in_contact", 36873697L), hostObject.objectPtr)

  /** VehicleWheel3D.get_contact_body */
  final def getContactBody(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("VehicleWheel3D", "get_contact_body", 151077316L), hostObject.objectPtr)

  /** VehicleWheel3D.get_contact_point */
  final def getContactPoint(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VehicleWheel3D", "get_contact_point", 3360562783L), hostObject.objectPtr)

  /** VehicleWheel3D.get_contact_normal */
  final def getContactNormal(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("VehicleWheel3D", "get_contact_normal", 3360562783L), hostObject.objectPtr)

  /** VehicleWheel3D.set_roll_influence */
  final def setRollInfluence(roll_influence: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_roll_influence", 373806689L), hostObject.objectPtr, roll_influence)

  /** VehicleWheel3D.get_roll_influence */
  final def getRollInfluence(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_roll_influence", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.get_skidinfo */
  final def getSkidinfo(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_skidinfo", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.get_rpm */
  final def getRpm(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_rpm", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_engine_force */
  final def setEngineForce(engine_force: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_engine_force", 373806689L), hostObject.objectPtr, engine_force)

  /** VehicleWheel3D.get_engine_force */
  final def getEngineForce(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_engine_force", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_brake */
  final def setBrake(brake: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_brake", 373806689L), hostObject.objectPtr, brake)

  /** VehicleWheel3D.get_brake */
  final def getBrake(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_brake", 1740695150L), hostObject.objectPtr)

  /** VehicleWheel3D.set_steering */
  final def setSteering(steering: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleWheel3D", "set_steering", 373806689L), hostObject.objectPtr, steering)

  /** VehicleWheel3D.get_steering */
  final def getSteering(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleWheel3D", "get_steering", 1740695150L), hostObject.objectPtr)

}

object VehicleWheel3D {
  /** Class metadata for Gd[VehicleWheel3D] lifetime management and casting. */
  given GodotClass[VehicleWheel3D] with {
    def className = "VehicleWheel3D"
    def isRefCounted = false
    def wrap(o: GodotObject): VehicleWheel3D = new VehicleWheel3D {}.withHost(o.objectPtr)
    def unwrap(t: VehicleWheel3D): GodotObject = t.hostObject
  }
}
