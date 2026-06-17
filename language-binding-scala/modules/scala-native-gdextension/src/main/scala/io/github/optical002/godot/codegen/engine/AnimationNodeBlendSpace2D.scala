package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeBlendSpace2D`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendSpace2D extends AnimationRootNode {

  /** AnimationNodeBlendSpace2D.add_blend_point */
  final def addBlendPoint(node: AnimationRootNode, pos: io.github.optical002.godot.builtin.Vector2, at_index: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("AnimationNodeBlendSpace2D", "add_blend_point", 402261981L), hostObject.objectPtr, node.hostObject, pos, at_index)

  /** AnimationNodeBlendSpace2D.set_blend_point_position */
  final def setBlendPointPosition(point: Long, pos: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_point_position", 163021252L), hostObject.objectPtr, point, pos)

  /** AnimationNodeBlendSpace2D.get_blend_point_position */
  final def getBlendPointPosition(point: Long): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call1[Long, io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_position", 2299179447L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace2D.set_blend_point_node */
  final def setBlendPointNode(point: Long, node: AnimationRootNode): Unit =
    Ptrcall.callVoid2(MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_point_node", 4240341528L), hostObject.objectPtr, point, node.hostObject)

  /** AnimationNodeBlendSpace2D.get_blend_point_node */
  final def getBlendPointNode(point: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_node", 665599029L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace2D.remove_blend_point */
  final def removeBlendPoint(point: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "remove_blend_point", 1286410249L), hostObject.objectPtr, point)

  /** AnimationNodeBlendSpace2D.get_blend_point_count */
  final def getBlendPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_count", 3905245786L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.add_triangle */
  final def addTriangle(x: Long, y: Long, z: Long, at_index: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("AnimationNodeBlendSpace2D", "add_triangle", 753017335L), hostObject.objectPtr, x, y, z, at_index)

  /** AnimationNodeBlendSpace2D.get_triangle_point */
  final def getTrianglePoint(triangle: Long, point: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("AnimationNodeBlendSpace2D", "get_triangle_point", 50157827L), hostObject.objectPtr, triangle, point)

  /** AnimationNodeBlendSpace2D.remove_triangle */
  final def removeTriangle(triangle: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "remove_triangle", 1286410249L), hostObject.objectPtr, triangle)

  /** AnimationNodeBlendSpace2D.get_triangle_count */
  final def getTriangleCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeBlendSpace2D", "get_triangle_count", 3905245786L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_min_space */
  final def setMinSpace(min_space: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_min_space", 743155724L), hostObject.objectPtr, min_space)

  /** AnimationNodeBlendSpace2D.get_min_space */
  final def getMinSpace(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendSpace2D", "get_min_space", 3341600327L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_max_space */
  final def setMaxSpace(max_space: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_max_space", 743155724L), hostObject.objectPtr, max_space)

  /** AnimationNodeBlendSpace2D.get_max_space */
  final def getMaxSpace(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendSpace2D", "get_max_space", 3341600327L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_snap */
  final def setSnap(snap: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_snap", 743155724L), hostObject.objectPtr, snap)

  /** AnimationNodeBlendSpace2D.get_snap */
  final def getSnap(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("AnimationNodeBlendSpace2D", "get_snap", 3341600327L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_x_label */
  final def setXLabel(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_x_label", 83702148L), hostObject.objectPtr, text)

  /** AnimationNodeBlendSpace2D.get_x_label */
  final def getXLabel(): String =
    Ptrcall.call0[String](MethodBind.get("AnimationNodeBlendSpace2D", "get_x_label", 201670096L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_y_label */
  final def setYLabel(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_y_label", 83702148L), hostObject.objectPtr, text)

  /** AnimationNodeBlendSpace2D.get_y_label */
  final def getYLabel(): String =
    Ptrcall.call0[String](MethodBind.get("AnimationNodeBlendSpace2D", "get_y_label", 201670096L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_auto_triangles */
  final def setAutoTriangles(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_auto_triangles", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeBlendSpace2D.get_auto_triangles */
  final def getAutoTriangles(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeBlendSpace2D", "get_auto_triangles", 36873697L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_blend_mode */
  final def setBlendMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_mode", 81193520L), hostObject.objectPtr, mode)

  /** AnimationNodeBlendSpace2D.get_blend_mode */
  final def getBlendMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_mode", 1398433632L), hostObject.objectPtr)

  /** AnimationNodeBlendSpace2D.set_use_sync */
  final def setUseSync(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeBlendSpace2D", "set_use_sync", 2586408642L), hostObject.objectPtr, enable)

  /** AnimationNodeBlendSpace2D.is_using_sync */
  final def isUsingSync(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeBlendSpace2D", "is_using_sync", 36873697L), hostObject.objectPtr)

}

object AnimationNodeBlendSpace2D {
  /** Class metadata for Gd[AnimationNodeBlendSpace2D] lifetime management and casting. */
  given GodotClass[AnimationNodeBlendSpace2D] with {
    def className = "AnimationNodeBlendSpace2D"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeBlendSpace2D = new AnimationNodeBlendSpace2D {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeBlendSpace2D): GodotObject = t.hostObject
  }
}
