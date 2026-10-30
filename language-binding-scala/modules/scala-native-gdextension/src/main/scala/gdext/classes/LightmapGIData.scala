package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LightmapGIData`, extends `Resource`. */
abstract class LightmapGIData extends Resource {
  override def godotClassName: String = "LightmapGIData"

  /** LightmapGIData.set_uses_spherical_harmonics */
  final def setUsesSphericalHarmonics(usesSphericalHarmonics: Boolean): Unit = {
    if (gdext.classes.LightmapGIData.mb_set_uses_spherical_harmonics == null) gdext.classes.LightmapGIData.mb_set_uses_spherical_harmonics = MethodBind.get("LightmapGIData", "set_uses_spherical_harmonics", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.LightmapGIData.mb_set_uses_spherical_harmonics, livePtr, usesSphericalHarmonics)
  }

  /** LightmapGIData.is_using_spherical_harmonics */
  final def isUsingSphericalHarmonics(): Boolean = {
    if (gdext.classes.LightmapGIData.mb_is_using_spherical_harmonics == null) gdext.classes.LightmapGIData.mb_is_using_spherical_harmonics = MethodBind.get("LightmapGIData", "is_using_spherical_harmonics", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.LightmapGIData.mb_is_using_spherical_harmonics, livePtr)
  }

  /** LightmapGIData.get_user_count */
  final def getUserCount(): Long = {
    if (gdext.classes.LightmapGIData.mb_get_user_count == null) gdext.classes.LightmapGIData.mb_get_user_count = MethodBind.get("LightmapGIData", "get_user_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LightmapGIData.mb_get_user_count, livePtr)
  }

  /** LightmapGIData.clear_users */
  final def clearUsers(): Unit = {
    if (gdext.classes.LightmapGIData.mb_clear_users == null) gdext.classes.LightmapGIData.mb_clear_users = MethodBind.get("LightmapGIData", "clear_users", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.LightmapGIData.mb_clear_users, livePtr)
  }

  /** LightmapGIData.set_light_texture */
  final def setLightTexture(lightTexture: TextureLayered): Unit = {
    if (gdext.classes.LightmapGIData.mb_set_light_texture == null) gdext.classes.LightmapGIData.mb_set_light_texture = MethodBind.get("LightmapGIData", "set_light_texture", 1278366092L)
    Ptrcall.callVoid1(gdext.classes.LightmapGIData.mb_set_light_texture, livePtr, Wrappers.handle(lightTexture))
  }

  /** LightmapGIData.get_light_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getLightTexture(): TextureLayered = {
    if (gdext.classes.LightmapGIData.mb_get_light_texture == null) gdext.classes.LightmapGIData.mb_get_light_texture = MethodBind.get("LightmapGIData", "get_light_texture", 3984243839L)
    Wrappers.owned[TextureLayered](Ptrcall.call0[Long](gdext.classes.LightmapGIData.mb_get_light_texture, livePtr))
  }

}

object LightmapGIData {
  private[classes] var mb_set_uses_spherical_harmonics: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_spherical_harmonics: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_user_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_users: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_light_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_light_texture: GDExtensionMethodBindPtr = null

  /** Godot enum `LightmapGIData.ShadowmaskMode`. */
  opaque type ShadowmaskMode <: Long = Long

  object ShadowmaskMode {
    final val None: ShadowmaskMode = 0L.asInstanceOf[ShadowmaskMode]
    final val Replace: ShadowmaskMode = 1L.asInstanceOf[ShadowmaskMode]
    final val Overlay: ShadowmaskMode = 2L.asInstanceOf[ShadowmaskMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ShadowmaskMode = value.asInstanceOf[ShadowmaskMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ShadowmaskMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ShadowmaskMode]]

    extension (self: ShadowmaskMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Replace"
        case 2L => "Overlay"
        case other => other.toString
      }
  }
}
