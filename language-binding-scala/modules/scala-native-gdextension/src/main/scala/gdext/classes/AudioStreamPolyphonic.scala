package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioStreamPolyphonic`, extends `AudioStream`. */
abstract class AudioStreamPolyphonic extends AudioStream {
  override def godotClassName: String = "AudioStreamPolyphonic"

  /** AudioStreamPolyphonic.set_polyphony */
  final def setPolyphony(voices: Long): Unit = {
    if (gdext.classes.AudioStreamPolyphonic.mb_set_polyphony == null) gdext.classes.AudioStreamPolyphonic.mb_set_polyphony = MethodBind.get("AudioStreamPolyphonic", "set_polyphony", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AudioStreamPolyphonic.mb_set_polyphony, livePtr, voices)
  }

  /** AudioStreamPolyphonic.get_polyphony */
  final def getPolyphony(): Long = {
    if (gdext.classes.AudioStreamPolyphonic.mb_get_polyphony == null) gdext.classes.AudioStreamPolyphonic.mb_get_polyphony = MethodBind.get("AudioStreamPolyphonic", "get_polyphony", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AudioStreamPolyphonic.mb_get_polyphony, livePtr)
  }

}

object AudioStreamPolyphonic {
  private[classes] var mb_set_polyphony: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_polyphony: GDExtensionMethodBindPtr = null
}
