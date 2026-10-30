package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectFilter`, extends `AudioEffect`. */
abstract class AudioEffectFilter extends AudioEffect {
  override def godotClassName: String = "AudioEffectFilter"

  /** AudioEffectFilter.set_cutoff */
  final def setCutoff(freq: Double): Unit = {
    if (gdext.classes.AudioEffectFilter.mb_set_cutoff == null) gdext.classes.AudioEffectFilter.mb_set_cutoff = MethodBind.get("AudioEffectFilter", "set_cutoff", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectFilter.mb_set_cutoff, livePtr, freq)
  }

  /** AudioEffectFilter.get_cutoff */
  final def getCutoff(): Double = {
    if (gdext.classes.AudioEffectFilter.mb_get_cutoff == null) gdext.classes.AudioEffectFilter.mb_get_cutoff = MethodBind.get("AudioEffectFilter", "get_cutoff", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectFilter.mb_get_cutoff, livePtr)
  }

  /** AudioEffectFilter.set_resonance */
  final def setResonance(amount: Double): Unit = {
    if (gdext.classes.AudioEffectFilter.mb_set_resonance == null) gdext.classes.AudioEffectFilter.mb_set_resonance = MethodBind.get("AudioEffectFilter", "set_resonance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectFilter.mb_set_resonance, livePtr, amount)
  }

  /** AudioEffectFilter.get_resonance */
  final def getResonance(): Double = {
    if (gdext.classes.AudioEffectFilter.mb_get_resonance == null) gdext.classes.AudioEffectFilter.mb_get_resonance = MethodBind.get("AudioEffectFilter", "get_resonance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectFilter.mb_get_resonance, livePtr)
  }

  /** AudioEffectFilter.set_gain */
  final def setGain(amount: Double): Unit = {
    if (gdext.classes.AudioEffectFilter.mb_set_gain == null) gdext.classes.AudioEffectFilter.mb_set_gain = MethodBind.get("AudioEffectFilter", "set_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectFilter.mb_set_gain, livePtr, amount)
  }

  /** AudioEffectFilter.get_gain */
  final def getGain(): Double = {
    if (gdext.classes.AudioEffectFilter.mb_get_gain == null) gdext.classes.AudioEffectFilter.mb_get_gain = MethodBind.get("AudioEffectFilter", "get_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectFilter.mb_get_gain, livePtr)
  }

  /** AudioEffectFilter.set_db */
  final def setDb(amount: gdext.classes.AudioEffectFilter.FilterDB): Unit = {
    if (gdext.classes.AudioEffectFilter.mb_set_db == null) gdext.classes.AudioEffectFilter.mb_set_db = MethodBind.get("AudioEffectFilter", "set_db", 771740901L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectFilter.mb_set_db, livePtr, amount)
  }

  /** AudioEffectFilter.get_db */
  final def getDb(): gdext.classes.AudioEffectFilter.FilterDB = {
    if (gdext.classes.AudioEffectFilter.mb_get_db == null) gdext.classes.AudioEffectFilter.mb_get_db = MethodBind.get("AudioEffectFilter", "get_db", 3981721890L)
    gdext.classes.AudioEffectFilter.FilterDB(Ptrcall.call0[Long](gdext.classes.AudioEffectFilter.mb_get_db, livePtr))
  }

}

object AudioEffectFilter {
  private[classes] var mb_set_cutoff: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cutoff: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_resonance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_resonance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_db: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_db: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioEffectFilter.FilterDB`. */
  opaque type FilterDB <: Long = Long

  object FilterDB {
    final val Filter6db: FilterDB = 0L.asInstanceOf[FilterDB]
    final val Filter12db: FilterDB = 1L.asInstanceOf[FilterDB]
    final val Filter18db: FilterDB = 2L.asInstanceOf[FilterDB]
    final val Filter24db: FilterDB = 3L.asInstanceOf[FilterDB]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): FilterDB = value.asInstanceOf[FilterDB]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[FilterDB] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[FilterDB]]

    extension (self: FilterDB)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Filter6db"
        case 1L => "Filter12db"
        case 2L => "Filter18db"
        case 3L => "Filter24db"
        case other => other.toString
      }
  }
}
