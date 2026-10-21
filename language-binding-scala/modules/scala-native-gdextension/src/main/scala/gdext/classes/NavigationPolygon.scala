package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationPolygon`, extends `Resource`. */
abstract class NavigationPolygon extends Resource {
  override def godotClassName: String = "NavigationPolygon"

  /** NavigationPolygon.get_polygon_count */
  final def getPolygonCount(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_polygon_count == null) gdext.classes.NavigationPolygon.mb_get_polygon_count = MethodBind.get("NavigationPolygon", "get_polygon_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_polygon_count, livePtr)
  }

  /** NavigationPolygon.clear_polygons */
  final def clearPolygons(): Unit = {
    if (gdext.classes.NavigationPolygon.mb_clear_polygons == null) gdext.classes.NavigationPolygon.mb_clear_polygons = MethodBind.get("NavigationPolygon", "clear_polygons", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPolygon.mb_clear_polygons, livePtr)
  }

  /** NavigationPolygon.get_navigation_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNavigationMesh(): NavigationMesh = {
    if (gdext.classes.NavigationPolygon.mb_get_navigation_mesh == null) gdext.classes.NavigationPolygon.mb_get_navigation_mesh = MethodBind.get("NavigationPolygon", "get_navigation_mesh", 330232164L)
    Wrappers.owned[NavigationMesh](Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_navigation_mesh, livePtr))
  }

  /** NavigationPolygon.get_outline_count */
  final def getOutlineCount(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_outline_count == null) gdext.classes.NavigationPolygon.mb_get_outline_count = MethodBind.get("NavigationPolygon", "get_outline_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_outline_count, livePtr)
  }

  /** NavigationPolygon.remove_outline */
  final def removeOutline(idx: Long): Unit = {
    if (gdext.classes.NavigationPolygon.mb_remove_outline == null) gdext.classes.NavigationPolygon.mb_remove_outline = MethodBind.get("NavigationPolygon", "remove_outline", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_remove_outline, livePtr, idx)
  }

  /** NavigationPolygon.clear_outlines */
  final def clearOutlines(): Unit = {
    if (gdext.classes.NavigationPolygon.mb_clear_outlines == null) gdext.classes.NavigationPolygon.mb_clear_outlines = MethodBind.get("NavigationPolygon", "clear_outlines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPolygon.mb_clear_outlines, livePtr)
  }

  /** NavigationPolygon.make_polygons_from_outlines */
  final def makePolygonsFromOutlines(): Unit = {
    if (gdext.classes.NavigationPolygon.mb_make_polygons_from_outlines == null) gdext.classes.NavigationPolygon.mb_make_polygons_from_outlines = MethodBind.get("NavigationPolygon", "make_polygons_from_outlines", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPolygon.mb_make_polygons_from_outlines, livePtr)
  }

  /** NavigationPolygon.set_cell_size */
  final def setCellSize(cell_size: Double): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_cell_size == null) gdext.classes.NavigationPolygon.mb_set_cell_size = MethodBind.get("NavigationPolygon", "set_cell_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_cell_size, livePtr, cell_size)
  }

  /** NavigationPolygon.get_cell_size */
  final def getCellSize(): Double = {
    if (gdext.classes.NavigationPolygon.mb_get_cell_size == null) gdext.classes.NavigationPolygon.mb_get_cell_size = MethodBind.get("NavigationPolygon", "get_cell_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPolygon.mb_get_cell_size, livePtr)
  }

  /** NavigationPolygon.set_border_size */
  final def setBorderSize(border_size: Double): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_border_size == null) gdext.classes.NavigationPolygon.mb_set_border_size = MethodBind.get("NavigationPolygon", "set_border_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_border_size, livePtr, border_size)
  }

  /** NavigationPolygon.get_border_size */
  final def getBorderSize(): Double = {
    if (gdext.classes.NavigationPolygon.mb_get_border_size == null) gdext.classes.NavigationPolygon.mb_get_border_size = MethodBind.get("NavigationPolygon", "get_border_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPolygon.mb_get_border_size, livePtr)
  }

  /** NavigationPolygon.set_sample_partition_type */
  final def setSamplePartitionType(sample_partition_type: Long): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_sample_partition_type == null) gdext.classes.NavigationPolygon.mb_set_sample_partition_type = MethodBind.get("NavigationPolygon", "set_sample_partition_type", 2441478482L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_sample_partition_type, livePtr, sample_partition_type)
  }

  /** NavigationPolygon.get_sample_partition_type */
  final def getSamplePartitionType(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_sample_partition_type == null) gdext.classes.NavigationPolygon.mb_get_sample_partition_type = MethodBind.get("NavigationPolygon", "get_sample_partition_type", 3887422851L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_sample_partition_type, livePtr)
  }

  /** NavigationPolygon.set_parsed_geometry_type */
  final def setParsedGeometryType(geometry_type: Long): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_parsed_geometry_type == null) gdext.classes.NavigationPolygon.mb_set_parsed_geometry_type = MethodBind.get("NavigationPolygon", "set_parsed_geometry_type", 2507971764L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_parsed_geometry_type, livePtr, geometry_type)
  }

  /** NavigationPolygon.get_parsed_geometry_type */
  final def getParsedGeometryType(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_parsed_geometry_type == null) gdext.classes.NavigationPolygon.mb_get_parsed_geometry_type = MethodBind.get("NavigationPolygon", "get_parsed_geometry_type", 1073219508L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_parsed_geometry_type, livePtr)
  }

  /** NavigationPolygon.set_parsed_collision_mask */
  final def setParsedCollisionMask(mask: Long): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask == null) gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask = MethodBind.get("NavigationPolygon", "set_parsed_collision_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask, livePtr, mask)
  }

  /** NavigationPolygon.get_parsed_collision_mask */
  final def getParsedCollisionMask(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask == null) gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask = MethodBind.get("NavigationPolygon", "get_parsed_collision_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask, livePtr)
  }

  /** NavigationPolygon.set_parsed_collision_mask_value */
  final def setParsedCollisionMaskValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask_value == null) gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask_value = MethodBind.get("NavigationPolygon", "set_parsed_collision_mask_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationPolygon.mb_set_parsed_collision_mask_value, livePtr, layer_number, value)
  }

  /** NavigationPolygon.get_parsed_collision_mask_value */
  final def getParsedCollisionMaskValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask_value == null) gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask_value = MethodBind.get("NavigationPolygon", "get_parsed_collision_mask_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationPolygon.mb_get_parsed_collision_mask_value, livePtr, layer_number)
  }

  /** NavigationPolygon.set_source_geometry_mode */
  final def setSourceGeometryMode(geometry_mode: Long): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_source_geometry_mode == null) gdext.classes.NavigationPolygon.mb_set_source_geometry_mode = MethodBind.get("NavigationPolygon", "set_source_geometry_mode", 4002316705L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_source_geometry_mode, livePtr, geometry_mode)
  }

  /** NavigationPolygon.get_source_geometry_mode */
  final def getSourceGeometryMode(): Long = {
    if (gdext.classes.NavigationPolygon.mb_get_source_geometry_mode == null) gdext.classes.NavigationPolygon.mb_get_source_geometry_mode = MethodBind.get("NavigationPolygon", "get_source_geometry_mode", 459686762L)
    Ptrcall.call0[Long](gdext.classes.NavigationPolygon.mb_get_source_geometry_mode, livePtr)
  }

  /** NavigationPolygon.set_source_geometry_group_name */
  final def setSourceGeometryGroupName(group_name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_source_geometry_group_name == null) gdext.classes.NavigationPolygon.mb_set_source_geometry_group_name = MethodBind.get("NavigationPolygon", "set_source_geometry_group_name", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_source_geometry_group_name, livePtr, group_name)
  }

  /** NavigationPolygon.get_source_geometry_group_name */
  final def getSourceGeometryGroupName(): gdext.builtin.StringName = {
    if (gdext.classes.NavigationPolygon.mb_get_source_geometry_group_name == null) gdext.classes.NavigationPolygon.mb_get_source_geometry_group_name = MethodBind.get("NavigationPolygon", "get_source_geometry_group_name", 2002593661L)
    Ptrcall.call0[gdext.builtin.StringName](gdext.classes.NavigationPolygon.mb_get_source_geometry_group_name, livePtr)
  }

  /** NavigationPolygon.set_agent_radius */
  final def setAgentRadius(agent_radius: Double): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_agent_radius == null) gdext.classes.NavigationPolygon.mb_set_agent_radius = MethodBind.get("NavigationPolygon", "set_agent_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_agent_radius, livePtr, agent_radius)
  }

  /** NavigationPolygon.get_agent_radius */
  final def getAgentRadius(): Double = {
    if (gdext.classes.NavigationPolygon.mb_get_agent_radius == null) gdext.classes.NavigationPolygon.mb_get_agent_radius = MethodBind.get("NavigationPolygon", "get_agent_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationPolygon.mb_get_agent_radius, livePtr)
  }

  /** NavigationPolygon.set_baking_rect */
  final def setBakingRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_baking_rect == null) gdext.classes.NavigationPolygon.mb_set_baking_rect = MethodBind.get("NavigationPolygon", "set_baking_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_baking_rect, livePtr, rect)
  }

  /** NavigationPolygon.get_baking_rect */
  final def getBakingRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.NavigationPolygon.mb_get_baking_rect == null) gdext.classes.NavigationPolygon.mb_get_baking_rect = MethodBind.get("NavigationPolygon", "get_baking_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.NavigationPolygon.mb_get_baking_rect, livePtr)
  }

  /** NavigationPolygon.set_baking_rect_offset */
  final def setBakingRectOffset(rect_offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationPolygon.mb_set_baking_rect_offset == null) gdext.classes.NavigationPolygon.mb_set_baking_rect_offset = MethodBind.get("NavigationPolygon", "set_baking_rect_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationPolygon.mb_set_baking_rect_offset, livePtr, rect_offset)
  }

  /** NavigationPolygon.get_baking_rect_offset */
  final def getBakingRectOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationPolygon.mb_get_baking_rect_offset == null) gdext.classes.NavigationPolygon.mb_get_baking_rect_offset = MethodBind.get("NavigationPolygon", "get_baking_rect_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationPolygon.mb_get_baking_rect_offset, livePtr)
  }

  /** NavigationPolygon.clear */
  final def clear(): Unit = {
    if (gdext.classes.NavigationPolygon.mb_clear == null) gdext.classes.NavigationPolygon.mb_clear = MethodBind.get("NavigationPolygon", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.NavigationPolygon.mb_clear, livePtr)
  }

}

object NavigationPolygon {
  private[classes] var mb_get_polygon_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_polygons: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_outlines: GDExtensionMethodBindPtr = null
  private[classes] var mb_make_polygons_from_outlines: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cell_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_border_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_border_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sample_partition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sample_partition_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parsed_geometry_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parsed_geometry_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parsed_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parsed_collision_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_parsed_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_parsed_collision_mask_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_geometry_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_geometry_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_source_geometry_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source_geometry_group_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_agent_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_agent_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_baking_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_baking_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_baking_rect_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_baking_rect_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
}
