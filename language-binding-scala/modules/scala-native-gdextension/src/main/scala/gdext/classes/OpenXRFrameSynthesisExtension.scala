package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRFrameSynthesisExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRFrameSynthesisExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRFrameSynthesisExtension"

  /** OpenXRFrameSynthesisExtension.is_available */
  final def isAvailable(): Boolean = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_is_available == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_is_available = MethodBind.get("OpenXRFrameSynthesisExtension", "is_available", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRFrameSynthesisExtension.mb_is_available, livePtr)
  }

  /** OpenXRFrameSynthesisExtension.is_enabled */
  final def isEnabled(): Boolean = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_is_enabled == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_is_enabled = MethodBind.get("OpenXRFrameSynthesisExtension", "is_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRFrameSynthesisExtension.mb_is_enabled, livePtr)
  }

  /** OpenXRFrameSynthesisExtension.set_enabled */
  final def setEnabled(enable: Boolean): Unit = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_set_enabled == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_set_enabled = MethodBind.get("OpenXRFrameSynthesisExtension", "set_enabled", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRFrameSynthesisExtension.mb_set_enabled, livePtr, enable)
  }

  /** OpenXRFrameSynthesisExtension.get_relax_frame_interval */
  final def getRelaxFrameInterval(): Boolean = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_get_relax_frame_interval == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_get_relax_frame_interval = MethodBind.get("OpenXRFrameSynthesisExtension", "get_relax_frame_interval", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.OpenXRFrameSynthesisExtension.mb_get_relax_frame_interval, livePtr)
  }

  /** OpenXRFrameSynthesisExtension.set_relax_frame_interval */
  final def setRelaxFrameInterval(relaxFrameInterval: Boolean): Unit = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_set_relax_frame_interval == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_set_relax_frame_interval = MethodBind.get("OpenXRFrameSynthesisExtension", "set_relax_frame_interval", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.OpenXRFrameSynthesisExtension.mb_set_relax_frame_interval, livePtr, relaxFrameInterval)
  }

  /** OpenXRFrameSynthesisExtension.skip_next_frame */
  final def skipNextFrame(): Unit = {
    if (gdext.classes.OpenXRFrameSynthesisExtension.mb_skip_next_frame == null) gdext.classes.OpenXRFrameSynthesisExtension.mb_skip_next_frame = MethodBind.get("OpenXRFrameSynthesisExtension", "skip_next_frame", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.OpenXRFrameSynthesisExtension.mb_skip_next_frame, livePtr)
  }

}

object OpenXRFrameSynthesisExtension {
  private[classes] var mb_is_available: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_relax_frame_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_relax_frame_interval: GDExtensionMethodBindPtr = null
  private[classes] var mb_skip_next_frame: GDExtensionMethodBindPtr = null
}
