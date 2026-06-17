package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterOBJ`, extends `ResourceImporter`. */
abstract class ResourceImporterOBJ extends ResourceImporter {

}

object ResourceImporterOBJ {
  /** Class metadata for Gd[ResourceImporterOBJ] lifetime management and casting. */
  given GodotClass[ResourceImporterOBJ] with {
    def className = "ResourceImporterOBJ"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterOBJ = new ResourceImporterOBJ {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterOBJ): GodotObject = t.hostObject
  }
}
