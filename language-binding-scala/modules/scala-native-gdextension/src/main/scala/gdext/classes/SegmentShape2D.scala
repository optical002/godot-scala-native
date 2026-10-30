package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SegmentShape2D`, extends `Shape2D`. */
abstract class SegmentShape2D extends Shape2D {
  override def godotClassName: String = "SegmentShape2D"

  /** SegmentShape2D.set_a */
  final def setA(a: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SegmentShape2D.mb_set_a == null) gdext.classes.SegmentShape2D.mb_set_a = MethodBind.get("SegmentShape2D", "set_a", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SegmentShape2D.mb_set_a, livePtr, a)
  }

  /** SegmentShape2D.get_a */
  final def getA(): gdext.builtin.Vector2 = {
    if (gdext.classes.SegmentShape2D.mb_get_a == null) gdext.classes.SegmentShape2D.mb_get_a = MethodBind.get("SegmentShape2D", "get_a", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.SegmentShape2D.mb_get_a, livePtr)
  }

  /** SegmentShape2D.set_b */
  final def setB(b: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.SegmentShape2D.mb_set_b == null) gdext.classes.SegmentShape2D.mb_set_b = MethodBind.get("SegmentShape2D", "set_b", 743155724L)
    Ptrcall.callVoid1(gdext.classes.SegmentShape2D.mb_set_b, livePtr, b)
  }

  /** SegmentShape2D.get_b */
  final def getB(): gdext.builtin.Vector2 = {
    if (gdext.classes.SegmentShape2D.mb_get_b == null) gdext.classes.SegmentShape2D.mb_get_b = MethodBind.get("SegmentShape2D", "get_b", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.SegmentShape2D.mb_get_b, livePtr)
  }

}

object SegmentShape2D {
  private[classes] var mb_set_a: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_a: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_b: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_b: GDExtensionMethodBindPtr = null
}
