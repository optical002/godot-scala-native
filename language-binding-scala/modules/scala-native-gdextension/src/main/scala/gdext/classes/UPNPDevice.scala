package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `UPNPDevice`, extends `RefCounted`. */
abstract class UPNPDevice extends RefCounted {
  override def godotClassName: String = "UPNPDevice"

  /** UPNPDevice.is_valid_gateway */
  final def isValidGateway(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("UPNPDevice", "is_valid_gateway", 36873697L), hostObject.objectPtr)

  /** UPNPDevice.query_external_address */
  final def queryExternalAddress(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "query_external_address", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.add_port_mapping */
  final def addPortMapping(port: Long, port_internal: Long, desc: String, proto: String, duration: Long): Long =
    Ptrcall.call5[Long, Long, String, String, Long, Long](MethodBind.get("UPNPDevice", "add_port_mapping", 818314583L), hostObject.objectPtr, port, port_internal, desc, proto, duration)

  /** UPNPDevice.delete_port_mapping */
  final def deletePortMapping(port: Long, proto: String): Long =
    Ptrcall.call2[Long, String, Long](MethodBind.get("UPNPDevice", "delete_port_mapping", 3444187325L), hostObject.objectPtr, port, proto)

  /** UPNPDevice.set_description_url */
  final def setDescriptionUrl(url: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_description_url", 83702148L), hostObject.objectPtr, url)

  /** UPNPDevice.get_description_url */
  final def getDescriptionUrl(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "get_description_url", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.set_service_type */
  final def setServiceType(`type`: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_service_type", 83702148L), hostObject.objectPtr, `type`)

  /** UPNPDevice.get_service_type */
  final def getServiceType(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "get_service_type", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.set_igd_control_url */
  final def setIgdControlUrl(url: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_igd_control_url", 83702148L), hostObject.objectPtr, url)

  /** UPNPDevice.get_igd_control_url */
  final def getIgdControlUrl(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "get_igd_control_url", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.set_igd_service_type */
  final def setIgdServiceType(`type`: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_igd_service_type", 83702148L), hostObject.objectPtr, `type`)

  /** UPNPDevice.get_igd_service_type */
  final def getIgdServiceType(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "get_igd_service_type", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.set_igd_our_addr */
  final def setIgdOurAddr(addr: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_igd_our_addr", 83702148L), hostObject.objectPtr, addr)

  /** UPNPDevice.get_igd_our_addr */
  final def getIgdOurAddr(): String =
    Ptrcall.call0[String](MethodBind.get("UPNPDevice", "get_igd_our_addr", 201670096L), hostObject.objectPtr)

  /** UPNPDevice.set_igd_status */
  final def setIgdStatus(status: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("UPNPDevice", "set_igd_status", 519504122L), hostObject.objectPtr, status)

  /** UPNPDevice.get_igd_status */
  final def getIgdStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("UPNPDevice", "get_igd_status", 180887011L), hostObject.objectPtr)

}
