package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRCompositionLayerQuad`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerQuad extends OpenXRCompositionLayer {

  /** OpenXRCompositionLayerQuad.set_quad_size */
  final def setQuadSize(size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerQuad", "set_quad_size", 743155724L), hostObject.objectPtr, size)

  /** OpenXRCompositionLayerQuad.get_quad_size */
  final def getQuadSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("OpenXRCompositionLayerQuad", "get_quad_size", 3341600327L), hostObject.objectPtr)

}

object OpenXRCompositionLayerQuad {
  /** Class metadata for Gd[OpenXRCompositionLayerQuad] lifetime management and casting. */
  given GodotClass[OpenXRCompositionLayerQuad] with {
    def className = "OpenXRCompositionLayerQuad"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRCompositionLayerQuad = new OpenXRCompositionLayerQuad {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRCompositionLayerQuad): GodotObject = t.hostObject
  }
}
