package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleMultiplyByAxisAngle`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleMultiplyByAxisAngle extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleMultiplyByAxisAngle"

  /** VisualShaderNodeParticleMultiplyByAxisAngle.set_degrees_mode */
  final def setDegreesMode(enabled: Boolean): Unit = {
    if (gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_set_degrees_mode == null) gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_set_degrees_mode = MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "set_degrees_mode", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_set_degrees_mode, livePtr, enabled)
  }

  /** VisualShaderNodeParticleMultiplyByAxisAngle.is_degrees_mode */
  final def isDegreesMode(): Boolean = {
    if (gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_is_degrees_mode == null) gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_is_degrees_mode = MethodBind.get("VisualShaderNodeParticleMultiplyByAxisAngle", "is_degrees_mode", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.VisualShaderNodeParticleMultiplyByAxisAngle.mb_is_degrees_mode, livePtr)
  }

}

object VisualShaderNodeParticleMultiplyByAxisAngle {
  private[classes] var mb_set_degrees_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_degrees_mode: GDExtensionMethodBindPtr = null
}
