package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Joint2D`, extends `Node2D`. */
abstract class Joint2D extends Node2D {

  /** Joint2D.set_bias */
  final def setBias(bias: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Joint2D", "set_bias", 373806689L), hostObject.objectPtr, bias)

  /** Joint2D.get_bias */
  final def getBias(): Double =
    Ptrcall.call0[Double](MethodBind.get("Joint2D", "get_bias", 1740695150L), hostObject.objectPtr)

  /** Joint2D.set_exclude_nodes_from_collision */
  final def setExcludeNodesFromCollision(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Joint2D", "set_exclude_nodes_from_collision", 2586408642L), hostObject.objectPtr, enable)

  /** Joint2D.get_exclude_nodes_from_collision */
  final def getExcludeNodesFromCollision(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Joint2D", "get_exclude_nodes_from_collision", 36873697L), hostObject.objectPtr)

}

object Joint2D {
  /** Class metadata for Gd[Joint2D] lifetime management and casting. */
  given GodotClass[Joint2D] with {
    def className = "Joint2D"
    def isRefCounted = false
    def wrap(o: GodotObject): Joint2D = new Joint2D {}.withHost(o.objectPtr)
    def unwrap(t: Joint2D): GodotObject = t.hostObject
  }
}
