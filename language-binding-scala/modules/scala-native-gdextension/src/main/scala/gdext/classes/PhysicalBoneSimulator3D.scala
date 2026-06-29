package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PhysicalBoneSimulator3D`, extends `SkeletonModifier3D`. */
abstract class PhysicalBoneSimulator3D extends SkeletonModifier3D {
  override def godotClassName: String = "PhysicalBoneSimulator3D"

  /** PhysicalBoneSimulator3D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("PhysicalBoneSimulator3D", "is_simulating_physics", 36873697L), hostObject.objectPtr)

  /** PhysicalBoneSimulator3D.physical_bones_stop_simulation */
  final def physicalBonesStopSimulation(): Unit =
    Ptrcall.callVoid0(MethodBind.get("PhysicalBoneSimulator3D", "physical_bones_stop_simulation", 3218959716L), hostObject.objectPtr)

}
