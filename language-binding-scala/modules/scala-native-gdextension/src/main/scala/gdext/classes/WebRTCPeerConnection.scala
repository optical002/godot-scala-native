package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebRTCPeerConnection`, extends `RefCounted`. */
abstract class WebRTCPeerConnection extends RefCounted {
  override def godotClassName: String = "WebRTCPeerConnection"

  /** WebRTCPeerConnection.create_offer */
  final def createOffer(): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_create_offer == null) gdext.classes.WebRTCPeerConnection.mb_create_offer = MethodBind.get("WebRTCPeerConnection", "create_offer", 166280745L)
    Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_create_offer, livePtr)
  }

  /** WebRTCPeerConnection.set_local_description */
  final def setLocalDescription(`type`: String, sdp: String): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_local_description == null) gdext.classes.WebRTCPeerConnection.mb_set_local_description = MethodBind.get("WebRTCPeerConnection", "set_local_description", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.WebRTCPeerConnection.mb_set_local_description, livePtr, `type`, sdp)
  }

  /** WebRTCPeerConnection.set_remote_description */
  final def setRemoteDescription(`type`: String, sdp: String): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_remote_description == null) gdext.classes.WebRTCPeerConnection.mb_set_remote_description = MethodBind.get("WebRTCPeerConnection", "set_remote_description", 852856452L)
    Ptrcall.call2[String, String, Long](gdext.classes.WebRTCPeerConnection.mb_set_remote_description, livePtr, `type`, sdp)
  }

  /** WebRTCPeerConnection.add_ice_candidate */
  final def addIceCandidate(media: String, index: Long, name: String): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate == null) gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate = MethodBind.get("WebRTCPeerConnection", "add_ice_candidate", 3958950400L)
    Ptrcall.call3[String, Long, String, Long](gdext.classes.WebRTCPeerConnection.mb_add_ice_candidate, livePtr, media, index, name)
  }

  /** WebRTCPeerConnection.poll */
  final def poll(): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_poll == null) gdext.classes.WebRTCPeerConnection.mb_poll = MethodBind.get("WebRTCPeerConnection", "poll", 166280745L)
    Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_poll, livePtr)
  }

  /** WebRTCPeerConnection.close */
  final def close(): Unit = {
    if (gdext.classes.WebRTCPeerConnection.mb_close == null) gdext.classes.WebRTCPeerConnection.mb_close = MethodBind.get("WebRTCPeerConnection", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.WebRTCPeerConnection.mb_close, livePtr)
  }

  /** WebRTCPeerConnection.get_connection_state */
  final def getConnectionState(): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_connection_state == null) gdext.classes.WebRTCPeerConnection.mb_get_connection_state = MethodBind.get("WebRTCPeerConnection", "get_connection_state", 2275710506L)
    Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_connection_state, livePtr)
  }

  /** WebRTCPeerConnection.get_gathering_state */
  final def getGatheringState(): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_gathering_state == null) gdext.classes.WebRTCPeerConnection.mb_get_gathering_state = MethodBind.get("WebRTCPeerConnection", "get_gathering_state", 4262591401L)
    Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_gathering_state, livePtr)
  }

  /** WebRTCPeerConnection.get_signaling_state */
  final def getSignalingState(): Long = {
    if (gdext.classes.WebRTCPeerConnection.mb_get_signaling_state == null) gdext.classes.WebRTCPeerConnection.mb_get_signaling_state = MethodBind.get("WebRTCPeerConnection", "get_signaling_state", 3342956226L)
    Ptrcall.call0[Long](gdext.classes.WebRTCPeerConnection.mb_get_signaling_state, livePtr)
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
  final def setDefaultExtension(extension_class: gdext.builtin.StringName): Unit = {
    if (gdext.classes.WebRTCPeerConnection.mb_set_default_extension == null) gdext.classes.WebRTCPeerConnection.mb_set_default_extension = MethodBind.get("WebRTCPeerConnection", "set_default_extension", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.WebRTCPeerConnection.mb_set_default_extension, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], extension_class)
  }
}
