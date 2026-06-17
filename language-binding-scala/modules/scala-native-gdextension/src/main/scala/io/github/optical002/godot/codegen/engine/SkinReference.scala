package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SkinReference`, extends `RefCounted`. */
abstract class SkinReference extends RefCounted {

  /** SkinReference.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkinReference", "get_skin", 2074563878L), hostObject.objectPtr)

}

object SkinReference {
  /** Class metadata for Gd[SkinReference] lifetime management and casting. */
  given GodotClass[SkinReference] with {
    def className = "SkinReference"
    def isRefCounted = true
    def wrap(o: GodotObject): SkinReference = new SkinReference {}.withHost(o.objectPtr)
    def unwrap(t: SkinReference): GodotObject = t.hostObject
  }
}
