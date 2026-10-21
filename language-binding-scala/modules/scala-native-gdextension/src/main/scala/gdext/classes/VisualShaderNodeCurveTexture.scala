package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCurveTexture`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeCurveTexture extends VisualShaderNodeResizableBase {
  override def godotClassName: String = "VisualShaderNodeCurveTexture"

  /** VisualShaderNodeCurveTexture.set_texture */
  final def setTexture(texture: CurveTexture): Unit = {
    if (gdext.classes.VisualShaderNodeCurveTexture.mb_set_texture == null) gdext.classes.VisualShaderNodeCurveTexture.mb_set_texture = MethodBind.get("VisualShaderNodeCurveTexture", "set_texture", 181872837L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCurveTexture.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** VisualShaderNodeCurveTexture.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): CurveTexture = {
    if (gdext.classes.VisualShaderNodeCurveTexture.mb_get_texture == null) gdext.classes.VisualShaderNodeCurveTexture.mb_get_texture = MethodBind.get("VisualShaderNodeCurveTexture", "get_texture", 2800800579L)
    Wrappers.owned[CurveTexture](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCurveTexture.mb_get_texture, livePtr))
  }

}

object VisualShaderNodeCurveTexture {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
