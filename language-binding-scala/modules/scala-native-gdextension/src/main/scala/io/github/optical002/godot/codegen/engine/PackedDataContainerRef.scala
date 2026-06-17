package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `PackedDataContainerRef`, extends `RefCounted`. */
abstract class PackedDataContainerRef extends RefCounted {

  /** PackedDataContainerRef.size */
  final def size(): Long =
    Ptrcall.call0[Long](MethodBind.get("PackedDataContainerRef", "size", 3905245786L), hostObject.objectPtr)

}

object PackedDataContainerRef {
  /** Class metadata for Gd[PackedDataContainerRef] lifetime management and casting. */
  given GodotClass[PackedDataContainerRef] with {
    def className = "PackedDataContainerRef"
    def isRefCounted = true
    def wrap(o: GodotObject): PackedDataContainerRef = new PackedDataContainerRef {}.withHost(o.objectPtr)
    def unwrap(t: PackedDataContainerRef): GodotObject = t.hostObject
  }
}
