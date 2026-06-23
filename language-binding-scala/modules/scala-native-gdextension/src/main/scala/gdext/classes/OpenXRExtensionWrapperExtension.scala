package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRExtensionWrapperExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRExtensionWrapperExtension extends OpenXRExtensionWrapper {

}

object OpenXRExtensionWrapperExtension {
  /** Class metadata for Gd[OpenXRExtensionWrapperExtension] lifetime management and casting. */
  given GodotClass[OpenXRExtensionWrapperExtension] with {
    def className = "OpenXRExtensionWrapperExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRExtensionWrapperExtension = new OpenXRExtensionWrapperExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRExtensionWrapperExtension): GodotObject = t.hostObject
  }
}
