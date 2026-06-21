package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
