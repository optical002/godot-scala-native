package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeParticleAccelerator`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeParticleAccelerator extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeParticleAccelerator"

  /** VisualShaderNodeParticleAccelerator.set_mode */
  final def setMode(mode: Long): Unit = {
    if (gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode == null) gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode = MethodBind.get("VisualShaderNodeParticleAccelerator", "set_mode", 3457585749L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeParticleAccelerator.mb_set_mode, livePtr, mode)
  }

  /** VisualShaderNodeParticleAccelerator.get_mode */
  final def getMode(): Long = {
    if (gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode == null) gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode = MethodBind.get("VisualShaderNodeParticleAccelerator", "get_mode", 2660365633L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeParticleAccelerator.mb_get_mode, livePtr)
  }

}

object VisualShaderNodeParticleAccelerator {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
}
