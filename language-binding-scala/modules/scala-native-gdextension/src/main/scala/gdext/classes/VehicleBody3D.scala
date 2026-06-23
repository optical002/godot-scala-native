package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `VehicleBody3D`, extends `RigidBody3D`. */
abstract class VehicleBody3D extends RigidBody3D {

  /** VehicleBody3D.set_engine_force */
  final def setEngineForce(engine_force: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleBody3D", "set_engine_force", 373806689L), hostObject.objectPtr, engine_force)

  /** VehicleBody3D.get_engine_force */
  final def getEngineForce(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleBody3D", "get_engine_force", 1740695150L), hostObject.objectPtr)

  /** VehicleBody3D.set_brake */
  final def setBrake(brake: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleBody3D", "set_brake", 373806689L), hostObject.objectPtr, brake)

  /** VehicleBody3D.get_brake */
  final def getBrake(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleBody3D", "get_brake", 1740695150L), hostObject.objectPtr)

  /** VehicleBody3D.set_steering */
  final def setSteering(steering: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("VehicleBody3D", "set_steering", 373806689L), hostObject.objectPtr, steering)

  /** VehicleBody3D.get_steering */
  final def getSteering(): Double =
    Ptrcall.call0[Double](MethodBind.get("VehicleBody3D", "get_steering", 1740695150L), hostObject.objectPtr)

}

object VehicleBody3D {
  /** Class metadata for Gd[VehicleBody3D] lifetime management and casting. */
  given GodotClass[VehicleBody3D] with {
    def className = "VehicleBody3D"
    def isRefCounted = false
    def wrap(o: GodotObject): VehicleBody3D = new VehicleBody3D {}.withHost(o.objectPtr)
    def unwrap(t: VehicleBody3D): GodotObject = t.hostObject
  }
}
