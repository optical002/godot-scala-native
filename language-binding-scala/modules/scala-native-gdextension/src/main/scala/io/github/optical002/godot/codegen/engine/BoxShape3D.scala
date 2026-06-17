package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `BoxShape3D`, extends `Shape3D`. */
abstract class BoxShape3D extends Shape3D {

  /** BoxShape3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("BoxShape3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** BoxShape3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("BoxShape3D", "get_size", 3360562783L), hostObject.objectPtr)

}

object BoxShape3D {
  /** Class metadata for Gd[BoxShape3D] lifetime management and casting. */
  given GodotClass[BoxShape3D] with {
    def className = "BoxShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): BoxShape3D = new BoxShape3D {}.withHost(o.objectPtr)
    def unwrap(t: BoxShape3D): GodotObject = t.hostObject
  }
}
