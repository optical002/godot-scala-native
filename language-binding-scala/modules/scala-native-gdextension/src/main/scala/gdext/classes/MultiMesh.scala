package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiMesh`, extends `Resource`. */
abstract class MultiMesh extends Resource {
  override def godotClassName: String = "MultiMesh"

  /** MultiMesh.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.MultiMesh.mb_set_mesh == null) gdext.classes.MultiMesh.mb_set_mesh = MethodBind.get("MultiMesh", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** MultiMesh.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.MultiMesh.mb_get_mesh == null) gdext.classes.MultiMesh.mb_get_mesh = MethodBind.get("MultiMesh", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.MultiMesh.mb_get_mesh, livePtr))
  }

  /** MultiMesh.set_use_colors */
  final def setUseColors(enable: Boolean): Unit = {
    if (gdext.classes.MultiMesh.mb_set_use_colors == null) gdext.classes.MultiMesh.mb_set_use_colors = MethodBind.get("MultiMesh", "set_use_colors", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_use_colors, livePtr, enable)
  }

  /** MultiMesh.is_using_colors */
  final def isUsingColors(): Boolean = {
    if (gdext.classes.MultiMesh.mb_is_using_colors == null) gdext.classes.MultiMesh.mb_is_using_colors = MethodBind.get("MultiMesh", "is_using_colors", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MultiMesh.mb_is_using_colors, livePtr)
  }

  /** MultiMesh.set_use_custom_data */
  final def setUseCustomData(enable: Boolean): Unit = {
    if (gdext.classes.MultiMesh.mb_set_use_custom_data == null) gdext.classes.MultiMesh.mb_set_use_custom_data = MethodBind.get("MultiMesh", "set_use_custom_data", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_use_custom_data, livePtr, enable)
  }

  /** MultiMesh.is_using_custom_data */
  final def isUsingCustomData(): Boolean = {
    if (gdext.classes.MultiMesh.mb_is_using_custom_data == null) gdext.classes.MultiMesh.mb_is_using_custom_data = MethodBind.get("MultiMesh", "is_using_custom_data", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MultiMesh.mb_is_using_custom_data, livePtr)
  }

  /** MultiMesh.set_transform_format */
  final def setTransformFormat(format: gdext.classes.MultiMesh.TransformFormat): Unit = {
    if (gdext.classes.MultiMesh.mb_set_transform_format == null) gdext.classes.MultiMesh.mb_set_transform_format = MethodBind.get("MultiMesh", "set_transform_format", 2404750322L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_transform_format, livePtr, format)
  }

  /** MultiMesh.get_transform_format */
  final def getTransformFormat(): gdext.classes.MultiMesh.TransformFormat = {
    if (gdext.classes.MultiMesh.mb_get_transform_format == null) gdext.classes.MultiMesh.mb_get_transform_format = MethodBind.get("MultiMesh", "get_transform_format", 2444156481L)
    gdext.classes.MultiMesh.TransformFormat(Ptrcall.call0[Long](gdext.classes.MultiMesh.mb_get_transform_format, livePtr))
  }

  /** MultiMesh.set_instance_count */
  final def setInstanceCount(count: Long): Unit = {
    if (gdext.classes.MultiMesh.mb_set_instance_count == null) gdext.classes.MultiMesh.mb_set_instance_count = MethodBind.get("MultiMesh", "set_instance_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_instance_count, livePtr, count)
  }

  /** MultiMesh.get_instance_count */
  final def getInstanceCount(): Long = {
    if (gdext.classes.MultiMesh.mb_get_instance_count == null) gdext.classes.MultiMesh.mb_get_instance_count = MethodBind.get("MultiMesh", "get_instance_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiMesh.mb_get_instance_count, livePtr)
  }

  /** MultiMesh.set_visible_instance_count */
  final def setVisibleInstanceCount(count: Long): Unit = {
    if (gdext.classes.MultiMesh.mb_set_visible_instance_count == null) gdext.classes.MultiMesh.mb_set_visible_instance_count = MethodBind.get("MultiMesh", "set_visible_instance_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_visible_instance_count, livePtr, count)
  }

  /** MultiMesh.get_visible_instance_count */
  final def getVisibleInstanceCount(): Long = {
    if (gdext.classes.MultiMesh.mb_get_visible_instance_count == null) gdext.classes.MultiMesh.mb_get_visible_instance_count = MethodBind.get("MultiMesh", "get_visible_instance_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.MultiMesh.mb_get_visible_instance_count, livePtr)
  }

  /** MultiMesh.set_physics_interpolation_quality */
  final def setPhysicsInterpolationQuality(quality: gdext.classes.MultiMesh.PhysicsInterpolationQuality): Unit = {
    if (gdext.classes.MultiMesh.mb_set_physics_interpolation_quality == null) gdext.classes.MultiMesh.mb_set_physics_interpolation_quality = MethodBind.get("MultiMesh", "set_physics_interpolation_quality", 1819488408L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_physics_interpolation_quality, livePtr, quality)
  }

  /** MultiMesh.get_physics_interpolation_quality */
  final def getPhysicsInterpolationQuality(): gdext.classes.MultiMesh.PhysicsInterpolationQuality = {
    if (gdext.classes.MultiMesh.mb_get_physics_interpolation_quality == null) gdext.classes.MultiMesh.mb_get_physics_interpolation_quality = MethodBind.get("MultiMesh", "get_physics_interpolation_quality", 1465701882L)
    gdext.classes.MultiMesh.PhysicsInterpolationQuality(Ptrcall.call0[Long](gdext.classes.MultiMesh.mb_get_physics_interpolation_quality, livePtr))
  }

  /** MultiMesh.set_instance_transform */
  final def setInstanceTransform(instance: Long, transform: gdext.builtin.Transform3D): Unit = {
    if (gdext.classes.MultiMesh.mb_set_instance_transform == null) gdext.classes.MultiMesh.mb_set_instance_transform = MethodBind.get("MultiMesh", "set_instance_transform", 3616898986L)
    Ptrcall.callVoid2(gdext.classes.MultiMesh.mb_set_instance_transform, livePtr, instance, transform)
  }

  /** MultiMesh.set_instance_transform_2d */
  final def setInstanceTransform2d(instance: Long, transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.MultiMesh.mb_set_instance_transform_2d == null) gdext.classes.MultiMesh.mb_set_instance_transform_2d = MethodBind.get("MultiMesh", "set_instance_transform_2d", 30160968L)
    Ptrcall.callVoid2(gdext.classes.MultiMesh.mb_set_instance_transform_2d, livePtr, instance, transform)
  }

  /** MultiMesh.get_instance_transform */
  final def getInstanceTransform(instance: Long): gdext.builtin.Transform3D = {
    if (gdext.classes.MultiMesh.mb_get_instance_transform == null) gdext.classes.MultiMesh.mb_get_instance_transform = MethodBind.get("MultiMesh", "get_instance_transform", 1965739696L)
    Ptrcall.call1[Long, gdext.builtin.Transform3D](gdext.classes.MultiMesh.mb_get_instance_transform, livePtr, instance)
  }

  /** MultiMesh.get_instance_transform_2d */
  final def getInstanceTransform2d(instance: Long): gdext.builtin.Transform2D = {
    if (gdext.classes.MultiMesh.mb_get_instance_transform_2d == null) gdext.classes.MultiMesh.mb_get_instance_transform_2d = MethodBind.get("MultiMesh", "get_instance_transform_2d", 3836996910L)
    Ptrcall.call1[Long, gdext.builtin.Transform2D](gdext.classes.MultiMesh.mb_get_instance_transform_2d, livePtr, instance)
  }

  /** MultiMesh.set_instance_color */
  final def setInstanceColor(instance: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.MultiMesh.mb_set_instance_color == null) gdext.classes.MultiMesh.mb_set_instance_color = MethodBind.get("MultiMesh", "set_instance_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.MultiMesh.mb_set_instance_color, livePtr, instance, color)
  }

  /** MultiMesh.get_instance_color */
  final def getInstanceColor(instance: Long): gdext.builtin.Color = {
    if (gdext.classes.MultiMesh.mb_get_instance_color == null) gdext.classes.MultiMesh.mb_get_instance_color = MethodBind.get("MultiMesh", "get_instance_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.MultiMesh.mb_get_instance_color, livePtr, instance)
  }

  /** MultiMesh.set_instance_custom_data */
  final def setInstanceCustomData(instance: Long, customData: gdext.builtin.Color): Unit = {
    if (gdext.classes.MultiMesh.mb_set_instance_custom_data == null) gdext.classes.MultiMesh.mb_set_instance_custom_data = MethodBind.get("MultiMesh", "set_instance_custom_data", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.MultiMesh.mb_set_instance_custom_data, livePtr, instance, customData)
  }

  /** MultiMesh.get_instance_custom_data */
  final def getInstanceCustomData(instance: Long): gdext.builtin.Color = {
    if (gdext.classes.MultiMesh.mb_get_instance_custom_data == null) gdext.classes.MultiMesh.mb_get_instance_custom_data = MethodBind.get("MultiMesh", "get_instance_custom_data", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.MultiMesh.mb_get_instance_custom_data, livePtr, instance)
  }

  /** MultiMesh.reset_instance_physics_interpolation */
  final def resetInstancePhysicsInterpolation(instance: Long): Unit = {
    if (gdext.classes.MultiMesh.mb_reset_instance_physics_interpolation == null) gdext.classes.MultiMesh.mb_reset_instance_physics_interpolation = MethodBind.get("MultiMesh", "reset_instance_physics_interpolation", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_reset_instance_physics_interpolation, livePtr, instance)
  }

  /** MultiMesh.reset_instances_physics_interpolation */
  final def resetInstancesPhysicsInterpolation(): Unit = {
    if (gdext.classes.MultiMesh.mb_reset_instances_physics_interpolation == null) gdext.classes.MultiMesh.mb_reset_instances_physics_interpolation = MethodBind.get("MultiMesh", "reset_instances_physics_interpolation", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.MultiMesh.mb_reset_instances_physics_interpolation, livePtr)
  }

  /** MultiMesh.set_custom_aabb */
  final def setCustomAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.MultiMesh.mb_set_custom_aabb == null) gdext.classes.MultiMesh.mb_set_custom_aabb = MethodBind.get("MultiMesh", "set_custom_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.MultiMesh.mb_set_custom_aabb, livePtr, aabb)
  }

  /** MultiMesh.get_custom_aabb */
  final def getCustomAabb(): gdext.builtin.AABB = {
    if (gdext.classes.MultiMesh.mb_get_custom_aabb == null) gdext.classes.MultiMesh.mb_get_custom_aabb = MethodBind.get("MultiMesh", "get_custom_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.MultiMesh.mb_get_custom_aabb, livePtr)
  }

  /** MultiMesh.get_aabb */
  final def getAabb(): gdext.builtin.AABB = {
    if (gdext.classes.MultiMesh.mb_get_aabb == null) gdext.classes.MultiMesh.mb_get_aabb = MethodBind.get("MultiMesh", "get_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.MultiMesh.mb_get_aabb, livePtr)
  }

}

object MultiMesh {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_colors: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_colors: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_custom_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_custom_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform_format: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible_instance_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visible_instance_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_physics_interpolation_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_physics_interpolation_quality: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_transform_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_transform_2d: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_instance_custom_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_instance_custom_data: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_instance_physics_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_instances_physics_interpolation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_custom_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_aabb: GDExtensionMethodBindPtr = null

  /** Godot enum `MultiMesh.TransformFormat`. */
  opaque type TransformFormat <: Long = Long

  object TransformFormat {
    final val Transform2d: TransformFormat = 0L.asInstanceOf[TransformFormat]
    final val Transform3d: TransformFormat = 1L.asInstanceOf[TransformFormat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TransformFormat = value.asInstanceOf[TransformFormat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TransformFormat] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[TransformFormat]]

    extension (self: TransformFormat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Transform2d"
        case 1L => "Transform3d"
        case other => other.toString
      }
  }

  /** Godot enum `MultiMesh.PhysicsInterpolationQuality`. */
  opaque type PhysicsInterpolationQuality <: Long = Long

  object PhysicsInterpolationQuality {
    final val Fast: PhysicsInterpolationQuality = 0L.asInstanceOf[PhysicsInterpolationQuality]
    final val High: PhysicsInterpolationQuality = 1L.asInstanceOf[PhysicsInterpolationQuality]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PhysicsInterpolationQuality = value.asInstanceOf[PhysicsInterpolationQuality]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PhysicsInterpolationQuality] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PhysicsInterpolationQuality]]

    extension (self: PhysicsInterpolationQuality)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Fast"
        case 1L => "High"
        case other => other.toString
      }
  }
}
