package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def getPosition(): Long = {
    if (gdext.classes.CameraFeed.mb_get_position == null) gdext.classes.CameraFeed.mb_get_position = MethodBind.get("CameraFeed", "get_position", 2711679033L)
    Ptrcall.call0[Long](gdext.classes.CameraFeed.mb_get_position, livePtr)
  }

  /** CameraFeed.set_position */
  final def setPosition(position: Long): Unit = {
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
  final def setRgbImage(rgb_image: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_rgb_image == null) gdext.classes.CameraFeed.mb_set_rgb_image = MethodBind.get("CameraFeed", "set_rgb_image", 532598488L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_rgb_image, livePtr, Wrappers.handle(rgb_image))
  }

  /** CameraFeed.set_ycbcr_image */
  final def setYcbcrImage(ycbcr_image: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_ycbcr_image == null) gdext.classes.CameraFeed.mb_set_ycbcr_image = MethodBind.get("CameraFeed", "set_ycbcr_image", 532598488L)
    Ptrcall.callVoid1(gdext.classes.CameraFeed.mb_set_ycbcr_image, livePtr, Wrappers.handle(ycbcr_image))
  }

  /** CameraFeed.set_ycbcr_images */
  final def setYcbcrImages(y_image: Image, cbcr_image: Image): Unit = {
    if (gdext.classes.CameraFeed.mb_set_ycbcr_images == null) gdext.classes.CameraFeed.mb_set_ycbcr_images = MethodBind.get("CameraFeed", "set_ycbcr_images", 1986484629L)
    Ptrcall.callVoid2(gdext.classes.CameraFeed.mb_set_ycbcr_images, livePtr, Wrappers.handle(y_image), Wrappers.handle(cbcr_image))
  }

  /** CameraFeed.set_external */
  final def setExternal(width: Long, height: Long): Unit = {
    if (gdext.classes.CameraFeed.mb_set_external == null) gdext.classes.CameraFeed.mb_set_external = MethodBind.get("CameraFeed", "set_external", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.CameraFeed.mb_set_external, livePtr, width, height)
  }

  /** CameraFeed.get_texture_tex_id */
  final def getTextureTexId(feed_image_type: Long): Long = {
    if (gdext.classes.CameraFeed.mb_get_texture_tex_id == null) gdext.classes.CameraFeed.mb_get_texture_tex_id = MethodBind.get("CameraFeed", "get_texture_tex_id", 1135699418L)
    Ptrcall.call1[Long, Long](gdext.classes.CameraFeed.mb_get_texture_tex_id, livePtr, feed_image_type)
  }

  /** CameraFeed.get_datatype */
  final def getDatatype(): Long = {
    if (gdext.classes.CameraFeed.mb_get_datatype == null) gdext.classes.CameraFeed.mb_get_datatype = MethodBind.get("CameraFeed", "get_datatype", 1477782850L)
    Ptrcall.call0[Long](gdext.classes.CameraFeed.mb_get_datatype, livePtr)
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
}
