package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `UPNP`, extends `RefCounted`. */
abstract class UPNP extends RefCounted {

  /** UPNP.get_device_count */
  final def getDeviceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("UPNP", "get_device_count", 3905245786L), hostObject.objectPtr)

  /** UPNP.get_device */
  final def getDevice(index: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("UPNP", "get_device", 2193290270L), hostObject.objectPtr, index)

  /** UPNP.add_device */
  final def addDevice(device: UPNPDevice): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNP", "add_device", 986715920L), hostObject.objectPtr, device.hostObject)

  /** UPNP.set_device */
  final def setDevice(index: Long, device: UPNPDevice): Unit =
    Ptrcall.callVoid2(MethodBind.get("UPNP", "set_device", 3015133723L), hostObject.objectPtr, index, device.hostObject)

  /** UPNP.remove_device */
  final def removeDevice(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNP", "remove_device", 1286410249L), hostObject.objectPtr, index)

  /** UPNP.clear_devices */
  final def clearDevices(): Unit =
    Ptrcall.callVoid0(MethodBind.get("UPNP", "clear_devices", 3218959716L), hostObject.objectPtr)

  /** UPNP.get_gateway */
  final def getGateway(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("UPNP", "get_gateway", 2276800779L), hostObject.objectPtr)

  /** UPNP.discover */
  final def discover(timeout: Long, ttl: Long, device_filter: String): Long =
    Ptrcall.call3[Long, Long, String, Long](MethodBind.get("UPNP", "discover", 1575334765L), hostObject.objectPtr, timeout, ttl, device_filter)

  /** UPNP.query_external_address */
  final def queryExternalAddress(): String =
    Ptrcall.call0[String](MethodBind.get("UPNP", "query_external_address", 201670096L), hostObject.objectPtr)

  /** UPNP.add_port_mapping */
  final def addPortMapping(port: Long, port_internal: Long, desc: String, proto: String, duration: Long): Long =
    Ptrcall.call5[Long, Long, String, String, Long, Long](MethodBind.get("UPNP", "add_port_mapping", 818314583L), hostObject.objectPtr, port, port_internal, desc, proto, duration)

  /** UPNP.delete_port_mapping */
  final def deletePortMapping(port: Long, proto: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("UPNP", "delete_port_mapping", 3444187325L), hostObject.objectPtr, port, proto)

  /** UPNP.set_discover_multicast_if */
  final def setDiscoverMulticastIf(m_if: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNP", "set_discover_multicast_if", 83702148L), hostObject.objectPtr, m_if)

  /** UPNP.get_discover_multicast_if */
  final def getDiscoverMulticastIf(): String =
    Ptrcall.call0[String](MethodBind.get("UPNP", "get_discover_multicast_if", 201670096L), hostObject.objectPtr)

  /** UPNP.set_discover_local_port */
  final def setDiscoverLocalPort(port: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNP", "set_discover_local_port", 1286410249L), hostObject.objectPtr, port)

  /** UPNP.get_discover_local_port */
  final def getDiscoverLocalPort(): Long =
    Ptrcall.call0[Long](MethodBind.get("UPNP", "get_discover_local_port", 3905245786L), hostObject.objectPtr)

  /** UPNP.set_discover_ipv6 */
  final def setDiscoverIpv6(ipv6: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNP", "set_discover_ipv6", 2586408642L), hostObject.objectPtr, ipv6)

  /** UPNP.is_discover_ipv6 */
  final def isDiscoverIpv6(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UPNP", "is_discover_ipv6", 36873697L), hostObject.objectPtr)

}

object UPNP {
  /** Class metadata for Gd[UPNP] lifetime management and casting. */
  given GodotClass[UPNP] with {
    def className = "UPNP"
    def isRefCounted = true
    def wrap(o: GodotObject): UPNP = new UPNP {}.withHost(o.objectPtr)
    def unwrap(t: UPNP): GodotObject = t.hostObject
  }
}
