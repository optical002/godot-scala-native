package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `AnimationNodeAnimation`, extends `AnimationRootNode`. */
abstract class AnimationNodeAnimation extends AnimationRootNode {

  /** AnimationNodeAnimation.set_animation */
  final def setAnimation(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_animation", 3304788590L), hostObject.objectPtr, name)

  /** AnimationNodeAnimation.get_animation */
  final def getAnimation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("AnimationNodeAnimation", "get_animation", 2002593661L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_play_mode */
  final def setPlayMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_play_mode", 3347718873L), hostObject.objectPtr, mode)

  /** AnimationNodeAnimation.get_play_mode */
  final def getPlayMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeAnimation", "get_play_mode", 2061244637L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_advance_on_start */
  final def setAdvanceOnStart(advance_on_start: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_advance_on_start", 2586408642L), hostObject.objectPtr, advance_on_start)

  /** AnimationNodeAnimation.is_advance_on_start */
  final def isAdvanceOnStart(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeAnimation", "is_advance_on_start", 36873697L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_use_custom_timeline */
  final def setUseCustomTimeline(use_custom_timeline: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_use_custom_timeline", 2586408642L), hostObject.objectPtr, use_custom_timeline)

  /** AnimationNodeAnimation.is_using_custom_timeline */
  final def isUsingCustomTimeline(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeAnimation", "is_using_custom_timeline", 36873697L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_timeline_length */
  final def setTimelineLength(timeline_length: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_timeline_length", 373806689L), hostObject.objectPtr, timeline_length)

  /** AnimationNodeAnimation.get_timeline_length */
  final def getTimelineLength(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeAnimation", "get_timeline_length", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_stretch_time_scale */
  final def setStretchTimeScale(stretch_time_scale: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_stretch_time_scale", 2586408642L), hostObject.objectPtr, stretch_time_scale)

  /** AnimationNodeAnimation.is_stretching_time_scale */
  final def isStretchingTimeScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AnimationNodeAnimation", "is_stretching_time_scale", 36873697L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_start_offset */
  final def setStartOffset(start_offset: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_start_offset", 373806689L), hostObject.objectPtr, start_offset)

  /** AnimationNodeAnimation.get_start_offset */
  final def getStartOffset(): Double =
    Ptrcall.call0[Double](MethodBind.get("AnimationNodeAnimation", "get_start_offset", 1740695150L), hostObject.objectPtr)

  /** AnimationNodeAnimation.set_loop_mode */
  final def setLoopMode(loop_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("AnimationNodeAnimation", "set_loop_mode", 3155355575L), hostObject.objectPtr, loop_mode)

  /** AnimationNodeAnimation.get_loop_mode */
  final def getLoopMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("AnimationNodeAnimation", "get_loop_mode", 1988889481L), hostObject.objectPtr)

}

object AnimationNodeAnimation {
  /** Class metadata for Gd[AnimationNodeAnimation] lifetime management and casting. */
  given GodotClass[AnimationNodeAnimation] with {
    def className = "AnimationNodeAnimation"
    def isRefCounted = true
    def wrap(o: GodotObject): AnimationNodeAnimation = new AnimationNodeAnimation {}.withHost(o.objectPtr)
    def unwrap(t: AnimationNodeAnimation): GodotObject = t.hostObject
  }
}
