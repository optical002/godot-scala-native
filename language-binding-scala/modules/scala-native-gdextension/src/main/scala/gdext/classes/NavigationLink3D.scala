package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationLink3D`, extends `Node3D`. */
abstract class NavigationLink3D extends Node3D {
  override def godotClassName: String = "NavigationLink3D"

  /** NavigationLink3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_enabled == null) gdext.classes.NavigationLink3D.mb_set_enabled = MethodBind.get("NavigationLink3D", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_enabled, livePtr, enabled)
  }

  /** NavigationLink3D.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.NavigationLink3D.mb_is_enabled == null) gdext.classes.NavigationLink3D.mb_is_enabled = MethodBind.get("NavigationLink3D", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationLink3D.mb_is_enabled, livePtr)
  }

  /** NavigationLink3D.set_bidirectional */
  final def setBidirectional(bidirectional: Boolean): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_bidirectional == null) gdext.classes.NavigationLink3D.mb_set_bidirectional = MethodBind.get("NavigationLink3D", "set_bidirectional", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_bidirectional, livePtr, bidirectional)
  }

  /** NavigationLink3D.is_bidirectional */
  final def isBidirectional(): Boolean = {
    if (gdext.classes.NavigationLink3D.mb_is_bidirectional == null) gdext.classes.NavigationLink3D.mb_is_bidirectional = MethodBind.get("NavigationLink3D", "is_bidirectional", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationLink3D.mb_is_bidirectional, livePtr)
  }

  /** NavigationLink3D.set_navigation_layers */
  final def setNavigationLayers(navigationLayers: Long): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_navigation_layers == null) gdext.classes.NavigationLink3D.mb_set_navigation_layers = MethodBind.get("NavigationLink3D", "set_navigation_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_navigation_layers, livePtr, navigationLayers)
  }

  /** NavigationLink3D.get_navigation_layers */
  final def getNavigationLayers(): Long = {
    if (gdext.classes.NavigationLink3D.mb_get_navigation_layers == null) gdext.classes.NavigationLink3D.mb_get_navigation_layers = MethodBind.get("NavigationLink3D", "get_navigation_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationLink3D.mb_get_navigation_layers, livePtr)
  }

  /** NavigationLink3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layerNumber: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_navigation_layer_value == null) gdext.classes.NavigationLink3D.mb_set_navigation_layer_value = MethodBind.get("NavigationLink3D", "set_navigation_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationLink3D.mb_set_navigation_layer_value, livePtr, layerNumber, value)
  }

  /** NavigationLink3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layerNumber: Long): Boolean = {
    if (gdext.classes.NavigationLink3D.mb_get_navigation_layer_value == null) gdext.classes.NavigationLink3D.mb_get_navigation_layer_value = MethodBind.get("NavigationLink3D", "get_navigation_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationLink3D.mb_get_navigation_layer_value, livePtr, layerNumber)
  }

  /** NavigationLink3D.set_start_position */
  final def setStartPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_start_position == null) gdext.classes.NavigationLink3D.mb_set_start_position = MethodBind.get("NavigationLink3D", "set_start_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_start_position, livePtr, position)
  }

  /** NavigationLink3D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationLink3D.mb_get_start_position == null) gdext.classes.NavigationLink3D.mb_get_start_position = MethodBind.get("NavigationLink3D", "get_start_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationLink3D.mb_get_start_position, livePtr)
  }

  /** NavigationLink3D.set_end_position */
  final def setEndPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_end_position == null) gdext.classes.NavigationLink3D.mb_set_end_position = MethodBind.get("NavigationLink3D", "set_end_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_end_position, livePtr, position)
  }

  /** NavigationLink3D.get_end_position */
  final def getEndPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationLink3D.mb_get_end_position == null) gdext.classes.NavigationLink3D.mb_get_end_position = MethodBind.get("NavigationLink3D", "get_end_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationLink3D.mb_get_end_position, livePtr)
  }

  /** NavigationLink3D.set_global_start_position */
  final def setGlobalStartPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_global_start_position == null) gdext.classes.NavigationLink3D.mb_set_global_start_position = MethodBind.get("NavigationLink3D", "set_global_start_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_global_start_position, livePtr, position)
  }

  /** NavigationLink3D.get_global_start_position */
  final def getGlobalStartPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationLink3D.mb_get_global_start_position == null) gdext.classes.NavigationLink3D.mb_get_global_start_position = MethodBind.get("NavigationLink3D", "get_global_start_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationLink3D.mb_get_global_start_position, livePtr)
  }

  /** NavigationLink3D.set_global_end_position */
  final def setGlobalEndPosition(position: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_global_end_position == null) gdext.classes.NavigationLink3D.mb_set_global_end_position = MethodBind.get("NavigationLink3D", "set_global_end_position", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_global_end_position, livePtr, position)
  }

  /** NavigationLink3D.get_global_end_position */
  final def getGlobalEndPosition(): gdext.builtin.Vector3 = {
    if (gdext.classes.NavigationLink3D.mb_get_global_end_position == null) gdext.classes.NavigationLink3D.mb_get_global_end_position = MethodBind.get("NavigationLink3D", "get_global_end_position", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.NavigationLink3D.mb_get_global_end_position, livePtr)
  }

  /** NavigationLink3D.set_enter_cost */
  final def setEnterCost(enterCost: Double): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_enter_cost == null) gdext.classes.NavigationLink3D.mb_set_enter_cost = MethodBind.get("NavigationLink3D", "set_enter_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_enter_cost, livePtr, enterCost)
  }

  /** NavigationLink3D.get_enter_cost */
  final def getEnterCost(): Double = {
    if (gdext.classes.NavigationLink3D.mb_get_enter_cost == null) gdext.classes.NavigationLink3D.mb_get_enter_cost = MethodBind.get("NavigationLink3D", "get_enter_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationLink3D.mb_get_enter_cost, livePtr)
  }

  /** NavigationLink3D.set_travel_cost */
  final def setTravelCost(travelCost: Double): Unit = {
    if (gdext.classes.NavigationLink3D.mb_set_travel_cost == null) gdext.classes.NavigationLink3D.mb_set_travel_cost = MethodBind.get("NavigationLink3D", "set_travel_cost", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationLink3D.mb_set_travel_cost, livePtr, travelCost)
  }

  /** NavigationLink3D.get_travel_cost */
  final def getTravelCost(): Double = {
    if (gdext.classes.NavigationLink3D.mb_get_travel_cost == null) gdext.classes.NavigationLink3D.mb_get_travel_cost = MethodBind.get("NavigationLink3D", "get_travel_cost", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationLink3D.mb_get_travel_cost, livePtr)
  }

}

object NavigationLink3D {
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_bidirectional: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_bidirectional: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_navigation_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_end_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_end_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_start_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_global_end_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_global_end_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enter_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enter_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_travel_cost: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_travel_cost: GDExtensionMethodBindPtr = null
}
