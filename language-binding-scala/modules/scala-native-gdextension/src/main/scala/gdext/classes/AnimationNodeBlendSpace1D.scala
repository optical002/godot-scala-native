package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlendSpace1D`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendSpace1D extends AnimationRootNode {

  /** AnimationNodeBlendSpace1D.add_blend_point */
  final def addBlendPoint(node: AnimationRootNode, pos: Double, at_index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendSpace1D", "add_blend_point", 285050433L), hostObject.objectPtr, node.hostObject, pos, at_index)

  /** AnimationNodeBlendSpace1D.set_blend_point_position */
  final def setBlendPointPosition(point: Long, pos: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_point_position", 1602489585L), hostObject.objectPtr, point, pos)

  /** AnimationNodeBlendSpace1D.get_blend_point_position */
  final def getBlendPointPosition(point: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_position", 2339986948L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace1D.set_blend_point_node */
  final def setBlendPointNode(point: Long, node: AnimationRootNode): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_point_node", 4240341528L), hostObject.objectPtr, point, node.hostObject)

  /** AnimationNodeBlendSpace1D.get_blend_point_node */
  final def getBlendPointNode(point: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_node", 665599029L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace1D.remove_blend_point */
  final def removeBlendPoint(point: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "remove_blend_point", 1286410249L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace1D.get_blend_point_count */
  final def getBlendPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_point_count", 3905245786L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_min_space */
  final def setMinSpace(min_space: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_min_space", 373806689L), hostObject.objectPtr, min_space)

  /** AnimationNodeBlendSpace1D.get_min_space */
  final def getMinSpace(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeBlendSpace1D", "get_min_space", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_max_space */
  final def setMaxSpace(max_space: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_max_space", 373806689L), hostObject.objectPtr, max_space)

  /** AnimationNodeBlendSpace1D.get_max_space */
  final def getMaxSpace(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeBlendSpace1D", "get_max_space", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_snap */
  final def setSnap(snap: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_snap", 373806689L), hostObject.objectPtr, snap)

  /** AnimationNodeBlendSpace1D.get_snap */
  final def getSnap(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeBlendSpace1D", "get_snap", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_value_label */
  final def setValueLabel(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_value_label", 83702148L), hostObject.objectPtr, text)

  /** AnimationNodeBlendSpace1D.get_value_label */
  final def getValueLabel(): String =
    Ptrcall.call0[String](MethodBind.get("AnimationNodeBlendSpace1D", "get_value_label", 201670096L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_blend_mode */
  final def setBlendMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_blend_mode", 2600869457L), hostObject.objectPtr, mode)

  /** AnimationNodeBlendSpace1D.get_blend_mode */
  final def getBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeBlendSpace1D", "get_blend_mode", 1547667849L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace1D.set_use_sync */
  final def setUseSync(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace1D", "set_use_sync", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeBlendSpace1D.is_using_sync */
  final def isUsingSync(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeBlendSpace1D", "is_using_sync", 36873697L), hostObject.objectPtr)

}

object AnimationNodeBlendSpace1D {
  /** Class metadata for Gd[AnimationNodeBlendSpace1D] lifetime management and casting. */
  given GodotClass[AnimationNodeBlendSpace1D] with {
    def className = "AnimationNodeBlendSpace1D"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlendSpace1D = new AnimationNodeBlendSpace1D {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlendSpace1D): GodotObject = t.hostObject
  }
}
