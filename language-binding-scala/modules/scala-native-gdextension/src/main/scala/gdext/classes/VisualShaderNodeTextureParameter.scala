package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTextureParameter`, extends `VisualShaderNodeParameter`. */
abstract class VisualShaderNodeTextureParameter extends VisualShaderNodeParameter {
  override def godotClassName: String = "VisualShaderNodeTextureParameter"

  /** VisualShaderNodeTextureParameter.set_texture_type */
  final def setTextureType(`type`: gdext.classes.VisualShaderNodeTextureParameter.TextureType): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_type", 2227296876L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_type, livePtr, `type`)
  }

  /** VisualShaderNodeTextureParameter.get_texture_type */
  final def getTextureType(): gdext.classes.VisualShaderNodeTextureParameter.TextureType = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_type", 367922070L)
    gdext.classes.VisualShaderNodeTextureParameter.TextureType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_type, livePtr))
  }

  /** VisualShaderNodeTextureParameter.set_color_default */
  final def setColorDefault(color: gdext.classes.VisualShaderNodeTextureParameter.ColorDefault): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default = MethodBind.get("VisualShaderNodeTextureParameter", "set_color_default", 4217624432L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_color_default, livePtr, color)
  }

  /** VisualShaderNodeTextureParameter.get_color_default */
  final def getColorDefault(): gdext.classes.VisualShaderNodeTextureParameter.ColorDefault = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default = MethodBind.get("VisualShaderNodeTextureParameter", "get_color_default", 3837060134L)
    gdext.classes.VisualShaderNodeTextureParameter.ColorDefault(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_color_default, livePtr))
  }

  /** VisualShaderNodeTextureParameter.set_texture_filter */
  final def setTextureFilter(filter: gdext.classes.VisualShaderNodeTextureParameter.TextureFilter): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_filter", 2147684752L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_filter, livePtr, filter)
  }

  /** VisualShaderNodeTextureParameter.get_texture_filter */
  final def getTextureFilter(): gdext.classes.VisualShaderNodeTextureParameter.TextureFilter = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_filter", 4184490817L)
    gdext.classes.VisualShaderNodeTextureParameter.TextureFilter(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_filter, livePtr))
  }

  /** VisualShaderNodeTextureParameter.set_texture_repeat */
  final def setTextureRepeat(repeat: gdext.classes.VisualShaderNodeTextureParameter.TextureRepeat): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_repeat", 2036143070L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_repeat, livePtr, repeat)
  }

  /** VisualShaderNodeTextureParameter.get_texture_repeat */
  final def getTextureRepeat(): gdext.classes.VisualShaderNodeTextureParameter.TextureRepeat = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_repeat", 1690132794L)
    gdext.classes.VisualShaderNodeTextureParameter.TextureRepeat(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_repeat, livePtr))
  }

  /** VisualShaderNodeTextureParameter.set_texture_source */
  final def setTextureSource(source: gdext.classes.VisualShaderNodeTextureParameter.TextureSource): Unit = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source == null) gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source = MethodBind.get("VisualShaderNodeTextureParameter", "set_texture_source", 1212687372L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTextureParameter.mb_set_texture_source, livePtr, source)
  }

  /** VisualShaderNodeTextureParameter.get_texture_source */
  final def getTextureSource(): gdext.classes.VisualShaderNodeTextureParameter.TextureSource = {
    if (gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source == null) gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source = MethodBind.get("VisualShaderNodeTextureParameter", "get_texture_source", 2039092262L)
    gdext.classes.VisualShaderNodeTextureParameter.TextureSource(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTextureParameter.mb_get_texture_source, livePtr))
  }

}

object VisualShaderNodeTextureParameter {
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color_default: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_filter: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_repeat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_source: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeTextureParameter.TextureType`. */
  opaque type TextureType <: Long = Long

  object TextureType {
    final val Data: TextureType = 0L.asInstanceOf[TextureType]
    final val Color: TextureType = 1L.asInstanceOf[TextureType]
    final val NormalMap: TextureType = 2L.asInstanceOf[TextureType]
    final val Anisotropy: TextureType = 3L.asInstanceOf[TextureType]
    final val Max: TextureType = 4L.asInstanceOf[TextureType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureType = value.asInstanceOf[TextureType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TextureType]]

    extension (self: TextureType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Data"
        case 1L => "Color"
        case 2L => "NormalMap"
        case 3L => "Anisotropy"
        case 4L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeTextureParameter.ColorDefault`. */
  opaque type ColorDefault <: Long = Long

  object ColorDefault {
    final val White: ColorDefault = 0L.asInstanceOf[ColorDefault]
    final val Black: ColorDefault = 1L.asInstanceOf[ColorDefault]
    final val Transparent: ColorDefault = 2L.asInstanceOf[ColorDefault]
    final val Max: ColorDefault = 3L.asInstanceOf[ColorDefault]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ColorDefault = value.asInstanceOf[ColorDefault]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ColorDefault] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[ColorDefault]]

    extension (self: ColorDefault)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "White"
        case 1L => "Black"
        case 2L => "Transparent"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeTextureParameter.TextureFilter`. */
  opaque type TextureFilter <: Long = Long

  object TextureFilter {
    final val Default: TextureFilter = 0L.asInstanceOf[TextureFilter]
    final val Nearest: TextureFilter = 1L.asInstanceOf[TextureFilter]
    final val Linear: TextureFilter = 2L.asInstanceOf[TextureFilter]
    final val NearestMipmap: TextureFilter = 3L.asInstanceOf[TextureFilter]
    final val LinearMipmap: TextureFilter = 4L.asInstanceOf[TextureFilter]
    final val NearestMipmapAnisotropic: TextureFilter = 5L.asInstanceOf[TextureFilter]
    final val LinearMipmapAnisotropic: TextureFilter = 6L.asInstanceOf[TextureFilter]
    final val Max: TextureFilter = 7L.asInstanceOf[TextureFilter]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureFilter = value.asInstanceOf[TextureFilter]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureFilter] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L).asInstanceOf[scala.IArray[TextureFilter]]

    extension (self: TextureFilter)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Nearest"
        case 2L => "Linear"
        case 3L => "NearestMipmap"
        case 4L => "LinearMipmap"
        case 5L => "NearestMipmapAnisotropic"
        case 6L => "LinearMipmapAnisotropic"
        case 7L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeTextureParameter.TextureRepeat`. */
  opaque type TextureRepeat <: Long = Long

  object TextureRepeat {
    final val Default: TextureRepeat = 0L.asInstanceOf[TextureRepeat]
    final val Enabled: TextureRepeat = 1L.asInstanceOf[TextureRepeat]
    final val Disabled: TextureRepeat = 2L.asInstanceOf[TextureRepeat]
    final val Max: TextureRepeat = 3L.asInstanceOf[TextureRepeat]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureRepeat = value.asInstanceOf[TextureRepeat]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureRepeat] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TextureRepeat]]

    extension (self: TextureRepeat)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Default"
        case 1L => "Enabled"
        case 2L => "Disabled"
        case 3L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeTextureParameter.TextureSource`. */
  opaque type TextureSource <: Long = Long

  object TextureSource {
    final val None: TextureSource = 0L.asInstanceOf[TextureSource]
    final val Screen: TextureSource = 1L.asInstanceOf[TextureSource]
    final val Depth: TextureSource = 2L.asInstanceOf[TextureSource]
    final val NormalRoughness: TextureSource = 3L.asInstanceOf[TextureSource]
    final val Max: TextureSource = 4L.asInstanceOf[TextureSource]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureSource = value.asInstanceOf[TextureSource]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureSource] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[TextureSource]]

    extension (self: TextureSource)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "None"
        case 1L => "Screen"
        case 2L => "Depth"
        case 3L => "NormalRoughness"
        case 4L => "Max"
        case other => other.toString
      }
  }
}
