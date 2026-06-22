package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `MovieWriter`, extends `Object`. */
abstract class MovieWriter extends Object {

}

object MovieWriter {
  /** Class metadata for Gd[MovieWriter] lifetime management and casting. */
  given GodotClass[MovieWriter] with {
    def className = "MovieWriter"
    def isRefCounted = false
    def wrap(o: GodotObject): MovieWriter = new MovieWriter {}.withHost(o.objectPtr)
    def unwrap(t: MovieWriter): GodotObject = t.hostObject
  }
}
