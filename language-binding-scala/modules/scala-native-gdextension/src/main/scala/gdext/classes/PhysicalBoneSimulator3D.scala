package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `PhysicalBoneSimulator3D`, extends `SkeletonModifier3D`. */
abstract class PhysicalBoneSimulator3D extends SkeletonModifier3D {
  override def godotClassName: String = "PhysicalBoneSimulator3D"

  /** PhysicalBoneSimulator3D.is_simulating_physics */
  final def isSimulatingPhysics(): Boolean = {
    if (gdext.classes.PhysicalBoneSimulator3D.mb_is_simulating_physics == null) gdext.classes.PhysicalBoneSimulator3D.mb_is_simulating_physics = MethodBind.get("PhysicalBoneSimulator3D", "is_simulating_physics", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.PhysicalBoneSimulator3D.mb_is_simulating_physics, livePtr)
  }

  /** PhysicalBoneSimulator3D.physical_bones_stop_simulation */
  final def physicalBonesStopSimulation(): Unit = {
    if (gdext.classes.PhysicalBoneSimulator3D.mb_physical_bones_stop_simulation == null) gdext.classes.PhysicalBoneSimulator3D.mb_physical_bones_stop_simulation = MethodBind.get("PhysicalBoneSimulator3D", "physical_bones_stop_simulation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.PhysicalBoneSimulator3D.mb_physical_bones_stop_simulation, livePtr)
  }

}

object PhysicalBoneSimulator3D {
  private[classes] var mb_is_simulating_physics: GDExtensionMethodBindPtr = null
  private[classes] var mb_physical_bones_stop_simulation: GDExtensionMethodBindPtr = null
}
