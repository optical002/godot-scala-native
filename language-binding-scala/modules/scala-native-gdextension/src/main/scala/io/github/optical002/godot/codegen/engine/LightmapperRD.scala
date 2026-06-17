package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `LightmapperRD`, extends `Lightmapper`. */
abstract class LightmapperRD extends Lightmapper {

}

object LightmapperRD {
  /** Class metadata for Gd[LightmapperRD] lifetime management and casting. */
  given GodotClass[LightmapperRD] with {
    def className = "LightmapperRD"
    def isRefCounted = true
    def wrap(o: GodotObject): LightmapperRD = new LightmapperRD {}.withHost(o.objectPtr)
    def unwrap(t: LightmapperRD): GodotObject = t.hostObject
  }
}
