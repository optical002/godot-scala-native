package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Light3D`, extends `VisualInstance3D`. */
abstract class Light3D extends VisualInstance3D {

  /** Light3D.set_editor_only */
  final def setEditorOnly(editor_only: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_editor_only", 2586408642L), hostObject.objectPtr, editor_only)

  /** Light3D.is_editor_only */
  final def isEditorOnly(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light3D", "is_editor_only", 36873697L), hostObject.objectPtr)

  /** Light3D.set_param */
  final def setParam(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Light3D", "set_param", 1722734213L), hostObject.objectPtr, param, value)

  /** Light3D.get_param */
  final def getParam(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("Light3D", "get_param", 1844084987L), hostObject.objectPtr, param)

  /** Light3D.set_shadow */
  final def setShadow(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_shadow", 2586408642L), hostObject.objectPtr, enabled)

  /** Light3D.has_shadow */
  final def hasShadow(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light3D", "has_shadow", 36873697L), hostObject.objectPtr)

  /** Light3D.set_negative */
  final def setNegative(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_negative", 2586408642L), hostObject.objectPtr, enabled)

  /** Light3D.is_negative */
  final def isNegative(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light3D", "is_negative", 36873697L), hostObject.objectPtr)

  /** Light3D.set_cull_mask */
  final def setCullMask(cull_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_cull_mask", 1286410249L), hostObject.objectPtr, cull_mask)

  /** Light3D.get_cull_mask */
  final def getCullMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light3D", "get_cull_mask", 3905245786L), hostObject.objectPtr)

  /** Light3D.set_enable_distance_fade */
  final def setEnableDistanceFade(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_enable_distance_fade", 2586408642L), hostObject.objectPtr, enable)

  /** Light3D.is_distance_fade_enabled */
  final def isDistanceFadeEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light3D", "is_distance_fade_enabled", 36873697L), hostObject.objectPtr)

  /** Light3D.set_distance_fade_begin */
  final def setDistanceFadeBegin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_distance_fade_begin", 373806689L), hostObject.objectPtr, distance)

  /** Light3D.get_distance_fade_begin */
  final def getDistanceFadeBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light3D", "get_distance_fade_begin", 1740695150L), hostObject.objectPtr)

  /** Light3D.set_distance_fade_shadow */
  final def setDistanceFadeShadow(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_distance_fade_shadow", 373806689L), hostObject.objectPtr, distance)

  /** Light3D.get_distance_fade_shadow */
  final def getDistanceFadeShadow(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light3D", "get_distance_fade_shadow", 1740695150L), hostObject.objectPtr)

  /** Light3D.set_distance_fade_length */
  final def setDistanceFadeLength(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_distance_fade_length", 373806689L), hostObject.objectPtr, distance)

  /** Light3D.get_distance_fade_length */
  final def getDistanceFadeLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light3D", "get_distance_fade_length", 1740695150L), hostObject.objectPtr)

  /** Light3D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** Light3D.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Light3D", "get_color", 3444240500L), hostObject.objectPtr)

  /** Light3D.set_shadow_reverse_cull_face */
  final def setShadowReverseCullFace(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_shadow_reverse_cull_face", 2586408642L), hostObject.objectPtr, enable)

  /** Light3D.get_shadow_reverse_cull_face */
  final def getShadowReverseCullFace(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Light3D", "get_shadow_reverse_cull_face", 36873697L), hostObject.objectPtr)

  /** Light3D.set_shadow_caster_mask */
  final def setShadowCasterMask(caster_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_shadow_caster_mask", 1286410249L), hostObject.objectPtr, caster_mask)

  /** Light3D.get_shadow_caster_mask */
  final def getShadowCasterMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light3D", "get_shadow_caster_mask", 3905245786L), hostObject.objectPtr)

  /** Light3D.set_bake_mode */
  final def setBakeMode(bake_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_bake_mode", 37739303L), hostObject.objectPtr, bake_mode)

  /** Light3D.get_bake_mode */
  final def getBakeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Light3D", "get_bake_mode", 371737608L), hostObject.objectPtr)

  /** Light3D.set_projector */
  final def setProjector(projector: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_projector", 4051416890L), hostObject.objectPtr, projector.hostObject)

  /** Light3D.get_projector */
  final def getProjector(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Light3D", "get_projector", 3635182373L), hostObject.objectPtr)

  /** Light3D.set_temperature */
  final def setTemperature(temperature: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Light3D", "set_temperature", 373806689L), hostObject.objectPtr, temperature)

  /** Light3D.get_temperature */
  final def getTemperature(): Double =
    Ptrcall.call0[Double](MethodBind.get("Light3D", "get_temperature", 1740695150L), hostObject.objectPtr)

  /** Light3D.get_correlated_color */
  final def getCorrelatedColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("Light3D", "get_correlated_color", 3444240500L), hostObject.objectPtr)

}

object Light3D {
  /** Class metadata for Gd[Light3D] lifetime management and casting. */
  given GodotClass[Light3D] with {
    def className = "Light3D"
    def isRefCounted = false
    def wrap(o: GodotObject): Light3D = new Light3D {}.withHost(o.objectPtr)
    def unwrap(t: Light3D): GodotObject = t.hostObject
  }
}
