package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OptimizedTranslation`, extends `Translation`. */
abstract class OptimizedTranslation extends Translation {

  /** OptimizedTranslation.generate */
  final def generate(from: Translation): Unit =
    Ptrcall.callVoid1(MethodBind.get("OptimizedTranslation", "generate", 1466479800L), hostObject.objectPtr, from.hostObject)

}

object OptimizedTranslation {
  /** Class metadata for Gd[OptimizedTranslation] lifetime management and casting. */
  given GodotClass[OptimizedTranslation] with {
    def className = "OptimizedTranslation"
    def isRefCounted = true
    def wrap(o: GodotObject): OptimizedTranslation = new OptimizedTranslation {}.withHost(o.objectPtr)
    def unwrap(t: OptimizedTranslation): GodotObject = t.hostObject
  }
}
