package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `RefCounted`, extends `Object`. */
abstract class RefCounted extends Object {
  override def godotClassName: String = "RefCounted"

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
