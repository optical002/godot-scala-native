package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRCamera3D`, extends `Camera3D`. */
abstract class XRCamera3D extends Camera3D {

}

object XRCamera3D {
  /** Class metadata for Gd[XRCamera3D] lifetime management and casting. */
  given GodotClass[XRCamera3D] with {
    def className = "XRCamera3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRCamera3D = new XRCamera3D {}.withHost(o.objectPtr)
    def unwrap(t: XRCamera3D): GodotObject = t.hostObject
  }
}
