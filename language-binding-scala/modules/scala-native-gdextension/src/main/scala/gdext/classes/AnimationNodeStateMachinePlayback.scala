package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeStateMachinePlayback`, extends `Resource`. */
abstract class AnimationNodeStateMachinePlayback extends Resource {
  override def godotClassName: String = "AnimationNodeStateMachinePlayback"

  /** AnimationNodeStateMachinePlayback.travel */
  final def travel(toNode: String, resetOnTeleport: Boolean = true): Unit = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_travel == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_travel = MethodBind.get("AnimationNodeStateMachinePlayback", "travel", 3823612587L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachinePlayback.mb_travel, livePtr, SnArg(toNode), resetOnTeleport)
  }

  /** AnimationNodeStateMachinePlayback.start */
  final def start(node: String, reset: Boolean = true): Unit = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_start == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_start = MethodBind.get("AnimationNodeStateMachinePlayback", "start", 3823612587L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeStateMachinePlayback.mb_start, livePtr, SnArg(node), reset)
  }

  /** AnimationNodeStateMachinePlayback.next */
  final def next(): Unit = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_next == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_next = MethodBind.get("AnimationNodeStateMachinePlayback", "next", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationNodeStateMachinePlayback.mb_next, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.stop */
  final def stop(): Unit = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_stop == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_stop = MethodBind.get("AnimationNodeStateMachinePlayback", "stop", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AnimationNodeStateMachinePlayback.mb_stop, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.is_playing */
  final def isPlaying(): Boolean = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_is_playing == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_is_playing = MethodBind.get("AnimationNodeStateMachinePlayback", "is_playing", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeStateMachinePlayback.mb_is_playing, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_current_node */
  final def getCurrentNode(): String = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_node == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_node = MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_node", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_node, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_current_play_position */
  final def getCurrentPlayPosition(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_play_position == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_play_position = MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_play_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_play_position, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_current_length */
  final def getCurrentLength(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_length == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_length = MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_current_length, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_fading_from_node */
  final def getFadingFromNode(): String = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_node == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_node = MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_node", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_node, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_fading_from_play_position */
  final def getFadingFromPlayPosition(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_play_position == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_play_position = MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_play_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_play_position, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_fading_from_length */
  final def getFadingFromLength(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_length == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_length = MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_from_length, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_fading_position */
  final def getFadingPosition(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_position == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_position = MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_position", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_position, livePtr)
  }

  /** AnimationNodeStateMachinePlayback.get_fading_length */
  final def getFadingLength(): Double = {
    if (gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_length == null) gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_length = MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AnimationNodeStateMachinePlayback.mb_get_fading_length, livePtr)
  }

}

object AnimationNodeStateMachinePlayback {
  private[classes] var mb_travel: GDExtensionMethodBindPtr = null
  private[classes] var mb_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_next: GDExtensionMethodBindPtr = null
  private[classes] var mb_stop: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_playing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_play_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fading_from_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fading_from_play_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fading_from_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fading_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fading_length: GDExtensionMethodBindPtr = null
}
