package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `HTTPClient`, extends `RefCounted`. */
abstract class HTTPClient extends RefCounted {
  override def godotClassName: String = "HTTPClient"

  /** HTTPClient.connect_to_host */
  final def connectToHost(host: String, port: Long, tls_options: TLSOptions): Long =
    Ptrcall.call3[String, Long, GodotObject, Long](MethodBind.get("HTTPClient", "connect_to_host", 504540374L), hostObject.objectPtr, host, port, tls_options.hostObject)

  /** HTTPClient.set_connection */
  final def setConnection(connection: StreamPeer): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPClient", "set_connection", 3281897016L), hostObject.objectPtr, connection.hostObject)

  /** HTTPClient.get_connection */
  final def getConnection(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("HTTPClient", "get_connection", 2741655269L), hostObject.objectPtr)

  /** HTTPClient.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("HTTPClient", "close", 3218959716L), hostObject.objectPtr)

  /** HTTPClient.has_response */
  final def hasResponse(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("HTTPClient", "has_response", 36873697L), hostObject.objectPtr)

  /** HTTPClient.is_response_chunked */
  final def isResponseChunked(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("HTTPClient", "is_response_chunked", 36873697L), hostObject.objectPtr)

  /** HTTPClient.get_response_code */
  final def getResponseCode(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPClient", "get_response_code", 3905245786L), hostObject.objectPtr)

  /** HTTPClient.get_response_body_length */
  final def getResponseBodyLength(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPClient", "get_response_body_length", 3905245786L), hostObject.objectPtr)

  /** HTTPClient.set_read_chunk_size */
  final def setReadChunkSize(bytes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPClient", "set_read_chunk_size", 1286410249L), hostObject.objectPtr, bytes)

  /** HTTPClient.get_read_chunk_size */
  final def getReadChunkSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPClient", "get_read_chunk_size", 3905245786L), hostObject.objectPtr)

  /** HTTPClient.set_blocking_mode */
  final def setBlockingMode(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPClient", "set_blocking_mode", 2586408642L), hostObject.objectPtr, enabled)

  /** HTTPClient.is_blocking_mode_enabled */
  final def isBlockingModeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("HTTPClient", "is_blocking_mode_enabled", 36873697L), hostObject.objectPtr)

  /** HTTPClient.get_status */
  final def getStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPClient", "get_status", 1426656811L), hostObject.objectPtr)

  /** HTTPClient.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPClient", "poll", 166280745L), hostObject.objectPtr)

  /** HTTPClient.set_http_proxy */
  final def setHttpProxy(host: String, port: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("HTTPClient", "set_http_proxy", 2956805083L), hostObject.objectPtr, host, port)

  /** HTTPClient.set_https_proxy */
  final def setHttpsProxy(host: String, port: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("HTTPClient", "set_https_proxy", 2956805083L), hostObject.objectPtr, host, port)

}
