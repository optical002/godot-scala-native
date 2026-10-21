package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OccluderPolygon2D`, extends `Resource`. */
abstract class OccluderPolygon2D extends Resource {
  override def godotClassName: String = "OccluderPolygon2D"

  /** OccluderPolygon2D.set_closed */
  final def setClosed(closed: Boolean): Unit = {
    if (gdext.classes.OccluderPolygon2D.mb_set_closed == null) gdext.classes.OccluderPolygon2D.mb_set_closed = MethodBind.get("OccluderPolygon2D", "set_closed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OccluderPolygon2D.mb_set_closed, livePtr, closed)
  }

  /** OccluderPolygon2D.is_closed */
  final def isClosed(): Boolean = {
    if (gdext.classes.OccluderPolygon2D.mb_is_closed == null) gdext.classes.OccluderPolygon2D.mb_is_closed = MethodBind.get("OccluderPolygon2D", "is_closed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OccluderPolygon2D.mb_is_closed, livePtr)
  }

  /** OccluderPolygon2D.set_cull_mode */
  final def setCullMode(cull_mode: Long): Unit = {
    if (gdext.classes.OccluderPolygon2D.mb_set_cull_mode == null) gdext.classes.OccluderPolygon2D.mb_set_cull_mode = MethodBind.get("OccluderPolygon2D", "set_cull_mode", 3500863002L)
    Ptrcall.callVoid1(gdext.classes.OccluderPolygon2D.mb_set_cull_mode, livePtr, cull_mode)
  }

  /** OccluderPolygon2D.get_cull_mode */
  final def getCullMode(): Long = {
    if (gdext.classes.OccluderPolygon2D.mb_get_cull_mode == null) gdext.classes.OccluderPolygon2D.mb_get_cull_mode = MethodBind.get("OccluderPolygon2D", "get_cull_mode", 33931036L)
    Ptrcall.call0[Long](gdext.classes.OccluderPolygon2D.mb_get_cull_mode, livePtr)
  }

}

object OccluderPolygon2D {
  private[classes] var mb_set_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mode: GDExtensionMethodBindPtr = null
}
