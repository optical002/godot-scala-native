package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CubemapArray`, extends `ImageTextureLayered`. */
abstract class CubemapArray extends ImageTextureLayered {

  /** CubemapArray.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CubemapArray", "create_placeholder", 121922552L), hostObject.objectPtr)

}

object CubemapArray {
  /** Class metadata for Gd[CubemapArray] lifetime management and casting. */
  given GodotClass[CubemapArray] with {
    def className = "CubemapArray"
    def isRefCounted = true
    def wrap(o: GodotObject): CubemapArray = new CubemapArray {}.withHost(o.objectPtr)
    def unwrap(t: CubemapArray): GodotObject = t.hostObject
  }
}
