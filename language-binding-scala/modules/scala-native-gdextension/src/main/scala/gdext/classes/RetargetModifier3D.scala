package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RetargetModifier3D`, extends `SkeletonModifier3D`. */
abstract class RetargetModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "RetargetModifier3D"

  /** RetargetModifier3D.set_profile */
  final def setProfile(profile: SkeletonProfile): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_profile == null) gdext.classes.RetargetModifier3D.mb_set_profile = MethodBind.get("RetargetModifier3D", "set_profile", 3870374136L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_profile, livePtr, Wrappers.handle(profile))
  }

  /** RetargetModifier3D.get_profile. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProfile(): SkeletonProfile = {
    if (gdext.classes.RetargetModifier3D.mb_get_profile == null) gdext.classes.RetargetModifier3D.mb_get_profile = MethodBind.get("RetargetModifier3D", "get_profile", 4291782652L)
    Wrappers.owned[SkeletonProfile](Ptrcall.call0[Long](gdext.classes.RetargetModifier3D.mb_get_profile, livePtr))
  }

  /** RetargetModifier3D.set_use_global_pose */
  final def setUseGlobalPose(useGlobalPose: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_use_global_pose == null) gdext.classes.RetargetModifier3D.mb_set_use_global_pose = MethodBind.get("RetargetModifier3D", "set_use_global_pose", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_use_global_pose, livePtr, useGlobalPose)
  }

  /** RetargetModifier3D.is_using_global_pose */
  final def isUsingGlobalPose(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_using_global_pose == null) gdext.classes.RetargetModifier3D.mb_is_using_global_pose = MethodBind.get("RetargetModifier3D", "is_using_global_pose", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_using_global_pose, livePtr)
  }

  /** RetargetModifier3D.set_enable_flags */
  final def setEnableFlags(enableFlags: gdext.classes.RetargetModifier3D.TransformFlag): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_enable_flags == null) gdext.classes.RetargetModifier3D.mb_set_enable_flags = MethodBind.get("RetargetModifier3D", "set_enable_flags", 2687954213L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_enable_flags, livePtr, enableFlags.asInstanceOf[Long])
  }

  /** RetargetModifier3D.get_enable_flags */
  final def getEnableFlags(): gdext.classes.RetargetModifier3D.TransformFlag = {
    if (gdext.classes.RetargetModifier3D.mb_get_enable_flags == null) gdext.classes.RetargetModifier3D.mb_get_enable_flags = MethodBind.get("RetargetModifier3D", "get_enable_flags", 358995420L)
    gdext.classes.RetargetModifier3D.TransformFlag(Ptrcall.call0[Long](gdext.classes.RetargetModifier3D.mb_get_enable_flags, livePtr))
  }

  /** RetargetModifier3D.set_position_enabled */
  final def setPositionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_position_enabled == null) gdext.classes.RetargetModifier3D.mb_set_position_enabled = MethodBind.get("RetargetModifier3D", "set_position_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_position_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_position_enabled */
  final def isPositionEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_position_enabled == null) gdext.classes.RetargetModifier3D.mb_is_position_enabled = MethodBind.get("RetargetModifier3D", "is_position_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_position_enabled, livePtr)
  }

  /** RetargetModifier3D.set_rotation_enabled */
  final def setRotationEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_rotation_enabled == null) gdext.classes.RetargetModifier3D.mb_set_rotation_enabled = MethodBind.get("RetargetModifier3D", "set_rotation_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_rotation_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_rotation_enabled */
  final def isRotationEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_rotation_enabled == null) gdext.classes.RetargetModifier3D.mb_is_rotation_enabled = MethodBind.get("RetargetModifier3D", "is_rotation_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_rotation_enabled, livePtr)
  }

  /** RetargetModifier3D.set_scale_enabled */
  final def setScaleEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.RetargetModifier3D.mb_set_scale_enabled == null) gdext.classes.RetargetModifier3D.mb_set_scale_enabled = MethodBind.get("RetargetModifier3D", "set_scale_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RetargetModifier3D.mb_set_scale_enabled, livePtr, enabled)
  }

  /** RetargetModifier3D.is_scale_enabled */
  final def isScaleEnabled(): Boolean = {
    if (gdext.classes.RetargetModifier3D.mb_is_scale_enabled == null) gdext.classes.RetargetModifier3D.mb_is_scale_enabled = MethodBind.get("RetargetModifier3D", "is_scale_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RetargetModifier3D.mb_is_scale_enabled, livePtr)
  }

}

object RetargetModifier3D {
  private[classes] var mb_set_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_global_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enable_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_position_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_rotation_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_scale_enabled: GDExtensionMethodBindPtr = null

  /** Godot bitfield `RetargetModifier3D.TransformFlag`. */
  opaque type TransformFlag = Long

  object TransformFlag {
    final val Position: TransformFlag = 1L.asInstanceOf[TransformFlag]
    final val Rotation: TransformFlag = 2L.asInstanceOf[TransformFlag]
    final val Scale: TransformFlag = 4L.asInstanceOf[TransformFlag]
    final val All: TransformFlag = 7L.asInstanceOf[TransformFlag]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransformFlag = value.asInstanceOf[TransformFlag]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransformFlag] = scala.IArray[Long](1L, 2L, 4L, 7L).asInstanceOf[scala.IArray[TransformFlag]]

    extension (self: TransformFlag)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Position"
        case 2L => "Rotation"
        case 4L => "Scale"
        case 7L => "All"
        case other => other.toString
      }
    extension (self: TransformFlag) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: TransformFlag): TransformFlag = (self.value | other.value).asInstanceOf[TransformFlag]
      inline def &(other: TransformFlag): TransformFlag = (self.value & other.value).asInstanceOf[TransformFlag]
      /** Every bit of `flag` is set. */
      inline def has(flag: TransformFlag): Boolean = (self.value & flag.value) == flag.value
    }
  }
}
