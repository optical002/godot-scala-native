package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ParticleProcessMaterial`, extends `Material`. */
abstract class ParticleProcessMaterial extends Material {
  override def godotClassName: String = "ParticleProcessMaterial"

  /** ParticleProcessMaterial.set_direction */
  final def setDirection(degrees: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_direction == null) gdext.classes.ParticleProcessMaterial.mb_set_direction = MethodBind.get("ParticleProcessMaterial", "set_direction", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_direction, livePtr, degrees)
  }

  /** ParticleProcessMaterial.get_direction */
  final def getDirection(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_direction == null) gdext.classes.ParticleProcessMaterial.mb_get_direction = MethodBind.get("ParticleProcessMaterial", "get_direction", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_direction, livePtr)
  }

  /** ParticleProcessMaterial.set_inherit_velocity_ratio */
  final def setInheritVelocityRatio(ratio: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_inherit_velocity_ratio == null) gdext.classes.ParticleProcessMaterial.mb_set_inherit_velocity_ratio = MethodBind.get("ParticleProcessMaterial", "set_inherit_velocity_ratio", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_inherit_velocity_ratio, livePtr, ratio)
  }

  /** ParticleProcessMaterial.get_inherit_velocity_ratio */
  final def getInheritVelocityRatio(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_inherit_velocity_ratio == null) gdext.classes.ParticleProcessMaterial.mb_get_inherit_velocity_ratio = MethodBind.get("ParticleProcessMaterial", "get_inherit_velocity_ratio", 191475506L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_inherit_velocity_ratio, livePtr)
  }

  /** ParticleProcessMaterial.set_spread */
  final def setSpread(degrees: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_spread == null) gdext.classes.ParticleProcessMaterial.mb_set_spread = MethodBind.get("ParticleProcessMaterial", "set_spread", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_spread, livePtr, degrees)
  }

  /** ParticleProcessMaterial.get_spread */
  final def getSpread(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_spread == null) gdext.classes.ParticleProcessMaterial.mb_get_spread = MethodBind.get("ParticleProcessMaterial", "get_spread", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_spread, livePtr)
  }

  /** ParticleProcessMaterial.set_flatness */
  final def setFlatness(amount: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_flatness == null) gdext.classes.ParticleProcessMaterial.mb_set_flatness = MethodBind.get("ParticleProcessMaterial", "set_flatness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_flatness, livePtr, amount)
  }

  /** ParticleProcessMaterial.get_flatness */
  final def getFlatness(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_flatness == null) gdext.classes.ParticleProcessMaterial.mb_get_flatness = MethodBind.get("ParticleProcessMaterial", "get_flatness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_flatness, livePtr)
  }

  /** ParticleProcessMaterial.set_param */
  final def setParam(param: Long, value: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_param == null) gdext.classes.ParticleProcessMaterial.mb_set_param = MethodBind.get("ParticleProcessMaterial", "set_param", 676779352L)
    Ptrcall.callVoid2(gdext.classes.ParticleProcessMaterial.mb_set_param, livePtr, param, value)
  }

  /** ParticleProcessMaterial.get_param */
  final def getParam(param: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_param == null) gdext.classes.ParticleProcessMaterial.mb_get_param = MethodBind.get("ParticleProcessMaterial", "get_param", 2623708480L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.ParticleProcessMaterial.mb_get_param, livePtr, param)
  }

  /** ParticleProcessMaterial.set_param_min */
  final def setParamMin(param: Long, value: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_param_min == null) gdext.classes.ParticleProcessMaterial.mb_set_param_min = MethodBind.get("ParticleProcessMaterial", "set_param_min", 2295964248L)
    Ptrcall.callVoid2(gdext.classes.ParticleProcessMaterial.mb_set_param_min, livePtr, param, value)
  }

  /** ParticleProcessMaterial.get_param_min */
  final def getParamMin(param: Long): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_param_min == null) gdext.classes.ParticleProcessMaterial.mb_get_param_min = MethodBind.get("ParticleProcessMaterial", "get_param_min", 3903786503L)
    Ptrcall.call1[Long, Double](gdext.classes.ParticleProcessMaterial.mb_get_param_min, livePtr, param)
  }

  /** ParticleProcessMaterial.set_param_max */
  final def setParamMax(param: Long, value: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_param_max == null) gdext.classes.ParticleProcessMaterial.mb_set_param_max = MethodBind.get("ParticleProcessMaterial", "set_param_max", 2295964248L)
    Ptrcall.callVoid2(gdext.classes.ParticleProcessMaterial.mb_set_param_max, livePtr, param, value)
  }

  /** ParticleProcessMaterial.get_param_max */
  final def getParamMax(param: Long): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_param_max == null) gdext.classes.ParticleProcessMaterial.mb_get_param_max = MethodBind.get("ParticleProcessMaterial", "get_param_max", 3903786503L)
    Ptrcall.call1[Long, Double](gdext.classes.ParticleProcessMaterial.mb_get_param_max, livePtr, param)
  }

  /** ParticleProcessMaterial.set_param_texture */
  final def setParamTexture(param: Long, texture: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_param_texture == null) gdext.classes.ParticleProcessMaterial.mb_set_param_texture = MethodBind.get("ParticleProcessMaterial", "set_param_texture", 526976089L)
    Ptrcall.callVoid2(gdext.classes.ParticleProcessMaterial.mb_set_param_texture, livePtr, param, Wrappers.handle(texture))
  }

  /** ParticleProcessMaterial.get_param_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getParamTexture(param: Long): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_param_texture == null) gdext.classes.ParticleProcessMaterial.mb_get_param_texture = MethodBind.get("ParticleProcessMaterial", "get_param_texture", 3489372978L)
    Wrappers.owned[Texture2D](Ptrcall.call1[Long, Long](gdext.classes.ParticleProcessMaterial.mb_get_param_texture, livePtr, param))
  }

  /** ParticleProcessMaterial.set_color */
  final def setColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_color == null) gdext.classes.ParticleProcessMaterial.mb_set_color = MethodBind.get("ParticleProcessMaterial", "set_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_color, livePtr, color)
  }

  /** ParticleProcessMaterial.get_color */
  final def getColor(): gdext.builtin.Color = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_color == null) gdext.classes.ParticleProcessMaterial.mb_get_color = MethodBind.get("ParticleProcessMaterial", "get_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.ParticleProcessMaterial.mb_get_color, livePtr)
  }

  /** ParticleProcessMaterial.set_color_ramp */
  final def setColorRamp(ramp: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_color_ramp == null) gdext.classes.ParticleProcessMaterial.mb_set_color_ramp = MethodBind.get("ParticleProcessMaterial", "set_color_ramp", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_color_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** ParticleProcessMaterial.get_color_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorRamp(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_color_ramp == null) gdext.classes.ParticleProcessMaterial.mb_get_color_ramp = MethodBind.get("ParticleProcessMaterial", "get_color_ramp", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_color_ramp, livePtr))
  }

  /** ParticleProcessMaterial.set_alpha_curve */
  final def setAlphaCurve(curve: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_alpha_curve == null) gdext.classes.ParticleProcessMaterial.mb_set_alpha_curve = MethodBind.get("ParticleProcessMaterial", "set_alpha_curve", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_alpha_curve, livePtr, Wrappers.handle(curve))
  }

  /** ParticleProcessMaterial.get_alpha_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAlphaCurve(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_alpha_curve == null) gdext.classes.ParticleProcessMaterial.mb_get_alpha_curve = MethodBind.get("ParticleProcessMaterial", "get_alpha_curve", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_alpha_curve, livePtr))
  }

  /** ParticleProcessMaterial.set_emission_curve */
  final def setEmissionCurve(curve: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_curve == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_curve = MethodBind.get("ParticleProcessMaterial", "set_emission_curve", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_curve, livePtr, Wrappers.handle(curve))
  }

  /** ParticleProcessMaterial.get_emission_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEmissionCurve(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_curve == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_curve = MethodBind.get("ParticleProcessMaterial", "get_emission_curve", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_curve, livePtr))
  }

  /** ParticleProcessMaterial.set_color_initial_ramp */
  final def setColorInitialRamp(ramp: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_color_initial_ramp == null) gdext.classes.ParticleProcessMaterial.mb_set_color_initial_ramp = MethodBind.get("ParticleProcessMaterial", "set_color_initial_ramp", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_color_initial_ramp, livePtr, Wrappers.handle(ramp))
  }

  /** ParticleProcessMaterial.get_color_initial_ramp. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getColorInitialRamp(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_color_initial_ramp == null) gdext.classes.ParticleProcessMaterial.mb_get_color_initial_ramp = MethodBind.get("ParticleProcessMaterial", "get_color_initial_ramp", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_color_initial_ramp, livePtr))
  }

  /** ParticleProcessMaterial.set_velocity_limit_curve */
  final def setVelocityLimitCurve(curve: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_velocity_limit_curve == null) gdext.classes.ParticleProcessMaterial.mb_set_velocity_limit_curve = MethodBind.get("ParticleProcessMaterial", "set_velocity_limit_curve", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_velocity_limit_curve, livePtr, Wrappers.handle(curve))
  }

  /** ParticleProcessMaterial.get_velocity_limit_curve. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getVelocityLimitCurve(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_velocity_limit_curve == null) gdext.classes.ParticleProcessMaterial.mb_get_velocity_limit_curve = MethodBind.get("ParticleProcessMaterial", "get_velocity_limit_curve", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_velocity_limit_curve, livePtr))
  }

  /** ParticleProcessMaterial.set_particle_flag */
  final def setParticleFlag(particle_flag: Long, enable: Boolean): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_particle_flag == null) gdext.classes.ParticleProcessMaterial.mb_set_particle_flag = MethodBind.get("ParticleProcessMaterial", "set_particle_flag", 1711815571L)
    Ptrcall.callVoid2(gdext.classes.ParticleProcessMaterial.mb_set_particle_flag, livePtr, particle_flag, enable)
  }

  /** ParticleProcessMaterial.get_particle_flag */
  final def getParticleFlag(particle_flag: Long): Boolean = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_particle_flag == null) gdext.classes.ParticleProcessMaterial.mb_get_particle_flag = MethodBind.get("ParticleProcessMaterial", "get_particle_flag", 3895316907L)
    Ptrcall.call1[Long, Boolean](gdext.classes.ParticleProcessMaterial.mb_get_particle_flag, livePtr, particle_flag)
  }

  /** ParticleProcessMaterial.set_velocity_pivot */
  final def setVelocityPivot(pivot: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_velocity_pivot == null) gdext.classes.ParticleProcessMaterial.mb_set_velocity_pivot = MethodBind.get("ParticleProcessMaterial", "set_velocity_pivot", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_velocity_pivot, livePtr, pivot)
  }

  /** ParticleProcessMaterial.get_velocity_pivot */
  final def getVelocityPivot(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_velocity_pivot == null) gdext.classes.ParticleProcessMaterial.mb_get_velocity_pivot = MethodBind.get("ParticleProcessMaterial", "get_velocity_pivot", 3783033775L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_velocity_pivot, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_shape */
  final def setEmissionShape(shape: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_shape == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_shape = MethodBind.get("ParticleProcessMaterial", "set_emission_shape", 461501442L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_shape, livePtr, shape)
  }

  /** ParticleProcessMaterial.get_emission_shape */
  final def getEmissionShape(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_shape == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_shape = MethodBind.get("ParticleProcessMaterial", "get_emission_shape", 3719733018L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_shape, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_sphere_radius */
  final def setEmissionSphereRadius(radius: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_sphere_radius == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_sphere_radius = MethodBind.get("ParticleProcessMaterial", "set_emission_sphere_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_sphere_radius, livePtr, radius)
  }

  /** ParticleProcessMaterial.get_emission_sphere_radius */
  final def getEmissionSphereRadius(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_sphere_radius == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_sphere_radius = MethodBind.get("ParticleProcessMaterial", "get_emission_sphere_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_emission_sphere_radius, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_box_extents */
  final def setEmissionBoxExtents(extents: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_box_extents == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_box_extents = MethodBind.get("ParticleProcessMaterial", "set_emission_box_extents", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_box_extents, livePtr, extents)
  }

  /** ParticleProcessMaterial.get_emission_box_extents */
  final def getEmissionBoxExtents(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_box_extents == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_box_extents = MethodBind.get("ParticleProcessMaterial", "get_emission_box_extents", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_emission_box_extents, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_point_texture */
  final def setEmissionPointTexture(texture: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_point_texture == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_point_texture = MethodBind.get("ParticleProcessMaterial", "set_emission_point_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_point_texture, livePtr, Wrappers.handle(texture))
  }

  /** ParticleProcessMaterial.get_emission_point_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEmissionPointTexture(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_point_texture == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_point_texture = MethodBind.get("ParticleProcessMaterial", "get_emission_point_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_point_texture, livePtr))
  }

  /** ParticleProcessMaterial.set_emission_normal_texture */
  final def setEmissionNormalTexture(texture: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_normal_texture == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_normal_texture = MethodBind.get("ParticleProcessMaterial", "set_emission_normal_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_normal_texture, livePtr, Wrappers.handle(texture))
  }

  /** ParticleProcessMaterial.get_emission_normal_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEmissionNormalTexture(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_normal_texture == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_normal_texture = MethodBind.get("ParticleProcessMaterial", "get_emission_normal_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_normal_texture, livePtr))
  }

  /** ParticleProcessMaterial.set_emission_color_texture */
  final def setEmissionColorTexture(texture: Texture2D): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_color_texture == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_color_texture = MethodBind.get("ParticleProcessMaterial", "set_emission_color_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_color_texture, livePtr, Wrappers.handle(texture))
  }

  /** ParticleProcessMaterial.get_emission_color_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getEmissionColorTexture(): Texture2D = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_color_texture == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_color_texture = MethodBind.get("ParticleProcessMaterial", "get_emission_color_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_color_texture, livePtr))
  }

  /** ParticleProcessMaterial.set_emission_point_count */
  final def setEmissionPointCount(point_count: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_point_count == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_point_count = MethodBind.get("ParticleProcessMaterial", "set_emission_point_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_point_count, livePtr, point_count)
  }

  /** ParticleProcessMaterial.get_emission_point_count */
  final def getEmissionPointCount(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_point_count == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_point_count = MethodBind.get("ParticleProcessMaterial", "get_emission_point_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_emission_point_count, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_ring_axis */
  final def setEmissionRingAxis(axis: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_axis == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_axis = MethodBind.get("ParticleProcessMaterial", "set_emission_ring_axis", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_axis, livePtr, axis)
  }

  /** ParticleProcessMaterial.get_emission_ring_axis */
  final def getEmissionRingAxis(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_axis == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_axis = MethodBind.get("ParticleProcessMaterial", "get_emission_ring_axis", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_axis, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_ring_height */
  final def setEmissionRingHeight(height: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_height == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_height = MethodBind.get("ParticleProcessMaterial", "set_emission_ring_height", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_height, livePtr, height)
  }

  /** ParticleProcessMaterial.get_emission_ring_height */
  final def getEmissionRingHeight(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_height == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_height = MethodBind.get("ParticleProcessMaterial", "get_emission_ring_height", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_height, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_ring_radius */
  final def setEmissionRingRadius(radius: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_radius == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_radius = MethodBind.get("ParticleProcessMaterial", "set_emission_ring_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_radius, livePtr, radius)
  }

  /** ParticleProcessMaterial.get_emission_ring_radius */
  final def getEmissionRingRadius(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_radius == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_radius = MethodBind.get("ParticleProcessMaterial", "get_emission_ring_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_radius, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_ring_inner_radius */
  final def setEmissionRingInnerRadius(inner_radius: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_inner_radius == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_inner_radius = MethodBind.get("ParticleProcessMaterial", "set_emission_ring_inner_radius", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_inner_radius, livePtr, inner_radius)
  }

  /** ParticleProcessMaterial.get_emission_ring_inner_radius */
  final def getEmissionRingInnerRadius(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_inner_radius == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_inner_radius = MethodBind.get("ParticleProcessMaterial", "get_emission_ring_inner_radius", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_inner_radius, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_ring_cone_angle */
  final def setEmissionRingConeAngle(cone_angle: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_cone_angle == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_cone_angle = MethodBind.get("ParticleProcessMaterial", "set_emission_ring_cone_angle", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_ring_cone_angle, livePtr, cone_angle)
  }

  /** ParticleProcessMaterial.get_emission_ring_cone_angle */
  final def getEmissionRingConeAngle(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_cone_angle == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_cone_angle = MethodBind.get("ParticleProcessMaterial", "get_emission_ring_cone_angle", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_emission_ring_cone_angle, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_shape_offset */
  final def setEmissionShapeOffset(emission_shape_offset: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_offset == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_offset = MethodBind.get("ParticleProcessMaterial", "set_emission_shape_offset", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_offset, livePtr, emission_shape_offset)
  }

  /** ParticleProcessMaterial.get_emission_shape_offset */
  final def getEmissionShapeOffset(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_offset == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_offset = MethodBind.get("ParticleProcessMaterial", "get_emission_shape_offset", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_offset, livePtr)
  }

  /** ParticleProcessMaterial.set_emission_shape_scale */
  final def setEmissionShapeScale(emission_shape_scale: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_scale == null) gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_scale = MethodBind.get("ParticleProcessMaterial", "set_emission_shape_scale", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_emission_shape_scale, livePtr, emission_shape_scale)
  }

  /** ParticleProcessMaterial.get_emission_shape_scale */
  final def getEmissionShapeScale(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_scale == null) gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_scale = MethodBind.get("ParticleProcessMaterial", "get_emission_shape_scale", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_emission_shape_scale, livePtr)
  }

  /** ParticleProcessMaterial.get_turbulence_enabled */
  final def getTurbulenceEnabled(): Boolean = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_turbulence_enabled == null) gdext.classes.ParticleProcessMaterial.mb_get_turbulence_enabled = MethodBind.get("ParticleProcessMaterial", "get_turbulence_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ParticleProcessMaterial.mb_get_turbulence_enabled, livePtr)
  }

  /** ParticleProcessMaterial.set_turbulence_enabled */
  final def setTurbulenceEnabled(turbulence_enabled: Boolean): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_turbulence_enabled == null) gdext.classes.ParticleProcessMaterial.mb_set_turbulence_enabled = MethodBind.get("ParticleProcessMaterial", "set_turbulence_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_turbulence_enabled, livePtr, turbulence_enabled)
  }

  /** ParticleProcessMaterial.get_turbulence_noise_strength */
  final def getTurbulenceNoiseStrength(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_strength == null) gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_strength = MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_strength", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_strength, livePtr)
  }

  /** ParticleProcessMaterial.set_turbulence_noise_strength */
  final def setTurbulenceNoiseStrength(turbulence_noise_strength: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_strength == null) gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_strength = MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_strength", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_strength, livePtr, turbulence_noise_strength)
  }

  /** ParticleProcessMaterial.get_turbulence_noise_scale */
  final def getTurbulenceNoiseScale(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_scale == null) gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_scale = MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_scale, livePtr)
  }

  /** ParticleProcessMaterial.set_turbulence_noise_scale */
  final def setTurbulenceNoiseScale(turbulence_noise_scale: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_scale == null) gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_scale = MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_scale, livePtr, turbulence_noise_scale)
  }

  /** ParticleProcessMaterial.get_turbulence_noise_speed_random */
  final def getTurbulenceNoiseSpeedRandom(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed_random == null) gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed_random = MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_speed_random", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed_random, livePtr)
  }

  /** ParticleProcessMaterial.set_turbulence_noise_speed_random */
  final def setTurbulenceNoiseSpeedRandom(turbulence_noise_speed_random: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed_random == null) gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed_random = MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_speed_random", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed_random, livePtr, turbulence_noise_speed_random)
  }

  /** ParticleProcessMaterial.get_turbulence_noise_speed */
  final def getTurbulenceNoiseSpeed(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed == null) gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed = MethodBind.get("ParticleProcessMaterial", "get_turbulence_noise_speed", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_turbulence_noise_speed, livePtr)
  }

  /** ParticleProcessMaterial.set_turbulence_noise_speed */
  final def setTurbulenceNoiseSpeed(turbulence_noise_speed: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed == null) gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed = MethodBind.get("ParticleProcessMaterial", "set_turbulence_noise_speed", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_turbulence_noise_speed, livePtr, turbulence_noise_speed)
  }

  /** ParticleProcessMaterial.get_gravity */
  final def getGravity(): gdext.builtin.Vector3 = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_gravity == null) gdext.classes.ParticleProcessMaterial.mb_get_gravity = MethodBind.get("ParticleProcessMaterial", "get_gravity", 3360562783L)
    Ptrcall.call0[gdext.builtin.Vector3](gdext.classes.ParticleProcessMaterial.mb_get_gravity, livePtr)
  }

  /** ParticleProcessMaterial.set_gravity */
  final def setGravity(accel_vec: gdext.builtin.Vector3): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_gravity == null) gdext.classes.ParticleProcessMaterial.mb_set_gravity = MethodBind.get("ParticleProcessMaterial", "set_gravity", 3460891852L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_gravity, livePtr, accel_vec)
  }

  /** ParticleProcessMaterial.set_lifetime_randomness */
  final def setLifetimeRandomness(randomness: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_lifetime_randomness == null) gdext.classes.ParticleProcessMaterial.mb_set_lifetime_randomness = MethodBind.get("ParticleProcessMaterial", "set_lifetime_randomness", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_lifetime_randomness, livePtr, randomness)
  }

  /** ParticleProcessMaterial.get_lifetime_randomness */
  final def getLifetimeRandomness(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_lifetime_randomness == null) gdext.classes.ParticleProcessMaterial.mb_get_lifetime_randomness = MethodBind.get("ParticleProcessMaterial", "get_lifetime_randomness", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_lifetime_randomness, livePtr)
  }

  /** ParticleProcessMaterial.get_sub_emitter_mode */
  final def getSubEmitterMode(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_mode == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_mode = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_mode", 2399052877L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_mode, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_mode */
  final def setSubEmitterMode(mode: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_mode == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_mode = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_mode", 2161806672L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_mode, livePtr, mode)
  }

  /** ParticleProcessMaterial.get_sub_emitter_frequency */
  final def getSubEmitterFrequency(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_frequency == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_frequency = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_frequency", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_frequency, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_frequency */
  final def setSubEmitterFrequency(hz: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_frequency == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_frequency = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_frequency", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_frequency, livePtr, hz)
  }

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_end */
  final def getSubEmitterAmountAtEnd(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_end == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_end = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_end", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_end, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_end */
  final def setSubEmitterAmountAtEnd(amount: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_end == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_end = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_end", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_end, livePtr, amount)
  }

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_collision */
  final def getSubEmitterAmountAtCollision(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_collision == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_collision = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_collision", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_collision, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_collision */
  final def setSubEmitterAmountAtCollision(amount: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_collision == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_collision = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_collision", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_collision, livePtr, amount)
  }

  /** ParticleProcessMaterial.get_sub_emitter_amount_at_start */
  final def getSubEmitterAmountAtStart(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_start == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_start = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_amount_at_start", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_amount_at_start, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_amount_at_start */
  final def setSubEmitterAmountAtStart(amount: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_start == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_start = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_amount_at_start", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_amount_at_start, livePtr, amount)
  }

  /** ParticleProcessMaterial.get_sub_emitter_keep_velocity */
  final def getSubEmitterKeepVelocity(): Boolean = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_keep_velocity == null) gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_keep_velocity = MethodBind.get("ParticleProcessMaterial", "get_sub_emitter_keep_velocity", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ParticleProcessMaterial.mb_get_sub_emitter_keep_velocity, livePtr)
  }

  /** ParticleProcessMaterial.set_sub_emitter_keep_velocity */
  final def setSubEmitterKeepVelocity(enable: Boolean): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_keep_velocity == null) gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_keep_velocity = MethodBind.get("ParticleProcessMaterial", "set_sub_emitter_keep_velocity", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_sub_emitter_keep_velocity, livePtr, enable)
  }

  /** ParticleProcessMaterial.set_attractor_interaction_enabled */
  final def setAttractorInteractionEnabled(enabled: Boolean): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_attractor_interaction_enabled == null) gdext.classes.ParticleProcessMaterial.mb_set_attractor_interaction_enabled = MethodBind.get("ParticleProcessMaterial", "set_attractor_interaction_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_attractor_interaction_enabled, livePtr, enabled)
  }

  /** ParticleProcessMaterial.is_attractor_interaction_enabled */
  final def isAttractorInteractionEnabled(): Boolean = {
    if (gdext.classes.ParticleProcessMaterial.mb_is_attractor_interaction_enabled == null) gdext.classes.ParticleProcessMaterial.mb_is_attractor_interaction_enabled = MethodBind.get("ParticleProcessMaterial", "is_attractor_interaction_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ParticleProcessMaterial.mb_is_attractor_interaction_enabled, livePtr)
  }

  /** ParticleProcessMaterial.set_collision_mode */
  final def setCollisionMode(mode: Long): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_collision_mode == null) gdext.classes.ParticleProcessMaterial.mb_set_collision_mode = MethodBind.get("ParticleProcessMaterial", "set_collision_mode", 653804659L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_collision_mode, livePtr, mode)
  }

  /** ParticleProcessMaterial.get_collision_mode */
  final def getCollisionMode(): Long = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_collision_mode == null) gdext.classes.ParticleProcessMaterial.mb_get_collision_mode = MethodBind.get("ParticleProcessMaterial", "get_collision_mode", 139371864L)
    Ptrcall.call0[Long](gdext.classes.ParticleProcessMaterial.mb_get_collision_mode, livePtr)
  }

  /** ParticleProcessMaterial.set_collision_use_scale */
  final def setCollisionUseScale(radius: Boolean): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_collision_use_scale == null) gdext.classes.ParticleProcessMaterial.mb_set_collision_use_scale = MethodBind.get("ParticleProcessMaterial", "set_collision_use_scale", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_collision_use_scale, livePtr, radius)
  }

  /** ParticleProcessMaterial.is_collision_using_scale */
  final def isCollisionUsingScale(): Boolean = {
    if (gdext.classes.ParticleProcessMaterial.mb_is_collision_using_scale == null) gdext.classes.ParticleProcessMaterial.mb_is_collision_using_scale = MethodBind.get("ParticleProcessMaterial", "is_collision_using_scale", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.ParticleProcessMaterial.mb_is_collision_using_scale, livePtr)
  }

  /** ParticleProcessMaterial.set_collision_friction */
  final def setCollisionFriction(friction: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_collision_friction == null) gdext.classes.ParticleProcessMaterial.mb_set_collision_friction = MethodBind.get("ParticleProcessMaterial", "set_collision_friction", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_collision_friction, livePtr, friction)
  }

  /** ParticleProcessMaterial.get_collision_friction */
  final def getCollisionFriction(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_collision_friction == null) gdext.classes.ParticleProcessMaterial.mb_get_collision_friction = MethodBind.get("ParticleProcessMaterial", "get_collision_friction", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_collision_friction, livePtr)
  }

  /** ParticleProcessMaterial.set_collision_bounce */
  final def setCollisionBounce(bounce: Double): Unit = {
    if (gdext.classes.ParticleProcessMaterial.mb_set_collision_bounce == null) gdext.classes.ParticleProcessMaterial.mb_set_collision_bounce = MethodBind.get("ParticleProcessMaterial", "set_collision_bounce", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ParticleProcessMaterial.mb_set_collision_bounce, livePtr, bounce)
  }

  /** ParticleProcessMaterial.get_collision_bounce */
  final def getCollisionBounce(): Double = {
    if (gdext.classes.ParticleProcessMaterial.mb_get_collision_bounce == null) gdext.classes.ParticleProcessMaterial.mb_get_collision_bounce = MethodBind.get("ParticleProcessMaterial", "get_collision_bounce", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.ParticleProcessMaterial.mb_get_collision_bounce, livePtr)
  }

}

object ParticleProcessMaterial {
  private[classes] var mb_set_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_inherit_velocity_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_inherit_velocity_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_spread: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flatness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flatness: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_min: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_max: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_param_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_param_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_alpha_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_alpha_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_initial_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_initial_ramp: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity_limit_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity_limit_curve: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_particle_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_particle_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_velocity_pivot: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_velocity_pivot: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_shape: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_sphere_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_sphere_radius: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_box_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_box_extents: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_point_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_point_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_normal_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_normal_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_color_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_color_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_point_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_point_count: GDExtensionMethodBindPtr = null
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
  private[classes] var mb_set_emission_shape_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_shape_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_emission_shape_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_emission_shape_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbulence_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbulence_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbulence_noise_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbulence_noise_strength: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbulence_noise_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbulence_noise_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbulence_noise_speed_random: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbulence_noise_speed_random: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_turbulence_noise_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_turbulence_noise_speed: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_gravity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_lifetime_randomness: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_frequency: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_amount_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_amount_at_end: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_amount_at_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_amount_at_collision: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_amount_at_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_amount_at_start: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sub_emitter_keep_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sub_emitter_keep_velocity: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_attractor_interaction_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_attractor_interaction_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_use_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_collision_using_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_friction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_collision_bounce: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_collision_bounce: GDExtensionMethodBindPtr = null
}
