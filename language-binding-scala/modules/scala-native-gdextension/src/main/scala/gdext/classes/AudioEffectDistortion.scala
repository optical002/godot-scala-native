package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioEffectDistortion`, extends `AudioEffect`. */
abstract class AudioEffectDistortion extends AudioEffect {
  override def godotClassName: String = "AudioEffectDistortion"

  /** AudioEffectDistortion.set_mode */
  final def setMode(mode: gdext.classes.AudioEffectDistortion.Mode): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_mode == null) gdext.classes.AudioEffectDistortion.mb_set_mode = MethodBind.get("AudioEffectDistortion", "set_mode", 1314744793L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_mode, livePtr, mode)
  }

  /** AudioEffectDistortion.get_mode */
  final def getMode(): gdext.classes.AudioEffectDistortion.Mode = {
    if (gdext.classes.AudioEffectDistortion.mb_get_mode == null) gdext.classes.AudioEffectDistortion.mb_get_mode = MethodBind.get("AudioEffectDistortion", "get_mode", 809118343L)
    gdext.classes.AudioEffectDistortion.Mode(Ptrcall.call0[Long](gdext.classes.AudioEffectDistortion.mb_get_mode, livePtr))
  }

  /** AudioEffectDistortion.set_pre_gain */
  final def setPreGain(preGain: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_pre_gain == null) gdext.classes.AudioEffectDistortion.mb_set_pre_gain = MethodBind.get("AudioEffectDistortion", "set_pre_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_pre_gain, livePtr, preGain)
  }

  /** AudioEffectDistortion.get_pre_gain */
  final def getPreGain(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_pre_gain == null) gdext.classes.AudioEffectDistortion.mb_get_pre_gain = MethodBind.get("AudioEffectDistortion", "get_pre_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_pre_gain, livePtr)
  }

  /** AudioEffectDistortion.set_keep_hf_hz */
  final def setKeepHfHz(keepHfHz: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz == null) gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz = MethodBind.get("AudioEffectDistortion", "set_keep_hf_hz", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_keep_hf_hz, livePtr, keepHfHz)
  }

  /** AudioEffectDistortion.get_keep_hf_hz */
  final def getKeepHfHz(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz == null) gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz = MethodBind.get("AudioEffectDistortion", "get_keep_hf_hz", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_keep_hf_hz, livePtr)
  }

  /** AudioEffectDistortion.set_drive */
  final def setDrive(drive: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_drive == null) gdext.classes.AudioEffectDistortion.mb_set_drive = MethodBind.get("AudioEffectDistortion", "set_drive", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_drive, livePtr, drive)
  }

  /** AudioEffectDistortion.get_drive */
  final def getDrive(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_drive == null) gdext.classes.AudioEffectDistortion.mb_get_drive = MethodBind.get("AudioEffectDistortion", "get_drive", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_drive, livePtr)
  }

  /** AudioEffectDistortion.set_post_gain */
  final def setPostGain(postGain: Double): Unit = {
    if (gdext.classes.AudioEffectDistortion.mb_set_post_gain == null) gdext.classes.AudioEffectDistortion.mb_set_post_gain = MethodBind.get("AudioEffectDistortion", "set_post_gain", 373806689L)
    Ptrcall.callVoid1(gdext.classes.AudioEffectDistortion.mb_set_post_gain, livePtr, postGain)
  }

  /** AudioEffectDistortion.get_post_gain */
  final def getPostGain(): Double = {
    if (gdext.classes.AudioEffectDistortion.mb_get_post_gain == null) gdext.classes.AudioEffectDistortion.mb_get_post_gain = MethodBind.get("AudioEffectDistortion", "get_post_gain", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.AudioEffectDistortion.mb_get_post_gain, livePtr)
  }

}

object AudioEffectDistortion {
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_hf_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_hf_hz: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_drive: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_drive: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_post_gain: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_post_gain: GDExtensionMethodBindPtr = null

  /** Godot enum `AudioEffectDistortion.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Clip: Mode = 0L.asInstanceOf[Mode]
    final val Atan: Mode = 1L.asInstanceOf[Mode]
    final val Lofi: Mode = 2L.asInstanceOf[Mode]
    final val Overdrive: Mode = 3L.asInstanceOf[Mode]
    final val Waveshape: Mode = 4L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Clip"
        case 1L => "Atan"
        case 2L => "Lofi"
        case 3L => "Overdrive"
        case 4L => "Waveshape"
        case other => other.toString
      }
  }
}
