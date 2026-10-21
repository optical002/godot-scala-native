package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VehicleWheel3D`, extends `Node3D`. */
abstract class VehicleWheel3D extends Node3D {
  override def godotClassName: String = "VehicleWheel3D"

  /** VehicleWheel3D.set_radius */
  final def setRadius(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_radius == null) gdext.classes.VehicleWheel3D.mb_set_radius = MethodBind.get("VehicleWheel3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_radius, livePtr, length)
  }

  /** VehicleWheel3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_radius == null) gdext.classes.VehicleWheel3D.mb_get_radius = MethodBind.get("VehicleWheel3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_radius, livePtr)
  }

  /** VehicleWheel3D.set_suspension_rest_length */
  final def setSuspensionRestLength(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_suspension_rest_length == null) gdext.classes.VehicleWheel3D.mb_set_suspension_rest_length = MethodBind.get("VehicleWheel3D", "set_suspension_rest_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_suspension_rest_length, livePtr, length)
  }

  /** VehicleWheel3D.get_suspension_rest_length */
  final def getSuspensionRestLength(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_suspension_rest_length == null) gdext.classes.VehicleWheel3D.mb_get_suspension_rest_length = MethodBind.get("VehicleWheel3D", "get_suspension_rest_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_suspension_rest_length, livePtr)
  }

  /** VehicleWheel3D.set_suspension_travel */
  final def setSuspensionTravel(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_suspension_travel == null) gdext.classes.VehicleWheel3D.mb_set_suspension_travel = MethodBind.get("VehicleWheel3D", "set_suspension_travel", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_suspension_travel, livePtr, length)
  }

  /** VehicleWheel3D.get_suspension_travel */
  final def getSuspensionTravel(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_suspension_travel == null) gdext.classes.VehicleWheel3D.mb_get_suspension_travel = MethodBind.get("VehicleWheel3D", "get_suspension_travel", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_suspension_travel, livePtr)
  }

  /** VehicleWheel3D.set_suspension_stiffness */
  final def setSuspensionStiffness(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_suspension_stiffness == null) gdext.classes.VehicleWheel3D.mb_set_suspension_stiffness = MethodBind.get("VehicleWheel3D", "set_suspension_stiffness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_suspension_stiffness, livePtr, length)
  }

  /** VehicleWheel3D.get_suspension_stiffness */
  final def getSuspensionStiffness(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_suspension_stiffness == null) gdext.classes.VehicleWheel3D.mb_get_suspension_stiffness = MethodBind.get("VehicleWheel3D", "get_suspension_stiffness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_suspension_stiffness, livePtr)
  }

  /** VehicleWheel3D.set_suspension_max_force */
  final def setSuspensionMaxForce(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_suspension_max_force == null) gdext.classes.VehicleWheel3D.mb_set_suspension_max_force = MethodBind.get("VehicleWheel3D", "set_suspension_max_force", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_suspension_max_force, livePtr, length)
  }

  /** VehicleWheel3D.get_suspension_max_force */
  final def getSuspensionMaxForce(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_suspension_max_force == null) gdext.classes.VehicleWheel3D.mb_get_suspension_max_force = MethodBind.get("VehicleWheel3D", "get_suspension_max_force", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_suspension_max_force, livePtr)
  }

  /** VehicleWheel3D.set_damping_compression */
  final def setDampingCompression(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_damping_compression == null) gdext.classes.VehicleWheel3D.mb_set_damping_compression = MethodBind.get("VehicleWheel3D", "set_damping_compression", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_damping_compression, livePtr, length)
  }

  /** VehicleWheel3D.get_damping_compression */
  final def getDampingCompression(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_damping_compression == null) gdext.classes.VehicleWheel3D.mb_get_damping_compression = MethodBind.get("VehicleWheel3D", "get_damping_compression", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_damping_compression, livePtr)
  }

  /** VehicleWheel3D.set_damping_relaxation */
  final def setDampingRelaxation(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_damping_relaxation == null) gdext.classes.VehicleWheel3D.mb_set_damping_relaxation = MethodBind.get("VehicleWheel3D", "set_damping_relaxation", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_damping_relaxation, livePtr, length)
  }

  /** VehicleWheel3D.get_damping_relaxation */
  final def getDampingRelaxation(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_damping_relaxation == null) gdext.classes.VehicleWheel3D.mb_get_damping_relaxation = MethodBind.get("VehicleWheel3D", "get_damping_relaxation", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_damping_relaxation, livePtr)
  }

  /** VehicleWheel3D.set_use_as_traction */
  final def setUseAsTraction(enable: Boolean): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_use_as_traction == null) gdext.classes.VehicleWheel3D.mb_set_use_as_traction = MethodBind.get("VehicleWheel3D", "set_use_as_traction", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_use_as_traction, livePtr, enable)
  }

  /** VehicleWheel3D.is_used_as_traction */
  final def isUsedAsTraction(): Boolean = {
    if (gdext.classes.VehicleWheel3D.mb_is_used_as_traction == null) gdext.classes.VehicleWheel3D.mb_is_used_as_traction = MethodBind.get("VehicleWheel3D", "is_used_as_traction", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VehicleWheel3D.mb_is_used_as_traction, livePtr)
  }

  /** VehicleWheel3D.set_use_as_steering */
  final def setUseAsSteering(enable: Boolean): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_use_as_steering == null) gdext.classes.VehicleWheel3D.mb_set_use_as_steering = MethodBind.get("VehicleWheel3D", "set_use_as_steering", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_use_as_steering, livePtr, enable)
  }

  /** VehicleWheel3D.is_used_as_steering */
  final def isUsedAsSteering(): Boolean = {
    if (gdext.classes.VehicleWheel3D.mb_is_used_as_steering == null) gdext.classes.VehicleWheel3D.mb_is_used_as_steering = MethodBind.get("VehicleWheel3D", "is_used_as_steering", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VehicleWheel3D.mb_is_used_as_steering, livePtr)
  }

  /** VehicleWheel3D.set_friction_slip */
  final def setFrictionSlip(length: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_friction_slip == null) gdext.classes.VehicleWheel3D.mb_set_friction_slip = MethodBind.get("VehicleWheel3D", "set_friction_slip", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_friction_slip, livePtr, length)
  }

  /** VehicleWheel3D.get_friction_slip */
  final def getFrictionSlip(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_friction_slip == null) gdext.classes.VehicleWheel3D.mb_get_friction_slip = MethodBind.get("VehicleWheel3D", "get_friction_slip", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_friction_slip, livePtr)
  }

  /** VehicleWheel3D.is_in_contact */
  final def isInContact(): Boolean = {
    if (gdext.classes.VehicleWheel3D.mb_is_in_contact == null) gdext.classes.VehicleWheel3D.mb_is_in_contact = MethodBind.get("VehicleWheel3D", "is_in_contact", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VehicleWheel3D.mb_is_in_contact, livePtr)
  }

  /** VehicleWheel3D.get_contact_body */
  final def getContactBody(): Node3D = {
    if (gdext.classes.VehicleWheel3D.mb_get_contact_body == null) gdext.classes.VehicleWheel3D.mb_get_contact_body = MethodBind.get("VehicleWheel3D", "get_contact_body", 151077316L)
    Wrappers.borrowed[Node3D](Ptrcall.call0[Long](gdext.classes.VehicleWheel3D.mb_get_contact_body, livePtr))
  }

  /** VehicleWheel3D.get_contact_point */
  final def getContactPoint(): gdext.builtin.Vector3 = {
    if (gdext.classes.VehicleWheel3D.mb_get_contact_point == null) gdext.classes.VehicleWheel3D.mb_get_contact_point = MethodBind.get("VehicleWheel3D", "get_contact_point", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VehicleWheel3D.mb_get_contact_point, livePtr)
  }

  /** VehicleWheel3D.get_contact_normal */
  final def getContactNormal(): gdext.builtin.Vector3 = {
    if (gdext.classes.VehicleWheel3D.mb_get_contact_normal == null) gdext.classes.VehicleWheel3D.mb_get_contact_normal = MethodBind.get("VehicleWheel3D", "get_contact_normal", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.VehicleWheel3D.mb_get_contact_normal, livePtr)
  }

  /** VehicleWheel3D.set_roll_influence */
  final def setRollInfluence(roll_influence: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_roll_influence == null) gdext.classes.VehicleWheel3D.mb_set_roll_influence = MethodBind.get("VehicleWheel3D", "set_roll_influence", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_roll_influence, livePtr, roll_influence)
  }

  /** VehicleWheel3D.get_roll_influence */
  final def getRollInfluence(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_roll_influence == null) gdext.classes.VehicleWheel3D.mb_get_roll_influence = MethodBind.get("VehicleWheel3D", "get_roll_influence", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_roll_influence, livePtr)
  }

  /** VehicleWheel3D.get_skidinfo */
  final def getSkidinfo(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_skidinfo == null) gdext.classes.VehicleWheel3D.mb_get_skidinfo = MethodBind.get("VehicleWheel3D", "get_skidinfo", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_skidinfo, livePtr)
  }

  /** VehicleWheel3D.get_rpm */
  final def getRpm(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_rpm == null) gdext.classes.VehicleWheel3D.mb_get_rpm = MethodBind.get("VehicleWheel3D", "get_rpm", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_rpm, livePtr)
  }

  /** VehicleWheel3D.set_engine_force */
  final def setEngineForce(engine_force: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_engine_force == null) gdext.classes.VehicleWheel3D.mb_set_engine_force = MethodBind.get("VehicleWheel3D", "set_engine_force", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_engine_force, livePtr, engine_force)
  }

  /** VehicleWheel3D.get_engine_force */
  final def getEngineForce(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_engine_force == null) gdext.classes.VehicleWheel3D.mb_get_engine_force = MethodBind.get("VehicleWheel3D", "get_engine_force", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_engine_force, livePtr)
  }

  /** VehicleWheel3D.set_brake */
  final def setBrake(brake: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_brake == null) gdext.classes.VehicleWheel3D.mb_set_brake = MethodBind.get("VehicleWheel3D", "set_brake", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_brake, livePtr, brake)
  }

  /** VehicleWheel3D.get_brake */
  final def getBrake(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_brake == null) gdext.classes.VehicleWheel3D.mb_get_brake = MethodBind.get("VehicleWheel3D", "get_brake", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_brake, livePtr)
  }

  /** VehicleWheel3D.set_steering */
  final def setSteering(steering: Double): Unit = {
    if (gdext.classes.VehicleWheel3D.mb_set_steering == null) gdext.classes.VehicleWheel3D.mb_set_steering = MethodBind.get("VehicleWheel3D", "set_steering", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleWheel3D.mb_set_steering, livePtr, steering)
  }

  /** VehicleWheel3D.get_steering */
  final def getSteering(): Double = {
    if (gdext.classes.VehicleWheel3D.mb_get_steering == null) gdext.classes.VehicleWheel3D.mb_get_steering = MethodBind.get("VehicleWheel3D", "get_steering", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleWheel3D.mb_get_steering, livePtr)
  }

}

object VehicleWheel3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suspension_rest_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suspension_rest_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suspension_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suspension_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suspension_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suspension_stiffness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_suspension_max_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_suspension_max_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping_compression: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping_compression: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_damping_relaxation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_damping_relaxation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_as_traction: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_used_as_traction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_as_steering: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_used_as_steering: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_friction_slip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_friction_slip: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_in_contact: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_body: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contact_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_roll_influence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_roll_influence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skidinfo: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rpm: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_engine_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_engine_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_brake: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_brake: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_steering: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_steering: GDExtensionMethodBindPtr = null
}
