package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `GLTFLight`, extends `Resource`. */
abstract class GLTFLight extends Resource {
  override def godotClassName: String = "GLTFLight"

  /** GLTFLight.to_node */
  final def toNode(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GLTFLight", "to_node", 2040811672L), hostObject.objectPtr)

  /** GLTFLight.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("GLTFLight", "get_color", 3200896285L), hostObject.objectPtr)

  /** GLTFLight.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** GLTFLight.get_intensity */
  final def getIntensity(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFLight", "get_intensity", 191475506L), hostObject.objectPtr)

  /** GLTFLight.set_intensity */
  final def setIntensity(intensity: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_intensity", 373806689L), hostObject.objectPtr, intensity)

  /** GLTFLight.get_light_type */
  final def getLightType(): String =
    Ptrcall.call0[String](MethodBind.get("GLTFLight", "get_light_type", 2841200299L), hostObject.objectPtr)

  /** GLTFLight.set_light_type */
  final def setLightType(light_type: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_light_type", 83702148L), hostObject.objectPtr, light_type)

  /** GLTFLight.get_range */
  final def getRange(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFLight", "get_range", 191475506L), hostObject.objectPtr)

  /** GLTFLight.set_range */
  final def setRange(range: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_range", 373806689L), hostObject.objectPtr, range)

  /** GLTFLight.get_inner_cone_angle */
  final def getInnerConeAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFLight", "get_inner_cone_angle", 191475506L), hostObject.objectPtr)

  /** GLTFLight.set_inner_cone_angle */
  final def setInnerConeAngle(inner_cone_angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_inner_cone_angle", 373806689L), hostObject.objectPtr, inner_cone_angle)

  /** GLTFLight.get_outer_cone_angle */
  final def getOuterConeAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("GLTFLight", "get_outer_cone_angle", 191475506L), hostObject.objectPtr)

  /** GLTFLight.set_outer_cone_angle */
  final def setOuterConeAngle(outer_cone_angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GLTFLight", "set_outer_cone_angle", 373806689L), hostObject.objectPtr, outer_cone_angle)

}
