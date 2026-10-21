package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ParallaxLayer`, extends `Node2D`. */
abstract class ParallaxLayer extends Node2D {
  override def godotClassName: String = "ParallaxLayer"

  /** ParallaxLayer.set_motion_scale */
  final def setMotionScale(scale: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxLayer.mb_set_motion_scale == null) gdext.classes.ParallaxLayer.mb_set_motion_scale = MethodBind.get("ParallaxLayer", "set_motion_scale", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxLayer.mb_set_motion_scale, livePtr, scale)
  }

  /** ParallaxLayer.get_motion_scale */
  final def getMotionScale(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxLayer.mb_get_motion_scale == null) gdext.classes.ParallaxLayer.mb_get_motion_scale = MethodBind.get("ParallaxLayer", "get_motion_scale", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxLayer.mb_get_motion_scale, livePtr)
  }

  /** ParallaxLayer.set_motion_offset */
  final def setMotionOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxLayer.mb_set_motion_offset == null) gdext.classes.ParallaxLayer.mb_set_motion_offset = MethodBind.get("ParallaxLayer", "set_motion_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxLayer.mb_set_motion_offset, livePtr, offset)
  }

  /** ParallaxLayer.get_motion_offset */
  final def getMotionOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxLayer.mb_get_motion_offset == null) gdext.classes.ParallaxLayer.mb_get_motion_offset = MethodBind.get("ParallaxLayer", "get_motion_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxLayer.mb_get_motion_offset, livePtr)
  }

  /** ParallaxLayer.set_mirroring */
  final def setMirroring(mirror: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParallaxLayer.mb_set_mirroring == null) gdext.classes.ParallaxLayer.mb_set_mirroring = MethodBind.get("ParallaxLayer", "set_mirroring", 743155724L)
    Ptrcall.callVoid1(gdext.classes.ParallaxLayer.mb_set_mirroring, livePtr, mirror)
  }

  /** ParallaxLayer.get_mirroring */
  final def getMirroring(): gdext.builtin.Vector2 = {
    if (gdext.classes.ParallaxLayer.mb_get_mirroring == null) gdext.classes.ParallaxLayer.mb_get_mirroring = MethodBind.get("ParallaxLayer", "get_mirroring", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.ParallaxLayer.mb_get_mirroring, livePtr)
  }

}

object ParallaxLayer {
  private[classes] var mb_set_motion_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_motion_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_motion_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mirroring: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mirroring: GDExtensionMethodBindPtr = null
}
