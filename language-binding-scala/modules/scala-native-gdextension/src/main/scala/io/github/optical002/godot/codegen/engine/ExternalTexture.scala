package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `ExternalTexture`, extends `Texture2D`. */
abstract class ExternalTexture extends Texture2D {

  /** ExternalTexture.set_size */
  final def setSize(size: io.github.optical002.godot.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("ExternalTexture", "set_size", 743155724L), hostObject.objectPtr, size)

  /** ExternalTexture.get_external_texture_id */
  final def getExternalTextureId(): Long =
    Ptrcall.call0[Long](MethodBind.get("ExternalTexture", "get_external_texture_id", 3905245786L), hostObject.objectPtr)

  /** ExternalTexture.set_external_buffer_id */
  final def setExternalBufferId(external_buffer_id: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ExternalTexture", "set_external_buffer_id", 1286410249L), hostObject.objectPtr, external_buffer_id)

}

object ExternalTexture {
  /** Class metadata for Gd[ExternalTexture] lifetime management and casting. */
  given GodotClass[ExternalTexture] with {
    def className = "ExternalTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): ExternalTexture = new ExternalTexture {}.withHost(o.objectPtr)
    def unwrap(t: ExternalTexture): GodotObject = t.hostObject
  }
}
