package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `GPUParticles3D`, extends `GeometryInstance3D`. */
abstract class GPUParticles3D extends GeometryInstance3D {
  override def godotClassName: String = "GPUParticles3D"

  /** GPUParticles3D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_emitting == null) gdext.classes.GPUParticles3D.mb_set_emitting = MethodBind.get("GPUParticles3D", "set_emitting", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_emitting, livePtr, emitting)
  }

  /** GPUParticles3D.set_amount */
  final def setAmount(amount: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_amount == null) gdext.classes.GPUParticles3D.mb_set_amount = MethodBind.get("GPUParticles3D", "set_amount", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_amount, livePtr, amount)
  }

  /** GPUParticles3D.set_lifetime */
  final def setLifetime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_lifetime == null) gdext.classes.GPUParticles3D.mb_set_lifetime = MethodBind.get("GPUParticles3D", "set_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_lifetime, livePtr, secs)
  }

  /** GPUParticles3D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_one_shot == null) gdext.classes.GPUParticles3D.mb_set_one_shot = MethodBind.get("GPUParticles3D", "set_one_shot", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_one_shot, livePtr, enable)
  }

  /** GPUParticles3D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_pre_process_time == null) gdext.classes.GPUParticles3D.mb_set_pre_process_time = MethodBind.get("GPUParticles3D", "set_pre_process_time", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_pre_process_time, livePtr, secs)
  }

  /** GPUParticles3D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_explosiveness_ratio == null) gdext.classes.GPUParticles3D.mb_set_explosiveness_ratio = MethodBind.get("GPUParticles3D", "set_explosiveness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_explosiveness_ratio, livePtr, ratio)
  }

  /** GPUParticles3D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_randomness_ratio == null) gdext.classes.GPUParticles3D.mb_set_randomness_ratio = MethodBind.get("GPUParticles3D", "set_randomness_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_randomness_ratio, livePtr, ratio)
  }

  /** GPUParticles3D.set_visibility_aabb */
  final def setVisibilityAabb(aabb: gdext.builtin.AABB): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_visibility_aabb == null) gdext.classes.GPUParticles3D.mb_set_visibility_aabb = MethodBind.get("GPUParticles3D", "set_visibility_aabb", 259215842L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_visibility_aabb, livePtr, aabb)
  }

  /** GPUParticles3D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_use_local_coordinates == null) gdext.classes.GPUParticles3D.mb_set_use_local_coordinates = MethodBind.get("GPUParticles3D", "set_use_local_coordinates", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_use_local_coordinates, livePtr, enable)
  }

  /** GPUParticles3D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_fixed_fps == null) gdext.classes.GPUParticles3D.mb_set_fixed_fps = MethodBind.get("GPUParticles3D", "set_fixed_fps", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_fixed_fps, livePtr, fps)
  }

  /** GPUParticles3D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_fractional_delta == null) gdext.classes.GPUParticles3D.mb_set_fractional_delta = MethodBind.get("GPUParticles3D", "set_fractional_delta", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_fractional_delta, livePtr, enable)
  }

  /** GPUParticles3D.set_interpolate */
  final def setInterpolate(enable: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_interpolate == null) gdext.classes.GPUParticles3D.mb_set_interpolate = MethodBind.get("GPUParticles3D", "set_interpolate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_interpolate, livePtr, enable)
  }

  /** GPUParticles3D.set_process_material */
  final def setProcessMaterial(material: Material): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_process_material == null) gdext.classes.GPUParticles3D.mb_set_process_material = MethodBind.get("GPUParticles3D", "set_process_material", 2757459619L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_process_material, livePtr, Wrappers.handle(material))
  }

  /** GPUParticles3D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_speed_scale == null) gdext.classes.GPUParticles3D.mb_set_speed_scale = MethodBind.get("GPUParticles3D", "set_speed_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_speed_scale, livePtr, scale)
  }

  /** GPUParticles3D.set_collision_base_size */
  final def setCollisionBaseSize(size: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_collision_base_size == null) gdext.classes.GPUParticles3D.mb_set_collision_base_size = MethodBind.get("GPUParticles3D", "set_collision_base_size", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_collision_base_size, livePtr, size)
  }

  /** GPUParticles3D.set_interp_to_end */
  final def setInterpToEnd(interp: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_interp_to_end == null) gdext.classes.GPUParticles3D.mb_set_interp_to_end = MethodBind.get("GPUParticles3D", "set_interp_to_end", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_interp_to_end, livePtr, interp)
  }

  /** GPUParticles3D.is_emitting */
  final def isEmitting(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_is_emitting == null) gdext.classes.GPUParticles3D.mb_is_emitting = MethodBind.get("GPUParticles3D", "is_emitting", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_is_emitting, livePtr)
  }

  /** GPUParticles3D.get_amount */
  final def getAmount(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_amount == null) gdext.classes.GPUParticles3D.mb_get_amount = MethodBind.get("GPUParticles3D", "get_amount", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_amount, livePtr)
  }

  /** GPUParticles3D.get_lifetime */
  final def getLifetime(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_lifetime == null) gdext.classes.GPUParticles3D.mb_get_lifetime = MethodBind.get("GPUParticles3D", "get_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_lifetime, livePtr)
  }

  /** GPUParticles3D.get_one_shot */
  final def getOneShot(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_get_one_shot == null) gdext.classes.GPUParticles3D.mb_get_one_shot = MethodBind.get("GPUParticles3D", "get_one_shot", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_get_one_shot, livePtr)
  }

  /** GPUParticles3D.get_pre_process_time */
  final def getPreProcessTime(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_pre_process_time == null) gdext.classes.GPUParticles3D.mb_get_pre_process_time = MethodBind.get("GPUParticles3D", "get_pre_process_time", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_pre_process_time, livePtr)
  }

  /** GPUParticles3D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_explosiveness_ratio == null) gdext.classes.GPUParticles3D.mb_get_explosiveness_ratio = MethodBind.get("GPUParticles3D", "get_explosiveness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_explosiveness_ratio, livePtr)
  }

  /** GPUParticles3D.get_randomness_ratio */
  final def getRandomnessRatio(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_randomness_ratio == null) gdext.classes.GPUParticles3D.mb_get_randomness_ratio = MethodBind.get("GPUParticles3D", "get_randomness_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_randomness_ratio, livePtr)
  }

  /** GPUParticles3D.get_visibility_aabb */
  final def getVisibilityAabb(): gdext.builtin.AABB = {
    if (gdext.classes.GPUParticles3D.mb_get_visibility_aabb == null) gdext.classes.GPUParticles3D.mb_get_visibility_aabb = MethodBind.get("GPUParticles3D", "get_visibility_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.GPUParticles3D.mb_get_visibility_aabb, livePtr)
  }

  /** GPUParticles3D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_get_use_local_coordinates == null) gdext.classes.GPUParticles3D.mb_get_use_local_coordinates = MethodBind.get("GPUParticles3D", "get_use_local_coordinates", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_get_use_local_coordinates, livePtr)
  }

  /** GPUParticles3D.get_fixed_fps */
  final def getFixedFps(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_fixed_fps == null) gdext.classes.GPUParticles3D.mb_get_fixed_fps = MethodBind.get("GPUParticles3D", "get_fixed_fps", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_fixed_fps, livePtr)
  }

  /** GPUParticles3D.get_fractional_delta */
  final def getFractionalDelta(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_get_fractional_delta == null) gdext.classes.GPUParticles3D.mb_get_fractional_delta = MethodBind.get("GPUParticles3D", "get_fractional_delta", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_get_fractional_delta, livePtr)
  }

  /** GPUParticles3D.get_interpolate */
  final def getInterpolate(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_get_interpolate == null) gdext.classes.GPUParticles3D.mb_get_interpolate = MethodBind.get("GPUParticles3D", "get_interpolate", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_get_interpolate, livePtr)
  }

  /** GPUParticles3D.get_process_material. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProcessMaterial(): Material = {
    if (gdext.classes.GPUParticles3D.mb_get_process_material == null) gdext.classes.GPUParticles3D.mb_get_process_material = MethodBind.get("GPUParticles3D", "get_process_material", 5934680L)
    Wrappers.owned[Material](Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_process_material, livePtr))
  }

  /** GPUParticles3D.get_speed_scale */
  final def getSpeedScale(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_speed_scale == null) gdext.classes.GPUParticles3D.mb_get_speed_scale = MethodBind.get("GPUParticles3D", "get_speed_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_speed_scale, livePtr)
  }

  /** GPUParticles3D.get_collision_base_size */
  final def getCollisionBaseSize(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_collision_base_size == null) gdext.classes.GPUParticles3D.mb_get_collision_base_size = MethodBind.get("GPUParticles3D", "get_collision_base_size", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_collision_base_size, livePtr)
  }

  /** GPUParticles3D.get_interp_to_end */
  final def getInterpToEnd(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_interp_to_end == null) gdext.classes.GPUParticles3D.mb_get_interp_to_end = MethodBind.get("GPUParticles3D", "get_interp_to_end", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_interp_to_end, livePtr)
  }

  /** GPUParticles3D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_use_fixed_seed == null) gdext.classes.GPUParticles3D.mb_set_use_fixed_seed = MethodBind.get("GPUParticles3D", "set_use_fixed_seed", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_use_fixed_seed, livePtr, use_fixed_seed)
  }

  /** GPUParticles3D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_get_use_fixed_seed == null) gdext.classes.GPUParticles3D.mb_get_use_fixed_seed = MethodBind.get("GPUParticles3D", "get_use_fixed_seed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_get_use_fixed_seed, livePtr)
  }

  /** GPUParticles3D.set_seed */
  final def setSeed(seed: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_seed == null) gdext.classes.GPUParticles3D.mb_set_seed = MethodBind.get("GPUParticles3D", "set_seed", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_seed, livePtr, seed)
  }

  /** GPUParticles3D.get_seed */
  final def getSeed(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_seed == null) gdext.classes.GPUParticles3D.mb_get_seed = MethodBind.get("GPUParticles3D", "get_seed", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_seed, livePtr)
  }

  /** GPUParticles3D.set_draw_order */
  final def setDrawOrder(order: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_draw_order == null) gdext.classes.GPUParticles3D.mb_set_draw_order = MethodBind.get("GPUParticles3D", "set_draw_order", 1208074815L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_draw_order, livePtr, order)
  }

  /** GPUParticles3D.get_draw_order */
  final def getDrawOrder(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_draw_order == null) gdext.classes.GPUParticles3D.mb_get_draw_order = MethodBind.get("GPUParticles3D", "get_draw_order", 3770381780L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_draw_order, livePtr)
  }

  /** GPUParticles3D.set_draw_passes */
  final def setDrawPasses(passes: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_draw_passes == null) gdext.classes.GPUParticles3D.mb_set_draw_passes = MethodBind.get("GPUParticles3D", "set_draw_passes", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_draw_passes, livePtr, passes)
  }

  /** GPUParticles3D.set_draw_pass_mesh */
  final def setDrawPassMesh(pass: Long, mesh: Mesh): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_draw_pass_mesh == null) gdext.classes.GPUParticles3D.mb_set_draw_pass_mesh = MethodBind.get("GPUParticles3D", "set_draw_pass_mesh", 969122797L)
    Ptrcall.callVoid2(gdext.classes.GPUParticles3D.mb_set_draw_pass_mesh, livePtr, pass, Wrappers.handle(mesh))
  }

  /** GPUParticles3D.get_draw_passes */
  final def getDrawPasses(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_draw_passes == null) gdext.classes.GPUParticles3D.mb_get_draw_passes = MethodBind.get("GPUParticles3D", "get_draw_passes", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_draw_passes, livePtr)
  }

  /** GPUParticles3D.get_draw_pass_mesh. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDrawPassMesh(pass: Long): Mesh = {
    if (gdext.classes.GPUParticles3D.mb_get_draw_pass_mesh == null) gdext.classes.GPUParticles3D.mb_get_draw_pass_mesh = MethodBind.get("GPUParticles3D", "get_draw_pass_mesh", 1576363275L)
    Wrappers.owned[Mesh](Ptrcall.call1[Long, Long](gdext.classes.GPUParticles3D.mb_get_draw_pass_mesh, livePtr, pass))
  }

  /** GPUParticles3D.set_skin */
  final def setSkin(skin: Skin): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_skin == null) gdext.classes.GPUParticles3D.mb_set_skin = MethodBind.get("GPUParticles3D", "set_skin", 3971435618L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_skin, livePtr, Wrappers.handle(skin))
  }

  /** GPUParticles3D.get_skin. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getSkin(): Skin = {
    if (gdext.classes.GPUParticles3D.mb_get_skin == null) gdext.classes.GPUParticles3D.mb_get_skin = MethodBind.get("GPUParticles3D", "get_skin", 2074563878L)
    Wrappers.owned[Skin](Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_skin, livePtr))
  }

  /** GPUParticles3D.restart */
  final def restart(keep_seed: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_restart == null) gdext.classes.GPUParticles3D.mb_restart = MethodBind.get("GPUParticles3D", "restart", 107499316L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_restart, livePtr, keep_seed)
  }

  /** GPUParticles3D.capture_aabb */
  final def captureAabb(): gdext.builtin.AABB = {
    if (gdext.classes.GPUParticles3D.mb_capture_aabb == null) gdext.classes.GPUParticles3D.mb_capture_aabb = MethodBind.get("GPUParticles3D", "capture_aabb", 1068685055L)
    Ptrcall.call0[gdext.builtin.AABB](gdext.classes.GPUParticles3D.mb_capture_aabb, livePtr)
  }

  /** GPUParticles3D.emit_particle */
  final def emitParticle(xform: gdext.builtin.Transform3D, velocity: gdext.builtin.Vector3, color: gdext.builtin.Color, custom: gdext.builtin.Color, flags: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_emit_particle == null) gdext.classes.GPUParticles3D.mb_emit_particle = MethodBind.get("GPUParticles3D", "emit_particle", 992173727L)
    Ptrcall.callVoid5(gdext.classes.GPUParticles3D.mb_emit_particle, livePtr, xform, velocity, color, custom, flags)
  }

  /** GPUParticles3D.set_trail_enabled */
  final def setTrailEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_trail_enabled == null) gdext.classes.GPUParticles3D.mb_set_trail_enabled = MethodBind.get("GPUParticles3D", "set_trail_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_trail_enabled, livePtr, enabled)
  }

  /** GPUParticles3D.set_trail_lifetime */
  final def setTrailLifetime(secs: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_trail_lifetime == null) gdext.classes.GPUParticles3D.mb_set_trail_lifetime = MethodBind.get("GPUParticles3D", "set_trail_lifetime", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_trail_lifetime, livePtr, secs)
  }

  /** GPUParticles3D.is_trail_enabled */
  final def isTrailEnabled(): Boolean = {
    if (gdext.classes.GPUParticles3D.mb_is_trail_enabled == null) gdext.classes.GPUParticles3D.mb_is_trail_enabled = MethodBind.get("GPUParticles3D", "is_trail_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.GPUParticles3D.mb_is_trail_enabled, livePtr)
  }

  /** GPUParticles3D.get_trail_lifetime */
  final def getTrailLifetime(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_trail_lifetime == null) gdext.classes.GPUParticles3D.mb_get_trail_lifetime = MethodBind.get("GPUParticles3D", "get_trail_lifetime", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_trail_lifetime, livePtr)
  }

  /** GPUParticles3D.set_transform_align */
  final def setTransformAlign(align: Long): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_transform_align == null) gdext.classes.GPUParticles3D.mb_set_transform_align = MethodBind.get("GPUParticles3D", "set_transform_align", 3892425954L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_transform_align, livePtr, align)
  }

  /** GPUParticles3D.get_transform_align */
  final def getTransformAlign(): Long = {
    if (gdext.classes.GPUParticles3D.mb_get_transform_align == null) gdext.classes.GPUParticles3D.mb_get_transform_align = MethodBind.get("GPUParticles3D", "get_transform_align", 2100992166L)
    Ptrcall.call0[Long](gdext.classes.GPUParticles3D.mb_get_transform_align, livePtr)
  }

  /** GPUParticles3D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit = {
    if (gdext.classes.GPUParticles3D.mb_convert_from_particles == null) gdext.classes.GPUParticles3D.mb_convert_from_particles = MethodBind.get("GPUParticles3D", "convert_from_particles", 1078189570L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_convert_from_particles, livePtr, Wrappers.handle(particles))
  }

  /** GPUParticles3D.set_amount_ratio */
  final def setAmountRatio(ratio: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_set_amount_ratio == null) gdext.classes.GPUParticles3D.mb_set_amount_ratio = MethodBind.get("GPUParticles3D", "set_amount_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_set_amount_ratio, livePtr, ratio)
  }

  /** GPUParticles3D.get_amount_ratio */
  final def getAmountRatio(): Double = {
    if (gdext.classes.GPUParticles3D.mb_get_amount_ratio == null) gdext.classes.GPUParticles3D.mb_get_amount_ratio = MethodBind.get("GPUParticles3D", "get_amount_ratio", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.GPUParticles3D.mb_get_amount_ratio, livePtr)
  }

  /** GPUParticles3D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit = {
    if (gdext.classes.GPUParticles3D.mb_request_particles_process == null) gdext.classes.GPUParticles3D.mb_request_particles_process = MethodBind.get("GPUParticles3D", "request_particles_process", 373806689L)
    Ptrcall.callVoid1(gdext.classes.GPUParticles3D.mb_request_particles_process, livePtr, process_time)
  }

}

object GPUParticles3D {
  private[classes] var mb_set_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visibility_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_process_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_base_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_interp_to_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_emitting: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_one_shot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_pre_process_time: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_explosiveness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_randomness_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_visibility_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_local_coordinates: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fixed_fps: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fractional_delta: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interpolate: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_process_material: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_speed_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_base_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_interp_to_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_use_fixed_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_seed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_order: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_passes: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_draw_pass_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_passes: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_draw_pass_mesh: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_skin: GDExtensionMethodBindPtr = null
  private[classes] var mb_restart: GDExtensionMethodBindPtr = null
  private[classes] var mb_capture_aabb: GDExtensionMethodBindPtr = null
  private[classes] var mb_emit_particle: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_trail_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_trail_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_trail_lifetime: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transform_align: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_transform_align: GDExtensionMethodBindPtr = null
  private[classes] var mb_convert_from_particles: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_amount_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_amount_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_particles_process: GDExtensionMethodBindPtr = null
}
