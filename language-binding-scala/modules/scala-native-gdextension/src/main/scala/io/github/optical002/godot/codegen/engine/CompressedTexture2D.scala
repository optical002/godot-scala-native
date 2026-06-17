package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTexture2D`, extends `Texture2D`. */
abstract class CompressedTexture2D extends Texture2D {

  /** CompressedTexture2D.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTexture2D", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTexture2D.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTexture2D", "get_load_path", 201670096L), hostObject.objectPtr)

}

object CompressedTexture2D {
  /** Class metadata for Gd[CompressedTexture2D] lifetime management and casting. */
  given GodotClass[CompressedTexture2D] with {
    def className = "CompressedTexture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedTexture2D = new CompressedTexture2D {}.withHost(o.objectPtr)
    def unwrap(t: CompressedTexture2D): GodotObject = t.hostObject
  }
}
