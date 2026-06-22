package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ImageFormatLoader`, extends `RefCounted`. */
abstract class ImageFormatLoader extends RefCounted {

}

object ImageFormatLoader {
  /** Class metadata for Gd[ImageFormatLoader] lifetime management and casting. */
  given GodotClass[ImageFormatLoader] with {
    def className = "ImageFormatLoader"
    def isRefCounted = true
    def wrap(o: GodotObject): ImageFormatLoader = new ImageFormatLoader {}.withHost(o.objectPtr)
    def unwrap(t: ImageFormatLoader): GodotObject = t.hostObject
  }
}
