package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGPrimitive3D`, extends `CSGShape3D`. */
abstract class CSGPrimitive3D extends CSGShape3D {

  /** CSGPrimitive3D.set_flip_faces */
  final def setFlipFaces(flip_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPrimitive3D", "set_flip_faces", 2586408642L), hostObject.objectPtr, flip_faces)

  /** CSGPrimitive3D.get_flip_faces */
  final def getFlipFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPrimitive3D", "get_flip_faces", 2240911060L), hostObject.objectPtr)

}

object CSGPrimitive3D {
  /** Class metadata for Gd[CSGPrimitive3D] lifetime management and casting. */
  given GodotClass[CSGPrimitive3D] with {
    def className = "CSGPrimitive3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CSGPrimitive3D = new CSGPrimitive3D {}.withHost(o.objectPtr)
    def unwrap(t: CSGPrimitive3D): GodotObject = t.hostObject
  }
}
