package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `BackBufferCopy`, extends `Node2D`. */
abstract class BackBufferCopy extends Node2D {
  override def godotClassName: String = "BackBufferCopy"

  /** BackBufferCopy.set_rect */
  final def setRect(rect: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.BackBufferCopy.mb_set_rect == null) gdext.classes.BackBufferCopy.mb_set_rect = MethodBind.get("BackBufferCopy", "set_rect", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.BackBufferCopy.mb_set_rect, livePtr, rect)
  }

  /** BackBufferCopy.get_rect */
  final def getRect(): gdext.builtin.Rect2 = {
    if (gdext.classes.BackBufferCopy.mb_get_rect == null) gdext.classes.BackBufferCopy.mb_get_rect = MethodBind.get("BackBufferCopy", "get_rect", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.BackBufferCopy.mb_get_rect, livePtr)
  }

  /** BackBufferCopy.set_copy_mode */
  final def setCopyMode(copyMode: gdext.classes.BackBufferCopy.CopyMode): Unit = {
    if (gdext.classes.BackBufferCopy.mb_set_copy_mode == null) gdext.classes.BackBufferCopy.mb_set_copy_mode = MethodBind.get("BackBufferCopy", "set_copy_mode", 1713538590L)
    Ptrcall.callVoid1(gdext.classes.BackBufferCopy.mb_set_copy_mode, livePtr, copyMode)
  }

  /** BackBufferCopy.get_copy_mode */
  final def getCopyMode(): gdext.classes.BackBufferCopy.CopyMode = {
    if (gdext.classes.BackBufferCopy.mb_get_copy_mode == null) gdext.classes.BackBufferCopy.mb_get_copy_mode = MethodBind.get("BackBufferCopy", "get_copy_mode", 3271169440L)
    gdext.classes.BackBufferCopy.CopyMode(Ptrcall.call0[Long](gdext.classes.BackBufferCopy.mb_get_copy_mode, livePtr))
  }

}

object BackBufferCopy {
  private[classes] var mb_set_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_rect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_copy_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_copy_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `BackBufferCopy.CopyMode`. */
  opaque type CopyMode <: Long = Long

  object CopyMode {
    final val Disabled: CopyMode = 0L.asInstanceOf[CopyMode]
    final val Rect: CopyMode = 1L.asInstanceOf[CopyMode]
    final val Viewport: CopyMode = 2L.asInstanceOf[CopyMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): CopyMode = value.asInstanceOf[CopyMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[CopyMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[CopyMode]]

    extension (self: CopyMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Rect"
        case 2L => "Viewport"
        case other => other.toString
      }
  }
}
