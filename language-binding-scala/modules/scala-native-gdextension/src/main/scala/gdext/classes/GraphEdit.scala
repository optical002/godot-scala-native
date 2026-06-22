package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GraphEdit`, extends `Control`. */
abstract class GraphEdit extends Control {

  /** GraphEdit.connect_node */
  final def connectNode(from_node: gdext.builtin.StringName, from_port: Long, to_node: gdext.builtin.StringName, to_port: Long, keep_alive: Boolean): Long =
    Ptrcall.call5[gdext.builtin.StringName, Long, gdext.builtin.StringName, Long, Boolean, Long](MethodBind.get("GraphEdit", "connect_node", 1376144231L), hostObject.objectPtr, from_node, from_port, to_node, to_port, keep_alive)

  /** GraphEdit.is_node_connected */
  final def isNodeConnected(from_node: gdext.builtin.StringName, from_port: Long, to_node: gdext.builtin.StringName, to_port: Long): Boolean =
    Ptrcall.call4[gdext.builtin.StringName, Long, gdext.builtin.StringName, Long, Boolean](MethodBind.get("GraphEdit", "is_node_connected", 4216241294L), hostObject.objectPtr, from_node, from_port, to_node, to_port)

  /** GraphEdit.disconnect_node */
  final def disconnectNode(from_node: gdext.builtin.StringName, from_port: Long, to_node: gdext.builtin.StringName, to_port: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("GraphEdit", "disconnect_node", 1933654315L), hostObject.objectPtr, from_node, from_port, to_node, to_port)

  /** GraphEdit.set_connection_activity */
  final def setConnectionActivity(from_node: gdext.builtin.StringName, from_port: Long, to_node: gdext.builtin.StringName, to_port: Long, amount: Double): Unit =
    Ptrcall.callVoid5(MethodBind.get("GraphEdit", "set_connection_activity", 1141899943L), hostObject.objectPtr, from_node, from_port, to_node, to_port, amount)

  /** GraphEdit.get_connection_count */
  final def getConnectionCount(from_node: gdext.builtin.StringName, from_port: Long): Long =
    Ptrcall.call2[gdext.builtin.StringName, Long, Long](MethodBind.get("GraphEdit", "get_connection_count", 861718734L), hostObject.objectPtr, from_node, from_port)

  /** GraphEdit.clear_connections */
  final def clearConnections(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GraphEdit", "clear_connections", 3218959716L), hostObject.objectPtr)

  /** GraphEdit.force_connection_drag_end */
  final def forceConnectionDragEnd(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GraphEdit", "force_connection_drag_end", 3218959716L), hostObject.objectPtr)

  /** GraphEdit.get_scroll_offset */
  final def getScrollOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("GraphEdit", "get_scroll_offset", 3341600327L), hostObject.objectPtr)

  /** GraphEdit.set_scroll_offset */
  final def setScrollOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_scroll_offset", 743155724L), hostObject.objectPtr, offset)

  /** GraphEdit.add_valid_right_disconnect_type */
  final def addValidRightDisconnectType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "add_valid_right_disconnect_type", 1286410249L), hostObject.objectPtr, `type`)

  /** GraphEdit.remove_valid_right_disconnect_type */
  final def removeValidRightDisconnectType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "remove_valid_right_disconnect_type", 1286410249L), hostObject.objectPtr, `type`)

  /** GraphEdit.add_valid_left_disconnect_type */
  final def addValidLeftDisconnectType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "add_valid_left_disconnect_type", 1286410249L), hostObject.objectPtr, `type`)

  /** GraphEdit.remove_valid_left_disconnect_type */
  final def removeValidLeftDisconnectType(`type`: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "remove_valid_left_disconnect_type", 1286410249L), hostObject.objectPtr, `type`)

  /** GraphEdit.add_valid_connection_type */
  final def addValidConnectionType(from_type: Long, to_type: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphEdit", "add_valid_connection_type", 3937882851L), hostObject.objectPtr, from_type, to_type)

  /** GraphEdit.remove_valid_connection_type */
  final def removeValidConnectionType(from_type: Long, to_type: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphEdit", "remove_valid_connection_type", 3937882851L), hostObject.objectPtr, from_type, to_type)

  /** GraphEdit.is_valid_connection_type */
  final def isValidConnectionType(from_type: Long, to_type: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("GraphEdit", "is_valid_connection_type", 2522259332L), hostObject.objectPtr, from_type, to_type)

  /** GraphEdit.attach_graph_element_to_frame */
  final def attachGraphElementToFrame(element: gdext.builtin.StringName, frame: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("GraphEdit", "attach_graph_element_to_frame", 3740211285L), hostObject.objectPtr, element, frame)

  /** GraphEdit.detach_graph_element_from_frame */
  final def detachGraphElementFromFrame(element: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "detach_graph_element_from_frame", 3304788590L), hostObject.objectPtr, element)

  /** GraphEdit.get_element_frame */
  final def getElementFrame(element: gdext.builtin.StringName): GodotObject =
    Ptrcall.call1[gdext.builtin.StringName, GodotObject](MethodBind.get("GraphEdit", "get_element_frame", 988084372L), hostObject.objectPtr, element)

  /** GraphEdit.set_panning_scheme */
  final def setPanningScheme(scheme: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_panning_scheme", 18893313L), hostObject.objectPtr, scheme)

  /** GraphEdit.get_panning_scheme */
  final def getPanningScheme(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphEdit", "get_panning_scheme", 549924446L), hostObject.objectPtr)

  /** GraphEdit.set_zoom */
  final def setZoom(zoom: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_zoom", 373806689L), hostObject.objectPtr, zoom)

  /** GraphEdit.get_zoom */
  final def getZoom(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_zoom", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_zoom_min */
  final def setZoomMin(zoom_min: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_zoom_min", 373806689L), hostObject.objectPtr, zoom_min)

  /** GraphEdit.get_zoom_min */
  final def getZoomMin(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_zoom_min", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_zoom_max */
  final def setZoomMax(zoom_max: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_zoom_max", 373806689L), hostObject.objectPtr, zoom_max)

  /** GraphEdit.get_zoom_max */
  final def getZoomMax(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_zoom_max", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_zoom_step */
  final def setZoomStep(zoom_step: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_zoom_step", 373806689L), hostObject.objectPtr, zoom_step)

  /** GraphEdit.get_zoom_step */
  final def getZoomStep(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_zoom_step", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_show_grid */
  final def setShowGrid(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_grid", 2586408642L), hostObject.objectPtr, enable)

  /** GraphEdit.is_showing_grid */
  final def isShowingGrid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_grid", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_grid_pattern */
  final def setGridPattern(pattern: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_grid_pattern", 1074098205L), hostObject.objectPtr, pattern)

  /** GraphEdit.get_grid_pattern */
  final def getGridPattern(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphEdit", "get_grid_pattern", 1286127528L), hostObject.objectPtr)

  /** GraphEdit.set_snapping_enabled */
  final def setSnappingEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_snapping_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** GraphEdit.is_snapping_enabled */
  final def isSnappingEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_snapping_enabled", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_snapping_distance */
  final def setSnappingDistance(pixels: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_snapping_distance", 1286410249L), hostObject.objectPtr, pixels)

  /** GraphEdit.get_snapping_distance */
  final def getSnappingDistance(): Long =
    Ptrcall.call0[Long](MethodBind.get("GraphEdit", "get_snapping_distance", 3905245786L), hostObject.objectPtr)

  /** GraphEdit.set_connection_lines_curvature */
  final def setConnectionLinesCurvature(curvature: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_connection_lines_curvature", 373806689L), hostObject.objectPtr, curvature)

  /** GraphEdit.get_connection_lines_curvature */
  final def getConnectionLinesCurvature(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_connection_lines_curvature", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_connection_lines_thickness */
  final def setConnectionLinesThickness(pixels: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_connection_lines_thickness", 373806689L), hostObject.objectPtr, pixels)

  /** GraphEdit.get_connection_lines_thickness */
  final def getConnectionLinesThickness(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_connection_lines_thickness", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_connection_lines_antialiased */
  final def setConnectionLinesAntialiased(pixels: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_connection_lines_antialiased", 2586408642L), hostObject.objectPtr, pixels)

  /** GraphEdit.is_connection_lines_antialiased */
  final def isConnectionLinesAntialiased(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_connection_lines_antialiased", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_minimap_size */
  final def setMinimapSize(size: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_minimap_size", 743155724L), hostObject.objectPtr, size)

  /** GraphEdit.get_minimap_size */
  final def getMinimapSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("GraphEdit", "get_minimap_size", 3341600327L), hostObject.objectPtr)

  /** GraphEdit.set_minimap_opacity */
  final def setMinimapOpacity(opacity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_minimap_opacity", 373806689L), hostObject.objectPtr, opacity)

  /** GraphEdit.get_minimap_opacity */
  final def getMinimapOpacity(): Double =
    Ptrcall.call0[Double](MethodBind.get("GraphEdit", "get_minimap_opacity", 1740695150L), hostObject.objectPtr)

  /** GraphEdit.set_minimap_enabled */
  final def setMinimapEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_minimap_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** GraphEdit.is_minimap_enabled */
  final def isMinimapEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_minimap_enabled", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_menu */
  final def setShowMenu(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_menu", 2586408642L), hostObject.objectPtr, hidden)

  /** GraphEdit.is_showing_menu */
  final def isShowingMenu(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_menu", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_zoom_label */
  final def setShowZoomLabel(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_zoom_label", 2586408642L), hostObject.objectPtr, enable)

  /** GraphEdit.is_showing_zoom_label */
  final def isShowingZoomLabel(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_zoom_label", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_grid_buttons */
  final def setShowGridButtons(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_grid_buttons", 2586408642L), hostObject.objectPtr, hidden)

  /** GraphEdit.is_showing_grid_buttons */
  final def isShowingGridButtons(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_grid_buttons", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_zoom_buttons */
  final def setShowZoomButtons(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_zoom_buttons", 2586408642L), hostObject.objectPtr, hidden)

  /** GraphEdit.is_showing_zoom_buttons */
  final def isShowingZoomButtons(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_zoom_buttons", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_minimap_button */
  final def setShowMinimapButton(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_minimap_button", 2586408642L), hostObject.objectPtr, hidden)

  /** GraphEdit.is_showing_minimap_button */
  final def isShowingMinimapButton(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_minimap_button", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_show_arrange_button */
  final def setShowArrangeButton(hidden: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_show_arrange_button", 2586408642L), hostObject.objectPtr, hidden)

  /** GraphEdit.is_showing_arrange_button */
  final def isShowingArrangeButton(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_showing_arrange_button", 36873697L), hostObject.objectPtr)

  /** GraphEdit.set_right_disconnects */
  final def setRightDisconnects(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_right_disconnects", 2586408642L), hostObject.objectPtr, enable)

  /** GraphEdit.is_right_disconnects_enabled */
  final def isRightDisconnectsEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GraphEdit", "is_right_disconnects_enabled", 36873697L), hostObject.objectPtr)

  /** GraphEdit.get_menu_hbox */
  final def getMenuHbox(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GraphEdit", "get_menu_hbox", 3590609951L), hostObject.objectPtr)

  /** GraphEdit.arrange_nodes */
  final def arrangeNodes(): Unit =
    Ptrcall.callVoid0(MethodBind.get("GraphEdit", "arrange_nodes", 3218959716L), hostObject.objectPtr)

  /** GraphEdit.set_selected */
  final def setSelected(node: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("GraphEdit", "set_selected", 1078189570L), hostObject.objectPtr, node.hostObject)

}

object GraphEdit {
  /** Class metadata for Gd[GraphEdit] lifetime management and casting. */
  given GodotClass[GraphEdit] with {
    def className = "GraphEdit"
    def isRefCounted = false
    def wrap(o: GodotObject): GraphEdit = new GraphEdit {}.withHost(o.objectPtr)
    def unwrap(t: GraphEdit): GodotObject = t.hostObject
  }
}
