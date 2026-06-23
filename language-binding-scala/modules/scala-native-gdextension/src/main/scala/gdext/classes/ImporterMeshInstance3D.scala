package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ImporterMeshInstance3D`, extends `Node3D`. */
abstract class ImporterMeshInstance3D extends Node3D {

  /** ImporterMeshInstance3D.set_mesh */
  final def setMesh(mesh: ImporterMesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_mesh", 2255166972L), hostObject.objectPtr, mesh.hostObject)

  /** ImporterMeshInstance3D.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ImporterMeshInstance3D", "get_mesh", 3161779525L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_skin */
  final def setSkin(skin: Skin): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_skin", 3971435618L), hostObject.objectPtr, skin.hostObject)

  /** ImporterMeshInstance3D.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ImporterMeshInstance3D", "get_skin", 2074563878L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_layer_mask */
  final def setLayerMask(layer_mask: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_layer_mask", 1286410249L), hostObject.objectPtr, layer_mask)

  /** ImporterMeshInstance3D.get_layer_mask */
  final def getLayerMask(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMeshInstance3D", "get_layer_mask", 3905245786L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_cast_shadows_setting */
  final def setCastShadowsSetting(shadow_casting_setting: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_cast_shadows_setting", 856677339L), hostObject.objectPtr, shadow_casting_setting)

  /** ImporterMeshInstance3D.get_cast_shadows_setting */
  final def getCastShadowsSetting(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMeshInstance3D", "get_cast_shadows_setting", 3383019359L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_visibility_range_end_margin */
  final def setVisibilityRangeEndMargin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_end_margin", 373806689L), hostObject.objectPtr, distance)

  /** ImporterMeshInstance3D.get_visibility_range_end_margin */
  final def getVisibilityRangeEndMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_end_margin", 1740695150L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_visibility_range_end */
  final def setVisibilityRangeEnd(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_end", 373806689L), hostObject.objectPtr, distance)

  /** ImporterMeshInstance3D.get_visibility_range_end */
  final def getVisibilityRangeEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_end", 1740695150L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_visibility_range_begin_margin */
  final def setVisibilityRangeBeginMargin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_begin_margin", 373806689L), hostObject.objectPtr, distance)

  /** ImporterMeshInstance3D.get_visibility_range_begin_margin */
  final def getVisibilityRangeBeginMargin(): Double =
    Ptrcall.call0[Double](MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_begin_margin", 1740695150L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_visibility_range_begin */
  final def setVisibilityRangeBegin(distance: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_begin", 373806689L), hostObject.objectPtr, distance)

  /** ImporterMeshInstance3D.get_visibility_range_begin */
  final def getVisibilityRangeBegin(): Double =
    Ptrcall.call0[Double](MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_begin", 1740695150L), hostObject.objectPtr)

  /** ImporterMeshInstance3D.set_visibility_range_fade_mode */
  final def setVisibilityRangeFadeMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ImporterMeshInstance3D", "set_visibility_range_fade_mode", 1440117808L), hostObject.objectPtr, mode)

  /** ImporterMeshInstance3D.get_visibility_range_fade_mode */
  final def getVisibilityRangeFadeMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ImporterMeshInstance3D", "get_visibility_range_fade_mode", 2067221882L), hostObject.objectPtr)

}

object ImporterMeshInstance3D {
  /** Class metadata for Gd[ImporterMeshInstance3D] lifetime management and casting. */
  given GodotClass[ImporterMeshInstance3D] with {
    def className = "ImporterMeshInstance3D"
    def isRefCounted = false
    def wrap(o: GodotObject): ImporterMeshInstance3D = new ImporterMeshInstance3D {}.withHost(o.objectPtr)
    def unwrap(t: ImporterMeshInstance3D): GodotObject = t.hostObject
  }
}
