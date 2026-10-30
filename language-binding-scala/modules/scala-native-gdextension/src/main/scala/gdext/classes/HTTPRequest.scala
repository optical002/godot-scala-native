package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HTTPRequest`, extends `Node`. */
abstract class HTTPRequest extends Node {
  override def godotClassName: String = "HTTPRequest"

  /** HTTPRequest.cancel_request */
  final def cancelRequest(): Unit = {
    if (gdext.classes.HTTPRequest.mb_cancel_request == null) gdext.classes.HTTPRequest.mb_cancel_request = MethodBind.get("HTTPRequest", "cancel_request", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.HTTPRequest.mb_cancel_request, livePtr)
  }

  /** HTTPRequest.set_tls_options */
  final def setTlsOptions(clientOptions: TLSOptions): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_tls_options == null) gdext.classes.HTTPRequest.mb_set_tls_options = MethodBind.get("HTTPRequest", "set_tls_options", 2210231844L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_tls_options, livePtr, Wrappers.handle(clientOptions))
  }

  /** HTTPRequest.get_http_client_status */
  final def getHttpClientStatus(): gdext.classes.HTTPClient.Status = {
    if (gdext.classes.HTTPRequest.mb_get_http_client_status == null) gdext.classes.HTTPRequest.mb_get_http_client_status = MethodBind.get("HTTPRequest", "get_http_client_status", 1426656811L)
    gdext.classes.HTTPClient.Status(Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_http_client_status, livePtr))
  }

  /** HTTPRequest.set_use_threads */
  final def setUseThreads(enable: Boolean): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_use_threads == null) gdext.classes.HTTPRequest.mb_set_use_threads = MethodBind.get("HTTPRequest", "set_use_threads", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_use_threads, livePtr, enable)
  }

  /** HTTPRequest.is_using_threads */
  final def isUsingThreads(): Boolean = {
    if (gdext.classes.HTTPRequest.mb_is_using_threads == null) gdext.classes.HTTPRequest.mb_is_using_threads = MethodBind.get("HTTPRequest", "is_using_threads", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.HTTPRequest.mb_is_using_threads, livePtr)
  }

  /** HTTPRequest.set_accept_gzip */
  final def setAcceptGzip(enable: Boolean): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_accept_gzip == null) gdext.classes.HTTPRequest.mb_set_accept_gzip = MethodBind.get("HTTPRequest", "set_accept_gzip", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_accept_gzip, livePtr, enable)
  }

  /** HTTPRequest.is_accepting_gzip */
  final def isAcceptingGzip(): Boolean = {
    if (gdext.classes.HTTPRequest.mb_is_accepting_gzip == null) gdext.classes.HTTPRequest.mb_is_accepting_gzip = MethodBind.get("HTTPRequest", "is_accepting_gzip", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.HTTPRequest.mb_is_accepting_gzip, livePtr)
  }

  /** HTTPRequest.set_body_size_limit */
  final def setBodySizeLimit(bytes: Long): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_body_size_limit == null) gdext.classes.HTTPRequest.mb_set_body_size_limit = MethodBind.get("HTTPRequest", "set_body_size_limit", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_body_size_limit, livePtr, bytes)
  }

  /** HTTPRequest.get_body_size_limit */
  final def getBodySizeLimit(): Long = {
    if (gdext.classes.HTTPRequest.mb_get_body_size_limit == null) gdext.classes.HTTPRequest.mb_get_body_size_limit = MethodBind.get("HTTPRequest", "get_body_size_limit", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_body_size_limit, livePtr)
  }

  /** HTTPRequest.set_max_redirects */
  final def setMaxRedirects(amount: Long): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_max_redirects == null) gdext.classes.HTTPRequest.mb_set_max_redirects = MethodBind.get("HTTPRequest", "set_max_redirects", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_max_redirects, livePtr, amount)
  }

  /** HTTPRequest.get_max_redirects */
  final def getMaxRedirects(): Long = {
    if (gdext.classes.HTTPRequest.mb_get_max_redirects == null) gdext.classes.HTTPRequest.mb_get_max_redirects = MethodBind.get("HTTPRequest", "get_max_redirects", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_max_redirects, livePtr)
  }

  /** HTTPRequest.set_download_file */
  final def setDownloadFile(path: String): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_download_file == null) gdext.classes.HTTPRequest.mb_set_download_file = MethodBind.get("HTTPRequest", "set_download_file", 83702148L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_download_file, livePtr, path)
  }

  /** HTTPRequest.get_download_file */
  final def getDownloadFile(): String = {
    if (gdext.classes.HTTPRequest.mb_get_download_file == null) gdext.classes.HTTPRequest.mb_get_download_file = MethodBind.get("HTTPRequest", "get_download_file", 201670096L)
    Ptrcall.call0[String](gdext.classes.HTTPRequest.mb_get_download_file, livePtr)
  }

  /** HTTPRequest.get_downloaded_bytes */
  final def getDownloadedBytes(): Long = {
    if (gdext.classes.HTTPRequest.mb_get_downloaded_bytes == null) gdext.classes.HTTPRequest.mb_get_downloaded_bytes = MethodBind.get("HTTPRequest", "get_downloaded_bytes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_downloaded_bytes, livePtr)
  }

  /** HTTPRequest.get_body_size */
  final def getBodySize(): Long = {
    if (gdext.classes.HTTPRequest.mb_get_body_size == null) gdext.classes.HTTPRequest.mb_get_body_size = MethodBind.get("HTTPRequest", "get_body_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_body_size, livePtr)
  }

  /** HTTPRequest.set_timeout */
  final def setTimeout(timeout: Double): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_timeout == null) gdext.classes.HTTPRequest.mb_set_timeout = MethodBind.get("HTTPRequest", "set_timeout", 373806689L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_timeout, livePtr, timeout)
  }

  /** HTTPRequest.get_timeout */
  final def getTimeout(): Double = {
    if (gdext.classes.HTTPRequest.mb_get_timeout == null) gdext.classes.HTTPRequest.mb_get_timeout = MethodBind.get("HTTPRequest", "get_timeout", 191475506L)
    Ptrcall.call0[Double](gdext.classes.HTTPRequest.mb_get_timeout, livePtr)
  }

  /** HTTPRequest.set_download_chunk_size */
  final def setDownloadChunkSize(chunkSize: Long): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_download_chunk_size == null) gdext.classes.HTTPRequest.mb_set_download_chunk_size = MethodBind.get("HTTPRequest", "set_download_chunk_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.HTTPRequest.mb_set_download_chunk_size, livePtr, chunkSize)
  }

  /** HTTPRequest.get_download_chunk_size */
  final def getDownloadChunkSize(): Long = {
    if (gdext.classes.HTTPRequest.mb_get_download_chunk_size == null) gdext.classes.HTTPRequest.mb_get_download_chunk_size = MethodBind.get("HTTPRequest", "get_download_chunk_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.HTTPRequest.mb_get_download_chunk_size, livePtr)
  }

  /** HTTPRequest.set_http_proxy */
  final def setHttpProxy(host: String, port: Long): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_http_proxy == null) gdext.classes.HTTPRequest.mb_set_http_proxy = MethodBind.get("HTTPRequest", "set_http_proxy", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.HTTPRequest.mb_set_http_proxy, livePtr, host, port)
  }

  /** HTTPRequest.set_https_proxy */
  final def setHttpsProxy(host: String, port: Long): Unit = {
    if (gdext.classes.HTTPRequest.mb_set_https_proxy == null) gdext.classes.HTTPRequest.mb_set_https_proxy = MethodBind.get("HTTPRequest", "set_https_proxy", 2956805083L)
    Ptrcall.callVoid2(gdext.classes.HTTPRequest.mb_set_https_proxy, livePtr, host, port)
  }

}

object HTTPRequest {
  private[classes] var mb_cancel_request: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_tls_options: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_http_client_status: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_threads: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_threads: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accept_gzip: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_accepting_gzip: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_body_size_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_size_limit: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_redirects: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_redirects: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_download_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_download_file: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_downloaded_bytes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_body_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_timeout: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_download_chunk_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_download_chunk_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_http_proxy: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_https_proxy: GDExtensionMethodBindPtr = null

  /** Godot enum `HTTPRequest.Result`. */
  opaque type Result <: Long = Long

  object Result {
    final val Success: Result = 0L.asInstanceOf[Result]
    final val ChunkedBodySizeMismatch: Result = 1L.asInstanceOf[Result]
    final val CantConnect: Result = 2L.asInstanceOf[Result]
    final val CantResolve: Result = 3L.asInstanceOf[Result]
    final val ConnectionError: Result = 4L.asInstanceOf[Result]
    final val TlsHandshakeError: Result = 5L.asInstanceOf[Result]
    final val NoResponse: Result = 6L.asInstanceOf[Result]
    final val BodySizeLimitExceeded: Result = 7L.asInstanceOf[Result]
    final val BodyDecompressFailed: Result = 8L.asInstanceOf[Result]
    final val RequestFailed: Result = 9L.asInstanceOf[Result]
    final val DownloadFileCantOpen: Result = 10L.asInstanceOf[Result]
    final val DownloadFileWriteError: Result = 11L.asInstanceOf[Result]
    final val RedirectLimitReached: Result = 12L.asInstanceOf[Result]
    final val Timeout: Result = 13L.asInstanceOf[Result]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Result = value.asInstanceOf[Result]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Result] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[Result]]

    extension (self: Result)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Success"
        case 1L => "ChunkedBodySizeMismatch"
        case 2L => "CantConnect"
        case 3L => "CantResolve"
        case 4L => "ConnectionError"
        case 5L => "TlsHandshakeError"
        case 6L => "NoResponse"
        case 7L => "BodySizeLimitExceeded"
        case 8L => "BodyDecompressFailed"
        case 9L => "RequestFailed"
        case 10L => "DownloadFileCantOpen"
        case 11L => "DownloadFileWriteError"
        case 12L => "RedirectLimitReached"
        case 13L => "Timeout"
        case other => other.toString
      }
  }
}
