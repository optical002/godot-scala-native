package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioStreamPolyphonic`, extends `AudioStream`. */
abstract class AudioStreamPolyphonic extends AudioStream {
  override def godotClassName: String = "AudioStreamPolyphonic"

  /** AudioStreamPolyphonic.set_polyphony */
  final def setPolyphony(voices: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioStreamPolyphonic", "set_polyphony", 1286410249L), hostObject.objectPtr, voices)

  /** AudioStreamPolyphonic.get_polyphony */
  final def getPolyphony(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioStreamPolyphonic", "get_polyphony", 3905245786L), hostObject.objectPtr)

}
