package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRFaceModifier3D`, extends `Node3D`. */
abstract class XRFaceModifier3D extends Node3D {

  /** XRFaceModifier3D.set_face_tracker */
  final def setFaceTracker(tracker_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRFaceModifier3D", "set_face_tracker", 3304788590L), hostObject.objectPtr, tracker_name)

  /** XRFaceModifier3D.get_face_tracker */
  final def getFaceTracker(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRFaceModifier3D", "get_face_tracker", 2002593661L), hostObject.objectPtr)

}

object XRFaceModifier3D {
  /** Class metadata for Gd[XRFaceModifier3D] lifetime management and casting. */
  given GodotClass[XRFaceModifier3D] with {
    def className = "XRFaceModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRFaceModifier3D = new XRFaceModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: XRFaceModifier3D): GodotObject = t.hostObject
  }
}
