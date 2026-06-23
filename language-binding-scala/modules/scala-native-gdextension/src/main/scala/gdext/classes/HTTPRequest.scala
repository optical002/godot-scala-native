package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `HTTPRequest`, extends `Node`. */
abstract class HTTPRequest extends Node {

  /** HTTPRequest.cancel_request */
  final def cancelRequest(): Unit =
    Ptrcall.callVoid0(MethodBind.get("HTTPRequest", "cancel_request", 3218959716L), hostObject.objectPtr)

  /** HTTPRequest.set_tls_options */
  final def setTlsOptions(client_options: TLSOptions): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_tls_options", 2210231844L), hostObject.objectPtr, client_options.hostObject)

  /** HTTPRequest.get_http_client_status */
  final def getHttpClientStatus(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_http_client_status", 1426656811L), hostObject.objectPtr)

  /** HTTPRequest.set_use_threads */
  final def setUseThreads(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_use_threads", 2586408642L), hostObject.objectPtr, enable)

  /** HTTPRequest.is_using_threads */
  final def isUsingThreads(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("HTTPRequest", "is_using_threads", 36873697L), hostObject.objectPtr)

  /** HTTPRequest.set_accept_gzip */
  final def setAcceptGzip(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_accept_gzip", 2586408642L), hostObject.objectPtr, enable)

  /** HTTPRequest.is_accepting_gzip */
  final def isAcceptingGzip(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("HTTPRequest", "is_accepting_gzip", 36873697L), hostObject.objectPtr)

  /** HTTPRequest.set_body_size_limit */
  final def setBodySizeLimit(bytes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_body_size_limit", 1286410249L), hostObject.objectPtr, bytes)

  /** HTTPRequest.get_body_size_limit */
  final def getBodySizeLimit(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_body_size_limit", 3905245786L), hostObject.objectPtr)

  /** HTTPRequest.set_max_redirects */
  final def setMaxRedirects(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_max_redirects", 1286410249L), hostObject.objectPtr, amount)

  /** HTTPRequest.get_max_redirects */
  final def getMaxRedirects(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_max_redirects", 3905245786L), hostObject.objectPtr)

  /** HTTPRequest.set_download_file */
  final def setDownloadFile(path: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_download_file", 83702148L), hostObject.objectPtr, path)

  /** HTTPRequest.get_download_file */
  final def getDownloadFile(): String =
    Ptrcall.call0[String](MethodBind.get("HTTPRequest", "get_download_file", 201670096L), hostObject.objectPtr)

  /** HTTPRequest.get_downloaded_bytes */
  final def getDownloadedBytes(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_downloaded_bytes", 3905245786L), hostObject.objectPtr)

  /** HTTPRequest.get_body_size */
  final def getBodySize(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_body_size", 3905245786L), hostObject.objectPtr)

  /** HTTPRequest.set_timeout */
  final def setTimeout(timeout: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_timeout", 373806689L), hostObject.objectPtr, timeout)

  /** HTTPRequest.get_timeout */
  final def getTimeout(): Double =
    Ptrcall.call0[Double](MethodBind.get("HTTPRequest", "get_timeout", 191475506L), hostObject.objectPtr)

  /** HTTPRequest.set_download_chunk_size */
  final def setDownloadChunkSize(chunk_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("HTTPRequest", "set_download_chunk_size", 1286410249L), hostObject.objectPtr, chunk_size)

  /** HTTPRequest.get_download_chunk_size */
  final def getDownloadChunkSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("HTTPRequest", "get_download_chunk_size", 3905245786L), hostObject.objectPtr)

  /** HTTPRequest.set_http_proxy */
  final def setHttpProxy(host: String, port: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("HTTPRequest", "set_http_proxy", 2956805083L), hostObject.objectPtr, host, port)

  /** HTTPRequest.set_https_proxy */
  final def setHttpsProxy(host: String, port: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("HTTPRequest", "set_https_proxy", 2956805083L), hostObject.objectPtr, host, port)

}

object HTTPRequest {
  /** Class metadata for Gd[HTTPRequest] lifetime management and casting. */
  given GodotClass[HTTPRequest] with {
    def className = "HTTPRequest"
    def isRefCounted = false
    def wrap(o: GodotObject): HTTPRequest = new HTTPRequest {}.withHost(o.objectPtr)
    def unwrap(t: HTTPRequest): GodotObject = t.hostObject
  }
}
