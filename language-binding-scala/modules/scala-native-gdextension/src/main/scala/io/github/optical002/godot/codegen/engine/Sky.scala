package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Sky`, extends `Resource`. */
abstract class Sky extends Resource {

  /** Sky.set_radiance_size */
  final def setRadianceSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sky", "set_radiance_size", 1512957179L), hostObject.objectPtr, size)

  /** Sky.get_radiance_size */
  final def getRadianceSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sky", "get_radiance_size", 2708733976L), hostObject.objectPtr)

  /** Sky.set_process_mode */
  final def setProcessMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sky", "set_process_mode", 875986769L), hostObject.objectPtr, mode)

  /** Sky.get_process_mode */
  final def getProcessMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Sky", "get_process_mode", 731245043L), hostObject.objectPtr)

  /** Sky.set_material */
  final def setMaterial(material: Material): Unit =
    Ptrcall.callVoid1(MethodBind.get("Sky", "set_material", 2757459619L), hostObject.objectPtr, material.hostObject)

  /** Sky.get_material */
  final def getMaterial(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Sky", "get_material", 5934680L), hostObject.objectPtr)

}

object Sky {
  /** Class metadata for Gd[Sky] lifetime management and casting. */
  given GodotClass[Sky] with {
    def className = "Sky"
    def isRefCounted = true
    def wrap(o: GodotObject): Sky = new Sky {}.withHost(o.objectPtr)
    def unwrap(t: Sky): GodotObject = t.hostObject
  }
}
