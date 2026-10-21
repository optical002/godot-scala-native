package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRFaceTracker`, extends `XRTracker`. */
abstract class XRFaceTracker extends XRTracker {
  override def godotClassName: String = "XRFaceTracker"

  /** XRFaceTracker.get_blend_shape */
  final def getBlendShape(blend_shape: Long): Double = {
    if (gdext.classes.XRFaceTracker.mb_get_blend_shape == null) gdext.classes.XRFaceTracker.mb_get_blend_shape = MethodBind.get("XRFaceTracker", "get_blend_shape", 330010046L)
    Ptrcall.call1[Long, Double](gdext.classes.XRFaceTracker.mb_get_blend_shape, livePtr, blend_shape)
  }

  /** XRFaceTracker.set_blend_shape */
  final def setBlendShape(blend_shape: Long, weight: Double): Unit = {
    if (gdext.classes.XRFaceTracker.mb_set_blend_shape == null) gdext.classes.XRFaceTracker.mb_set_blend_shape = MethodBind.get("XRFaceTracker", "set_blend_shape", 2352588791L)
    Ptrcall.callVoid2(gdext.classes.XRFaceTracker.mb_set_blend_shape, livePtr, blend_shape, weight)
  }

}

object XRFaceTracker {
  private[classes] var mb_get_blend_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_shape: GDExtensionMethodBindPtr = null
}
