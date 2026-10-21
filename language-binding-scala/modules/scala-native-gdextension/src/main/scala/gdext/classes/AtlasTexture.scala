package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `AtlasTexture`, extends `Texture2D`. */
abstract class AtlasTexture extends Texture2D {
  override def godotClassName: String = "AtlasTexture"

  /** AtlasTexture.set_atlas */
  final def setAtlas(atlas: Texture2D): Unit = {
    if (gdext.classes.AtlasTexture.mb_set_atlas == null) gdext.classes.AtlasTexture.mb_set_atlas = MethodBind.get("AtlasTexture", "set_atlas", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.AtlasTexture.mb_set_atlas, livePtr, Wrappers.handle(atlas))
  }

  /** AtlasTexture.get_atlas. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getAtlas(): Texture2D = {
    if (gdext.classes.AtlasTexture.mb_get_atlas == null) gdext.classes.AtlasTexture.mb_get_atlas = MethodBind.get("AtlasTexture", "get_atlas", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.AtlasTexture.mb_get_atlas, livePtr))
  }

  /** AtlasTexture.set_region */
  final def setRegion(region: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.AtlasTexture.mb_set_region == null) gdext.classes.AtlasTexture.mb_set_region = MethodBind.get("AtlasTexture", "set_region", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.AtlasTexture.mb_set_region, livePtr, region)
  }

  /** AtlasTexture.get_region */
  final def getRegion(): gdext.builtin.Rect2 = {
    if (gdext.classes.AtlasTexture.mb_get_region == null) gdext.classes.AtlasTexture.mb_get_region = MethodBind.get("AtlasTexture", "get_region", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.AtlasTexture.mb_get_region, livePtr)
  }

  /** AtlasTexture.set_margin */
  final def setMargin(margin: gdext.builtin.Rect2): Unit = {
    if (gdext.classes.AtlasTexture.mb_set_margin == null) gdext.classes.AtlasTexture.mb_set_margin = MethodBind.get("AtlasTexture", "set_margin", 2046264180L)
    Ptrcall.callVoid1(gdext.classes.AtlasTexture.mb_set_margin, livePtr, margin)
  }

  /** AtlasTexture.get_margin */
  final def getMargin(): gdext.builtin.Rect2 = {
    if (gdext.classes.AtlasTexture.mb_get_margin == null) gdext.classes.AtlasTexture.mb_get_margin = MethodBind.get("AtlasTexture", "get_margin", 1639390495L)
    Ptrcall.call0[gdext.builtin.Rect2](gdext.classes.AtlasTexture.mb_get_margin, livePtr)
  }

  /** AtlasTexture.set_filter_clip */
  final def setFilterClip(enable: Boolean): Unit = {
    if (gdext.classes.AtlasTexture.mb_set_filter_clip == null) gdext.classes.AtlasTexture.mb_set_filter_clip = MethodBind.get("AtlasTexture", "set_filter_clip", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.AtlasTexture.mb_set_filter_clip, livePtr, enable)
  }

  /** AtlasTexture.has_filter_clip */
  final def hasFilterClip(): Boolean = {
    if (gdext.classes.AtlasTexture.mb_has_filter_clip == null) gdext.classes.AtlasTexture.mb_has_filter_clip = MethodBind.get("AtlasTexture", "has_filter_clip", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.AtlasTexture.mb_has_filter_clip, livePtr)
  }

}

object AtlasTexture {
  private[classes] var mb_set_atlas: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_atlas: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_region: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_margin: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_filter_clip: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_filter_clip: GDExtensionMethodBindPtr = null
}
