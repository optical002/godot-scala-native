package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `IKModifier3D`, extends `SkeletonModifier3D`. */
abstract class IKModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "IKModifier3D"

  /** IKModifier3D.set_setting_count */
  final def setSettingCount(count: Long): Unit = {
    if (gdext.classes.IKModifier3D.mb_set_setting_count == null) gdext.classes.IKModifier3D.mb_set_setting_count = MethodBind.get("IKModifier3D", "set_setting_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.IKModifier3D.mb_set_setting_count, livePtr, count)
  }

  /** IKModifier3D.get_setting_count */
  final def getSettingCount(): Long = {
    if (gdext.classes.IKModifier3D.mb_get_setting_count == null) gdext.classes.IKModifier3D.mb_get_setting_count = MethodBind.get("IKModifier3D", "get_setting_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.IKModifier3D.mb_get_setting_count, livePtr)
  }

  /** IKModifier3D.clear_settings */
  final def clearSettings(): Unit = {
    if (gdext.classes.IKModifier3D.mb_clear_settings == null) gdext.classes.IKModifier3D.mb_clear_settings = MethodBind.get("IKModifier3D", "clear_settings", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.IKModifier3D.mb_clear_settings, livePtr)
  }

  /** IKModifier3D.set_mutable_bone_axes */
  final def setMutableBoneAxes(enabled: Boolean): Unit = {
    if (gdext.classes.IKModifier3D.mb_set_mutable_bone_axes == null) gdext.classes.IKModifier3D.mb_set_mutable_bone_axes = MethodBind.get("IKModifier3D", "set_mutable_bone_axes", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.IKModifier3D.mb_set_mutable_bone_axes, livePtr, enabled)
  }

  /** IKModifier3D.are_bone_axes_mutable */
  final def areBoneAxesMutable(): Boolean = {
    if (gdext.classes.IKModifier3D.mb_are_bone_axes_mutable == null) gdext.classes.IKModifier3D.mb_are_bone_axes_mutable = MethodBind.get("IKModifier3D", "are_bone_axes_mutable", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.IKModifier3D.mb_are_bone_axes_mutable, livePtr)
  }

  /** IKModifier3D.reset */
  final def reset(): Unit = {
    if (gdext.classes.IKModifier3D.mb_reset == null) gdext.classes.IKModifier3D.mb_reset = MethodBind.get("IKModifier3D", "reset", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.IKModifier3D.mb_reset, livePtr)
  }

}

object IKModifier3D {
  private[classes] var mb_set_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_setting_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_settings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mutable_bone_axes: GDExtensionMethodBindPtr = null
  private[classes] var mb_are_bone_axes_mutable: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset: GDExtensionMethodBindPtr = null
}
