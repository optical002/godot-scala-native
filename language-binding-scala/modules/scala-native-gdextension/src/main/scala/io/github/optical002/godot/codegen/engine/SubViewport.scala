package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `SubViewport`, extends `Viewport`. */
abstract class SubViewport extends Viewport {

  /** SubViewport.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewport", "set_size", 1130785943L), hostObject.objectPtr, size)

  /** SubViewport.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector2i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2i](MethodBind.get("SubViewport", "get_size", 3690982128L), hostObject.objectPtr)

  /** SubViewport.set_size_2d_override */
  final def setSize2dOverride(size: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewport", "set_size_2d_override", 1130785943L), hostObject.objectPtr, size)

  /** SubViewport.get_size_2d_override */
  final def getSize2dOverride(): io.github.optical002.godot.builtin.Vector2i =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2i](MethodBind.get("SubViewport", "get_size_2d_override", 3690982128L), hostObject.objectPtr)

  /** SubViewport.set_size_2d_override_stretch */
  final def setSize2dOverrideStretch(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewport", "set_size_2d_override_stretch", 2586408642L), hostObject.objectPtr, enable)

  /** SubViewport.is_size_2d_override_stretch_enabled */
  final def isSize2dOverrideStretchEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("SubViewport", "is_size_2d_override_stretch_enabled", 36873697L), hostObject.objectPtr)

  /** SubViewport.set_update_mode */
  final def setUpdateMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewport", "set_update_mode", 1295690030L), hostObject.objectPtr, mode)

  /** SubViewport.get_update_mode */
  final def getUpdateMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SubViewport", "get_update_mode", 2980171553L), hostObject.objectPtr)

  /** SubViewport.set_clear_mode */
  final def setClearMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("SubViewport", "set_clear_mode", 2834454712L), hostObject.objectPtr, mode)

  /** SubViewport.get_clear_mode */
  final def getClearMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("SubViewport", "get_clear_mode", 331324495L), hostObject.objectPtr)

}

object SubViewport {
  /** Class metadata for Gd[SubViewport] lifetime management and casting. */
  given GodotClass[SubViewport] with {
    def className = "SubViewport"
    def isRefCounted = false
    def wrap(o: GodotObject): SubViewport = new SubViewport {}.withHost(o.objectPtr)
    def unwrap(t: SubViewport): GodotObject = t.hostObject
  }
}
