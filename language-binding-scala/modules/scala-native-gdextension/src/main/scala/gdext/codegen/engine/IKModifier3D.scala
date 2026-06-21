package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `IKModifier3D`, extends `SkeletonModifier3D`. */
abstract class IKModifier3D extends SkeletonModifier3D {

  /** IKModifier3D.set_setting_count */
  final def setSettingCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("IKModifier3D", "set_setting_count", 1286410249L), hostObject.objectPtr, count)

  /** IKModifier3D.get_setting_count */
  final def getSettingCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("IKModifier3D", "get_setting_count", 3905245786L), hostObject.objectPtr)

  /** IKModifier3D.clear_settings */
  final def clearSettings(): Unit =
    Ptrcall.callVoid0(MethodBind.get("IKModifier3D", "clear_settings", 3218959716L), hostObject.objectPtr)

  /** IKModifier3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("IKModifier3D", "set_mutable_bone_axes", 2586408642L), hostObject.objectPtr, enabled)

  /** IKModifier3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("IKModifier3D", "are_bone_axes_mutable", 36873697L), hostObject.objectPtr)

  /** IKModifier3D.reset */
  final def reset(): Unit =
    Ptrcall.callVoid0(MethodBind.get("IKModifier3D", "reset", 3218959716L), hostObject.objectPtr)

}

object IKModifier3D {
  /** Class metadata for Gd[IKModifier3D] lifetime management and casting. */
  given GodotClass[IKModifier3D] with {
    def className = "IKModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): IKModifier3D = new IKModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: IKModifier3D): GodotObject = t.hostObject
  }
}
