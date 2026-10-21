package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRSpatialCapabilityConfigurationBaseHeader`, extends `RefCounted`. */
abstract class OpenXRSpatialCapabilityConfigurationBaseHeader extends RefCounted {
  override def godotClassName: String = "OpenXRSpatialCapabilityConfigurationBaseHeader"

  /** OpenXRSpatialCapabilityConfigurationBaseHeader.has_valid_configuration */
  final def hasValidConfiguration(): Boolean = {
    if (gdext.classes.OpenXRSpatialCapabilityConfigurationBaseHeader.mb_has_valid_configuration == null) gdext.classes.OpenXRSpatialCapabilityConfigurationBaseHeader.mb_has_valid_configuration = MethodBind.get("OpenXRSpatialCapabilityConfigurationBaseHeader", "has_valid_configuration", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRSpatialCapabilityConfigurationBaseHeader.mb_has_valid_configuration, livePtr)
  }

}

object OpenXRSpatialCapabilityConfigurationBaseHeader {
  private[classes] var mb_has_valid_configuration: GDExtensionMethodBindPtr = null
}
