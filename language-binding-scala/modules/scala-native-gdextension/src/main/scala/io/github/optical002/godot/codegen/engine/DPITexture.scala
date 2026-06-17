package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `DPITexture`, extends `Texture2D`. */
abstract class DPITexture extends Texture2D {

  /** DPITexture.set_source */
  final def setSource(source: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("DPITexture", "set_source", 83702148L), hostObject.objectPtr, source)

  /** DPITexture.get_source */
  final def getSource(): String =
    Ptrcall.call0[String](MethodBind.get("DPITexture", "get_source", 201670096L), hostObject.objectPtr)

  /** DPITexture.set_base_scale */
  final def setBaseScale(base_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DPITexture", "set_base_scale", 373806689L), hostObject.objectPtr, base_scale)

  /** DPITexture.get_base_scale */
  final def getBaseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("DPITexture", "get_base_scale", 1740695150L), hostObject.objectPtr)

  /** DPITexture.set_saturation */
  final def setSaturation(saturation: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("DPITexture", "set_saturation", 373806689L), hostObject.objectPtr, saturation)

  /** DPITexture.get_saturation */
  final def getSaturation(): Double =
    Ptrcall.call0[Double](MethodBind.get("DPITexture", "get_saturation", 1740695150L), hostObject.objectPtr)

  /** DPITexture.set_size_override */
  final def setSizeOverride(size: io.github.optical002.godot.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("DPITexture", "set_size_override", 1130785943L), hostObject.objectPtr, size)

}

object DPITexture {
  /** Class metadata for Gd[DPITexture] lifetime management and casting. */
  given GodotClass[DPITexture] with {
    def className = "DPITexture"
    def isRefCounted = true
    def wrap(o: GodotObject): DPITexture = new DPITexture {}.withHost(o.objectPtr)
    def unwrap(t: DPITexture): GodotObject = t.hostObject
  }
}
