package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFDocumentExtension`, extends `Resource`. */
abstract class GLTFDocumentExtension extends Resource {

}

object GLTFDocumentExtension {
  /** Class metadata for Gd[GLTFDocumentExtension] lifetime management and casting. */
  given GodotClass[GLTFDocumentExtension] with {
    def className = "GLTFDocumentExtension"
    def isRefCounted = true
    def wrap(o: GodotObject): GLTFDocumentExtension = new GLTFDocumentExtension {}.withHost(o.objectPtr)
    def unwrap(t: GLTFDocumentExtension): GodotObject = t.hostObject
  }
}
