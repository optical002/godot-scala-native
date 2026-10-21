package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CSGSphere3D`, extends `CSGPrimitive3D`. */
abstract class CSGSphere3D extends CSGPrimitive3D {
  override def godotClassName: String = "CSGSphere3D"

  /** CSGSphere3D.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.CSGSphere3D.mb_set_radius == null) gdext.classes.CSGSphere3D.mb_set_radius = MethodBind.get("CSGSphere3D", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CSGSphere3D.mb_set_radius, livePtr, radius)
  }

  /** CSGSphere3D.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.CSGSphere3D.mb_get_radius == null) gdext.classes.CSGSphere3D.mb_get_radius = MethodBind.get("CSGSphere3D", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CSGSphere3D.mb_get_radius, livePtr)
  }

  /** CSGSphere3D.set_radial_segments */
  final def setRadialSegments(radial_segments: Long): Unit = {
    if (gdext.classes.CSGSphere3D.mb_set_radial_segments == null) gdext.classes.CSGSphere3D.mb_set_radial_segments = MethodBind.get("CSGSphere3D", "set_radial_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGSphere3D.mb_set_radial_segments, livePtr, radial_segments)
  }

  /** CSGSphere3D.get_radial_segments */
  final def getRadialSegments(): Long = {
    if (gdext.classes.CSGSphere3D.mb_get_radial_segments == null) gdext.classes.CSGSphere3D.mb_get_radial_segments = MethodBind.get("CSGSphere3D", "get_radial_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGSphere3D.mb_get_radial_segments, livePtr)
  }

  /** CSGSphere3D.set_rings */
  final def setRings(rings: Long): Unit = {
    if (gdext.classes.CSGSphere3D.mb_set_rings == null) gdext.classes.CSGSphere3D.mb_set_rings = MethodBind.get("CSGSphere3D", "set_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CSGSphere3D.mb_set_rings, livePtr, rings)
  }

  /** CSGSphere3D.get_rings */
  final def getRings(): Long = {
    if (gdext.classes.CSGSphere3D.mb_get_rings == null) gdext.classes.CSGSphere3D.mb_get_rings = MethodBind.get("CSGSphere3D", "get_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CSGSphere3D.mb_get_rings, livePtr)
  }

  /** CSGSphere3D.set_smooth_faces */
  final def setSmoothFaces(smooth_faces: Boolean): Unit = {
    if (gdext.classes.CSGSphere3D.mb_set_smooth_faces == null) gdext.classes.CSGSphere3D.mb_set_smooth_faces = MethodBind.get("CSGSphere3D", "set_smooth_faces", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CSGSphere3D.mb_set_smooth_faces, livePtr, smooth_faces)
  }

  /** CSGSphere3D.get_smooth_faces */
  final def getSmoothFaces(): Boolean = {
    if (gdext.classes.CSGSphere3D.mb_get_smooth_faces == null) gdext.classes.CSGSphere3D.mb_get_smooth_faces = MethodBind.get("CSGSphere3D", "get_smooth_faces", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CSGSphere3D.mb_get_smooth_faces, livePtr)
  }

  /** CSGSphere3D.set_material */
  final def setMaterial(material: Material): Unit = {
    if (gdext.classes.CSGSphere3D.mb_set_material == null) gdext.classes.CSGSphere3D.mb_set_material = MethodBind.get("CSGSphere3D", "set_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.CSGSphere3D.mb_set_material, livePtr, Wrappers.handle(material))
  }

  /** CSGSphere3D.get_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMaterial(): Material = {
    if (gdext.classes.CSGSphere3D.mb_get_material == null) gdext.classes.CSGSphere3D.mb_get_material = MethodBind.get("CSGSphere3D", "get_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.CSGSphere3D.mb_get_material, livePtr))
  }

}

object CSGSphere3D {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_smooth_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_smooth_faces: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_material: GDExtensionMethodBindPtr = null
}
