package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VehicleBody3D`, extends `RigidBody3D`. */
abstract class VehicleBody3D extends RigidBody3D {
  override def godotClassName: String = "VehicleBody3D"

  /** VehicleBody3D.set_engine_force */
  final def setEngineForce(engineForce: Double): Unit = {
    if (gdext.classes.VehicleBody3D.mb_set_engine_force == null) gdext.classes.VehicleBody3D.mb_set_engine_force = MethodBind.get("VehicleBody3D", "set_engine_force", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleBody3D.mb_set_engine_force, livePtr, engineForce)
  }

  /** VehicleBody3D.get_engine_force */
  final def getEngineForce(): Double = {
    if (gdext.classes.VehicleBody3D.mb_get_engine_force == null) gdext.classes.VehicleBody3D.mb_get_engine_force = MethodBind.get("VehicleBody3D", "get_engine_force", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleBody3D.mb_get_engine_force, livePtr)
  }

  /** VehicleBody3D.set_brake */
  final def setBrake(brake: Double): Unit = {
    if (gdext.classes.VehicleBody3D.mb_set_brake == null) gdext.classes.VehicleBody3D.mb_set_brake = MethodBind.get("VehicleBody3D", "set_brake", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleBody3D.mb_set_brake, livePtr, brake)
  }

  /** VehicleBody3D.get_brake */
  final def getBrake(): Double = {
    if (gdext.classes.VehicleBody3D.mb_get_brake == null) gdext.classes.VehicleBody3D.mb_get_brake = MethodBind.get("VehicleBody3D", "get_brake", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleBody3D.mb_get_brake, livePtr)
  }

  /** VehicleBody3D.set_steering */
  final def setSteering(steering: Double): Unit = {
    if (gdext.classes.VehicleBody3D.mb_set_steering == null) gdext.classes.VehicleBody3D.mb_set_steering = MethodBind.get("VehicleBody3D", "set_steering", 373806689L)
    Ptrcall.callVoid1(gdext.classes.VehicleBody3D.mb_set_steering, livePtr, steering)
  }

  /** VehicleBody3D.get_steering */
  final def getSteering(): Double = {
    if (gdext.classes.VehicleBody3D.mb_get_steering == null) gdext.classes.VehicleBody3D.mb_get_steering = MethodBind.get("VehicleBody3D", "get_steering", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.VehicleBody3D.mb_get_steering, livePtr)
  }

}

object VehicleBody3D {
  private[classes] var mb_set_engine_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_engine_force: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_brake: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_brake: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_steering: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_steering: GDExtensionMethodBindPtr = null
}
