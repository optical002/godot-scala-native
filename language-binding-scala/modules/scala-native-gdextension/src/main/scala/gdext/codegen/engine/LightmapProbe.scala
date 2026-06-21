package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
