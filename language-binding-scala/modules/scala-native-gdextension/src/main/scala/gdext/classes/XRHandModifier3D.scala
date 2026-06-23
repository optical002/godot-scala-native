package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRHandModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRHandModifier3D extends SkeletonModifier3D {

  /** XRHandModifier3D.set_hand_tracker */
  final def setHandTracker(tracker_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRHandModifier3D", "set_hand_tracker", 3304788590L), hostObject.objectPtr, tracker_name)

  /** XRHandModifier3D.get_hand_tracker */
  final def getHandTracker(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRHandModifier3D", "get_hand_tracker", 2002593661L), hostObject.objectPtr)

  /** XRHandModifier3D.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRHandModifier3D", "set_bone_update", 3635701455L), hostObject.objectPtr, bone_update)

  /** XRHandModifier3D.get_bone_update */
  final def getBoneUpdate(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRHandModifier3D", "get_bone_update", 2873665691L), hostObject.objectPtr)

}

object XRHandModifier3D {
  /** Class metadata for Gd[XRHandModifier3D] lifetime management and casting. */
  given GodotClass[XRHandModifier3D] with {
    def className = "XRHandModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRHandModifier3D = new XRHandModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: XRHandModifier3D): GodotObject = t.hostObject
  }
}
