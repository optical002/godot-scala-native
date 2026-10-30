package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `OmniLight3D`, extends `Light3D`. */
abstract class OmniLight3D extends Light3D {
  override def godotClassName: String = "OmniLight3D"

  /** OmniLight3D.set_shadow_mode */
  final def setShadowMode(mode: gdext.classes.OmniLight3D.ShadowMode): Unit = {
    if (gdext.classes.OmniLight3D.mb_set_shadow_mode == null) gdext.classes.OmniLight3D.mb_set_shadow_mode = MethodBind.get("OmniLight3D", "set_shadow_mode", 121862228L)
    Ptrcall.callVoid1(gdext.classes.OmniLight3D.mb_set_shadow_mode, livePtr, mode)
  }

  /** OmniLight3D.get_shadow_mode */
  final def getShadowMode(): gdext.classes.OmniLight3D.ShadowMode = {
    if (gdext.classes.OmniLight3D.mb_get_shadow_mode == null) gdext.classes.OmniLight3D.mb_get_shadow_mode = MethodBind.get("OmniLight3D", "get_shadow_mode", 4181586331L)
    gdext.classes.OmniLight3D.ShadowMode(Ptrcall.call0[Long](gdext.classes.OmniLight3D.mb_get_shadow_mode, livePtr))
  }

}

object OmniLight3D {
  private[classes] var mb_set_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `OmniLight3D.ShadowMode`. */
  opaque type ShadowMode <: Long = Long

  object ShadowMode {
    final val DualParaboloid: ShadowMode = 0L.asInstanceOf[ShadowMode]
    final val Cube: ShadowMode = 1L.asInstanceOf[ShadowMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowMode = value.asInstanceOf[ShadowMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowMode] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ShadowMode]]

    extension (self: ShadowMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "DualParaboloid"
        case 1L => "Cube"
        case other => other.toString
      }
  }
}
