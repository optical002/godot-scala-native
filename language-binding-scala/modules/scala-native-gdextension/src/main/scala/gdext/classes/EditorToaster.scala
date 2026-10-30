package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorToaster`, extends `HBoxContainer`. */
abstract class EditorToaster extends HBoxContainer {
  override def godotClassName: String = "EditorToaster"

  /** EditorToaster.push_toast */
  final def pushToast(message: String, severity: gdext.classes.EditorToaster.Severity = gdext.classes.EditorToaster.Severity(0L), tooltip: String = ""): Unit = {
    if (gdext.classes.EditorToaster.mb_push_toast == null) gdext.classes.EditorToaster.mb_push_toast = MethodBind.get("EditorToaster", "push_toast", 1813923476L)
    Ptrcall.callVoid3(gdext.classes.EditorToaster.mb_push_toast, livePtr, message, severity, tooltip)
  }

}

object EditorToaster {
  private[classes] var mb_push_toast: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorToaster.Severity`. */
  opaque type Severity <: Long = Long

  object Severity {
    final val Info: Severity = 0L.asInstanceOf[Severity]
    final val Warning: Severity = 1L.asInstanceOf[Severity]
    final val Error: Severity = 2L.asInstanceOf[Severity]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Severity = value.asInstanceOf[Severity]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Severity] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Severity]]

    extension (self: Severity)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Info"
        case 1L => "Warning"
        case 2L => "Error"
        case other => other.toString
      }
  }
}
