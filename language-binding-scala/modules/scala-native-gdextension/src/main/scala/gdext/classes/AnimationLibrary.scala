package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AnimationLibrary`, extends `Resource`. */
abstract class AnimationLibrary extends Resource {
  override def godotClassName: String = "AnimationLibrary"

  /** AnimationLibrary.add_animation */
  final def addAnimation(name: gdext.builtin.StringName, animation: Animation): Long = {
    if (gdext.classes.AnimationLibrary.mb_add_animation == null) gdext.classes.AnimationLibrary.mb_add_animation = MethodBind.get("AnimationLibrary", "add_animation", 1811855551L)
    Ptrcall.call2[gdext.builtin.StringName, GodotObject, Long](gdext.classes.AnimationLibrary.mb_add_animation, livePtr, name, Wrappers.handle(animation))
  }

  /** AnimationLibrary.remove_animation */
  final def removeAnimation(name: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationLibrary.mb_remove_animation == null) gdext.classes.AnimationLibrary.mb_remove_animation = MethodBind.get("AnimationLibrary", "remove_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.AnimationLibrary.mb_remove_animation, livePtr, name)
  }

  /** AnimationLibrary.rename_animation */
  final def renameAnimation(name: gdext.builtin.StringName, newname: gdext.builtin.StringName): Unit = {
    if (gdext.classes.AnimationLibrary.mb_rename_animation == null) gdext.classes.AnimationLibrary.mb_rename_animation = MethodBind.get("AnimationLibrary", "rename_animation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.AnimationLibrary.mb_rename_animation, livePtr, name, newname)
  }

  /** AnimationLibrary.has_animation */
  final def hasAnimation(name: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.AnimationLibrary.mb_has_animation == null) gdext.classes.AnimationLibrary.mb_has_animation = MethodBind.get("AnimationLibrary", "has_animation", 2619796661L)
    Ptrcall.call1[gdext.builtin.StringName, Boolean](gdext.classes.AnimationLibrary.mb_has_animation, livePtr, name)
  }

  /** AnimationLibrary.get_animation. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAnimation(name: gdext.builtin.StringName): Animation = {
    if (gdext.classes.AnimationLibrary.mb_get_animation == null) gdext.classes.AnimationLibrary.mb_get_animation = MethodBind.get("AnimationLibrary", "get_animation", 2933122410L)
    Wrappers.owned[Animation](Ptrcall.call1[gdext.builtin.StringName, Long](gdext.classes.AnimationLibrary.mb_get_animation, livePtr, name))
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
