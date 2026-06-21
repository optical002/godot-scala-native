package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `StandardMaterial3D`, extends `BaseMaterial3D`. */
abstract class StandardMaterial3D extends BaseMaterial3D {

}

object StandardMaterial3D {
  /** Class metadata for Gd[StandardMaterial3D] lifetime management and casting. */
  given GodotClass[StandardMaterial3D] with {
    def className = "StandardMaterial3D"
    def isRefCounted = true
    def wrap(o: GodotObject): StandardMaterial3D = new StandardMaterial3D {}.withHost(o.objectPtr)
    def unwrap(t: StandardMaterial3D): GodotObject = t.hostObject
  }
}
