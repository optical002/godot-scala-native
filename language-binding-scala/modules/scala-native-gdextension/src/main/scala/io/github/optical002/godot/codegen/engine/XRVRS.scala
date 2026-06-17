package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `XRVRS`, extends `Object`. */
abstract class XRVRS extends Object {

  /** XRVRS.get_vrs_min_radius */
  final def getVrsMinRadius(): Double =
    Ptrcall.call0[Double](MethodBind.get("XRVRS", "get_vrs_min_radius", 1740695150L), hostObject.objectPtr)

  /** XRVRS.set_vrs_min_radius */
  final def setVrsMinRadius(radius: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRVRS", "set_vrs_min_radius", 373806689L), hostObject.objectPtr, radius)

  /** XRVRS.get_vrs_strength */
  final def getVrsStrength(): Double =
    Ptrcall.call0[Double](MethodBind.get("XRVRS", "get_vrs_strength", 1740695150L), hostObject.objectPtr)

  /** XRVRS.set_vrs_strength */
  final def setVrsStrength(strength: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRVRS", "set_vrs_strength", 373806689L), hostObject.objectPtr, strength)

  /** XRVRS.get_vrs_render_region */
  final def getVrsRenderRegion(): io.github.optical002.godot.builtin.Rect2i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2i](MethodBind.get("XRVRS", "get_vrs_render_region", 410525958L), hostObject.objectPtr)

  /** XRVRS.set_vrs_render_region */
  final def setVrsRenderRegion(render_region: io.github.optical002.godot.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("XRVRS", "set_vrs_render_region", 1763793166L), hostObject.objectPtr, render_region)

}

object XRVRS {
  /** Class metadata for Gd[XRVRS] lifetime management and casting. */
  given GodotClass[XRVRS] with {
    def className = "XRVRS"
    def isRefCounted = false
    def wrap(o: GodotObject): XRVRS = new XRVRS {}.withHost(o.objectPtr)
    def unwrap(t: XRVRS): GodotObject = t.hostObject
  }
}
