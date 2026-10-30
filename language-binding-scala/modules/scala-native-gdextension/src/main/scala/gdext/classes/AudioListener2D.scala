package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioListener2D`, extends `Node2D`. */
abstract class AudioListener2D extends Node2D {
  override def godotClassName: String = "AudioListener2D"

  /** AudioListener2D.make_current */
  final def makeCurrent(): Unit = {
    if (gdext.classes.AudioListener2D.mb_make_current == null) gdext.classes.AudioListener2D.mb_make_current = MethodBind.get("AudioListener2D", "make_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioListener2D.mb_make_current, livePtr)
  }

  /** AudioListener2D.clear_current */
  final def clearCurrent(): Unit = {
    if (gdext.classes.AudioListener2D.mb_clear_current == null) gdext.classes.AudioListener2D.mb_clear_current = MethodBind.get("AudioListener2D", "clear_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioListener2D.mb_clear_current, livePtr)
  }

  /** AudioListener2D.is_current */
  final def isCurrent(): Boolean = {
    if (gdext.classes.AudioListener2D.mb_is_current == null) gdext.classes.AudioListener2D.mb_is_current = MethodBind.get("AudioListener2D", "is_current", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioListener2D.mb_is_current, livePtr)
  }

}

object AudioListener2D {
  private[classes] var mb_make_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_current: GDExtensionMethodBindPtr = null
}
