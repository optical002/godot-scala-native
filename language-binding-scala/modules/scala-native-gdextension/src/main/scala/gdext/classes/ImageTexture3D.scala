package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageTexture3D`, extends `Texture3D`. */
abstract class ImageTexture3D extends Texture3D {

}

object ImageTexture3D {
  /** Class metadata for Gd[ImageTexture3D] lifetime management and casting. */
  given GodotClass[ImageTexture3D] with {
    def className = "ImageTexture3D"
    def isRefCounted = true
    def wrap(o: GodotObject): ImageTexture3D = new ImageTexture3D {}.withHost(o.objectPtr)
    def unwrap(t: ImageTexture3D): GodotObject = t.hostObject
  }
}
