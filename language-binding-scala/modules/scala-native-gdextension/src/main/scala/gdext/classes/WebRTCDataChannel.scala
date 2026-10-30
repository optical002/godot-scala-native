package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WebRTCDataChannel`, extends `PacketPeer`. */
abstract class WebRTCDataChannel extends PacketPeer {
  override def godotClassName: String = "WebRTCDataChannel"

  /** WebRTCDataChannel.poll */
  final def poll(): gdext.classes.Error = {
    if (gdext.classes.WebRTCDataChannel.mb_poll == null) gdext.classes.WebRTCDataChannel.mb_poll = MethodBind.get("WebRTCDataChannel", "poll", 166280745L)
    gdext.classes.Error(Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_poll, livePtr))
  }

  /** WebRTCDataChannel.close */
  final def close(): Unit = {
    if (gdext.classes.WebRTCDataChannel.mb_close == null) gdext.classes.WebRTCDataChannel.mb_close = MethodBind.get("WebRTCDataChannel", "close", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.WebRTCDataChannel.mb_close, livePtr)
  }

  /** WebRTCDataChannel.was_string_packet */
  final def wasStringPacket(): Boolean = {
    if (gdext.classes.WebRTCDataChannel.mb_was_string_packet == null) gdext.classes.WebRTCDataChannel.mb_was_string_packet = MethodBind.get("WebRTCDataChannel", "was_string_packet", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.WebRTCDataChannel.mb_was_string_packet, livePtr)
  }

  /** WebRTCDataChannel.set_write_mode */
  final def setWriteMode(writeMode: gdext.classes.WebRTCDataChannel.WriteMode): Unit = {
    if (gdext.classes.WebRTCDataChannel.mb_set_write_mode == null) gdext.classes.WebRTCDataChannel.mb_set_write_mode = MethodBind.get("WebRTCDataChannel", "set_write_mode", 1999768052L)
    Ptrcall.callVoid1(gdext.classes.WebRTCDataChannel.mb_set_write_mode, livePtr, writeMode)
  }

  /** WebRTCDataChannel.get_write_mode */
  final def getWriteMode(): gdext.classes.WebRTCDataChannel.WriteMode = {
    if (gdext.classes.WebRTCDataChannel.mb_get_write_mode == null) gdext.classes.WebRTCDataChannel.mb_get_write_mode = MethodBind.get("WebRTCDataChannel", "get_write_mode", 2848495172L)
    gdext.classes.WebRTCDataChannel.WriteMode(Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_write_mode, livePtr))
  }

  /** WebRTCDataChannel.get_ready_state */
  final def getReadyState(): gdext.classes.WebRTCDataChannel.ChannelState = {
    if (gdext.classes.WebRTCDataChannel.mb_get_ready_state == null) gdext.classes.WebRTCDataChannel.mb_get_ready_state = MethodBind.get("WebRTCDataChannel", "get_ready_state", 3501143017L)
    gdext.classes.WebRTCDataChannel.ChannelState(Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_ready_state, livePtr))
  }

  /** WebRTCDataChannel.get_label */
  final def getLabel(): String = {
    if (gdext.classes.WebRTCDataChannel.mb_get_label == null) gdext.classes.WebRTCDataChannel.mb_get_label = MethodBind.get("WebRTCDataChannel", "get_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebRTCDataChannel.mb_get_label, livePtr)
  }

  /** WebRTCDataChannel.is_ordered */
  final def isOrdered(): Boolean = {
    if (gdext.classes.WebRTCDataChannel.mb_is_ordered == null) gdext.classes.WebRTCDataChannel.mb_is_ordered = MethodBind.get("WebRTCDataChannel", "is_ordered", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.WebRTCDataChannel.mb_is_ordered, livePtr)
  }

  /** WebRTCDataChannel.get_id */
  final def getId(): Long = {
    if (gdext.classes.WebRTCDataChannel.mb_get_id == null) gdext.classes.WebRTCDataChannel.mb_get_id = MethodBind.get("WebRTCDataChannel", "get_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_id, livePtr)
  }

  /** WebRTCDataChannel.get_max_packet_life_time */
  final def getMaxPacketLifeTime(): Long = {
    if (gdext.classes.WebRTCDataChannel.mb_get_max_packet_life_time == null) gdext.classes.WebRTCDataChannel.mb_get_max_packet_life_time = MethodBind.get("WebRTCDataChannel", "get_max_packet_life_time", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_max_packet_life_time, livePtr)
  }

  /** WebRTCDataChannel.get_max_retransmits */
  final def getMaxRetransmits(): Long = {
    if (gdext.classes.WebRTCDataChannel.mb_get_max_retransmits == null) gdext.classes.WebRTCDataChannel.mb_get_max_retransmits = MethodBind.get("WebRTCDataChannel", "get_max_retransmits", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_max_retransmits, livePtr)
  }

  /** WebRTCDataChannel.get_protocol */
  final def getProtocol(): String = {
    if (gdext.classes.WebRTCDataChannel.mb_get_protocol == null) gdext.classes.WebRTCDataChannel.mb_get_protocol = MethodBind.get("WebRTCDataChannel", "get_protocol", 201670096L)
    Ptrcall.call0[String](gdext.classes.WebRTCDataChannel.mb_get_protocol, livePtr)
  }

  /** WebRTCDataChannel.is_negotiated */
  final def isNegotiated(): Boolean = {
    if (gdext.classes.WebRTCDataChannel.mb_is_negotiated == null) gdext.classes.WebRTCDataChannel.mb_is_negotiated = MethodBind.get("WebRTCDataChannel", "is_negotiated", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.WebRTCDataChannel.mb_is_negotiated, livePtr)
  }

  /** WebRTCDataChannel.get_buffered_amount */
  final def getBufferedAmount(): Long = {
    if (gdext.classes.WebRTCDataChannel.mb_get_buffered_amount == null) gdext.classes.WebRTCDataChannel.mb_get_buffered_amount = MethodBind.get("WebRTCDataChannel", "get_buffered_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.WebRTCDataChannel.mb_get_buffered_amount, livePtr)
  }

}

object WebRTCDataChannel {
  private[classes] var mb_poll: GDExtensionMethodBindPtr = null
  private[classes] var mb_close: GDExtensionMethodBindPtr = null
  private[classes] var mb_was_string_packet: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_write_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_write_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ready_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_ordered: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_packet_life_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_retransmits: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_protocol: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_negotiated: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_buffered_amount: GDExtensionMethodBindPtr = null

  /** Godot enum `WebRTCDataChannel.WriteMode`. */
  opaque type WriteMode <: Long = Long

  object WriteMode {
    final val Text: WriteMode = 0L.asInstanceOf[WriteMode]
    final val Binary: WriteMode = 1L.asInstanceOf[WriteMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WriteMode = value.asInstanceOf[WriteMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WriteMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[WriteMode]]

    extension (self: WriteMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Text"
        case 1L => "Binary"
        case other => other.toString
      }
  }

  /** Godot enum `WebRTCDataChannel.ChannelState`. */
  opaque type ChannelState <: Long = Long

  object ChannelState {
    final val Connecting: ChannelState = 0L.asInstanceOf[ChannelState]
    final val Open: ChannelState = 1L.asInstanceOf[ChannelState]
    final val Closing: ChannelState = 2L.asInstanceOf[ChannelState]
    final val Closed: ChannelState = 3L.asInstanceOf[ChannelState]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ChannelState = value.asInstanceOf[ChannelState]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ChannelState] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ChannelState]]

    extension (self: ChannelState)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Connecting"
        case 1L => "Open"
        case 2L => "Closing"
        case 3L => "Closed"
        case other => other.toString
      }
  }
}
