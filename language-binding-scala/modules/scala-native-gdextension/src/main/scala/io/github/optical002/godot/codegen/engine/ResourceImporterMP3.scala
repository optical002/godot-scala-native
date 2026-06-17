package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterMP3`, extends `ResourceImporter`. */
abstract class ResourceImporterMP3 extends ResourceImporter {

}

object ResourceImporterMP3 {
  /** Class metadata for Gd[ResourceImporterMP3] lifetime management and casting. */
  given GodotClass[ResourceImporterMP3] with {
    def className = "ResourceImporterMP3"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterMP3 = new ResourceImporterMP3 {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterMP3): GodotObject = t.hostObject
  }
}
