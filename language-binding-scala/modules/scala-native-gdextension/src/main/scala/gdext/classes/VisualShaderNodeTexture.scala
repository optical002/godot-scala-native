package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeTexture`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeTexture extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeTexture"

  /** VisualShaderNodeTexture.set_source */
  final def setSource(value: gdext.classes.VisualShaderNodeTexture.Source): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_source == null) gdext.classes.VisualShaderNodeTexture.mb_set_source = MethodBind.get("VisualShaderNodeTexture", "set_source", 905262939L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeTexture.get_source */
  final def getSource(): gdext.classes.VisualShaderNodeTexture.Source = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_source == null) gdext.classes.VisualShaderNodeTexture.mb_get_source = MethodBind.get("VisualShaderNodeTexture", "get_source", 2896297444L)
    gdext.classes.VisualShaderNodeTexture.Source(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_source, livePtr))
  }

  /** VisualShaderNodeTexture.set_texture */
  final def setTexture(value: Texture2D): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_texture == null) gdext.classes.VisualShaderNodeTexture.mb_set_texture = MethodBind.get("VisualShaderNodeTexture", "set_texture", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_texture, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeTexture.get_texture. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTexture(): Texture2D = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_texture == null) gdext.classes.VisualShaderNodeTexture.mb_get_texture = MethodBind.get("VisualShaderNodeTexture", "get_texture", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_texture, livePtr))
  }

  /** VisualShaderNodeTexture.set_texture_type */
  final def setTextureType(value: gdext.classes.VisualShaderNodeTexture.TextureType): Unit = {
    if (gdext.classes.VisualShaderNodeTexture.mb_set_texture_type == null) gdext.classes.VisualShaderNodeTexture.mb_set_texture_type = MethodBind.get("VisualShaderNodeTexture", "set_texture_type", 986314081L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeTexture.mb_set_texture_type, livePtr, value)
  }

  /** VisualShaderNodeTexture.get_texture_type */
  final def getTextureType(): gdext.classes.VisualShaderNodeTexture.TextureType = {
    if (gdext.classes.VisualShaderNodeTexture.mb_get_texture_type == null) gdext.classes.VisualShaderNodeTexture.mb_get_texture_type = MethodBind.get("VisualShaderNodeTexture", "get_texture_type", 3290430153L)
    gdext.classes.VisualShaderNodeTexture.TextureType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeTexture.mb_get_texture_type, livePtr))
  }

}

object VisualShaderNodeTexture {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeTexture.Source`. */
  opaque type Source <: Long = Long

  object Source {
    final val Texture: Source = 0L.asInstanceOf[Source]
    final val Screen: Source = 1L.asInstanceOf[Source]
    final val Source2dTexture: Source = 2L.asInstanceOf[Source]
    final val Source2dNormal: Source = 3L.asInstanceOf[Source]
    final val Depth: Source = 4L.asInstanceOf[Source]
    final val Port: Source = 5L.asInstanceOf[Source]
    final val Source3dNormal: Source = 6L.asInstanceOf[Source]
    final val Roughness: Source = 7L.asInstanceOf[Source]
    final val Max: Source = 8L.asInstanceOf[Source]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Source = value.asInstanceOf[Source]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Source] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L).asInstanceOf[scala.IArray[Source]]

    extension (self: Source)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Texture"
        case 1L => "Screen"
        case 2L => "Source2dTexture"
        case 3L => "Source2dNormal"
        case 4L => "Depth"
        case 5L => "Port"
        case 6L => "Source3dNormal"
        case 7L => "Roughness"
        case 8L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeTexture.TextureType`. */
  opaque type TextureType <: Long = Long

  object TextureType {
    final val Data: TextureType = 0L.asInstanceOf[TextureType]
    final val Color: TextureType = 1L.asInstanceOf[TextureType]
    final val NormalMap: TextureType = 2L.asInstanceOf[TextureType]
    final val Max: TextureType = 3L.asInstanceOf[TextureType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): TextureType = value.asInstanceOf[TextureType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[TextureType] = scala.IArray[Long](0L, 1L, 2L, 3L).asInstanceOf[scala.IArray[TextureType]]

    extension (self: TextureType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Data"
        case 1L => "Color"
        case 2L => "NormalMap"
        case 3L => "Max"
        case other => other.toString
      }
  }
}
