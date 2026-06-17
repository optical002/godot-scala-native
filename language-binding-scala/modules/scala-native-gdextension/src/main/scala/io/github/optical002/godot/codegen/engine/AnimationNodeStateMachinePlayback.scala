package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeStateMachinePlayback`, extends `Resource`. */
abstract class AnimationNodeStateMachinePlayback extends Resource {

  /** AnimationNodeStateMachinePlayback.travel */
  final def travel(to_node: io.github.optical002.godot.builtin.StringName, reset_on_teleport: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachinePlayback", "travel", 3823612587L), hostObject.objectPtr, to_node, reset_on_teleport)

  /** AnimationNodeStateMachinePlayback.start */
  final def start(node: io.github.optical002.godot.builtin.StringName, reset: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeStateMachinePlayback", "start", 3823612587L), hostObject.objectPtr, node, reset)

  /** AnimationNodeStateMachinePlayback.next */
  final def next(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationNodeStateMachinePlayback", "next", 3218959716L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AnimationNodeStateMachinePlayback", "stop", 3218959716L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.is_playing */
  final def isPlaying(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeStateMachinePlayback", "is_playing", 36873697L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_current_node */
  final def getCurrentNode(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_node", 2002593661L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_current_play_position */
  final def getCurrentPlayPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_play_position", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_current_length */
  final def getCurrentLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_current_length", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_fading_from_node */
  final def getFadingFromNode(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_node", 2002593661L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_fading_from_play_position */
  final def getFadingFromPlayPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_play_position", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_fading_from_length */
  final def getFadingFromLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_from_length", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_fading_position */
  final def getFadingPosition(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_position", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeStateMachinePlayback.get_fading_length */
  final def getFadingLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeStateMachinePlayback", "get_fading_length", 1740695150L), hostObject.objectPtr)

}

object AnimationNodeStateMachinePlayback {
  /** Class metadata for Gd[AnimationNodeStateMachinePlayback] lifetime management and casting. */
  given GodotClass[AnimationNodeStateMachinePlayback] with {
    def className = "AnimationNodeStateMachinePlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeStateMachinePlayback = new AnimationNodeStateMachinePlayback {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeStateMachinePlayback): GodotObject = t.hostObject
  }
}
