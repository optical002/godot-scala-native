package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `RandomNumberGenerator`, extends `RefCounted`. */
abstract class RandomNumberGenerator extends RefCounted {

  /** RandomNumberGenerator.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RandomNumberGenerator", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** RandomNumberGenerator.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("RandomNumberGenerator", "get_seed", 2455072627L), hostObject.objectPtr)

  /** RandomNumberGenerator.set_state */
  final def setState(state: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("RandomNumberGenerator", "set_state", 1286410249L), hostObject.objectPtr, state)

  /** RandomNumberGenerator.get_state */
  final def getState(): Long =
    Ptrcall.call0[Long](MethodBind.get("RandomNumberGenerator", "get_state", 3905245786L), hostObject.objectPtr)

  /** RandomNumberGenerator.randi */
  final def randi(): Long =
    Ptrcall.call0[Long](MethodBind.get("RandomNumberGenerator", "randi", 2455072627L), hostObject.objectPtr)

  /** RandomNumberGenerator.randf */
  final def randf(): Double =
    Ptrcall.call0[Double](MethodBind.get("RandomNumberGenerator", "randf", 191475506L), hostObject.objectPtr)

  /** RandomNumberGenerator.randfn */
  final def randfn(mean: Double, deviation: Double): Double =
    Ptrcall.call2[Double, Double, Double](MethodBind.get("RandomNumberGenerator", "randfn", 837325100L), hostObject.objectPtr, mean, deviation)

  /** RandomNumberGenerator.randf_range */
  final def randfRange(from: Double, to: Double): Double =
    Ptrcall.call2[Double, Double, Double](MethodBind.get("RandomNumberGenerator", "randf_range", 4269894367L), hostObject.objectPtr, from, to)

  /** RandomNumberGenerator.randi_range */
  final def randiRange(from: Long, to: Long): Long =
    Ptrcall.call2[Long, Long, Long](MethodBind.get("RandomNumberGenerator", "randi_range", 50157827L), hostObject.objectPtr, from, to)

  /** RandomNumberGenerator.randomize */
  final def randomize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("RandomNumberGenerator", "randomize", 3218959716L), hostObject.objectPtr)

}

object RandomNumberGenerator {
  /** Class metadata for Gd[RandomNumberGenerator] lifetime management and casting. */
  given GodotClass[RandomNumberGenerator] with {
    def className = "RandomNumberGenerator"
    def isRefCounted = true
    def wrap(o: GodotObject): RandomNumberGenerator = new RandomNumberGenerator {}.withHost(o.objectPtr)
    def unwrap(t: RandomNumberGenerator): GodotObject = t.hostObject
  }
}
