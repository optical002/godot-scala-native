package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterCSVTranslation`, extends `ResourceImporter`. */
abstract class ResourceImporterCSVTranslation extends ResourceImporter {

}

object ResourceImporterCSVTranslation {
  /** Class metadata for Gd[ResourceImporterCSVTranslation] lifetime management and casting. */
  given GodotClass[ResourceImporterCSVTranslation] with {
    def className = "ResourceImporterCSVTranslation"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterCSVTranslation = new ResourceImporterCSVTranslation {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterCSVTranslation): GodotObject = t.hostObject
  }
}
