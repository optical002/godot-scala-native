package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OfflineMultiplayerPeer`, extends `MultiplayerPeer`. */
abstract class OfflineMultiplayerPeer extends MultiplayerPeer {

}

object OfflineMultiplayerPeer {
  /** Class metadata for Gd[OfflineMultiplayerPeer] lifetime management and casting. */
  given GodotClass[OfflineMultiplayerPeer] with {
    def className = "OfflineMultiplayerPeer"
    def isRefCounted = true
    def wrap(o: GodotObject): OfflineMultiplayerPeer = new OfflineMultiplayerPeer {}.withHost(o.objectPtr)
    def unwrap(t: OfflineMultiplayerPeer): GodotObject = t.hostObject
  }
}
