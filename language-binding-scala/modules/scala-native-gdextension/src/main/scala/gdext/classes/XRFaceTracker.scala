package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRFaceTracker`, extends `XRTracker`. */
abstract class XRFaceTracker extends XRTracker {

  /** XRFaceTracker.get_blend_shape */
  final def getBlendShape(blend_shape: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("XRFaceTracker", "get_blend_shape", 330010046L), hostObject.objectPtr, blend_shape)

  /** XRFaceTracker.set_blend_shape */
  final def setBlendShape(blend_shape: Long, weight: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRFaceTracker", "set_blend_shape", 2352588791L), hostObject.objectPtr, blend_shape, weight)

}

object XRFaceTracker {
  /** Class metadata for Gd[XRFaceTracker] lifetime management and casting. */
  given GodotClass[XRFaceTracker] with {
    def className = "XRFaceTracker"
    def isRefCounted = true
    def wrap(o: GodotObject): XRFaceTracker = new XRFaceTracker {}.withHost(o.objectPtr)
    def unwrap(t: XRFaceTracker): GodotObject = t.hostObject
  }
}
