package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGBox3D`, extends `CSGPrimitive3D`. */
abstract class CSGBox3D extends CSGPrimitive3D {

  /** CSGBox3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGBox3D", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** CSGBox3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("CSGBox3D", "get_size", 3360562783L), hostObject.objectPtr)

  /** CSGBox3D.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGBox3D", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** CSGBox3D.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CSGBox3D", "get_material", 5934680L), hostObject.objectPtr)

}

object CSGBox3D {
  /** Class metadata for Gd[CSGBox3D] lifetime management and casting. */
  given GodotClass[CSGBox3D] with {
    def className = "CSGBox3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGBox3D = new CSGBox3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGBox3D): GodotObject = t.hostObject
  }
}
