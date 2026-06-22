package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationLink2D`, extends `Node2D`. */
abstract class NavigationLink2D extends Node2D {

  /** NavigationLink2D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationLink2D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationLink2D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationLink2D.set_bidirectional */
  final def setBidirectional(bidirectional: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_bidirectional", 2586408642L), hostObject.objectPtr, bidirectional)

  /** NavigationLink2D.is_bidirectional */
  final def isBidirectional(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationLink2D", "is_bidirectional", 36873697L), hostObject.objectPtr)

  /** NavigationLink2D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationLink2D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationLink2D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationLink2D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationLink2D", "set_navigation_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationLink2D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationLink2D", "get_navigation_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationLink2D.set_start_position */
  final def setStartPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_start_position", 743155724L), hostObject.objectPtr, position)

  /** NavigationLink2D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationLink2D", "get_start_position", 3341600327L), hostObject.objectPtr)

  /** NavigationLink2D.set_end_position */
  final def setEndPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_end_position", 743155724L), hostObject.objectPtr, position)

  /** NavigationLink2D.get_end_position */
  final def getEndPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationLink2D", "get_end_position", 3341600327L), hostObject.objectPtr)

  /** NavigationLink2D.set_global_start_position */
  final def setGlobalStartPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_global_start_position", 743155724L), hostObject.objectPtr, position)

  /** NavigationLink2D.get_global_start_position */
  final def getGlobalStartPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationLink2D", "get_global_start_position", 3341600327L), hostObject.objectPtr)

  /** NavigationLink2D.set_global_end_position */
  final def setGlobalEndPosition(position: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_global_end_position", 743155724L), hostObject.objectPtr, position)

  /** NavigationLink2D.get_global_end_position */
  final def getGlobalEndPosition(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationLink2D", "get_global_end_position", 3341600327L), hostObject.objectPtr)

  /** NavigationLink2D.set_enter_cost */
  final def setEnterCost(enter_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_enter_cost", 373806689L), hostObject.objectPtr, enter_cost)

  /** NavigationLink2D.get_enter_cost */
  final def getEnterCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationLink2D", "get_enter_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationLink2D.set_travel_cost */
  final def setTravelCost(travel_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink2D", "set_travel_cost", 373806689L), hostObject.objectPtr, travel_cost)

  /** NavigationLink2D.get_travel_cost */
  final def getTravelCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationLink2D", "get_travel_cost", 1740695150L), hostObject.objectPtr)

}

object NavigationLink2D {
  /** Class metadata for Gd[NavigationLink2D] lifetime management and casting. */
  given GodotClass[NavigationLink2D] with {
    def className = "NavigationLink2D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationLink2D = new NavigationLink2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationLink2D): GodotObject = t.hostObject
  }
}
