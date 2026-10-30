package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectPanner`, extends `AudioEffect`. */
abstract class AudioEffectPanner extends AudioEffect {
  override def godotClassName: String = "AudioEffectPanner"

  /** AudioEffectPanner.set_pan */
  final def setPan(cpanume: Double): Unit = {
    if (gdext.classes.AudioEffectPanner.mb_set_pan == null) gdext.classes.AudioEffectPanner.mb_set_pan = MethodBind.get("AudioEffectPanner", "set_pan", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectPanner.mb_set_pan, livePtr, cpanume)
  }

  /** AudioEffectPanner.get_pan */
  final def getPan(): Double = {
    if (gdext.classes.AudioEffectPanner.mb_get_pan == null) gdext.classes.AudioEffectPanner.mb_get_pan = MethodBind.get("AudioEffectPanner", "get_pan", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectPanner.mb_get_pan, livePtr)
  }

}

object AudioEffectPanner {
  private[classes] var mb_set_pan: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pan: GDExtensionMethodBindPtr = null
}
