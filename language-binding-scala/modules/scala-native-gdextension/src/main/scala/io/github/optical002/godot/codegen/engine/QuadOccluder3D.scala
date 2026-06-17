package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `QuadOccluder3D`, extends `Occluder3D`. */
abstract class QuadOccluder3D extends Occluder3D {

  /** QuadOccluder3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("QuadOccluder3D", "set_size", 743155724L), hostObject.objectPtr, size)

  /** QuadOccluder3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("QuadOccluder3D", "get_size", 3341600327L), hostObject.objectPtr)

}

object QuadOccluder3D {
  /** Class metadata for Gd[QuadOccluder3D] lifetime management and casting. */
  given GodotClass[QuadOccluder3D] with {
    def className = "QuadOccluder3D"
    def isRefCounted = true
    def wrap(o: GodotObject): QuadOccluder3D = new QuadOccluder3D {}.withHost(o.objectPtr)
    def unwrap(t: QuadOccluder3D): GodotObject = t.hostObject
  }
}
