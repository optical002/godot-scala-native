package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAndroidThreadSettingsExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRAndroidThreadSettingsExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRAndroidThreadSettingsExtension"

  /** OpenXRAndroidThreadSettingsExtension.set_application_thread_type */
  final def setApplicationThreadType(thread_type: Long, thread_id: Long): Boolean = {
    if (gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type == null) gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type = MethodBind.get("OpenXRAndroidThreadSettingsExtension", "set_application_thread_type", 1558751158L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type, livePtr, thread_type, thread_id)
  }

}

object OpenXRAndroidThreadSettingsExtension {
  private[classes] var mb_set_application_thread_type: GDExtensionMethodBindPtr = null
}
