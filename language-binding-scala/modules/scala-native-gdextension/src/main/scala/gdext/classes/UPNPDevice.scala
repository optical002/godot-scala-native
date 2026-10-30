package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `UPNPDevice`, extends `RefCounted`. */
abstract class UPNPDevice extends RefCounted {
  override def godotClassName: String = "UPNPDevice"

  /** UPNPDevice.is_valid_gateway */
  final def isValidGateway(): Boolean = {
    if (gdext.classes.UPNPDevice.mb_is_valid_gateway == null) gdext.classes.UPNPDevice.mb_is_valid_gateway = MethodBind.get("UPNPDevice", "is_valid_gateway", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.UPNPDevice.mb_is_valid_gateway, livePtr)
  }

  /** UPNPDevice.query_external_address */
  final def queryExternalAddress(): String = {
    if (gdext.classes.UPNPDevice.mb_query_external_address == null) gdext.classes.UPNPDevice.mb_query_external_address = MethodBind.get("UPNPDevice", "query_external_address", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_query_external_address, livePtr)
  }

  /** UPNPDevice.add_port_mapping */
  final def addPortMapping(port: Long, portInternal: Long = 0L, desc: String = "", proto: String = "UDP", duration: Long = 0L): Long = {
    if (gdext.classes.UPNPDevice.mb_add_port_mapping == null) gdext.classes.UPNPDevice.mb_add_port_mapping = MethodBind.get("UPNPDevice", "add_port_mapping", 818314583L)
    Ptrcall.call5[Long, Long, String, String, Long, Long](gdext.classes.UPNPDevice.mb_add_port_mapping, livePtr, port, portInternal, desc, proto, duration)
  }

  /** UPNPDevice.delete_port_mapping */
  final def deletePortMapping(port: Long, proto: String = "UDP"): Long = {
    if (gdext.classes.UPNPDevice.mb_delete_port_mapping == null) gdext.classes.UPNPDevice.mb_delete_port_mapping = MethodBind.get("UPNPDevice", "delete_port_mapping", 3444187325L)
    Ptrcall.call2[Long, String, Long](gdext.classes.UPNPDevice.mb_delete_port_mapping, livePtr, port, proto)
  }

