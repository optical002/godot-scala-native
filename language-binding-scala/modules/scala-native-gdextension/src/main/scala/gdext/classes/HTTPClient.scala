package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `HTTPClient`, extends `RefCounted`. */
abstract class HTTPClient extends RefCounted {
  override def godotClassName: String = "HTTPClient"

  /** HTTPClient.connect_to_host */
  final def connectToHost(host: String, port: Long = -1L, tlsOptions: TLSOptions = null): gdext.classes.Error = {
    if (gdext.classes.HTTPClient.mb_connect_to_host == null) gdext.classes.HTTPClient.mb_connect_to_host = MethodBind.get("HTTPClient", "connect_to_host", 504540374L)
    gdext.classes.Error(Ptrcall.call3[String, Long, GodotObject, Long](gdext.classes.HTTPClient.mb_connect_to_host, livePtr, host, port, Wrappers.handle(tlsOptions)))
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
  final def getStatus(): gdext.classes.HTTPClient.Status = {
    if (gdext.classes.HTTPClient.mb_get_status == null) gdext.classes.HTTPClient.mb_get_status = MethodBind.get("HTTPClient", "get_status", 1426656811L)
    gdext.classes.HTTPClient.Status(Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_get_status, livePtr))
  }

  /** HTTPClient.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.HTTPClient.mb_poll == null) gdext.classes.HTTPClient.mb_poll = MethodBind.get("HTTPClient", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.HTTPClient.mb_poll, livePtr))
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

  /** Godot enum `HTTPClient.Method`. */
  opaque type Method <: Long = Long

