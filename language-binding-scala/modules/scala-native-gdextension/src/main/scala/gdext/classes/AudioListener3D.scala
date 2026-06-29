package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AudioListener3D`, extends `Node3D`. */
abstract class AudioListener3D extends Node3D {
  override def godotClassName: String = "AudioListener3D"

  /** AudioListener3D.make_current */
  final def makeCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener3D", "make_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener3D.clear_current */
  final def clearCurrent(): Unit =
    Ptrcall.callVoid0(MethodBind.get("AudioListener3D", "clear_current", 3218959716L), hostObject.objectPtr)

  /** AudioListener3D.is_current */
  final def isCurrent(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AudioListener3D", "is_current", 36873697L), hostObject.objectPtr)

  /** AudioListener3D.get_listener_transform */
  final def getListenerTransform(): gdext.builtin.Transform3D =
    Ptrcall.call0[gdext.builtin.Transform3D](MethodBind.get("AudioListener3D", "get_listener_transform", 3229777777L), hostObject.objectPtr)

  /** AudioListener3D.set_doppler_tracking */
  final def setDopplerTracking(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AudioListener3D", "set_doppler_tracking", 2365921740L), hostObject.objectPtr, mode)

  /** AudioListener3D.get_doppler_tracking */
  final def getDopplerTracking(): Long =
    Ptrcall.call0[Long](MethodBind.get("AudioListener3D", "get_doppler_tracking", 550229039L), hostObject.objectPtr)

}
