package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HTTPClient`, extends `RefCounted`. */
abstract class HTTPClient extends RefCounted {
  override def godotClassName: String = "HTTPClient"

  /** HTTPClient.connect_to_host */
  final def connectToHost(host: String, port: Long, tls_options: TLSOptions): Long = {
    if (gdext.classes.HTTPClient.mb_connect_to_host == null) gdext.classes.HTTPClient.mb_connect_to_host = MethodBind.get("HTTPClient", "connect_to_host", 504540374L)
    Ptrcall.call3[String, Long, GodotObject, Long](gdext.classes.HTTPClient.mb_connect_to_host, livePtr, host, port, Wrappers.handle(tls_options))
  }

  /** HTTPClient.set_connection */
  final def setConnection(connection: StreamPeer): Unit = {
    if (gdext.classes.HTTPClient.mb_set_connection == null) gdext.classes.HTTPClient.mb_set_connection = MethodBind.get("HTTPClient", "set_connection", 3281897016L)
    Ptrcall.callVoid1(gdext.classes.HTTPClient.mb_set_connection, livePtr, Wrappers.handle(connection))
  }

  /** HTTPClient.get_connection. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getConnection(): StreamPeer = {
    if (gdext.classes.HTTPClient.mb_get_connection == null) gdext.classes.HTTPClient.mb_get_connection = MethodBind.get("HTTPClient", "get_connection", 2741655269L)
    Wrappers.owned[StreamPeer](Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_connection, livePtr))
  }

  /** HTTPClient.close */
  final def close(): Unit = {
    if (gdext.classes.HTTPClient.mb_close == null) gdext.classes.HTTPClient.mb_close = MethodBind.get("HTTPClient", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.HTTPClient.mb_close, livePtr)
  }

  /** HTTPClient.has_response */
  final def hasResponse(): Boolean = {
    if (gdext.classes.HTTPClient.mb_has_response == null) gdext.classes.HTTPClient.mb_has_response = MethodBind.get("HTTPClient", "has_response", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.HTTPClient.mb_has_response, livePtr)
  }

  /** HTTPClient.is_response_chunked */
  final def isResponseChunked(): Boolean = {
    if (gdext.classes.HTTPClient.mb_is_response_chunked == null) gdext.classes.HTTPClient.mb_is_response_chunked = MethodBind.get("HTTPClient", "is_response_chunked", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.HTTPClient.mb_is_response_chunked, livePtr)
  }

  /** HTTPClient.get_response_code */
  final def getResponseCode(): Long = {
    if (gdext.classes.HTTPClient.mb_get_response_code == null) gdext.classes.HTTPClient.mb_get_response_code = MethodBind.get("HTTPClient", "get_response_code", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_response_code, livePtr)
  }

  /** HTTPClient.get_response_body_length */
  final def getResponseBodyLength(): Long = {
    if (gdext.classes.HTTPClient.mb_get_response_body_length == null) gdext.classes.HTTPClient.mb_get_response_body_length = MethodBind.get("HTTPClient", "get_response_body_length", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_response_body_length, livePtr)
  }

  /** HTTPClient.set_read_chunk_size */
  final def setReadChunkSize(bytes: Long): Unit = {
    if (gdext.classes.HTTPClient.mb_set_read_chunk_size == null) gdext.classes.HTTPClient.mb_set_read_chunk_size = MethodBind.get("HTTPClient", "set_read_chunk_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HTTPClient.mb_set_read_chunk_size, livePtr, bytes)
  }

  /** HTTPClient.get_read_chunk_size */
  final def getReadChunkSize(): Long = {
    if (gdext.classes.HTTPClient.mb_get_read_chunk_size == null) gdext.classes.HTTPClient.mb_get_read_chunk_size = MethodBind.get("HTTPClient", "get_read_chunk_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_read_chunk_size, livePtr)
  }

  /** HTTPClient.set_blocking_mode */
  final def setBlockingMode(enabled: Boolean): Unit = {
    if (gdext.classes.HTTPClient.mb_set_blocking_mode == null) gdext.classes.HTTPClient.mb_set_blocking_mode = MethodBind.get("HTTPClient", "set_blocking_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.HTTPClient.mb_set_blocking_mode, livePtr, enabled)
  }

  /** HTTPClient.is_blocking_mode_enabled */
  final def isBlockingModeEnabled(): Boolean = {
    if (gdext.classes.HTTPClient.mb_is_blocking_mode_enabled == null) gdext.classes.HTTPClient.mb_is_blocking_mode_enabled = MethodBind.get("HTTPClient", "is_blocking_mode_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.HTTPClient.mb_is_blocking_mode_enabled, livePtr)
  }

  /** HTTPClient.get_status */
  final def getStatus(): Long = {
    if (gdext.classes.HTTPClient.mb_get_status == null) gdext.classes.HTTPClient.mb_get_status = MethodBind.get("HTTPClient", "get_status", 1426656811L)
    Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_status, livePtr)
  }

  /** HTTPClient.poll */
  final def poll(): Long = {
    if (gdext.classes.HTTPClient.mb_poll == null) gdext.classes.HTTPClient.mb_poll = MethodBind.get("HTTPClient", "poll", 166280745L)
    Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_poll, livePtr)
  }

  /** HTTPClient.set_http_proxy */
  final def setHttpProxy(host: String, port: Long): Unit = {
    if (gdext.classes.HTTPClient.mb_set_http_proxy == null) gdext.classes.HTTPClient.mb_set_http_proxy = MethodBind.get("HTTPClient", "set_http_proxy", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.HTTPClient.mb_set_http_proxy, livePtr, host, port)
  }

  /** HTTPClient.set_https_proxy */
  final def setHttpsProxy(host: String, port: Long): Unit = {
    if (gdext.classes.HTTPClient.mb_set_https_proxy == null) gdext.classes.HTTPClient.mb_set_https_proxy = MethodBind.get("HTTPClient", "set_https_proxy", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.HTTPClient.mb_set_https_proxy, livePtr, host, port)
  }

}

object HTTPClient {
  private[classes] var mb_connect_to_host: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_connection: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_response: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_response_chunked: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_response_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_response_body_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_read_chunk_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_read_chunk_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blocking_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_blocking_mode_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_http_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_https_proxy: GDExtensionMethodBindPtr = null
}
