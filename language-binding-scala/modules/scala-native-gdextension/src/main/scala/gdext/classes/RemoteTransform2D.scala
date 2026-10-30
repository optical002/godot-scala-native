package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RemoteTransform2D`, extends `Node2D`. */
abstract class RemoteTransform2D extends Node2D {
  override def godotClassName: String = "RemoteTransform2D"

  /** RemoteTransform2D.force_update_cache */
  final def forceUpdateCache(): Unit = {
    if (gdext.classes.RemoteTransform2D.mb_force_update_cache == null) gdext.classes.RemoteTransform2D.mb_force_update_cache = MethodBind.get("RemoteTransform2D", "force_update_cache", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RemoteTransform2D.mb_force_update_cache, livePtr)
  }

  /** RemoteTransform2D.set_use_global_coordinates */
  final def setUseGlobalCoordinates(useGlobalCoordinates: Boolean): Unit = {
    if (gdext.classes.RemoteTransform2D.mb_set_use_global_coordinates == null) gdext.classes.RemoteTransform2D.mb_set_use_global_coordinates = MethodBind.get("RemoteTransform2D", "set_use_global_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform2D.mb_set_use_global_coordinates, livePtr, useGlobalCoordinates)
  }

  /** RemoteTransform2D.get_use_global_coordinates */
  final def getUseGlobalCoordinates(): Boolean = {
    if (gdext.classes.RemoteTransform2D.mb_get_use_global_coordinates == null) gdext.classes.RemoteTransform2D.mb_get_use_global_coordinates = MethodBind.get("RemoteTransform2D", "get_use_global_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform2D.mb_get_use_global_coordinates, livePtr)
  }

  /** RemoteTransform2D.set_update_position */
  final def setUpdatePosition(updateRemotePosition: Boolean): Unit = {
    if (gdext.classes.RemoteTransform2D.mb_set_update_position == null) gdext.classes.RemoteTransform2D.mb_set_update_position = MethodBind.get("RemoteTransform2D", "set_update_position", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform2D.mb_set_update_position, livePtr, updateRemotePosition)
  }

  /** RemoteTransform2D.get_update_position */
  final def getUpdatePosition(): Boolean = {
    if (gdext.classes.RemoteTransform2D.mb_get_update_position == null) gdext.classes.RemoteTransform2D.mb_get_update_position = MethodBind.get("RemoteTransform2D", "get_update_position", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform2D.mb_get_update_position, livePtr)
  }

  /** RemoteTransform2D.set_update_rotation */
  final def setUpdateRotation(updateRemoteRotation: Boolean): Unit = {
    if (gdext.classes.RemoteTransform2D.mb_set_update_rotation == null) gdext.classes.RemoteTransform2D.mb_set_update_rotation = MethodBind.get("RemoteTransform2D", "set_update_rotation", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform2D.mb_set_update_rotation, livePtr, updateRemoteRotation)
  }

  /** RemoteTransform2D.get_update_rotation */
  final def getUpdateRotation(): Boolean = {
    if (gdext.classes.RemoteTransform2D.mb_get_update_rotation == null) gdext.classes.RemoteTransform2D.mb_get_update_rotation = MethodBind.get("RemoteTransform2D", "get_update_rotation", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform2D.mb_get_update_rotation, livePtr)
  }

  /** RemoteTransform2D.set_update_scale */
  final def setUpdateScale(updateRemoteScale: Boolean): Unit = {
    if (gdext.classes.RemoteTransform2D.mb_set_update_scale == null) gdext.classes.RemoteTransform2D.mb_set_update_scale = MethodBind.get("RemoteTransform2D", "set_update_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.RemoteTransform2D.mb_set_update_scale, livePtr, updateRemoteScale)
  }

  /** RemoteTransform2D.get_update_scale */
  final def getUpdateScale(): Boolean = {
    if (gdext.classes.RemoteTransform2D.mb_get_update_scale == null) gdext.classes.RemoteTransform2D.mb_get_update_scale = MethodBind.get("RemoteTransform2D", "get_update_scale", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.RemoteTransform2D.mb_get_update_scale, livePtr)
  }

}

object RemoteTransform2D {
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
