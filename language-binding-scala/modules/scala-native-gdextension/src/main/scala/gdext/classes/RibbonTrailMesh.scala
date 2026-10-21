package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RibbonTrailMesh`, extends `PrimitiveMesh`. */
abstract class RibbonTrailMesh extends PrimitiveMesh {
  override def godotClassName: String = "RibbonTrailMesh"

  /** RibbonTrailMesh.set_size */
  final def setSize(size: Double): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_size == null) gdext.classes.RibbonTrailMesh.mb_set_size = MethodBind.get("RibbonTrailMesh", "set_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_size, livePtr, size)
  }

  /** RibbonTrailMesh.get_size */
  final def getSize(): Double = {
    if (gdext.classes.RibbonTrailMesh.mb_get_size == null) gdext.classes.RibbonTrailMesh.mb_get_size = MethodBind.get("RibbonTrailMesh", "get_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RibbonTrailMesh.mb_get_size, livePtr)
  }

  /** RibbonTrailMesh.set_sections */
  final def setSections(sections: Long): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_sections == null) gdext.classes.RibbonTrailMesh.mb_set_sections = MethodBind.get("RibbonTrailMesh", "set_sections", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_sections, livePtr, sections)
  }

  /** RibbonTrailMesh.get_sections */
  final def getSections(): Long = {
    if (gdext.classes.RibbonTrailMesh.mb_get_sections == null) gdext.classes.RibbonTrailMesh.mb_get_sections = MethodBind.get("RibbonTrailMesh", "get_sections", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RibbonTrailMesh.mb_get_sections, livePtr)
  }

  /** RibbonTrailMesh.set_section_length */
  final def setSectionLength(section_length: Double): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_section_length == null) gdext.classes.RibbonTrailMesh.mb_set_section_length = MethodBind.get("RibbonTrailMesh", "set_section_length", 373806689L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_section_length, livePtr, section_length)
  }

  /** RibbonTrailMesh.get_section_length */
  final def getSectionLength(): Double = {
    if (gdext.classes.RibbonTrailMesh.mb_get_section_length == null) gdext.classes.RibbonTrailMesh.mb_get_section_length = MethodBind.get("RibbonTrailMesh", "get_section_length", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.RibbonTrailMesh.mb_get_section_length, livePtr)
  }

  /** RibbonTrailMesh.set_section_segments */
  final def setSectionSegments(section_segments: Long): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_section_segments == null) gdext.classes.RibbonTrailMesh.mb_set_section_segments = MethodBind.get("RibbonTrailMesh", "set_section_segments", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_section_segments, livePtr, section_segments)
  }

  /** RibbonTrailMesh.get_section_segments */
  final def getSectionSegments(): Long = {
    if (gdext.classes.RibbonTrailMesh.mb_get_section_segments == null) gdext.classes.RibbonTrailMesh.mb_get_section_segments = MethodBind.get("RibbonTrailMesh", "get_section_segments", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RibbonTrailMesh.mb_get_section_segments, livePtr)
  }

  /** RibbonTrailMesh.set_curve */
  final def setCurve(curve: Curve): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_curve == null) gdext.classes.RibbonTrailMesh.mb_set_curve = MethodBind.get("RibbonTrailMesh", "set_curve", 270443179L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_curve, livePtr, Wrappers.handle(curve))
  }

  /** RibbonTrailMesh.get_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCurve(): Curve = {
    if (gdext.classes.RibbonTrailMesh.mb_get_curve == null) gdext.classes.RibbonTrailMesh.mb_get_curve = MethodBind.get("RibbonTrailMesh", "get_curve", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.RibbonTrailMesh.mb_get_curve, livePtr))
  }

  /** RibbonTrailMesh.set_shape */
  final def setShape(shape: Long): Unit = {
    if (gdext.classes.RibbonTrailMesh.mb_set_shape == null) gdext.classes.RibbonTrailMesh.mb_set_shape = MethodBind.get("RibbonTrailMesh", "set_shape", 1684440262L)
    Ptrcall.callVoid1(gdext.classes.RibbonTrailMesh.mb_set_shape, livePtr, shape)
  }

  /** RibbonTrailMesh.get_shape */
  final def getShape(): Long = {
    if (gdext.classes.RibbonTrailMesh.mb_get_shape == null) gdext.classes.RibbonTrailMesh.mb_get_shape = MethodBind.get("RibbonTrailMesh", "get_shape", 1317484155L)
    Ptrcall.call0[Long](gdext.classes.RibbonTrailMesh.mb_get_shape, livePtr)
  }

}

object RibbonTrailMesh {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_length: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_section_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_section_segments: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shape: GDExtensionMethodBindPtr = null
}
