package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PlaceholderTexture3D`, extends `Texture3D`. */
abstract class PlaceholderTexture3D extends Texture3D {

  /** PlaceholderTexture3D.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector3i): Unit =
    Ptrcall.callVoid1(MethodBind.get("PlaceholderTexture3D", "set_size", 560364750L), hostObject.objectPtr, size)

  /** PlaceholderTexture3D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector3i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector3i](MethodBind.get("PlaceholderTexture3D", "get_size", 2785653706L), hostObject.objectPtr)

}

object PlaceholderTexture3D {
  /** Class metadata for Gd[PlaceholderTexture3D] lifetime management and casting. */
  given GodotClass[PlaceholderTexture3D] with {
    def className = "PlaceholderTexture3D"
    def isRefCounted = true
    def wrap(o: GodotObject): PlaceholderTexture3D = new PlaceholderTexture3D {}.withHost(o.objectPtr)
    def unwrap(t: PlaceholderTexture3D): GodotObject = t.hostObject
  }
}
