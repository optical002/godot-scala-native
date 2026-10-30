package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRHandModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRHandModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "XRHandModifier3D"

  /** XRHandModifier3D.set_hand_tracker */
  final def setHandTracker(trackerName: String): Unit = {
    if (gdext.classes.XRHandModifier3D.mb_set_hand_tracker == null) gdext.classes.XRHandModifier3D.mb_set_hand_tracker = MethodBind.get("XRHandModifier3D", "set_hand_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRHandModifier3D.mb_set_hand_tracker, livePtr, SnArg(trackerName))
  }

  /** XRHandModifier3D.get_hand_tracker */
  final def getHandTracker(): String = {
    if (gdext.classes.XRHandModifier3D.mb_get_hand_tracker == null) gdext.classes.XRHandModifier3D.mb_get_hand_tracker = MethodBind.get("XRHandModifier3D", "get_hand_tracker", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRHandModifier3D.mb_get_hand_tracker, livePtr)
  }

  /** XRHandModifier3D.set_bone_update */
  final def setBoneUpdate(boneUpdate: gdext.classes.XRHandModifier3D.BoneUpdate): Unit = {
    if (gdext.classes.XRHandModifier3D.mb_set_bone_update == null) gdext.classes.XRHandModifier3D.mb_set_bone_update = MethodBind.get("XRHandModifier3D", "set_bone_update", 3635701455L)
    Ptrcall.callVoid1(gdext.classes.XRHandModifier3D.mb_set_bone_update, livePtr, boneUpdate)
  }

  /** XRHandModifier3D.get_bone_update */
  final def getBoneUpdate(): gdext.classes.XRHandModifier3D.BoneUpdate = {
    if (gdext.classes.XRHandModifier3D.mb_get_bone_update == null) gdext.classes.XRHandModifier3D.mb_get_bone_update = MethodBind.get("XRHandModifier3D", "get_bone_update", 2873665691L)
    gdext.classes.XRHandModifier3D.BoneUpdate(Ptrcall.call0[Long](gdext.classes.XRHandModifier3D.mb_get_bone_update, livePtr))
  }

}

object XRHandModifier3D {
  private[classes] var mb_set_hand_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_hand_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null

  /** Godot enum `XRHandModifier3D.BoneUpdate`. */
  opaque type BoneUpdate <: Long = Long

  object BoneUpdate {
    final val Full: BoneUpdate = 0L.asInstanceOf[BoneUpdate]
    final val RotationOnly: BoneUpdate = 1L.asInstanceOf[BoneUpdate]
    final val Max: BoneUpdate = 2L.asInstanceOf[BoneUpdate]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BoneUpdate = value.asInstanceOf[BoneUpdate]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BoneUpdate] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[BoneUpdate]]

    extension (self: BoneUpdate)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Full"
        case 1L => "RotationOnly"
        case 2L => "Max"
        case other => other.toString
      }
  }
}
