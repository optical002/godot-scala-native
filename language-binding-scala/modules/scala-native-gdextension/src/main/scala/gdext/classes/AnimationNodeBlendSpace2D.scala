package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationNodeBlendSpace2D`, extends `AnimationRootNode`. */
abstract class AnimationNodeBlendSpace2D extends AnimationRootNode {
  override def godotClassName: String = "AnimationNodeBlendSpace2D"

  /** AnimationNodeBlendSpace2D.add_blend_point */
  final def addBlendPoint(node: AnimationRootNode, pos: gdext.builtin.Vector2, atIndex: Long = -1L): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_add_blend_point == null) gdext.classes.AnimationNodeBlendSpace2D.mb_add_blend_point = MethodBind.get("AnimationNodeBlendSpace2D", "add_blend_point", 402261981L)
    Ptrcall.callVoid3(gdext.classes.AnimationNodeBlendSpace2D.mb_add_blend_point, livePtr, Wrappers.handle(node), pos, atIndex)
  }

  /** AnimationNodeBlendSpace2D.set_blend_point_position */
  final def setBlendPointPosition(point: Long, pos: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_position == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_position = MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_point_position", 163021252L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_position, livePtr, point, pos)
  }

  /** AnimationNodeBlendSpace2D.get_blend_point_position */
  final def getBlendPointPosition(point: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_position == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_position = MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_position", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_position, livePtr, point)
  }

  /** AnimationNodeBlendSpace2D.set_blend_point_node */
  final def setBlendPointNode(point: Long, node: AnimationRootNode): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_node == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_node = MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_point_node", 4240341528L)
    Ptrcall.callVoid2(gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_point_node, livePtr, point, Wrappers.handle(node))
  }

  /** AnimationNodeBlendSpace2D.get_blend_point_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getBlendPointNode(point: Long): AnimationRootNode = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_node == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_node = MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_node", 665599029L)
    Wrappers.owned[AnimationRootNode](Ptrcall.call1[Long, Long](gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_node, livePtr, point))
  }

  /** AnimationNodeBlendSpace2D.remove_blend_point */
  final def removeBlendPoint(point: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_remove_blend_point == null) gdext.classes.AnimationNodeBlendSpace2D.mb_remove_blend_point = MethodBind.get("AnimationNodeBlendSpace2D", "remove_blend_point", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_remove_blend_point, livePtr, point)
  }

  /** AnimationNodeBlendSpace2D.get_blend_point_count */
  final def getBlendPointCount(): Long = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_count == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_count = MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_point_count, livePtr)
  }

  /** AnimationNodeBlendSpace2D.add_triangle */
  final def addTriangle(x: Long, y: Long, z: Long, atIndex: Long = -1L): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_add_triangle == null) gdext.classes.AnimationNodeBlendSpace2D.mb_add_triangle = MethodBind.get("AnimationNodeBlendSpace2D", "add_triangle", 753017335L)
    Ptrcall.callVoid4(gdext.classes.AnimationNodeBlendSpace2D.mb_add_triangle, livePtr, x, y, z, atIndex)
  }

  /** AnimationNodeBlendSpace2D.get_triangle_point */
  final def getTrianglePoint(triangle: Long, point: Long): Long = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_point == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_point = MethodBind.get("AnimationNodeBlendSpace2D", "get_triangle_point", 50157827L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_point, livePtr, triangle, point)
  }

  /** AnimationNodeBlendSpace2D.remove_triangle */
  final def removeTriangle(triangle: Long): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_remove_triangle == null) gdext.classes.AnimationNodeBlendSpace2D.mb_remove_triangle = MethodBind.get("AnimationNodeBlendSpace2D", "remove_triangle", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_remove_triangle, livePtr, triangle)
  }

  /** AnimationNodeBlendSpace2D.get_triangle_count */
  final def getTriangleCount(): Long = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_count == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_count = MethodBind.get("AnimationNodeBlendSpace2D", "get_triangle_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationNodeBlendSpace2D.mb_get_triangle_count, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_min_space */
  final def setMinSpace(minSpace: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_min_space == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_min_space = MethodBind.get("AnimationNodeBlendSpace2D", "set_min_space", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_min_space, livePtr, minSpace)
  }

  /** AnimationNodeBlendSpace2D.get_min_space */
  final def getMinSpace(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_min_space == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_min_space = MethodBind.get("AnimationNodeBlendSpace2D", "get_min_space", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendSpace2D.mb_get_min_space, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_max_space */
  final def setMaxSpace(maxSpace: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_max_space == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_max_space = MethodBind.get("AnimationNodeBlendSpace2D", "set_max_space", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_max_space, livePtr, maxSpace)
  }

  /** AnimationNodeBlendSpace2D.get_max_space */
  final def getMaxSpace(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_max_space == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_max_space = MethodBind.get("AnimationNodeBlendSpace2D", "get_max_space", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendSpace2D.mb_get_max_space, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_snap */
  final def setSnap(snap: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_snap == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_snap = MethodBind.get("AnimationNodeBlendSpace2D", "set_snap", 743155724L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_snap, livePtr, snap)
  }

  /** AnimationNodeBlendSpace2D.get_snap */
  final def getSnap(): gdext.builtin.Vector2 = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_snap == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_snap = MethodBind.get("AnimationNodeBlendSpace2D", "get_snap", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.AnimationNodeBlendSpace2D.mb_get_snap, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_x_label */
  final def setXLabel(text: String): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_x_label == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_x_label = MethodBind.get("AnimationNodeBlendSpace2D", "set_x_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_x_label, livePtr, text)
  }

  /** AnimationNodeBlendSpace2D.get_x_label */
  final def getXLabel(): String = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_x_label == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_x_label = MethodBind.get("AnimationNodeBlendSpace2D", "get_x_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimationNodeBlendSpace2D.mb_get_x_label, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_y_label */
  final def setYLabel(text: String): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_y_label == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_y_label = MethodBind.get("AnimationNodeBlendSpace2D", "set_y_label", 83702148L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_y_label, livePtr, text)
  }

  /** AnimationNodeBlendSpace2D.get_y_label */
  final def getYLabel(): String = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_y_label == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_y_label = MethodBind.get("AnimationNodeBlendSpace2D", "get_y_label", 201670096L)
    Ptrcall.call0[String](gdext.classes.AnimationNodeBlendSpace2D.mb_get_y_label, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_auto_triangles */
  final def setAutoTriangles(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_auto_triangles == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_auto_triangles = MethodBind.get("AnimationNodeBlendSpace2D", "set_auto_triangles", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_auto_triangles, livePtr, enable)
  }

  /** AnimationNodeBlendSpace2D.get_auto_triangles */
  final def getAutoTriangles(): Boolean = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_auto_triangles == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_auto_triangles = MethodBind.get("AnimationNodeBlendSpace2D", "get_auto_triangles", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeBlendSpace2D.mb_get_auto_triangles, livePtr)
  }

  /** AnimationNodeBlendSpace2D.set_blend_mode */
  final def setBlendMode(mode: gdext.classes.AnimationNodeBlendSpace2D.BlendMode): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_mode == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_mode = MethodBind.get("AnimationNodeBlendSpace2D", "set_blend_mode", 81193520L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_blend_mode, livePtr, mode)
  }

  /** AnimationNodeBlendSpace2D.get_blend_mode */
  final def getBlendMode(): gdext.classes.AnimationNodeBlendSpace2D.BlendMode = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_mode == null) gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_mode = MethodBind.get("AnimationNodeBlendSpace2D", "get_blend_mode", 1398433632L)
    gdext.classes.AnimationNodeBlendSpace2D.BlendMode(Ptrcall.call0[Long](gdext.classes.AnimationNodeBlendSpace2D.mb_get_blend_mode, livePtr))
  }

  /** AnimationNodeBlendSpace2D.set_use_sync */
  final def setUseSync(enable: Boolean): Unit = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_set_use_sync == null) gdext.classes.AnimationNodeBlendSpace2D.mb_set_use_sync = MethodBind.get("AnimationNodeBlendSpace2D", "set_use_sync", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AnimationNodeBlendSpace2D.mb_set_use_sync, livePtr, enable)
  }

  /** AnimationNodeBlendSpace2D.is_using_sync */
  final def isUsingSync(): Boolean = {
    if (gdext.classes.AnimationNodeBlendSpace2D.mb_is_using_sync == null) gdext.classes.AnimationNodeBlendSpace2D.mb_is_using_sync = MethodBind.get("AnimationNodeBlendSpace2D", "is_using_sync", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AnimationNodeBlendSpace2D.mb_is_using_sync, livePtr)
  }

}

object AnimationNodeBlendSpace2D {
  private[classes] var mb_add_blend_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_point_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_blend_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_triangle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_triangle_point: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_triangle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_triangle_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_space: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_snap: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_x_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_x_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_y_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_y_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_triangles: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_auto_triangles: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_blend_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_sync: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_sync: GDExtensionMethodBindPtr = null

  /** Godot enum `AnimationNodeBlendSpace2D.BlendMode`. */
  opaque type BlendMode <: Long = Long

  object BlendMode {
    final val Interpolated: BlendMode = 0L.asInstanceOf[BlendMode]
    final val Discrete: BlendMode = 1L.asInstanceOf[BlendMode]
    final val DiscreteCarry: BlendMode = 2L.asInstanceOf[BlendMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): BlendMode = value.asInstanceOf[BlendMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[BlendMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[BlendMode]]

    extension (self: BlendMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Interpolated"
        case 1L => "Discrete"
        case 2L => "DiscreteCarry"
        case other => other.toString
      }
  }
}
