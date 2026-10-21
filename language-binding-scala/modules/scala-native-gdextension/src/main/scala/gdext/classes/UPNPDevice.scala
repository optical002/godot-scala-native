package gdext.classes

import gdext.Godot
import gdext.builtin.*
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
  final def addPortMapping(port: Long, port_internal: Long, desc: String, proto: String, duration: Long): Long = {
    if (gdext.classes.UPNPDevice.mb_add_port_mapping == null) gdext.classes.UPNPDevice.mb_add_port_mapping = MethodBind.get("UPNPDevice", "add_port_mapping", 818314583L)
    Ptrcall.call5[Long, Long, String, String, Long, Long](gdext.classes.UPNPDevice.mb_add_port_mapping, livePtr, port, port_internal, desc, proto, duration)
  }

  /** UPNPDevice.delete_port_mapping */
  final def deletePortMapping(port: Long, proto: String): Long = {
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
  final def setIgdStatus(status: Long): Unit = {
    if (gdext.classes.UPNPDevice.mb_set_igd_status == null) gdext.classes.UPNPDevice.mb_set_igd_status = MethodBind.get("UPNPDevice", "set_igd_status", 519504122L)
    Ptrcall.callVoid1(gdext.classes.UPNPDevice.mb_set_igd_status, livePtr, status)
  }

  /** UPNPDevice.get_igd_status */
  final def getIgdStatus(): Long = {
    if (gdext.classes.UPNPDevice.mb_get_igd_status == null) gdext.classes.UPNPDevice.mb_get_igd_status = MethodBind.get("UPNPDevice", "get_igd_status", 180887011L)
    Ptrcall.call0[Long](gdext.classes.UPNPDevice.mb_get_igd_status, livePtr)
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
}
