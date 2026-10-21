package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticles2D`, extends `Node2D`. */
abstract class GPUParticles2D extends Node2D {
  override def godotClassName: String = "GPUParticles2D"

  /** GPUParticles2D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_emitting == null) gdext.classes.GPUParticles2D.mb_set_emitting = MethodBind.get("GPUParticles2D", "set_emitting", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_emitting, livePtr, emitting)
  }

  /** GPUParticles2D.set_amount */
  final def setAmount(amount: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_amount == null) gdext.classes.GPUParticles2D.mb_set_amount = MethodBind.get("GPUParticles2D", "set_amount", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_amount, livePtr, amount)
  }

  /** GPUParticles2D.set_lifetime */
  final def setLifetime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_lifetime == null) gdext.classes.GPUParticles2D.mb_set_lifetime = MethodBind.get("GPUParticles2D", "set_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_lifetime, livePtr, secs)
  }

  /** GPUParticles2D.set_one_shot */
  final def setOneShot(secs: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_one_shot == null) gdext.classes.GPUParticles2D.mb_set_one_shot = MethodBind.get("GPUParticles2D", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_one_shot, livePtr, secs)
  }

  /** GPUParticles2D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_pre_process_time == null) gdext.classes.GPUParticles2D.mb_set_pre_process_time = MethodBind.get("GPUParticles2D", "set_pre_process_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_pre_process_time, livePtr, secs)
  }

  /** GPUParticles2D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_explosiveness_ratio == null) gdext.classes.GPUParticles2D.mb_set_explosiveness_ratio = MethodBind.get("GPUParticles2D", "set_explosiveness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_explosiveness_ratio, livePtr, ratio)
  }

  /** GPUParticles2D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_randomness_ratio == null) gdext.classes.GPUParticles2D.mb_set_randomness_ratio = MethodBind.get("GPUParticles2D", "set_randomness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_randomness_ratio, livePtr, ratio)
  }

  /** GPUParticles2D.set_visibility_rect */
  final def setVisibilityRect(visibility_rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_visibility_rect == null) gdext.classes.GPUParticles2D.mb_set_visibility_rect = MethodBind.get("GPUParticles2D", "set_visibility_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_visibility_rect, livePtr, visibility_rect)
  }

  /** GPUParticles2D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_use_local_coordinates == null) gdext.classes.GPUParticles2D.mb_set_use_local_coordinates = MethodBind.get("GPUParticles2D", "set_use_local_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_use_local_coordinates, livePtr, enable)
  }

  /** GPUParticles2D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_fixed_fps == null) gdext.classes.GPUParticles2D.mb_set_fixed_fps = MethodBind.get("GPUParticles2D", "set_fixed_fps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_fixed_fps, livePtr, fps)
  }

  /** GPUParticles2D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_fractional_delta == null) gdext.classes.GPUParticles2D.mb_set_fractional_delta = MethodBind.get("GPUParticles2D", "set_fractional_delta", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_fractional_delta, livePtr, enable)
  }

  /** GPUParticles2D.set_interpolate */
  final def setInterpolate(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_interpolate == null) gdext.classes.GPUParticles2D.mb_set_interpolate = MethodBind.get("GPUParticles2D", "set_interpolate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_interpolate, livePtr, enable)
  }

  /** GPUParticles2D.set_process_material */
  final def setProcessMaterial(material: Material): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_process_material == null) gdext.classes.GPUParticles2D.mb_set_process_material = MethodBind.get("GPUParticles2D", "set_process_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_process_material, livePtr, Wrappers.handle(material))
  }

  /** GPUParticles2D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_speed_scale == null) gdext.classes.GPUParticles2D.mb_set_speed_scale = MethodBind.get("GPUParticles2D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_speed_scale, livePtr, scale)
  }

  /** GPUParticles2D.set_collision_base_size */
  final def setCollisionBaseSize(size: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_collision_base_size == null) gdext.classes.GPUParticles2D.mb_set_collision_base_size = MethodBind.get("GPUParticles2D", "set_collision_base_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_collision_base_size, livePtr, size)
  }

  /** GPUParticles2D.set_interp_to_end */
  final def setInterpToEnd(interp: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_interp_to_end == null) gdext.classes.GPUParticles2D.mb_set_interp_to_end = MethodBind.get("GPUParticles2D", "set_interp_to_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_interp_to_end, livePtr, interp)
  }

  /** GPUParticles2D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_request_particles_process == null) gdext.classes.GPUParticles2D.mb_request_particles_process = MethodBind.get("GPUParticles2D", "request_particles_process", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_request_particles_process, livePtr, process_time)
  }

  /** GPUParticles2D.is_emitting */
  final def isEmitting(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_is_emitting == null) gdext.classes.GPUParticles2D.mb_is_emitting = MethodBind.get("GPUParticles2D", "is_emitting", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_is_emitting, livePtr)
  }

  /** GPUParticles2D.get_amount */
  final def getAmount(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_amount == null) gdext.classes.GPUParticles2D.mb_get_amount = MethodBind.get("GPUParticles2D", "get_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_amount, livePtr)
  }

  /** GPUParticles2D.get_lifetime */
  final def getLifetime(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_lifetime == null) gdext.classes.GPUParticles2D.mb_get_lifetime = MethodBind.get("GPUParticles2D", "get_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_lifetime, livePtr)
  }

  /** GPUParticles2D.get_one_shot */
  final def getOneShot(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_get_one_shot == null) gdext.classes.GPUParticles2D.mb_get_one_shot = MethodBind.get("GPUParticles2D", "get_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_get_one_shot, livePtr)
  }

  /** GPUParticles2D.get_pre_process_time */
  final def getPreProcessTime(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_pre_process_time == null) gdext.classes.GPUParticles2D.mb_get_pre_process_time = MethodBind.get("GPUParticles2D", "get_pre_process_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_pre_process_time, livePtr)
  }

  /** GPUParticles2D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_explosiveness_ratio == null) gdext.classes.GPUParticles2D.mb_get_explosiveness_ratio = MethodBind.get("GPUParticles2D", "get_explosiveness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_explosiveness_ratio, livePtr)
  }

  /** GPUParticles2D.get_randomness_ratio */
  final def getRandomnessRatio(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_randomness_ratio == null) gdext.classes.GPUParticles2D.mb_get_randomness_ratio = MethodBind.get("GPUParticles2D", "get_randomness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_randomness_ratio, livePtr)
  }

  /** GPUParticles2D.get_visibility_rect */
  final def getVisibilityRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.GPUParticles2D.mb_get_visibility_rect == null) gdext.classes.GPUParticles2D.mb_get_visibility_rect = MethodBind.get("GPUParticles2D", "get_visibility_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.GPUParticles2D.mb_get_visibility_rect, livePtr)
  }

  /** GPUParticles2D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_get_use_local_coordinates == null) gdext.classes.GPUParticles2D.mb_get_use_local_coordinates = MethodBind.get("GPUParticles2D", "get_use_local_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_get_use_local_coordinates, livePtr)
  }

  /** GPUParticles2D.get_fixed_fps */
  final def getFixedFps(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_fixed_fps == null) gdext.classes.GPUParticles2D.mb_get_fixed_fps = MethodBind.get("GPUParticles2D", "get_fixed_fps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_fixed_fps, livePtr)
  }

  /** GPUParticles2D.get_fractional_delta */
  final def getFractionalDelta(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_get_fractional_delta == null) gdext.classes.GPUParticles2D.mb_get_fractional_delta = MethodBind.get("GPUParticles2D", "get_fractional_delta", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_get_fractional_delta, livePtr)
  }

  /** GPUParticles2D.get_interpolate */
  final def getInterpolate(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_get_interpolate == null) gdext.classes.GPUParticles2D.mb_get_interpolate = MethodBind.get("GPUParticles2D", "get_interpolate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_get_interpolate, livePtr)
  }

  /** GPUParticles2D.get_process_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProcessMaterial(): Material = {
    if (gdext.classes.GPUParticles2D.mb_get_process_material == null) gdext.classes.GPUParticles2D.mb_get_process_material = MethodBind.get("GPUParticles2D", "get_process_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_process_material, livePtr))
  }

  /** GPUParticles2D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_speed_scale == null) gdext.classes.GPUParticles2D.mb_get_speed_scale = MethodBind.get("GPUParticles2D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_speed_scale, livePtr)
  }

  /** GPUParticles2D.get_collision_base_size */
  final def getCollisionBaseSize(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_collision_base_size == null) gdext.classes.GPUParticles2D.mb_get_collision_base_size = MethodBind.get("GPUParticles2D", "get_collision_base_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_collision_base_size, livePtr)
  }

  /** GPUParticles2D.get_interp_to_end */
  final def getInterpToEnd(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_interp_to_end == null) gdext.classes.GPUParticles2D.mb_get_interp_to_end = MethodBind.get("GPUParticles2D", "get_interp_to_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_interp_to_end, livePtr)
  }

  /** GPUParticles2D.set_draw_order */
  final def setDrawOrder(order: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_draw_order == null) gdext.classes.GPUParticles2D.mb_set_draw_order = MethodBind.get("GPUParticles2D", "set_draw_order", 1939677959L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_draw_order, livePtr, order)
  }

  /** GPUParticles2D.get_draw_order */
  final def getDrawOrder(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_draw_order == null) gdext.classes.GPUParticles2D.mb_get_draw_order = MethodBind.get("GPUParticles2D", "get_draw_order", 941479095L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_draw_order, livePtr)
  }

  /** GPUParticles2D.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_texture == null) gdext.classes.GPUParticles2D.mb_set_texture = MethodBind.get("GPUParticles2D", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** GPUParticles2D.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.GPUParticles2D.mb_get_texture == null) gdext.classes.GPUParticles2D.mb_get_texture = MethodBind.get("GPUParticles2D", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_texture, livePtr))
  }

  /** GPUParticles2D.capture_rect */
  final def captureRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.GPUParticles2D.mb_capture_rect == null) gdext.classes.GPUParticles2D.mb_capture_rect = MethodBind.get("GPUParticles2D", "capture_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.GPUParticles2D.mb_capture_rect, livePtr)
  }

  /** GPUParticles2D.restart */
  final def restart(keep_seed: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_restart == null) gdext.classes.GPUParticles2D.mb_restart = MethodBind.get("GPUParticles2D", "restart", 107499316L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_restart, livePtr, keep_seed)
  }

  /** GPUParticles2D.emit_particle */
  final def emitParticle(xform: gdext.builtin.Transform2D, velocity: gdext.builtin.Vector2, color: gdext.builtin.Color, custom: gdext.builtin.Color, flags: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_emit_particle == null) gdext.classes.GPUParticles2D.mb_emit_particle = MethodBind.get("GPUParticles2D", "emit_particle", 2179202058L)
    Ptrcall.callVoid5(gdext.classes.GPUParticles2D.mb_emit_particle, livePtr, xform, velocity, color, custom, flags)
  }

  /** GPUParticles2D.set_trail_enabled */
  final def setTrailEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_trail_enabled == null) gdext.classes.GPUParticles2D.mb_set_trail_enabled = MethodBind.get("GPUParticles2D", "set_trail_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_trail_enabled, livePtr, enabled)
  }

  /** GPUParticles2D.set_trail_lifetime */
  final def setTrailLifetime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_trail_lifetime == null) gdext.classes.GPUParticles2D.mb_set_trail_lifetime = MethodBind.get("GPUParticles2D", "set_trail_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_trail_lifetime, livePtr, secs)
  }

  /** GPUParticles2D.is_trail_enabled */
  final def isTrailEnabled(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_is_trail_enabled == null) gdext.classes.GPUParticles2D.mb_is_trail_enabled = MethodBind.get("GPUParticles2D", "is_trail_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_is_trail_enabled, livePtr)
  }

  /** GPUParticles2D.get_trail_lifetime */
  final def getTrailLifetime(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_trail_lifetime == null) gdext.classes.GPUParticles2D.mb_get_trail_lifetime = MethodBind.get("GPUParticles2D", "get_trail_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_trail_lifetime, livePtr)
  }

  /** GPUParticles2D.set_trail_sections */
  final def setTrailSections(sections: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_trail_sections == null) gdext.classes.GPUParticles2D.mb_set_trail_sections = MethodBind.get("GPUParticles2D", "set_trail_sections", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_trail_sections, livePtr, sections)
  }

  /** GPUParticles2D.get_trail_sections */
  final def getTrailSections(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_trail_sections == null) gdext.classes.GPUParticles2D.mb_get_trail_sections = MethodBind.get("GPUParticles2D", "get_trail_sections", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_trail_sections, livePtr)
  }

  /** GPUParticles2D.set_trail_section_subdivisions */
  final def setTrailSectionSubdivisions(subdivisions: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_trail_section_subdivisions == null) gdext.classes.GPUParticles2D.mb_set_trail_section_subdivisions = MethodBind.get("GPUParticles2D", "set_trail_section_subdivisions", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_trail_section_subdivisions, livePtr, subdivisions)
  }

  /** GPUParticles2D.get_trail_section_subdivisions */
  final def getTrailSectionSubdivisions(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_trail_section_subdivisions == null) gdext.classes.GPUParticles2D.mb_get_trail_section_subdivisions = MethodBind.get("GPUParticles2D", "get_trail_section_subdivisions", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_trail_section_subdivisions, livePtr)
  }

  /** GPUParticles2D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit = {
    if (gdext.classes.GPUParticles2D.mb_convert_from_particles == null) gdext.classes.GPUParticles2D.mb_convert_from_particles = MethodBind.get("GPUParticles2D", "convert_from_particles", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_convert_from_particles, livePtr, Wrappers.handle(particles))
  }

  /** GPUParticles2D.set_amount_ratio */
  final def setAmountRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_amount_ratio == null) gdext.classes.GPUParticles2D.mb_set_amount_ratio = MethodBind.get("GPUParticles2D", "set_amount_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_amount_ratio, livePtr, ratio)
  }

  /** GPUParticles2D.get_amount_ratio */
  final def getAmountRatio(): Double = {
    if (gdext.classes.GPUParticles2D.mb_get_amount_ratio == null) gdext.classes.GPUParticles2D.mb_get_amount_ratio = MethodBind.get("GPUParticles2D", "get_amount_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles2D.mb_get_amount_ratio, livePtr)
  }

  /** GPUParticles2D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_use_fixed_seed == null) gdext.classes.GPUParticles2D.mb_set_use_fixed_seed = MethodBind.get("GPUParticles2D", "set_use_fixed_seed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_use_fixed_seed, livePtr, use_fixed_seed)
  }

  /** GPUParticles2D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean = {
    if (gdext.classes.GPUParticles2D.mb_get_use_fixed_seed == null) gdext.classes.GPUParticles2D.mb_get_use_fixed_seed = MethodBind.get("GPUParticles2D", "get_use_fixed_seed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles2D.mb_get_use_fixed_seed, livePtr)
  }

  /** GPUParticles2D.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.GPUParticles2D.mb_set_seed == null) gdext.classes.GPUParticles2D.mb_set_seed = MethodBind.get("GPUParticles2D", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles2D.mb_set_seed, livePtr, seed)
  }

  /** GPUParticles2D.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.GPUParticles2D.mb_get_seed == null) gdext.classes.GPUParticles2D.mb_get_seed = MethodBind.get("GPUParticles2D", "get_seed", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles2D.mb_get_seed, livePtr)
  }

}

object GPUParticles2D {
  private[classes] var mb_set_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_base_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interp_to_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_particles_process: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_base_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interp_to_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_capture_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_restart: GDExtensionMethodBindPtr = null
  private[classes] var mb_emit_particle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_trail_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_trail_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_trail_sections: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_section_subdivisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_trail_section_subdivisions: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_from_particles: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
}
