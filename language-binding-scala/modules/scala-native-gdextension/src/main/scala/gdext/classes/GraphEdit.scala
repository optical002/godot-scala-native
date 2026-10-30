package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GraphEdit`, extends `Control`. */
abstract class GraphEdit extends Control {
  override def godotClassName: String = "GraphEdit"

  /** GraphEdit.connect_node */
  final def connectNode(fromNode: String, fromPort: Long, toNode: String, toPort: Long, keepAlive: Boolean = false): gdext.classes.Error = {
    if (gdext.classes.GraphEdit.mb_connect_node == null) gdext.classes.GraphEdit.mb_connect_node = MethodBind.get("GraphEdit", "connect_node", 1376144231L)
    gdext.classes.Error(Ptrcall.call5[SnArg, Long, SnArg, Long, Boolean, Long](gdext.classes.GraphEdit.mb_connect_node, livePtr, SnArg(fromNode), fromPort, SnArg(toNode), toPort, keepAlive))
  }

  /** GraphEdit.is_node_connected */
  final def isNodeConnected(fromNode: String, fromPort: Long, toNode: String, toPort: Long): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_node_connected == null) gdext.classes.GraphEdit.mb_is_node_connected = MethodBind.get("GraphEdit", "is_node_connected", 4216241294L)
    Ptrcall.call4[SnArg, Long, SnArg, Long, Boolean](gdext.classes.GraphEdit.mb_is_node_connected, livePtr, SnArg(fromNode), fromPort, SnArg(toNode), toPort)
  }

  /** GraphEdit.disconnect_node */
  final def disconnectNode(fromNode: String, fromPort: Long, toNode: String, toPort: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_disconnect_node == null) gdext.classes.GraphEdit.mb_disconnect_node = MethodBind.get("GraphEdit", "disconnect_node", 1933654315L)
    Ptrcall.callVoid4(gdext.classes.GraphEdit.mb_disconnect_node, livePtr, SnArg(fromNode), fromPort, SnArg(toNode), toPort)
  }

  /** GraphEdit.set_connection_activity */
  final def setConnectionActivity(fromNode: String, fromPort: Long, toNode: String, toPort: Long, amount: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_connection_activity == null) gdext.classes.GraphEdit.mb_set_connection_activity = MethodBind.get("GraphEdit", "set_connection_activity", 1141899943L)
    Ptrcall.callVoid5(gdext.classes.GraphEdit.mb_set_connection_activity, livePtr, SnArg(fromNode), fromPort, SnArg(toNode), toPort, amount)
  }

  /** GraphEdit.get_connection_count */
  final def getConnectionCount(fromNode: String, fromPort: Long): Long = {
    if (gdext.classes.GraphEdit.mb_get_connection_count == null) gdext.classes.GraphEdit.mb_get_connection_count = MethodBind.get("GraphEdit", "get_connection_count", 861718734L)
    Ptrcall.call2[SnArg, Long, Long](gdext.classes.GraphEdit.mb_get_connection_count, livePtr, SnArg(fromNode), fromPort)
  }

  /** GraphEdit.clear_connections */
  final def clearConnections(): Unit = {
    if (gdext.classes.GraphEdit.mb_clear_connections == null) gdext.classes.GraphEdit.mb_clear_connections = MethodBind.get("GraphEdit", "clear_connections", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GraphEdit.mb_clear_connections, livePtr)
  }

  /** GraphEdit.force_connection_drag_end */
  final def forceConnectionDragEnd(): Unit = {
    if (gdext.classes.GraphEdit.mb_force_connection_drag_end == null) gdext.classes.GraphEdit.mb_force_connection_drag_end = MethodBind.get("GraphEdit", "force_connection_drag_end", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GraphEdit.mb_force_connection_drag_end, livePtr)
  }

  /** GraphEdit.get_scroll_offset */
  final def getScrollOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.GraphEdit.mb_get_scroll_offset == null) gdext.classes.GraphEdit.mb_get_scroll_offset = MethodBind.get("GraphEdit", "get_scroll_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.GraphEdit.mb_get_scroll_offset, livePtr)
  }

  /** GraphEdit.set_scroll_offset */
  final def setScrollOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.GraphEdit.mb_set_scroll_offset == null) gdext.classes.GraphEdit.mb_set_scroll_offset = MethodBind.get("GraphEdit", "set_scroll_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_scroll_offset, livePtr, offset)
  }

  /** GraphEdit.add_valid_right_disconnect_type */
  final def addValidRightDisconnectType(`type`: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_add_valid_right_disconnect_type == null) gdext.classes.GraphEdit.mb_add_valid_right_disconnect_type = MethodBind.get("GraphEdit", "add_valid_right_disconnect_type", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_add_valid_right_disconnect_type, livePtr, `type`)
  }

  /** GraphEdit.remove_valid_right_disconnect_type */
  final def removeValidRightDisconnectType(`type`: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_remove_valid_right_disconnect_type == null) gdext.classes.GraphEdit.mb_remove_valid_right_disconnect_type = MethodBind.get("GraphEdit", "remove_valid_right_disconnect_type", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_remove_valid_right_disconnect_type, livePtr, `type`)
  }

  /** GraphEdit.add_valid_left_disconnect_type */
  final def addValidLeftDisconnectType(`type`: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_add_valid_left_disconnect_type == null) gdext.classes.GraphEdit.mb_add_valid_left_disconnect_type = MethodBind.get("GraphEdit", "add_valid_left_disconnect_type", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_add_valid_left_disconnect_type, livePtr, `type`)
  }

  /** GraphEdit.remove_valid_left_disconnect_type */
  final def removeValidLeftDisconnectType(`type`: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_remove_valid_left_disconnect_type == null) gdext.classes.GraphEdit.mb_remove_valid_left_disconnect_type = MethodBind.get("GraphEdit", "remove_valid_left_disconnect_type", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_remove_valid_left_disconnect_type, livePtr, `type`)
  }

  /** GraphEdit.add_valid_connection_type */
  final def addValidConnectionType(fromType: Long, toType: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_add_valid_connection_type == null) gdext.classes.GraphEdit.mb_add_valid_connection_type = MethodBind.get("GraphEdit", "add_valid_connection_type", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.GraphEdit.mb_add_valid_connection_type, livePtr, fromType, toType)
  }

  /** GraphEdit.remove_valid_connection_type */
  final def removeValidConnectionType(fromType: Long, toType: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_remove_valid_connection_type == null) gdext.classes.GraphEdit.mb_remove_valid_connection_type = MethodBind.get("GraphEdit", "remove_valid_connection_type", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.GraphEdit.mb_remove_valid_connection_type, livePtr, fromType, toType)
  }

  /** GraphEdit.is_valid_connection_type */
  final def isValidConnectionType(fromType: Long, toType: Long): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_valid_connection_type == null) gdext.classes.GraphEdit.mb_is_valid_connection_type = MethodBind.get("GraphEdit", "is_valid_connection_type", 2522259332L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.GraphEdit.mb_is_valid_connection_type, livePtr, fromType, toType)
  }

  /** GraphEdit.attach_graph_element_to_frame */
  final def attachGraphElementToFrame(element: String, frame: String): Unit = {
    if (gdext.classes.GraphEdit.mb_attach_graph_element_to_frame == null) gdext.classes.GraphEdit.mb_attach_graph_element_to_frame = MethodBind.get("GraphEdit", "attach_graph_element_to_frame", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.GraphEdit.mb_attach_graph_element_to_frame, livePtr, SnArg(element), SnArg(frame))
  }

  /** GraphEdit.detach_graph_element_from_frame */
  final def detachGraphElementFromFrame(element: String): Unit = {
    if (gdext.classes.GraphEdit.mb_detach_graph_element_from_frame == null) gdext.classes.GraphEdit.mb_detach_graph_element_from_frame = MethodBind.get("GraphEdit", "detach_graph_element_from_frame", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_detach_graph_element_from_frame, livePtr, SnArg(element))
  }

  /** GraphEdit.get_element_frame */
  final def getElementFrame(element: String): GraphFrame = {
    if (gdext.classes.GraphEdit.mb_get_element_frame == null) gdext.classes.GraphEdit.mb_get_element_frame = MethodBind.get("GraphEdit", "get_element_frame", 988084372L)
    Wrappers.borrowed[GraphFrame](Ptrcall.call1[SnArg, Long](gdext.classes.GraphEdit.mb_get_element_frame, livePtr, SnArg(element)))
  }

  /** GraphEdit.set_panning_scheme */
  final def setPanningScheme(scheme: gdext.classes.GraphEdit.PanningScheme): Unit = {
    if (gdext.classes.GraphEdit.mb_set_panning_scheme == null) gdext.classes.GraphEdit.mb_set_panning_scheme = MethodBind.get("GraphEdit", "set_panning_scheme", 18893313L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_panning_scheme, livePtr, scheme)
  }

  /** GraphEdit.get_panning_scheme */
  final def getPanningScheme(): gdext.classes.GraphEdit.PanningScheme = {
    if (gdext.classes.GraphEdit.mb_get_panning_scheme == null) gdext.classes.GraphEdit.mb_get_panning_scheme = MethodBind.get("GraphEdit", "get_panning_scheme", 549924446L)
    gdext.classes.GraphEdit.PanningScheme(Ptrcall.call0[Long](gdext.classes.GraphEdit.mb_get_panning_scheme, livePtr))
  }

  /** GraphEdit.set_zoom */
  final def setZoom(zoom: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_zoom == null) gdext.classes.GraphEdit.mb_set_zoom = MethodBind.get("GraphEdit", "set_zoom", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_zoom, livePtr, zoom)
  }

  /** GraphEdit.get_zoom */
  final def getZoom(): Double = {
    if (gdext.classes.GraphEdit.mb_get_zoom == null) gdext.classes.GraphEdit.mb_get_zoom = MethodBind.get("GraphEdit", "get_zoom", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_zoom, livePtr)
  }

  /** GraphEdit.set_zoom_min */
  final def setZoomMin(zoomMin: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_zoom_min == null) gdext.classes.GraphEdit.mb_set_zoom_min = MethodBind.get("GraphEdit", "set_zoom_min", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_zoom_min, livePtr, zoomMin)
  }

  /** GraphEdit.get_zoom_min */
  final def getZoomMin(): Double = {
    if (gdext.classes.GraphEdit.mb_get_zoom_min == null) gdext.classes.GraphEdit.mb_get_zoom_min = MethodBind.get("GraphEdit", "get_zoom_min", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_zoom_min, livePtr)
  }

  /** GraphEdit.set_zoom_max */
  final def setZoomMax(zoomMax: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_zoom_max == null) gdext.classes.GraphEdit.mb_set_zoom_max = MethodBind.get("GraphEdit", "set_zoom_max", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_zoom_max, livePtr, zoomMax)
  }

  /** GraphEdit.get_zoom_max */
  final def getZoomMax(): Double = {
    if (gdext.classes.GraphEdit.mb_get_zoom_max == null) gdext.classes.GraphEdit.mb_get_zoom_max = MethodBind.get("GraphEdit", "get_zoom_max", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_zoom_max, livePtr)
  }

  /** GraphEdit.set_zoom_step */
  final def setZoomStep(zoomStep: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_zoom_step == null) gdext.classes.GraphEdit.mb_set_zoom_step = MethodBind.get("GraphEdit", "set_zoom_step", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_zoom_step, livePtr, zoomStep)
  }

  /** GraphEdit.get_zoom_step */
  final def getZoomStep(): Double = {
    if (gdext.classes.GraphEdit.mb_get_zoom_step == null) gdext.classes.GraphEdit.mb_get_zoom_step = MethodBind.get("GraphEdit", "get_zoom_step", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_zoom_step, livePtr)
  }

  /** GraphEdit.set_show_grid */
  final def setShowGrid(enable: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_grid == null) gdext.classes.GraphEdit.mb_set_show_grid = MethodBind.get("GraphEdit", "set_show_grid", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_grid, livePtr, enable)
  }

  /** GraphEdit.is_showing_grid */
  final def isShowingGrid(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_grid == null) gdext.classes.GraphEdit.mb_is_showing_grid = MethodBind.get("GraphEdit", "is_showing_grid", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_grid, livePtr)
  }

  /** GraphEdit.set_grid_pattern */
  final def setGridPattern(pattern: gdext.classes.GraphEdit.GridPattern): Unit = {
    if (gdext.classes.GraphEdit.mb_set_grid_pattern == null) gdext.classes.GraphEdit.mb_set_grid_pattern = MethodBind.get("GraphEdit", "set_grid_pattern", 1074098205L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_grid_pattern, livePtr, pattern)
  }

  /** GraphEdit.get_grid_pattern */
  final def getGridPattern(): gdext.classes.GraphEdit.GridPattern = {
    if (gdext.classes.GraphEdit.mb_get_grid_pattern == null) gdext.classes.GraphEdit.mb_get_grid_pattern = MethodBind.get("GraphEdit", "get_grid_pattern", 1286127528L)
    gdext.classes.GraphEdit.GridPattern(Ptrcall.call0[Long](gdext.classes.GraphEdit.mb_get_grid_pattern, livePtr))
  }

  /** GraphEdit.set_snapping_enabled */
  final def setSnappingEnabled(enable: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_snapping_enabled == null) gdext.classes.GraphEdit.mb_set_snapping_enabled = MethodBind.get("GraphEdit", "set_snapping_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_snapping_enabled, livePtr, enable)
  }

  /** GraphEdit.is_snapping_enabled */
  final def isSnappingEnabled(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_snapping_enabled == null) gdext.classes.GraphEdit.mb_is_snapping_enabled = MethodBind.get("GraphEdit", "is_snapping_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_snapping_enabled, livePtr)
  }

  /** GraphEdit.set_snapping_distance */
  final def setSnappingDistance(pixels: Long): Unit = {
    if (gdext.classes.GraphEdit.mb_set_snapping_distance == null) gdext.classes.GraphEdit.mb_set_snapping_distance = MethodBind.get("GraphEdit", "set_snapping_distance", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_snapping_distance, livePtr, pixels)
  }

  /** GraphEdit.get_snapping_distance */
  final def getSnappingDistance(): Long = {
    if (gdext.classes.GraphEdit.mb_get_snapping_distance == null) gdext.classes.GraphEdit.mb_get_snapping_distance = MethodBind.get("GraphEdit", "get_snapping_distance", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GraphEdit.mb_get_snapping_distance, livePtr)
  }

  /** GraphEdit.set_connection_lines_curvature */
  final def setConnectionLinesCurvature(curvature: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_connection_lines_curvature == null) gdext.classes.GraphEdit.mb_set_connection_lines_curvature = MethodBind.get("GraphEdit", "set_connection_lines_curvature", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_connection_lines_curvature, livePtr, curvature)
  }

  /** GraphEdit.get_connection_lines_curvature */
  final def getConnectionLinesCurvature(): Double = {
    if (gdext.classes.GraphEdit.mb_get_connection_lines_curvature == null) gdext.classes.GraphEdit.mb_get_connection_lines_curvature = MethodBind.get("GraphEdit", "get_connection_lines_curvature", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_connection_lines_curvature, livePtr)
  }

  /** GraphEdit.set_connection_lines_thickness */
  final def setConnectionLinesThickness(pixels: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_connection_lines_thickness == null) gdext.classes.GraphEdit.mb_set_connection_lines_thickness = MethodBind.get("GraphEdit", "set_connection_lines_thickness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_connection_lines_thickness, livePtr, pixels)
  }

  /** GraphEdit.get_connection_lines_thickness */
  final def getConnectionLinesThickness(): Double = {
    if (gdext.classes.GraphEdit.mb_get_connection_lines_thickness == null) gdext.classes.GraphEdit.mb_get_connection_lines_thickness = MethodBind.get("GraphEdit", "get_connection_lines_thickness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_connection_lines_thickness, livePtr)
  }

  /** GraphEdit.set_connection_lines_antialiased */
  final def setConnectionLinesAntialiased(pixels: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_connection_lines_antialiased == null) gdext.classes.GraphEdit.mb_set_connection_lines_antialiased = MethodBind.get("GraphEdit", "set_connection_lines_antialiased", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_connection_lines_antialiased, livePtr, pixels)
  }

  /** GraphEdit.is_connection_lines_antialiased */
  final def isConnectionLinesAntialiased(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_connection_lines_antialiased == null) gdext.classes.GraphEdit.mb_is_connection_lines_antialiased = MethodBind.get("GraphEdit", "is_connection_lines_antialiased", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_connection_lines_antialiased, livePtr)
  }

  /** GraphEdit.set_minimap_size */
  final def setMinimapSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.GraphEdit.mb_set_minimap_size == null) gdext.classes.GraphEdit.mb_set_minimap_size = MethodBind.get("GraphEdit", "set_minimap_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_minimap_size, livePtr, size)
  }

  /** GraphEdit.get_minimap_size */
  final def getMinimapSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.GraphEdit.mb_get_minimap_size == null) gdext.classes.GraphEdit.mb_get_minimap_size = MethodBind.get("GraphEdit", "get_minimap_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.GraphEdit.mb_get_minimap_size, livePtr)
  }

  /** GraphEdit.set_minimap_opacity */
  final def setMinimapOpacity(opacity: Double): Unit = {
    if (gdext.classes.GraphEdit.mb_set_minimap_opacity == null) gdext.classes.GraphEdit.mb_set_minimap_opacity = MethodBind.get("GraphEdit", "set_minimap_opacity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_minimap_opacity, livePtr, opacity)
  }

  /** GraphEdit.get_minimap_opacity */
  final def getMinimapOpacity(): Double = {
    if (gdext.classes.GraphEdit.mb_get_minimap_opacity == null) gdext.classes.GraphEdit.mb_get_minimap_opacity = MethodBind.get("GraphEdit", "get_minimap_opacity", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GraphEdit.mb_get_minimap_opacity, livePtr)
  }

  /** GraphEdit.set_minimap_enabled */
  final def setMinimapEnabled(enable: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_minimap_enabled == null) gdext.classes.GraphEdit.mb_set_minimap_enabled = MethodBind.get("GraphEdit", "set_minimap_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_minimap_enabled, livePtr, enable)
  }

  /** GraphEdit.is_minimap_enabled */
  final def isMinimapEnabled(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_minimap_enabled == null) gdext.classes.GraphEdit.mb_is_minimap_enabled = MethodBind.get("GraphEdit", "is_minimap_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_minimap_enabled, livePtr)
  }

  /** GraphEdit.set_show_menu */
  final def setShowMenu(hidden: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_menu == null) gdext.classes.GraphEdit.mb_set_show_menu = MethodBind.get("GraphEdit", "set_show_menu", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_menu, livePtr, hidden)
  }

  /** GraphEdit.is_showing_menu */
  final def isShowingMenu(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_menu == null) gdext.classes.GraphEdit.mb_is_showing_menu = MethodBind.get("GraphEdit", "is_showing_menu", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_menu, livePtr)
  }

  /** GraphEdit.set_show_zoom_label */
  final def setShowZoomLabel(enable: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_zoom_label == null) gdext.classes.GraphEdit.mb_set_show_zoom_label = MethodBind.get("GraphEdit", "set_show_zoom_label", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_zoom_label, livePtr, enable)
  }

  /** GraphEdit.is_showing_zoom_label */
  final def isShowingZoomLabel(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_zoom_label == null) gdext.classes.GraphEdit.mb_is_showing_zoom_label = MethodBind.get("GraphEdit", "is_showing_zoom_label", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_zoom_label, livePtr)
  }

  /** GraphEdit.set_show_grid_buttons */
  final def setShowGridButtons(hidden: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_grid_buttons == null) gdext.classes.GraphEdit.mb_set_show_grid_buttons = MethodBind.get("GraphEdit", "set_show_grid_buttons", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_grid_buttons, livePtr, hidden)
  }

  /** GraphEdit.is_showing_grid_buttons */
  final def isShowingGridButtons(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_grid_buttons == null) gdext.classes.GraphEdit.mb_is_showing_grid_buttons = MethodBind.get("GraphEdit", "is_showing_grid_buttons", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_grid_buttons, livePtr)
  }

  /** GraphEdit.set_show_zoom_buttons */
  final def setShowZoomButtons(hidden: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_zoom_buttons == null) gdext.classes.GraphEdit.mb_set_show_zoom_buttons = MethodBind.get("GraphEdit", "set_show_zoom_buttons", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_zoom_buttons, livePtr, hidden)
  }

  /** GraphEdit.is_showing_zoom_buttons */
  final def isShowingZoomButtons(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_zoom_buttons == null) gdext.classes.GraphEdit.mb_is_showing_zoom_buttons = MethodBind.get("GraphEdit", "is_showing_zoom_buttons", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_zoom_buttons, livePtr)
  }

  /** GraphEdit.set_show_minimap_button */
  final def setShowMinimapButton(hidden: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_minimap_button == null) gdext.classes.GraphEdit.mb_set_show_minimap_button = MethodBind.get("GraphEdit", "set_show_minimap_button", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_minimap_button, livePtr, hidden)
  }

  /** GraphEdit.is_showing_minimap_button */
  final def isShowingMinimapButton(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_minimap_button == null) gdext.classes.GraphEdit.mb_is_showing_minimap_button = MethodBind.get("GraphEdit", "is_showing_minimap_button", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_minimap_button, livePtr)
  }

  /** GraphEdit.set_show_arrange_button */
  final def setShowArrangeButton(hidden: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_show_arrange_button == null) gdext.classes.GraphEdit.mb_set_show_arrange_button = MethodBind.get("GraphEdit", "set_show_arrange_button", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_show_arrange_button, livePtr, hidden)
  }

  /** GraphEdit.is_showing_arrange_button */
  final def isShowingArrangeButton(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_showing_arrange_button == null) gdext.classes.GraphEdit.mb_is_showing_arrange_button = MethodBind.get("GraphEdit", "is_showing_arrange_button", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_showing_arrange_button, livePtr)
  }

  /** GraphEdit.set_right_disconnects */
  final def setRightDisconnects(enable: Boolean): Unit = {
    if (gdext.classes.GraphEdit.mb_set_right_disconnects == null) gdext.classes.GraphEdit.mb_set_right_disconnects = MethodBind.get("GraphEdit", "set_right_disconnects", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_right_disconnects, livePtr, enable)
  }

  /** GraphEdit.is_right_disconnects_enabled */
  final def isRightDisconnectsEnabled(): Boolean = {
    if (gdext.classes.GraphEdit.mb_is_right_disconnects_enabled == null) gdext.classes.GraphEdit.mb_is_right_disconnects_enabled = MethodBind.get("GraphEdit", "is_right_disconnects_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GraphEdit.mb_is_right_disconnects_enabled, livePtr)
  }

  /** GraphEdit.get_menu_hbox */
  final def getMenuHbox(): HBoxContainer = {
    if (gdext.classes.GraphEdit.mb_get_menu_hbox == null) gdext.classes.GraphEdit.mb_get_menu_hbox = MethodBind.get("GraphEdit", "get_menu_hbox", 3590609951L)
    Wrappers.borrowed[HBoxContainer](Ptrcall.call0[Long](gdext.classes.GraphEdit.mb_get_menu_hbox, livePtr))
  }

  /** GraphEdit.arrange_nodes */
  final def arrangeNodes(): Unit = {
    if (gdext.classes.GraphEdit.mb_arrange_nodes == null) gdext.classes.GraphEdit.mb_arrange_nodes = MethodBind.get("GraphEdit", "arrange_nodes", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.GraphEdit.mb_arrange_nodes, livePtr)
  }

  /** GraphEdit.set_selected */
  final def setSelected(node: Node): Unit = {
    if (gdext.classes.GraphEdit.mb_set_selected == null) gdext.classes.GraphEdit.mb_set_selected = MethodBind.get("GraphEdit", "set_selected", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.GraphEdit.mb_set_selected, livePtr, Wrappers.handle(node))
  }

}

object GraphEdit {
  private[classes] var mb_connect_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_node_connected: GDExtensionMethodBindPtr = null
  private[classes] var mb_disconnect_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_connection_activity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_force_connection_drag_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scroll_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_valid_right_disconnect_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_valid_right_disconnect_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_valid_left_disconnect_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_valid_left_disconnect_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_valid_connection_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_valid_connection_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_valid_connection_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_attach_graph_element_to_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_detach_graph_element_from_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_element_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_panning_scheme: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_panning_scheme: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zoom: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zoom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zoom_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zoom_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zoom_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zoom_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_zoom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_zoom_step: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_grid: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_grid: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_grid_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_grid_pattern: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snapping_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_snapping_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_snapping_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_snapping_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_connection_lines_curvature: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_lines_curvature: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_connection_lines_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_connection_lines_thickness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_connection_lines_antialiased: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_connection_lines_antialiased: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_minimap_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimap_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_minimap_opacity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_minimap_opacity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_minimap_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_minimap_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_menu: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_zoom_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_zoom_label: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_grid_buttons: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_grid_buttons: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_zoom_buttons: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_zoom_buttons: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_minimap_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_minimap_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_show_arrange_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_showing_arrange_button: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_right_disconnects: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_right_disconnects_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_menu_hbox: GDExtensionMethodBindPtr = null
  private[classes] var mb_arrange_nodes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_selected: GDExtensionMethodBindPtr = null

  /** Godot enum `GraphEdit.PanningScheme`. */
  opaque type PanningScheme <: Long = Long

  object PanningScheme {
    final val Zooms: PanningScheme = 0L.asInstanceOf[PanningScheme]
    final val Pans: PanningScheme = 1L.asInstanceOf[PanningScheme]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): PanningScheme = value.asInstanceOf[PanningScheme]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[PanningScheme] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[PanningScheme]]

    extension (self: PanningScheme)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Zooms"
        case 1L => "Pans"
        case other => other.toString
      }
  }

  /** Godot enum `GraphEdit.GridPattern`. */
  opaque type GridPattern <: Long = Long

  object GridPattern {
    final val Lines: GridPattern = 0L.asInstanceOf[GridPattern]
    final val Dots: GridPattern = 1L.asInstanceOf[GridPattern]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): GridPattern = value.asInstanceOf[GridPattern]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[GridPattern] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[GridPattern]]

    extension (self: GridPattern)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Lines"
        case 1L => "Dots"
        case other => other.toString
      }
  }
}
