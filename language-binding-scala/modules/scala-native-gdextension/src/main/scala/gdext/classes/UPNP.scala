package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `UPNP`, extends `RefCounted`. */
abstract class UPNP extends RefCounted {
  override def godotClassName: String = "UPNP"

  /** UPNP.get_device_count */
  final def getDeviceCount(): Long = {
    if (gdext.classes.UPNP.mb_get_device_count == null) gdext.classes.UPNP.mb_get_device_count = MethodBind.get("UPNP", "get_device_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UPNP.mb_get_device_count, livePtr)
  }

  /** UPNP.get_device. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDevice(index: Long): UPNPDevice = {
    if (gdext.classes.UPNP.mb_get_device == null) gdext.classes.UPNP.mb_get_device = MethodBind.get("UPNP", "get_device", 2193290270L)
    Wrappers.owned[UPNPDevice](Ptrcall.call1[Long, Long](gdext.classes.UPNP.mb_get_device, livePtr, index))
  }

  /** UPNP.add_device */
  final def addDevice(device: UPNPDevice): Unit = {
    if (gdext.classes.UPNP.mb_add_device == null) gdext.classes.UPNP.mb_add_device = MethodBind.get("UPNP", "add_device", 986715920L)
    Ptrcall.callVoid1(gdext.classes.UPNP.mb_add_device, livePtr, Wrappers.handle(device))
  }

  /** UPNP.set_device */
  final def setDevice(index: Long, device: UPNPDevice): Unit = {
    if (gdext.classes.UPNP.mb_set_device == null) gdext.classes.UPNP.mb_set_device = MethodBind.get("UPNP", "set_device", 3015133723L)
    Ptrcall.callVoid2(gdext.classes.UPNP.mb_set_device, livePtr, index, Wrappers.handle(device))
  }

  /** UPNP.remove_device */
  final def removeDevice(index: Long): Unit = {
    if (gdext.classes.UPNP.mb_remove_device == null) gdext.classes.UPNP.mb_remove_device = MethodBind.get("UPNP", "remove_device", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.UPNP.mb_remove_device, livePtr, index)
  }

  /** UPNP.clear_devices */
  final def clearDevices(): Unit = {
    if (gdext.classes.UPNP.mb_clear_devices == null) gdext.classes.UPNP.mb_clear_devices = MethodBind.get("UPNP", "clear_devices", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.UPNP.mb_clear_devices, livePtr)
  }

  /** UPNP.get_gateway. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getGateway(): UPNPDevice = {
    if (gdext.classes.UPNP.mb_get_gateway == null) gdext.classes.UPNP.mb_get_gateway = MethodBind.get("UPNP", "get_gateway", 2276800779L)
    Wrappers.owned[UPNPDevice](Ptrcall.call0[Long](gdext.classes.UPNP.mb_get_gateway, livePtr))
  }

  /** UPNP.discover */
  final def discover(timeout: Long = 2000L, ttl: Long = 2L, deviceFilter: String = "InternetGatewayDevice"): Long = {
    if (gdext.classes.UPNP.mb_discover == null) gdext.classes.UPNP.mb_discover = MethodBind.get("UPNP", "discover", 1575334765L)
    Ptrcall.call3[Long, Long, String, Long](gdext.classes.UPNP.mb_discover, livePtr, timeout, ttl, deviceFilter)
  }

  /** UPNP.query_external_address */
  final def queryExternalAddress(): String = {
    if (gdext.classes.UPNP.mb_query_external_address == null) gdext.classes.UPNP.mb_query_external_address = MethodBind.get("UPNP", "query_external_address", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNP.mb_query_external_address, livePtr)
  }

  /** UPNP.add_port_mapping */
  final def addPortMapping(port: Long, portInternal: Long = 0L, desc: String = "", proto: String = "UDP", duration: Long = 0L): Long = {
    if (gdext.classes.UPNP.mb_add_port_mapping == null) gdext.classes.UPNP.mb_add_port_mapping = MethodBind.get("UPNP", "add_port_mapping", 818314583L)
    Ptrcall.call5[Long, Long, String, String, Long, Long](gdext.classes.UPNP.mb_add_port_mapping, livePtr, port, portInternal, desc, proto, duration)
  }

  /** UPNP.delete_port_mapping */
  final def deletePortMapping(port: Long, proto: String = "UDP"): Long = {
    if (gdext.classes.UPNP.mb_delete_port_mapping == null) gdext.classes.UPNP.mb_delete_port_mapping = MethodBind.get("UPNP", "delete_port_mapping", 3444187325L)
    Ptrcall.call2[Long, String, Long](gdext.classes.UPNP.mb_delete_port_mapping, livePtr, port, proto)
  }

  /** UPNP.set_discover_multicast_if */
  final def setDiscoverMulticastIf(mIf: String): Unit = {
    if (gdext.classes.UPNP.mb_set_discover_multicast_if == null) gdext.classes.UPNP.mb_set_discover_multicast_if = MethodBind.get("UPNP", "set_discover_multicast_if", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNP.mb_set_discover_multicast_if, livePtr, mIf)
  }

  /** UPNP.get_discover_multicast_if */
  final def getDiscoverMulticastIf(): String = {
    if (gdext.classes.UPNP.mb_get_discover_multicast_if == null) gdext.classes.UPNP.mb_get_discover_multicast_if = MethodBind.get("UPNP", "get_discover_multicast_if", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNP.mb_get_discover_multicast_if, livePtr)
  }

  /** UPNP.set_discover_local_port */
  final def setDiscoverLocalPort(port: Long): Unit = {
    if (gdext.classes.UPNP.mb_set_discover_local_port == null) gdext.classes.UPNP.mb_set_discover_local_port = MethodBind.get("UPNP", "set_discover_local_port", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.UPNP.mb_set_discover_local_port, livePtr, port)
  }

  /** UPNP.get_discover_local_port */
  final def getDiscoverLocalPort(): Long = {
    if (gdext.classes.UPNP.mb_get_discover_local_port == null) gdext.classes.UPNP.mb_get_discover_local_port = MethodBind.get("UPNP", "get_discover_local_port", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.UPNP.mb_get_discover_local_port, livePtr)
  }

  /** UPNP.set_discover_ipv6 */
  final def setDiscoverIpv6(ipv6: Boolean): Unit = {
    if (gdext.classes.UPNP.mb_set_discover_ipv6 == null) gdext.classes.UPNP.mb_set_discover_ipv6 = MethodBind.get("UPNP", "set_discover_ipv6", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.UPNP.mb_set_discover_ipv6, livePtr, ipv6)
  }

  /** UPNP.is_discover_ipv6 */
  final def isDiscoverIpv6(): Boolean = {
    if (gdext.classes.UPNP.mb_is_discover_ipv6 == null) gdext.classes.UPNP.mb_is_discover_ipv6 = MethodBind.get("UPNP", "is_discover_ipv6", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UPNP.mb_is_discover_ipv6, livePtr)
  }

}

object UPNP {
  private[classes] var mb_get_device_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_device: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_devices: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gateway: GDExtensionMethodBindPtr = null
  private[classes] var mb_discover: GDExtensionMethodBindPtr = null
  private[classes] var mb_query_external_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_port_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_port_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_discover_multicast_if: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_discover_multicast_if: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_discover_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_discover_local_port: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_discover_ipv6: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_discover_ipv6: GDExtensionMethodBindPtr = null

