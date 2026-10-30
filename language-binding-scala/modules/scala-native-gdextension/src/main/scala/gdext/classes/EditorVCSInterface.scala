package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `EditorVCSInterface`, extends `Object`. */
abstract class EditorVCSInterface extends Object {
  override def godotClassName: String = "EditorVCSInterface"

  /** EditorVCSInterface.popup_error */
  final def popupError(msg: String): Unit = {
    if (gdext.classes.EditorVCSInterface.mb_popup_error == null) gdext.classes.EditorVCSInterface.mb_popup_error = MethodBind.get("EditorVCSInterface", "popup_error", 83702148L)
    Ptrcall.callVoid1(gdext.classes.EditorVCSInterface.mb_popup_error, livePtr, msg)
  }

}

object EditorVCSInterface {
  private[classes] var mb_popup_error: GDExtensionMethodBindPtr = null

  /** Godot enum `EditorVCSInterface.ChangeType`. */
  opaque type ChangeType <: Long = Long

  object ChangeType {
    final val New: ChangeType = 0L.asInstanceOf[ChangeType]
    final val Modified: ChangeType = 1L.asInstanceOf[ChangeType]
    final val Renamed: ChangeType = 2L.asInstanceOf[ChangeType]
    final val Deleted: ChangeType = 3L.asInstanceOf[ChangeType]
    final val Typechange: ChangeType = 4L.asInstanceOf[ChangeType]
    final val Unmerged: ChangeType = 5L.asInstanceOf[ChangeType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ChangeType = value.asInstanceOf[ChangeType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ChangeType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ChangeType]]

    extension (self: ChangeType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "New"
        case 1L => "Modified"
        case 2L => "Renamed"
        case 3L => "Deleted"
        case 4L => "Typechange"
        case 5L => "Unmerged"
        case other => other.toString
      }
  }

  /** Godot enum `EditorVCSInterface.TreeArea`. */
  opaque type TreeArea <: Long = Long

  object TreeArea {
    final val Commit: TreeArea = 0L.asInstanceOf[TreeArea]
    final val Staged: TreeArea = 1L.asInstanceOf[TreeArea]
    final val Unstaged: TreeArea = 2L.asInstanceOf[TreeArea]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TreeArea = value.asInstanceOf[TreeArea]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TreeArea] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[TreeArea]]

    extension (self: TreeArea)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Commit"
        case 1L => "Staged"
        case 2L => "Unstaged"
        case other => other.toString
      }
  }
}
