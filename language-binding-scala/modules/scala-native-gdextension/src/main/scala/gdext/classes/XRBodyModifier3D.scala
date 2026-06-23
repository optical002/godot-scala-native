package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRBodyModifier3D`, extends `SkeletonModifier3D`. */
abstract class XRBodyModifier3D extends SkeletonModifier3D {

  /** XRBodyModifier3D.set_body_tracker */
  final def setBodyTracker(tracker_name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRBodyModifier3D", "set_body_tracker", 3304788590L), hostObject.objectPtr, tracker_name)

  /** XRBodyModifier3D.get_body_tracker */
  final def getBodyTracker(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("XRBodyModifier3D", "get_body_tracker", 2002593661L), hostObject.objectPtr)

  /** XRBodyModifier3D.set_body_update */
  final def setBodyUpdate(body_update: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRBodyModifier3D", "set_body_update", 2211199417L), hostObject.objectPtr, body_update)

  /** XRBodyModifier3D.get_body_update */
  final def getBodyUpdate(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRBodyModifier3D", "get_body_update", 2642335328L), hostObject.objectPtr)

  /** XRBodyModifier3D.set_bone_update */
  final def setBoneUpdate(bone_update: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRBodyModifier3D", "set_bone_update", 3356796943L), hostObject.objectPtr, bone_update)

  /** XRBodyModifier3D.get_bone_update */
  final def getBoneUpdate(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRBodyModifier3D", "get_bone_update", 1309305964L), hostObject.objectPtr)

}

object XRBodyModifier3D {
  /** Class metadata for Gd[XRBodyModifier3D] lifetime management and casting. */
  given GodotClass[XRBodyModifier3D] with {
    def className = "XRBodyModifier3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRBodyModifier3D = new XRBodyModifier3D {}.withHost(o.objectPtr)
    def unwrap(t: XRBodyModifier3D): GodotObject = t.hostObject
  }
}
