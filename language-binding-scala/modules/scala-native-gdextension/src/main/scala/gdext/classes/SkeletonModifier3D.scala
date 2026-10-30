package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkeletonModifier3D`, extends `Node3D`. */
abstract class SkeletonModifier3D extends Node3D {
  override def godotClassName: String = "SkeletonModifier3D"

  /** SkeletonModifier3D.get_skeleton */
  final def getSkeleton(): Skeleton3D = {
    if (gdext.classes.SkeletonModifier3D.mb_get_skeleton == null) gdext.classes.SkeletonModifier3D.mb_get_skeleton = MethodBind.get("SkeletonModifier3D", "get_skeleton", 1488626673L)
    Wrappers.borrowed[Skeleton3D](Ptrcall.call0[Long](gdext.classes.SkeletonModifier3D.mb_get_skeleton, livePtr))
  }

  /** SkeletonModifier3D.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.SkeletonModifier3D.mb_set_active == null) gdext.classes.SkeletonModifier3D.mb_set_active = MethodBind.get("SkeletonModifier3D", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModifier3D.mb_set_active, livePtr, active)
  }

  /** SkeletonModifier3D.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.SkeletonModifier3D.mb_is_active == null) gdext.classes.SkeletonModifier3D.mb_is_active = MethodBind.get("SkeletonModifier3D", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SkeletonModifier3D.mb_is_active, livePtr)
  }

  /** SkeletonModifier3D.set_influence */
  final def setInfluence(influence: Double): Unit = {
    if (gdext.classes.SkeletonModifier3D.mb_set_influence == null) gdext.classes.SkeletonModifier3D.mb_set_influence = MethodBind.get("SkeletonModifier3D", "set_influence", 373806689L)
    Ptrcall.callVoid1(gdext.classes.SkeletonModifier3D.mb_set_influence, livePtr, influence)
  }

  /** SkeletonModifier3D.get_influence */
  final def getInfluence(): Double = {
    if (gdext.classes.SkeletonModifier3D.mb_get_influence == null) gdext.classes.SkeletonModifier3D.mb_get_influence = MethodBind.get("SkeletonModifier3D", "get_influence", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.SkeletonModifier3D.mb_get_influence, livePtr)
  }

}

object SkeletonModifier3D {
  private[classes] var mb_get_skeleton: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_influence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_influence: GDExtensionMethodBindPtr = null

  /** Godot enum `SkeletonModifier3D.BoneAxis`. */
  opaque type BoneAxis <: Long = Long

  object BoneAxis {
    final val PlusX: BoneAxis = 0L.asInstanceOf[BoneAxis]
    final val MinusX: BoneAxis = 1L.asInstanceOf[BoneAxis]
    final val PlusY: BoneAxis = 2L.asInstanceOf[BoneAxis]
    final val MinusY: BoneAxis = 3L.asInstanceOf[BoneAxis]
    final val PlusZ: BoneAxis = 4L.asInstanceOf[BoneAxis]
    final val MinusZ: BoneAxis = 5L.asInstanceOf[BoneAxis]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BoneAxis = value.asInstanceOf[BoneAxis]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BoneAxis] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[BoneAxis]]

    extension (self: BoneAxis)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "PlusX"
        case 1L => "MinusX"
        case 2L => "PlusY"
        case 3L => "MinusY"
        case 4L => "PlusZ"
        case 5L => "MinusZ"
        case other => other.toString
      }
  }

  /** Godot enum `SkeletonModifier3D.BoneDirection`. */
  opaque type BoneDirection <: Long = Long

  object BoneDirection {
    final val PlusX: BoneDirection = 0L.asInstanceOf[BoneDirection]
    final val MinusX: BoneDirection = 1L.asInstanceOf[BoneDirection]
    final val PlusY: BoneDirection = 2L.asInstanceOf[BoneDirection]
    final val MinusY: BoneDirection = 3L.asInstanceOf[BoneDirection]
    final val PlusZ: BoneDirection = 4L.asInstanceOf[BoneDirection]
    final val MinusZ: BoneDirection = 5L.asInstanceOf[BoneDirection]
    final val FromParent: BoneDirection = 6L.asInstanceOf[BoneDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BoneDirection = value.asInstanceOf[BoneDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BoneDirection] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[BoneDirection]]

    extension (self: BoneDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "PlusX"
        case 1L => "MinusX"
        case 2L => "PlusY"
        case 3L => "MinusY"
        case 4L => "PlusZ"
        case 5L => "MinusZ"
        case 6L => "FromParent"
        case other => other.toString
      }
  }

  /** Godot enum `SkeletonModifier3D.SecondaryDirection`. */
  opaque type SecondaryDirection <: Long = Long

  object SecondaryDirection {
    final val None: SecondaryDirection = 0L.asInstanceOf[SecondaryDirection]
    final val PlusX: SecondaryDirection = 1L.asInstanceOf[SecondaryDirection]
    final val MinusX: SecondaryDirection = 2L.asInstanceOf[SecondaryDirection]
    final val PlusY: SecondaryDirection = 3L.asInstanceOf[SecondaryDirection]
    final val MinusY: SecondaryDirection = 4L.asInstanceOf[SecondaryDirection]
    final val PlusZ: SecondaryDirection = 5L.asInstanceOf[SecondaryDirection]
    final val MinusZ: SecondaryDirection = 6L.asInstanceOf[SecondaryDirection]
    final val Custom: SecondaryDirection = 7L.asInstanceOf[SecondaryDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SecondaryDirection = value.asInstanceOf[SecondaryDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SecondaryDirection] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[SecondaryDirection]]

    extension (self: SecondaryDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "PlusX"
        case 2L => "MinusX"
        case 3L => "PlusY"
        case 4L => "MinusY"
        case 5L => "PlusZ"
        case 6L => "MinusZ"
        case 7L => "Custom"
        case other => other.toString
      }
  }

  /** Godot enum `SkeletonModifier3D.RotationAxis`. */
  opaque type RotationAxis <: Long = Long

  object RotationAxis {
    final val X: RotationAxis = 0L.asInstanceOf[RotationAxis]
    final val Y: RotationAxis = 1L.asInstanceOf[RotationAxis]
    final val Z: RotationAxis = 2L.asInstanceOf[RotationAxis]
    final val All: RotationAxis = 3L.asInstanceOf[RotationAxis]
    final val Custom: RotationAxis = 4L.asInstanceOf[RotationAxis]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RotationAxis = value.asInstanceOf[RotationAxis]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RotationAxis] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[RotationAxis]]

    extension (self: RotationAxis)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "X"
        case 1L => "Y"
        case 2L => "Z"
        case 3L => "All"
        case 4L => "Custom"
        case other => other.toString
      }
  }
}
