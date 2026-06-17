package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `Texture2D`, extends `Texture`. */
abstract class Texture2D extends Texture {

  /** Texture2D.get_width */
  final def getWidth(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture2D", "get_width", 3905245786L), hostObject.objectPtr)

  /** Texture2D.get_height */
  final def getHeight(): Long =
    Ptrcall.call0[Long](MethodBind.get("Texture2D", "get_height", 3905245786L), hostObject.objectPtr)

  /** Texture2D.get_size */
  final def getSize(): io.github.optical002.godot.builtin.Vector2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Vector2](MethodBind.get("Texture2D", "get_size", 3341600327L), hostObject.objectPtr)

  /** Texture2D.has_alpha */
  final def hasAlpha(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Texture2D", "has_alpha", 36873697L), hostObject.objectPtr)

  /** Texture2D.get_image */
  final def getImage(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2D", "get_image", 4190603485L), hostObject.objectPtr)

  /** Texture2D.create_placeholder */
  final def createPlaceholder(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Texture2D", "create_placeholder", 121922552L), hostObject.objectPtr)

}

object Texture2D {
  /** Class metadata for Gd[Texture2D] lifetime management and casting. */
  given GodotClass[Texture2D] with {
    def className = "Texture2D"
    def isRefCounted = true
    def wrap(o: GodotObject): Texture2D = new Texture2D {}.withHost(o.objectPtr)
    def unwrap(t: Texture2D): GodotObject = t.hostObject
  }
}
