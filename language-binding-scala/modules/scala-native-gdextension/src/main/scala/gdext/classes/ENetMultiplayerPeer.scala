package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ENetMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class ENetMultiplayerPeer extends MultiplayerPeer {
  override def godotClassName: String = "ENetMultiplayerPeer"

  /** ENetMultiplayerPeer.create_server */
  final def createServer(port: Long, maxClients: Long = 32L, maxChannels: Long = 0L, inBandwidth: Long = 0L, outBandwidth: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.ENetMultiplayerPeer.mb_create_server == null) gdext.classes.ENetMultiplayerPeer.mb_create_server = MethodBind.get("ENetMultiplayerPeer", "create_server", 2917761309L)
    gdext.classes.Error(Ptrcall.call5[Long, Long, Long, Long, Long, Long](gdext.classes.ENetMultiplayerPeer.mb_create_server, livePtr, port, maxClients, maxChannels, inBandwidth, outBandwidth))
  }

  /** ENetMultiplayerPeer.create_client */
  final def createClient(address: String, port: Long, channelCount: Long = 0L, inBandwidth: Long = 0L, outBandwidth: Long = 0L, localPort: Long = 0L): gdext.classes.Error = {
    if (gdext.classes.ENetMultiplayerPeer.mb_create_client == null) gdext.classes.ENetMultiplayerPeer.mb_create_client = MethodBind.get("ENetMultiplayerPeer", "create_client", 2327163476L)
    gdext.classes.Error(Ptrcall.call6[String, Long, Long, Long, Long, Long, Long](gdext.classes.ENetMultiplayerPeer.mb_create_client, livePtr, address, port, channelCount, inBandwidth, outBandwidth, localPort))
  }

  /** ENetMultiplayerPeer.create_mesh */
  final def createMesh(uniqueId: Long): gdext.classes.Error = {
    if (gdext.classes.ENetMultiplayerPeer.mb_create_mesh == null) gdext.classes.ENetMultiplayerPeer.mb_create_mesh = MethodBind.get("ENetMultiplayerPeer", "create_mesh", 844576869L)
    gdext.classes.Error(Ptrcall.call1[Long, Long](gdext.classes.ENetMultiplayerPeer.mb_create_mesh, livePtr, uniqueId))
  }

  /** ENetMultiplayerPeer.add_mesh_peer */
  final def addMeshPeer(peerId: Long, host: ENetConnection): gdext.classes.Error = {
    if (gdext.classes.ENetMultiplayerPeer.mb_add_mesh_peer == null) gdext.classes.ENetMultiplayerPeer.mb_add_mesh_peer = MethodBind.get("ENetMultiplayerPeer", "add_mesh_peer", 1293458335L)
    gdext.classes.Error(Ptrcall.call2[Long, GodotObject, Long](gdext.classes.ENetMultiplayerPeer.mb_add_mesh_peer, livePtr, peerId, Wrappers.handle(host)))
  }

  /** ENetMultiplayerPeer.set_bind_ip */
  final def setBindIp(ip: String): Unit = {
    if (gdext.classes.ENetMultiplayerPeer.mb_set_bind_ip == null) gdext.classes.ENetMultiplayerPeer.mb_set_bind_ip = MethodBind.get("ENetMultiplayerPeer", "set_bind_ip", 83702148L)
    Ptrcall.callVoid1(gdext.classes.ENetMultiplayerPeer.mb_set_bind_ip, livePtr, ip)
  }

  /** ENetMultiplayerPeer.get_host. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getHost(): ENetConnection = {
    if (gdext.classes.ENetMultiplayerPeer.mb_get_host == null) gdext.classes.ENetMultiplayerPeer.mb_get_host = MethodBind.get("ENetMultiplayerPeer", "get_host", 4103238886L)
    Wrappers.owned[ENetConnection](Ptrcall.call0[Long](gdext.classes.ENetMultiplayerPeer.mb_get_host, livePtr))
  }

  /** ENetMultiplayerPeer.get_peer. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPeer(id: Long): ENetPacketPeer = {
    if (gdext.classes.ENetMultiplayerPeer.mb_get_peer == null) gdext.classes.ENetMultiplayerPeer.mb_get_peer = MethodBind.get("ENetMultiplayerPeer", "get_peer", 3793311544L)
    Wrappers.owned[ENetPacketPeer](Ptrcall.call1[Long, Long](gdext.classes.ENetMultiplayerPeer.mb_get_peer, livePtr, id))
  }

}

object ENetMultiplayerPeer {
  private[classes] var mb_create_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_client: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_mesh_peer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bind_ip: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_peer: GDExtensionMethodBindPtr = null
}
