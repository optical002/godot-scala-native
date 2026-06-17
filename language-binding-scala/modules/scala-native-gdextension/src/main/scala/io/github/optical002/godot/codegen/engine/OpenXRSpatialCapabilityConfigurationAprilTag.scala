package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationAprilTag`, extends `OpenXRSpatialCapabilityConfigurationBaseHeader`. */
abstract class OpenXRSpatialCapabilityConfigurationAprilTag extends OpenXRSpatialCapabilityConfigurationBaseHeader {

  /** OpenXRSpatialCapabilityConfigurationAprilTag.set_april_dict */
  final def setAprilDict(april_dict: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "set_april_dict", 3902905799L), hostObject.objectPtr, april_dict)

  /** OpenXRSpatialCapabilityConfigurationAprilTag.get_april_dict */
  final def getAprilDict(): Long =
    Ptrcall.call0[Long](MethodBind.get("OpenXRSpatialCapabilityConfigurationAprilTag", "get_april_dict", 440273016L), hostObject.objectPtr)

}

object OpenXRSpatialCapabilityConfigurationAprilTag {
  /** Class metadata for Gd[OpenXRSpatialCapabilityConfigurationAprilTag] lifetime management and casting. */
  given GodotClass[OpenXRSpatialCapabilityConfigurationAprilTag] with {
    def className = "OpenXRSpatialCapabilityConfigurationAprilTag"
    def isRefCounted = true
    def wrap(o: GodotObject): OpenXRSpatialCapabilityConfigurationAprilTag = new OpenXRSpatialCapabilityConfigurationAprilTag {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRSpatialCapabilityConfigurationAprilTag): GodotObject = t.hostObject
  }
}
