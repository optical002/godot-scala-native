package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `XRInterfaceExtension`, extends `XRInterface`. */
abstract class XRInterfaceExtension extends XRInterface {

}

object XRInterfaceExtension {
  /** Class metadata for Gd[XRInterfaceExtension] lifetime management and casting. */
  given GodotClass[XRInterfaceExtension] with {
    def className = "XRInterfaceExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): XRInterfaceExtension = new XRInterfaceExtension {}.withHost(o.objectPtr)
    def unwrap(t: XRInterfaceExtension): GodotObject = t.hostObject
  }
}
