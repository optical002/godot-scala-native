package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GrooveJoint2D`, extends `Joint2D`. */
abstract class GrooveJoint2D extends Joint2D {
  override def godotClassName: String = "GrooveJoint2D"

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
