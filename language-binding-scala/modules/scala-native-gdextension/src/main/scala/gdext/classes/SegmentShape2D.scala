package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `SegmentShape2D`, extends `Shape2D`. */
abstract class SegmentShape2D extends Shape2D {

  /** SegmentShape2D.set_a */
  final def setA(a: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SegmentShape2D", "set_a", 743155724L), hostObject.objectPtr, a)

  /** SegmentShape2D.get_a */
  final def getA(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("SegmentShape2D", "get_a", 3341600327L), hostObject.objectPtr)

  /** SegmentShape2D.set_b */
  final def setB(b: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("SegmentShape2D", "set_b", 743155724L), hostObject.objectPtr, b)

  /** SegmentShape2D.get_b */
  final def getB(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("SegmentShape2D", "get_b", 3341600327L), hostObject.objectPtr)

}

object SegmentShape2D {
  /** Class metadata for Gd[SegmentShape2D] lifetime management and casting. */
  given GodotClass[SegmentShape2D] with {
    def className = "SegmentShape2D"
    def isRefCounted = true
    def wrap(o: GodotObject): SegmentShape2D = new SegmentShape2D {}.withHost(o.objectPtr)
    def unwrap(t: SegmentShape2D): GodotObject = t.hostObject
  }
}
