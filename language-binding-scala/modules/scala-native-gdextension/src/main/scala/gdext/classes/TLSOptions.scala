package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `TLSOptions`, extends `RefCounted`. */
abstract class TLSOptions extends RefCounted {
  override def godotClassName: String = "TLSOptions"

  /** TLSOptions.is_server */
  final def isServer(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TLSOptions", "is_server", 36873697L), hostObject.objectPtr)

  /** TLSOptions.is_unsafe_client */
  final def isUnsafeClient(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("TLSOptions", "is_unsafe_client", 36873697L), hostObject.objectPtr)

  /** TLSOptions.get_common_name_override */
  final def getCommonNameOverride(): String =
    Ptrcall.call0[String](MethodBind.get("TLSOptions", "get_common_name_override", 201670096L), hostObject.objectPtr)

  /** TLSOptions.get_trusted_ca_chain */
  final def getTrustedCaChain(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TLSOptions", "get_trusted_ca_chain", 1120709175L), hostObject.objectPtr)

  /** TLSOptions.get_private_key */
  final def getPrivateKey(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TLSOptions", "get_private_key", 2119971811L), hostObject.objectPtr)

  /** TLSOptions.get_own_certificate */
  final def getOwnCertificate(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("TLSOptions", "get_own_certificate", 1120709175L), hostObject.objectPtr)

}
