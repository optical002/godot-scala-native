package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `DirectionalLight3D`, extends `Light3D`. */
abstract class DirectionalLight3D extends Light3D {
  override def godotClassName: String = "DirectionalLight3D"

  /** DirectionalLight3D.set_shadow_mode */
  final def setShadowMode(mode: gdext.classes.DirectionalLight3D.ShadowMode): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_shadow_mode == null) gdext.classes.DirectionalLight3D.mb_set_shadow_mode = MethodBind.get("DirectionalLight3D", "set_shadow_mode", 1261211726L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_shadow_mode, livePtr, mode)
  }

  /** DirectionalLight3D.get_shadow_mode */
  final def getShadowMode(): gdext.classes.DirectionalLight3D.ShadowMode = {
    if (gdext.classes.DirectionalLight3D.mb_get_shadow_mode == null) gdext.classes.DirectionalLight3D.mb_get_shadow_mode = MethodBind.get("DirectionalLight3D", "get_shadow_mode", 2765228544L)
    gdext.classes.DirectionalLight3D.ShadowMode(Ptrcall.call0[Long](gdext.classes.DirectionalLight3D.mb_get_shadow_mode, livePtr))
  }

  /** DirectionalLight3D.set_blend_splits */
  final def setBlendSplits(enabled: Boolean): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_blend_splits == null) gdext.classes.DirectionalLight3D.mb_set_blend_splits = MethodBind.get("DirectionalLight3D", "set_blend_splits", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_blend_splits, livePtr, enabled)
  }

  /** DirectionalLight3D.is_blend_splits_enabled */
  final def isBlendSplitsEnabled(): Boolean = {
    if (gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled == null) gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled = MethodBind.get("DirectionalLight3D", "is_blend_splits_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.DirectionalLight3D.mb_is_blend_splits_enabled, livePtr)
  }

  /** DirectionalLight3D.set_sky_mode */
  final def setSkyMode(mode: gdext.classes.DirectionalLight3D.SkyMode): Unit = {
    if (gdext.classes.DirectionalLight3D.mb_set_sky_mode == null) gdext.classes.DirectionalLight3D.mb_set_sky_mode = MethodBind.get("DirectionalLight3D", "set_sky_mode", 2691194817L)
    Ptrcall.callVoid1(gdext.classes.DirectionalLight3D.mb_set_sky_mode, livePtr, mode)
  }

  /** DirectionalLight3D.get_sky_mode */
  final def getSkyMode(): gdext.classes.DirectionalLight3D.SkyMode = {
    if (gdext.classes.DirectionalLight3D.mb_get_sky_mode == null) gdext.classes.DirectionalLight3D.mb_get_sky_mode = MethodBind.get("DirectionalLight3D", "get_sky_mode", 3819982774L)
    gdext.classes.DirectionalLight3D.SkyMode(Ptrcall.call0[Long](gdext.classes.DirectionalLight3D.mb_get_sky_mode, livePtr))
  }

}

object DirectionalLight3D {
  private[classes] var mb_set_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_blend_splits: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_blend_splits_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_sky_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_sky_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `DirectionalLight3D.ShadowMode`. */
  opaque type ShadowMode <: Long = Long

  object ShadowMode {
    final val Orthogonal: ShadowMode = 0L.asInstanceOf[ShadowMode]
    final val Parallel2Splits: ShadowMode = 1L.asInstanceOf[ShadowMode]
    final val Parallel4Splits: ShadowMode = 2L.asInstanceOf[ShadowMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowMode = value.asInstanceOf[ShadowMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ShadowMode]]

    extension (self: ShadowMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Orthogonal"
        case 1L => "Parallel2Splits"
        case 2L => "Parallel4Splits"
        case other => other.toString
      }
  }

  /** Godot enum `DirectionalLight3D.SkyMode`. */
  opaque type SkyMode <: Long = Long

  object SkyMode {
    final val LightAndSky: SkyMode = 0L.asInstanceOf[SkyMode]
    final val LightOnly: SkyMode = 1L.asInstanceOf[SkyMode]
    final val SkyOnly: SkyMode = 2L.asInstanceOf[SkyMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): SkyMode = value.asInstanceOf[SkyMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[SkyMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[SkyMode]]

    extension (self: SkyMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "LightAndSky"
        case 1L => "LightOnly"
        case 2L => "SkyOnly"
        case other => other.toString
      }
  }
}
