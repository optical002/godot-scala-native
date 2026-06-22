package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicalBoneSimulator3D`, extends `SkeletonModifier3D`. */
abstract class PhysicalBoneSimulator3D extends SkeletonModifier3D {

  /** PhysicalBoneSimulator3D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBoneSimulator3D", "is_simulating_physics", 36873697L), hostObject.objectPtr)

  /** PhysicalBoneSimulator3D.physical_bones_stop_simulation */
  final def physicalBonesStopSimulation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PhysicalBoneSimulator3D", "physical_bones_stop_simulation", 3218959716L), hostObject.objectPtr)

}

object PhysicalBoneSimulator3D {
  /** Class metadata for Gd[PhysicalBoneSimulator3D] lifetime management and casting. */
  given GodotClass[PhysicalBoneSimulator3D] with {
    def className = "PhysicalBoneSimulator3D"
    def isRefCounted = false
    def wrap(o: GodotObject): PhysicalBoneSimulator3D = new PhysicalBoneSimulator3D {}.withHost(o.objectPtr)
    def unwrap(t: PhysicalBoneSimulator3D): GodotObject = t.hostObject
  }
}
