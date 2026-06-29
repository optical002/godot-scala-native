package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerSynchronizer`, extends `Node`. */
abstract class MultiplayerSynchronizer extends Node {
  override def godotClassName: String = "MultiplayerSynchronizer"

  /** MultiplayerSynchronizer.set_replication_interval */
  final def setReplicationInterval(milliseconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "set_replication_interval", 373806689L), hostObject.objectPtr, milliseconds)

  /** MultiplayerSynchronizer.get_replication_interval */
  final def getReplicationInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("MultiplayerSynchronizer", "get_replication_interval", 1740695150L), hostObject.objectPtr)

  /** MultiplayerSynchronizer.set_delta_interval */
  final def setDeltaInterval(milliseconds: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "set_delta_interval", 373806689L), hostObject.objectPtr, milliseconds)

  /** MultiplayerSynchronizer.get_delta_interval */
  final def getDeltaInterval(): Double =
    Ptrcall.call0[Double](MethodBind.get("MultiplayerSynchronizer", "get_delta_interval", 1740695150L), hostObject.objectPtr)

  /** MultiplayerSynchronizer.set_replication_config */
  final def setReplicationConfig(config: SceneReplicationConfig): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "set_replication_config", 3889206742L), hostObject.objectPtr, config.hostObject)

  /** MultiplayerSynchronizer.get_replication_config */
  final def getReplicationConfig(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiplayerSynchronizer", "get_replication_config", 3200254614L), hostObject.objectPtr)

  /** MultiplayerSynchronizer.set_visibility_update_mode */
  final def setVisibilityUpdateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "set_visibility_update_mode", 3494860300L), hostObject.objectPtr, mode)

  /** MultiplayerSynchronizer.get_visibility_update_mode */
  final def getVisibilityUpdateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("MultiplayerSynchronizer", "get_visibility_update_mode", 3352241418L), hostObject.objectPtr)

  /** MultiplayerSynchronizer.update_visibility */
  final def updateVisibility(for_peer: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "update_visibility", 1995695955L), hostObject.objectPtr, for_peer)

  /** MultiplayerSynchronizer.set_visibility_public */
  final def setVisibilityPublic(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiplayerSynchronizer", "set_visibility_public", 2586408642L), hostObject.objectPtr, visible)

  /** MultiplayerSynchronizer.is_visibility_public */
  final def isVisibilityPublic(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("MultiplayerSynchronizer", "is_visibility_public", 36873697L), hostObject.objectPtr)

  /** MultiplayerSynchronizer.set_visibility_for */
  final def setVisibilityFor(peer: Long, visible: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("MultiplayerSynchronizer", "set_visibility_for", 300928843L), hostObject.objectPtr, peer, visible)

  /** MultiplayerSynchronizer.get_visibility_for */
  final def getVisibilityFor(peer: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("MultiplayerSynchronizer", "get_visibility_for", 1116898809L), hostObject.objectPtr, peer)

}
