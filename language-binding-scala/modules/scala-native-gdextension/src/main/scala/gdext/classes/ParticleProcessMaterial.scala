package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `ParticleProcessMaterial`, extends `Material`. */
abstract class ParticleProcessMaterial extends Material {

  /** ParticleProcessMaterial.set_direction */
  final def setDirection(degrees: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_direction", 3460891852L), hostObject.objectPtr, degrees)

  /** ParticleProcessMaterial.get_direction */
  final def getDirection(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_direction", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_inherit_velocity_ratio */
  final def setInheritVelocityRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_inherit_velocity_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** ParticleProcessMaterial.get_inherit_velocity_ratio */
  final def getInheritVelocityRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_inherit_velocity_ratio", 191475506L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_spread */
  final def setSpread(degrees: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_spread", 373806689L), hostObject.objectPtr, degrees)

  /** ParticleProcessMaterial.get_spread */
  final def getSpread(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_spread", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_flatness */
  final def setFlatness(amount: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_flatness", 373806689L), hostObject.objectPtr, amount)

  /** ParticleProcessMaterial.get_flatness */
  final def getFlatness(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_flatness", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_param */
  final def setParam(param: Long, value: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("ParticleProcessMaterial", "set_param", 676779352L), hostObject.objectPtr, param, value)

  /** ParticleProcessMaterial.get_param */
  final def getParam(param: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("ParticleProcessMaterial", "get_param", 2623708480L), hostObject.objectPtr, param)

  /** ParticleProcessMaterial.set_param_min */
  final def setParamMin(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ParticleProcessMaterial", "set_param_min", 2295964248L), hostObject.objectPtr, param, value)

  /** ParticleProcessMaterial.get_param_min */
  final def getParamMin(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ParticleProcessMaterial", "get_param_min", 3903786503L), hostObject.objectPtr, param)

  /** ParticleProcessMaterial.set_param_max */
  final def setParamMax(param: Long, value: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("ParticleProcessMaterial", "set_param_max", 2295964248L), hostObject.objectPtr, param, value)

  /** ParticleProcessMaterial.get_param_max */
  final def getParamMax(param: Long): Double =
    Ptrcall.call1[Long, Double](MethodBind.get("ParticleProcessMaterial", "get_param_max", 3903786503L), hostObject.objectPtr, param)

  /** ParticleProcessMaterial.set_param_texture */
  final def setParamTexture(param: Long, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("ParticleProcessMaterial", "set_param_texture", 526976089L), hostObject.objectPtr, param, texture.hostObject)

  /** ParticleProcessMaterial.get_param_texture */
  final def getParamTexture(param: Long): GodotObject =
    Ptrcall.call1[Long, GodotObject](MethodBind.get("ParticleProcessMaterial", "get_param_texture", 3489372978L), hostObject.objectPtr, param)

  /** ParticleProcessMaterial.set_color */
  final def setColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_color", 2920490490L), hostObject.objectPtr, color)

  /** ParticleProcessMaterial.get_color */
  final def getColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("ParticleProcessMaterial", "get_color", 3444240500L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_color_ramp */
  final def setColorRamp(ramp: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_color_ramp", 4051416890L), hostObject.objectPtr, ramp.hostObject)

  /** ParticleProcessMaterial.get_color_ramp */
  final def getColorRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_color_ramp", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_alpha_curve */
  final def setAlphaCurve(curve: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_alpha_curve", 4051416890L), hostObject.objectPtr, curve.hostObject)

  /** ParticleProcessMaterial.get_alpha_curve */
  final def getAlphaCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_alpha_curve", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_curve */
  final def setEmissionCurve(curve: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_curve", 4051416890L), hostObject.objectPtr, curve.hostObject)

  /** ParticleProcessMaterial.get_emission_curve */
  final def getEmissionCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_emission_curve", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_color_initial_ramp", 4051416890L), hostObject.objectPtr, ramp.hostObject)

  /** ParticleProcessMaterial.get_color_initial_ramp */
  final def getColorInitialRamp(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_color_initial_ramp", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_velocity_limit_curve */
  final def setVelocityLimitCurve(curve: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_velocity_limit_curve", 4051416890L), hostObject.objectPtr, curve.hostObject)

  /** ParticleProcessMaterial.get_velocity_limit_curve */
  final def getVelocityLimitCurve(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_velocity_limit_curve", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_particle_flag */
  final def setParticleFlag(particle_flag: Long, enable: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("ParticleProcessMaterial", "set_particle_flag", 1711815571L), hostObject.objectPtr, particle_flag, enable)

  /** ParticleProcessMaterial.get_particle_flag */
  final def getParticleFlag(particle_flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("ParticleProcessMaterial", "get_particle_flag", 3895316907L), hostObject.objectPtr, particle_flag)

  /** ParticleProcessMaterial.set_velocity_pivot */
  final def setVelocityPivot(pivot: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_velocity_pivot", 3460891852L), hostObject.objectPtr, pivot)

  /** ParticleProcessMaterial.get_velocity_pivot */
  final def getVelocityPivot(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_velocity_pivot", 3783033775L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_shape */
  final def setEmissionShape(shape: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_shape", 461501442L), hostObject.objectPtr, shape)

  /** ParticleProcessMaterial.get_emission_shape */
  final def getEmissionShape(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_emission_shape", 3719733018L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_sphere_radius", 373806689L), hostObject.objectPtr, radius)

  /** ParticleProcessMaterial.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_emission_sphere_radius", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_box_extents */
  final def setEmissionBoxExtents(extents: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_box_extents", 3460891852L), hostObject.objectPtr, extents)

  /** ParticleProcessMaterial.get_emission_box_extents */
  final def getEmissionBoxExtents(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_emission_box_extents", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_point_texture */
  final def setEmissionPointTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_point_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** ParticleProcessMaterial.get_emission_point_texture */
  final def getEmissionPointTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_emission_point_texture", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_normal_texture */
  final def setEmissionNormalTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_normal_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** ParticleProcessMaterial.get_emission_normal_texture */
  final def getEmissionNormalTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_emission_normal_texture", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_color_texture */
  final def setEmissionColorTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_color_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** ParticleProcessMaterial.get_emission_color_texture */
  final def getEmissionColorTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ParticleProcessMaterial", "get_emission_color_texture", 3635182373L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_point_count */
  final def setEmissionPointCount(point_count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_point_count", 1286410249L), hostObject.objectPtr, point_count)

  /** ParticleProcessMaterial.get_emission_point_count */
  final def getEmissionPointCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_emission_point_count", 3905245786L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_ring_axis */
  final def setEmissionRingAxis(axis: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_ring_axis", 3460891852L), hostObject.objectPtr, axis)

  /** ParticleProcessMaterial.get_emission_ring_axis */
  final def getEmissionRingAxis(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_emission_ring_axis", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_ring_height */
  final def setEmissionRingHeight(height: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_ring_height", 373806689L), hostObject.objectPtr, height)

  /** ParticleProcessMaterial.get_emission_ring_height */
  final def getEmissionRingHeight(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_emission_ring_height", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_ring_radius", 373806689L), hostObject.objectPtr, radius)

  /** ParticleProcessMaterial.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_emission_ring_radius", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(inner_radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_ring_inner_radius", 373806689L), hostObject.objectPtr, inner_radius)

  /** ParticleProcessMaterial.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_emission_ring_inner_radius", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_ring_cone_angle */
  final def setEmissionRingConeAngle(cone_angle: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_ring_cone_angle", 373806689L), hostObject.objectPtr, cone_angle)

  /** ParticleProcessMaterial.get_emission_ring_cone_angle */
  final def getEmissionRingConeAngle(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_emission_ring_cone_angle", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_shape_offset */
  final def setEmissionShapeOffset(emission_shape_offset: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_shape_offset", 3460891852L), hostObject.objectPtr, emission_shape_offset)

  /** ParticleProcessMaterial.get_emission_shape_offset */
  final def getEmissionShapeOffset(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_emission_shape_offset", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_emission_shape_scale */
  final def setEmissionShapeScale(emission_shape_scale: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_emission_shape_scale", 3460891852L), hostObject.objectPtr, emission_shape_scale)

  /** ParticleProcessMaterial.get_emission_shape_scale */
  final def getEmissionShapeScale(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_emission_shape_scale", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.get_turbulence_enabled */
  final def getTurbulenceEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParticleProcessMaterial", "get_turbulence_enabled", 36873697L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_turbulence_enabled */
  final def setTurbulenceEnabled(turbulence_enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_turbulence_enabled", 2586408642L), hostObject.objectPtr, turbulence_enabled)

  /** ParticleProcessMaterial.get_turbulence_noise_strength */
  final def getTurbulenceNoiseStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_strength", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_turbulence_noise_strength */
  final def setTurbulenceNoiseStrength(turbulence_noise_strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_strength", 373806689L), hostObject.objectPtr, turbulence_noise_strength)

  /** ParticleProcessMaterial.get_turbulence_noise_scale */
  final def getTurbulenceNoiseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_scale", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_turbulence_noise_scale */
  final def setTurbulenceNoiseScale(turbulence_noise_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_scale", 373806689L), hostObject.objectPtr, turbulence_noise_scale)

  /** ParticleProcessMaterial.get_turbulence_noise_speed_random */
  final def getTurbulenceNoiseSpeedRandom(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_speed_random", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_turbulence_noise_speed_random */
  final def setTurbulenceNoiseSpeedRandom(turbulence_noise_speed_random: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_speed_random", 373806689L), hostObject.objectPtr, turbulence_noise_speed_random)

  /** ParticleProcessMaterial.get_turbulence_noise_speed */
  final def getTurbulenceNoiseSpeed(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_speed", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_turbulence_noise_speed */
  final def setTurbulenceNoiseSpeed(turbulence_noise_speed: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_speed", 3460891852L), hostObject.objectPtr, turbulence_noise_speed)

  /** ParticleProcessMaterial.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 =
    Ptrcall.call0[gdext.builtin.Vector3](MethodBind.get("ParticleProcessMaterial", "get_gravity", 3360562783L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_gravity */
  final def setGravity(accel_vec: gdext.builtin.Vector3): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_gravity", 3460891852L), hostObject.objectPtr, accel_vec)

  /** ParticleProcessMaterial.set_lifetime_randomness */
  final def setLifetimeRandomness(randomness: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_lifetime_randomness", 373806689L), hostObject.objectPtr, randomness)

  /** ParticleProcessMaterial.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_lifetime_randomness", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.get_sub_emitter_mode */
  final def getSubEmitterMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_mode", 2399052877L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_mode */
  final def setSubEmitterMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_mode", 2161806672L), hostObject.objectPtr, mode)

  /** ParticleProcessMaterial.get_sub_emitter_frequency */
  final def getSubEmitterFrequency(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_frequency", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_frequency */
  final def setSubEmitterFrequency(hz: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_frequency", 373806689L), hostObject.objectPtr, hz)

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_end */
  final def getSubEmitterAmountAtEnd(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_end", 3905245786L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_end */
  final def setSubEmitterAmountAtEnd(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_end", 1286410249L), hostObject.objectPtr, amount)

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_collision */
  final def getSubEmitterAmountAtCollision(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision", 3905245786L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_collision */
  final def setSubEmitterAmountAtCollision(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision", 1286410249L), hostObject.objectPtr, amount)

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_start */
  final def getSubEmitterAmountAtStart(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_start", 3905245786L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_start */
  final def setSubEmitterAmountAtStart(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_start", 1286410249L), hostObject.objectPtr, amount)

  /** ParticleProcessMaterial.get_sub_emitter_keep_velocity */
  final def getSubEmitterKeepVelocity(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_keep_velocity", 36873697L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_sub_emitter_keep_velocity */
  final def setSubEmitterKeepVelocity(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_keep_velocity", 2586408642L), hostObject.objectPtr, enable)

  /** ParticleProcessMaterial.set_attractor_interaction_enabled */
  final def setAttractorInteractionEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_attractor_interaction_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** ParticleProcessMaterial.is_attractor_interaction_enabled */
  final def isAttractorInteractionEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParticleProcessMaterial", "is_attractor_interaction_enabled", 36873697L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_collision_mode */
  final def setCollisionMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_collision_mode", 653804659L), hostObject.objectPtr, mode)

  /** ParticleProcessMaterial.get_collision_mode */
  final def getCollisionMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("ParticleProcessMaterial", "get_collision_mode", 139371864L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_collision_use_scale */
  final def setCollisionUseScale(radius: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_collision_use_scale", 2586408642L), hostObject.objectPtr, radius)

  /** ParticleProcessMaterial.is_collision_using_scale */
  final def isCollisionUsingScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("ParticleProcessMaterial", "is_collision_using_scale", 36873697L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_collision_friction */
  final def setCollisionFriction(friction: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_collision_friction", 373806689L), hostObject.objectPtr, friction)

  /** ParticleProcessMaterial.get_collision_friction */
  final def getCollisionFriction(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_collision_friction", 1740695150L), hostObject.objectPtr)

  /** ParticleProcessMaterial.set_collision_bounce */
  final def setCollisionBounce(bounce: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ParticleProcessMaterial", "set_collision_bounce", 373806689L), hostObject.objectPtr, bounce)

  /** ParticleProcessMaterial.get_collision_bounce */
  final def getCollisionBounce(): Double =
    Ptrcall.call0[Double](MethodBind.get("ParticleProcessMaterial", "get_collision_bounce", 1740695150L), hostObject.objectPtr)

}

object ParticleProcessMaterial {
  /** Class metadata for Gd[ParticleProcessMaterial] lifetime management and casting. */
  given GodotClass[ParticleProcessMaterial] with {
    def className = "ParticleProcessMaterial"
    def isRefCounted = true
    def wrap(o: GodotObject): ParticleProcessMaterial = new ParticleProcessMaterial {}.withHost(o.objectPtr)
    def unwrap(t: ParticleProcessMaterial): GodotObject = t.hostObject
  }
}
