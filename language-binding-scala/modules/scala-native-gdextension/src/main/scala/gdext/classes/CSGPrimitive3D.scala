package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGPrimitive3D`, extends `CSGShape3D`. */
abstract class CSGPrimitive3D extends CSGShape3D {
  override def godotClassName: String = "CSGPrimitive3D"

  /** CSGPrimitive3D.set_flip_faces */
  final def setFlipFaces(flipFaces: Boolean): Unit = {
    if (gdext.classes.CSGPrimitive3D.mb_set_flip_faces == null) gdext.classes.CSGPrimitive3D.mb_set_flip_faces = MethodBind.get("CSGPrimitive3D", "set_flip_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGPrimitive3D.mb_set_flip_faces, livePtr, flipFaces)
  }

  /** CSGPrimitive3D.get_flip_faces */
  final def getFlipFaces(): Boolean = {
    if (gdext.classes.CSGPrimitive3D.mb_get_flip_faces == null) gdext.classes.CSGPrimitive3D.mb_get_flip_faces = MethodBind.get("CSGPrimitive3D", "get_flip_faces", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CSGPrimitive3D.mb_get_flip_faces, livePtr)
  }

}

object CSGPrimitive3D {
  private[classes] var mb_set_flip_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flip_faces: GDExtensionMethodBindPtr = null
}
