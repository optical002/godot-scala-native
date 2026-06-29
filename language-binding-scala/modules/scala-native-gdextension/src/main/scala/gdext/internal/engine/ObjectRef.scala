package gdext.internal.engine

import gdext.Godot
import gdext.builtin.StringNames
import gdext.internal.register.GodotScriptClass

/**
 * Internal construction helper for live engine-object references, now that an
 * object is held as its plain wrapper type (`Node2D`, `PlayerStats`) rather than
 * a `Gd[T]`. The user-facing entry point is `gdext.api.Gd.create`, which forwards
 * here.
 *
 * (OBJECT-Variant marshalling givens live in `object GodotScriptClass` so they
 * are found by implicit search for any `T <: GodotScriptClass`.)
 */
object ObjectRef {

  /**
   * Construct a brand-new engine object of class `T` and take ownership. For
   * reference-counted classes this initialises the reference (`init_ref`) so the
   * returned wrapper holds the first reference.
   */
  def construct[T <: GodotScriptClass](using meta: ClassMeta[T]): T = {
    val handle = Godot.interface.classdb_construct_object2(
      StringNames.cached(meta.className).ptr
    )
    val wrapped = meta.fromHandle(handle)
    if (handle != null && wrapped != null && wrapped.isRefCounted)
      GodotScriptClass.callRefMethod(handle, "init_ref")
    wrapped
  }
}
