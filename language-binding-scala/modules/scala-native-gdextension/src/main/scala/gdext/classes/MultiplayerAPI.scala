package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `MultiplayerAPI`, extends `RefCounted`. */
abstract class MultiplayerAPI extends RefCounted {
  override def godotClassName: String = "MultiplayerAPI"

  /** MultiplayerAPI.has_multiplayer_peer */
  final def hasMultiplayerPeer(): Boolean = {
    if (gdext.classes.MultiplayerAPI.mb_has_multiplayer_peer == null) gdext.classes.MultiplayerAPI.mb_has_multiplayer_peer = MethodBind.get("MultiplayerAPI", "has_multiplayer_peer", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.MultiplayerAPI.mb_has_multiplayer_peer, livePtr)
  }

  /** MultiplayerAPI.get_multiplayer_peer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMultiplayerPeer(): MultiplayerPeer = {
    if (gdext.classes.MultiplayerAPI.mb_get_multiplayer_peer == null) gdext.classes.MultiplayerAPI.mb_get_multiplayer_peer = MethodBind.get("MultiplayerAPI", "get_multiplayer_peer", 3223692825L)
    Wrappers.owned[MultiplayerPeer](Ptrcall.call0[Long](gdext.classes.MultiplayerAPI.mb_get_multiplayer_peer, livePtr))
  }

  /** MultiplayerAPI.set_multiplayer_peer */
  final def setMultiplayerPeer(peer: MultiplayerPeer): Unit = {
    if (gdext.classes.MultiplayerAPI.mb_set_multiplayer_peer == null) gdext.classes.MultiplayerAPI.mb_set_multiplayer_peer = MethodBind.get("MultiplayerAPI", "set_multiplayer_peer", 3694835298L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerAPI.mb_set_multiplayer_peer, livePtr, Wrappers.handle(peer))
  }

  /** MultiplayerAPI.get_unique_id */
  final def getUniqueId(): Long = {
    if (gdext.classes.MultiplayerAPI.mb_get_unique_id == null) gdext.classes.MultiplayerAPI.mb_get_unique_id = MethodBind.get("MultiplayerAPI", "get_unique_id", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerAPI.mb_get_unique_id, livePtr)
  }

  /** MultiplayerAPI.is_server */
  final def isServer(): Boolean = {
    if (gdext.classes.MultiplayerAPI.mb_is_server == null) gdext.classes.MultiplayerAPI.mb_is_server = MethodBind.get("MultiplayerAPI", "is_server", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.MultiplayerAPI.mb_is_server, livePtr)
  }

  /** MultiplayerAPI.get_remote_sender_id */
  final def getRemoteSenderId(): Long = {
    if (gdext.classes.MultiplayerAPI.mb_get_remote_sender_id == null) gdext.classes.MultiplayerAPI.mb_get_remote_sender_id = MethodBind.get("MultiplayerAPI", "get_remote_sender_id", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.MultiplayerAPI.mb_get_remote_sender_id, livePtr)
  }

  /** MultiplayerAPI.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.MultiplayerAPI.mb_poll == null) gdext.classes.MultiplayerAPI.mb_poll = MethodBind.get("MultiplayerAPI", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.MultiplayerAPI.mb_poll, livePtr))
  }

}

object MultiplayerAPI {
  private[classes] var mb_has_multiplayer_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_multiplayer_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_multiplayer_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_unique_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_remote_sender_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_interface: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_default_interface: GDExtensionMethodBindPtr = null

  /** MultiplayerAPI.set_default_interface */
  final def setDefaultInterface(interfaceName: String): Unit = {
    if (gdext.classes.MultiplayerAPI.mb_set_default_interface == null) gdext.classes.MultiplayerAPI.mb_set_default_interface = MethodBind.get("MultiplayerAPI", "set_default_interface", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.MultiplayerAPI.mb_set_default_interface, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], SnArg(interfaceName))
  }

  /** MultiplayerAPI.get_default_interface */
  final def getDefaultInterface(): String = {
    if (gdext.classes.MultiplayerAPI.mb_get_default_interface == null) gdext.classes.MultiplayerAPI.mb_get_default_interface = MethodBind.get("MultiplayerAPI", "get_default_interface", 2737447660L)
    Ptrcall.call0[SnArg](gdext.classes.MultiplayerAPI.mb_get_default_interface, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr])
  }

  /** MultiplayerAPI.create_default_interface. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def createDefaultInterface(): MultiplayerAPI = {
    if (gdext.classes.MultiplayerAPI.mb_create_default_interface == null) gdext.classes.MultiplayerAPI.mb_create_default_interface = MethodBind.get("MultiplayerAPI", "create_default_interface", 3294156723L)
    Wrappers.owned[MultiplayerAPI](Ptrcall.call0[Long](gdext.classes.MultiplayerAPI.mb_create_default_interface, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr]))
  }

  /** Godot enum `MultiplayerAPI.RPCMode`. */
  opaque type RPCMode <: Long = Long

  object RPCMode {
    final val Disabled: RPCMode = 0L.asInstanceOf[RPCMode]
    final val AnyPeer: RPCMode = 1L.asInstanceOf[RPCMode]
    final val Authority: RPCMode = 2L.asInstanceOf[RPCMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): RPCMode = value.asInstanceOf[RPCMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[RPCMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[RPCMode]]

    extension (self: RPCMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "AnyPeer"
        case 2L => "Authority"
        case other => other.toString
      }
  }
}
