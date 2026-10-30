package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OpenXRAndroidThreadSettingsExtension`, extends `OpenXRExtensionWrapper`. */
abstract class OpenXRAndroidThreadSettingsExtension extends OpenXRExtensionWrapper {
  override def godotClassName: String = "OpenXRAndroidThreadSettingsExtension"

  /** OpenXRAndroidThreadSettingsExtension.set_application_thread_type */
  final def setApplicationThreadType(threadType: gdext.classes.OpenXRAndroidThreadSettingsExtension.ThreadType, threadId: Long = 0L): Boolean = {
    if (gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type == null) gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type = MethodBind.get("OpenXRAndroidThreadSettingsExtension", "set_application_thread_type", 1558751158L)
    Ptrcall.call2[Long, Long, Boolean](gdext.classes.OpenXRAndroidThreadSettingsExtension.mb_set_application_thread_type, livePtr, threadType, threadId)
  }

}

object OpenXRAndroidThreadSettingsExtension {
  private[classes] var mb_set_application_thread_type: GDExtensionMethodBindPtr = null

  /** Godot enum `OpenXRAndroidThreadSettingsExtension.ThreadType`. */
  opaque type ThreadType <: Long = Long

  object ThreadType {
    final val ApplicationMain: ThreadType = 0L.asInstanceOf[ThreadType]
    final val ApplicationWorker: ThreadType = 1L.asInstanceOf[ThreadType]
    final val RendererMain: ThreadType = 2L.asInstanceOf[ThreadType]
    final val RendererWorker: ThreadType = 3L.asInstanceOf[ThreadType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ThreadType = value.asInstanceOf[ThreadType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ThreadType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ThreadType]]

    extension (self: ThreadType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ApplicationMain"
        case 1L => "ApplicationWorker"
        case 2L => "RendererMain"
        case 3L => "RendererWorker"
        case other => other.toString
      }
  }
}
