package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ResourceImporterOggVorbis`, extends `ResourceImporter`. */
abstract class ResourceImporterOggVorbis extends ResourceImporter {

}

object ResourceImporterOggVorbis {
  /** Class metadata for Gd[ResourceImporterOggVorbis] lifetime management and casting. */
  given GodotClass[ResourceImporterOggVorbis] with {
    def className = "ResourceImporterOggVorbis"
    def isRefCounted = true
    def wrap(o: GodotObject): ResourceImporterOggVorbis = new ResourceImporterOggVorbis {}.withHost(o.objectPtr)
    def unwrap(t: ResourceImporterOggVorbis): GodotObject = t.hostObject
  }
}