  /** Godot enum `UPNP.UPNPResult`. */
  opaque type UPNPResult <: Long = Long

  object UPNPResult {
    final val Success: UPNPResult = 0L.asInstanceOf[UPNPResult]
    final val NotAuthorized: UPNPResult = 1L.asInstanceOf[UPNPResult]
    final val PortMappingNotFound: UPNPResult = 2L.asInstanceOf[UPNPResult]
    final val InconsistentParameters: UPNPResult = 3L.asInstanceOf[UPNPResult]
    final val NoSuchEntryInArray: UPNPResult = 4L.asInstanceOf[UPNPResult]
    final val ActionFailed: UPNPResult = 5L.asInstanceOf[UPNPResult]
    final val SrcIpWildcardNotPermitted: UPNPResult = 6L.asInstanceOf[UPNPResult]
    final val ExtPortWildcardNotPermitted: UPNPResult = 7L.asInstanceOf[UPNPResult]
    final val IntPortWildcardNotPermitted: UPNPResult = 8L.asInstanceOf[UPNPResult]
    final val RemoteHostMustBeWildcard: UPNPResult = 9L.asInstanceOf[UPNPResult]
    final val ExtPortMustBeWildcard: UPNPResult = 10L.asInstanceOf[UPNPResult]
    final val NoPortMapsAvailable: UPNPResult = 11L.asInstanceOf[UPNPResult]
    final val ConflictWithOtherMechanism: UPNPResult = 12L.asInstanceOf[UPNPResult]
    final val ConflictWithOtherMapping: UPNPResult = 13L.asInstanceOf[UPNPResult]
    final val SamePortValuesRequired: UPNPResult = 14L.asInstanceOf[UPNPResult]
    final val OnlyPermanentLeaseSupported: UPNPResult = 15L.asInstanceOf[UPNPResult]
    final val InvalidGateway: UPNPResult = 16L.asInstanceOf[UPNPResult]
    final val InvalidPort: UPNPResult = 17L.asInstanceOf[UPNPResult]
    final val InvalidProtocol: UPNPResult = 18L.asInstanceOf[UPNPResult]
    final val InvalidDuration: UPNPResult = 19L.asInstanceOf[UPNPResult]
    final val InvalidArgs: UPNPResult = 20L.asInstanceOf[UPNPResult]
    final val InvalidResponse: UPNPResult = 21L.asInstanceOf[UPNPResult]
    final val InvalidParam: UPNPResult = 22L.asInstanceOf[UPNPResult]
    final val HttpError: UPNPResult = 23L.asInstanceOf[UPNPResult]
    final val SocketError: UPNPResult = 24L.asInstanceOf[UPNPResult]
    final val MemAllocError: UPNPResult = 25L.asInstanceOf[UPNPResult]
    final val NoGateway: UPNPResult = 26L.asInstanceOf[UPNPResult]
    final val NoDevices: UPNPResult = 27L.asInstanceOf[UPNPResult]
    final val UnknownError: UPNPResult = 28L.asInstanceOf[UPNPResult]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UPNPResult = value.asInstanceOf[UPNPResult]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UPNPResult] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L, 14L, 15L, 16L, 17L, 18L, 19L, 20L, 21L, 22L, 23L, 24L, 25L, 26L, 27L, 28L).asInstanceOf[scala.IArray[UPNPResult]]

