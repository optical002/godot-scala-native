package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

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
