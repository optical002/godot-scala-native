package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ImporterMeshInstance3D`, extends `Node3D`. */
abstract class ImporterMeshInstance3D extends Node3D {
  override def godotClassName: String = "ImporterMeshInstance3D"

  /** ImporterMeshInstance3D.set_mesh */
  final def setMesh(mesh: ImporterMesh): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_mesh == null) gdext.classes.ImporterMeshInstance3D.mb_set_mesh = MethodBind.get("ImporterMeshInstance3D", "set_mesh", 2255166972L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** ImporterMeshInstance3D.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): ImporterMesh = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_mesh == null) gdext.classes.ImporterMeshInstance3D.mb_get_mesh = MethodBind.get("ImporterMeshInstance3D", "get_mesh", 3161779525L)
    Wrappers.owned[ImporterMesh](Ptrcall.call0[Long](gdext.classes.ImporterMeshInstance3D.mb_get_mesh, livePtr))
  }

  /** ImporterMeshInstance3D.set_skin */
  final def setSkin(skin: Skin): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_skin == null) gdext.classes.ImporterMeshInstance3D.mb_set_skin = MethodBind.get("ImporterMeshInstance3D", "set_skin", 3971435618L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_skin, livePtr, Wrappers.handle(skin))
  }

  /** ImporterMeshInstance3D.get_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkin(): Skin = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_skin == null) gdext.classes.ImporterMeshInstance3D.mb_get_skin = MethodBind.get("ImporterMeshInstance3D", "get_skin", 2074563878L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.ImporterMeshInstance3D.mb_get_skin, livePtr))
  }

  /** ImporterMeshInstance3D.set_layer_mask */
  final def setLayerMask(layer_mask: Long): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_layer_mask == null) gdext.classes.ImporterMeshInstance3D.mb_set_layer_mask = MethodBind.get("ImporterMeshInstance3D", "set_layer_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_layer_mask, livePtr, layer_mask)
  }

  /** ImporterMeshInstance3D.get_layer_mask */
  final def getLayerMask(): Long = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_layer_mask == null) gdext.classes.ImporterMeshInstance3D.mb_get_layer_mask = MethodBind.get("ImporterMeshInstance3D", "get_layer_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ImporterMeshInstance3D.mb_get_layer_mask, livePtr)
  }

  /** ImporterMeshInstance3D.set_cast_shadows_setting */
  final def setCastShadowsSetting(shadow_casting_setting: Long): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_cast_shadows_setting == null) gdext.classes.ImporterMeshInstance3D.mb_set_cast_shadows_setting = MethodBind.get("ImporterMeshInstance3D", "set_cast_shadows_setting", 856677339L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_cast_shadows_setting, livePtr, shadow_casting_setting)
  }

  /** ImporterMeshInstance3D.get_cast_shadows_setting */
  final def getCastShadowsSetting(): Long = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_cast_shadows_setting == null) gdext.classes.ImporterMeshInstance3D.mb_get_cast_shadows_setting = MethodBind.get("ImporterMeshInstance3D", "get_cast_shadows_setting", 3383019359L)
    Ptrcall.call0[Long](gdext.classes.ImporterMeshInstance3D.mb_get_cast_shadows_setting, livePtr)
  }

  /** ImporterMeshInstance3D.set_visibility_range_end_margin */
  final def setVisibilityRangeEndMargin(distance: Double): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end_margin == null) gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end_margin = MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_end_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end_margin, livePtr, distance)
  }

  /** ImporterMeshInstance3D.get_visibility_range_end_margin */
  final def getVisibilityRangeEndMargin(): Double = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end_margin == null) gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end_margin = MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_end_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end_margin, livePtr)
  }

  /** ImporterMeshInstance3D.set_visibility_range_end */
  final def setVisibilityRangeEnd(distance: Double): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end == null) gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end = MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_end, livePtr, distance)
  }

  /** ImporterMeshInstance3D.get_visibility_range_end */
  final def getVisibilityRangeEnd(): Double = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end == null) gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end = MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_end, livePtr)
  }

  /** ImporterMeshInstance3D.set_visibility_range_begin_margin */
  final def setVisibilityRangeBeginMargin(distance: Double): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin_margin == null) gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin_margin = MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_begin_margin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin_margin, livePtr, distance)
  }

  /** ImporterMeshInstance3D.get_visibility_range_begin_margin */
  final def getVisibilityRangeBeginMargin(): Double = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin_margin == null) gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin_margin = MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_begin_margin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin_margin, livePtr)
  }

  /** ImporterMeshInstance3D.set_visibility_range_begin */
  final def setVisibilityRangeBegin(distance: Double): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin == null) gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin = MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_begin", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_begin, livePtr, distance)
  }

  /** ImporterMeshInstance3D.get_visibility_range_begin */
  final def getVisibilityRangeBegin(): Double = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin == null) gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin = MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_begin", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_begin, livePtr)
  }

  /** ImporterMeshInstance3D.set_visibility_range_fade_mode */
  final def setVisibilityRangeFadeMode(mode: Long): Unit = {
    if (gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_fade_mode == null) gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_fade_mode = MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_fade_mode", 1440117808L)
    Ptrcall.callVoid1(gdext.classes.ImporterMeshInstance3D.mb_set_visibility_range_fade_mode, livePtr, mode)
  }

  /** ImporterMeshInstance3D.get_visibility_range_fade_mode */
  final def getVisibilityRangeFadeMode(): Long = {
    if (gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_fade_mode == null) gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_fade_mode = MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_fade_mode", 2067221882L)
    Ptrcall.call0[Long](gdext.classes.ImporterMeshInstance3D.mb_get_visibility_range_fade_mode, livePtr)
  }

}

object ImporterMeshInstance3D {
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layer_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layer_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cast_shadows_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cast_shadows_setting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_end_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_end_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_begin_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_begin_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_begin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_range_fade_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_range_fade_mode: GDExtensionMethodBindPtr = null
}
