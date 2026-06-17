package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SphereShape3D`, extends `Shape3D`. */
abstract class SphereShape3D extends Shape3D {

  /** SphereShape3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("SphereShape3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** SphereShape3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("SphereShape3D", "get_radius", 1740695150L), hostObject.objectPtr)

}

object SphereShape3D {
  /** Class metadata for Gd[SphereShape3D] lifetime management and casting. */
  given GodotClass[SphereShape3D] with {
    def className = "SphereShape3D"
    def isRefCounted = true
    def wrap(o: GodotObject): SphereShape3D = new SphereShape3D {}.withHost(o.objectPtr)
    def unwrap(t: SphereShape3D): GodotObject = t.hostObject
  }
}
