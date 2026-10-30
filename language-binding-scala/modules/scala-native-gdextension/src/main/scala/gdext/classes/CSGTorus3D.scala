package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGTorus3D`, extends `CSGPrimitive3D`. */
abstract class CSGTorus3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGTorus3D"

  /** CSGTorus3D.set_inner_radius */
  final def setInnerRadius(radius: Double): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_inner_radius == null) gdext.classes.CSGTorus3D.mb_set_inner_radius = MethodBind.get("CSGTorus3D", "set_inner_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_inner_radius, livePtr, radius)
  }

  /** CSGTorus3D.get_inner_radius */
  final def getInnerRadius(): Double = {
    if (gdext.classes.CSGTorus3D.mb_get_inner_radius == null) gdext.classes.CSGTorus3D.mb_get_inner_radius = MethodBind.get("CSGTorus3D", "get_inner_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGTorus3D.mb_get_inner_radius, livePtr)
  }

  /** CSGTorus3D.set_outer_radius */
  final def setOuterRadius(radius: Double): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_outer_radius == null) gdext.classes.CSGTorus3D.mb_set_outer_radius = MethodBind.get("CSGTorus3D", "set_outer_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_outer_radius, livePtr, radius)
  }

  /** CSGTorus3D.get_outer_radius */
  final def getOuterRadius(): Double = {
    if (gdext.classes.CSGTorus3D.mb_get_outer_radius == null) gdext.classes.CSGTorus3D.mb_get_outer_radius = MethodBind.get("CSGTorus3D", "get_outer_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGTorus3D.mb_get_outer_radius, livePtr)
  }

  /** CSGTorus3D.set_sides */
  final def setSides(sides: Long): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_sides == null) gdext.classes.CSGTorus3D.mb_set_sides = MethodBind.get("CSGTorus3D", "set_sides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_sides, livePtr, sides)
  }

  /** CSGTorus3D.get_sides */
  final def getSides(): Long = {
    if (gdext.classes.CSGTorus3D.mb_get_sides == null) gdext.classes.CSGTorus3D.mb_get_sides = MethodBind.get("CSGTorus3D", "get_sides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGTorus3D.mb_get_sides, livePtr)
  }

  /** CSGTorus3D.set_ring_sides */
  final def setRingSides(sides: Long): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_ring_sides == null) gdext.classes.CSGTorus3D.mb_set_ring_sides = MethodBind.get("CSGTorus3D", "set_ring_sides", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_ring_sides, livePtr, sides)
  }

  /** CSGTorus3D.get_ring_sides */
  final def getRingSides(): Long = {
    if (gdext.classes.CSGTorus3D.mb_get_ring_sides == null) gdext.classes.CSGTorus3D.mb_get_ring_sides = MethodBind.get("CSGTorus3D", "get_ring_sides", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGTorus3D.mb_get_ring_sides, livePtr)
  }

  /** CSGTorus3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_material == null) gdext.classes.CSGTorus3D.mb_set_material = MethodBind.get("CSGTorus3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGTorus3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGTorus3D.mb_get_material == null) gdext.classes.CSGTorus3D.mb_get_material = MethodBind.get("CSGTorus3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGTorus3D.mb_get_material, livePtr))
  }

  /** CSGTorus3D.set_smooth_faces */
  final def setSmoothFaces(smoothFaces: Boolean): Unit = {
    if (gdext.classes.CSGTorus3D.mb_set_smooth_faces == null) gdext.classes.CSGTorus3D.mb_set_smooth_faces = MethodBind.get("CSGTorus3D", "set_smooth_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGTorus3D.mb_set_smooth_faces, livePtr, smoothFaces)
  }

  /** CSGTorus3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean = {
    if (gdext.classes.CSGTorus3D.mb_get_smooth_faces == null) gdext.classes.CSGTorus3D.mb_get_smooth_faces = MethodBind.get("CSGTorus3D", "get_smooth_faces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGTorus3D.mb_get_smooth_faces, livePtr)
  }

}

object CSGTorus3D {
  private[classes] var mb_set_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outer_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outer_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ring_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_ring_sides: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_smooth_faces: GDExtensionMethodBindPtr = null
}
