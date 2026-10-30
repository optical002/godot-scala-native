package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GLTFLight`, extends `Resource`. */
abstract class GLTFLight extends Resource {
  override def godotClassName: String = "GLTFLight"

  /** GLTFLight.to_node */
  final def toNode(): Light3D = {
    if (gdext.classes.GLTFLight.mb_to_node == null) gdext.classes.GLTFLight.mb_to_node = MethodBind.get("GLTFLight", "to_node", 2040811672L)
    Wrappers.borrowed[Light3D](Ptrcall.call0[Long](gdext.classes.GLTFLight.mb_to_node, livePtr))
  }

  /** GLTFLight.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.GLTFLight.mb_get_color == null) gdext.classes.GLTFLight.mb_get_color = MethodBind.get("GLTFLight", "get_color", 3200896285L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.GLTFLight.mb_get_color, livePtr)
  }

  /** GLTFLight.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.GLTFLight.mb_set_color == null) gdext.classes.GLTFLight.mb_set_color = MethodBind.get("GLTFLight", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_color, livePtr, color)
  }

  /** GLTFLight.get_intensity */
  final def getIntensity(): Double = {
    if (gdext.classes.GLTFLight.mb_get_intensity == null) gdext.classes.GLTFLight.mb_get_intensity = MethodBind.get("GLTFLight", "get_intensity", 191475506L)
    Ptrcall.call0[Double](gdext.classes.GLTFLight.mb_get_intensity, livePtr)
  }

  /** GLTFLight.set_intensity */
  final def setIntensity(intensity: Double): Unit = {
    if (gdext.classes.GLTFLight.mb_set_intensity == null) gdext.classes.GLTFLight.mb_set_intensity = MethodBind.get("GLTFLight", "set_intensity", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_intensity, livePtr, intensity)
  }

  /** GLTFLight.get_light_type */
  final def getLightType(): String = {
    if (gdext.classes.GLTFLight.mb_get_light_type == null) gdext.classes.GLTFLight.mb_get_light_type = MethodBind.get("GLTFLight", "get_light_type", 2841200299L)
    Ptrcall.call0[String](gdext.classes.GLTFLight.mb_get_light_type, livePtr)
  }

  /** GLTFLight.set_light_type */
  final def setLightType(lightType: String): Unit = {
    if (gdext.classes.GLTFLight.mb_set_light_type == null) gdext.classes.GLTFLight.mb_set_light_type = MethodBind.get("GLTFLight", "set_light_type", 83702148L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_light_type, livePtr, lightType)
  }

  /** GLTFLight.get_range */
  final def getRange(): Double = {
    if (gdext.classes.GLTFLight.mb_get_range == null) gdext.classes.GLTFLight.mb_get_range = MethodBind.get("GLTFLight", "get_range", 191475506L)
    Ptrcall.call0[Double](gdext.classes.GLTFLight.mb_get_range, livePtr)
  }

  /** GLTFLight.set_range */
  final def setRange(range: Double): Unit = {
    if (gdext.classes.GLTFLight.mb_set_range == null) gdext.classes.GLTFLight.mb_set_range = MethodBind.get("GLTFLight", "set_range", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_range, livePtr, range)
  }

  /** GLTFLight.get_inner_cone_angle */
  final def getInnerConeAngle(): Double = {
    if (gdext.classes.GLTFLight.mb_get_inner_cone_angle == null) gdext.classes.GLTFLight.mb_get_inner_cone_angle = MethodBind.get("GLTFLight", "get_inner_cone_angle", 191475506L)
    Ptrcall.call0[Double](gdext.classes.GLTFLight.mb_get_inner_cone_angle, livePtr)
  }

  /** GLTFLight.set_inner_cone_angle */
  final def setInnerConeAngle(innerConeAngle: Double): Unit = {
    if (gdext.classes.GLTFLight.mb_set_inner_cone_angle == null) gdext.classes.GLTFLight.mb_set_inner_cone_angle = MethodBind.get("GLTFLight", "set_inner_cone_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_inner_cone_angle, livePtr, innerConeAngle)
  }

  /** GLTFLight.get_outer_cone_angle */
  final def getOuterConeAngle(): Double = {
    if (gdext.classes.GLTFLight.mb_get_outer_cone_angle == null) gdext.classes.GLTFLight.mb_get_outer_cone_angle = MethodBind.get("GLTFLight", "get_outer_cone_angle", 191475506L)
    Ptrcall.call0[Double](gdext.classes.GLTFLight.mb_get_outer_cone_angle, livePtr)
  }

  /** GLTFLight.set_outer_cone_angle */
  final def setOuterConeAngle(outerConeAngle: Double): Unit = {
    if (gdext.classes.GLTFLight.mb_set_outer_cone_angle == null) gdext.classes.GLTFLight.mb_set_outer_cone_angle = MethodBind.get("GLTFLight", "set_outer_cone_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GLTFLight.mb_set_outer_cone_angle, livePtr, outerConeAngle)
  }

}

object GLTFLight {
  private[classes] var mb_from_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_to_node: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_intensity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_light_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inner_cone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inner_cone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outer_cone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outer_cone_angle: GDExtensionMethodBindPtr = null

  /** GLTFLight.from_node. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def fromNode(lightNode: Light3D): GLTFLight = {
    if (gdext.classes.GLTFLight.mb_from_node == null) gdext.classes.GLTFLight.mb_from_node = MethodBind.get("GLTFLight", "from_node", 3907677874L)
    Wrappers.owned[GLTFLight](Ptrcall.call1[GodotObject, Long](gdext.classes.GLTFLight.mb_from_node, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr], Wrappers.handle(lightNode)))
  }
}
