package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `CSGPrimitive3D`, extends `CSGShape3D`. */
abstract class CSGPrimitive3D extends CSGShape3D {
  override def godotClassName: String = "CSGPrimitive3D"

  /** CSGPrimitive3D.set_flip_faces */
  final def setFlipFaces(flip_faces: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CSGPrimitive3D", "set_flip_faces", 2586408642L), hostObject.objectPtr, flip_faces)

  /** CSGPrimitive3D.get_flip_faces */
  final def getFlipFaces(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CSGPrimitive3D", "get_flip_faces", 2240911060L), hostObject.objectPtr)

}
