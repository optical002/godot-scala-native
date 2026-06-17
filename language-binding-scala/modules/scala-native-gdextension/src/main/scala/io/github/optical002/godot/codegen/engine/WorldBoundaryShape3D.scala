package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `WorldBoundaryShape3D`, extends `Shape3D`. */
abstract class WorldBoundaryShape3D extends Shape3D {

  /** WorldBoundaryShape3D.set_plane */
  final def setPlane(plane: io.github.optical002.godot.builtin.Plane): Unit =
    Ptrcall.callVoid1(MethodBind.get("WorldBoundaryShape3D", "set_plane", 3505987427L), hostObject.objectPtr, plane)

  /** WorldBoundaryShape3D.get_plane */
  final def getPlane(): io.github.optical002.godot.builtin.Plane =
    Ptrcall.call0[io.github.optical002.godot.builtin.Plane](MethodBind.get("WorldBoundaryShape3D", "get_plane", 2753500971L), hostObject.objectPtr)

}

object WorldBoundaryShape3D {
  /** Class metadata for Gd[WorldBoundaryShape3D] lifetime management and casting. */
  given GodotClass[WorldBoundaryShape3D] with {
    def className = "WorldBoundaryShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): WorldBoundaryShape3D = new WorldBoundaryShape3D {}.withHost(o.objectPtr)
    def unwrap(t: WorldBoundaryShape3D): GodotObject = t.hostObject
  }
}
