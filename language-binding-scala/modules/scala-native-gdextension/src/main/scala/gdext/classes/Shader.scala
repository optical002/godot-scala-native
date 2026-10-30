package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Shader`, extends `Resource`. */
abstract class Shader extends Resource {
  override def godotClassName: String = "Shader"

  /** Shader.get_mode */
  final def getMode(): gdext.classes.Shader.Mode = {
    if (gdext.classes.Shader.mb_get_mode == null) gdext.classes.Shader.mb_get_mode = MethodBind.get("Shader", "get_mode", 3392948163L)
    gdext.classes.Shader.Mode(Ptrcall.call0[Long](gdext.classes.Shader.mb_get_mode, livePtr))
  }

  /** Shader.set_code */
  final def setCode(code: String): Unit = {
    if (gdext.classes.Shader.mb_set_code == null) gdext.classes.Shader.mb_set_code = MethodBind.get("Shader", "set_code", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Shader.mb_set_code, livePtr, code)
  }

  /** Shader.get_code */
  final def getCode(): String = {
    if (gdext.classes.Shader.mb_get_code == null) gdext.classes.Shader.mb_get_code = MethodBind.get("Shader", "get_code", 201670096L)
    Ptrcall.call0[String](gdext.classes.Shader.mb_get_code, livePtr)
  }

  /** Shader.set_default_texture_parameter */
  final def setDefaultTextureParameter(name: String, texture: Texture, index: Long = 0L): Unit = {
    if (gdext.classes.Shader.mb_set_default_texture_parameter == null) gdext.classes.Shader.mb_set_default_texture_parameter = MethodBind.get("Shader", "set_default_texture_parameter", 3850209648L)
    Ptrcall.callVoid3(gdext.classes.Shader.mb_set_default_texture_parameter, livePtr, SnArg(name), Wrappers.handle(texture), index)
  }

  /** Shader.get_default_texture_parameter. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDefaultTextureParameter(name: String, index: Long = 0L): Texture = {
    if (gdext.classes.Shader.mb_get_default_texture_parameter == null) gdext.classes.Shader.mb_get_default_texture_parameter = MethodBind.get("Shader", "get_default_texture_parameter", 4213877425L)
    Wrappers.owned[Texture](Ptrcall.call2[SnArg, Long, Long](gdext.classes.Shader.mb_get_default_texture_parameter, livePtr, SnArg(name), index))
  }

  /** Shader.inspect_native_shader_code */
  final def inspectNativeShaderCode(): Unit = {
    if (gdext.classes.Shader.mb_inspect_native_shader_code == null) gdext.classes.Shader.mb_inspect_native_shader_code = MethodBind.get("Shader", "inspect_native_shader_code", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Shader.mb_inspect_native_shader_code, livePtr)
  }

}

object Shader {
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_code: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_texture_parameter: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_texture_parameter: GDExtensionMethodBindPtr = null
  private[classes] var mb_inspect_native_shader_code: GDExtensionMethodBindPtr = null

  /** Godot enum `Shader.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Spatial: Mode = 0L.asInstanceOf[Mode]
    final val CanvasItem: Mode = 1L.asInstanceOf[Mode]
    final val Particles: Mode = 2L.asInstanceOf[Mode]
    final val Sky: Mode = 3L.asInstanceOf[Mode]
    final val Fog: Mode = 4L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Spatial"
        case 1L => "CanvasItem"
        case 2L => "Particles"
        case 3L => "Sky"
        case 4L => "Fog"
        case other => other.toString
      }
  }
}
