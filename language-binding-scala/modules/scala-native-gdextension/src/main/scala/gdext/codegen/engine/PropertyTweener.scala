package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `PropertyTweener`, extends `Tweener`. */
abstract class PropertyTweener extends Tweener {

  /** PropertyTweener.from_current */
  final def fromCurrent(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PropertyTweener", "from_current", 4279177709L), hostObject.objectPtr)

  /** PropertyTweener.as_relative */
  final def asRelative(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("PropertyTweener", "as_relative", 4279177709L), hostObject.objectPtr)

  /** PropertyTweener.set_trans */
  final def setTrans(trans: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PropertyTweener", "set_trans", 1899107404L), hostObject.objectPtr, trans)

  /** PropertyTweener.set_ease */
  final def setEase(ease: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("PropertyTweener", "set_ease", 1080455622L), hostObject.objectPtr, ease)

  /** PropertyTweener.set_delay */
  final def setDelay(delay: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("PropertyTweener", "set_delay", 2171559331L), hostObject.objectPtr, delay)

}

object PropertyTweener {
  /** Class metadata for Gd[PropertyTweener] lifetime management and casting. */
  given GodotClass[PropertyTweener] with {
    def className = "PropertyTweener"
    def isRefCounted = true
    def wrap(o: GodotObject): PropertyTweener = new PropertyTweener {}.withHost(o.objectPtr)
    def unwrap(t: PropertyTweener): GodotObject = t.hostObject
  }
}
