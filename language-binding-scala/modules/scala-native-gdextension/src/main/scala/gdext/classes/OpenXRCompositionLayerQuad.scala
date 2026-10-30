package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRCompositionLayerQuad`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerQuad extends OpenXRCompositionLayer {
  override def godotClassName: String = "OpenXRCompositionLayerQuad"

  /** OpenXRCompositionLayerQuad.set_quad_size */
  final def setQuadSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.OpenXRCompositionLayerQuad.mb_set_quad_size == null) gdext.classes.OpenXRCompositionLayerQuad.mb_set_quad_size = MethodBind.get("OpenXRCompositionLayerQuad", "set_quad_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.OpenXRCompositionLayerQuad.mb_set_quad_size, livePtr, size)
  }

  /** OpenXRCompositionLayerQuad.get_quad_size */
  final def getQuadSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.OpenXRCompositionLayerQuad.mb_get_quad_size == null) gdext.classes.OpenXRCompositionLayerQuad.mb_get_quad_size = MethodBind.get("OpenXRCompositionLayerQuad", "get_quad_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.OpenXRCompositionLayerQuad.mb_get_quad_size, livePtr)
  }

}

object OpenXRCompositionLayerQuad {
  private[classes] var mb_set_quad_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_quad_size: GDExtensionMethodBindPtr = null
}
