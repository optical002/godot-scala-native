package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `MultiMeshInstance3D`, extends `GeometryInstance3D`. */
abstract class MultiMeshInstance3D extends GeometryInstance3D {

  /** MultiMeshInstance3D.set_multimesh */
  final def setMultimesh(multimesh: MultiMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("MultiMeshInstance3D", "set_multimesh", 2246127404L), hostObject.objectPtr, multimesh.hostObject)

  /** MultiMeshInstance3D.get_multimesh */
  final def getMultimesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("MultiMeshInstance3D", "get_multimesh", 1385450523L), hostObject.objectPtr)

}

object MultiMeshInstance3D {
  /** Class metadata for Gd[MultiMeshInstance3D] lifetime management and casting. */
  given GodotClass[MultiMeshInstance3D] with {
    def className = "MultiMeshInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): MultiMeshInstance3D = new MultiMeshInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: MultiMeshInstance3D): GodotObject = t.hostObject
  }
}
