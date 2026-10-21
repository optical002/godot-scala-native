package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationRegion3D`, extends `Node3D`. */
abstract class NavigationRegion3D extends Node3D {
  override def godotClassName: String = "NavigationRegion3D"

  /** NavigationRegion3D.set_navigation_mesh */
  final def setNavigationMesh(navigation_mesh: NavigationMesh): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_navigation_mesh == null) gdext.classes.NavigationRegion3D.mb_set_navigation_mesh = MethodBind.get("NavigationRegion3D", "set_navigation_mesh", 2923361153L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_navigation_mesh, livePtr, Wrappers.handle(navigation_mesh))
  }

  /** NavigationRegion3D.get_navigation_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getNavigationMesh(): NavigationMesh = {
    if (gdext.classes.NavigationRegion3D.mb_get_navigation_mesh == null) gdext.classes.NavigationRegion3D.mb_get_navigation_mesh = MethodBind.get("NavigationRegion3D", "get_navigation_mesh", 1468720886L)
    Wrappers.owned[NavigationMesh](Ptrcall.call0[Long](gdext.classes.NavigationRegion3D.mb_get_navigation_mesh, livePtr))
  }

  /** NavigationRegion3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_enabled == null) gdext.classes.NavigationRegion3D.mb_set_enabled = MethodBind.get("NavigationRegion3D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_enabled, livePtr, enabled)
  }

  /** NavigationRegion3D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.NavigationRegion3D.mb_is_enabled == null) gdext.classes.NavigationRegion3D.mb_is_enabled = MethodBind.get("NavigationRegion3D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion3D.mb_is_enabled, livePtr)
  }

  /** NavigationRegion3D.set_use_edge_connections */
  final def setUseEdgeConnections(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_use_edge_connections == null) gdext.classes.NavigationRegion3D.mb_set_use_edge_connections = MethodBind.get("NavigationRegion3D", "set_use_edge_connections", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_use_edge_connections, livePtr, enabled)
  }

  /** NavigationRegion3D.get_use_edge_connections */
  final def getUseEdgeConnections(): Boolean = {
    if (gdext.classes.NavigationRegion3D.mb_get_use_edge_connections == null) gdext.classes.NavigationRegion3D.mb_get_use_edge_connections = MethodBind.get("NavigationRegion3D", "get_use_edge_connections", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion3D.mb_get_use_edge_connections, livePtr)
  }

  /** NavigationRegion3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_navigation_layers == null) gdext.classes.NavigationRegion3D.mb_set_navigation_layers = MethodBind.get("NavigationRegion3D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_navigation_layers, livePtr, navigation_layers)
  }

  /** NavigationRegion3D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationRegion3D.mb_get_navigation_layers == null) gdext.classes.NavigationRegion3D.mb_get_navigation_layers = MethodBind.get("NavigationRegion3D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationRegion3D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationRegion3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_navigation_layer_value == null) gdext.classes.NavigationRegion3D.mb_set_navigation_layer_value = MethodBind.get("NavigationRegion3D", "set_navigation_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationRegion3D.mb_set_navigation_layer_value, livePtr, layer_number, value)
  }

  /** NavigationRegion3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationRegion3D.mb_get_navigation_layer_value == null) gdext.classes.NavigationRegion3D.mb_get_navigation_layer_value = MethodBind.get("NavigationRegion3D", "get_navigation_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationRegion3D.mb_get_navigation_layer_value, livePtr, layer_number)
  }

  /** NavigationRegion3D.set_enter_cost */
  final def setEnterCost(enter_cost: Double): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_enter_cost == null) gdext.classes.NavigationRegion3D.mb_set_enter_cost = MethodBind.get("NavigationRegion3D", "set_enter_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_enter_cost, livePtr, enter_cost)
  }

  /** NavigationRegion3D.get_enter_cost */
  final def getEnterCost(): Double = {
    if (gdext.classes.NavigationRegion3D.mb_get_enter_cost == null) gdext.classes.NavigationRegion3D.mb_get_enter_cost = MethodBind.get("NavigationRegion3D", "get_enter_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationRegion3D.mb_get_enter_cost, livePtr)
  }

  /** NavigationRegion3D.set_travel_cost */
  final def setTravelCost(travel_cost: Double): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_set_travel_cost == null) gdext.classes.NavigationRegion3D.mb_set_travel_cost = MethodBind.get("NavigationRegion3D", "set_travel_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_set_travel_cost, livePtr, travel_cost)
  }

  /** NavigationRegion3D.get_travel_cost */
  final def getTravelCost(): Double = {
    if (gdext.classes.NavigationRegion3D.mb_get_travel_cost == null) gdext.classes.NavigationRegion3D.mb_get_travel_cost = MethodBind.get("NavigationRegion3D", "get_travel_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationRegion3D.mb_get_travel_cost, livePtr)
  }

  /** NavigationRegion3D.bake_navigation_mesh */
  final def bakeNavigationMesh(on_thread: Boolean): Unit = {
    if (gdext.classes.NavigationRegion3D.mb_bake_navigation_mesh == null) gdext.classes.NavigationRegion3D.mb_bake_navigation_mesh = MethodBind.get("NavigationRegion3D", "bake_navigation_mesh", 3216645846L)
    Ptrcall.callVoid1(gdext.classes.NavigationRegion3D.mb_bake_navigation_mesh, livePtr, on_thread)
  }

  /** NavigationRegion3D.is_baking */
  final def isBaking(): Boolean = {
    if (gdext.classes.NavigationRegion3D.mb_is_baking == null) gdext.classes.NavigationRegion3D.mb_is_baking = MethodBind.get("NavigationRegion3D", "is_baking", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationRegion3D.mb_is_baking, livePtr)
  }

  /** NavigationRegion3D.get_bounds */
  final def getBounds(): gdext.builtin.AABB = {
    if (gdext.classes.NavigationRegion3D.mb_get_bounds == null) gdext.classes.NavigationRegion3D.mb_get_bounds = MethodBind.get("NavigationRegion3D", "get_bounds", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.NavigationRegion3D.mb_get_bounds, livePtr)
  }

}

object NavigationRegion3D {
  private[classes] var mb_set_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_mesh: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_bake_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_baking: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_bounds: GDExtensionMethodBindPtr = null
}
