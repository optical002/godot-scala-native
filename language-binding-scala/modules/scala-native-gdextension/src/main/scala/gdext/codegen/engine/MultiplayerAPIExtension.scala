package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiplayerAPIExtension`, extends `MultiplayerAPI`. */
abstract class MultiplayerAPIExtension extends MultiplayerAPI {

}

object MultiplayerAPIExtension {
  /** Class metadata for Gd[MultiplayerAPIExtension] lifetime management and casting. */
  given GodotClass[MultiplayerAPIExtension] with {
    def className = "MultiplayerAPIExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): MultiplayerAPIExtension = new MultiplayerAPIExtension {}.withHost(o.objectPtr)
    def unwrap(t: MultiplayerAPIExtension): GodotObject = t.hostObject
  }
}
