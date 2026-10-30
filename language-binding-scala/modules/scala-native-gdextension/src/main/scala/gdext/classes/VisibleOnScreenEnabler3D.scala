package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisibleOnScreenEnabler3D`, extends `VisibleOnScreenNotifier3D`. */
abstract class VisibleOnScreenEnabler3D extends VisibleOnScreenNotifier3D {
  override def godotClassName: String = "VisibleOnScreenEnabler3D"

  /** VisibleOnScreenEnabler3D.set_enable_mode */
  final def setEnableMode(mode: gdext.classes.VisibleOnScreenEnabler3D.EnableMode): Unit = {
    if (gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode == null) gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode = MethodBind.get("VisibleOnScreenEnabler3D", "set_enable_mode", 320303646L)
    Ptrcall.callVoid1(gdext.classes.VisibleOnScreenEnabler3D.mb_set_enable_mode, livePtr, mode)
  }

  /** VisibleOnScreenEnabler3D.get_enable_mode */
  final def getEnableMode(): gdext.classes.VisibleOnScreenEnabler3D.EnableMode = {
    if (gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode == null) gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode = MethodBind.get("VisibleOnScreenEnabler3D", "get_enable_mode", 3352990031L)
    gdext.classes.VisibleOnScreenEnabler3D.EnableMode(Ptrcall.call0[Long](gdext.classes.VisibleOnScreenEnabler3D.mb_get_enable_mode, livePtr))
  }

}

object VisibleOnScreenEnabler3D {
  private[classes] var mb_set_enable_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_enable_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `VisibleOnScreenEnabler3D.EnableMode`. */
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
