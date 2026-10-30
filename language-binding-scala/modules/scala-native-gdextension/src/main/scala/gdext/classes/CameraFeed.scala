package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CameraFeed`, extends `RefCounted`. */
abstract class CameraFeed extends RefCounted {
  override def godotClassName: String = "CameraFeed"

  /** CameraFeed.get_id */
  final def getId(): Long = {
    if (gdext.classes.CameraFeed.mb_get_id == null) gdext.classes.CameraFeed.mb_get_id = MethodBind.get("CameraFeed", "get_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CameraFeed.mb_get_id, livePtr)
  }

  /** CameraFeed.is_active */
  final def isActive(): Boolean = {
    if (gdext.classes.CameraFeed.mb_is_active == null) gdext.classes.CameraFeed.mb_is_active = MethodBind.get("CameraFeed", "is_active", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CameraFeed.mb_is_active, livePtr)
  }

  /** CameraFeed.set_active */
  final def setActive(active: Boolean): Unit = {
    if (gdext.classes.CameraFeed.mb_set_active == null) gdext.classes.CameraFeed.mb_set_active = MethodBind.get("CameraFeed", "set_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_active, livePtr, active)
  }

  /** CameraFeed.get_name */
  final def getName(): String = {
    if (gdext.classes.CameraFeed.mb_get_name == null) gdext.classes.CameraFeed.mb_get_name = MethodBind.get("CameraFeed", "get_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.CameraFeed.mb_get_name, livePtr)
  }

  /** CameraFeed.set_name */
  final def setName(name: String): Unit = {
    if (gdext.classes.CameraFeed.mb_set_name == null) gdext.classes.CameraFeed.mb_set_name = MethodBind.get("CameraFeed", "set_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_name, livePtr, name)
  }

  /** CameraFeed.get_position */
  final def getPosition(): gdext.classes.CameraFeed.FeedPosition = {
    if (gdext.classes.CameraFeed.mb_get_position == null) gdext.classes.CameraFeed.mb_get_position = MethodBind.get("CameraFeed", "get_position", 2711679033L)
    gdext.classes.CameraFeed.FeedPosition(Ptrcall.call0[Long](gdext.classes.CameraFeed.mb_get_position, livePtr))
  }

  /** CameraFeed.set_position */
  final def setPosition(position: gdext.classes.CameraFeed.FeedPosition): Unit = {
    if (gdext.classes.CameraFeed.mb_set_position == null) gdext.classes.CameraFeed.mb_set_position = MethodBind.get("CameraFeed", "set_position", 611162623L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_position, livePtr, position)
  }

  /** CameraFeed.get_transform */
  final def getTransform(): gdext.builtin.Transform2D = {
    if (gdext.classes.CameraFeed.mb_get_transform == null) gdext.classes.CameraFeed.mb_get_transform = MethodBind.get("CameraFeed", "get_transform", 3814499831L)
    Ptrcall.call0[gdext.builtin.Transform2D](gdext.classes.CameraFeed.mb_get_transform, livePtr)
  }

  /** CameraFeed.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit = {
    if (gdext.classes.CameraFeed.mb_set_transform == null) gdext.classes.CameraFeed.mb_set_transform = MethodBind.get("CameraFeed", "set_transform", 2761652528L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_transform, livePtr, transform)
  }

  /** CameraFeed.set_rgb_image */
  final def setRgbImage(rgbImage: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_rgb_image == null) gdext.classes.CameraFeed.mb_set_rgb_image = MethodBind.get("CameraFeed", "set_rgb_image", 532598488L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_rgb_image, livePtr, Wrappers.handle(rgbImage))
  }

  /** CameraFeed.set_ycbcr_image */
  final def setYcbcrImage(ycbcrImage: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_ycbcr_image == null) gdext.classes.CameraFeed.mb_set_ycbcr_image = MethodBind.get("CameraFeed", "set_ycbcr_image", 532598488L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_ycbcr_image, livePtr, Wrappers.handle(ycbcrImage))
  }

  /** CameraFeed.set_ycbcr_images */
  final def setYcbcrImages(yImage: Image, cbcrImage: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_ycbcr_images == null) gdext.classes.CameraFeed.mb_set_ycbcr_images = MethodBind.get("CameraFeed", "set_ycbcr_images", 1986484629L)
    Ptrcall.callVoid2(gdext.classes.CameraFeed.mb_set_ycbcr_images, livePtr, Wrappers.handle(yImage), Wrappers.handle(cbcrImage))
  }

  /** CameraFeed.set_external */
  final def setExternal(width: Long, height: Long): Unit = {
    if (gdext.classes.CameraFeed.mb_set_external == null) gdext.classes.CameraFeed.mb_set_external = MethodBind.get("CameraFeed", "set_external", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.CameraFeed.mb_set_external, livePtr, width, height)
  }

  /** CameraFeed.get_texture_tex_id */
  final def getTextureTexId(feedImageType: gdext.classes.CameraServer.FeedImage): Long = {
    if (gdext.classes.CameraFeed.mb_get_texture_tex_id == null) gdext.classes.CameraFeed.mb_get_texture_tex_id = MethodBind.get("CameraFeed", "get_texture_tex_id", 1135699418L)
    Ptrcall.call1[Long, Long](gdext.classes.CameraFeed.mb_get_texture_tex_id, livePtr, feedImageType)
  }

  /** CameraFeed.get_datatype */
  final def getDatatype(): gdext.classes.CameraFeed.FeedDataType = {
    if (gdext.classes.CameraFeed.mb_get_datatype == null) gdext.classes.CameraFeed.mb_get_datatype = MethodBind.get("CameraFeed", "get_datatype", 1477782850L)
    gdext.classes.CameraFeed.FeedDataType(Ptrcall.call0[Long](gdext.classes.CameraFeed.mb_get_datatype, livePtr))
  }

}

object CameraFeed {
  private[classes] var mb_get_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rgb_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ycbcr_image: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ycbcr_images: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_external: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_tex_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_datatype: GDExtensionMethodBindPtr = null

  /** Godot enum `CameraFeed.FeedDataType`. */
  opaque type FeedDataType <: Long = Long

  object FeedDataType {
    final val Noimage: FeedDataType = 0L.asInstanceOf[FeedDataType]
    final val Rgb: FeedDataType = 1L.asInstanceOf[FeedDataType]
    final val Ycbcr: FeedDataType = 2L.asInstanceOf[FeedDataType]
    final val YcbcrSep: FeedDataType = 3L.asInstanceOf[FeedDataType]
    final val External: FeedDataType = 4L.asInstanceOf[FeedDataType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FeedDataType = value.asInstanceOf[FeedDataType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FeedDataType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[FeedDataType]]

    extension (self: FeedDataType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Noimage"
        case 1L => "Rgb"
        case 2L => "Ycbcr"
        case 3L => "YcbcrSep"
        case 4L => "External"
        case other => other.toString
      }
  }

  /** Godot enum `CameraFeed.FeedPosition`. */
  opaque type FeedPosition <: Long = Long

  object FeedPosition {
    final val Unspecified: FeedPosition = 0L.asInstanceOf[FeedPosition]
    final val Front: FeedPosition = 1L.asInstanceOf[FeedPosition]
    final val Back: FeedPosition = 2L.asInstanceOf[FeedPosition]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FeedPosition = value.asInstanceOf[FeedPosition]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FeedPosition] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[FeedPosition]]

    extension (self: FeedPosition)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Unspecified"
        case 1L => "Front"
        case 2L => "Back"
        case other => other.toString
      }
  }
}
