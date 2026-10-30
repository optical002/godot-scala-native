package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRFaceModifier3D`, extends `Node3D`. */
abstract class XRFaceModifier3D extends Node3D {
  override def godotClassName: String = "XRFaceModifier3D"

  /** XRFaceModifier3D.set_face_tracker */
  final def setFaceTracker(trackerName: String): Unit = {
    if (gdext.classes.XRFaceModifier3D.mb_set_face_tracker == null) gdext.classes.XRFaceModifier3D.mb_set_face_tracker = MethodBind.get("XRFaceModifier3D", "set_face_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRFaceModifier3D.mb_set_face_tracker, livePtr, SnArg(trackerName))
  }

  /** XRFaceModifier3D.get_face_tracker */
  final def getFaceTracker(): String = {
    if (gdext.classes.XRFaceModifier3D.mb_get_face_tracker == null) gdext.classes.XRFaceModifier3D.mb_get_face_tracker = MethodBind.get("XRFaceModifier3D", "get_face_tracker", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.XRFaceModifier3D.mb_get_face_tracker, livePtr)
  }

}

object XRFaceModifier3D {
  private[classes] var mb_set_face_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_tracker: GDExtensionMethodBindPtr = null
}
