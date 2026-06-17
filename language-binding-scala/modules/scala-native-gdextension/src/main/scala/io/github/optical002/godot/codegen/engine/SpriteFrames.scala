package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SpriteFrames`, extends `Resource`. */
abstract class SpriteFrames extends Resource {

  /** SpriteFrames.add_animation */
  final def addAnimation(anim: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteFrames", "add_animation", 3304788590L), hostObject.objectPtr, anim)

  /** SpriteFrames.has_animation */
  final def hasAnimation(anim: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("SpriteFrames", "has_animation", 2619796661L), hostObject.objectPtr, anim)

  /** SpriteFrames.duplicate_animation */
  final def duplicateAnimation(anim_from: io.github.optical002.godot.builtin.StringName, anim_to: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteFrames", "duplicate_animation", 3740211285L), hostObject.objectPtr, anim_from, anim_to)

  /** SpriteFrames.remove_animation */
  final def removeAnimation(anim: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteFrames", "remove_animation", 3304788590L), hostObject.objectPtr, anim)

  /** SpriteFrames.rename_animation */
  final def renameAnimation(anim: io.github.optical002.godot.builtin.StringName, newname: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteFrames", "rename_animation", 3740211285L), hostObject.objectPtr, anim, newname)

  /** SpriteFrames.set_animation_speed */
  final def setAnimationSpeed(anim: io.github.optical002.godot.builtin.StringName, fps: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteFrames", "set_animation_speed", 4135858297L), hostObject.objectPtr, anim, fps)

  /** SpriteFrames.get_animation_speed */
  final def getAnimationSpeed(anim: io.github.optical002.godot.builtin.StringName): Double =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Double](MethodBind.get("SpriteFrames", "get_animation_speed", 2349060816L), hostObject.objectPtr, anim)

  /** SpriteFrames.set_animation_loop */
  final def setAnimationLoop(anim: io.github.optical002.godot.builtin.StringName, loop: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteFrames", "set_animation_loop", 2524380260L), hostObject.objectPtr, anim, loop)

  /** SpriteFrames.get_animation_loop */
  final def getAnimationLoop(anim: io.github.optical002.godot.builtin.StringName): Boolean =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Boolean](MethodBind.get("SpriteFrames", "get_animation_loop", 2619796661L), hostObject.objectPtr, anim)

  /** SpriteFrames.add_frame */
  final def addFrame(anim: io.github.optical002.godot.builtin.StringName, texture: Texture2D, duration: Double, at_position: Long): Unit =
    Ptrcall.callVoid4(MethodBind.get("SpriteFrames", "add_frame", 1351332740L), hostObject.objectPtr, anim, texture.hostObject, duration, at_position)

  /** SpriteFrames.set_frame */
  final def setFrame(anim: io.github.optical002.godot.builtin.StringName, idx: Long, texture: Texture2D, duration: Double): Unit =
    Ptrcall.callVoid4(MethodBind.get("SpriteFrames", "set_frame", 56804795L), hostObject.objectPtr, anim, idx, texture.hostObject, duration)

  /** SpriteFrames.remove_frame */
  final def removeFrame(anim: io.github.optical002.godot.builtin.StringName, idx: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("SpriteFrames", "remove_frame", 2415702435L), hostObject.objectPtr, anim, idx)

  /** SpriteFrames.get_frame_count */
  final def getFrameCount(anim: io.github.optical002.godot.builtin.StringName): Long =
    Ptrcall.call1[io.github.optical002.godot.builtin.StringName, Long](MethodBind.get("SpriteFrames", "get_frame_count", 2458036349L), hostObject.objectPtr, anim)

  /** SpriteFrames.get_frame_texture */
  final def getFrameTexture(anim: io.github.optical002.godot.builtin.StringName, idx: Long): GodotObject =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, Long, GodotObject](MethodBind.get("SpriteFrames", "get_frame_texture", 2900517879L), hostObject.objectPtr, anim, idx)

  /** SpriteFrames.get_frame_duration */
  final def getFrameDuration(anim: io.github.optical002.godot.builtin.StringName, idx: Long): Double =
    Ptrcall.call2[io.github.optical002.godot.builtin.StringName, Long, Double](MethodBind.get("SpriteFrames", "get_frame_duration", 1129309260L), hostObject.objectPtr, anim, idx)

  /** SpriteFrames.clear */
  final def clear(anim: io.github.optical002.godot.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("SpriteFrames", "clear", 3304788590L), hostObject.objectPtr, anim)

  /** SpriteFrames.clear_all */
  final def clearAll(): Unit =
    Ptrcall.callVoid0(MethodBind.get("SpriteFrames", "clear_all", 3218959716L), hostObject.objectPtr)

}

object SpriteFrames {
  /** Class metadata for Gd[SpriteFrames] lifetime management and casting. */
  given GodotClass[SpriteFrames] with {
    def className = "SpriteFrames"
    def isRefCounted = true
    def wrap(o: GodotObject): SpriteFrames = new SpriteFrames {}.withHost(o.objectPtr)
    def unwrap(t: SpriteFrames): GodotObject = t.hostObject
  }
}
