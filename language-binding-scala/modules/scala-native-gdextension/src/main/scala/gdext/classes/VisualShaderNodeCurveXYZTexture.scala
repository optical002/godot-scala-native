package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCurveXYZTexture`, extends `VisualShaderNodeResizableBase`. */
abstract class VisualShaderNodeCurveXYZTexture extends VisualShaderNodeResizableBase {
  override def godotClassName: String = "VisualShaderNodeCurveXYZTexture"

  /** VisualShaderNodeCurveXYZTexture.set_texture */
  final def setTexture(texture: CurveXYZTexture): Unit = {
    if (gdext.classes.VisualShaderNodeCurveXYZTexture.mb_set_texture == null) gdext.classes.VisualShaderNodeCurveXYZTexture.mb_set_texture = MethodBind.get("VisualShaderNodeCurveXYZTexture", "set_texture", 8031783L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCurveXYZTexture.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** VisualShaderNodeCurveXYZTexture.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): CurveXYZTexture = {
    if (gdext.classes.VisualShaderNodeCurveXYZTexture.mb_get_texture == null) gdext.classes.VisualShaderNodeCurveXYZTexture.mb_get_texture = MethodBind.get("VisualShaderNodeCurveXYZTexture", "get_texture", 1950275015L)
    Wrappers.owned[CurveXYZTexture](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCurveXYZTexture.mb_get_texture, livePtr))
  }

}

object VisualShaderNodeCurveXYZTexture {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
}
