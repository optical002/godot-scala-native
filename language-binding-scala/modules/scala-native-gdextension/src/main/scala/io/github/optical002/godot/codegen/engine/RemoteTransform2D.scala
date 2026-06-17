package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RemoteTransform2D`, extends `Node2D`. */
abstract class RemoteTransform2D extends Node2D {

  /** RemoteTransform2D.force_update_cache */
  final def forceUpdateCache(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RemoteTransform2D", "force_update_cache", 3218959716L), hostObject.objectPtr)

  /** RemoteTransform2D.set_use_global_coordinates */
  final def setUseGlobalCoordinates(use_global_coordinates: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform2D", "set_use_global_coordinates", 2586408642L), hostObject.objectPtr, use_global_coordinates)

  /** RemoteTransform2D.get_use_global_coordinates */
  final def getUseGlobalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform2D", "get_use_global_coordinates", 36873697L), hostObject.objectPtr)

  /** RemoteTransform2D.set_update_position */
  final def setUpdatePosition(update_remote_position: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform2D", "set_update_position", 2586408642L), hostObject.objectPtr, update_remote_position)

  /** RemoteTransform2D.get_update_position */
  final def getUpdatePosition(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform2D", "get_update_position", 36873697L), hostObject.objectPtr)

  /** RemoteTransform2D.set_update_rotation */
  final def setUpdateRotation(update_remote_rotation: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform2D", "set_update_rotation", 2586408642L), hostObject.objectPtr, update_remote_rotation)

  /** RemoteTransform2D.get_update_rotation */
  final def getUpdateRotation(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform2D", "get_update_rotation", 36873697L), hostObject.objectPtr)

  /** RemoteTransform2D.set_update_scale */
  final def setUpdateScale(update_remote_scale: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("RemoteTransform2D", "set_update_scale", 2586408642L), hostObject.objectPtr, update_remote_scale)

  /** RemoteTransform2D.get_update_scale */
  final def getUpdateScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RemoteTransform2D", "get_update_scale", 36873697L), hostObject.objectPtr)

}

object RemoteTransform2D {
  /** Class metadata for Gd[RemoteTransform2D] lifetime management and casting. */
  given GodotClass[RemoteTransform2D] with {
    def className = "RemoteTransform2D"
    def isRefCounted = false
    def wrap(o: GodotObject): RemoteTransform2D = new RemoteTransform2D {}.withHost(o.objectPtr)
    def unwrap(t: RemoteTransform2D): GodotObject = t.hostObject
  }
}
