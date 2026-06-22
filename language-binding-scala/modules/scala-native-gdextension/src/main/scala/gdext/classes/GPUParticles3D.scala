package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticles3D`, extends `GeometryInstance3D`. */
abstract class GPUParticles3D extends GeometryInstance3D {

  /** GPUParticles3D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_emitting", 2586408642L), hostObject.objectPtr, emitting)

  /** GPUParticles3D.set_amount */
  final def setAmount(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_amount", 1286410249L), hostObject.objectPtr, amount)

  /** GPUParticles3D.set_lifetime */
  final def setLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles3D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_one_shot", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles3D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_pre_process_time", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles3D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_explosiveness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles3D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_randomness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles3D.set_visibility_aabb */
  final def setVisibilityAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_visibility_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** GPUParticles3D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_use_local_coordinates", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles3D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_fixed_fps", 1286410249L), hostObject.objectPtr, fps)

  /** GPUParticles3D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_fractional_delta", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles3D.set_interpolate */
  final def setInterpolate(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_interpolate", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles3D.set_process_material */
  final def setProcessMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_process_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** GPUParticles3D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** GPUParticles3D.set_collision_base_size */
  final def setCollisionBaseSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_collision_base_size", 373806689L), hostObject.objectPtr, size)

  /** GPUParticles3D.set_interp_to_end */
  final def setInterpToEnd(interp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_interp_to_end", 373806689L), hostObject.objectPtr, interp)

  /** GPUParticles3D.is_emitting */
  final def isEmitting(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "is_emitting", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_amount */
  final def getAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_amount", 3905245786L), hostObject.objectPtr)

  /** GPUParticles3D.get_lifetime */
  final def getLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_lifetime", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_one_shot */
  final def getOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "get_one_shot", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_pre_process_time */
  final def getPreProcessTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_pre_process_time", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_explosiveness_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_randomness_ratio */
  final def getRandomnessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_randomness_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_visibility_aabb */
  final def getVisibilityAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("GPUParticles3D", "get_visibility_aabb", 1068685055L), hostObject.objectPtr)

  /** GPUParticles3D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "get_use_local_coordinates", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_fixed_fps */
  final def getFixedFps(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_fixed_fps", 3905245786L), hostObject.objectPtr)

  /** GPUParticles3D.get_fractional_delta */
  final def getFractionalDelta(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "get_fractional_delta", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_interpolate */
  final def getInterpolate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "get_interpolate", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_process_material */
  final def getProcessMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticles3D", "get_process_material", 5934680L), hostObject.objectPtr)

  /** GPUParticles3D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_collision_base_size */
  final def getCollisionBaseSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_collision_base_size", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.get_interp_to_end */
  final def getInterpToEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_interp_to_end", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_use_fixed_seed", 2586408642L), hostObject.objectPtr, use_fixed_seed)

  /** GPUParticles3D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "get_use_fixed_seed", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** GPUParticles3D.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_seed", 3905245786L), hostObject.objectPtr)

  /** GPUParticles3D.set_draw_order */
  final def setDrawOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_draw_order", 1208074815L), hostObject.objectPtr, order)

  /** GPUParticles3D.get_draw_order */
  final def getDrawOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_draw_order", 3770381780L), hostObject.objectPtr)

  /** GPUParticles3D.set_draw_passes */
  final def setDrawPasses(passes: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_draw_passes", 1286410249L), hostObject.objectPtr, passes)

  /** GPUParticles3D.set_draw_pass_mesh */
  final def setDrawPassMesh(pass: Long, mesh: Mesh): Unit =
    Ptrcall.callVoid2(MethodBind.get("GPUParticles3D", "set_draw_pass_mesh", 969122797L), hostObject.objectPtr, pass, mesh.hostObject)

  /** GPUParticles3D.get_draw_passes */
  final def getDrawPasses(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_draw_passes", 3905245786L), hostObject.objectPtr)

  /** GPUParticles3D.get_draw_pass_mesh */
  final def getDrawPassMesh(pass: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("GPUParticles3D", "get_draw_pass_mesh", 1576363275L), hostObject.objectPtr, pass)

  /** GPUParticles3D.set_skin */
  final def setSkin(skin: Skin): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_skin", 3971435618L), hostObject.objectPtr, skin.hostObject)

  /** GPUParticles3D.get_skin */
  final def getSkin(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticles3D", "get_skin", 2074563878L), hostObject.objectPtr)

  /** GPUParticles3D.restart */
  final def restart(keep_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "restart", 107499316L), hostObject.objectPtr, keep_seed)

  /** GPUParticles3D.capture_aabb */
  final def captureAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("GPUParticles3D", "capture_aabb", 1068685055L), hostObject.objectPtr)

  /** GPUParticles3D.emit_particle */
  final def emitParticle(xform: gdext.builtin.Transform3D, velocity: gdext.builtin.Vector3, color: gdext.builtin.Color, custom: gdext.builtin.Color, flags: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("GPUParticles3D", "emit_particle", 992173727L), hostObject.objectPtr, xform, velocity, color, custom, flags)

  /** GPUParticles3D.set_trail_enabled */
  final def setTrailEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_trail_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** GPUParticles3D.set_trail_lifetime */
  final def setTrailLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_trail_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles3D.is_trail_enabled */
  final def isTrailEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles3D", "is_trail_enabled", 36873697L), hostObject.objectPtr)

  /** GPUParticles3D.get_trail_lifetime */
  final def getTrailLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_trail_lifetime", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.set_transform_align */
  final def setTransformAlign(align: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_transform_align", 3892425954L), hostObject.objectPtr, align)

  /** GPUParticles3D.get_transform_align */
  final def getTransformAlign(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles3D", "get_transform_align", 2100992166L), hostObject.objectPtr)

  /** GPUParticles3D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "convert_from_particles", 1078189570L), hostObject.objectPtr, particles.hostObject)

  /** GPUParticles3D.set_amount_ratio */
  final def setAmountRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "set_amount_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles3D.get_amount_ratio */
  final def getAmountRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles3D", "get_amount_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles3D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles3D", "request_particles_process", 373806689L), hostObject.objectPtr, process_time)

}

object GPUParticles3D {
  /** Class metadata for Gd[GPUParticles3D] lifetime management and casting. */
  given GodotClass[GPUParticles3D] with {
    def className = "GPUParticles3D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticles3D = new GPUParticles3D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticles3D): GodotObject = t.hostObject
  }
}
