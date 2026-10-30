package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRPositionalTracker`, extends `XRTracker`. */
abstract class XRPositionalTracker extends XRTracker {
  override def godotClassName: String = "XRPositionalTracker"

  /** XRPositionalTracker.get_tracker_profile */
  final def getTrackerProfile(): String = {
    if (gdext.classes.XRPositionalTracker.mb_get_tracker_profile == null) gdext.classes.XRPositionalTracker.mb_get_tracker_profile = MethodBind.get("XRPositionalTracker", "get_tracker_profile", 201670096L)
    Ptrcall.call0[String](gdext.classes.XRPositionalTracker.mb_get_tracker_profile, livePtr)
  }

  /** XRPositionalTracker.set_tracker_profile */
  final def setTrackerProfile(profile: String): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_tracker_profile == null) gdext.classes.XRPositionalTracker.mb_set_tracker_profile = MethodBind.get("XRPositionalTracker", "set_tracker_profile", 83702148L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_set_tracker_profile, livePtr, profile)
  }

  /** XRPositionalTracker.get_tracker_hand */
  final def getTrackerHand(): gdext.classes.XRPositionalTracker.TrackerHand = {
    if (gdext.classes.XRPositionalTracker.mb_get_tracker_hand == null) gdext.classes.XRPositionalTracker.mb_get_tracker_hand = MethodBind.get("XRPositionalTracker", "get_tracker_hand", 4181770860L)
    gdext.classes.XRPositionalTracker.TrackerHand(Ptrcall.call0[Long](gdext.classes.XRPositionalTracker.mb_get_tracker_hand, livePtr))
  }

  /** XRPositionalTracker.set_tracker_hand */
  final def setTrackerHand(hand: gdext.classes.XRPositionalTracker.TrackerHand): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_tracker_hand == null) gdext.classes.XRPositionalTracker.mb_set_tracker_hand = MethodBind.get("XRPositionalTracker", "set_tracker_hand", 3904108980L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_set_tracker_hand, livePtr, hand)
  }

  /** XRPositionalTracker.has_pose */
  final def hasPose(name: String): Boolean = {
    if (gdext.classes.XRPositionalTracker.mb_has_pose == null) gdext.classes.XRPositionalTracker.mb_has_pose = MethodBind.get("XRPositionalTracker", "has_pose", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.XRPositionalTracker.mb_has_pose, livePtr, SnArg(name))
  }

  /** XRPositionalTracker.get_pose. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPose(name: String): XRPose = {
    if (gdext.classes.XRPositionalTracker.mb_get_pose == null) gdext.classes.XRPositionalTracker.mb_get_pose = MethodBind.get("XRPositionalTracker", "get_pose", 4099720006L)
    Wrappers.owned[XRPose](Ptrcall.call1[SnArg, Long](gdext.classes.XRPositionalTracker.mb_get_pose, livePtr, SnArg(name)))
  }

  /** XRPositionalTracker.invalidate_pose */
  final def invalidatePose(name: String): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_invalidate_pose == null) gdext.classes.XRPositionalTracker.mb_invalidate_pose = MethodBind.get("XRPositionalTracker", "invalidate_pose", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRPositionalTracker.mb_invalidate_pose, livePtr, SnArg(name))
  }

  /** XRPositionalTracker.set_pose */
  final def setPose(name: String, transform: gdext.builtin.Transform3D, linearVelocity: gdext.builtin.Vector3, angularVelocity: gdext.builtin.Vector3, trackingConfidence: gdext.classes.XRPose.TrackingConfidence): Unit = {
    if (gdext.classes.XRPositionalTracker.mb_set_pose == null) gdext.classes.XRPositionalTracker.mb_set_pose = MethodBind.get("XRPositionalTracker", "set_pose", 3451230163L)
    Ptrcall.callVoid5(gdext.classes.XRPositionalTracker.mb_set_pose, livePtr, SnArg(name), transform, linearVelocity, angularVelocity, trackingConfidence)
  }

}

object XRPositionalTracker {
  private[classes] var mb_get_tracker_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_profile: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracker_hand: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_invalidate_pose: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pose: GDExtensionMethodBindPtr = null

  /** Godot enum `XRPositionalTracker.TrackerHand`. */
  opaque type TrackerHand <: Long = Long

  object TrackerHand {
    final val Unknown: TrackerHand = 0L.asInstanceOf[TrackerHand]
    final val Left: TrackerHand = 1L.asInstanceOf[TrackerHand]
    final val Right: TrackerHand = 2L.asInstanceOf[TrackerHand]
    final val Max: TrackerHand = 3L.asInstanceOf[TrackerHand]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TrackerHand = value.asInstanceOf[TrackerHand]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TrackerHand] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TrackerHand]]

    extension (self: TrackerHand)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unknown"
        case 1L => "Left"
        case 2L => "Right"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
