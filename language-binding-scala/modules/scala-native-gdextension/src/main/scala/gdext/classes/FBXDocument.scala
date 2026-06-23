package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FBXDocument`, extends `GLTFDocument`. */
abstract class FBXDocument extends GLTFDocument {

}

object FBXDocument {
  /** Class metadata for Gd[FBXDocument] lifetime management and casting. */
  given GodotClass[FBXDocument] with {
    def className = "FBXDocument"
    def isRefCounted = true
    def wrap(o: GodotObject): FBXDocument = new FBXDocument {}.withHost(o.objectPtr)
    def unwrap(t: FBXDocument): GodotObject = t.hostObject
  }
}
