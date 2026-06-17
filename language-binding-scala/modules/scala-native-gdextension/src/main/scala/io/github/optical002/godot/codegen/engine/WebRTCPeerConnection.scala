package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WebRTCPeerConnection`, extends `RefCounted`. */
abstract class WebRTCPeerConnection extends RefCounted {

  /** WebRTCPeerConnection.create_offer */
  final def createOffer(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCPeerConnection", "create_offer", 166280745L), hostObject.objectPtr)

  /** WebRTCPeerConnection.set_local_description */
  final def setLocalDescription(`type`: String, sdp: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("WebRTCPeerConnection", "set_local_description", 852856452L), hostObject.objectPtr, `type`, sdp)

  /** WebRTCPeerConnection.set_remote_description */
  final def setRemoteDescription(`type`: String, sdp: String): Long =
    Ptrcall.call2[String, String, Long](MethodBind.get("WebRTCPeerConnection", "set_remote_description", 852856452L), hostObject.objectPtr, `type`, sdp)

  /** WebRTCPeerConnection.add_ice_candidate */
  final def addIceCandidate(media: String, index: Long, name: String): Long =
    Ptrcall.call3[String, Long, String, Long](MethodBind.get("WebRTCPeerConnection", "add_ice_candidate", 3958950400L), hostObject.objectPtr, media, index, name)

  /** WebRTCPeerConnection.poll */
  final def poll(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCPeerConnection", "poll", 166280745L), hostObject.objectPtr)

  /** WebRTCPeerConnection.close */
  final def close(): Unit =
    Ptrcall.callVoid0(MethodBind.get("WebRTCPeerConnection", "close", 3218959716L), hostObject.objectPtr)

  /** WebRTCPeerConnection.get_connection_state */
  final def getConnectionState(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCPeerConnection", "get_connection_state", 2275710506L), hostObject.objectPtr)

  /** WebRTCPeerConnection.get_gathering_state */
  final def getGatheringState(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCPeerConnection", "get_gathering_state", 4262591401L), hostObject.objectPtr)

  /** WebRTCPeerConnection.get_signaling_state */
  final def getSignalingState(): Long =
    Ptrcall.call0[Long](MethodBind.get("WebRTCPeerConnection", "get_signaling_state", 3342956226L), hostObject.objectPtr)

}

object WebRTCPeerConnection {
  /** Class metadata for Gd[WebRTCPeerConnection] lifetime management and casting. */
  given GodotClass[WebRTCPeerConnection] with {
    def className = "WebRTCPeerConnection"
    def isRefCounted = true
    def wrap(o: GodotObject): WebRTCPeerConnection = new WebRTCPeerConnection {}.withHost(o.objectPtr)
    def unwrap(t: WebRTCPeerConnection): GodotObject = t.hostObject
  }
}
