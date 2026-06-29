package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRFrameSynthesisExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRFrameSynthesisExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRFrameSynthesisExtension"

  /** OpenXRFrameSynthesisExtension.is_available */
  final def isAvailable(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRFrameSynthesisExtension", "is_available", 36873697L), hostObject.objectPtr)

  /** OpenXRFrameSynthesisExtension.is_enabled */
  final def isEnabled(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRFrameSynthesisExtension", "is_enabled", 36873697L), hostObject.objectPtr)

  /** OpenXRFrameSynthesisExtension.set_enabled */
  final def setEnabled(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRFrameSynthesisExtension", "set_enabled", 2586408642L), hostObject.objectPtr, enable)

  /** OpenXRFrameSynthesisExtension.get_relax_frame_interval */
  final def getRelaxFrameInterval(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("OpenXRFrameSynthesisExtension", "get_relax_frame_interval", 36873697L), hostObject.objectPtr)

  /** OpenXRFrameSynthesisExtension.set_relax_frame_interval */
  final def setRelaxFrameInterval(relax_frame_interval: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("OpenXRFrameSynthesisExtension", "set_relax_frame_interval", 2586408642L), hostObject.objectPtr, relax_frame_interval)

  /** OpenXRFrameSynthesisExtension.skip_next_frame */
  final def skipNextFrame(): Unit =
    Ptrcall.callVoid0(MethodBind.get("OpenXRFrameSynthesisExtension", "skip_next_frame", 3218959716L), hostObject.objectPtr)

}
