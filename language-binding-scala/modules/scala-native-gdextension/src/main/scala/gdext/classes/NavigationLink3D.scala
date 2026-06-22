package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationLink3D`, extends `Node3D`. */
abstract class NavigationLink3D extends Node3D {

  /** NavigationLink3D.set_enabled */
  final def setEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationLink3D.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationLink3D", "is_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationLink3D.set_bidirectional */
  final def setBidirectional(bidirectional: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_bidirectional", 2586408642L), hostObject.objectPtr, bidirectional)

  /** NavigationLink3D.is_bidirectional */
  final def isBidirectional(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationLink3D", "is_bidirectional", 36873697L), hostObject.objectPtr)

  /** NavigationLink3D.set_navigation_layers */
  final def setNavigationLayers(navigation_layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_navigation_layers", 1286410249L), hostObject.objectPtr, navigation_layers)

  /** NavigationLink3D.get_navigation_layers */
  final def getNavigationLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationLink3D", "get_navigation_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationLink3D.set_navigation_layer_value */
  final def setNavigationLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationLink3D", "set_navigation_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationLink3D.get_navigation_layer_value */
  final def getNavigationLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationLink3D", "get_navigation_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationLink3D.set_start_position */
  final def setStartPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_start_position", 3460891852L), hostObject.objectPtr, position)

  /** NavigationLink3D.get_start_position */
  final def getStartPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationLink3D", "get_start_position", 3360562783L), hostObject.objectPtr)

  /** NavigationLink3D.set_end_position */
  final def setEndPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_end_position", 3460891852L), hostObject.objectPtr, position)

  /** NavigationLink3D.get_end_position */
  final def getEndPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationLink3D", "get_end_position", 3360562783L), hostObject.objectPtr)

  /** NavigationLink3D.set_global_start_position */
  final def setGlobalStartPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_global_start_position", 3460891852L), hostObject.objectPtr, position)

  /** NavigationLink3D.get_global_start_position */
  final def getGlobalStartPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationLink3D", "get_global_start_position", 3360562783L), hostObject.objectPtr)

  /** NavigationLink3D.set_global_end_position */
  final def setGlobalEndPosition(position: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_global_end_position", 3460891852L), hostObject.objectPtr, position)

  /** NavigationLink3D.get_global_end_position */
  final def getGlobalEndPosition(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationLink3D", "get_global_end_position", 3360562783L), hostObject.objectPtr)

  /** NavigationLink3D.set_enter_cost */
  final def setEnterCost(enter_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_enter_cost", 373806689L), hostObject.objectPtr, enter_cost)

  /** NavigationLink3D.get_enter_cost */
  final def getEnterCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationLink3D", "get_enter_cost", 1740695150L), hostObject.objectPtr)

  /** NavigationLink3D.set_travel_cost */
  final def setTravelCost(travel_cost: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationLink3D", "set_travel_cost", 373806689L), hostObject.objectPtr, travel_cost)

  /** NavigationLink3D.get_travel_cost */
  final def getTravelCost(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationLink3D", "get_travel_cost", 1740695150L), hostObject.objectPtr)

}

object NavigationLink3D {
  /** Class metadata for Gd[NavigationLink3D] lifetime management and casting. */
  given GodotClass[NavigationLink3D] with {
    def className = "NavigationLink3D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationLink3D = new NavigationLink3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationLink3D): GodotObject = t.hostObject
  }
}
