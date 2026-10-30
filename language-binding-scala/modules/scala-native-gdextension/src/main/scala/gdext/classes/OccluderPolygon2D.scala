package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setCullMode(cullMode: gdext.classes.OccluderPolygon2D.CullMode): Unit = {
    if (gdext.classes.OccluderPolygon2D.mb_set_cull_mode == null) gdext.classes.OccluderPolygon2D.mb_set_cull_mode = MethodBind.get("OccluderPolygon2D", "set_cull_mode", 3500863002L)
    Ptrcall.callVoid1(gdext.classes.OccluderPolygon2D.mb_set_cull_mode, livePtr, cullMode)
  }

  /** OccluderPolygon2D.get_cull_mode */
  final def getCullMode(): gdext.classes.OccluderPolygon2D.CullMode = {
    if (gdext.classes.OccluderPolygon2D.mb_get_cull_mode == null) gdext.classes.OccluderPolygon2D.mb_get_cull_mode = MethodBind.get("OccluderPolygon2D", "get_cull_mode", 33931036L)
    gdext.classes.OccluderPolygon2D.CullMode(Ptrcall.call0[Long](gdext.classes.OccluderPolygon2D.mb_get_cull_mode, livePtr))
  }

}

object OccluderPolygon2D {
  private[classes] var mb_set_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_closed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cull_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cull_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `OccluderPolygon2D.CullMode`. */
  opaque type CullMode <: Long = Long

  object CullMode {
    final val Disabled: CullMode = 0L.asInstanceOf[CullMode]
    final val Clockwise: CullMode = 1L.asInstanceOf[CullMode]
    final val CounterClockwise: CullMode = 2L.asInstanceOf[CullMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CullMode = value.asInstanceOf[CullMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CullMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CullMode]]

    extension (self: CullMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Clockwise"
        case 2L => "CounterClockwise"
        case other => other.toString
      }
  }
}
