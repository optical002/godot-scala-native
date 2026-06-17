package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `CPUParticles2D`, extends `Node2D`. */
abstract class CPUParticles2D extends Node2D {

  /** CPUParticles2D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emitting", 2586408642L), hostObject.objectPtr, emitting)

  /** CPUParticles2D.set_amount */
  final def setAmount(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_amount", 1286410249L), hostObject.objectPtr, amount)

  /** CPUParticles2D.set_lifetime */
  final def setLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** CPUParticles2D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_one_shot", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles2D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_pre_process_time", 373806689L), hostObject.objectPtr, secs)

  /** CPUParticles2D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_explosiveness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** CPUParticles2D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_randomness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** CPUParticles2D.set_lifetime_randomness */
  final def setLifetimeRandomness(random: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_lifetime_randomness", 373806689L), hostObject.objectPtr, random)

  /** CPUParticles2D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_use_local_coordinates", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles2D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_fixed_fps", 1286410249L), hostObject.objectPtr, fps)

  /** CPUParticles2D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_fractional_delta", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles2D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** CPUParticles2D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "request_particles_process", 373806689L), hostObject.objectPtr, process_time)

  /** CPUParticles2D.is_emitting */
  final def isEmitting(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "is_emitting", 36873697L), hostObject.objectPtr)

  /** CPUParticles2D.get_amount */
  final def getAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles2D", "get_amount", 3905245786L), hostObject.objectPtr)

  /** CPUParticles2D.get_lifetime */
  final def getLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_lifetime", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_one_shot */
  final def getOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "get_one_shot", 36873697L), hostObject.objectPtr)

  /** CPUParticles2D.get_pre_process_time */
  final def getPreProcessTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_pre_process_time", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_explosiveness_ratio", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_randomness_ratio */
  final def getRandomnessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_randomness_ratio", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_lifetime_randomness", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "get_use_local_coordinates", 36873697L), hostObject.objectPtr)

  /** CPUParticles2D.get_fixed_fps */
  final def getFixedFps(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles2D", "get_fixed_fps", 3905245786L), hostObject.objectPtr)

  /** CPUParticles2D.get_fractional_delta */
  final def getFractionalDelta(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "get_fractional_delta", 36873697L), hostObject.objectPtr)

  /** CPUParticles2D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_use_fixed_seed", 2586408642L), hostObject.objectPtr, use_fixed_seed)

  /** CPUParticles2D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "get_use_fixed_seed", 36873697L), hostObject.objectPtr)

  /** CPUParticles2D.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** CPUParticles2D.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles2D", "get_seed", 3905245786L), hostObject.objectPtr)

  /** CPUParticles2D.set_draw_order */
  final def setDrawOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_draw_order", 4183193490L), hostObject.objectPtr, order)

  /** CPUParticles2D.get_draw_order */
  final def getDrawOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles2D", "get_draw_order", 1668655735L), hostObject.objectPtr)

  /** CPUParticles2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** CPUParticles2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** CPUParticles2D.restart */
  final def restart(keep_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "restart", 107499316L), hostObject.objectPtr, keep_seed)

  /** CPUParticles2D.set_direction */
  final def setDirection(direction: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_direction", 743155724L), hostObject.objectPtr, direction)

  /** CPUParticles2D.get_direction */
  final def getDirection(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CPUParticles2D", "get_direction", 3341600327L), hostObject.objectPtr)

  /** CPUParticles2D.set_spread */
  final def setSpread(spread: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_spread", 373806689L), hostObject.objectPtr, spread)

  /** CPUParticles2D.get_spread */
  final def getSpread(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_spread", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.set_param_min */
  final def setParamMin(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles2D", "set_param_min", 3320615296L), hostObject.objectPtr, param, value)

  /** CPUParticles2D.get_param_min */
  final def getParamMin(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("CPUParticles2D", "get_param_min", 2038050600L), hostObject.objectPtr, param)

  /** CPUParticles2D.set_param_max */
  final def setParamMax(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles2D", "set_param_max", 3320615296L), hostObject.objectPtr, param, value)

  /** CPUParticles2D.get_param_max */
  final def getParamMax(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("CPUParticles2D", "get_param_max", 2038050600L), hostObject.objectPtr, param)

  /** CPUParticles2D.set_param_curve */
  final def setParamCurve(param: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles2D", "set_param_curve", 2959350143L), hostObject.objectPtr, param, curve.hostObject)

  /** CPUParticles2D.get_param_curve */
  final def getParamCurve(param: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CPUParticles2D", "get_param_curve", 2603158474L), hostObject.objectPtr, param)

  /** CPUParticles2D.set_color */
  final def setColor(color: io.github.optical002.godot.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CPUParticles2D.get_color */
  final def getColor(): io.github.optical002.godot.builtin.Color =
    Ptrcall.call0[io.github.optical002.godot.builtin.Color](MethodBind.get("CPUParticles2D", "get_color", 3444240500L), hostObject.objectPtr)

  /** CPUParticles2D.set_color_ramp */
  final def setColorRamp(ramp: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_color_ramp", 2756054477L), hostObject.objectPtr, ramp.hostObject)

  /** CPUParticles2D.get_color_ramp */
  final def getColorRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles2D", "get_color_ramp", 132272999L), hostObject.objectPtr)

  /** CPUParticles2D.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_color_initial_ramp", 2756054477L), hostObject.objectPtr, ramp.hostObject)

  /** CPUParticles2D.get_color_initial_ramp */
  final def getColorInitialRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles2D", "get_color_initial_ramp", 132272999L), hostObject.objectPtr)

  /** CPUParticles2D.set_particle_flag */
  final def setParticleFlag(particle_flag: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles2D", "set_particle_flag", 4178137949L), hostObject.objectPtr, particle_flag, enable)

  /** CPUParticles2D.get_particle_flag */
  final def getParticleFlag(particle_flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CPUParticles2D", "get_particle_flag", 2829976507L), hostObject.objectPtr, particle_flag)

  /** CPUParticles2D.set_emission_shape */
  final def setEmissionShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emission_shape", 393763892L), hostObject.objectPtr, shape)

  /** CPUParticles2D.get_emission_shape */
  final def getEmissionShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles2D", "get_emission_shape", 1740246024L), hostObject.objectPtr)

  /** CPUParticles2D.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emission_sphere_radius", 373806689L), hostObject.objectPtr, radius)

  /** CPUParticles2D.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_emission_sphere_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.set_emission_rect_extents */
  final def setEmissionRectExtents(extents: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emission_rect_extents", 743155724L), hostObject.objectPtr, extents)

  /** CPUParticles2D.get_emission_rect_extents */
  final def getEmissionRectExtents(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CPUParticles2D", "get_emission_rect_extents", 3341600327L), hostObject.objectPtr)

  /** CPUParticles2D.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(inner_radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emission_ring_inner_radius", 373806689L), hostObject.objectPtr, inner_radius)

  /** CPUParticles2D.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_emission_ring_inner_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_emission_ring_radius", 373806689L), hostObject.objectPtr, radius)

  /** CPUParticles2D.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles2D", "get_emission_ring_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles2D.get_gravity */
  final def getGravity(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("CPUParticles2D", "get_gravity", 3341600327L), hostObject.objectPtr)

  /** CPUParticles2D.set_gravity */
  final def setGravity(accel_vec: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_gravity", 743155724L), hostObject.objectPtr, accel_vec)

  /** CPUParticles2D.get_split_scale */
  final def getSplitScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles2D", "get_split_scale", 2240911060L), hostObject.objectPtr)

  /** CPUParticles2D.set_split_scale */
  final def setSplitScale(split_scale: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_split_scale", 2586408642L), hostObject.objectPtr, split_scale)

  /** CPUParticles2D.get_scale_curve_x */
  final def getScaleCurveX(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles2D", "get_scale_curve_x", 2460114913L), hostObject.objectPtr)

  /** CPUParticles2D.set_scale_curve_x */
  final def setScaleCurveX(scale_curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_scale_curve_x", 270443179L), hostObject.objectPtr, scale_curve.hostObject)

  /** CPUParticles2D.get_scale_curve_y */
  final def getScaleCurveY(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles2D", "get_scale_curve_y", 2460114913L), hostObject.objectPtr)

  /** CPUParticles2D.set_scale_curve_y */
  final def setScaleCurveY(scale_curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "set_scale_curve_y", 270443179L), hostObject.objectPtr, scale_curve.hostObject)

  /** CPUParticles2D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles2D", "convert_from_particles", 1078189570L), hostObject.objectPtr, particles.hostObject)

}

object CPUParticles2D {
  /** Class metadata for Gd[CPUParticles2D] lifetime management and casting. */
  given GodotClass[CPUParticles2D] with {
    def className = "CPUParticles2D"
    def isRefCounted = false
    def wrap(o: GodotObject): CPUParticles2D = new CPUParticles2D {}.withHost(o.objectPtr)
    def unwrap(t: CPUParticles2D): GodotObject = t.hostObject
  }
}
