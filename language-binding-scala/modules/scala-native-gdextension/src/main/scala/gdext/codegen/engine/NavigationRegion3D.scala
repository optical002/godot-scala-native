package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationRegion3D`, extends `Node3D`. */
abstract class NavigationRegion3D extends Node3D {

  /** NavigationRegion3D.set_navigation_mesh */
  final def setNavigationMesh(navigation_mesh: NavigationMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_navigation_mesh", 2923361153L), hostObject.objectPtr, navigation_mesh.hostObject)

  /** NavigationRegion3D.get_navigation_mesh */
  final def getNavigationMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("NavigationRegion3D", "get_navigation_mesh", 1468720886L), hostObject.objectPtr)

  /** NavigationRegion3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationRegion3D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion3D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationRegion3D.set_use_edge_connections */
  final def setUseEdgeConnections(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_use_edge_connections", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationRegion3D.get_use_edge_connections */
  final def getUseEdgeConnections(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion3D", "get_use_edge_connections", 36873697L), hostObject.objectPtr)

  /** NavigationRegion3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationRegion3D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationRegion3D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationRegion3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationRegion3D", "set_navigation_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationRegion3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationRegion3D", "get_navigation_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationRegion3D.set_enter_cost */
  final def setEnterCost(enter_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_enter_cost", 373806689L), hostObject.objectPtr, enter_cost)

  /** NavigationRegion3D.get_enter_cost */
  final def getEnterCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationRegion3D", "get_enter_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationRegion3D.set_travel_cost */
  final def setTravelCost(travel_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "set_travel_cost", 373806689L), hostObject.objectPtr, travel_cost)

  /** NavigationRegion3D.get_travel_cost */
  final def getTravelCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationRegion3D", "get_travel_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationRegion3D.bake_navigation_mesh */
  final def bakeNavigationMesh(on_thread: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationRegion3D", "bake_navigation_mesh", 3216645846L), hostObject.objectPtr, on_thread)

  /** NavigationRegion3D.is_baking */
  final def isBaking(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationRegion3D", "is_baking", 36873697L), hostObject.objectPtr)

  /** NavigationRegion3D.get_bounds */
  final def getBounds(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("NavigationRegion3D", "get_bounds", 1068685055L), hostObject.objectPtr)

}

object NavigationRegion3D {
  /** Class metadata for Gd[NavigationRegion3D] lifetime management and casting. */
  given GodotClass[NavigationRegion3D] with {
    def className = "NavigationRegion3D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationRegion3D = new NavigationRegion3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationRegion3D): GodotObject = t.hostObject
  }
}