  object Method {
    final val Get: Method = 0L.asInstanceOf[Method]
    final val Head: Method = 1L.asInstanceOf[Method]
    final val Post: Method = 2L.asInstanceOf[Method]
    final val Put: Method = 3L.asInstanceOf[Method]
    final val Delete: Method = 4L.asInstanceOf[Method]
    final val Options: Method = 5L.asInstanceOf[Method]
    final val Trace: Method = 6L.asInstanceOf[Method]
    final val Connect: Method = 7L.asInstanceOf[Method]
    final val Patch: Method = 8L.asInstanceOf[Method]
    final val Max: Method = 9L.asInstanceOf[Method]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Method = value.asInstanceOf[Method]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Method] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[Method]]

    extension (self: Method)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Get"
        case 1L => "Head"
        case 2L => "Post"
        case 3L => "Put"
        case 4L => "Delete"
        case 5L => "Options"
        case 6L => "Trace"
        case 7L => "Connect"
        case 8L => "Patch"
        case 9L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `HTTPClient.Status`. */
  opaque type Status <: Long = Long

  object Status {
    final val Disconnected: Status = 0L.asInstanceOf[Status]
    final val Resolving: Status = 1L.asInstanceOf[Status]
    final val CantResolve: Status = 2L.asInstanceOf[Status]
    final val Connecting: Status = 3L.asInstanceOf[Status]
    final val CantConnect: Status = 4L.asInstanceOf[Status]
    final val Connected: Status = 5L.asInstanceOf[Status]
    final val Requesting: Status = 6L.asInstanceOf[Status]
    final val Body: Status = 7L.asInstanceOf[Status]
    final val ConnectionError: Status = 8L.asInstanceOf[Status]
    final val TlsHandshakeError: Status = 9L.asInstanceOf[Status]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Status = value.asInstanceOf[Status]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Status] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L).asInstanceOf[scala.IArray[Status]]

    extension (self: Status)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disconnected"
        case 1L => "Resolving"
        case 2L => "CantResolve"
        case 3L => "Connecting"
        case 4L => "CantConnect"
        case 5L => "Connected"
        case 6L => "Requesting"
        case 7L => "Body"
        case 8L => "ConnectionError"
        case 9L => "TlsHandshakeError"
        case other => other.toString
      }
  }

  /** Godot enum `HTTPClient.ResponseCode`. */
  opaque type ResponseCode <: Long = Long

  object ResponseCode {
    final val Continue: ResponseCode = 100L.asInstanceOf[ResponseCode]
    final val SwitchingProtocols: ResponseCode = 101L.asInstanceOf[ResponseCode]
    final val Processing: ResponseCode = 102L.asInstanceOf[ResponseCode]
    final val Ok: ResponseCode = 200L.asInstanceOf[ResponseCode]
    final val Created: ResponseCode = 201L.asInstanceOf[ResponseCode]
    final val Accepted: ResponseCode = 202L.asInstanceOf[ResponseCode]
    final val NonAuthoritativeInformation: ResponseCode = 203L.asInstanceOf[ResponseCode]
    final val NoContent: ResponseCode = 204L.asInstanceOf[ResponseCode]
    final val ResetContent: ResponseCode = 205L.asInstanceOf[ResponseCode]
    final val PartialContent: ResponseCode = 206L.asInstanceOf[ResponseCode]
    final val MultiStatus: ResponseCode = 207L.asInstanceOf[ResponseCode]
    final val AlreadyReported: ResponseCode = 208L.asInstanceOf[ResponseCode]
    final val ImUsed: ResponseCode = 226L.asInstanceOf[ResponseCode]
    final val MultipleChoices: ResponseCode = 300L.asInstanceOf[ResponseCode]
    final val MovedPermanently: ResponseCode = 301L.asInstanceOf[ResponseCode]
    final val Found: ResponseCode = 302L.asInstanceOf[ResponseCode]
    final val SeeOther: ResponseCode = 303L.asInstanceOf[ResponseCode]
    final val NotModified: ResponseCode = 304L.asInstanceOf[ResponseCode]
    final val UseProxy: ResponseCode = 305L.asInstanceOf[ResponseCode]
    final val SwitchProxy: ResponseCode = 306L.asInstanceOf[ResponseCode]
    final val TemporaryRedirect: ResponseCode = 307L.asInstanceOf[ResponseCode]
    final val PermanentRedirect: ResponseCode = 308L.asInstanceOf[ResponseCode]
    final val BadRequest: ResponseCode = 400L.asInstanceOf[ResponseCode]
    final val Unauthorized: ResponseCode = 401L.asInstanceOf[ResponseCode]
    final val PaymentRequired: ResponseCode = 402L.asInstanceOf[ResponseCode]
    final val Forbidden: ResponseCode = 403L.asInstanceOf[ResponseCode]
    final val NotFound: ResponseCode = 404L.asInstanceOf[ResponseCode]
    final val MethodNotAllowed: ResponseCode = 405L.asInstanceOf[ResponseCode]
    final val NotAcceptable: ResponseCode = 406L.asInstanceOf[ResponseCode]
    final val ProxyAuthenticationRequired: ResponseCode = 407L.asInstanceOf[ResponseCode]
    final val RequestTimeout: ResponseCode = 408L.asInstanceOf[ResponseCode]
    final val Conflict: ResponseCode = 409L.asInstanceOf[ResponseCode]
    final val Gone: ResponseCode = 410L.asInstanceOf[ResponseCode]
    final val LengthRequired: ResponseCode = 411L.asInstanceOf[ResponseCode]
    final val PreconditionFailed: ResponseCode = 412L.asInstanceOf[ResponseCode]
    final val RequestEntityTooLarge: ResponseCode = 413L.asInstanceOf[ResponseCode]
    final val RequestUriTooLong: ResponseCode = 414L.asInstanceOf[ResponseCode]
    final val UnsupportedMediaType: ResponseCode = 415L.asInstanceOf[ResponseCode]
    final val RequestedRangeNotSatisfiable: ResponseCode = 416L.asInstanceOf[ResponseCode]
    final val ExpectationFailed: ResponseCode = 417L.asInstanceOf[ResponseCode]
    final val ImATeapot: ResponseCode = 418L.asInstanceOf[ResponseCode]
    final val MisdirectedRequest: ResponseCode = 421L.asInstanceOf[ResponseCode]
    final val UnprocessableEntity: ResponseCode = 422L.asInstanceOf[ResponseCode]
    final val Locked: ResponseCode = 423L.asInstanceOf[ResponseCode]
    final val FailedDependency: ResponseCode = 424L.asInstanceOf[ResponseCode]
    final val UpgradeRequired: ResponseCode = 426L.asInstanceOf[ResponseCode]
    final val PreconditionRequired: ResponseCode = 428L.asInstanceOf[ResponseCode]
    final val TooManyRequests: ResponseCode = 429L.asInstanceOf[ResponseCode]
    final val RequestHeaderFieldsTooLarge: ResponseCode = 431L.asInstanceOf[ResponseCode]
    final val UnavailableForLegalReasons: ResponseCode = 451L.asInstanceOf[ResponseCode]
    final val InternalServerError: ResponseCode = 500L.asInstanceOf[ResponseCode]
    final val NotImplemented: ResponseCode = 501L.asInstanceOf[ResponseCode]
    final val BadGateway: ResponseCode = 502L.asInstanceOf[ResponseCode]
    final val ServiceUnavailable: ResponseCode = 503L.asInstanceOf[ResponseCode]
    final val GatewayTimeout: ResponseCode = 504L.asInstanceOf[ResponseCode]
    final val HttpVersionNotSupported: ResponseCode = 505L.asInstanceOf[ResponseCode]
    final val VariantAlsoNegotiates: ResponseCode = 506L.asInstanceOf[ResponseCode]
    final val InsufficientStorage: ResponseCode = 507L.asInstanceOf[ResponseCode]
    final val LoopDetected: ResponseCode = 508L.asInstanceOf[ResponseCode]
    final val NotExtended: ResponseCode = 510L.asInstanceOf[ResponseCode]
    final val NetworkAuthRequired: ResponseCode = 511L.asInstanceOf[ResponseCode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ResponseCode = value.asInstanceOf[ResponseCode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ResponseCode] = scala.IArray[Long](100L, 101L, 102L, 200L, 201L, 202L, 203L, 204L, 205L, 206L, 207L, 208L, 226L, 300L, 301L, 302L, 303L, 304L, 305L, 306L, 307L, 308L, 400L, 401L, 402L, 403L, 404L, 405L, 406L, 407L, 408L, 409L, 410L, 411L, 412L, 413L, 414L, 415L, 416L, 417L, 418L, 421L, 422L, 423L, 424L, 426L, 428L, 429L, 431L, 451L, 500L, 501L, 502L, 503L, 504L, 505L, 506L, 507L, 508L, 510L, 511L).asInstanceOf[scala.IArray[ResponseCode]]

    extension (self: ResponseCode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 100L => "Continue"
        case 101L => "SwitchingProtocols"
        case 102L => "Processing"
        case 200L => "Ok"
        case 201L => "Created"
        case 202L => "Accepted"
        case 203L => "NonAuthoritativeInformation"
        case 204L => "NoContent"
        case 205L => "ResetContent"
        case 206L => "PartialContent"
        case 207L => "MultiStatus"
        case 208L => "AlreadyReported"
        case 226L => "ImUsed"
        case 300L => "MultipleChoices"
        case 301L => "MovedPermanently"
        case 302L => "Found"
        case 303L => "SeeOther"
        case 304L => "NotModified"
        case 305L => "UseProxy"
        case 306L => "SwitchProxy"
        case 307L => "TemporaryRedirect"
        case 308L => "PermanentRedirect"
        case 400L => "BadRequest"
        case 401L => "Unauthorized"
        case 402L => "PaymentRequired"
        case 403L => "Forbidden"
        case 404L => "NotFound"
        case 405L => "MethodNotAllowed"
        case 406L => "NotAcceptable"
        case 407L => "ProxyAuthenticationRequired"
        case 408L => "RequestTimeout"
        case 409L => "Conflict"
        case 410L => "Gone"
        case 411L => "LengthRequired"
        case 412L => "PreconditionFailed"
        case 413L => "RequestEntityTooLarge"
        case 414L => "RequestUriTooLong"
        case 415L => "UnsupportedMediaType"
        case 416L => "RequestedRangeNotSatisfiable"
        case 417L => "ExpectationFailed"
        case 418L => "ImATeapot"
        case 421L => "MisdirectedRequest"
        case 422L => "UnprocessableEntity"
        case 423L => "Locked"
        case 424L => "FailedDependency"
        case 426L => "UpgradeRequired"
        case 428L => "PreconditionRequired"
        case 429L => "TooManyRequests"
        case 431L => "RequestHeaderFieldsTooLarge"
        case 451L => "UnavailableForLegalReasons"
        case 500L => "InternalServerError"
        case 501L => "NotImplemented"
        case 502L => "BadGateway"
        case 503L => "ServiceUnavailable"
        case 504L => "GatewayTimeout"
        case 505L => "HttpVersionNotSupported"
        case 506L => "VariantAlsoNegotiates"
        case 507L => "InsufficientStorage"
        case 508L => "LoopDetected"
        case 510L => "NotExtended"
        case 511L => "NetworkAuthRequired"
        case other => other.toString
      }
  }
}
