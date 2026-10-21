package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiplayerSynchronizer`, extends `Node`. */
abstract class MultiplayerSynchronizer extends Node {
  override def godotClassName: String = "MultiplayerSynchronizer"

  /** MultiplayerSynchronizer.set_replication_interval */
  final def setReplicationInterval(milliseconds: Double): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_replication_interval == null) gdext.classes.MultiplayerSynchronizer.mb_set_replication_interval = MethodBind.get("MultiplayerSynchronizer", "set_replication_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_set_replication_interval, livePtr, milliseconds)
  }

  /** MultiplayerSynchronizer.get_replication_interval */
  final def getReplicationInterval(): Double = {
    if (gdext.classes.MultiplayerSynchronizer.mb_get_replication_interval == null) gdext.classes.MultiplayerSynchronizer.mb_get_replication_interval = MethodBind.get("MultiplayerSynchronizer", "get_replication_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MultiplayerSynchronizer.mb_get_replication_interval, livePtr)
  }

  /** MultiplayerSynchronizer.set_delta_interval */
  final def setDeltaInterval(milliseconds: Double): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_delta_interval == null) gdext.classes.MultiplayerSynchronizer.mb_set_delta_interval = MethodBind.get("MultiplayerSynchronizer", "set_delta_interval", 373806689L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_set_delta_interval, livePtr, milliseconds)
  }

  /** MultiplayerSynchronizer.get_delta_interval */
  final def getDeltaInterval(): Double = {
    if (gdext.classes.MultiplayerSynchronizer.mb_get_delta_interval == null) gdext.classes.MultiplayerSynchronizer.mb_get_delta_interval = MethodBind.get("MultiplayerSynchronizer", "get_delta_interval", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.MultiplayerSynchronizer.mb_get_delta_interval, livePtr)
  }

  /** MultiplayerSynchronizer.set_replication_config */
  final def setReplicationConfig(config: SceneReplicationConfig): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_replication_config == null) gdext.classes.MultiplayerSynchronizer.mb_set_replication_config = MethodBind.get("MultiplayerSynchronizer", "set_replication_config", 3889206742L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_set_replication_config, livePtr, Wrappers.handle(config))
  }

  /** MultiplayerSynchronizer.get_replication_config. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getReplicationConfig(): SceneReplicationConfig = {
    if (gdext.classes.MultiplayerSynchronizer.mb_get_replication_config == null) gdext.classes.MultiplayerSynchronizer.mb_get_replication_config = MethodBind.get("MultiplayerSynchronizer", "get_replication_config", 3200254614L)
    Wrappers.owned[SceneReplicationConfig](Ptrcall.call0[Long](gdext.classes.MultiplayerSynchronizer.mb_get_replication_config, livePtr))
  }

  /** MultiplayerSynchronizer.set_visibility_update_mode */
  final def setVisibilityUpdateMode(mode: Long): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_visibility_update_mode == null) gdext.classes.MultiplayerSynchronizer.mb_set_visibility_update_mode = MethodBind.get("MultiplayerSynchronizer", "set_visibility_update_mode", 3494860300L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_set_visibility_update_mode, livePtr, mode)
  }

  /** MultiplayerSynchronizer.get_visibility_update_mode */
  final def getVisibilityUpdateMode(): Long = {
    if (gdext.classes.MultiplayerSynchronizer.mb_get_visibility_update_mode == null) gdext.classes.MultiplayerSynchronizer.mb_get_visibility_update_mode = MethodBind.get("MultiplayerSynchronizer", "get_visibility_update_mode", 3352241418L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerSynchronizer.mb_get_visibility_update_mode, livePtr)
  }

  /** MultiplayerSynchronizer.update_visibility */
  final def updateVisibility(for_peer: Long): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_update_visibility == null) gdext.classes.MultiplayerSynchronizer.mb_update_visibility = MethodBind.get("MultiplayerSynchronizer", "update_visibility", 1995695955L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_update_visibility, livePtr, for_peer)
  }

  /** MultiplayerSynchronizer.set_visibility_public */
  final def setVisibilityPublic(visible: Boolean): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_visibility_public == null) gdext.classes.MultiplayerSynchronizer.mb_set_visibility_public = MethodBind.get("MultiplayerSynchronizer", "set_visibility_public", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerSynchronizer.mb_set_visibility_public, livePtr, visible)
  }

  /** MultiplayerSynchronizer.is_visibility_public */
  final def isVisibilityPublic(): Boolean = {
    if (gdext.classes.MultiplayerSynchronizer.mb_is_visibility_public == null) gdext.classes.MultiplayerSynchronizer.mb_is_visibility_public = MethodBind.get("MultiplayerSynchronizer", "is_visibility_public", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.MultiplayerSynchronizer.mb_is_visibility_public, livePtr)
  }

  /** MultiplayerSynchronizer.set_visibility_for */
  final def setVisibilityFor(peer: Long, visible: Boolean): Unit = {
    if (gdext.classes.MultiplayerSynchronizer.mb_set_visibility_for == null) gdext.classes.MultiplayerSynchronizer.mb_set_visibility_for = MethodBind.get("MultiplayerSynchronizer", "set_visibility_for", 300928843L)
    Ptrcall.callVoid2(gdext.classes.MultiplayerSynchronizer.mb_set_visibility_for, livePtr, peer, visible)
  }

  /** MultiplayerSynchronizer.get_visibility_for */
  final def getVisibilityFor(peer: Long): Boolean = {
    if (gdext.classes.MultiplayerSynchronizer.mb_get_visibility_for == null) gdext.classes.MultiplayerSynchronizer.mb_get_visibility_for = MethodBind.get("MultiplayerSynchronizer", "get_visibility_for", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.MultiplayerSynchronizer.mb_get_visibility_for, livePtr, peer)
  }

}

object MultiplayerSynchronizer {
  private[classes] var mb_set_replication_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_replication_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_delta_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_delta_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_replication_config: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_replication_config: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_update_visibility: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_public: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visibility_public: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_for: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_for: GDExtensionMethodBindPtr = null
}
