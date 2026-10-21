package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LightOccluder2D`, extends `Node2D`. */
abstract class LightOccluder2D extends Node2D {
  override def godotClassName: String = "LightOccluder2D"

  /** LightOccluder2D.set_occluder_polygon */
  final def setOccluderPolygon(polygon: OccluderPolygon2D): Unit = {
    if (gdext.classes.LightOccluder2D.mb_set_occluder_polygon == null) gdext.classes.LightOccluder2D.mb_set_occluder_polygon = MethodBind.get("LightOccluder2D", "set_occluder_polygon", 3258315893L)
    Ptrcall.callVoid1(gdext.classes.LightOccluder2D.mb_set_occluder_polygon, livePtr, Wrappers.handle(polygon))
  }

  /** LightOccluder2D.get_occluder_polygon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getOccluderPolygon(): OccluderPolygon2D = {
    if (gdext.classes.LightOccluder2D.mb_get_occluder_polygon == null) gdext.classes.LightOccluder2D.mb_get_occluder_polygon = MethodBind.get("LightOccluder2D", "get_occluder_polygon", 3962317075L)
    Wrappers.owned[OccluderPolygon2D](Ptrcall.call0[Long](gdext.classes.LightOccluder2D.mb_get_occluder_polygon, livePtr))
  }

  /** LightOccluder2D.set_occluder_light_mask */
  final def setOccluderLightMask(mask: Long): Unit = {
    if (gdext.classes.LightOccluder2D.mb_set_occluder_light_mask == null) gdext.classes.LightOccluder2D.mb_set_occluder_light_mask = MethodBind.get("LightOccluder2D", "set_occluder_light_mask", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LightOccluder2D.mb_set_occluder_light_mask, livePtr, mask)
  }

  /** LightOccluder2D.get_occluder_light_mask */
  final def getOccluderLightMask(): Long = {
    if (gdext.classes.LightOccluder2D.mb_get_occluder_light_mask == null) gdext.classes.LightOccluder2D.mb_get_occluder_light_mask = MethodBind.get("LightOccluder2D", "get_occluder_light_mask", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LightOccluder2D.mb_get_occluder_light_mask, livePtr)
  }

  /** LightOccluder2D.set_as_sdf_collision */
  final def setAsSdfCollision(enable: Boolean): Unit = {
    if (gdext.classes.LightOccluder2D.mb_set_as_sdf_collision == null) gdext.classes.LightOccluder2D.mb_set_as_sdf_collision = MethodBind.get("LightOccluder2D", "set_as_sdf_collision", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightOccluder2D.mb_set_as_sdf_collision, livePtr, enable)
  }

  /** LightOccluder2D.is_set_as_sdf_collision */
  final def isSetAsSdfCollision(): Boolean = {
    if (gdext.classes.LightOccluder2D.mb_is_set_as_sdf_collision == null) gdext.classes.LightOccluder2D.mb_is_set_as_sdf_collision = MethodBind.get("LightOccluder2D", "is_set_as_sdf_collision", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightOccluder2D.mb_is_set_as_sdf_collision, livePtr)
  }

}

object LightOccluder2D {
  private[classes] var mb_set_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder_polygon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_occluder_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_occluder_light_mask: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_as_sdf_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_set_as_sdf_collision: GDExtensionMethodBindPtr = null
}
