package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRFrameSynthesisExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRFrameSynthesisExtension extends OpenXRExtensionWrapper {

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

object OpenXRFrameSynthesisExtension {
  /** Class metadata for Gd[OpenXRFrameSynthesisExtension] lifetime management and casting. */
  given GodotClass[OpenXRFrameSynthesisExtension] with {
    def className = "OpenXRFrameSynthesisExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRFrameSynthesisExtension = new OpenXRFrameSynthesisExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRFrameSynthesisExtension): GodotObject = t.hostObject
  }
}
