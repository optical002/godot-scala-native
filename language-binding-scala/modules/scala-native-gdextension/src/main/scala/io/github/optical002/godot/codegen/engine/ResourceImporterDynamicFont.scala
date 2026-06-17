package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterDynamicFont`, extends `ResourceImporter`. */
abstract class ResourceImporterDynamicFont extends ResourceImporter {

}

object ResourceImporterDynamicFont {
  /** Class metadata for Gd[ResourceImporterDynamicFont] lifetime management and casting. */
  given GodotClass[ResourceImporterDynamicFont] with {
    def className = "ResourceImporterDynamicFont"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterDynamicFont = new ResourceImporterDynamicFont {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterDynamicFont): GodotObject = t.hostObject
  }
}
