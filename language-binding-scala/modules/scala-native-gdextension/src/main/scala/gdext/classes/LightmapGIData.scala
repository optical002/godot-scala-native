package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `LightmapGIData`, extends `Resource`. */
abstract class LightmapGIData extends Resource {
  override def godotClassName: String = "LightmapGIData"

  /** LightmapGIData.set_uses_spherical_harmonics */
  final def setUsesSphericalHarmonics(uses_spherical_harmonics: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGIData", "set_uses_spherical_harmonics", 2586408642L), hostObject.objectPtr, uses_spherical_harmonics)

  /** LightmapGIData.is_using_spherical_harmonics */
  final def isUsingSphericalHarmonics(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("LightmapGIData", "is_using_spherical_harmonics", 36873697L), hostObject.objectPtr)

  /** LightmapGIData.get_user_count */
  final def getUserCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("LightmapGIData", "get_user_count", 3905245786L), hostObject.objectPtr)

  /** LightmapGIData.clear_users */
  final def clearUsers(): Unit =
    Ptrcall.callVoid0(MethodBind.get("LightmapGIData", "clear_users", 3218959716L), hostObject.objectPtr)

  /** LightmapGIData.set_light_texture */
  final def setLightTexture(light_texture: TextureLayered): Unit =
    Ptrcall.callVoid1(MethodBind.get("LightmapGIData", "set_light_texture", 1278366092L), hostObject.objectPtr, light_texture.hostObject)

  /** LightmapGIData.get_light_texture */
  final def getLightTexture(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LightmapGIData", "get_light_texture", 3984243839L), hostObject.objectPtr)

}
