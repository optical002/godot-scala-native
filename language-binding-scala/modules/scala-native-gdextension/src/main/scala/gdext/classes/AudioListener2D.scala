package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioListener2D`, extends `Node2D`. */
abstract class AudioListener2D extends Node2D {
  override def godotClassName: String = "AudioListener2D"

  /** AudioListener2D.make_current */
  final def makeCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener2D", "make_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener2D.clear_current */
  final def clearCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener2D", "clear_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener2D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioListener2D", "is_current", 36873697L), hostObject.objectPtr)

}
