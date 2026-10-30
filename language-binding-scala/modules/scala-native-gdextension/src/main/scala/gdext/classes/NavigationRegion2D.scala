package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationRegion2D`, extends `Node2D`. */
abstract class NavigationRegion2D extends Node2D {
  override def godotClassName: String = "NavigationRegion2D"

  /** NavigationRegion2D.set_navigation_polygon */
  final def setNavigationPolygon(navigationPolygon: NavigationPolygon): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_navigation_polygon == null) gdext.classes.NavigationRegion2D.mb_set_navigation_polygon = MethodBind.get("NavigationRegion2D", "set_navigation_polygon", 1515040758L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_navigation_polygon, livePtr, Wrappers.handle(navigationPolygon))
  }

  /** NavigationRegion2D.get_navigation_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNavigationPolygon(): NavigationPolygon = {
    if (gdext.classes.NavigationRegion2D.mb_get_navigation_polygon == null) gdext.classes.NavigationRegion2D.mb_get_navigation_polygon = MethodBind.get("NavigationRegion2D", "get_navigation_polygon", 1046532237L)
    Wrappers.owned[NavigationPolygon](Ptrcall.call0[Long](gdext.classes.NavigationRegion2D.mb_get_navigation_polygon, livePtr))
  }

  /** NavigationRegion2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_enabled == null) gdext.classes.NavigationRegion2D.mb_set_enabled = MethodBind.get("NavigationRegion2D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_enabled, livePtr, enabled)
  }

  /** NavigationRegion2D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.NavigationRegion2D.mb_is_enabled == null) gdext.classes.NavigationRegion2D.mb_is_enabled = MethodBind.get("NavigationRegion2D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion2D.mb_is_enabled, livePtr)
  }

  /** NavigationRegion2D.set_use_edge_connections */
  final def setUseEdgeConnections(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_use_edge_connections == null) gdext.classes.NavigationRegion2D.mb_set_use_edge_connections = MethodBind.get("NavigationRegion2D", "set_use_edge_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_use_edge_connections, livePtr, enabled)
  }

  /** NavigationRegion2D.get_use_edge_connections */
  final def getUseEdgeConnections(): Boolean = {
    if (gdext.classes.NavigationRegion2D.mb_get_use_edge_connections == null) gdext.classes.NavigationRegion2D.mb_get_use_edge_connections = MethodBind.get("NavigationRegion2D", "get_use_edge_connections", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion2D.mb_get_use_edge_connections, livePtr)
  }

  /** NavigationRegion2D.set_navigation_layers */
  final def setNavigationLayers(navigationLayers: Long): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_navigation_layers == null) gdext.classes.NavigationRegion2D.mb_set_navigation_layers = MethodBind.get("NavigationRegion2D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_navigation_layers, livePtr, navigationLayers)
  }

  /** NavigationRegion2D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationRegion2D.mb_get_navigation_layers == null) gdext.classes.NavigationRegion2D.mb_get_navigation_layers = MethodBind.get("NavigationRegion2D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationRegion2D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationRegion2D.set_navigation_layer_value */
  final def setNavigationLayerValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_navigation_layer_value == null) gdext.classes.NavigationRegion2D.mb_set_navigation_layer_value = MethodBind.get("NavigationRegion2D", "set_navigation_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationRegion2D.mb_set_navigation_layer_value, livePtr, layerNumber, value)
  }

  /** NavigationRegion2D.get_navigation_layer_value */
  final def getNavigationLayerValue(layerNumber: Long): Boolean = {
    if (gdext.classes.NavigationRegion2D.mb_get_navigation_layer_value == null) gdext.classes.NavigationRegion2D.mb_get_navigation_layer_value = MethodBind.get("NavigationRegion2D", "get_navigation_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationRegion2D.mb_get_navigation_layer_value, livePtr, layerNumber)
  }

  /** NavigationRegion2D.set_enter_cost */
  final def setEnterCost(enterCost: Double): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_enter_cost == null) gdext.classes.NavigationRegion2D.mb_set_enter_cost = MethodBind.get("NavigationRegion2D", "set_enter_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_enter_cost, livePtr, enterCost)
  }

  /** NavigationRegion2D.get_enter_cost */
  final def getEnterCost(): Double = {
    if (gdext.classes.NavigationRegion2D.mb_get_enter_cost == null) gdext.classes.NavigationRegion2D.mb_get_enter_cost = MethodBind.get("NavigationRegion2D", "get_enter_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationRegion2D.mb_get_enter_cost, livePtr)
  }

  /** NavigationRegion2D.set_travel_cost */
  final def setTravelCost(travelCost: Double): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_set_travel_cost == null) gdext.classes.NavigationRegion2D.mb_set_travel_cost = MethodBind.get("NavigationRegion2D", "set_travel_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_set_travel_cost, livePtr, travelCost)
  }

  /** NavigationRegion2D.get_travel_cost */
  final def getTravelCost(): Double = {
    if (gdext.classes.NavigationRegion2D.mb_get_travel_cost == null) gdext.classes.NavigationRegion2D.mb_get_travel_cost = MethodBind.get("NavigationRegion2D", "get_travel_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationRegion2D.mb_get_travel_cost, livePtr)
  }

  /** NavigationRegion2D.bake_navigation_polygon */
  final def bakeNavigationPolygon(onThread: Boolean = true): Unit = {
    if (gdext.classes.NavigationRegion2D.mb_bake_navigation_polygon == null) gdext.classes.NavigationRegion2D.mb_bake_navigation_polygon = MethodBind.get("NavigationRegion2D", "bake_navigation_polygon", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion2D.mb_bake_navigation_polygon, livePtr, onThread)
  }

  /** NavigationRegion2D.is_baking */
  final def isBaking(): Boolean = {
    if (gdext.classes.NavigationRegion2D.mb_is_baking == null) gdext.classes.NavigationRegion2D.mb_is_baking = MethodBind.get("NavigationRegion2D", "is_baking", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion2D.mb_is_baking, livePtr)
  }

  /** NavigationRegion2D.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 = {
    if (gdext.classes.NavigationRegion2D.mb_get_bounds == null) gdext.classes.NavigationRegion2D.mb_get_bounds = MethodBind.get("NavigationRegion2D", "get_bounds", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.NavigationRegion2D.mb_get_bounds, livePtr)
  }

}

object NavigationRegion2D {
  private[classes] var mb_set_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_edge_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_edge_connections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enter_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enter_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_travel_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_travel_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_bake_navigation_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_baking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
}
