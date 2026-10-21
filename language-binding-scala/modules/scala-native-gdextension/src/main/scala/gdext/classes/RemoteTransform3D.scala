package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RemoteTransform3D`, extends `Node3D`. */
abstract class RemoteTransform3D extends Node3D {
  override def godotClassName: String = "RemoteTransform3D"

  /** RemoteTransform3D.force_update_cache */
  final def forceUpdateCache(): Unit = {
    if (gdext.classes.RemoteTransform3D.mb_force_update_cache == null) gdext.classes.RemoteTransform3D.mb_force_update_cache = MethodBind.get("RemoteTransform3D", "force_update_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RemoteTransform3D.mb_force_update_cache, livePtr)
  }

  /** RemoteTransform3D.set_use_global_coordinates */
  final def setUseGlobalCoordinates(use_global_coordinates: Boolean): Unit = {
    if (gdext.classes.RemoteTransform3D.mb_set_use_global_coordinates == null) gdext.classes.RemoteTransform3D.mb_set_use_global_coordinates = MethodBind.get("RemoteTransform3D", "set_use_global_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform3D.mb_set_use_global_coordinates, livePtr, use_global_coordinates)
  }

  /** RemoteTransform3D.get_use_global_coordinates */
  final def getUseGlobalCoordinates(): Boolean = {
    if (gdext.classes.RemoteTransform3D.mb_get_use_global_coordinates == null) gdext.classes.RemoteTransform3D.mb_get_use_global_coordinates = MethodBind.get("RemoteTransform3D", "get_use_global_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform3D.mb_get_use_global_coordinates, livePtr)
  }

  /** RemoteTransform3D.set_update_position */
  final def setUpdatePosition(update_remote_position: Boolean): Unit = {
    if (gdext.classes.RemoteTransform3D.mb_set_update_position == null) gdext.classes.RemoteTransform3D.mb_set_update_position = MethodBind.get("RemoteTransform3D", "set_update_position", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform3D.mb_set_update_position, livePtr, update_remote_position)
  }

  /** RemoteTransform3D.get_update_position */
  final def getUpdatePosition(): Boolean = {
    if (gdext.classes.RemoteTransform3D.mb_get_update_position == null) gdext.classes.RemoteTransform3D.mb_get_update_position = MethodBind.get("RemoteTransform3D", "get_update_position", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform3D.mb_get_update_position, livePtr)
  }

  /** RemoteTransform3D.set_update_rotation */
  final def setUpdateRotation(update_remote_rotation: Boolean): Unit = {
    if (gdext.classes.RemoteTransform3D.mb_set_update_rotation == null) gdext.classes.RemoteTransform3D.mb_set_update_rotation = MethodBind.get("RemoteTransform3D", "set_update_rotation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform3D.mb_set_update_rotation, livePtr, update_remote_rotation)
  }

  /** RemoteTransform3D.get_update_rotation */
  final def getUpdateRotation(): Boolean = {
    if (gdext.classes.RemoteTransform3D.mb_get_update_rotation == null) gdext.classes.RemoteTransform3D.mb_get_update_rotation = MethodBind.get("RemoteTransform3D", "get_update_rotation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform3D.mb_get_update_rotation, livePtr)
  }

  /** RemoteTransform3D.set_update_scale */
  final def setUpdateScale(update_remote_scale: Boolean): Unit = {
    if (gdext.classes.RemoteTransform3D.mb_set_update_scale == null) gdext.classes.RemoteTransform3D.mb_set_update_scale = MethodBind.get("RemoteTransform3D", "set_update_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform3D.mb_set_update_scale, livePtr, update_remote_scale)
  }

  /** RemoteTransform3D.get_update_scale */
  final def getUpdateScale(): Boolean = {
    if (gdext.classes.RemoteTransform3D.mb_get_update_scale == null) gdext.classes.RemoteTransform3D.mb_get_update_scale = MethodBind.get("RemoteTransform3D", "get_update_scale", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform3D.mb_get_update_scale, livePtr)
  }

}

object RemoteTransform3D {
  private[classes] var mb_force_update_cache: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_global_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_global_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_rotation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_scale: GDExtensionMethodBindPtr = null
}
