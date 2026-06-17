package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `FogVolume`, extends `VisualInstance3D`. */
abstract class FogVolume extends VisualInstance3D {

  /** FogVolume.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_size", 3460891852L), hostObject.objectPtr, size)

  /** FogVolume.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3](MethodBind.get("FogVolume", "get_size", 3360562783L), hostObject.objectPtr)

  /** FogVolume.set_shape */
  final def setShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_shape", 1416323362L), hostObject.objectPtr, shape)

  /** FogVolume.get_shape */
  final def getShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("FogVolume", "get_shape", 3920334604L), hostObject.objectPtr)

  /** FogVolume.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("FogVolume", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** FogVolume.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FogVolume", "get_material", 5934680L), hostObject.objectPtr)

}

object FogVolume {
  /** Class metadata for Gd[FogVolume] lifetime management and casting. */
  given GodotClass[FogVolume] with {
    def className = "FogVolume"
    def isRefCounted = false
    def wrap(o: GodotObject): FogVolume = new FogVolume {}.withHost(o.objectPtr)
    def unwrap(t: FogVolume): GodotObject = t.hostObject
  }
}
