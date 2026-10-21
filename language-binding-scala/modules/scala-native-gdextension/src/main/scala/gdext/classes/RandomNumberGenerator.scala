package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `RandomNumberGenerator`, extends `RefCounted`. */
abstract class RandomNumberGenerator extends RefCounted {
  override def godotClassName: String = "RandomNumberGenerator"

  /** RandomNumberGenerator.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.RandomNumberGenerator.mb_set_seed == null) gdext.classes.RandomNumberGenerator.mb_set_seed = MethodBind.get("RandomNumberGenerator", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RandomNumberGenerator.mb_set_seed, livePtr, seed)
  }

  /** RandomNumberGenerator.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.RandomNumberGenerator.mb_get_seed == null) gdext.classes.RandomNumberGenerator.mb_get_seed = MethodBind.get("RandomNumberGenerator", "get_seed", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.RandomNumberGenerator.mb_get_seed, livePtr)
  }

  /** RandomNumberGenerator.set_state */
  final def setState(state: Long): Unit = {
    if (gdext.classes.RandomNumberGenerator.mb_set_state == null) gdext.classes.RandomNumberGenerator.mb_set_state = MethodBind.get("RandomNumberGenerator", "set_state", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.RandomNumberGenerator.mb_set_state, livePtr, state)
  }

  /** RandomNumberGenerator.get_state */
  final def getState(): Long = {
    if (gdext.classes.RandomNumberGenerator.mb_get_state == null) gdext.classes.RandomNumberGenerator.mb_get_state = MethodBind.get("RandomNumberGenerator", "get_state", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.RandomNumberGenerator.mb_get_state, livePtr)
  }

  /** RandomNumberGenerator.randi */
  final def randi(): Long = {
    if (gdext.classes.RandomNumberGenerator.mb_randi == null) gdext.classes.RandomNumberGenerator.mb_randi = MethodBind.get("RandomNumberGenerator", "randi", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.RandomNumberGenerator.mb_randi, livePtr)
  }

  /** RandomNumberGenerator.randf */
  final def randf(): Double = {
    if (gdext.classes.RandomNumberGenerator.mb_randf == null) gdext.classes.RandomNumberGenerator.mb_randf = MethodBind.get("RandomNumberGenerator", "randf", 191475506L)
    Ptrcall.call0[Double](gdext.classes.RandomNumberGenerator.mb_randf, livePtr)
  }

  /** RandomNumberGenerator.randfn */
  final def randfn(mean: Double, deviation: Double): Double = {
    if (gdext.classes.RandomNumberGenerator.mb_randfn == null) gdext.classes.RandomNumberGenerator.mb_randfn = MethodBind.get("RandomNumberGenerator", "randfn", 837325100L)
    Ptrcall.call2[Double, Double, Double](gdext.classes.RandomNumberGenerator.mb_randfn, livePtr, mean, deviation)
  }

  /** RandomNumberGenerator.randf_range */
  final def randfRange(from: Double, to: Double): Double = {
    if (gdext.classes.RandomNumberGenerator.mb_randf_range == null) gdext.classes.RandomNumberGenerator.mb_randf_range = MethodBind.get("RandomNumberGenerator", "randf_range", 4269894367L)
    Ptrcall.call2[Double, Double, Double](gdext.classes.RandomNumberGenerator.mb_randf_range, livePtr, from, to)
  }

  /** RandomNumberGenerator.randi_range */
  final def randiRange(from: Long, to: Long): Long = {
    if (gdext.classes.RandomNumberGenerator.mb_randi_range == null) gdext.classes.RandomNumberGenerator.mb_randi_range = MethodBind.get("RandomNumberGenerator", "randi_range", 50157827L)
    Ptrcall.call2[Long, Long, Long](gdext.classes.RandomNumberGenerator.mb_randi_range, livePtr, from, to)
  }

  /** RandomNumberGenerator.randomize */
  final def randomize(): Unit = {
    if (gdext.classes.RandomNumberGenerator.mb_randomize == null) gdext.classes.RandomNumberGenerator.mb_randomize = MethodBind.get("RandomNumberGenerator", "randomize", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.RandomNumberGenerator.mb_randomize, livePtr)
  }

}

object RandomNumberGenerator {
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_state: GDExtensionMethodBindPtr = null
  private[classes] var mb_randi: GDExtensionMethodBindPtr = null
  private[classes] var mb_randf: GDExtensionMethodBindPtr = null
  private[classes] var mb_randfn: GDExtensionMethodBindPtr = null
  private[classes] var mb_randf_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_randi_range: GDExtensionMethodBindPtr = null
  private[classes] var mb_randomize: GDExtensionMethodBindPtr = null
}
