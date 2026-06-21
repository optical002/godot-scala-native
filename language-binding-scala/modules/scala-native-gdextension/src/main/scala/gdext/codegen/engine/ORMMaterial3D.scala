package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ORMMaterial3D`, extends `BaseMaterial3D`. */
abstract class ORMMaterial3D extends BaseMaterial3D {

}

object ORMMaterial3D {
  /** Class metadata for Gd[ORMMaterial3D] lifetime management and casting. */
  given GodotClass[ORMMaterial3D] with {
    def className = "ORMMaterial3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ORMMaterial3D = new ORMMaterial3D {}.withHost(o.objectPtr)
    def unwrap(t: ORMMaterial3D): GodotObject = t.hostObject
  }
}
