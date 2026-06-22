package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `SkinReference`, extends `RefCounted`. */
abstract class SkinReference extends RefCounted {

  /** SkinReference.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("SkinReference", "get_skin", 2074563878L), hostObject.objectPtr)

}

object SkinReference {
  /** Class metadata for Gd[SkinReference] lifetime management and casting. */
  given GodotClass[SkinReference] with {
    def className = "SkinReference"
    def isRefCounted = true
    def wrap(o: GodotObject): SkinReference = new SkinReference {}.withHost(o.objectPtr)
    def unwrap(t: SkinReference): GodotObject = t.hostObject
  }
}
