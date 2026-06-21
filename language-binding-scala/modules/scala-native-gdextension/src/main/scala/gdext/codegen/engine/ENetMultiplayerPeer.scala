package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ENetMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class ENetMultiplayerPeer extends MultiplayerPeer {

  /** ENetMultiplayerPeer.create_server */
  final def createServer(port: Long, max_clients: Long, max_channels: Long, in_bandwidth: Long, out_bandwidth: Long): Long =
    Ptrcall.call5[Long, Long, Long, Long, Long, Long](MethodBind.get("ENetMultiplayerPeer", "create_server", 2917761309L), hostObject.objectPtr, port, max_clients, max_channels, in_bandwidth, out_bandwidth)

  /** ENetMultiplayerPeer.create_client */
  final def createClient(address: String, port: Long, channel_count: Long, in_bandwidth: Long, out_bandwidth: Long, local_port: Long): Long =
    Ptrcall.call6[String, Long, Long, Long, Long, Long, Long](MethodBind.get("ENetMultiplayerPeer", "create_client", 2327163476L), hostObject.objectPtr, address, port, channel_count, in_bandwidth, out_bandwidth, local_port)

  /** ENetMultiplayerPeer.create_mesh */
  final def createMesh(unique_id: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("ENetMultiplayerPeer", "create_mesh", 844576869L), hostObject.objectPtr, unique_id)

  /** ENetMultiplayerPeer.add_mesh_peer */
  final def addMeshPeer(peer_id: Long, host: ENetConnection): Long =
    Ptrcall.call2[Long, GodotObject, Long](MethodBind.get("ENetMultiplayerPeer", "add_mesh_peer", 1293458335L), hostObject.objectPtr, peer_id, host.hostObject)

  /** ENetMultiplayerPeer.set_bind_ip */
  final def setBindIp(ip: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("ENetMultiplayerPeer", "set_bind_ip", 83702148L), hostObject.objectPtr, ip)

  /** ENetMultiplayerPeer.get_host */
  final def getHost(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ENetMultiplayerPeer", "get_host", 4103238886L), hostObject.objectPtr)

  /** ENetMultiplayerPeer.get_peer */
  final def getPeer(id: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("ENetMultiplayerPeer", "get_peer", 3793311544L), hostObject.objectPtr, id)

}

object ENetMultiplayerPeer {
  /** Class metadata for Gd[ENetMultiplayerPeer] lifetime management and casting. */
  given GodotClass[ENetMultiplayerPeer] with {
    def className = "ENetMultiplayerPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): ENetMultiplayerPeer = new ENetMultiplayerPeer {}.withHost(o.objectPtr)
    def unwrap(t: ENetMultiplayerPeer): GodotObject = t.hostObject
  }
}
