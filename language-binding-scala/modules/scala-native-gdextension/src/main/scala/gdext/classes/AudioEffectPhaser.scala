package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioEffectPhaser`, extends `AudioEffect`. */
abstract class AudioEffectPhaser extends AudioEffect {
  override def godotClassName: String = "AudioEffectPhaser"

  /** AudioEffectPhaser.set_range_min_hz */
  final def setRangeMinHz(hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPhaser", "set_range_min_hz", 373806689L), hostObject.objectPtr, hz)

  /** AudioEffectPhaser.get_range_min_hz */
  final def getRangeMinHz(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPhaser", "get_range_min_hz", 1740695150L), hostObject.objectPtr)

  /** AudioEffectPhaser.set_range_max_hz */
  final def setRangeMaxHz(hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPhaser", "set_range_max_hz", 373806689L), hostObject.objectPtr, hz)

  /** AudioEffectPhaser.get_range_max_hz */
  final def getRangeMaxHz(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPhaser", "get_range_max_hz", 1740695150L), hostObject.objectPtr)

  /** AudioEffectPhaser.set_rate_hz */
  final def setRateHz(hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPhaser", "set_rate_hz", 373806689L), hostObject.objectPtr, hz)

  /** AudioEffectPhaser.get_rate_hz */
  final def getRateHz(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPhaser", "get_rate_hz", 1740695150L), hostObject.objectPtr)

  /** AudioEffectPhaser.set_feedback */
  final def setFeedback(fbk: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPhaser", "set_feedback", 373806689L), hostObject.objectPtr, fbk)

  /** AudioEffectPhaser.get_feedback */
  final def getFeedback(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPhaser", "get_feedback", 1740695150L), hostObject.objectPtr)

  /** AudioEffectPhaser.set_depth */
  final def setDepth(depth: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioEffectPhaser", "set_depth", 373806689L), hostObject.objectPtr, depth)

  /** AudioEffectPhaser.get_depth */
  final def getDepth(): Double =
    Ptrcall.call0[Double](MethodBind.get("AudioEffectPhaser", "get_depth", 1740695150L), hostObject.objectPtr)

}
