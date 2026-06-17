package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OggPacketSequencePlayback`, extends `RefCounted`. */
abstract class OggPacketSequencePlayback extends RefCounted {

}

object OggPacketSequencePlayback {
  /** Class metadata for Gd[OggPacketSequencePlayback] lifetime management and casting. */
  given GodotClass[OggPacketSequencePlayback] with {
    def className = "OggPacketSequencePlayback"
    def isRefCounted = true
    def wrap(o: GodotObject): OggPacketSequencePlayback = new OggPacketSequencePlayback {}.withHost(o.objectPtr)
    def unwrap(t: OggPacketSequencePlayback): GodotObject = t.hostObject
  }
}
