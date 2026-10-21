package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGCylinder3D`, extends `CSGPrimitive3D`. */
abstract class CSGCylinder3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGCylinder3D"

  /** CSGCylinder3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_radius == null) gdext.classes.CSGCylinder3D.mb_set_radius = MethodBind.get("CSGCylinder3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_radius, livePtr, radius)
  }

  /** CSGCylinder3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CSGCylinder3D.mb_get_radius == null) gdext.classes.CSGCylinder3D.mb_get_radius = MethodBind.get("CSGCylinder3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGCylinder3D.mb_get_radius, livePtr)
  }

  /** CSGCylinder3D.set_height */
  final def setHeight(height: Double): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_height == null) gdext.classes.CSGCylinder3D.mb_set_height = MethodBind.get("CSGCylinder3D", "set_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_height, livePtr, height)
  }

  /** CSGCylinder3D.get_height */
  final def getHeight(): Double = {
    if (gdext.classes.CSGCylinder3D.mb_get_height == null) gdext.classes.CSGCylinder3D.mb_get_height = MethodBind.get("CSGCylinder3D", "get_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGCylinder3D.mb_get_height, livePtr)
  }

  /** CSGCylinder3D.set_sides */
  final def setSides(sides: Long): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_sides == null) gdext.classes.CSGCylinder3D.mb_set_sides = MethodBind.get("CSGCylinder3D", "set_sides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_sides, livePtr, sides)
  }

  /** CSGCylinder3D.get_sides */
  final def getSides(): Long = {
    if (gdext.classes.CSGCylinder3D.mb_get_sides == null) gdext.classes.CSGCylinder3D.mb_get_sides = MethodBind.get("CSGCylinder3D", "get_sides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGCylinder3D.mb_get_sides, livePtr)
  }

  /** CSGCylinder3D.set_cone */
  final def setCone(cone: Boolean): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_cone == null) gdext.classes.CSGCylinder3D.mb_set_cone = MethodBind.get("CSGCylinder3D", "set_cone", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_cone, livePtr, cone)
  }

  /** CSGCylinder3D.is_cone */
  final def isCone(): Boolean = {
    if (gdext.classes.CSGCylinder3D.mb_is_cone == null) gdext.classes.CSGCylinder3D.mb_is_cone = MethodBind.get("CSGCylinder3D", "is_cone", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGCylinder3D.mb_is_cone, livePtr)
  }

  /** CSGCylinder3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_material == null) gdext.classes.CSGCylinder3D.mb_set_material = MethodBind.get("CSGCylinder3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGCylinder3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGCylinder3D.mb_get_material == null) gdext.classes.CSGCylinder3D.mb_get_material = MethodBind.get("CSGCylinder3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGCylinder3D.mb_get_material, livePtr))
  }

  /** CSGCylinder3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit = {
    if (gdext.classes.CSGCylinder3D.mb_set_smooth_faces == null) gdext.classes.CSGCylinder3D.mb_set_smooth_faces = MethodBind.get("CSGCylinder3D", "set_smooth_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGCylinder3D.mb_set_smooth_faces, livePtr, smooth_faces)
  }

  /** CSGCylinder3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean = {
    if (gdext.classes.CSGCylinder3D.mb_get_smooth_faces == null) gdext.classes.CSGCylinder3D.mb_get_smooth_faces = MethodBind.get("CSGCylinder3D", "get_smooth_faces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGCylinder3D.mb_get_smooth_faces, livePtr)
  }

}

object CSGCylinder3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cone: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cone: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_smooth_faces: GDExtensionMethodBindPtr = null
}
