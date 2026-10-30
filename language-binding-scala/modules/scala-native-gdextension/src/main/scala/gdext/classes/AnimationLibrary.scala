package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationLibrary`, extends `Resource`. */
abstract class AnimationLibrary extends Resource {
  override def godotClassName: String = "AnimationLibrary"

  /** AnimationLibrary.add_animation */
  final def addAnimation(name: String, animation: Animation): gdext.classes.Error = {
    if (gdext.classes.AnimationLibrary.mb_add_animation == null) gdext.classes.AnimationLibrary.mb_add_animation = MethodBind.get("AnimationLibrary", "add_animation", 1811855551L)
    gdext.classes.Error(Ptrcall.call2[SnArg, GodotObject, Long](gdext.classes.AnimationLibrary.mb_add_animation, livePtr, SnArg(name), Wrappers.handle(animation)))
  }

  /** AnimationLibrary.remove_animation */
  final def removeAnimation(name: String): Unit = {
    if (gdext.classes.AnimationLibrary.mb_remove_animation == null) gdext.classes.AnimationLibrary.mb_remove_animation = MethodBind.get("AnimationLibrary", "remove_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationLibrary.mb_remove_animation, livePtr, SnArg(name))
  }

  /** AnimationLibrary.rename_animation */
  final def renameAnimation(name: String, newname: String): Unit = {
    if (gdext.classes.AnimationLibrary.mb_rename_animation == null) gdext.classes.AnimationLibrary.mb_rename_animation = MethodBind.get("AnimationLibrary", "rename_animation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationLibrary.mb_rename_animation, livePtr, SnArg(name), SnArg(newname))
  }

  /** AnimationLibrary.has_animation */
  final def hasAnimation(name: String): Boolean = {
    if (gdext.classes.AnimationLibrary.mb_has_animation == null) gdext.classes.AnimationLibrary.mb_has_animation = MethodBind.get("AnimationLibrary", "has_animation", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.AnimationLibrary.mb_has_animation, livePtr, SnArg(name))
  }

  /** AnimationLibrary.get_animation. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAnimation(name: String): Animation = {
    if (gdext.classes.AnimationLibrary.mb_get_animation == null) gdext.classes.AnimationLibrary.mb_get_animation = MethodBind.get("AnimationLibrary", "get_animation", 2933122410L)
    Wrappers.owned[Animation](Ptrcall.call1[SnArg, Long](gdext.classes.AnimationLibrary.mb_get_animation, livePtr, SnArg(name)))
  }

  /** AnimationLibrary.get_animation_list_size */
  final def getAnimationListSize(): Long = {
    if (gdext.classes.AnimationLibrary.mb_get_animation_list_size == null) gdext.classes.AnimationLibrary.mb_get_animation_list_size = MethodBind.get("AnimationLibrary", "get_animation_list_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.AnimationLibrary.mb_get_animation_list_size, livePtr)
  }

}

object AnimationLibrary {
  private[classes] var mb_add_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_list_size: GDExtensionMethodBindPtr = null
}
