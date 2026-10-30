package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectAmplify`, extends `AudioEffect`. */
abstract class AudioEffectAmplify extends AudioEffect {
  override def godotClassName: String = "AudioEffectAmplify"

  /** AudioEffectAmplify.set_volume_db */
  final def setVolumeDb(volume: Double): Unit = {
    if (gdext.classes.AudioEffectAmplify.mb_set_volume_db == null) gdext.classes.AudioEffectAmplify.mb_set_volume_db = MethodBind.get("AudioEffectAmplify", "set_volume_db", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectAmplify.mb_set_volume_db, livePtr, volume)
  }

  /** AudioEffectAmplify.get_volume_db */
  final def getVolumeDb(): Double = {
    if (gdext.classes.AudioEffectAmplify.mb_get_volume_db == null) gdext.classes.AudioEffectAmplify.mb_get_volume_db = MethodBind.get("AudioEffectAmplify", "get_volume_db", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectAmplify.mb_get_volume_db, livePtr)
  }

  /** AudioEffectAmplify.set_volume_linear */
  final def setVolumeLinear(volume: Double): Unit = {
    if (gdext.classes.AudioEffectAmplify.mb_set_volume_linear == null) gdext.classes.AudioEffectAmplify.mb_set_volume_linear = MethodBind.get("AudioEffectAmplify", "set_volume_linear", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectAmplify.mb_set_volume_linear, livePtr, volume)
  }

  /** AudioEffectAmplify.get_volume_linear */
  final def getVolumeLinear(): Double = {
    if (gdext.classes.AudioEffectAmplify.mb_get_volume_linear == null) gdext.classes.AudioEffectAmplify.mb_get_volume_linear = MethodBind.get("AudioEffectAmplify", "get_volume_linear", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectAmplify.mb_get_volume_linear, livePtr)
  }

}

object AudioEffectAmplify {
  private[classes] var mb_set_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_volume_linear: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_volume_linear: GDExtensionMethodBindPtr = null
}
