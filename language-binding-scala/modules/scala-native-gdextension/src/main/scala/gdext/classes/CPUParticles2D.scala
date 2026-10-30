package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CPUParticles2D`, extends `Node2D`. */
abstract class CPUParticles2D extends Node2D {
  override def godotClassName: String = "CPUParticles2D"

  /** CPUParticles2D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emitting == null) gdext.classes.CPUParticles2D.mb_set_emitting = MethodBind.get("CPUParticles2D", "set_emitting", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emitting, livePtr, emitting)
  }

  /** CPUParticles2D.set_amount */
  final def setAmount(amount: Long): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_amount == null) gdext.classes.CPUParticles2D.mb_set_amount = MethodBind.get("CPUParticles2D", "set_amount", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_amount, livePtr, amount)
  }

  /** CPUParticles2D.set_lifetime */
  final def setLifetime(secs: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_lifetime == null) gdext.classes.CPUParticles2D.mb_set_lifetime = MethodBind.get("CPUParticles2D", "set_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_lifetime, livePtr, secs)
  }

  /** CPUParticles2D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_one_shot == null) gdext.classes.CPUParticles2D.mb_set_one_shot = MethodBind.get("CPUParticles2D", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_one_shot, livePtr, enable)
  }

  /** CPUParticles2D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_pre_process_time == null) gdext.classes.CPUParticles2D.mb_set_pre_process_time = MethodBind.get("CPUParticles2D", "set_pre_process_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_pre_process_time, livePtr, secs)
  }

  /** CPUParticles2D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_explosiveness_ratio == null) gdext.classes.CPUParticles2D.mb_set_explosiveness_ratio = MethodBind.get("CPUParticles2D", "set_explosiveness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_explosiveness_ratio, livePtr, ratio)
  }

  /** CPUParticles2D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_randomness_ratio == null) gdext.classes.CPUParticles2D.mb_set_randomness_ratio = MethodBind.get("CPUParticles2D", "set_randomness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_randomness_ratio, livePtr, ratio)
  }

  /** CPUParticles2D.set_lifetime_randomness */
  final def setLifetimeRandomness(random: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_lifetime_randomness == null) gdext.classes.CPUParticles2D.mb_set_lifetime_randomness = MethodBind.get("CPUParticles2D", "set_lifetime_randomness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_lifetime_randomness, livePtr, random)
  }

  /** CPUParticles2D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_use_local_coordinates == null) gdext.classes.CPUParticles2D.mb_set_use_local_coordinates = MethodBind.get("CPUParticles2D", "set_use_local_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_use_local_coordinates, livePtr, enable)
  }

  /** CPUParticles2D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_fixed_fps == null) gdext.classes.CPUParticles2D.mb_set_fixed_fps = MethodBind.get("CPUParticles2D", "set_fixed_fps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_fixed_fps, livePtr, fps)
  }

  /** CPUParticles2D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_fractional_delta == null) gdext.classes.CPUParticles2D.mb_set_fractional_delta = MethodBind.get("CPUParticles2D", "set_fractional_delta", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_fractional_delta, livePtr, enable)
  }

  /** CPUParticles2D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_speed_scale == null) gdext.classes.CPUParticles2D.mb_set_speed_scale = MethodBind.get("CPUParticles2D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_speed_scale, livePtr, scale)
  }

  /** CPUParticles2D.request_particles_process */
  final def requestParticlesProcess(processTime: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_request_particles_process == null) gdext.classes.CPUParticles2D.mb_request_particles_process = MethodBind.get("CPUParticles2D", "request_particles_process", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_request_particles_process, livePtr, processTime)
  }

  /** CPUParticles2D.is_emitting */
  final def isEmitting(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_is_emitting == null) gdext.classes.CPUParticles2D.mb_is_emitting = MethodBind.get("CPUParticles2D", "is_emitting", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_is_emitting, livePtr)
  }

  /** CPUParticles2D.get_amount */
  final def getAmount(): Long = {
    if (gdext.classes.CPUParticles2D.mb_get_amount == null) gdext.classes.CPUParticles2D.mb_get_amount = MethodBind.get("CPUParticles2D", "get_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_amount, livePtr)
  }

  /** CPUParticles2D.get_lifetime */
  final def getLifetime(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_lifetime == null) gdext.classes.CPUParticles2D.mb_get_lifetime = MethodBind.get("CPUParticles2D", "get_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_lifetime, livePtr)
  }

  /** CPUParticles2D.get_one_shot */
  final def getOneShot(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_one_shot == null) gdext.classes.CPUParticles2D.mb_get_one_shot = MethodBind.get("CPUParticles2D", "get_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_get_one_shot, livePtr)
  }

  /** CPUParticles2D.get_pre_process_time */
  final def getPreProcessTime(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_pre_process_time == null) gdext.classes.CPUParticles2D.mb_get_pre_process_time = MethodBind.get("CPUParticles2D", "get_pre_process_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_pre_process_time, livePtr)
  }

  /** CPUParticles2D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_explosiveness_ratio == null) gdext.classes.CPUParticles2D.mb_get_explosiveness_ratio = MethodBind.get("CPUParticles2D", "get_explosiveness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_explosiveness_ratio, livePtr)
  }

  /** CPUParticles2D.get_randomness_ratio */
  final def getRandomnessRatio(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_randomness_ratio == null) gdext.classes.CPUParticles2D.mb_get_randomness_ratio = MethodBind.get("CPUParticles2D", "get_randomness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_randomness_ratio, livePtr)
  }

  /** CPUParticles2D.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_lifetime_randomness == null) gdext.classes.CPUParticles2D.mb_get_lifetime_randomness = MethodBind.get("CPUParticles2D", "get_lifetime_randomness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_lifetime_randomness, livePtr)
  }

  /** CPUParticles2D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_use_local_coordinates == null) gdext.classes.CPUParticles2D.mb_get_use_local_coordinates = MethodBind.get("CPUParticles2D", "get_use_local_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_get_use_local_coordinates, livePtr)
  }

  /** CPUParticles2D.get_fixed_fps */
  final def getFixedFps(): Long = {
    if (gdext.classes.CPUParticles2D.mb_get_fixed_fps == null) gdext.classes.CPUParticles2D.mb_get_fixed_fps = MethodBind.get("CPUParticles2D", "get_fixed_fps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_fixed_fps, livePtr)
  }

  /** CPUParticles2D.get_fractional_delta */
  final def getFractionalDelta(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_fractional_delta == null) gdext.classes.CPUParticles2D.mb_get_fractional_delta = MethodBind.get("CPUParticles2D", "get_fractional_delta", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_get_fractional_delta, livePtr)
  }

  /** CPUParticles2D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_speed_scale == null) gdext.classes.CPUParticles2D.mb_get_speed_scale = MethodBind.get("CPUParticles2D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_speed_scale, livePtr)
  }

  /** CPUParticles2D.set_use_fixed_seed */
  final def setUseFixedSeed(useFixedSeed: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_use_fixed_seed == null) gdext.classes.CPUParticles2D.mb_set_use_fixed_seed = MethodBind.get("CPUParticles2D", "set_use_fixed_seed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_use_fixed_seed, livePtr, useFixedSeed)
  }

  /** CPUParticles2D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_use_fixed_seed == null) gdext.classes.CPUParticles2D.mb_get_use_fixed_seed = MethodBind.get("CPUParticles2D", "get_use_fixed_seed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_get_use_fixed_seed, livePtr)
  }

  /** CPUParticles2D.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_seed == null) gdext.classes.CPUParticles2D.mb_set_seed = MethodBind.get("CPUParticles2D", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_seed, livePtr, seed)
  }

  /** CPUParticles2D.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.CPUParticles2D.mb_get_seed == null) gdext.classes.CPUParticles2D.mb_get_seed = MethodBind.get("CPUParticles2D", "get_seed", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_seed, livePtr)
  }

  /** CPUParticles2D.set_draw_order */
  final def setDrawOrder(order: gdext.classes.CPUParticles2D.DrawOrder): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_draw_order == null) gdext.classes.CPUParticles2D.mb_set_draw_order = MethodBind.get("CPUParticles2D", "set_draw_order", 4183193490L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_draw_order, livePtr, order)
  }

  /** CPUParticles2D.get_draw_order */
  final def getDrawOrder(): gdext.classes.CPUParticles2D.DrawOrder = {
    if (gdext.classes.CPUParticles2D.mb_get_draw_order == null) gdext.classes.CPUParticles2D.mb_get_draw_order = MethodBind.get("CPUParticles2D", "get_draw_order", 1668655735L)
    gdext.classes.CPUParticles2D.DrawOrder(Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_draw_order, livePtr))
  }

  /** CPUParticles2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_texture == null) gdext.classes.CPUParticles2D.mb_set_texture = MethodBind.get("CPUParticles2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** CPUParticles2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.CPUParticles2D.mb_get_texture == null) gdext.classes.CPUParticles2D.mb_get_texture = MethodBind.get("CPUParticles2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_texture, livePtr))
  }

  /** CPUParticles2D.restart */
  final def restart(keepSeed: Boolean = false): Unit = {
    if (gdext.classes.CPUParticles2D.mb_restart == null) gdext.classes.CPUParticles2D.mb_restart = MethodBind.get("CPUParticles2D", "restart", 107499316L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_restart, livePtr, keepSeed)
  }

  /** CPUParticles2D.set_direction */
  final def setDirection(direction: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_direction == null) gdext.classes.CPUParticles2D.mb_set_direction = MethodBind.get("CPUParticles2D", "set_direction", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_direction, livePtr, direction)
  }

  /** CPUParticles2D.get_direction */
  final def getDirection(): gdext.builtin.Vector2 = {
    if (gdext.classes.CPUParticles2D.mb_get_direction == null) gdext.classes.CPUParticles2D.mb_get_direction = MethodBind.get("CPUParticles2D", "get_direction", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CPUParticles2D.mb_get_direction, livePtr)
  }

  /** CPUParticles2D.set_spread */
  final def setSpread(spread: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_spread == null) gdext.classes.CPUParticles2D.mb_set_spread = MethodBind.get("CPUParticles2D", "set_spread", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_spread, livePtr, spread)
  }

  /** CPUParticles2D.get_spread */
  final def getSpread(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_spread == null) gdext.classes.CPUParticles2D.mb_get_spread = MethodBind.get("CPUParticles2D", "get_spread", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_spread, livePtr)
  }

  /** CPUParticles2D.set_param_min */
  final def setParamMin(param: gdext.classes.CPUParticles2D.Parameter, value: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_param_min == null) gdext.classes.CPUParticles2D.mb_set_param_min = MethodBind.get("CPUParticles2D", "set_param_min", 3320615296L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles2D.mb_set_param_min, livePtr, param, value)
  }

  /** CPUParticles2D.get_param_min */
  final def getParamMin(param: gdext.classes.CPUParticles2D.Parameter): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_param_min == null) gdext.classes.CPUParticles2D.mb_get_param_min = MethodBind.get("CPUParticles2D", "get_param_min", 2038050600L)
    Ptrcall.call1[Long, Double](gdext.classes.CPUParticles2D.mb_get_param_min, livePtr, param)
  }

  /** CPUParticles2D.set_param_max */
  final def setParamMax(param: gdext.classes.CPUParticles2D.Parameter, value: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_param_max == null) gdext.classes.CPUParticles2D.mb_set_param_max = MethodBind.get("CPUParticles2D", "set_param_max", 3320615296L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles2D.mb_set_param_max, livePtr, param, value)
  }

  /** CPUParticles2D.get_param_max */
  final def getParamMax(param: gdext.classes.CPUParticles2D.Parameter): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_param_max == null) gdext.classes.CPUParticles2D.mb_get_param_max = MethodBind.get("CPUParticles2D", "get_param_max", 2038050600L)
    Ptrcall.call1[Long, Double](gdext.classes.CPUParticles2D.mb_get_param_max, livePtr, param)
  }

  /** CPUParticles2D.set_param_curve */
  final def setParamCurve(param: gdext.classes.CPUParticles2D.Parameter, curve: Curve): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_param_curve == null) gdext.classes.CPUParticles2D.mb_set_param_curve = MethodBind.get("CPUParticles2D", "set_param_curve", 2959350143L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles2D.mb_set_param_curve, livePtr, param, Wrappers.handle(curve))
  }

  /** CPUParticles2D.get_param_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getParamCurve(param: gdext.classes.CPUParticles2D.Parameter): Curve = {
    if (gdext.classes.CPUParticles2D.mb_get_param_curve == null) gdext.classes.CPUParticles2D.mb_get_param_curve = MethodBind.get("CPUParticles2D", "get_param_curve", 2603158474L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.CPUParticles2D.mb_get_param_curve, livePtr, param))
  }

  /** CPUParticles2D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_color == null) gdext.classes.CPUParticles2D.mb_set_color = MethodBind.get("CPUParticles2D", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_color, livePtr, color)
  }

  /** CPUParticles2D.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.CPUParticles2D.mb_get_color == null) gdext.classes.CPUParticles2D.mb_get_color = MethodBind.get("CPUParticles2D", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CPUParticles2D.mb_get_color, livePtr)
  }

  /** CPUParticles2D.set_color_ramp */
  final def setColorRamp(ramp: Gradient): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_color_ramp == null) gdext.classes.CPUParticles2D.mb_set_color_ramp = MethodBind.get("CPUParticles2D", "set_color_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_color_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** CPUParticles2D.get_color_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorRamp(): Gradient = {
    if (gdext.classes.CPUParticles2D.mb_get_color_ramp == null) gdext.classes.CPUParticles2D.mb_get_color_ramp = MethodBind.get("CPUParticles2D", "get_color_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_color_ramp, livePtr))
  }

  /** CPUParticles2D.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Gradient): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_color_initial_ramp == null) gdext.classes.CPUParticles2D.mb_set_color_initial_ramp = MethodBind.get("CPUParticles2D", "set_color_initial_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_color_initial_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** CPUParticles2D.get_color_initial_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorInitialRamp(): Gradient = {
    if (gdext.classes.CPUParticles2D.mb_get_color_initial_ramp == null) gdext.classes.CPUParticles2D.mb_get_color_initial_ramp = MethodBind.get("CPUParticles2D", "get_color_initial_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_color_initial_ramp, livePtr))
  }

  /** CPUParticles2D.set_particle_flag */
  final def setParticleFlag(particleFlag: gdext.classes.CPUParticles2D.ParticleFlags, enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_particle_flag == null) gdext.classes.CPUParticles2D.mb_set_particle_flag = MethodBind.get("CPUParticles2D", "set_particle_flag", 4178137949L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles2D.mb_set_particle_flag, livePtr, particleFlag, enable)
  }

  /** CPUParticles2D.get_particle_flag */
  final def getParticleFlag(particleFlag: gdext.classes.CPUParticles2D.ParticleFlags): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_particle_flag == null) gdext.classes.CPUParticles2D.mb_get_particle_flag = MethodBind.get("CPUParticles2D", "get_particle_flag", 2829976507L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CPUParticles2D.mb_get_particle_flag, livePtr, particleFlag)
  }

  /** CPUParticles2D.set_emission_shape */
  final def setEmissionShape(shape: gdext.classes.CPUParticles2D.EmissionShape): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emission_shape == null) gdext.classes.CPUParticles2D.mb_set_emission_shape = MethodBind.get("CPUParticles2D", "set_emission_shape", 393763892L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emission_shape, livePtr, shape)
  }

  /** CPUParticles2D.get_emission_shape */
  final def getEmissionShape(): gdext.classes.CPUParticles2D.EmissionShape = {
    if (gdext.classes.CPUParticles2D.mb_get_emission_shape == null) gdext.classes.CPUParticles2D.mb_get_emission_shape = MethodBind.get("CPUParticles2D", "get_emission_shape", 1740246024L)
    gdext.classes.CPUParticles2D.EmissionShape(Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_emission_shape, livePtr))
  }

  /** CPUParticles2D.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emission_sphere_radius == null) gdext.classes.CPUParticles2D.mb_set_emission_sphere_radius = MethodBind.get("CPUParticles2D", "set_emission_sphere_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emission_sphere_radius, livePtr, radius)
  }

  /** CPUParticles2D.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_emission_sphere_radius == null) gdext.classes.CPUParticles2D.mb_get_emission_sphere_radius = MethodBind.get("CPUParticles2D", "get_emission_sphere_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_emission_sphere_radius, livePtr)
  }

  /** CPUParticles2D.set_emission_rect_extents */
  final def setEmissionRectExtents(extents: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emission_rect_extents == null) gdext.classes.CPUParticles2D.mb_set_emission_rect_extents = MethodBind.get("CPUParticles2D", "set_emission_rect_extents", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emission_rect_extents, livePtr, extents)
  }

  /** CPUParticles2D.get_emission_rect_extents */
  final def getEmissionRectExtents(): gdext.builtin.Vector2 = {
    if (gdext.classes.CPUParticles2D.mb_get_emission_rect_extents == null) gdext.classes.CPUParticles2D.mb_get_emission_rect_extents = MethodBind.get("CPUParticles2D", "get_emission_rect_extents", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CPUParticles2D.mb_get_emission_rect_extents, livePtr)
  }

  /** CPUParticles2D.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(innerRadius: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emission_ring_inner_radius == null) gdext.classes.CPUParticles2D.mb_set_emission_ring_inner_radius = MethodBind.get("CPUParticles2D", "set_emission_ring_inner_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emission_ring_inner_radius, livePtr, innerRadius)
  }

  /** CPUParticles2D.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_emission_ring_inner_radius == null) gdext.classes.CPUParticles2D.mb_get_emission_ring_inner_radius = MethodBind.get("CPUParticles2D", "get_emission_ring_inner_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_emission_ring_inner_radius, livePtr)
  }

  /** CPUParticles2D.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_emission_ring_radius == null) gdext.classes.CPUParticles2D.mb_set_emission_ring_radius = MethodBind.get("CPUParticles2D", "set_emission_ring_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_emission_ring_radius, livePtr, radius)
  }

  /** CPUParticles2D.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double = {
    if (gdext.classes.CPUParticles2D.mb_get_emission_ring_radius == null) gdext.classes.CPUParticles2D.mb_get_emission_ring_radius = MethodBind.get("CPUParticles2D", "get_emission_ring_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles2D.mb_get_emission_ring_radius, livePtr)
  }

  /** CPUParticles2D.get_gravity */
  final def getGravity(): gdext.builtin.Vector2 = {
    if (gdext.classes.CPUParticles2D.mb_get_gravity == null) gdext.classes.CPUParticles2D.mb_get_gravity = MethodBind.get("CPUParticles2D", "get_gravity", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.CPUParticles2D.mb_get_gravity, livePtr)
  }

  /** CPUParticles2D.set_gravity */
  final def setGravity(accelVec: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_gravity == null) gdext.classes.CPUParticles2D.mb_set_gravity = MethodBind.get("CPUParticles2D", "set_gravity", 743155724L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_gravity, livePtr, accelVec)
  }

  /** CPUParticles2D.get_split_scale */
  final def getSplitScale(): Boolean = {
    if (gdext.classes.CPUParticles2D.mb_get_split_scale == null) gdext.classes.CPUParticles2D.mb_get_split_scale = MethodBind.get("CPUParticles2D", "get_split_scale", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles2D.mb_get_split_scale, livePtr)
  }

  /** CPUParticles2D.set_split_scale */
  final def setSplitScale(splitScale: Boolean): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_split_scale == null) gdext.classes.CPUParticles2D.mb_set_split_scale = MethodBind.get("CPUParticles2D", "set_split_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_split_scale, livePtr, splitScale)
  }

  /** CPUParticles2D.get_scale_curve_x. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getScaleCurveX(): Curve = {
    if (gdext.classes.CPUParticles2D.mb_get_scale_curve_x == null) gdext.classes.CPUParticles2D.mb_get_scale_curve_x = MethodBind.get("CPUParticles2D", "get_scale_curve_x", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_scale_curve_x, livePtr))
  }

  /** CPUParticles2D.set_scale_curve_x */
  final def setScaleCurveX(scaleCurve: Curve): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_scale_curve_x == null) gdext.classes.CPUParticles2D.mb_set_scale_curve_x = MethodBind.get("CPUParticles2D", "set_scale_curve_x", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_scale_curve_x, livePtr, Wrappers.handle(scaleCurve))
  }

  /** CPUParticles2D.get_scale_curve_y. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getScaleCurveY(): Curve = {
    if (gdext.classes.CPUParticles2D.mb_get_scale_curve_y == null) gdext.classes.CPUParticles2D.mb_get_scale_curve_y = MethodBind.get("CPUParticles2D", "get_scale_curve_y", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CPUParticles2D.mb_get_scale_curve_y, livePtr))
  }

  /** CPUParticles2D.set_scale_curve_y */
  final def setScaleCurveY(scaleCurve: Curve): Unit = {
    if (gdext.classes.CPUParticles2D.mb_set_scale_curve_y == null) gdext.classes.CPUParticles2D.mb_set_scale_curve_y = MethodBind.get("CPUParticles2D", "set_scale_curve_y", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_set_scale_curve_y, livePtr, Wrappers.handle(scaleCurve))
  }

  /** CPUParticles2D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit = {
    if (gdext.classes.CPUParticles2D.mb_convert_from_particles == null) gdext.classes.CPUParticles2D.mb_convert_from_particles = MethodBind.get("CPUParticles2D", "convert_from_particles", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles2D.mb_convert_from_particles, livePtr, Wrappers.handle(particles))
  }

}

object CPUParticles2D {
  private[classes] var mb_set_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_particles_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_restart: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_initial_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_initial_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particle_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particle_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_sphere_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_sphere_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_rect_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_rect_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_split_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_split_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_from_particles: GDExtensionMethodBindPtr = null

  /** Godot enum `CPUParticles2D.DrawOrder`. */
  opaque type DrawOrder <: Long = Long

  object DrawOrder {
    final val Index: DrawOrder = 0L.asInstanceOf[DrawOrder]
    final val Lifetime: DrawOrder = 1L.asInstanceOf[DrawOrder]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DrawOrder = value.asInstanceOf[DrawOrder]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DrawOrder] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[DrawOrder]]

    extension (self: DrawOrder)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Index"
        case 1L => "Lifetime"
        case other => other.toString
      }
  }

  /** Godot enum `CPUParticles2D.Parameter`. */
  opaque type Parameter <: Long = Long

  object Parameter {
    final val InitialLinearVelocity: Parameter = 0L.asInstanceOf[Parameter]
    final val AngularVelocity: Parameter = 1L.asInstanceOf[Parameter]
    final val OrbitVelocity: Parameter = 2L.asInstanceOf[Parameter]
    final val LinearAccel: Parameter = 3L.asInstanceOf[Parameter]
    final val RadialAccel: Parameter = 4L.asInstanceOf[Parameter]
    final val TangentialAccel: Parameter = 5L.asInstanceOf[Parameter]
    final val Damping: Parameter = 6L.asInstanceOf[Parameter]
    final val Angle: Parameter = 7L.asInstanceOf[Parameter]
    final val Scale: Parameter = 8L.asInstanceOf[Parameter]
    final val HueVariation: Parameter = 9L.asInstanceOf[Parameter]
    final val AnimSpeed: Parameter = 10L.asInstanceOf[Parameter]
    final val AnimOffset: Parameter = 11L.asInstanceOf[Parameter]
    final val Max: Parameter = 12L.asInstanceOf[Parameter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Parameter = value.asInstanceOf[Parameter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Parameter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L).asInstanceOf[scala.IArray[Parameter]]

    extension (self: Parameter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "InitialLinearVelocity"
        case 1L => "AngularVelocity"
        case 2L => "OrbitVelocity"
        case 3L => "LinearAccel"
        case 4L => "RadialAccel"
        case 5L => "TangentialAccel"
        case 6L => "Damping"
        case 7L => "Angle"
        case 8L => "Scale"
        case 9L => "HueVariation"
        case 10L => "AnimSpeed"
        case 11L => "AnimOffset"
        case 12L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `CPUParticles2D.ParticleFlags`. */
  opaque type ParticleFlags <: Long = Long

  object ParticleFlags {
    final val AlignYToVelocity: ParticleFlags = 0L.asInstanceOf[ParticleFlags]
    final val RotateY: ParticleFlags = 1L.asInstanceOf[ParticleFlags]
    final val DisableZ: ParticleFlags = 2L.asInstanceOf[ParticleFlags]
    final val Max: ParticleFlags = 3L.asInstanceOf[ParticleFlags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ParticleFlags = value.asInstanceOf[ParticleFlags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ParticleFlags] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ParticleFlags]]

    extension (self: ParticleFlags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "AlignYToVelocity"
        case 1L => "RotateY"
        case 2L => "DisableZ"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `CPUParticles2D.EmissionShape`. */
  opaque type EmissionShape <: Long = Long

  object EmissionShape {
    final val Point: EmissionShape = 0L.asInstanceOf[EmissionShape]
    final val Sphere: EmissionShape = 1L.asInstanceOf[EmissionShape]
    final val SphereSurface: EmissionShape = 2L.asInstanceOf[EmissionShape]
    final val Rectangle: EmissionShape = 3L.asInstanceOf[EmissionShape]
    final val Points: EmissionShape = 4L.asInstanceOf[EmissionShape]
    final val DirectedPoints: EmissionShape = 5L.asInstanceOf[EmissionShape]
    final val Ring: EmissionShape = 6L.asInstanceOf[EmissionShape]
    final val Max: EmissionShape = 7L.asInstanceOf[EmissionShape]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EmissionShape = value.asInstanceOf[EmissionShape]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EmissionShape] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[EmissionShape]]

    extension (self: EmissionShape)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Point"
        case 1L => "Sphere"
        case 2L => "SphereSurface"
        case 3L => "Rectangle"
        case 4L => "Points"
        case 5L => "DirectedPoints"
        case 6L => "Ring"
        case 7L => "Max"
        case other => other.toString
      }
  }
}
