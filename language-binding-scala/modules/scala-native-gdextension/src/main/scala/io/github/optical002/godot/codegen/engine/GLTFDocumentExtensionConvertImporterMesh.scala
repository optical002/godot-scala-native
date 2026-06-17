package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFDocumentExtensionConvertImporterMesh`, extends `GLTFDocumentExtension`. */
abstract class GLTFDocumentExtensionConvertImporterMesh extends GLTFDocumentExtension {

}

object GLTFDocumentExtensionConvertImporterMesh {
  /** Class metadata for Gd[GLTFDocumentExtensionConvertImporterMesh] lifetime management and casting. */
  given GodotClass[GLTFDocumentExtensionConvertImporterMesh] with {
    def className = "GLTFDocumentExtensionConvertImporterMesh"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFDocumentExtensionConvertImporterMesh = new GLTFDocumentExtensionConvertImporterMesh {}.withHost(o.objectPtr)
    def unwrap(t: GLTFDocumentExtensionConvertImporterMesh): GodotObject = t.hostObject
  }
}
