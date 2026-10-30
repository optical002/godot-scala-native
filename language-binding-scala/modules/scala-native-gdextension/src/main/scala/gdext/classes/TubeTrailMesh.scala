package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TubeTrailMesh`, extends `PrimitiveMesh`. */
abstract class TubeTrailMesh extends PrimitiveMesh {
  override def godotClassName: String = "TubeTrailMesh"

  /** TubeTrailMesh.set_radius */
  final def setRadius(radius: Double): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_radius == null) gdext.classes.TubeTrailMesh.mb_set_radius = MethodBind.get("TubeTrailMesh", "set_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_radius, livePtr, radius)
  }

  /** TubeTrailMesh.get_radius */
  final def getRadius(): Double = {
    if (gdext.classes.TubeTrailMesh.mb_get_radius == null) gdext.classes.TubeTrailMesh.mb_get_radius = MethodBind.get("TubeTrailMesh", "get_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TubeTrailMesh.mb_get_radius, livePtr)
  }

  /** TubeTrailMesh.set_radial_steps */
  final def setRadialSteps(radialSteps: Long): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_radial_steps == null) gdext.classes.TubeTrailMesh.mb_set_radial_steps = MethodBind.get("TubeTrailMesh", "set_radial_steps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_radial_steps, livePtr, radialSteps)
  }

  /** TubeTrailMesh.get_radial_steps */
  final def getRadialSteps(): Long = {
    if (gdext.classes.TubeTrailMesh.mb_get_radial_steps == null) gdext.classes.TubeTrailMesh.mb_get_radial_steps = MethodBind.get("TubeTrailMesh", "get_radial_steps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TubeTrailMesh.mb_get_radial_steps, livePtr)
  }

  /** TubeTrailMesh.set_sections */
  final def setSections(sections: Long): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_sections == null) gdext.classes.TubeTrailMesh.mb_set_sections = MethodBind.get("TubeTrailMesh", "set_sections", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_sections, livePtr, sections)
  }

  /** TubeTrailMesh.get_sections */
  final def getSections(): Long = {
    if (gdext.classes.TubeTrailMesh.mb_get_sections == null) gdext.classes.TubeTrailMesh.mb_get_sections = MethodBind.get("TubeTrailMesh", "get_sections", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TubeTrailMesh.mb_get_sections, livePtr)
  }

  /** TubeTrailMesh.set_section_length */
  final def setSectionLength(sectionLength: Double): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_section_length == null) gdext.classes.TubeTrailMesh.mb_set_section_length = MethodBind.get("TubeTrailMesh", "set_section_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_section_length, livePtr, sectionLength)
  }

  /** TubeTrailMesh.get_section_length */
  final def getSectionLength(): Double = {
    if (gdext.classes.TubeTrailMesh.mb_get_section_length == null) gdext.classes.TubeTrailMesh.mb_get_section_length = MethodBind.get("TubeTrailMesh", "get_section_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.TubeTrailMesh.mb_get_section_length, livePtr)
  }

  /** TubeTrailMesh.set_section_rings */
  final def setSectionRings(sectionRings: Long): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_section_rings == null) gdext.classes.TubeTrailMesh.mb_set_section_rings = MethodBind.get("TubeTrailMesh", "set_section_rings", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_section_rings, livePtr, sectionRings)
  }

  /** TubeTrailMesh.get_section_rings */
  final def getSectionRings(): Long = {
    if (gdext.classes.TubeTrailMesh.mb_get_section_rings == null) gdext.classes.TubeTrailMesh.mb_get_section_rings = MethodBind.get("TubeTrailMesh", "get_section_rings", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.TubeTrailMesh.mb_get_section_rings, livePtr)
  }

  /** TubeTrailMesh.set_cap_top */
  final def setCapTop(capTop: Boolean): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_cap_top == null) gdext.classes.TubeTrailMesh.mb_set_cap_top = MethodBind.get("TubeTrailMesh", "set_cap_top", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_cap_top, livePtr, capTop)
  }

  /** TubeTrailMesh.is_cap_top */
  final def isCapTop(): Boolean = {
    if (gdext.classes.TubeTrailMesh.mb_is_cap_top == null) gdext.classes.TubeTrailMesh.mb_is_cap_top = MethodBind.get("TubeTrailMesh", "is_cap_top", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TubeTrailMesh.mb_is_cap_top, livePtr)
  }

  /** TubeTrailMesh.set_cap_bottom */
  final def setCapBottom(capBottom: Boolean): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_cap_bottom == null) gdext.classes.TubeTrailMesh.mb_set_cap_bottom = MethodBind.get("TubeTrailMesh", "set_cap_bottom", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_cap_bottom, livePtr, capBottom)
  }

  /** TubeTrailMesh.is_cap_bottom */
  final def isCapBottom(): Boolean = {
    if (gdext.classes.TubeTrailMesh.mb_is_cap_bottom == null) gdext.classes.TubeTrailMesh.mb_is_cap_bottom = MethodBind.get("TubeTrailMesh", "is_cap_bottom", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TubeTrailMesh.mb_is_cap_bottom, livePtr)
  }

  /** TubeTrailMesh.set_curve */
  final def setCurve(curve: Curve): Unit = {
    if (gdext.classes.TubeTrailMesh.mb_set_curve == null) gdext.classes.TubeTrailMesh.mb_set_curve = MethodBind.get("TubeTrailMesh", "set_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.TubeTrailMesh.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** TubeTrailMesh.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve = {
    if (gdext.classes.TubeTrailMesh.mb_get_curve == null) gdext.classes.TubeTrailMesh.mb_get_curve = MethodBind.get("TubeTrailMesh", "get_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.TubeTrailMesh.mb_get_curve, livePtr))
  }

}

object TubeTrailMesh {
  private[classes] var mb_set_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_radial_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_radial_steps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_rings: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cap_top: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cap_top: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cap_bottom: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_cap_bottom: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
}
