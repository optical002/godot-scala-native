package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationBaseHeader`, extends `RefCounted`. */
abstract class OpenXRSpatialCapabilityConfigurationBaseHeader extends RefCounted {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationBaseHeader"

  /** OpenXRSpatialCapabilityConfigurationBaseHeader.has_valid_configuration */
  final def hasValidConfiguration(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRSpatialCapabilityConfigurationBaseHeader", "has_valid_configuration", 36873697L), hostObject.objectPtr)

}
