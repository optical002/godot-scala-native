package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AudioListener3D`, extends `Node3D`. */
abstract class AudioListener3D extends Node3D {
  override def godotClassName: String = "AudioListener3D"

  /** AudioListener3D.make_current */
  final def makeCurrent(): Unit = {
    if (gdext.classes.AudioListener3D.mb_make_current == null) gdext.classes.AudioListener3D.mb_make_current = MethodBind.get("AudioListener3D", "make_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioListener3D.mb_make_current, livePtr)
  }

  /** AudioListener3D.clear_current */
  final def clearCurrent(): Unit = {
    if (gdext.classes.AudioListener3D.mb_clear_current == null) gdext.classes.AudioListener3D.mb_clear_current = MethodBind.get("AudioListener3D", "clear_current", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.AudioListener3D.mb_clear_current, livePtr)
  }

  /** AudioListener3D.is_current */
  final def isCurrent(): Boolean = {
    if (gdext.classes.AudioListener3D.mb_is_current == null) gdext.classes.AudioListener3D.mb_is_current = MethodBind.get("AudioListener3D", "is_current", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AudioListener3D.mb_is_current, livePtr)
  }

  /** AudioListener3D.get_listener_transform */
  final def getListenerTransform(): gdext.builtin.Transform3D = {
    if (gdext.classes.AudioListener3D.mb_get_listener_transform == null) gdext.classes.AudioListener3D.mb_get_listener_transform = MethodBind.get("AudioListener3D", "get_listener_transform", 3229777777L)
    Ptrcall.call0[gdext.builtin.Transform3D](gdext.classes.AudioListener3D.mb_get_listener_transform, livePtr)
  }

  /** AudioListener3D.set_doppler_tracking */
  final def setDopplerTracking(mode: Long): Unit = {
    if (gdext.classes.AudioListener3D.mb_set_doppler_tracking == null) gdext.classes.AudioListener3D.mb_set_doppler_tracking = MethodBind.get("AudioListener3D", "set_doppler_tracking", 2365921740L)
    Ptrcall.callVoid1(gdext.classes.AudioListener3D.mb_set_doppler_tracking, livePtr, mode)
  }

  /** AudioListener3D.get_doppler_tracking */
  final def getDopplerTracking(): Long = {
    if (gdext.classes.AudioListener3D.mb_get_doppler_tracking == null) gdext.classes.AudioListener3D.mb_get_doppler_tracking = MethodBind.get("AudioListener3D", "get_doppler_tracking", 550229039L)
    Ptrcall.call0[Long](gdext.classes.AudioListener3D.mb_get_doppler_tracking, livePtr)
  }

}

object AudioListener3D {
  private[classes] var mb_make_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_current: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_listener_transform: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_doppler_tracking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_doppler_tracking: GDExtensionMethodBindPtr = null
}
