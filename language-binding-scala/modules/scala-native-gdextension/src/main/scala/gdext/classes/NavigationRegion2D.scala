package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationRegion2D`, extends `Node2D`. */
abstract class NavigationRegion2D extends Node2D {

  /** NavigationRegion2D.set_navigation_polygon */
  final def setNavigationPolygon(navigation_polygon: NavigationPolygon): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_navigation_polygon", 1515040758L), hostObject.objectPtr, navigation_polygon.hostObject)

  /** NavigationRegion2D.get_navigation_polygon */
  final def getNavigationPolygon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NavigationRegion2D", "get_navigation_polygon", 1046532237L), hostObject.objectPtr)

  /** NavigationRegion2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationRegion2D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion2D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationRegion2D.set_use_edge_connections */
  final def setUseEdgeConnections(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_use_edge_connections", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationRegion2D.get_use_edge_connections */
  final def getUseEdgeConnections(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion2D", "get_use_edge_connections", 36873697L), hostObject.objectPtr)

  /** NavigationRegion2D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationRegion2D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationRegion2D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationRegion2D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationRegion2D", "set_navigation_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationRegion2D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationRegion2D", "get_navigation_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationRegion2D.set_enter_cost */
  final def setEnterCost(enter_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_enter_cost", 373806689L), hostObject.objectPtr, enter_cost)

  /** NavigationRegion2D.get_enter_cost */
  final def getEnterCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationRegion2D", "get_enter_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationRegion2D.set_travel_cost */
  final def setTravelCost(travel_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "set_travel_cost", 373806689L), hostObject.objectPtr, travel_cost)

  /** NavigationRegion2D.get_travel_cost */
  final def getTravelCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationRegion2D", "get_travel_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationRegion2D.bake_navigation_polygon */
  final def bakeNavigationPolygon(on_thread: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion2D", "bake_navigation_polygon", 3216645846L), hostObject.objectPtr, on_thread)

  /** NavigationRegion2D.is_baking */
  final def isBaking(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion2D", "is_baking", 36873697L), hostObject.objectPtr)

  /** NavigationRegion2D.get_bounds */
  final def getBounds(): gdext.builtin.Rect2 =
    Ptrcall.call0[gdext.builtin.Rect2](MethodBind.get("NavigationRegion2D", "get_bounds", 1639390495L), hostObject.objectPtr)

}

object NavigationRegion2D {
  /** Class metadata for Gd[NavigationRegion2D] lifetime management and casting. */
  given GodotClass[NavigationRegion2D] with {
    def className = "NavigationRegion2D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationRegion2D = new NavigationRegion2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationRegion2D): GodotObject = t.hostObject
  }
}
