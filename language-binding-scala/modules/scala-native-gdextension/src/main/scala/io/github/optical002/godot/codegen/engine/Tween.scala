package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Tween`, extends `RefCounted`. */
abstract class Tween extends RefCounted {

  /** Tween.tween_interval */
  final def tweenInterval(time: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("Tween", "tween_interval", 413360199L), hostObject.objectPtr, time)

  /** Tween.tween_subtween */
  final def tweenSubtween(subtween: Tween): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("Tween", "tween_subtween", 1567358477L), hostObject.objectPtr, subtween.hostObject)

  /** Tween.custom_step */
  final def customStep(delta: Double): Boolean =
    Ptrcall.call1[Double, Boolean](MethodBind.get("Tween", "custom_step", 330693286L), hostObject.objectPtr, delta)

  /** Tween.stop */
  final def stop(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tween", "stop", 3218959716L), hostObject.objectPtr)

  /** Tween.pause */
  final def pause(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tween", "pause", 3218959716L), hostObject.objectPtr)

  /** Tween.play */
  final def play(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tween", "play", 3218959716L), hostObject.objectPtr)

  /** Tween.kill */
  final def kill(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Tween", "kill", 3218959716L), hostObject.objectPtr)

  /** Tween.get_total_elapsed_time */
  final def getTotalElapsedTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("Tween", "get_total_elapsed_time", 1740695150L), hostObject.objectPtr)

  /** Tween.is_running */
  final def isRunning(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tween", "is_running", 2240911060L), hostObject.objectPtr)

  /** Tween.is_valid */
  final def isValid(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Tween", "is_valid", 2240911060L), hostObject.objectPtr)

  /** Tween.bind_node */
  final def bindNode(node: Node): GodotObject =
    Ptrcall.call1[GodotObject, GodotObject](MethodBind.get("Tween", "bind_node", 2946786331L), hostObject.objectPtr, node.hostObject)

  /** Tween.set_process_mode */
  final def setProcessMode(mode: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Tween", "set_process_mode", 855258840L), hostObject.objectPtr, mode)

  /** Tween.set_pause_mode */
  final def setPauseMode(mode: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Tween", "set_pause_mode", 3363368837L), hostObject.objectPtr, mode)

  /** Tween.set_ignore_time_scale */
  final def setIgnoreTimeScale(ignore: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("Tween", "set_ignore_time_scale", 1942052223L), hostObject.objectPtr, ignore)

  /** Tween.set_parallel */
  final def setParallel(parallel: Boolean): GodotObject =
    Ptrcall.call1[Boolean, GodotObject](MethodBind.get("Tween", "set_parallel", 1942052223L), hostObject.objectPtr, parallel)

  /** Tween.set_loops */
  final def setLoops(loops: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Tween", "set_loops", 2670836414L), hostObject.objectPtr, loops)

  /** Tween.get_loops_left */
  final def getLoopsLeft(): Long =
    Ptrcall.call0[Long](MethodBind.get("Tween", "get_loops_left", 3905245786L), hostObject.objectPtr)

  /** Tween.set_speed_scale */
  final def setSpeedScale(speed: Double): GodotObject =
    Ptrcall.call1[Double, GodotObject](MethodBind.get("Tween", "set_speed_scale", 3961971106L), hostObject.objectPtr, speed)

  /** Tween.set_trans */
  final def setTrans(trans: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Tween", "set_trans", 3965963875L), hostObject.objectPtr, trans)

  /** Tween.set_ease */
  final def setEase(ease: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("Tween", "set_ease", 1208117252L), hostObject.objectPtr, ease)

  /** Tween.parallel */
  final def parallel(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Tween", "parallel", 3426978995L), hostObject.objectPtr)

  /** Tween.chain */
  final def chain(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Tween", "chain", 3426978995L), hostObject.objectPtr)

}

object Tween {
  /** Class metadata for Gd[Tween] lifetime management and casting. */
  given GodotClass[Tween] with {
    def className = "Tween"
    def isRefCounted = true
    def wrap(o: GodotObject): Tween = new Tween {}.withHost(o.objectPtr)
    def unwrap(t: Tween): GodotObject = t.hostObject
  }
}
