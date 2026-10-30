package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenEnabler2D`, extends `VisibleOnScreenNotifier2D`. */
abstract class VisibleOnScreenEnabler2D extends VisibleOnScreenNotifier2D {
  override def godotClassName: String = "VisibleOnScreenEnabler2D"

  /** VisibleOnScreenEnabler2D.set_enable_mode */
  final def setEnableMode(mode: gdext.classes.VisibleOnScreenEnabler2D.EnableMode): Unit = {
    if (gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode == null) gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode = MethodBind.get("VisibleOnScreenEnabler2D", "set_enable_mode", 2961788752L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenEnabler2D.mb_set_enable_mode, livePtr, mode)
  }

  /** VisibleOnScreenEnabler2D.get_enable_mode */
  final def getEnableMode(): gdext.classes.VisibleOnScreenEnabler2D.EnableMode = {
    if (gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode == null) gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode = MethodBind.get("VisibleOnScreenEnabler2D", "get_enable_mode", 2650445576L)
    gdext.classes.VisibleOnScreenEnabler2D.EnableMode(Ptrcall.call0[Long](gdext.classes.VisibleOnScreenEnabler2D.mb_get_enable_mode, livePtr))
  }

}

object VisibleOnScreenEnabler2D {
  private[classes] var mb_set_enable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `VisibleOnScreenEnabler2D.EnableMode`. */
  opaque type EnableMode <: Long = Long

  object EnableMode {
    final val Inherit: EnableMode = 0L.asInstanceOf[EnableMode]
    final val Always: EnableMode = 1L.asInstanceOf[EnableMode]
    final val WhenPaused: EnableMode = 2L.asInstanceOf[EnableMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): EnableMode = value.asInstanceOf[EnableMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[EnableMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[EnableMode]]

    extension (self: EnableMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherit"
        case 1L => "Always"
        case 2L => "WhenPaused"
        case other => other.toString
      }
  }
}
