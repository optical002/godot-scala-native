package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationObstacle2D`, extends `Node2D`. */
abstract class NavigationObstacle2D extends Node2D {

  /** NavigationObstacle2D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_avoidance_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle2D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle2D", "get_avoidance_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationObstacle2D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationObstacle2D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationObstacle2D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationObstacle2D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_velocity", 743155724L), hostObject.objectPtr, velocity)

  /** NavigationObstacle2D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("NavigationObstacle2D", "get_velocity", 3341600327L), hostObject.objectPtr)

  /** NavigationObstacle2D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_avoidance_layers", 1286410249L), hostObject.objectPtr, layers)

  /** NavigationObstacle2D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationObstacle2D", "get_avoidance_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationObstacle2D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationObstacle2D", "set_avoidance_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationObstacle2D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationObstacle2D", "get_avoidance_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationObstacle2D.set_affect_navigation_mesh */
  final def setAffectNavigationMesh(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_affect_navigation_mesh", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle2D.get_affect_navigation_mesh */
  final def getAffectNavigationMesh(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle2D", "get_affect_navigation_mesh", 36873697L), hostObject.objectPtr)

  /** NavigationObstacle2D.set_carve_navigation_mesh */
  final def setCarveNavigationMesh(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle2D", "set_carve_navigation_mesh", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle2D.get_carve_navigation_mesh */
  final def getCarveNavigationMesh(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle2D", "get_carve_navigation_mesh", 36873697L), hostObject.objectPtr)

}

object NavigationObstacle2D {
  /** Class metadata for Gd[NavigationObstacle2D] lifetime management and casting. */
  given GodotClass[NavigationObstacle2D] with {
    def className = "NavigationObstacle2D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationObstacle2D = new NavigationObstacle2D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationObstacle2D): GodotObject = t.hostObject
  }
}
