package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `CPUParticles3D`, extends `GeometryInstance3D`. */
abstract class CPUParticles3D extends GeometryInstance3D {

  /** CPUParticles3D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emitting", 2586408642L), hostObject.objectPtr, emitting)

  /** CPUParticles3D.set_amount */
  final def setAmount(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_amount", 1286410249L), hostObject.objectPtr, amount)

  /** CPUParticles3D.set_lifetime */
  final def setLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** CPUParticles3D.set_one_shot */
  final def setOneShot(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_one_shot", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles3D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_pre_process_time", 373806689L), hostObject.objectPtr, secs)

  /** CPUParticles3D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_explosiveness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** CPUParticles3D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_randomness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** CPUParticles3D.set_visibility_aabb */
  final def setVisibilityAabb(aabb: gdext.builtin.AABB): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_visibility_aabb", 259215842L), hostObject.objectPtr, aabb)

  /** CPUParticles3D.set_lifetime_randomness */
  final def setLifetimeRandomness(random: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_lifetime_randomness", 373806689L), hostObject.objectPtr, random)

  /** CPUParticles3D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_use_local_coordinates", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles3D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_fixed_fps", 1286410249L), hostObject.objectPtr, fps)

  /** CPUParticles3D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_fractional_delta", 2586408642L), hostObject.objectPtr, enable)

  /** CPUParticles3D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** CPUParticles3D.is_emitting */
  final def isEmitting(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "is_emitting", 36873697L), hostObject.objectPtr)

  /** CPUParticles3D.get_amount */
  final def getAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles3D", "get_amount", 3905245786L), hostObject.objectPtr)

