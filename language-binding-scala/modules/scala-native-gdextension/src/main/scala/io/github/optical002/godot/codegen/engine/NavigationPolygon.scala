package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationPolygon`, extends `Resource`. */
abstract class NavigationPolygon extends Resource {

  /** NavigationPolygon.get_polygon_count */
  final def getPolygonCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_polygon_count", 3905245786L), hostObject.objectPtr)

  /** NavigationPolygon.clear_polygons */
  final def clearPolygons(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPolygon", "clear_polygons", 3218959716L), hostObject.objectPtr)

  /** NavigationPolygon.get_navigation_mesh */
  final def getNavigationMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NavigationPolygon", "get_navigation_mesh", 330232164L), hostObject.objectPtr)

  /** NavigationPolygon.get_outline_count */
  final def getOutlineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_outline_count", 3905245786L), hostObject.objectPtr)

  /** NavigationPolygon.remove_outline */
  final def removeOutline(idx: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "remove_outline", 1286410249L), hostObject.objectPtr, idx)

  /** NavigationPolygon.clear_outlines */
  final def clearOutlines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPolygon", "clear_outlines", 3218959716L), hostObject.objectPtr)

  /** NavigationPolygon.make_polygons_from_outlines */
  final def makePolygonsFromOutlines(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPolygon", "make_polygons_from_outlines", 3218959716L), hostObject.objectPtr)

  /** NavigationPolygon.set_cell_size */
  final def setCellSize(cell_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_cell_size", 373806689L), hostObject.objectPtr, cell_size)

  /** NavigationPolygon.get_cell_size */
  final def getCellSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPolygon", "get_cell_size", 1740695150L), hostObject.objectPtr)

  /** NavigationPolygon.set_border_size */
  final def setBorderSize(border_size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_border_size", 373806689L), hostObject.objectPtr, border_size)

  /** NavigationPolygon.get_border_size */
  final def getBorderSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPolygon", "get_border_size", 1740695150L), hostObject.objectPtr)

  /** NavigationPolygon.set_sample_partition_type */
  final def setSamplePartitionType(sample_partition_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_sample_partition_type", 2441478482L), hostObject.objectPtr, sample_partition_type)

  /** NavigationPolygon.get_sample_partition_type */
  final def getSamplePartitionType(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_sample_partition_type", 3887422851L), hostObject.objectPtr)

  /** NavigationPolygon.set_parsed_geometry_type */
  final def setParsedGeometryType(geometry_type: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_parsed_geometry_type", 2507971764L), hostObject.objectPtr, geometry_type)

  /** NavigationPolygon.get_parsed_geometry_type */
  final def getParsedGeometryType(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_parsed_geometry_type", 1073219508L), hostObject.objectPtr)

  /** NavigationPolygon.set_parsed_collision_mask */
  final def setParsedCollisionMask(mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_parsed_collision_mask", 1286410249L), hostObject.objectPtr, mask)

  /** NavigationPolygon.get_parsed_collision_mask */
  final def getParsedCollisionMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_parsed_collision_mask", 3905245786L), hostObject.objectPtr)

  /** NavigationPolygon.set_parsed_collision_mask_value */
  final def setParsedCollisionMaskValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationPolygon", "set_parsed_collision_mask_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationPolygon.get_parsed_collision_mask_value */
  final def getParsedCollisionMaskValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationPolygon", "get_parsed_collision_mask_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationPolygon.set_source_geometry_mode */
  final def setSourceGeometryMode(geometry_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_source_geometry_mode", 4002316705L), hostObject.objectPtr, geometry_mode)

  /** NavigationPolygon.get_source_geometry_mode */
  final def getSourceGeometryMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationPolygon", "get_source_geometry_mode", 459686762L), hostObject.objectPtr)

  /** NavigationPolygon.set_source_geometry_group_name */
  final def setSourceGeometryGroupName(group_name: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_source_geometry_group_name", 3304788590L), hostObject.objectPtr, group_name)

  /** NavigationPolygon.get_source_geometry_group_name */
  final def getSourceGeometryGroupName(): io.github.optical002.godot.builtin.StringName =
    Ptrcall.call0[io.github.optical002.godot.builtin.StringName](MethodBind.get("NavigationPolygon", "get_source_geometry_group_name", 2002593661L), hostObject.objectPtr)

  /** NavigationPolygon.set_agent_radius */
  final def setAgentRadius(agent_radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_agent_radius", 373806689L), hostObject.objectPtr, agent_radius)

  /** NavigationPolygon.get_agent_radius */
  final def getAgentRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationPolygon", "get_agent_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationPolygon.set_baking_rect */
  final def setBakingRect(rect: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_baking_rect", 2046264180L), hostObject.objectPtr, rect)

  /** NavigationPolygon.get_baking_rect */
  final def getBakingRect(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("NavigationPolygon", "get_baking_rect", 1639390495L), hostObject.objectPtr)

  /** NavigationPolygon.set_baking_rect_offset */
  final def setBakingRectOffset(rect_offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationPolygon", "set_baking_rect_offset", 743155724L), hostObject.objectPtr, rect_offset)

  /** NavigationPolygon.get_baking_rect_offset */
  final def getBakingRectOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("NavigationPolygon", "get_baking_rect_offset", 3341600327L), hostObject.objectPtr)

  /** NavigationPolygon.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("NavigationPolygon", "clear", 3218959716L), hostObject.objectPtr)

}

object NavigationPolygon {
  /** Class metadata for Gd[NavigationPolygon] lifetime management and casting. */
  given GodotClass[NavigationPolygon] with {
    def className = "NavigationPolygon"
    def isRefCounted = true
    def wrap(o: GodotObject): NavigationPolygon = new NavigationPolygon {}.withHost(o.objectPtr)
    def unwrap(t: NavigationPolygon): GodotObject = t.hostObject
  }
}
