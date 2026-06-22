package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GrooveJoint2D`, extends `Joint2D`. */
abstract class GrooveJoint2D extends Joint2D {

  /** GrooveJoint2D.set_length */
  final def setLength(length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GrooveJoint2D", "set_length", 373806689L), hostObject.objectPtr, length)

  /** GrooveJoint2D.get_length */
  final def getLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("GrooveJoint2D", "get_length", 1740695150L), hostObject.objectPtr)

  /** GrooveJoint2D.set_initial_offset */
  final def setInitialOffset(offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GrooveJoint2D", "set_initial_offset", 373806689L), hostObject.objectPtr, offset)

  /** GrooveJoint2D.get_initial_offset */
  final def getInitialOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("GrooveJoint2D", "get_initial_offset", 1740695150L), hostObject.objectPtr)

}

object GrooveJoint2D {
  /** Class metadata for Gd[GrooveJoint2D] lifetime management and casting. */
  given GodotClass[GrooveJoint2D] with {
    def className = "GrooveJoint2D"
    def isRefCounted = false
    def wrap(o: GodotObject): GrooveJoint2D = new GrooveJoint2D {}.withHost(o.objectPtr)
    def unwrap(t: GrooveJoint2D): GodotObject = t.hostObject
  }
}