  /** CPUParticles3D.get_lifetime */
  final def getLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_lifetime", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_one_shot */
  final def getOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "get_one_shot", 36873697L), hostObject.objectPtr)

  /** CPUParticles3D.get_pre_process_time */
  final def getPreProcessTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_pre_process_time", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_explosiveness_ratio", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_randomness_ratio */
  final def getRandomnessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_randomness_ratio", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_visibility_aabb */
  final def getVisibilityAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("CPUParticles3D", "get_visibility_aabb", 1068685055L), hostObject.objectPtr)

  /** CPUParticles3D.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_lifetime_randomness", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "get_use_local_coordinates", 36873697L), hostObject.objectPtr)

  /** CPUParticles3D.get_fixed_fps */
  final def getFixedFps(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles3D", "get_fixed_fps", 3905245786L), hostObject.objectPtr)

  /** CPUParticles3D.get_fractional_delta */
  final def getFractionalDelta(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "get_fractional_delta", 36873697L), hostObject.objectPtr)

  /** CPUParticles3D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_draw_order */
  final def setDrawOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_draw_order", 1427401774L), hostObject.objectPtr, order)

  /** CPUParticles3D.get_draw_order */
  final def getDrawOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles3D", "get_draw_order", 1321900776L), hostObject.objectPtr)

  /** CPUParticles3D.set_mesh */
  final def setMesh(mesh: Mesh): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_mesh", 194775623L), hostObject.objectPtr, mesh.hostObject)

  /** CPUParticles3D.get_mesh */
  final def getMesh(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_mesh", 1808005922L), hostObject.objectPtr)

  /** CPUParticles3D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_use_fixed_seed", 2586408642L), hostObject.objectPtr, use_fixed_seed)

  /** CPUParticles3D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "get_use_fixed_seed", 36873697L), hostObject.objectPtr)

  /** CPUParticles3D.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** CPUParticles3D.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles3D", "get_seed", 3905245786L), hostObject.objectPtr)

  /** CPUParticles3D.restart */
  final def restart(keep_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "restart", 107499316L), hostObject.objectPtr, keep_seed)

  /** CPUParticles3D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "request_particles_process", 373806689L), hostObject.objectPtr, process_time)

  /** CPUParticles3D.capture_aabb */
  final def captureAabb(): gdext.builtin.AABB =
    Ptrcall.call0[gdext.builtin.AABB](MethodBind.get("CPUParticles3D", "capture_aabb", 1068685055L), hostObject.objectPtr)

  /** CPUParticles3D.set_direction */
  final def setDirection(direction: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_direction", 3460891852L), hostObject.objectPtr, direction)

  /** CPUParticles3D.get_direction */
  final def getDirection(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CPUParticles3D", "get_direction", 3360562783L), hostObject.objectPtr)

  /** CPUParticles3D.set_spread */
  final def setSpread(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_spread", 373806689L), hostObject.objectPtr, degrees)

  /** CPUParticles3D.get_spread */
  final def getSpread(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_spread", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_flatness */
  final def setFlatness(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_flatness", 373806689L), hostObject.objectPtr, amount)

  /** CPUParticles3D.get_flatness */
  final def getFlatness(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_flatness", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_param_min */
  final def setParamMin(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles3D", "set_param_min", 557936109L), hostObject.objectPtr, param, value)

  /** CPUParticles3D.get_param_min */
  final def getParamMin(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("CPUParticles3D", "get_param_min", 597646162L), hostObject.objectPtr, param)

  /** CPUParticles3D.set_param_max */
  final def setParamMax(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles3D", "set_param_max", 557936109L), hostObject.objectPtr, param, value)

  /** CPUParticles3D.get_param_max */
  final def getParamMax(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("CPUParticles3D", "get_param_max", 597646162L), hostObject.objectPtr, param)

  /** CPUParticles3D.set_param_curve */
  final def setParamCurve(param: Long, curve: Curve): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles3D", "set_param_curve", 4044142537L), hostObject.objectPtr, param, curve.hostObject)

  /** CPUParticles3D.get_param_curve */
  final def getParamCurve(param: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("CPUParticles3D", "get_param_curve", 4132790277L), hostObject.objectPtr, param)

  /** CPUParticles3D.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** CPUParticles3D.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("CPUParticles3D", "get_color", 3444240500L), hostObject.objectPtr)

  /** CPUParticles3D.set_color_ramp */
  final def setColorRamp(ramp: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_color_ramp", 2756054477L), hostObject.objectPtr, ramp.hostObject)

  /** CPUParticles3D.get_color_ramp */
  final def getColorRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_color_ramp", 132272999L), hostObject.objectPtr)

  /** CPUParticles3D.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Gradient): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_color_initial_ramp", 2756054477L), hostObject.objectPtr, ramp.hostObject)

  /** CPUParticles3D.get_color_initial_ramp */
  final def getColorInitialRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_color_initial_ramp", 132272999L), hostObject.objectPtr)

  /** CPUParticles3D.set_particle_flag */
  final def setParticleFlag(particle_flag: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("CPUParticles3D", "set_particle_flag", 3515406498L), hostObject.objectPtr, particle_flag, enable)

  /** CPUParticles3D.get_particle_flag */
  final def getParticleFlag(particle_flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("CPUParticles3D", "get_particle_flag", 2845201987L), hostObject.objectPtr, particle_flag)

  /** CPUParticles3D.set_emission_shape */
  final def setEmissionShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_shape", 491823814L), hostObject.objectPtr, shape)

  /** CPUParticles3D.get_emission_shape */
  final def getEmissionShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("CPUParticles3D", "get_emission_shape", 2961454842L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_sphere_radius", 373806689L), hostObject.objectPtr, radius)

  /** CPUParticles3D.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_emission_sphere_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_box_extents */
  final def setEmissionBoxExtents(extents: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_box_extents", 3460891852L), hostObject.objectPtr, extents)

  /** CPUParticles3D.get_emission_box_extents */
  final def getEmissionBoxExtents(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CPUParticles3D", "get_emission_box_extents", 3360562783L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_ring_axis */
  final def setEmissionRingAxis(axis: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_ring_axis", 3460891852L), hostObject.objectPtr, axis)

  /** CPUParticles3D.get_emission_ring_axis */
  final def getEmissionRingAxis(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CPUParticles3D", "get_emission_ring_axis", 3360562783L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_ring_height */
  final def setEmissionRingHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_ring_height", 373806689L), hostObject.objectPtr, height)

  /** CPUParticles3D.get_emission_ring_height */
  final def getEmissionRingHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_emission_ring_height", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_ring_radius", 373806689L), hostObject.objectPtr, radius)

  /** CPUParticles3D.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_emission_ring_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(inner_radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_ring_inner_radius", 373806689L), hostObject.objectPtr, inner_radius)

  /** CPUParticles3D.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_emission_ring_inner_radius", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.set_emission_ring_cone_angle */
  final def setEmissionRingConeAngle(cone_angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_emission_ring_cone_angle", 373806689L), hostObject.objectPtr, cone_angle)

  /** CPUParticles3D.get_emission_ring_cone_angle */
  final def getEmissionRingConeAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("CPUParticles3D", "get_emission_ring_cone_angle", 1740695150L), hostObject.objectPtr)

  /** CPUParticles3D.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("CPUParticles3D", "get_gravity", 3360562783L), hostObject.objectPtr)

  /** CPUParticles3D.set_gravity */
  final def setGravity(accel_vec: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_gravity", 3460891852L), hostObject.objectPtr, accel_vec)

  /** CPUParticles3D.get_split_scale */
  final def getSplitScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("CPUParticles3D", "get_split_scale", 2240911060L), hostObject.objectPtr)

  /** CPUParticles3D.set_split_scale */
  final def setSplitScale(split_scale: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_split_scale", 2586408642L), hostObject.objectPtr, split_scale)

  /** CPUParticles3D.get_scale_curve_x */
  final def getScaleCurveX(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_scale_curve_x", 2460114913L), hostObject.objectPtr)

  /** CPUParticles3D.set_scale_curve_x */
  final def setScaleCurveX(scale_curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_scale_curve_x", 270443179L), hostObject.objectPtr, scale_curve.hostObject)

  /** CPUParticles3D.get_scale_curve_y */
  final def getScaleCurveY(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_scale_curve_y", 2460114913L), hostObject.objectPtr)

  /** CPUParticles3D.set_scale_curve_y */
  final def setScaleCurveY(scale_curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_scale_curve_y", 270443179L), hostObject.objectPtr, scale_curve.hostObject)

  /** CPUParticles3D.get_scale_curve_z */
  final def getScaleCurveZ(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("CPUParticles3D", "get_scale_curve_z", 2460114913L), hostObject.objectPtr)

  /** CPUParticles3D.set_scale_curve_z */
  final def setScaleCurveZ(scale_curve: Curve): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "set_scale_curve_z", 270443179L), hostObject.objectPtr, scale_curve.hostObject)

  /** CPUParticles3D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("CPUParticles3D", "convert_from_particles", 1078189570L), hostObject.objectPtr, particles.hostObject)

}

object CPUParticles3D {
  /** Class metadata for Gd[CPUParticles3D] lifetime management and casting. */
  given GodotClass[CPUParticles3D] with {
    def className = "CPUParticles3D"
    def isRefCounted = false
    def wrap(o: GodotObject): CPUParticles3D = new CPUParticles3D {}.withHost(o.objectPtr)
    def unwrap(t: CPUParticles3D): GodotObject = t.hostObject
  }
}
