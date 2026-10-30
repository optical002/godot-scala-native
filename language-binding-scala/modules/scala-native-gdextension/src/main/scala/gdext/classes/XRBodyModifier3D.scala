package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRBodyModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRBodyModifier3D extends SkeletonModifier3D {
  override def godotClassName: String = "XRBodyModifier3D"

  /** XRBodyModifier3D.set_body_tracker */
  final def setBodyTracker(trackerName: String): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_body_tracker == null) gdext.classes.XRBodyModifier3D.mb_set_body_tracker = MethodBind.get("XRBodyModifier3D", "set_body_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_body_tracker, livePtr, SnArg(trackerName))
  }

  /** XRBodyModifier3D.get_body_tracker */
  final def getBodyTracker(): String = {
    if (gdext.classes.XRBodyModifier3D.mb_get_body_tracker == null) gdext.classes.XRBodyModifier3D.mb_get_body_tracker = MethodBind.get("XRBodyModifier3D", "get_body_tracker", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRBodyModifier3D.mb_get_body_tracker, livePtr)
  }

  /** XRBodyModifier3D.set_body_update */
  final def setBodyUpdate(bodyUpdate: gdext.classes.XRBodyModifier3D.BodyUpdate): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_body_update == null) gdext.classes.XRBodyModifier3D.mb_set_body_update = MethodBind.get("XRBodyModifier3D", "set_body_update", 2211199417L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_body_update, livePtr, bodyUpdate.asInstanceOf[Long])
  }

  /** XRBodyModifier3D.get_body_update */
  final def getBodyUpdate(): gdext.classes.XRBodyModifier3D.BodyUpdate = {
    if (gdext.classes.XRBodyModifier3D.mb_get_body_update == null) gdext.classes.XRBodyModifier3D.mb_get_body_update = MethodBind.get("XRBodyModifier3D", "get_body_update", 2642335328L)
    gdext.classes.XRBodyModifier3D.BodyUpdate(Ptrcall.call0[Long](gdext.classes.XRBodyModifier3D.mb_get_body_update, livePtr))
  }

  /** XRBodyModifier3D.set_bone_update */
  final def setBoneUpdate(boneUpdate: gdext.classes.XRBodyModifier3D.BoneUpdate): Unit = {
    if (gdext.classes.XRBodyModifier3D.mb_set_bone_update == null) gdext.classes.XRBodyModifier3D.mb_set_bone_update = MethodBind.get("XRBodyModifier3D", "set_bone_update", 3356796943L)
    Ptrcall.callVoid1(gdext.classes.XRBodyModifier3D.mb_set_bone_update, livePtr, boneUpdate)
  }

  /** XRBodyModifier3D.get_bone_update */
  final def getBoneUpdate(): gdext.classes.XRBodyModifier3D.BoneUpdate = {
    if (gdext.classes.XRBodyModifier3D.mb_get_bone_update == null) gdext.classes.XRBodyModifier3D.mb_get_bone_update = MethodBind.get("XRBodyModifier3D", "get_bone_update", 1309305964L)
    gdext.classes.XRBodyModifier3D.BoneUpdate(Ptrcall.call0[Long](gdext.classes.XRBodyModifier3D.mb_get_bone_update, livePtr))
  }

}

object XRBodyModifier3D {
  private[classes] var mb_set_body_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bone_update: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bone_update: GDExtensionMethodBindPtr = null

  /** Godot bitfield `XRBodyModifier3D.BodyUpdate`. */
  opaque type BodyUpdate = Long

  object BodyUpdate {
    final val UpperBody: BodyUpdate = 1L.asInstanceOf[BodyUpdate]
    final val LowerBody: BodyUpdate = 2L.asInstanceOf[BodyUpdate]
    final val Hands: BodyUpdate = 4L.asInstanceOf[BodyUpdate]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BodyUpdate = value.asInstanceOf[BodyUpdate]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BodyUpdate] = scala.IArray[Long](1L, 2L, 4L).asInstanceOf[scala.IArray[BodyUpdate]]

    extension (self: BodyUpdate)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "UpperBody"
        case 2L => "LowerBody"
        case 4L => "Hands"
        case other => other.toString
      }
    extension (self: BodyUpdate) {
      inline def value: Long = self.asInstanceOf[Long]
      inline def |(other: BodyUpdate): BodyUpdate = (self.value | other.value).asInstanceOf[BodyUpdate]
      inline def &(other: BodyUpdate): BodyUpdate = (self.value & other.value).asInstanceOf[BodyUpdate]
      /** Every bit of `flag` is set. */
      inline def has(flag: BodyUpdate): Boolean = (self.value & flag.value) == flag.value
    }
  }

  /** Godot enum `XRBodyModifier3D.BoneUpdate`. */
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
