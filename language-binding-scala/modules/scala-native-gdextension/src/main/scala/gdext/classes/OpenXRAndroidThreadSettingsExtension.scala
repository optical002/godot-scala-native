package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `OpenXRAndroidThreadSettingsExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRAndroidThreadSettingsExtension extends OpenXRExtensionWrapper {

  /** OpenXRAndroidThreadSettingsExtension.set_application_thread_type */
  final def setApplicationThreadType(thread_type: Long, thread_id: Long): Boolean =
    Ptrcall.call2[Long, Long, Boolean](MethodBind.get("OpenXRAndroidThreadSettingsExtension", "set_application_thread_type", 1558751158L), hostObject.objectPtr, thread_type, thread_id)

}

object OpenXRAndroidThreadSettingsExtension {
  /** Class metadata for Gd[OpenXRAndroidThreadSettingsExtension] lifetime management and casting. */
  given GodotClass[OpenXRAndroidThreadSettingsExtension] with {
    def className = "OpenXRAndroidThreadSettingsExtension"
    def isRefCounted = false
    def wrap(o: GodotObject): OpenXRAndroidThreadSettingsExtension = new OpenXRAndroidThreadSettingsExtension {}.withHost(o.objectPtr)
    def unwrap(t: OpenXRAndroidThreadSettingsExtension): GodotObject = t.hostObject
  }
}
