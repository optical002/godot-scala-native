package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `NavigationObstacle3D`, extends `Node3D`. */
abstract class NavigationObstacle3D extends Node3D {

  /** NavigationObstacle3D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_avoidance_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle3D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle3D", "get_avoidance_enabled", 36873697L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_radius */
  final def setRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_radius", 373806689L), hostObject.objectPtr, radius)

  /** NavigationObstacle3D.get_radius */
  final def getRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationObstacle3D", "get_radius", 1740695150L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_height */
  final def setHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_height", 373806689L), hostObject.objectPtr, height)

  /** NavigationObstacle3D.get_height */
  final def getHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("NavigationObstacle3D", "get_height", 1740695150L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_velocity", 3460891852L), hostObject.objectPtr, velocity)

  /** NavigationObstacle3D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("NavigationObstacle3D", "get_velocity", 3360562783L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_avoidance_layers", 1286410249L), hostObject.objectPtr, layers)

  /** NavigationObstacle3D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long =
    Ptrcall.call0[Long](MethodBind.get("NavigationObstacle3D", "get_avoidance_layers", 3905245786L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layer_number: Long, value: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("NavigationObstacle3D", "set_avoidance_layer_value", 300928843L), hostObject.objectPtr, layer_number, value)

  /** NavigationObstacle3D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layer_number: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("NavigationObstacle3D", "get_avoidance_layer_value", 1116898809L), hostObject.objectPtr, layer_number)

  /** NavigationObstacle3D.set_use_3d_avoidance */
  final def setUse3dAvoidance(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_use_3d_avoidance", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle3D.get_use_3d_avoidance */
  final def getUse3dAvoidance(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle3D", "get_use_3d_avoidance", 36873697L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_affect_navigation_mesh */
  final def setAffectNavigationMesh(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_affect_navigation_mesh", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle3D.get_affect_navigation_mesh */
  final def getAffectNavigationMesh(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle3D", "get_affect_navigation_mesh", 36873697L), hostObject.objectPtr)

  /** NavigationObstacle3D.set_carve_navigation_mesh */
  final def setCarveNavigationMesh(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("NavigationObstacle3D", "set_carve_navigation_mesh", 2586408642L), hostObject.objectPtr, enabled)

  /** NavigationObstacle3D.get_carve_navigation_mesh */
  final def getCarveNavigationMesh(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("NavigationObstacle3D", "get_carve_navigation_mesh", 36873697L), hostObject.objectPtr)

}

object NavigationObstacle3D {
  /** Class metadata for Gd[NavigationObstacle3D] lifetime management and casting. */
  given GodotClass[NavigationObstacle3D] with {
    def className = "NavigationObstacle3D"
    def isRefCounted = false
    def wrap(o: GodotObject): NavigationObstacle3D = new NavigationObstacle3D {}.withHost(o.objectPtr)
    def unwrap(t: NavigationObstacle3D): GodotObject = t.hostObject
  }
}
