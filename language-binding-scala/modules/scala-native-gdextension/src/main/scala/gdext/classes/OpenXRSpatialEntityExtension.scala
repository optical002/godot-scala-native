package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialEntityExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRSpatialEntityExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRSpatialEntityExtension"

  /** OpenXRSpatialEntityExtension.supports_capability */
  final def supportsCapability(capability: gdext.classes.OpenXRSpatialEntityExtension.Capability): Boolean = {
    if (gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability == null) gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability = MethodBind.get("OpenXRSpatialEntityExtension", "supports_capability", 1940837202L)
    Ptrcall.call1[Long, Boolean](gdext.classes.OpenXRSpatialEntityExtension.mb_supports_capability, livePtr, capability)
  }

  /** OpenXRSpatialEntityExtension.supports_component_type */
  final def supportsComponentType(capability: gdext.classes.OpenXRSpatialEntityExtension.Capability, componentType: gdext.classes.OpenXRSpatialEntityExtension.ComponentType): Boolean = {
    if (gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type == null) gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type = MethodBind.get("OpenXRSpatialEntityExtension", "supports_component_type", 26842779L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.OpenXRSpatialEntityExtension.mb_supports_component_type, livePtr, capability, componentType)
  }

}

object OpenXRSpatialEntityExtension {
  private[classes] var mb_supports_capability: GDExtensionMethodBindPtr = null
  private[classes] var mb_supports_component_type: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRSpatialEntityExtension.Capability`. */
  opaque type Capability <: Long = Long

  object Capability {
    final val PlaneTracking: Capability = 1000741000L.asInstanceOf[Capability]
    final val MarkerTrackingQrCode: Capability = 1000743000L.asInstanceOf[Capability]
    final val MarkerTrackingMicroQrCode: Capability = 1000743001L.asInstanceOf[Capability]
    final val MarkerTrackingArucoMarker: Capability = 1000743002L.asInstanceOf[Capability]
    final val MarkerTrackingAprilTag: Capability = 1000743003L.asInstanceOf[Capability]
    final val Anchor: Capability = 1000762000L.asInstanceOf[Capability]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Capability = value.asInstanceOf[Capability]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Capability] = scala.IArray[Long](1000741000L, 1000743000L, 1000743001L, 1000743002L, 1000743003L, 1000762000L).asInstanceOf[scala.IArray[Capability]]

    extension (self: Capability)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1000741000L => "PlaneTracking"
        case 1000743000L => "MarkerTrackingQrCode"
        case 1000743001L => "MarkerTrackingMicroQrCode"
        case 1000743002L => "MarkerTrackingArucoMarker"
        case 1000743003L => "MarkerTrackingAprilTag"
        case 1000762000L => "Anchor"
        case other => other.toString
      }
  }

  /** Godot enum `OpenXRSpatialEntityExtension.ComponentType`. */
  opaque type ComponentType <: Long = Long

  object ComponentType {
    final val Bounded2d: ComponentType = 1L.asInstanceOf[ComponentType]
    final val Bounded3d: ComponentType = 2L.asInstanceOf[ComponentType]
    final val Parent: ComponentType = 3L.asInstanceOf[ComponentType]
    final val Mesh3d: ComponentType = 4L.asInstanceOf[ComponentType]
    final val PlaneAlignment: ComponentType = 1000741000L.asInstanceOf[ComponentType]
    final val Mesh2d: ComponentType = 1000741001L.asInstanceOf[ComponentType]
    final val Polygon2d: ComponentType = 1000741002L.asInstanceOf[ComponentType]
    final val PlaneSemanticLabel: ComponentType = 1000741003L.asInstanceOf[ComponentType]
    final val Marker: ComponentType = 1000743000L.asInstanceOf[ComponentType]
    final val Anchor: ComponentType = 1000762000L.asInstanceOf[ComponentType]
    final val Persistence: ComponentType = 1000763000L.asInstanceOf[ComponentType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ComponentType = value.asInstanceOf[ComponentType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ComponentType] = scala.IArray[Long](1L, 2L, 3L, 4L, 1000741000L, 1000741001L, 1000741002L, 1000741003L, 1000743000L, 1000762000L, 1000763000L).asInstanceOf[scala.IArray[ComponentType]]

    extension (self: ComponentType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 1L => "Bounded2d"
        case 2L => "Bounded3d"
        case 3L => "Parent"
        case 4L => "Mesh3d"
        case 1000741000L => "PlaneAlignment"
        case 1000741001L => "Mesh2d"
        case 1000741002L => "Polygon2d"
        case 1000741003L => "PlaneSemanticLabel"
        case 1000743000L => "Marker"
        case 1000762000L => "Anchor"
        case 1000763000L => "Persistence"
        case other => other.toString
      }
  }
}