    extension (self: UPNPResult)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Success"
        case 1L => "NotAuthorized"
        case 2L => "PortMappingNotFound"
        case 3L => "InconsistentParameters"
        case 4L => "NoSuchEntryInArray"
        case 5L => "ActionFailed"
        case 6L => "SrcIpWildcardNotPermitted"
        case 7L => "ExtPortWildcardNotPermitted"
        case 8L => "IntPortWildcardNotPermitted"
        case 9L => "RemoteHostMustBeWildcard"
        case 10L => "ExtPortMustBeWildcard"
        case 11L => "NoPortMapsAvailable"
        case 12L => "ConflictWithOtherMechanism"
        case 13L => "ConflictWithOtherMapping"
        case 14L => "SamePortValuesRequired"
        case 15L => "OnlyPermanentLeaseSupported"
        case 16L => "InvalidGateway"
        case 17L => "InvalidPort"
        case 18L => "InvalidProtocol"
        case 19L => "InvalidDuration"
        case 20L => "InvalidArgs"
        case 21L => "InvalidResponse"
        case 22L => "InvalidParam"
        case 23L => "HttpError"
        case 24L => "SocketError"
        case 25L => "MemAllocError"
        case 26L => "NoGateway"
        case 27L => "NoDevices"
        case 28L => "UnknownError"
        case other => other.toString
      }
  }
}
