package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectPanner`, extends `AudioEffect`. */
abstract class AudioEffectPanner extends AudioEffect {
  override def godotClassName: String = "AudioEffectPanner"

  /** AudioEffectPanner.set_pan */
  final def setPan(cpanume: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPanner", "set_pan", 373806689L), hostObject.objectPtr, cpanume)

  /** AudioEffectPanner.get_pan */
  final def getPan(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPanner", "get_pan", 1740695150L), hostObject.objectPtr)

}
