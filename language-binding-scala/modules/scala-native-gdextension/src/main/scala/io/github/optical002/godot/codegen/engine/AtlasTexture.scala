package io.github.optical002.godot.codegen.engine

import io.github.optical002.godot.Godot
import io.github.optical002.godot.builtin.*
import io.github.optical002.godot.engine.*
import io.github.optical002.godot.engine.GodotObject.*

/** Generated wrapper for Godot's `AtlasTexture`, extends `Texture2D`. */
abstract class AtlasTexture extends Texture2D {

  /** AtlasTexture.set_atlas */
  final def setAtlas(atlas: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("AtlasTexture", "set_atlas", 4051416890L), hostObject.objectPtr, atlas.hostObject)

  /** AtlasTexture.get_atlas */
  final def getAtlas(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("AtlasTexture", "get_atlas", 3635182373L), hostObject.objectPtr)

  /** AtlasTexture.set_region */
  final def setRegion(region: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AtlasTexture", "set_region", 2046264180L), hostObject.objectPtr, region)

  /** AtlasTexture.get_region */
  final def getRegion(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("AtlasTexture", "get_region", 1639390495L), hostObject.objectPtr)

  /** AtlasTexture.set_margin */
  final def setMargin(margin: io.github.optical002.godot.builtin.Rect2): Unit =
    Ptrcall.callVoid1(MethodBind.get("AtlasTexture", "set_margin", 2046264180L), hostObject.objectPtr, margin)

  /** AtlasTexture.get_margin */
  final def getMargin(): io.github.optical002.godot.builtin.Rect2 =
    Ptrcall.call0[io.github.optical002.godot.builtin.Rect2](MethodBind.get("AtlasTexture", "get_margin", 1639390495L), hostObject.objectPtr)

  /** AtlasTexture.set_filter_clip */
  final def setFilterClip(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("AtlasTexture", "set_filter_clip", 2586408642L), hostObject.objectPtr, enable)

  /** AtlasTexture.has_filter_clip */
  final def hasFilterClip(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("AtlasTexture", "has_filter_clip", 36873697L), hostObject.objectPtr)

}

object AtlasTexture {
  /** Class metadata for Gd[AtlasTexture] lifetime management and casting. */
  given GodotClass[AtlasTexture] with {
    def className = "AtlasTexture"
    def isRefCounted = true
    def wrap(o: GodotObject): AtlasTexture = new AtlasTexture {}.withHost(o.objectPtr)
    def unwrap(t: AtlasTexture): GodotObject = t.hostObject
  }
}
