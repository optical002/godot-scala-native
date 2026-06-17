package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `GPUParticles2D`, extends `Node2D`. */
abstract class GPUParticles2D extends Node2D {

  /** GPUParticles2D.set_emitting */
  final def setEmitting(emitting: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_emitting", 2586408642L), hostObject.objectPtr, emitting)

  /** GPUParticles2D.set_amount */
  final def setAmount(amount: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_amount", 1286410249L), hostObject.objectPtr, amount)

  /** GPUParticles2D.set_lifetime */
  final def setLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles2D.set_one_shot */
  final def setOneShot(secs: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_one_shot", 2586408642L), hostObject.objectPtr, secs)

  /** GPUParticles2D.set_pre_process_time */
  final def setPreProcessTime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_pre_process_time", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles2D.set_explosiveness_ratio */
  final def setExplosivenessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_explosiveness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles2D.set_randomness_ratio */
  final def setRandomnessRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_randomness_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles2D.set_visibility_rect */
  final def setVisibilityRect(visibility_rect: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_visibility_rect", 2046264180L), hostObject.objectPtr, visibility_rect)

  /** GPUParticles2D.set_use_local_coordinates */
  final def setUseLocalCoordinates(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_use_local_coordinates", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles2D.set_fixed_fps */
  final def setFixedFps(fps: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_fixed_fps", 1286410249L), hostObject.objectPtr, fps)

  /** GPUParticles2D.set_fractional_delta */
  final def setFractionalDelta(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_fractional_delta", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles2D.set_interpolate */
  final def setInterpolate(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_interpolate", 2586408642L), hostObject.objectPtr, enable)

  /** GPUParticles2D.set_process_material */
  final def setProcessMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_process_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** GPUParticles2D.set_speed_scale */
  final def setSpeedScale(scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_speed_scale", 373806689L), hostObject.objectPtr, scale)

  /** GPUParticles2D.set_collision_base_size */
  final def setCollisionBaseSize(size: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_collision_base_size", 373806689L), hostObject.objectPtr, size)

  /** GPUParticles2D.set_interp_to_end */
  final def setInterpToEnd(interp: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_interp_to_end", 373806689L), hostObject.objectPtr, interp)

  /** GPUParticles2D.request_particles_process */
  final def requestParticlesProcess(process_time: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "request_particles_process", 373806689L), hostObject.objectPtr, process_time)

  /** GPUParticles2D.is_emitting */
  final def isEmitting(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "is_emitting", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_amount */
  final def getAmount(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_amount", 3905245786L), hostObject.objectPtr)

  /** GPUParticles2D.get_lifetime */
  final def getLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_lifetime", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_one_shot */
  final def getOneShot(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "get_one_shot", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_pre_process_time */
  final def getPreProcessTime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_pre_process_time", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_explosiveness_ratio */
  final def getExplosivenessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_explosiveness_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_randomness_ratio */
  final def getRandomnessRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_randomness_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_visibility_rect */
  final def getVisibilityRect(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("GPUParticles2D", "get_visibility_rect", 1639390495L), hostObject.objectPtr)

  /** GPUParticles2D.get_use_local_coordinates */
  final def getUseLocalCoordinates(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "get_use_local_coordinates", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_fixed_fps */
  final def getFixedFps(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_fixed_fps", 3905245786L), hostObject.objectPtr)

  /** GPUParticles2D.get_fractional_delta */
  final def getFractionalDelta(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "get_fractional_delta", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_interpolate */
  final def getInterpolate(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "get_interpolate", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_process_material */
  final def getProcessMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticles2D", "get_process_material", 5934680L), hostObject.objectPtr)

  /** GPUParticles2D.get_speed_scale */
  final def getSpeedScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_speed_scale", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_collision_base_size */
  final def getCollisionBaseSize(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_collision_base_size", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.get_interp_to_end */
  final def getInterpToEnd(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_interp_to_end", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.set_draw_order */
  final def setDrawOrder(order: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_draw_order", 1939677959L), hostObject.objectPtr, order)

  /** GPUParticles2D.get_draw_order */
  final def getDrawOrder(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_draw_order", 941479095L), hostObject.objectPtr)

  /** GPUParticles2D.set_texture */
  final def setTexture(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_texture", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** GPUParticles2D.get_texture */
  final def getTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("GPUParticles2D", "get_texture", 3635182373L), hostObject.objectPtr)

  /** GPUParticles2D.capture_rect */
  final def captureRect(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("GPUParticles2D", "capture_rect", 1639390495L), hostObject.objectPtr)

  /** GPUParticles2D.restart */
  final def restart(keep_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "restart", 107499316L), hostObject.objectPtr, keep_seed)

  /** GPUParticles2D.emit_particle */
  final def emitParticle(xform: io.github.optical002.godot.builtin.Transform2D, velocity: io.github.optical002.godot.builtin.Vector2, color: io.github.optical002.godot.builtin.Color, custom: io.github.optical002.godot.builtin.Color, flags: Long): Unit =
    Ptrcall.callVoid5(MethodBind.get("GPUParticles2D", "emit_particle", 2179202058L), hostObject.objectPtr, xform, velocity, color, custom, flags)

  /** GPUParticles2D.set_trail_enabled */
  final def setTrailEnabled(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_trail_enabled", 2586408642L), hostObject.objectPtr, enabled)

  /** GPUParticles2D.set_trail_lifetime */
  final def setTrailLifetime(secs: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_trail_lifetime", 373806689L), hostObject.objectPtr, secs)

  /** GPUParticles2D.is_trail_enabled */
  final def isTrailEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "is_trail_enabled", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.get_trail_lifetime */
  final def getTrailLifetime(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_trail_lifetime", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.set_trail_sections */
  final def setTrailSections(sections: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_trail_sections", 1286410249L), hostObject.objectPtr, sections)

  /** GPUParticles2D.get_trail_sections */
  final def getTrailSections(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_trail_sections", 3905245786L), hostObject.objectPtr)

  /** GPUParticles2D.set_trail_section_subdivisions */
  final def setTrailSectionSubdivisions(subdivisions: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_trail_section_subdivisions", 1286410249L), hostObject.objectPtr, subdivisions)

  /** GPUParticles2D.get_trail_section_subdivisions */
  final def getTrailSectionSubdivisions(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_trail_section_subdivisions", 3905245786L), hostObject.objectPtr)

  /** GPUParticles2D.convert_from_particles */
  final def convertFromParticles(particles: Node): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "convert_from_particles", 1078189570L), hostObject.objectPtr, particles.hostObject)

  /** GPUParticles2D.set_amount_ratio */
  final def setAmountRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_amount_ratio", 373806689L), hostObject.objectPtr, ratio)

  /** GPUParticles2D.get_amount_ratio */
  final def getAmountRatio(): Double =
    Ptrcall.call0[Double](MethodBind.get("GPUParticles2D", "get_amount_ratio", 1740695150L), hostObject.objectPtr)

  /** GPUParticles2D.set_use_fixed_seed */
  final def setUseFixedSeed(use_fixed_seed: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_use_fixed_seed", 2586408642L), hostObject.objectPtr, use_fixed_seed)

  /** GPUParticles2D.get_use_fixed_seed */
  final def getUseFixedSeed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("GPUParticles2D", "get_use_fixed_seed", 36873697L), hostObject.objectPtr)

  /** GPUParticles2D.set_seed */
  final def setSeed(seed: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("GPUParticles2D", "set_seed", 1286410249L), hostObject.objectPtr, seed)

  /** GPUParticles2D.get_seed */
  final def getSeed(): Long =
    Ptrcall.call0[Long](MethodBind.get("GPUParticles2D", "get_seed", 3905245786L), hostObject.objectPtr)

}

object GPUParticles2D {
  /** Class metadata for Gd[GPUParticles2D] lifetime management and casting. */
  given GodotClass[GPUParticles2D] with {
    def className = "GPUParticles2D"
    def isRefCounted = false
    def wrap(o: GodotObject): GPUParticles2D = new GPUParticles2D {}.withHost(o.objectPtr)
    def unwrap(t: GPUParticles2D): GodotObject = t.hostObject
  }
}
