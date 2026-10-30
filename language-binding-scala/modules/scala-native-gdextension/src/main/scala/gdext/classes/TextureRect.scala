package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `TextureRect`, extends `Control`. */
abstract class TextureRect extends Control {
  override def godotClassName: String = "TextureRect"

  /** TextureRect.set_texture */
  final def setTexture(texture: Texture2D): Unit = {
    if (gdext.classes.TextureRect.mb_set_texture == null) gdext.classes.TextureRect.mb_set_texture = MethodBind.get("TextureRect", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_texture, livePtr, Wrappers.handle(texture))
  }

  /** TextureRect.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.TextureRect.mb_get_texture == null) gdext.classes.TextureRect.mb_get_texture = MethodBind.get("TextureRect", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_texture, livePtr))
  }

  /** TextureRect.set_expand_mode */
  final def setExpandMode(expandMode: gdext.classes.TextureRect.ExpandMode): Unit = {
    if (gdext.classes.TextureRect.mb_set_expand_mode == null) gdext.classes.TextureRect.mb_set_expand_mode = MethodBind.get("TextureRect", "set_expand_mode", 1870766882L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_expand_mode, livePtr, expandMode)
  }

  /** TextureRect.get_expand_mode */
  final def getExpandMode(): gdext.classes.TextureRect.ExpandMode = {
    if (gdext.classes.TextureRect.mb_get_expand_mode == null) gdext.classes.TextureRect.mb_get_expand_mode = MethodBind.get("TextureRect", "get_expand_mode", 3863824733L)
    gdext.classes.TextureRect.ExpandMode(Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_expand_mode, livePtr))
  }

  /** TextureRect.set_flip_h */
  final def setFlipH(enable: Boolean): Unit = {
    if (gdext.classes.TextureRect.mb_set_flip_h == null) gdext.classes.TextureRect.mb_set_flip_h = MethodBind.get("TextureRect", "set_flip_h", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_flip_h, livePtr, enable)
  }

  /** TextureRect.is_flipped_h */
  final def isFlippedH(): Boolean = {
    if (gdext.classes.TextureRect.mb_is_flipped_h == null) gdext.classes.TextureRect.mb_is_flipped_h = MethodBind.get("TextureRect", "is_flipped_h", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureRect.mb_is_flipped_h, livePtr)
  }

  /** TextureRect.set_flip_v */
  final def setFlipV(enable: Boolean): Unit = {
    if (gdext.classes.TextureRect.mb_set_flip_v == null) gdext.classes.TextureRect.mb_set_flip_v = MethodBind.get("TextureRect", "set_flip_v", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_flip_v, livePtr, enable)
  }

  /** TextureRect.is_flipped_v */
  final def isFlippedV(): Boolean = {
    if (gdext.classes.TextureRect.mb_is_flipped_v == null) gdext.classes.TextureRect.mb_is_flipped_v = MethodBind.get("TextureRect", "is_flipped_v", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.TextureRect.mb_is_flipped_v, livePtr)
  }

  /** TextureRect.set_stretch_mode */
  final def setStretchMode(stretchMode: gdext.classes.TextureRect.StretchMode): Unit = {
    if (gdext.classes.TextureRect.mb_set_stretch_mode == null) gdext.classes.TextureRect.mb_set_stretch_mode = MethodBind.get("TextureRect", "set_stretch_mode", 58788729L)
    Ptrcall.callVoid1(gdext.classes.TextureRect.mb_set_stretch_mode, livePtr, stretchMode)
  }

  /** TextureRect.get_stretch_mode */
  final def getStretchMode(): gdext.classes.TextureRect.StretchMode = {
    if (gdext.classes.TextureRect.mb_get_stretch_mode == null) gdext.classes.TextureRect.mb_get_stretch_mode = MethodBind.get("TextureRect", "get_stretch_mode", 346396079L)
    gdext.classes.TextureRect.StretchMode(Ptrcall.call0[Long](gdext.classes.TextureRect.mb_get_stretch_mode, livePtr))
  }

}

object TextureRect {
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_expand_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_h: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flip_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flipped_v: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stretch_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stretch_mode: GDExtensionMethodBindPtr = null

  /** Godot enum `TextureRect.ExpandMode`. */
  opaque type ExpandMode <: Long = Long

  object ExpandMode {
    final val KeepSize: ExpandMode = 0L.asInstanceOf[ExpandMode]
    final val IgnoreSize: ExpandMode = 1L.asInstanceOf[ExpandMode]
    final val FitWidth: ExpandMode = 2L.asInstanceOf[ExpandMode]
    final val FitWidthProportional: ExpandMode = 3L.asInstanceOf[ExpandMode]
    final val FitHeight: ExpandMode = 4L.asInstanceOf[ExpandMode]
    final val FitHeightProportional: ExpandMode = 5L.asInstanceOf[ExpandMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ExpandMode = value.asInstanceOf[ExpandMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ExpandMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[ExpandMode]]

    extension (self: ExpandMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "KeepSize"
        case 1L => "IgnoreSize"
        case 2L => "FitWidth"
        case 3L => "FitWidthProportional"
        case 4L => "FitHeight"
        case 5L => "FitHeightProportional"
        case other => other.toString
      }
  }

  /** Godot enum `TextureRect.StretchMode`. */
  opaque type StretchMode <: Long = Long

  object StretchMode {
    final val Scale: StretchMode = 0L.asInstanceOf[StretchMode]
    final val Tile: StretchMode = 1L.asInstanceOf[StretchMode]
    final val Keep: StretchMode = 2L.asInstanceOf[StretchMode]
    final val KeepCentered: StretchMode = 3L.asInstanceOf[StretchMode]
    final val KeepAspect: StretchMode = 4L.asInstanceOf[StretchMode]
    final val KeepAspectCentered: StretchMode = 5L.asInstanceOf[StretchMode]
    final val KeepAspectCovered: StretchMode = 6L.asInstanceOf[StretchMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): StretchMode = value.asInstanceOf[StretchMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[StretchMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[StretchMode]]

    extension (self: StretchMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Scale"
        case 1L => "Tile"
        case 2L => "Keep"
        case 3L => "KeepCentered"
        case 4L => "KeepAspect"
        case 5L => "KeepAspectCentered"
        case 6L => "KeepAspectCovered"
        case other => other.toString
      }
  }
}
