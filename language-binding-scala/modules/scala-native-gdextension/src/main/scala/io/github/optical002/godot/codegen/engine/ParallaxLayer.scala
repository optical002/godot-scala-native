package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ParallaxLayer`, extends `Node2D`. */
abstract class ParallaxLayer extends Node2D {

  /** ParallaxLayer.set_motion_scale */
  final def setMotionScale(scale: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_motion_scale", 743155724L), hostObject.objectPtr, scale)

  /** ParallaxLayer.get_motion_scale */
  final def getMotionScale(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_motion_scale", 3341600327L), hostObject.objectPtr)

  /** ParallaxLayer.set_motion_offset */
  final def setMotionOffset(offset: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_motion_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxLayer.get_motion_offset */
  final def getMotionOffset(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_motion_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxLayer.set_mirroring */
  final def setMirroring(mirror: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_mirroring", 743155724L), hostObject.objectPtr, mirror)

  /** ParallaxLayer.get_mirroring */
  final def getMirroring(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_mirroring", 3341600327L), hostObject.objectPtr)

}

object ParallaxLayer {
  /** Class metadata for Gd[ParallaxLayer] lifetime management and casting. */
  given GodotClass[ParallaxLayer] with {
    def className = "ParallaxLayer"
    def isRefCounted = false
    def wrap(o: GodotObject): ParallaxLayer = new ParallaxLayer {}.withHost(o.objectPtr)
    def unwrap(t: ParallaxLayer): GodotObject = t.hostObject
  }
}
