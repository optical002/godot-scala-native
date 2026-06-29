package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRCompositionLayerQuad`, extends `OpenXRCompositionLayer`. */
abstract class OpenXRCompositionLayerQuad extends OpenXRCompositionLayer {
  override def godotClassName: String = "OpenXRCompositionLayerQuad"

  /** OpenXRCompositionLayerQuad.set_quad_size */
  final def setQuadSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRCompositionLayerQuad", "set_quad_size", 743155724L), hostObject.objectPtr, size)

  /** OpenXRCompositionLayerQuad.get_quad_size */
  final def getQuadSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("OpenXRCompositionLayerQuad", "get_quad_size", 3341600327L), hostObject.objectPtr)

}
