package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebRTCPeerConnection`, extends `RefCounted`. */
abstract class WebRTCPeerConnection extends RefCounted {
  override def godotClassName: String = "WebRTCPeerConnection"

  /** WebRTCPeerConnection.create_offer */
  final def createOffer(): gdext.classes.Error = {
    if (gdext.classes.WebRTCPeerConnection.mb_create_offer == null) gdext.classes.WebRTCPeerConnection.mb_create_offer = MethodBind.get("WebRTCPeerConnection", "create_offer", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_create_offer, livePtr))
  }

  /** WebRTCPeerConnection.set_local_description */
  final def setLocalDescription(`type`: String, sdp: String): gdext.classes.Error = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_local_description == null) gdext.classes.WebRTCPeerConnection.mb_set_local_description = MethodBind.get("WebRTCPeerConnection", "set_local_description", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.WebRTCPeerConnection.mb_set_local_description, livePtr, `type`, sdp))
  }

  /** WebRTCPeerConnection.set_remote_description */
  final def setRemoteDescription(`type`: String, sdp: String): gdext.classes.Error = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_remote_description == null) gdext.classes.WebRTCPeerConnection.mb_set_remote_description = MethodBind.get("WebRTCPeerConnection", "set_remote_description", 852856452L)
    gdext.classes.Error(Ptrcall.call2[String, String, Long](gdext.classes.WebRTCPeerConnection.mb_set_remote_description, livePtr, `type`, sdp))
  }

  /** WebRTCPeerConnection.add_ice_candidate */
  final def addIceCandidate(media: String, index: Long, name: String): gdext.classes.Error = {
    if (gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate == null) gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate = MethodBind.get("WebRTCPeerConnection", "add_ice_candidate", 3958950400L)
    gdext.classes.Error(Ptrcall.call3[String, Long, String, Long](gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate, livePtr, media, index, name))
  }

  /** WebRTCPeerConnection.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.WebRTCPeerConnection.mb_poll == null) gdext.classes.WebRTCPeerConnection.mb_poll = MethodBind.get("WebRTCPeerConnection", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_poll, livePtr))
  }

  /** WebRTCPeerConnection.close */
  final def close(): Unit = {
    if (gdext.classes.WebRTCPeerConnection.mb_close == null) gdext.classes.WebRTCPeerConnection.mb_close = MethodBind.get("WebRTCPeerConnection", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.WebRTCPeerConnection.mb_close, livePtr)
  }

  /** WebRTCPeerConnection.get_connection_state */
  final def getConnectionState(): gdext.classes.WebRTCPeerConnection.ConnectionState = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_connection_state == null) gdext.classes.WebRTCPeerConnection.mb_get_connection_state = MethodBind.get("WebRTCPeerConnection", "get_connection_state", 2275710506L)
    gdext.classes.WebRTCPeerConnection.ConnectionState(Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_connection_state, livePtr))
  }

  /** WebRTCPeerConnection.get_gathering_state */
  final def getGatheringState(): gdext.classes.WebRTCPeerConnection.GatheringState = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_gathering_state == null) gdext.classes.WebRTCPeerConnection.mb_get_gathering_state = MethodBind.get("WebRTCPeerConnection", "get_gathering_state", 4262591401L)
    gdext.classes.WebRTCPeerConnection.GatheringState(Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_gathering_state, livePtr))
  }

  /** WebRTCPeerConnection.get_signaling_state */
  final def getSignalingState(): gdext.classes.WebRTCPeerConnection.SignalingState = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_signaling_state == null) gdext.classes.WebRTCPeerConnection.mb_get_signaling_state = MethodBind.get("WebRTCPeerConnection", "get_signaling_state", 3342956226L)
    gdext.classes.WebRTCPeerConnection.SignalingState(Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_signaling_state, livePtr))
  }

}

object WebRTCPeerConnection {
  private[classes] var mb_set_default_extension: GDExtensionMethodBindPtr = null
  private[classes] var mb_create_offer: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_local_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_remote_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_ice_candidate: GDExtensionMethodBindPtr = null
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gathering_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_signaling_state: GDExtensionMethodBindPtr = null

  /** WebRTCPeerConnection.set_default_extension */
  final def setDefaultExtension(extensionClass: String): Unit = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_default_extension == null) gdext.classes.WebRTCPeerConnection.mb_set_default_extension = MethodBind.get("WebRTCPeerConnection", "set_default_extension", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.WebRTCPeerConnection.mb_set_default_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], SnArg(extensionClass))
  }

  /** Godot enum `WebRTCPeerConnection.ConnectionState`. */
  opaque type ConnectionState <: Long = Long

  object ConnectionState {
    final val New: ConnectionState = 0L.asInstanceOf[ConnectionState]
    final val Connecting: ConnectionState = 1L.asInstanceOf[ConnectionState]
    final val Connected: ConnectionState = 2L.asInstanceOf[ConnectionState]
    final val Disconnected: ConnectionState = 3L.asInstanceOf[ConnectionState]
    final val Failed: ConnectionState = 4L.asInstanceOf[ConnectionState]
    final val Closed: ConnectionState = 5L.asInstanceOf[ConnectionState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ConnectionState = value.asInstanceOf[ConnectionState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ConnectionState] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ConnectionState]]

    extension (self: ConnectionState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "New"
        case 1L => "Connecting"
        case 2L => "Connected"
        case 3L => "Disconnected"
        case 4L => "Failed"
        case 5L => "Closed"
        case other => other.toString
      }
  }

  /** Godot enum `WebRTCPeerConnection.GatheringState`. */
  opaque type GatheringState <: Long = Long

  object GatheringState {
    final val New: GatheringState = 0L.asInstanceOf[GatheringState]
    final val Gathering: GatheringState = 1L.asInstanceOf[GatheringState]
    final val Complete: GatheringState = 2L.asInstanceOf[GatheringState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GatheringState = value.asInstanceOf[GatheringState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GatheringState] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[GatheringState]]

    extension (self: GatheringState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "New"
        case 1L => "Gathering"
        case 2L => "Complete"
        case other => other.toString
      }
  }

  /** Godot enum `WebRTCPeerConnection.SignalingState`. */
  opaque type SignalingState <: Long = Long

  object SignalingState {
    final val Stable: SignalingState = 0L.asInstanceOf[SignalingState]
    final val HaveLocalOffer: SignalingState = 1L.asInstanceOf[SignalingState]
    final val HaveRemoteOffer: SignalingState = 2L.asInstanceOf[SignalingState]
    final val HaveLocalPranswer: SignalingState = 3L.asInstanceOf[SignalingState]
    final val HaveRemotePranswer: SignalingState = 4L.asInstanceOf[SignalingState]
    final val Closed: SignalingState = 5L.asInstanceOf[SignalingState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SignalingState = value.asInstanceOf[SignalingState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SignalingState] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[SignalingState]]

    extension (self: SignalingState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Stable"
        case 1L => "HaveLocalOffer"
        case 2L => "HaveRemoteOffer"
        case 3L => "HaveLocalPranswer"
        case 4L => "HaveRemotePranswer"
        case 5L => "Closed"
        case other => other.toString
      }
  }
}
