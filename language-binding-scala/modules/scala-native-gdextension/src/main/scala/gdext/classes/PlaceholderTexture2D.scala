package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTexture2D`, extends `Texture2D`. */
abstract class PlaceholderTexture2D extends Texture2D {

  /** PlaceholderTexture2D.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTexture2D", "set_size", 743155724L), hostObject.objectPtr, size)

}

object PlaceholderTexture2D {
  /** Class metadata for Gd[PlaceholderTexture2D] lifetime management and casting. */
  given GodotClass[PlaceholderTexture2D] with {
    def className = "PlaceholderTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderTexture2D = new PlaceholderTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderTexture2D): GodotObject = t.hostObject
  }
}
