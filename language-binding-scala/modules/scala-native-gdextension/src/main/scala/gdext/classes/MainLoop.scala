package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `MainLoop`, extends `Object`. */
abstract class MainLoop extends Object {

}

object MainLoop {
  /** Class metadata for Gd[MainLoop] lifetime management and casting. */
  given GodotClass[MainLoop] with {
    def className = "MainLoop"
    def isRefCounted = false
    def wrap(o: GodotObject): MainLoop = new MainLoop {}.withHost(o.objectPtr)
    def unwrap(t: MainLoop): GodotObject = t.hostObject
  }
}
