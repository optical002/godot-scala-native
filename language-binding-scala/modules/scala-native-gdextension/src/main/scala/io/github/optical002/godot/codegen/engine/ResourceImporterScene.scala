package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterScene`, extends `ResourceImporter`. */
abstract class ResourceImporterScene extends ResourceImporter {

}

object ResourceImporterScene {
  /** Class metadata for Gd[ResourceImporterScene] lifetime management and casting. */
  given GodotClass[ResourceImporterScene] with {
    def className = "ResourceImporterScene"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterScene = new ResourceImporterScene {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterScene): GodotObject = t.hostObject
  }
}
