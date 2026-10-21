package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `CPUParticles3D`, extends `GeometryInstance3D`. */
abstract class CPUParticles3D extends GeometryInstance3D {
  override def godotClassName: String = "CPUParticles3D"

  /** CPUParticles3D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emitting == null) gdext.classes.CPUParticles3D.mb_set_emitting = MethodBind.get("CPUParticles3D", "set_emitting", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emitting, livePtr, emitting)
  }

  /** CPUParticles3D.set_amount */
  final def setAmount(amount: Long): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_amount == null) gdext.classes.CPUParticles3D.mb_set_amount = MethodBind.get("CPUParticles3D", "set_amount", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_amount, livePtr, amount)
  }

  /** CPUParticles3D.set_lifetime */
  final def setLifetime(secs: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_lifetime == null) gdext.classes.CPUParticles3D.mb_set_lifetime = MethodBind.get("CPUParticles3D", "set_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_lifetime, livePtr, secs)
  }

  /** CPUParticles3D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_one_shot == null) gdext.classes.CPUParticles3D.mb_set_one_shot = MethodBind.get("CPUParticles3D", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_one_shot, livePtr, enable)
  }

  /** CPUParticles3D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_pre_process_time == null) gdext.classes.CPUParticles3D.mb_set_pre_process_time = MethodBind.get("CPUParticles3D", "set_pre_process_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_pre_process_time, livePtr, secs)
  }

  /** CPUParticles3D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_explosiveness_ratio == null) gdext.classes.CPUParticles3D.mb_set_explosiveness_ratio = MethodBind.get("CPUParticles3D", "set_explosiveness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_explosiveness_ratio, livePtr, ratio)
  }

  /** CPUParticles3D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_randomness_ratio == null) gdext.classes.CPUParticles3D.mb_set_randomness_ratio = MethodBind.get("CPUParticles3D", "set_randomness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_randomness_ratio, livePtr, ratio)
  }

  /** CPUParticles3D.set_visibility_aabb */
  final def setVisibilityAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_visibility_aabb == null) gdext.classes.CPUParticles3D.mb_set_visibility_aabb = MethodBind.get("CPUParticles3D", "set_visibility_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_visibility_aabb, livePtr, aabb)
  }

  /** CPUParticles3D.set_lifetime_randomness */
  final def setLifetimeRandomness(random: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_lifetime_randomness == null) gdext.classes.CPUParticles3D.mb_set_lifetime_randomness = MethodBind.get("CPUParticles3D", "set_lifetime_randomness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_lifetime_randomness, livePtr, random)
  }

  /** CPUParticles3D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_use_local_coordinates == null) gdext.classes.CPUParticles3D.mb_set_use_local_coordinates = MethodBind.get("CPUParticles3D", "set_use_local_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_use_local_coordinates, livePtr, enable)
  }

  /** CPUParticles3D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_fixed_fps == null) gdext.classes.CPUParticles3D.mb_set_fixed_fps = MethodBind.get("CPUParticles3D", "set_fixed_fps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_fixed_fps, livePtr, fps)
  }

  /** CPUParticles3D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_fractional_delta == null) gdext.classes.CPUParticles3D.mb_set_fractional_delta = MethodBind.get("CPUParticles3D", "set_fractional_delta", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_fractional_delta, livePtr, enable)
  }

  /** CPUParticles3D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_speed_scale == null) gdext.classes.CPUParticles3D.mb_set_speed_scale = MethodBind.get("CPUParticles3D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_speed_scale, livePtr, scale)
  }

  /** CPUParticles3D.is_emitting */
  final def isEmitting(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_is_emitting == null) gdext.classes.CPUParticles3D.mb_is_emitting = MethodBind.get("CPUParticles3D", "is_emitting", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_is_emitting, livePtr)
  }

  /** CPUParticles3D.get_amount */
  final def getAmount(): Long = {
    if (gdext.classes.CPUParticles3D.mb_get_amount == null) gdext.classes.CPUParticles3D.mb_get_amount = MethodBind.get("CPUParticles3D", "get_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_amount, livePtr)
  }

  /** CPUParticles3D.get_lifetime */
  final def getLifetime(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_lifetime == null) gdext.classes.CPUParticles3D.mb_get_lifetime = MethodBind.get("CPUParticles3D", "get_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_lifetime, livePtr)
  }

  /** CPUParticles3D.get_one_shot */
  final def getOneShot(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_one_shot == null) gdext.classes.CPUParticles3D.mb_get_one_shot = MethodBind.get("CPUParticles3D", "get_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_get_one_shot, livePtr)
  }

  /** CPUParticles3D.get_pre_process_time */
  final def getPreProcessTime(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_pre_process_time == null) gdext.classes.CPUParticles3D.mb_get_pre_process_time = MethodBind.get("CPUParticles3D", "get_pre_process_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_pre_process_time, livePtr)
  }

  /** CPUParticles3D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_explosiveness_ratio == null) gdext.classes.CPUParticles3D.mb_get_explosiveness_ratio = MethodBind.get("CPUParticles3D", "get_explosiveness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_explosiveness_ratio, livePtr)
  }

  /** CPUParticles3D.get_randomness_ratio */
  final def getRandomnessRatio(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_randomness_ratio == null) gdext.classes.CPUParticles3D.mb_get_randomness_ratio = MethodBind.get("CPUParticles3D", "get_randomness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_randomness_ratio, livePtr)
  }

  /** CPUParticles3D.get_visibility_aabb */
  final def getVisibilityAabb(): gdext.builtin.AABB = {
    if (gdext.classes.CPUParticles3D.mb_get_visibility_aabb == null) gdext.classes.CPUParticles3D.mb_get_visibility_aabb = MethodBind.get("CPUParticles3D", "get_visibility_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.CPUParticles3D.mb_get_visibility_aabb, livePtr)
  }

  /** CPUParticles3D.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_lifetime_randomness == null) gdext.classes.CPUParticles3D.mb_get_lifetime_randomness = MethodBind.get("CPUParticles3D", "get_lifetime_randomness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_lifetime_randomness, livePtr)
  }

  /** CPUParticles3D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_use_local_coordinates == null) gdext.classes.CPUParticles3D.mb_get_use_local_coordinates = MethodBind.get("CPUParticles3D", "get_use_local_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_get_use_local_coordinates, livePtr)
  }

  /** CPUParticles3D.get_fixed_fps */
  final def getFixedFps(): Long = {
    if (gdext.classes.CPUParticles3D.mb_get_fixed_fps == null) gdext.classes.CPUParticles3D.mb_get_fixed_fps = MethodBind.get("CPUParticles3D", "get_fixed_fps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_fixed_fps, livePtr)
  }

  /** CPUParticles3D.get_fractional_delta */
  final def getFractionalDelta(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_fractional_delta == null) gdext.classes.CPUParticles3D.mb_get_fractional_delta = MethodBind.get("CPUParticles3D", "get_fractional_delta", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_get_fractional_delta, livePtr)
  }

  /** CPUParticles3D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_speed_scale == null) gdext.classes.CPUParticles3D.mb_get_speed_scale = MethodBind.get("CPUParticles3D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_speed_scale, livePtr)
  }

  /** CPUParticles3D.set_draw_order */
  final def setDrawOrder(order: Long): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_draw_order == null) gdext.classes.CPUParticles3D.mb_set_draw_order = MethodBind.get("CPUParticles3D", "set_draw_order", 1427401774L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_draw_order, livePtr, order)
  }

  /** CPUParticles3D.get_draw_order */
  final def getDrawOrder(): Long = {
    if (gdext.classes.CPUParticles3D.mb_get_draw_order == null) gdext.classes.CPUParticles3D.mb_get_draw_order = MethodBind.get("CPUParticles3D", "get_draw_order", 1321900776L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_draw_order, livePtr)
  }

  /** CPUParticles3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_mesh == null) gdext.classes.CPUParticles3D.mb_set_mesh = MethodBind.get("CPUParticles3D", "set_mesh", 194775623L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_mesh, livePtr, Wrappers.handle(mesh))
  }

  /** CPUParticles3D.get_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getMesh(): Mesh = {
    if (gdext.classes.CPUParticles3D.mb_get_mesh == null) gdext.classes.CPUParticles3D.mb_get_mesh = MethodBind.get("CPUParticles3D", "get_mesh", 1808005922L)
    Wrappers.owned[Mesh](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_mesh, livePtr))
  }

  /** CPUParticles3D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_use_fixed_seed == null) gdext.classes.CPUParticles3D.mb_set_use_fixed_seed = MethodBind.get("CPUParticles3D", "set_use_fixed_seed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_use_fixed_seed, livePtr, use_fixed_seed)
  }

  /** CPUParticles3D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_use_fixed_seed == null) gdext.classes.CPUParticles3D.mb_get_use_fixed_seed = MethodBind.get("CPUParticles3D", "get_use_fixed_seed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_get_use_fixed_seed, livePtr)
  }

  /** CPUParticles3D.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_seed == null) gdext.classes.CPUParticles3D.mb_set_seed = MethodBind.get("CPUParticles3D", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_seed, livePtr, seed)
  }

  /** CPUParticles3D.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.CPUParticles3D.mb_get_seed == null) gdext.classes.CPUParticles3D.mb_get_seed = MethodBind.get("CPUParticles3D", "get_seed", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_seed, livePtr)
  }

  /** CPUParticles3D.restart */
  final def restart(keep_seed: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_restart == null) gdext.classes.CPUParticles3D.mb_restart = MethodBind.get("CPUParticles3D", "restart", 107499316L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_restart, livePtr, keep_seed)
  }

  /** CPUParticles3D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_request_particles_process == null) gdext.classes.CPUParticles3D.mb_request_particles_process = MethodBind.get("CPUParticles3D", "request_particles_process", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_request_particles_process, livePtr, process_time)
  }

  /** CPUParticles3D.capture_aabb */
  final def captureAabb(): gdext.builtin.AABB = {
    if (gdext.classes.CPUParticles3D.mb_capture_aabb == null) gdext.classes.CPUParticles3D.mb_capture_aabb = MethodBind.get("CPUParticles3D", "capture_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.CPUParticles3D.mb_capture_aabb, livePtr)
  }

  /** CPUParticles3D.set_direction */
  final def setDirection(direction: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_direction == null) gdext.classes.CPUParticles3D.mb_set_direction = MethodBind.get("CPUParticles3D", "set_direction", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_direction, livePtr, direction)
  }

  /** CPUParticles3D.get_direction */
  final def getDirection(): gdext.builtin.Vector3 = {
    if (gdext.classes.CPUParticles3D.mb_get_direction == null) gdext.classes.CPUParticles3D.mb_get_direction = MethodBind.get("CPUParticles3D", "get_direction", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CPUParticles3D.mb_get_direction, livePtr)
  }

  /** CPUParticles3D.set_spread */
  final def setSpread(degrees: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_spread == null) gdext.classes.CPUParticles3D.mb_set_spread = MethodBind.get("CPUParticles3D", "set_spread", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_spread, livePtr, degrees)
  }

  /** CPUParticles3D.get_spread */
  final def getSpread(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_spread == null) gdext.classes.CPUParticles3D.mb_get_spread = MethodBind.get("CPUParticles3D", "get_spread", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_spread, livePtr)
  }

  /** CPUParticles3D.set_flatness */
  final def setFlatness(amount: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_flatness == null) gdext.classes.CPUParticles3D.mb_set_flatness = MethodBind.get("CPUParticles3D", "set_flatness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_flatness, livePtr, amount)
  }

  /** CPUParticles3D.get_flatness */
  final def getFlatness(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_flatness == null) gdext.classes.CPUParticles3D.mb_get_flatness = MethodBind.get("CPUParticles3D", "get_flatness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_flatness, livePtr)
  }

  /** CPUParticles3D.set_param_min */
  final def setParamMin(param: Long, value: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_param_min == null) gdext.classes.CPUParticles3D.mb_set_param_min = MethodBind.get("CPUParticles3D", "set_param_min", 557936109L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles3D.mb_set_param_min, livePtr, param, value)
  }

  /** CPUParticles3D.get_param_min */
  final def getParamMin(param: Long): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_param_min == null) gdext.classes.CPUParticles3D.mb_get_param_min = MethodBind.get("CPUParticles3D", "get_param_min", 597646162L)
    Ptrcall.call1[Long, Double](gdext.classes.CPUParticles3D.mb_get_param_min, livePtr, param)
  }

  /** CPUParticles3D.set_param_max */
  final def setParamMax(param: Long, value: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_param_max == null) gdext.classes.CPUParticles3D.mb_set_param_max = MethodBind.get("CPUParticles3D", "set_param_max", 557936109L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles3D.mb_set_param_max, livePtr, param, value)
  }

  /** CPUParticles3D.get_param_max */
  final def getParamMax(param: Long): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_param_max == null) gdext.classes.CPUParticles3D.mb_get_param_max = MethodBind.get("CPUParticles3D", "get_param_max", 597646162L)
    Ptrcall.call1[Long, Double](gdext.classes.CPUParticles3D.mb_get_param_max, livePtr, param)
  }

  /** CPUParticles3D.set_param_curve */
  final def setParamCurve(param: Long, curve: Curve): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_param_curve == null) gdext.classes.CPUParticles3D.mb_set_param_curve = MethodBind.get("CPUParticles3D", "set_param_curve", 4044142537L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles3D.mb_set_param_curve, livePtr, param, Wrappers.handle(curve))
  }

  /** CPUParticles3D.get_param_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getParamCurve(param: Long): Curve = {
    if (gdext.classes.CPUParticles3D.mb_get_param_curve == null) gdext.classes.CPUParticles3D.mb_get_param_curve = MethodBind.get("CPUParticles3D", "get_param_curve", 4132790277L)
    Wrappers.owned[Curve](Ptrcall.call1[Long, Long](gdext.classes.CPUParticles3D.mb_get_param_curve, livePtr, param))
  }

  /** CPUParticles3D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_color == null) gdext.classes.CPUParticles3D.mb_set_color = MethodBind.get("CPUParticles3D", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_color, livePtr, color)
  }

  /** CPUParticles3D.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.CPUParticles3D.mb_get_color == null) gdext.classes.CPUParticles3D.mb_get_color = MethodBind.get("CPUParticles3D", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.CPUParticles3D.mb_get_color, livePtr)
  }

  /** CPUParticles3D.set_color_ramp */
  final def setColorRamp(ramp: Gradient): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_color_ramp == null) gdext.classes.CPUParticles3D.mb_set_color_ramp = MethodBind.get("CPUParticles3D", "set_color_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_color_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** CPUParticles3D.get_color_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorRamp(): Gradient = {
    if (gdext.classes.CPUParticles3D.mb_get_color_ramp == null) gdext.classes.CPUParticles3D.mb_get_color_ramp = MethodBind.get("CPUParticles3D", "get_color_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_color_ramp, livePtr))
  }

  /** CPUParticles3D.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Gradient): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_color_initial_ramp == null) gdext.classes.CPUParticles3D.mb_set_color_initial_ramp = MethodBind.get("CPUParticles3D", "set_color_initial_ramp", 2756054477L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_color_initial_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** CPUParticles3D.get_color_initial_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorInitialRamp(): Gradient = {
    if (gdext.classes.CPUParticles3D.mb_get_color_initial_ramp == null) gdext.classes.CPUParticles3D.mb_get_color_initial_ramp = MethodBind.get("CPUParticles3D", "get_color_initial_ramp", 132272999L)
    Wrappers.owned[Gradient](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_color_initial_ramp, livePtr))
  }

  /** CPUParticles3D.set_particle_flag */
  final def setParticleFlag(particle_flag: Long, enable: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_particle_flag == null) gdext.classes.CPUParticles3D.mb_set_particle_flag = MethodBind.get("CPUParticles3D", "set_particle_flag", 3515406498L)
    Ptrcall.callVoid2(gdext.classes.CPUParticles3D.mb_set_particle_flag, livePtr, particle_flag, enable)
  }

  /** CPUParticles3D.get_particle_flag */
  final def getParticleFlag(particle_flag: Long): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_particle_flag == null) gdext.classes.CPUParticles3D.mb_get_particle_flag = MethodBind.get("CPUParticles3D", "get_particle_flag", 2845201987L)
    Ptrcall.call1[Long, Boolean](gdext.classes.CPUParticles3D.mb_get_particle_flag, livePtr, particle_flag)
  }

  /** CPUParticles3D.set_emission_shape */
  final def setEmissionShape(shape: Long): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_shape == null) gdext.classes.CPUParticles3D.mb_set_emission_shape = MethodBind.get("CPUParticles3D", "set_emission_shape", 491823814L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_shape, livePtr, shape)
  }

  /** CPUParticles3D.get_emission_shape */
  final def getEmissionShape(): Long = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_shape == null) gdext.classes.CPUParticles3D.mb_get_emission_shape = MethodBind.get("CPUParticles3D", "get_emission_shape", 2961454842L)
    Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_emission_shape, livePtr)
  }

  /** CPUParticles3D.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_sphere_radius == null) gdext.classes.CPUParticles3D.mb_set_emission_sphere_radius = MethodBind.get("CPUParticles3D", "set_emission_sphere_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_sphere_radius, livePtr, radius)
  }

  /** CPUParticles3D.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_sphere_radius == null) gdext.classes.CPUParticles3D.mb_get_emission_sphere_radius = MethodBind.get("CPUParticles3D", "get_emission_sphere_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_emission_sphere_radius, livePtr)
  }

  /** CPUParticles3D.set_emission_box_extents */
  final def setEmissionBoxExtents(extents: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_box_extents == null) gdext.classes.CPUParticles3D.mb_set_emission_box_extents = MethodBind.get("CPUParticles3D", "set_emission_box_extents", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_box_extents, livePtr, extents)
  }

  /** CPUParticles3D.get_emission_box_extents */
  final def getEmissionBoxExtents(): gdext.builtin.Vector3 = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_box_extents == null) gdext.classes.CPUParticles3D.mb_get_emission_box_extents = MethodBind.get("CPUParticles3D", "get_emission_box_extents", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CPUParticles3D.mb_get_emission_box_extents, livePtr)
  }

  /** CPUParticles3D.set_emission_ring_axis */
  final def setEmissionRingAxis(axis: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_ring_axis == null) gdext.classes.CPUParticles3D.mb_set_emission_ring_axis = MethodBind.get("CPUParticles3D", "set_emission_ring_axis", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_ring_axis, livePtr, axis)
  }

  /** CPUParticles3D.get_emission_ring_axis */
  final def getEmissionRingAxis(): gdext.builtin.Vector3 = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_ring_axis == null) gdext.classes.CPUParticles3D.mb_get_emission_ring_axis = MethodBind.get("CPUParticles3D", "get_emission_ring_axis", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CPUParticles3D.mb_get_emission_ring_axis, livePtr)
  }

  /** CPUParticles3D.set_emission_ring_height */
  final def setEmissionRingHeight(height: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_ring_height == null) gdext.classes.CPUParticles3D.mb_set_emission_ring_height = MethodBind.get("CPUParticles3D", "set_emission_ring_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_ring_height, livePtr, height)
  }

  /** CPUParticles3D.get_emission_ring_height */
  final def getEmissionRingHeight(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_ring_height == null) gdext.classes.CPUParticles3D.mb_get_emission_ring_height = MethodBind.get("CPUParticles3D", "get_emission_ring_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_emission_ring_height, livePtr)
  }

  /** CPUParticles3D.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_ring_radius == null) gdext.classes.CPUParticles3D.mb_set_emission_ring_radius = MethodBind.get("CPUParticles3D", "set_emission_ring_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_ring_radius, livePtr, radius)
  }

  /** CPUParticles3D.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_ring_radius == null) gdext.classes.CPUParticles3D.mb_get_emission_ring_radius = MethodBind.get("CPUParticles3D", "get_emission_ring_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_emission_ring_radius, livePtr)
  }

  /** CPUParticles3D.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(inner_radius: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_ring_inner_radius == null) gdext.classes.CPUParticles3D.mb_set_emission_ring_inner_radius = MethodBind.get("CPUParticles3D", "set_emission_ring_inner_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_ring_inner_radius, livePtr, inner_radius)
  }

  /** CPUParticles3D.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_ring_inner_radius == null) gdext.classes.CPUParticles3D.mb_get_emission_ring_inner_radius = MethodBind.get("CPUParticles3D", "get_emission_ring_inner_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_emission_ring_inner_radius, livePtr)
  }

  /** CPUParticles3D.set_emission_ring_cone_angle */
  final def setEmissionRingConeAngle(cone_angle: Double): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_emission_ring_cone_angle == null) gdext.classes.CPUParticles3D.mb_set_emission_ring_cone_angle = MethodBind.get("CPUParticles3D", "set_emission_ring_cone_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_emission_ring_cone_angle, livePtr, cone_angle)
  }

  /** CPUParticles3D.get_emission_ring_cone_angle */
  final def getEmissionRingConeAngle(): Double = {
    if (gdext.classes.CPUParticles3D.mb_get_emission_ring_cone_angle == null) gdext.classes.CPUParticles3D.mb_get_emission_ring_cone_angle = MethodBind.get("CPUParticles3D", "get_emission_ring_cone_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.CPUParticles3D.mb_get_emission_ring_cone_angle, livePtr)
  }

  /** CPUParticles3D.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 = {
    if (gdext.classes.CPUParticles3D.mb_get_gravity == null) gdext.classes.CPUParticles3D.mb_get_gravity = MethodBind.get("CPUParticles3D", "get_gravity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.CPUParticles3D.mb_get_gravity, livePtr)
  }

  /** CPUParticles3D.set_gravity */
  final def setGravity(accel_vec: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_gravity == null) gdext.classes.CPUParticles3D.mb_set_gravity = MethodBind.get("CPUParticles3D", "set_gravity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_gravity, livePtr, accel_vec)
  }

  /** CPUParticles3D.get_split_scale */
  final def getSplitScale(): Boolean = {
    if (gdext.classes.CPUParticles3D.mb_get_split_scale == null) gdext.classes.CPUParticles3D.mb_get_split_scale = MethodBind.get("CPUParticles3D", "get_split_scale", 2240911060L)
    Ptrcall.call0[Boolean](gdext.classes.CPUParticles3D.mb_get_split_scale, livePtr)
  }

  /** CPUParticles3D.set_split_scale */
  final def setSplitScale(split_scale: Boolean): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_split_scale == null) gdext.classes.CPUParticles3D.mb_set_split_scale = MethodBind.get("CPUParticles3D", "set_split_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_split_scale, livePtr, split_scale)
  }

  /** CPUParticles3D.get_scale_curve_x. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getScaleCurveX(): Curve = {
    if (gdext.classes.CPUParticles3D.mb_get_scale_curve_x == null) gdext.classes.CPUParticles3D.mb_get_scale_curve_x = MethodBind.get("CPUParticles3D", "get_scale_curve_x", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_scale_curve_x, livePtr))
  }

  /** CPUParticles3D.set_scale_curve_x */
  final def setScaleCurveX(scale_curve: Curve): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_scale_curve_x == null) gdext.classes.CPUParticles3D.mb_set_scale_curve_x = MethodBind.get("CPUParticles3D", "set_scale_curve_x", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_scale_curve_x, livePtr, Wrappers.handle(scale_curve))
  }

  /** CPUParticles3D.get_scale_curve_y. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getScaleCurveY(): Curve = {
    if (gdext.classes.CPUParticles3D.mb_get_scale_curve_y == null) gdext.classes.CPUParticles3D.mb_get_scale_curve_y = MethodBind.get("CPUParticles3D", "get_scale_curve_y", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_scale_curve_y, livePtr))
  }

  /** CPUParticles3D.set_scale_curve_y */
  final def setScaleCurveY(scale_curve: Curve): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_scale_curve_y == null) gdext.classes.CPUParticles3D.mb_set_scale_curve_y = MethodBind.get("CPUParticles3D", "set_scale_curve_y", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_scale_curve_y, livePtr, Wrappers.handle(scale_curve))
  }

  /** CPUParticles3D.get_scale_curve_z. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getScaleCurveZ(): Curve = {
    if (gdext.classes.CPUParticles3D.mb_get_scale_curve_z == null) gdext.classes.CPUParticles3D.mb_get_scale_curve_z = MethodBind.get("CPUParticles3D", "get_scale_curve_z", 2460114913L)
    Wrappers.owned[Curve](Ptrcall.call0[Long](gdext.classes.CPUParticles3D.mb_get_scale_curve_z, livePtr))
  }

  /** CPUParticles3D.set_scale_curve_z */
  final def setScaleCurveZ(scale_curve: Curve): Unit = {
    if (gdext.classes.CPUParticles3D.mb_set_scale_curve_z == null) gdext.classes.CPUParticles3D.mb_set_scale_curve_z = MethodBind.get("CPUParticles3D", "set_scale_curve_z", 270443179L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_set_scale_curve_z, livePtr, Wrappers.handle(scale_curve))
  }

  /** CPUParticles3D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit = {
    if (gdext.classes.CPUParticles3D.mb_convert_from_particles == null) gdext.classes.CPUParticles3D.mb_convert_from_particles = MethodBind.get("CPUParticles3D", "convert_from_particles", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.CPUParticles3D.mb_convert_from_particles, livePtr, Wrappers.handle(particles))
  }

}

object CPUParticles3D {
  private[classes] var mb_set_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_restart: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_particles_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_capture_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flatness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flatness: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_emission_box_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_box_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_axis: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_height: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_inner_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_ring_cone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_ring_cone_angle: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_split_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_split_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_curve_x: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_curve_y: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_scale_curve_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_scale_curve_z: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_from_particles: GDExtensionMethodBindPtr = null
}
