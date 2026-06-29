package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OccluderPolygon2D`, extends `Resource`. */
abstract class OccluderPolygon2D extends Resource {
  override def godotClassName: String = "OccluderPolygon2D"

  /** OccluderPolygon2D.set_closed */
  final def setClosed(closed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderPolygon2D", "set_closed", 2586408642L), hostObject.objectPtr, closed)

  /** OccluderPolygon2D.is_closed */
  final def isClosed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OccluderPolygon2D", "is_closed", 36873697L), hostObject.objectPtr)

  /** OccluderPolygon2D.set_cull_mode */
  final def setCullMode(cull_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OccluderPolygon2D", "set_cull_mode", 3500863002L), hostObject.objectPtr, cull_mode)

  /** OccluderPolygon2D.get_cull_mode */
  final def getCullMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("OccluderPolygon2D", "get_cull_mode", 33931036L), hostObject.objectPtr)

}
