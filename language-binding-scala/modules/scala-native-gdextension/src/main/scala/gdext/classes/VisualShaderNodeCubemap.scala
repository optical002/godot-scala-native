package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeCubemap`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeCubemap extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeCubemap"

  /** VisualShaderNodeCubemap.set_source */
  final def setSource(value: gdext.classes.VisualShaderNodeCubemap.Source): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_source == null) gdext.classes.VisualShaderNodeCubemap.mb_set_source = MethodBind.get("VisualShaderNodeCubemap", "set_source", 1625400621L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeCubemap.get_source */
  final def getSource(): gdext.classes.VisualShaderNodeCubemap.Source = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_source == null) gdext.classes.VisualShaderNodeCubemap.mb_get_source = MethodBind.get("VisualShaderNodeCubemap", "get_source", 2222048781L)
    gdext.classes.VisualShaderNodeCubemap.Source(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_source, livePtr))
  }

  /** VisualShaderNodeCubemap.set_cube_map */
  final def setCubeMap(value: TextureLayered): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map == null) gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map = MethodBind.get("VisualShaderNodeCubemap", "set_cube_map", 1278366092L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_cube_map, livePtr, Wrappers.handle(value))
  }

  /** VisualShaderNodeCubemap.get_cube_map. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getCubeMap(): TextureLayered = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map == null) gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map = MethodBind.get("VisualShaderNodeCubemap", "get_cube_map", 3984243839L)
    Wrappers.owned[TextureLayered](Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_cube_map, livePtr))
  }

  /** VisualShaderNodeCubemap.set_texture_type */
  final def setTextureType(value: gdext.classes.VisualShaderNodeCubemap.TextureType): Unit = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type == null) gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type = MethodBind.get("VisualShaderNodeCubemap", "set_texture_type", 1899718876L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeCubemap.mb_set_texture_type, livePtr, value)
  }

  /** VisualShaderNodeCubemap.get_texture_type */
  final def getTextureType(): gdext.classes.VisualShaderNodeCubemap.TextureType = {
    if (gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type == null) gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type = MethodBind.get("VisualShaderNodeCubemap", "get_texture_type", 3356498888L)
    gdext.classes.VisualShaderNodeCubemap.TextureType(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeCubemap.mb_get_texture_type, livePtr))
  }

}

object VisualShaderNodeCubemap {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_cube_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_cube_map: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_texture_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_texture_type: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeCubemap.Source`. */
  opaque type Source <: Long = Long

  object Source {
    final val Texture: Source = 0L.asInstanceOf[Source]
    final val Port: Source = 1L.asInstanceOf[Source]
    final val Max: Source = 2L.asInstanceOf[Source]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Source = value.asInstanceOf[Source]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Source] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[Source]]

    extension (self: Source)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Texture"
        case 1L => "Port"
        case 2L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `VisualShaderNodeCubemap.TextureType`. */
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
