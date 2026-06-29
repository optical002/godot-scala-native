package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CameraFeed`, extends `RefCounted`. */
abstract class CameraFeed extends RefCounted {
  override def godotClassName: String = "CameraFeed"

  /** CameraFeed.get_id */
  final def getId(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraFeed", "get_id", 3905245786L), hostObject.objectPtr)

  /** CameraFeed.is_active */
  final def isActive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CameraFeed", "is_active", 36873697L), hostObject.objectPtr)

  /** CameraFeed.set_active */
  final def setActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_active", 2586408642L), hostObject.objectPtr, active)

  /** CameraFeed.get_name */
  final def getName(): String =
    Ptrcall.call0[String](MethodBind.get("CameraFeed", "get_name", 201670096L), hostObject.objectPtr)

  /** CameraFeed.set_name */
  final def setName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_name", 83702148L), hostObject.objectPtr, name)

  /** CameraFeed.get_position */
  final def getPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraFeed", "get_position", 2711679033L), hostObject.objectPtr)

  /** CameraFeed.set_position */
  final def setPosition(position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_position", 611162623L), hostObject.objectPtr, position)

  /** CameraFeed.get_transform */
  final def getTransform(): gdext.builtin.Transform2D =
    Ptrcall.call0[gdext.builtin.Transform2D](MethodBind.get("CameraFeed", "get_transform", 3814499831L), hostObject.objectPtr)

  /** CameraFeed.set_transform */
  final def setTransform(transform: gdext.builtin.Transform2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_transform", 2761652528L), hostObject.objectPtr, transform)

  /** CameraFeed.set_rgb_image */
  final def setRgbImage(rgb_image: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_rgb_image", 532598488L), hostObject.objectPtr, rgb_image.hostObject)

  /** CameraFeed.set_ycbcr_image */
  final def setYcbcrImage(ycbcr_image: Image): Unit =
    Ptrcall.callVoid1(MethodBind.get("CameraFeed", "set_ycbcr_image", 532598488L), hostObject.objectPtr, ycbcr_image.hostObject)

  /** CameraFeed.set_ycbcr_images */
  final def setYcbcrImages(y_image: Image, cbcr_image: Image): Unit =
    Ptrcall.callVoid2(MethodBind.get("CameraFeed", "set_ycbcr_images", 1986484629L), hostObject.objectPtr, y_image.hostObject, cbcr_image.hostObject)

  /** CameraFeed.set_external */
  final def setExternal(width: Long, height: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("CameraFeed", "set_external", 3937882851L), hostObject.objectPtr, width, height)

  /** CameraFeed.get_texture_tex_id */
  final def getTextureTexId(feed_image_type: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("CameraFeed", "get_texture_tex_id", 1135699418L), hostObject.objectPtr, feed_image_type)

  /** CameraFeed.get_datatype */
  final def getDatatype(): Long =
    Ptrcall.call0[Long](MethodBind.get("CameraFeed", "get_datatype", 1477782850L), hostObject.objectPtr)

}
