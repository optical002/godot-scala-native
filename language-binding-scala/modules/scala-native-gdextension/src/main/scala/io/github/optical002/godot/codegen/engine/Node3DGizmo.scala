package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Node3DGizmo`, extends `RefCounted`. */
abstract class Node3DGizmo extends RefCounted {

}

object Node3DGizmo {
  /** Class metadata for Gd[Node3DGizmo] lifetime management and casting. */
  given GodotClass[Node3DGizmo] with {
    def className = "Node3DGizmo"
    def isRefCounted = true
    def wrap(o: GodotObject): Node3DGizmo = new Node3DGizmo {}.withHost(o.objectPtr)
    def unwrap(t: Node3DGizmo): GodotObject = t.hostObject
  }
}
