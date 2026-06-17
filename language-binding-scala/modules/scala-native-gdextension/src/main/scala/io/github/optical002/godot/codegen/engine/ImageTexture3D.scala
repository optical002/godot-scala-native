package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

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
