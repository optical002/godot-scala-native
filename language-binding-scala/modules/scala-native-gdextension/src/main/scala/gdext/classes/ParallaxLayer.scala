package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ParallaxLayer`, extends `Node2D`. */
abstract class ParallaxLayer extends Node2D {
  override def godotClassName: String = "ParallaxLayer"

  /** ParallaxLayer.set_motion_scale */
  final def setMotionScale(scale: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_motion_scale", 743155724L), hostObject.objectPtr, scale)

  /** ParallaxLayer.get_motion_scale */
  final def getMotionScale(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_motion_scale", 3341600327L), hostObject.objectPtr)

  /** ParallaxLayer.set_motion_offset */
  final def setMotionOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_motion_offset", 743155724L), hostObject.objectPtr, offset)

  /** ParallaxLayer.get_motion_offset */
  final def getMotionOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_motion_offset", 3341600327L), hostObject.objectPtr)

  /** ParallaxLayer.set_mirroring */
  final def setMirroring(mirror: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParallaxLayer", "set_mirroring", 743155724L), hostObject.objectPtr, mirror)

  /** ParallaxLayer.get_mirroring */
  final def getMirroring(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("ParallaxLayer", "get_mirroring", 3341600327L), hostObject.objectPtr)

}
