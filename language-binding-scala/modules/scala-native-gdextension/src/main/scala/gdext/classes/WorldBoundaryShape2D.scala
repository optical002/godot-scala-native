package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `WorldBoundaryShape2D`, extends `Shape2D`. */
abstract class WorldBoundaryShape2D extends Shape2D {
  override def godotClassName: String = "WorldBoundaryShape2D"

  /** WorldBoundaryShape2D.set_normal */
  final def setNormal(normal: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.WorldBoundaryShape2D.mb_set_normal == null) gdext.classes.WorldBoundaryShape2D.mb_set_normal = MethodBind.get("WorldBoundaryShape2D", "set_normal", 743155724L)
    Ptrcall.callVoid1(gdext.classes.WorldBoundaryShape2D.mb_set_normal, livePtr, normal)
  }

  /** WorldBoundaryShape2D.get_normal */
  final def getNormal(): gdext.builtin.Vector2 = {
    if (gdext.classes.WorldBoundaryShape2D.mb_get_normal == null) gdext.classes.WorldBoundaryShape2D.mb_get_normal = MethodBind.get("WorldBoundaryShape2D", "get_normal", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.WorldBoundaryShape2D.mb_get_normal, livePtr)
  }

  /** WorldBoundaryShape2D.set_distance */
  final def setDistance(distance: Double): Unit = {
    if (gdext.classes.WorldBoundaryShape2D.mb_set_distance == null) gdext.classes.WorldBoundaryShape2D.mb_set_distance = MethodBind.get("WorldBoundaryShape2D", "set_distance", 373806689L)
    Ptrcall.callVoid1(gdext.classes.WorldBoundaryShape2D.mb_set_distance, livePtr, distance)
  }

  /** WorldBoundaryShape2D.get_distance */
  final def getDistance(): Double = {
    if (gdext.classes.WorldBoundaryShape2D.mb_get_distance == null) gdext.classes.WorldBoundaryShape2D.mb_get_distance = MethodBind.get("WorldBoundaryShape2D", "get_distance", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.WorldBoundaryShape2D.mb_get_distance, livePtr)
  }

}

object WorldBoundaryShape2D {
  private[classes] var mb_set_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_normal: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_distance: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_distance: GDExtensionMethodBindPtr = null
}
