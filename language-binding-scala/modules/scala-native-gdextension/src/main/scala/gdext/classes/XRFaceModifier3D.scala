package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRFaceModifier3D`, extends `Node3D`. */
abstract class XRFaceModifier3D extends Node3D {
  override def godotClassName: String = "XRFaceModifier3D"

  /** XRFaceModifier3D.set_face_tracker */
  final def setFaceTracker(tracker_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.XRFaceModifier3D.mb_set_face_tracker == null) gdext.classes.XRFaceModifier3D.mb_set_face_tracker = MethodBind.get("XRFaceModifier3D", "set_face_tracker", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.XRFaceModifier3D.mb_set_face_tracker, livePtr, tracker_name)
  }

  /** XRFaceModifier3D.get_face_tracker */
  final def getFaceTracker(): gdext.builtin.StringName = {
    if (gdext.classes.XRFaceModifier3D.mb_get_face_tracker == null) gdext.classes.XRFaceModifier3D.mb_get_face_tracker = MethodBind.get("XRFaceModifier3D", "get_face_tracker", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.XRFaceModifier3D.mb_get_face_tracker, livePtr)
  }

}

object XRFaceModifier3D {
  private[classes] var mb_set_face_tracker: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_face_tracker: GDExtensionMethodBindPtr = null
}
