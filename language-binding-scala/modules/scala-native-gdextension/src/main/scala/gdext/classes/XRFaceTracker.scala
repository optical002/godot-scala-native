package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `XRFaceTracker`, extends `XRTracker`. */
abstract class XRFaceTracker extends XRTracker {
  override def godotClassName: String = "XRFaceTracker"

  /** XRFaceTracker.get_blend_shape */
  final def getBlendShape(blend_shape: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("XRFaceTracker", "get_blend_shape", 330010046L), hostObject.objectPtr, blend_shape)

  /** XRFaceTracker.set_blend_shape */
  final def setBlendShape(blend_shape: Long, weight: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("XRFaceTracker", "set_blend_shape", 2352588791L), hostObject.objectPtr, blend_shape, weight)

}
