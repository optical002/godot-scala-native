package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `NavigationObstacle2D`, extends `Node2D`. */
abstract class NavigationObstacle2D extends Node2D {
  override def godotClassName: String = "NavigationObstacle2D"

  /** NavigationObstacle2D.set_avoidance_enabled */
  final def setAvoidanceEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_avoidance_enabled == null) gdext.classes.NavigationObstacle2D.mb_set_avoidance_enabled = MethodBind.get("NavigationObstacle2D", "set_avoidance_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_avoidance_enabled, livePtr, enabled)
  }

  /** NavigationObstacle2D.get_avoidance_enabled */
  final def getAvoidanceEnabled(): Boolean = {
    if (gdext.classes.NavigationObstacle2D.mb_get_avoidance_enabled == null) gdext.classes.NavigationObstacle2D.mb_get_avoidance_enabled = MethodBind.get("NavigationObstacle2D", "get_avoidance_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationObstacle2D.mb_get_avoidance_enabled, livePtr)
  }

  /** NavigationObstacle2D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_radius == null) gdext.classes.NavigationObstacle2D.mb_set_radius = MethodBind.get("NavigationObstacle2D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_radius, livePtr, radius)
  }

  /** NavigationObstacle2D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.NavigationObstacle2D.mb_get_radius == null) gdext.classes.NavigationObstacle2D.mb_get_radius = MethodBind.get("NavigationObstacle2D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.NavigationObstacle2D.mb_get_radius, livePtr)
  }

  /** NavigationObstacle2D.set_velocity */
  final def setVelocity(velocity: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_velocity == null) gdext.classes.NavigationObstacle2D.mb_set_velocity = MethodBind.get("NavigationObstacle2D", "set_velocity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_velocity, livePtr, velocity)
  }

  /** NavigationObstacle2D.get_velocity */
  final def getVelocity(): gdext.builtin.Vector2 = {
    if (gdext.classes.NavigationObstacle2D.mb_get_velocity == null) gdext.classes.NavigationObstacle2D.mb_get_velocity = MethodBind.get("NavigationObstacle2D", "get_velocity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.NavigationObstacle2D.mb_get_velocity, livePtr)
  }

  /** NavigationObstacle2D.set_avoidance_layers */
  final def setAvoidanceLayers(layers: Long): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_avoidance_layers == null) gdext.classes.NavigationObstacle2D.mb_set_avoidance_layers = MethodBind.get("NavigationObstacle2D", "set_avoidance_layers", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_avoidance_layers, livePtr, layers)
  }

  /** NavigationObstacle2D.get_avoidance_layers */
  final def getAvoidanceLayers(): Long = {
    if (gdext.classes.NavigationObstacle2D.mb_get_avoidance_layers == null) gdext.classes.NavigationObstacle2D.mb_get_avoidance_layers = MethodBind.get("NavigationObstacle2D", "get_avoidance_layers", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.NavigationObstacle2D.mb_get_avoidance_layers, livePtr)
  }

  /** NavigationObstacle2D.set_avoidance_layer_value */
  final def setAvoidanceLayerValue(layer_number: Long, value: Boolean): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_avoidance_layer_value == null) gdext.classes.NavigationObstacle2D.mb_set_avoidance_layer_value = MethodBind.get("NavigationObstacle2D", "set_avoidance_layer_value", 300928843L)
    Ptrcall.callVoid2(gdext.classes.NavigationObstacle2D.mb_set_avoidance_layer_value, livePtr, layer_number, value)
  }

  /** NavigationObstacle2D.get_avoidance_layer_value */
  final def getAvoidanceLayerValue(layer_number: Long): Boolean = {
    if (gdext.classes.NavigationObstacle2D.mb_get_avoidance_layer_value == null) gdext.classes.NavigationObstacle2D.mb_get_avoidance_layer_value = MethodBind.get("NavigationObstacle2D", "get_avoidance_layer_value", 1116898809L)
    Ptrcall.call1[Long, Boolean](gdext.classes.NavigationObstacle2D.mb_get_avoidance_layer_value, livePtr, layer_number)
  }

  /** NavigationObstacle2D.set_affect_navigation_mesh */
  final def setAffectNavigationMesh(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_affect_navigation_mesh == null) gdext.classes.NavigationObstacle2D.mb_set_affect_navigation_mesh = MethodBind.get("NavigationObstacle2D", "set_affect_navigation_mesh", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_affect_navigation_mesh, livePtr, enabled)
  }

  /** NavigationObstacle2D.get_affect_navigation_mesh */
  final def getAffectNavigationMesh(): Boolean = {
    if (gdext.classes.NavigationObstacle2D.mb_get_affect_navigation_mesh == null) gdext.classes.NavigationObstacle2D.mb_get_affect_navigation_mesh = MethodBind.get("NavigationObstacle2D", "get_affect_navigation_mesh", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationObstacle2D.mb_get_affect_navigation_mesh, livePtr)
  }

  /** NavigationObstacle2D.set_carve_navigation_mesh */
  final def setCarveNavigationMesh(enabled: Boolean): Unit = {
    if (gdext.classes.NavigationObstacle2D.mb_set_carve_navigation_mesh == null) gdext.classes.NavigationObstacle2D.mb_set_carve_navigation_mesh = MethodBind.get("NavigationObstacle2D", "set_carve_navigation_mesh", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.NavigationObstacle2D.mb_set_carve_navigation_mesh, livePtr, enabled)
  }

  /** NavigationObstacle2D.get_carve_navigation_mesh */
  final def getCarveNavigationMesh(): Boolean = {
    if (gdext.classes.NavigationObstacle2D.mb_get_carve_navigation_mesh == null) gdext.classes.NavigationObstacle2D.mb_get_carve_navigation_mesh = MethodBind.get("NavigationObstacle2D", "get_carve_navigation_mesh", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.NavigationObstacle2D.mb_get_carve_navigation_mesh, livePtr)
  }

}

object NavigationObstacle2D {
  private[classes] var mb_set_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_layers: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_avoidance_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_avoidance_layer_value: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_affect_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_affect_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_carve_navigation_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_carve_navigation_mesh: GDExtensionMethodBindPtr = null
}
