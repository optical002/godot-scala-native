package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `RefCounted`, extends `Object`. */
abstract class RefCounted extends Object {

  /** RefCounted.init_ref */
  final def initRef(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "init_ref", 2240911060L), hostObject.objectPtr)

  /** RefCounted.reference */
  final def reference(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "reference", 2240911060L), hostObject.objectPtr)

  /** RefCounted.unreference */
  final def unreference(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("RefCounted", "unreference", 2240911060L), hostObject.objectPtr)

  /** RefCounted.get_reference_count */
  final def getReferenceCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("RefCounted", "get_reference_count", 3905245786L), hostObject.objectPtr)

}

object RefCounted {
  /** Class metadata for Gd[RefCounted] lifetime management and casting. */
  given GodotClass[RefCounted] with {
    def className = "RefCounted"
    def isRefCounted = true
    def wrap(o: GodotObject): RefCounted = new RefCounted {}.withHost(o.objectPtr)
    def unwrap(t: RefCounted): GodotObject = t.hostObject
  }
}
