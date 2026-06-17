package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamGeneratorPlayback`, extends `AudioStreamPlaybackResampled`. */
abstract class AudioStreamGeneratorPlayback extends AudioStreamPlaybackResampled {

  /** AudioStreamGeneratorPlayback.push_frame */
  final def pushFrame(frame: io.github.optical002.godot.builtin.Vector2): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.Vector2, Boolean](MethodBind.get("AudioStreamGeneratorPlayback", "push_frame", 3975407249L), hostObject.objectPtr, frame)

  /** AudioStreamGeneratorPlayback.can_push_buffer */
  final def canPushBuffer(amount: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("AudioStreamGeneratorPlayback", "can_push_buffer", 1116898809L), hostObject.objectPtr, amount)

  /** AudioStreamGeneratorPlayback.get_frames_available */
  final def getFramesAvailable(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamGeneratorPlayback", "get_frames_available", 3905245786L), hostObject.objectPtr)

  /** AudioStreamGeneratorPlayback.get_skips */
  final def getSkips(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamGeneratorPlayback", "get_skips", 3905245786L), hostObject.objectPtr)

  /** AudioStreamGeneratorPlayback.clear_buffer */
  final def clearBuffer(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioStreamGeneratorPlayback", "clear_buffer", 3218959716L), hostObject.objectPtr)

}

object AudioStreamGeneratorPlayback {
  /** Class metadata for Gd[AudioStreamGeneratorPlayback] lifetime management and casting. */
  given GodotClass[AudioStreamGeneratorPlayback] with {
    def className = "AudioStreamGeneratorPlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): AudioStreamGeneratorPlayback = new AudioStreamGeneratorPlayback {}.withHost(o.objectPtr)
    def unwrap(t: AudioStreamGeneratorPlayback): GodotObject = t.hostObject
  }
}
