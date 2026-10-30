package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRPose`, extends `RefCounted`. */
abstract class XRPose extends RefCounted {
  override def godotClassName: String = "XRPose"

  /** XRPose.set_has_tracking_data */
  final def setHasTrackingData(hasTrackingData: Boolean): Unit = {
    if (gdext.classes.XRPose.mb_set_has_tracking_data == null) gdext.classes.XRPose.mb_set_has_tracking_data = MethodBind.get("XRPose", "set_has_tracking_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_has_tracking_data, livePtr, hasTrackingData)
  }

  /** XRPose.get_has_tracking_data */
  final def getHasTrackingData(): Boolean = {
    if (gdext.classes.XRPose.mb_get_has_tracking_data == null) gdext.classes.XRPose.mb_get_has_tracking_data = MethodBind.get("XRPose", "get_has_tracking_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.XRPose.mb_get_has_tracking_data, livePtr)
  }

  /** XRPose.set_name */
  final def setName(name: String): Unit = {
    if (gdext.classes.XRPose.mb_set_name == null) gdext.classes.XRPose.mb_set_name = MethodBind.get("XRPose", "set_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_name, livePtr, SnArg(name))
  }

  /** XRPose.get_name */
  final def getName(): String = {
    if (gdext.classes.XRPose.mb_get_name == null) gdext.classes.XRPose.mb_get_name = MethodBind.get("XRPose", "get_name", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRPose.mb_get_name, livePtr)
  }

  /** XRPose.set_transform */
  final def setTransform(transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.XRPose.mb_set_transform == null) gdext.classes.XRPose.mb_set_transform = MethodBind.get("XRPose", "set_transform", 2952846383L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_transform, livePtr, transform)
  }

  /** XRPose.get_transform */
  final def getTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.XRPose.mb_get_transform == null) gdext.classes.XRPose.mb_get_transform = MethodBind.get("XRPose", "get_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.XRPose.mb_get_transform, livePtr)
  }

  /** XRPose.get_adjusted_transform */
  final def getAdjustedTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.XRPose.mb_get_adjusted_transform == null) gdext.classes.XRPose.mb_get_adjusted_transform = MethodBind.get("XRPose", "get_adjusted_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.XRPose.mb_get_adjusted_transform, livePtr)
  }

  /** XRPose.set_linear_velocity */
  final def setLinearVelocity(velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRPose.mb_set_linear_velocity == null) gdext.classes.XRPose.mb_set_linear_velocity = MethodBind.get("XRPose", "set_linear_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_linear_velocity, livePtr, velocity)
  }

  /** XRPose.get_linear_velocity */
  final def getLinearVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.XRPose.mb_get_linear_velocity == null) gdext.classes.XRPose.mb_get_linear_velocity = MethodBind.get("XRPose", "get_linear_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.XRPose.mb_get_linear_velocity, livePtr)
  }

  /** XRPose.set_angular_velocity */
  final def setAngularVelocity(velocity: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.XRPose.mb_set_angular_velocity == null) gdext.classes.XRPose.mb_set_angular_velocity = MethodBind.get("XRPose", "set_angular_velocity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_angular_velocity, livePtr, velocity)
  }

  /** XRPose.get_angular_velocity */
  final def getAngularVelocity(): gdext.builtin.Vector3 = {
    if (gdext.classes.XRPose.mb_get_angular_velocity == null) gdext.classes.XRPose.mb_get_angular_velocity = MethodBind.get("XRPose", "get_angular_velocity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.XRPose.mb_get_angular_velocity, livePtr)
  }

  /** XRPose.set_tracking_confidence */
  final def setTrackingConfidence(trackingConfidence: gdext.classes.XRPose.TrackingConfidence): Unit = {
    if (gdext.classes.XRPose.mb_set_tracking_confidence == null) gdext.classes.XRPose.mb_set_tracking_confidence = MethodBind.get("XRPose", "set_tracking_confidence", 4171656666L)
    Ptrcall.callVoid1(gdext.classes.XRPose.mb_set_tracking_confidence, livePtr, trackingConfidence)
  }

  /** XRPose.get_tracking_confidence */
  final def getTrackingConfidence(): gdext.classes.XRPose.TrackingConfidence = {
    if (gdext.classes.XRPose.mb_get_tracking_confidence == null) gdext.classes.XRPose.mb_get_tracking_confidence = MethodBind.get("XRPose", "get_tracking_confidence", 2064923680L)
    gdext.classes.XRPose.TrackingConfidence(Ptrcall.call0[Long](gdext.classes.XRPose.mb_get_tracking_confidence, livePtr))
  }

}

object XRPose {
  private[classes] var mb_set_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_has_tracking_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_adjusted_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_linear_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_angular_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tracking_confidence: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracking_confidence: GDExtensionMethodBindPtr = null

  /** Godot enum `XRPose.TrackingConfidence`. */
  opaque type TrackingConfidence <: Long = Long

  object TrackingConfidence {
    final val None: TrackingConfidence = 0L.asInstanceOf[TrackingConfidence]
    final val Low: TrackingConfidence = 1L.asInstanceOf[TrackingConfidence]
    final val High: TrackingConfidence = 2L.asInstanceOf[TrackingConfidence]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TrackingConfidence = value.asInstanceOf[TrackingConfidence]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TrackingConfidence] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TrackingConfidence]]

    extension (self: TrackingConfidence)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Low"
        case 2L => "High"
        case other => other.toString
      }
  }
}
