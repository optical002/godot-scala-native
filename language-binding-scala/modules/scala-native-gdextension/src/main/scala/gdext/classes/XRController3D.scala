package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `XRController3D`, extends `XRNode3D`. */
abstract class XRController3D extends XRNode3D {
  override def godotClassName: String = "XRController3D"

  /** XRController3D.is_button_pressed */
  final def isButtonPressed(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.XRController3D.mb_is_button_pressed == null) gdext.classes.XRController3D.mb_is_button_pressed = MethodBind.get("XRController3D", "is_button_pressed", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.XRController3D.mb_is_button_pressed, livePtr, name)
  }

  /** XRController3D.get_float */
  final def getFloat(name: gdext.builtin.StringName): Double = {
    if (gdext.classes.XRController3D.mb_get_float == null) gdext.classes.XRController3D.mb_get_float = MethodBind.get("XRController3D", "get_float", 2349060816L)
    Ptrcall.call1[gdext.builtin.StringName, Double](gdext.classes.XRController3D.mb_get_float, livePtr, name)
  }

  /** XRController3D.get_vector2 */
  final def getVector2(name: gdext.builtin.StringName): gdext.builtin.Vector2 = {
    if (gdext.classes.XRController3D.mb_get_vector2 == null) gdext.classes.XRController3D.mb_get_vector2 = MethodBind.get("XRController3D", "get_vector2", 3100822709L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.Vector2](gdext.classes.XRController3D.mb_get_vector2, livePtr, name)
  }

  /** XRController3D.get_tracker_hand */
  final def getTrackerHand(): Long = {
    if (gdext.classes.XRController3D.mb_get_tracker_hand == null) gdext.classes.XRController3D.mb_get_tracker_hand = MethodBind.get("XRController3D", "get_tracker_hand", 4181770860L)
    Ptrcall.call0[Long](gdext.classes.XRController3D.mb_get_tracker_hand, livePtr)
  }

}

object XRController3D {
  private[classes] var mb_is_button_pressed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_float: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vector2: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_tracker_hand: GDExtensionMethodBindPtr = null
}
