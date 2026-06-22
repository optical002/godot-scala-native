package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RemoteTransform3D`, extends `Node3D`. */
abstract class RemoteTransform3D extends Node3D {

  /** RemoteTransform3D.force_update_cache */
  final def forceUpdateCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RemoteTransform3D", "force_update_cache", 3218959716L), hostObject.objectPtr)

  /** RemoteTransform3D.set_use_global_coordinates */
  final def setUseGlobalCoordinates(use_global_coordinates: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform3D", "set_use_global_coordinates", 2586408642L), hostObject.objectPtr, use_global_coordinates)

  /** RemoteTransform3D.get_use_global_coordinates */
  final def getUseGlobalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform3D", "get_use_global_coordinates", 36873697L), hostObject.objectPtr)

  /** RemoteTransform3D.set_update_position */
  final def setUpdatePosition(update_remote_position: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform3D", "set_update_position", 2586408642L), hostObject.objectPtr, update_remote_position)

  /** RemoteTransform3D.get_update_position */
  final def getUpdatePosition(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform3D", "get_update_position", 36873697L), hostObject.objectPtr)

  /** RemoteTransform3D.set_update_rotation */
  final def setUpdateRotation(update_remote_rotation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform3D", "set_update_rotation", 2586408642L), hostObject.objectPtr, update_remote_rotation)

  /** RemoteTransform3D.get_update_rotation */
  final def getUpdateRotation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform3D", "get_update_rotation", 36873697L), hostObject.objectPtr)

  /** RemoteTransform3D.set_update_scale */
  final def setUpdateScale(update_remote_scale: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform3D", "set_update_scale", 2586408642L), hostObject.objectPtr, update_remote_scale)

  /** RemoteTransform3D.get_update_scale */
  final def getUpdateScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform3D", "get_update_scale", 36873697L), hostObject.objectPtr)

}

object RemoteTransform3D {
  /** Class metadata for Gd[RemoteTransform3D] lifetime management and casting. */
  given GodotClass[RemoteTransform3D] with {
    def className = "RemoteTransform3D"
    def isRefCounted = false
    def wrap(o: GodotObject): RemoteTransform3D = new RemoteTransform3D {}.withHost(o.objectPtr)
    def unwrap(t: RemoteTransform3D): GodotObject = t.hostObject
  }
}
