package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CompressedTextureLayered`, extends `TextureLayered`. */
abstract class CompressedTextureLayered extends TextureLayered {

  /** CompressedTextureLayered.load */
  final def load(path: String): Long =
    Ptrcall.call1[String, Long](MethodBind.get("CompressedTextureLayered", "load", 166001499L), hostObject.objectPtr, path)

  /** CompressedTextureLayered.get_load_path */
  final def getLoadPath(): String =
    Ptrcall.call0[String](MethodBind.get("CompressedTextureLayered", "get_load_path", 201670096L), hostObject.objectPtr)

}

object CompressedTextureLayered {
  /** Class metadata for Gd[CompressedTextureLayered] lifetime management and casting. */
  given GodotClass[CompressedTextureLayered] with {
    def className = "CompressedTextureLayered"
    def isRefCounted = true
    def wrap(o: GodotObject): CompressedTextureLayered = new CompressedTextureLayered {}.withHost(o.objectPtr)
    def unwrap(t: CompressedTextureLayered): GodotObject = t.hostObject
  }
}
