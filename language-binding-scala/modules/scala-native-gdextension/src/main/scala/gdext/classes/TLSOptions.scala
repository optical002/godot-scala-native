package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TLSOptions`, extends `RefCounted`. */
abstract class TLSOptions extends RefCounted {
  override def godotClassName: String = "TLSOptions"

  /** TLSOptions.is_server */
  final def isServer(): Boolean = {
    if (gdext.classes.TLSOptions.mb_is_server == null) gdext.classes.TLSOptions.mb_is_server = MethodBind.get("TLSOptions", "is_server", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TLSOptions.mb_is_server, livePtr)
  }

  /** TLSOptions.is_unsafe_client */
  final def isUnsafeClient(): Boolean = {
    if (gdext.classes.TLSOptions.mb_is_unsafe_client == null) gdext.classes.TLSOptions.mb_is_unsafe_client = MethodBind.get("TLSOptions", "is_unsafe_client", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TLSOptions.mb_is_unsafe_client, livePtr)
  }

  /** TLSOptions.get_common_name_override */
  final def getCommonNameOverride(): String = {
    if (gdext.classes.TLSOptions.mb_get_common_name_override == null) gdext.classes.TLSOptions.mb_get_common_name_override = MethodBind.get("TLSOptions", "get_common_name_override", 201670096L)
    Ptrcall.call0[String](gdext.classes.TLSOptions.mb_get_common_name_override, livePtr)
  }

  /** TLSOptions.get_trusted_ca_chain. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTrustedCaChain(): X509Certificate = {
    if (gdext.classes.TLSOptions.mb_get_trusted_ca_chain == null) gdext.classes.TLSOptions.mb_get_trusted_ca_chain = MethodBind.get("TLSOptions", "get_trusted_ca_chain", 1120709175L)
    Wrappers.owned[X509Certificate](Ptrcall.call0[Long](gdext.classes.TLSOptions.mb_get_trusted_ca_chain, livePtr))
  }

  /** TLSOptions.get_private_key. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getPrivateKey(): CryptoKey = {
    if (gdext.classes.TLSOptions.mb_get_private_key == null) gdext.classes.TLSOptions.mb_get_private_key = MethodBind.get("TLSOptions", "get_private_key", 2119971811L)
    Wrappers.owned[CryptoKey](Ptrcall.call0[Long](gdext.classes.TLSOptions.mb_get_private_key, livePtr))
  }

  /** TLSOptions.get_own_certificate. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOwnCertificate(): X509Certificate = {
    if (gdext.classes.TLSOptions.mb_get_own_certificate == null) gdext.classes.TLSOptions.mb_get_own_certificate = MethodBind.get("TLSOptions", "get_own_certificate", 1120709175L)
    Wrappers.owned[X509Certificate](Ptrcall.call0[Long](gdext.classes.TLSOptions.mb_get_own_certificate, livePtr))
  }

}

object TLSOptions {
  private[classes] var mb_client: GDExtensionMethodBindPtr = null
  private[classes] var mb_client_unsafe: GDExtensionMethodBindPtr = null
  private[classes] var mb_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_server: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_unsafe_client: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_common_name_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_trusted_ca_chain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_private_key: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_own_certificate: GDExtensionMethodBindPtr = null

  /** TLSOptions.client. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def client(trustedChain: X509Certificate = null, commonNameOverride: String = ""): TLSOptions = {
    if (gdext.classes.TLSOptions.mb_client == null) gdext.classes.TLSOptions.mb_client = MethodBind.get("TLSOptions", "client", 3565000357L)
    Wrappers.owned[TLSOptions](Ptrcall.call2[GodotObject, String, Long](gdext.classes.TLSOptions.mb_client, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(trustedChain), commonNameOverride))
  }

  /** TLSOptions.client_unsafe. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def clientUnsafe(trustedChain: X509Certificate = null): TLSOptions = {
    if (gdext.classes.TLSOptions.mb_client_unsafe == null) gdext.classes.TLSOptions.mb_client_unsafe = MethodBind.get("TLSOptions", "client_unsafe", 2090251749L)
    Wrappers.owned[TLSOptions](Ptrcall.call1[GodotObject, Long](gdext.classes.TLSOptions.mb_client_unsafe, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(trustedChain)))
  }

  /** TLSOptions.server. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def server(key: CryptoKey, certificate: X509Certificate): TLSOptions = {
    if (gdext.classes.TLSOptions.mb_server == null) gdext.classes.TLSOptions.mb_server = MethodBind.get("TLSOptions", "server", 36969539L)
    Wrappers.owned[TLSOptions](Ptrcall.call2[GodotObject, GodotObject, Long](gdext.classes.TLSOptions.mb_server, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(key), Wrappers.handle(certificate)))
  }
}
