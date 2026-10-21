package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RefCounted`, extends `Object`. */
abstract class RefCounted extends Object {
  override def godotClassName: String = "RefCounted"

  /** RefCounted.init_ref */
  final def initRef(): Boolean = {
    if (gdext.classes.RefCounted.mb_init_ref == null) gdext.classes.RefCounted.mb_init_ref = MethodBind.get("RefCounted", "init_ref", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RefCounted.mb_init_ref, livePtr)
  }

  /** RefCounted.reference */
  final def reference(): Boolean = {
    if (gdext.classes.RefCounted.mb_reference == null) gdext.classes.RefCounted.mb_reference = MethodBind.get("RefCounted", "reference", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RefCounted.mb_reference, livePtr)
  }

  /** RefCounted.unreference */
  final def unreference(): Boolean = {
    if (gdext.classes.RefCounted.mb_unreference == null) gdext.classes.RefCounted.mb_unreference = MethodBind.get("RefCounted", "unreference", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.RefCounted.mb_unreference, livePtr)
  }

  /** RefCounted.get_reference_count */
  final def getReferenceCount(): Long = {
    if (gdext.classes.RefCounted.mb_get_reference_count == null) gdext.classes.RefCounted.mb_get_reference_count = MethodBind.get("RefCounted", "get_reference_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RefCounted.mb_get_reference_count, livePtr)
  }

}

object RefCounted {
  private[classes] var mb_init_ref: GDExtensionMethodBindPtr = null
  private[classes] var mb_reference: GDExtensionMethodBindPtr = null
  private[classes] var mb_unreference: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_reference_count: GDExtensionMethodBindPtr = null
}
