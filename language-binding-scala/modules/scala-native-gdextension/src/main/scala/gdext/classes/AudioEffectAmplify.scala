package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectAmplify`, extends `AudioEffect`. */
abstract class AudioEffectAmplify extends AudioEffect {
  override def godotClassName: String = "AudioEffectAmplify"

  /** AudioEffectAmplify.set_volume_db */
  final def setVolumeDb(volume: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectAmplify", "set_volume_db", 373806689L), hostObject.objectPtr, volume)

  /** AudioEffectAmplify.get_volume_db */
  final def getVolumeDb(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectAmplify", "get_volume_db", 1740695150L), hostObject.objectPtr)

  /** AudioEffectAmplify.set_volume_linear */
  final def setVolumeLinear(volume: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectAmplify", "set_volume_linear", 373806689L), hostObject.objectPtr, volume)

  /** AudioEffectAmplify.get_volume_linear */
  final def getVolumeLinear(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectAmplify", "get_volume_linear", 1740695150L), hostObject.objectPtr)

}
