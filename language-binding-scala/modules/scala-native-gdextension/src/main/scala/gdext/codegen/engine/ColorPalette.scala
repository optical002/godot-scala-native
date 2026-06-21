package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ColorPalette`, extends `Resource`. */
abstract class ColorPalette extends Resource {

}

object ColorPalette {
  /** Class metadata for Gd[ColorPalette] lifetime management and casting. */
  given GodotClass[ColorPalette] with {
    def className = "ColorPalette"
    def isRefCounted = true
    def wrap(o: GodotObject): ColorPalette = new ColorPalette {}.withHost(o.objectPtr)
    def unwrap(t: ColorPalette): GodotObject = t.hostObject
  }
}
