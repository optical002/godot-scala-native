package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SceneReplicationConfig`, extends `Resource`. */
abstract class SceneReplicationConfig extends Resource {

}

object SceneReplicationConfig {
  /** Class metadata for Gd[SceneReplicationConfig] lifetime management and casting. */
  given GodotClass[SceneReplicationConfig] with {
    def className = "SceneReplicationConfig"
    def isRefCounted = true
    def wrap(o: GodotObject): SceneReplicationConfig = new SceneReplicationConfig {}.withHost(o.objectPtr)
    def unwrap(t: SceneReplicationConfig): GodotObject = t.hostObject
  }
}
