package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SpriteFrames`, extends `Resource`. */
abstract class SpriteFrames extends Resource {
  override def godotClassName: String = "SpriteFrames"

  /** SpriteFrames.add_animation */
  final def addAnimation(anim: String): Unit = {
    if (gdext.classes.SpriteFrames.mb_add_animation == null) gdext.classes.SpriteFrames.mb_add_animation = MethodBind.get("SpriteFrames", "add_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SpriteFrames.mb_add_animation, livePtr, SnArg(anim))
  }

  /** SpriteFrames.has_animation */
  final def hasAnimation(anim: String): Boolean = {
    if (gdext.classes.SpriteFrames.mb_has_animation == null) gdext.classes.SpriteFrames.mb_has_animation = MethodBind.get("SpriteFrames", "has_animation", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.SpriteFrames.mb_has_animation, livePtr, SnArg(anim))
  }

  /** SpriteFrames.duplicate_animation */
  final def duplicateAnimation(animFrom: String, animTo: String): Unit = {
    if (gdext.classes.SpriteFrames.mb_duplicate_animation == null) gdext.classes.SpriteFrames.mb_duplicate_animation = MethodBind.get("SpriteFrames", "duplicate_animation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.SpriteFrames.mb_duplicate_animation, livePtr, SnArg(animFrom), SnArg(animTo))
  }

  /** SpriteFrames.remove_animation */
  final def removeAnimation(anim: String): Unit = {
    if (gdext.classes.SpriteFrames.mb_remove_animation == null) gdext.classes.SpriteFrames.mb_remove_animation = MethodBind.get("SpriteFrames", "remove_animation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SpriteFrames.mb_remove_animation, livePtr, SnArg(anim))
  }

  /** SpriteFrames.rename_animation */
  final def renameAnimation(anim: String, newname: String): Unit = {
    if (gdext.classes.SpriteFrames.mb_rename_animation == null) gdext.classes.SpriteFrames.mb_rename_animation = MethodBind.get("SpriteFrames", "rename_animation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.SpriteFrames.mb_rename_animation, livePtr, SnArg(anim), SnArg(newname))
  }

  /** SpriteFrames.set_animation_speed */
  final def setAnimationSpeed(anim: String, fps: Double): Unit = {
    if (gdext.classes.SpriteFrames.mb_set_animation_speed == null) gdext.classes.SpriteFrames.mb_set_animation_speed = MethodBind.get("SpriteFrames", "set_animation_speed", 4135858297L)
    Ptrcall.callVoid2(gdext.classes.SpriteFrames.mb_set_animation_speed, livePtr, SnArg(anim), fps)
  }

  /** SpriteFrames.get_animation_speed */
  final def getAnimationSpeed(anim: String): Double = {
    if (gdext.classes.SpriteFrames.mb_get_animation_speed == null) gdext.classes.SpriteFrames.mb_get_animation_speed = MethodBind.get("SpriteFrames", "get_animation_speed", 2349060816L)
    Ptrcall.call1[SnArg, Double](gdext.classes.SpriteFrames.mb_get_animation_speed, livePtr, SnArg(anim))
  }

  /** SpriteFrames.set_animation_loop */
  final def setAnimationLoop(anim: String, loop: Boolean): Unit = {
    if (gdext.classes.SpriteFrames.mb_set_animation_loop == null) gdext.classes.SpriteFrames.mb_set_animation_loop = MethodBind.get("SpriteFrames", "set_animation_loop", 2524380260L)
    Ptrcall.callVoid2(gdext.classes.SpriteFrames.mb_set_animation_loop, livePtr, SnArg(anim), loop)
  }

  /** SpriteFrames.get_animation_loop */
  final def getAnimationLoop(anim: String): Boolean = {
    if (gdext.classes.SpriteFrames.mb_get_animation_loop == null) gdext.classes.SpriteFrames.mb_get_animation_loop = MethodBind.get("SpriteFrames", "get_animation_loop", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.SpriteFrames.mb_get_animation_loop, livePtr, SnArg(anim))
  }

  /** SpriteFrames.add_frame */
  final def addFrame(anim: String, texture: Texture2D, duration: Double = 1.0, atPosition: Long = -1L): Unit = {
    if (gdext.classes.SpriteFrames.mb_add_frame == null) gdext.classes.SpriteFrames.mb_add_frame = MethodBind.get("SpriteFrames", "add_frame", 1351332740L)
    Ptrcall.callVoid4(gdext.classes.SpriteFrames.mb_add_frame, livePtr, SnArg(anim), Wrappers.handle(texture), duration, atPosition)
  }

  /** SpriteFrames.set_frame */
  final def setFrame(anim: String, idx: Long, texture: Texture2D, duration: Double = 1.0): Unit = {
    if (gdext.classes.SpriteFrames.mb_set_frame == null) gdext.classes.SpriteFrames.mb_set_frame = MethodBind.get("SpriteFrames", "set_frame", 56804795L)
    Ptrcall.callVoid4(gdext.classes.SpriteFrames.mb_set_frame, livePtr, SnArg(anim), idx, Wrappers.handle(texture), duration)
  }

  /** SpriteFrames.remove_frame */
  final def removeFrame(anim: String, idx: Long): Unit = {
    if (gdext.classes.SpriteFrames.mb_remove_frame == null) gdext.classes.SpriteFrames.mb_remove_frame = MethodBind.get("SpriteFrames", "remove_frame", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.SpriteFrames.mb_remove_frame, livePtr, SnArg(anim), idx)
  }

  /** SpriteFrames.get_frame_count */
  final def getFrameCount(anim: String): Long = {
    if (gdext.classes.SpriteFrames.mb_get_frame_count == null) gdext.classes.SpriteFrames.mb_get_frame_count = MethodBind.get("SpriteFrames", "get_frame_count", 2458036349L)
    Ptrcall.call1[SnArg, Long](gdext.classes.SpriteFrames.mb_get_frame_count, livePtr, SnArg(anim))
  }

  /** SpriteFrames.get_frame_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFrameTexture(anim: String, idx: Long): Texture2D = {
    if (gdext.classes.SpriteFrames.mb_get_frame_texture == null) gdext.classes.SpriteFrames.mb_get_frame_texture = MethodBind.get("SpriteFrames", "get_frame_texture", 2900517879L)
    Wrappers.owned[Texture2D](Ptrcall.call2[SnArg, Long, Long](gdext.classes.SpriteFrames.mb_get_frame_texture, livePtr, SnArg(anim), idx))
  }

  /** SpriteFrames.get_frame_duration */
  final def getFrameDuration(anim: String, idx: Long): Double = {
    if (gdext.classes.SpriteFrames.mb_get_frame_duration == null) gdext.classes.SpriteFrames.mb_get_frame_duration = MethodBind.get("SpriteFrames", "get_frame_duration", 1129309260L)
    Ptrcall.call2[SnArg, Long, Double](gdext.classes.SpriteFrames.mb_get_frame_duration, livePtr, SnArg(anim), idx)
  }

  /** SpriteFrames.clear */
  final def clear(anim: String): Unit = {
    if (gdext.classes.SpriteFrames.mb_clear == null) gdext.classes.SpriteFrames.mb_clear = MethodBind.get("SpriteFrames", "clear", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.SpriteFrames.mb_clear, livePtr, SnArg(anim))
  }

  /** SpriteFrames.clear_all */
  final def clearAll(): Unit = {
    if (gdext.classes.SpriteFrames.mb_clear_all == null) gdext.classes.SpriteFrames.mb_clear_all = MethodBind.get("SpriteFrames", "clear_all", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.SpriteFrames.mb_clear_all, livePtr)
  }

}

object SpriteFrames {
  private[classes] var mb_add_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_duplicate_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_animation: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_animation_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_animation_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_animation_loop: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_frame: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_frame_duration: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_all: GDExtensionMethodBindPtr = null
}
