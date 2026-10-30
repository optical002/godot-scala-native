package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SkinReference`, extends `RefCounted`. */
abstract class SkinReference extends RefCounted {
  override def godotClassName: String = "SkinReference"

  /** SkinReference.get_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkin(): Skin = {
    if (gdext.classes.SkinReference.mb_get_skin == null) gdext.classes.SkinReference.mb_get_skin = MethodBind.get("SkinReference", "get_skin", 2074563878L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.SkinReference.mb_get_skin, livePtr))
  }

}

object SkinReference {
  private[classes] var mb_get_skin: GDExtensionMethodBindPtr = null
}
