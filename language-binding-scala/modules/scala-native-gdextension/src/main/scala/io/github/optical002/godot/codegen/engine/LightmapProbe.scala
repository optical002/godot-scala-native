package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `LightmapProbe`, extends `Node3D`. */
abstract class LightmapProbe extends Node3D {

}

object LightmapProbe {
  /** Class metadata for Gd[LightmapProbe] lifetime management and casting. */
  given GodotClass[LightmapProbe] with {
    def className = "LightmapProbe"
    def isRefCounted = false
    def wrap(o: GodotObject): LightmapProbe = new LightmapProbe {}.withHost(o.objectPtr)
    def unwrap(t: LightmapProbe): GodotObject = t.hostObject
  }
}
