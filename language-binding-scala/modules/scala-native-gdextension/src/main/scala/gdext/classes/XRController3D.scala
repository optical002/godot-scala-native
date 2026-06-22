package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `XRController3D`, extends `XRNode3D`. */
abstract class XRController3D extends XRNode3D {

  /** XRController3D.is_button_pressed */
  final def isButtonPressed(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("XRController3D", "is_button_pressed", 2619796661L), hostObject.objectPtr, name)

  /** XRController3D.get_float */
  final def getFloat(name: gdext.builtin.StringName): Double =
    Ptrcall.call1[gdext.builtin.StringName, Double](MethodBind.get("XRController3D", "get_float", 2349060816L), hostObject.objectPtr, name)

  /** XRController3D.get_vector2 */
  final def getVector2(name: gdext.builtin.StringName): gdext.builtin.Vector2 =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.Vector2](MethodBind.get("XRController3D", "get_vector2", 3100822709L), hostObject.objectPtr, name)

  /** XRController3D.get_tracker_hand */
  final def getTrackerHand(): Long =
    Ptrcall.call0[Long](MethodBind.get("XRController3D", "get_tracker_hand", 4181770860L), hostObject.objectPtr)

}

object XRController3D {
  /** Class metadata for Gd[XRController3D] lifetime management and casting. */
  given GodotClass[XRController3D] with {
    def className = "XRController3D"
    def isRefCounted = false
    def wrap(o: GodotObject): XRController3D = new XRController3D {}.withHost(o.objectPtr)
    def unwrap(t: XRController3D): GodotObject = t.hostObject
  }
}
