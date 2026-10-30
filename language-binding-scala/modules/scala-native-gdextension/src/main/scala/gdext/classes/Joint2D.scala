package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Joint2D`, extends `Node2D`. */
abstract class Joint2D extends Node2D {
  override def godotClassName: String = "Joint2D"

  /** Joint2D.set_bias */
  final def setBias(bias: Double): Unit = {
    if (gdext.classes.Joint2D.mb_set_bias == null) gdext.classes.Joint2D.mb_set_bias = MethodBind.get("Joint2D", "set_bias", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Joint2D.mb_set_bias, livePtr, bias)
  }

  /** Joint2D.get_bias */
  final def getBias(): Double = {
    if (gdext.classes.Joint2D.mb_get_bias == null) gdext.classes.Joint2D.mb_get_bias = MethodBind.get("Joint2D", "get_bias", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Joint2D.mb_get_bias, livePtr)
  }

  /** Joint2D.set_exclude_nodes_from_collision */
  final def setExcludeNodesFromCollision(enable: Boolean): Unit = {
    if (gdext.classes.Joint2D.mb_set_exclude_nodes_from_collision == null) gdext.classes.Joint2D.mb_set_exclude_nodes_from_collision = MethodBind.get("Joint2D", "set_exclude_nodes_from_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Joint2D.mb_set_exclude_nodes_from_collision, livePtr, enable)
  }

  /** Joint2D.get_exclude_nodes_from_collision */
  final def getExcludeNodesFromCollision(): Boolean = {
    if (gdext.classes.Joint2D.mb_get_exclude_nodes_from_collision == null) gdext.classes.Joint2D.mb_get_exclude_nodes_from_collision = MethodBind.get("Joint2D", "get_exclude_nodes_from_collision", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Joint2D.mb_get_exclude_nodes_from_collision, livePtr)
  }

}

object Joint2D {
  private[classes] var mb_set_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bias: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclude_nodes_from_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_exclude_nodes_from_collision: GDExtensionMethodBindPtr = null
}
