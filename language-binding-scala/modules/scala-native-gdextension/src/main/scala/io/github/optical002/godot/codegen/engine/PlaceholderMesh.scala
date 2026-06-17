package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderMesh`, extends `Mesh`. */
abstract class PlaceholderMesh extends Mesh {

  /** PlaceholderMesh.set_aabb */
  final def setAabb(aabb: io.github.optical002.godot.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderMesh", "set_aabb", 259215842L), hostObject.objectPtr, aabb)

}

object PlaceholderMesh {
  /** Class metadata for Gd[PlaceholderMesh] lifetime management and casting. */
  given GodotClass[PlaceholderMesh] with {
    def className = "PlaceholderMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderMesh = new PlaceholderMesh {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderMesh): GodotObject = t.hostObject
  }
}