  /** UPNPDevice.set_description_url */
  final def setDescriptionUrl(url: String): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_description_url == null) gdext.classes.UPNPDevice.mb_set_description_url = MethodBind.get("UPNPDevice", "set_description_url", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_description_url, livePtr, url)
  }

  /** UPNPDevice.get_description_url */
  final def getDescriptionUrl(): String = {
    if (gdext.classes.UPNPDevice.mb_get_description_url == null) gdext.classes.UPNPDevice.mb_get_description_url = MethodBind.get("UPNPDevice", "get_description_url", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_get_description_url, livePtr)
  }

  /** UPNPDevice.set_service_type */
  final def setServiceType(`type`: String): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_service_type == null) gdext.classes.UPNPDevice.mb_set_service_type = MethodBind.get("UPNPDevice", "set_service_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_service_type, livePtr, `type`)
  }

  /** UPNPDevice.get_service_type */
  final def getServiceType(): String = {
    if (gdext.classes.UPNPDevice.mb_get_service_type == null) gdext.classes.UPNPDevice.mb_get_service_type = MethodBind.get("UPNPDevice", "get_service_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_get_service_type, livePtr)
  }

  /** UPNPDevice.set_igd_control_url */
  final def setIgdControlUrl(url: String): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_igd_control_url == null) gdext.classes.UPNPDevice.mb_set_igd_control_url = MethodBind.get("UPNPDevice", "set_igd_control_url", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_igd_control_url, livePtr, url)
  }

  /** UPNPDevice.get_igd_control_url */
  final def getIgdControlUrl(): String = {
    if (gdext.classes.UPNPDevice.mb_get_igd_control_url == null) gdext.classes.UPNPDevice.mb_get_igd_control_url = MethodBind.get("UPNPDevice", "get_igd_control_url", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_get_igd_control_url, livePtr)
  }

  /** UPNPDevice.set_igd_service_type */
  final def setIgdServiceType(`type`: String): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_igd_service_type == null) gdext.classes.UPNPDevice.mb_set_igd_service_type = MethodBind.get("UPNPDevice", "set_igd_service_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_igd_service_type, livePtr, `type`)
  }

  /** UPNPDevice.get_igd_service_type */
  final def getIgdServiceType(): String = {
    if (gdext.classes.UPNPDevice.mb_get_igd_service_type == null) gdext.classes.UPNPDevice.mb_get_igd_service_type = MethodBind.get("UPNPDevice", "get_igd_service_type", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_get_igd_service_type, livePtr)
  }

  /** UPNPDevice.set_igd_our_addr */
  final def setIgdOurAddr(addr: String): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_igd_our_addr == null) gdext.classes.UPNPDevice.mb_set_igd_our_addr = MethodBind.get("UPNPDevice", "set_igd_our_addr", 83702148L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_igd_our_addr, livePtr, addr)
  }

  /** UPNPDevice.get_igd_our_addr */
  final def getIgdOurAddr(): String = {
    if (gdext.classes.UPNPDevice.mb_get_igd_our_addr == null) gdext.classes.UPNPDevice.mb_get_igd_our_addr = MethodBind.get("UPNPDevice", "get_igd_our_addr", 201670096L)
    Ptrcall.call0[String](gdext.classes.UPNPDevice.mb_get_igd_our_addr, livePtr)
  }

  /** UPNPDevice.set_igd_status */
  final def setIgdStatus(status: gdext.classes.UPNPDevice.IGDStatus): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_igd_status == null) gdext.classes.UPNPDevice.mb_set_igd_status = MethodBind.get("UPNPDevice", "set_igd_status", 519504122L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_igd_status, livePtr, status)
  }

  /** UPNPDevice.get_igd_status */
  final def getIgdStatus(): gdext.classes.UPNPDevice.IGDStatus = {
    if (gdext.classes.UPNPDevice.mb_get_igd_status == null) gdext.classes.UPNPDevice.mb_get_igd_status = MethodBind.get("UPNPDevice", "get_igd_status", 180887011L)
    gdext.classes.UPNPDevice.IGDStatus(Ptrcall.call0[Long](gdext.classes.UPNPDevice.mb_get_igd_status, livePtr))
  }

}

object UPNPDevice {
  private[classes] var mb_is_valid_gateway: GDExtensionMethodBindPtr = null
  private[classes] var mb_query_external_address: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_port_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_delete_port_mapping: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_description_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_description_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_service_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_service_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_igd_control_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_igd_control_url: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_igd_service_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_igd_service_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_igd_our_addr: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_igd_our_addr: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_igd_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_igd_status: GDExtensionMethodBindPtr = null

  /** Godot enum `UPNPDevice.IGDStatus`. */
  opaque type IGDStatus <: Long = Long

  object IGDStatus {
    final val Ok: IGDStatus = 0L.asInstanceOf[IGDStatus]
    final val HttpError: IGDStatus = 1L.asInstanceOf[IGDStatus]
    final val HttpEmpty: IGDStatus = 2L.asInstanceOf[IGDStatus]
    final val NoUrls: IGDStatus = 3L.asInstanceOf[IGDStatus]
    final val NoIgd: IGDStatus = 4L.asInstanceOf[IGDStatus]
    final val Disconnected: IGDStatus = 5L.asInstanceOf[IGDStatus]
    final val UnknownDevice: IGDStatus = 6L.asInstanceOf[IGDStatus]
    final val InvalidControl: IGDStatus = 7L.asInstanceOf[IGDStatus]
    final val MallocError: IGDStatus = 8L.asInstanceOf[IGDStatus]
    final val UnknownError: IGDStatus = 9L.asInstanceOf[IGDStatus]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): IGDStatus = value.asInstanceOf[IGDStatus]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[IGDStatus] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[IGDStatus]]

    extension (self: IGDStatus)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ok"
        case 1L => "HttpError"
        case 2L => "HttpEmpty"
        case 3L => "NoUrls"
        case 4L => "NoIgd"
        case 5L => "Disconnected"
        case 6L => "UnknownDevice"
        case 7L => "InvalidControl"
        case 8L => "MallocError"
        case 9L => "UnknownError"
        case other => other.toString
      }
  }
}
