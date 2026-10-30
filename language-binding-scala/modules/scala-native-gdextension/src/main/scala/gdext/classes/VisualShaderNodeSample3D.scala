package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeSample3D`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSample3D extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSample3D"

  /** VisualShaderNodeSample3D.set_source */
  final def setSource(value: gdext.classes.VisualShaderNodeSample3D.Source): Unit = {
    if (gdext.classes.VisualShaderNodeSample3D.mb_set_source == null) gdext.classes.VisualShaderNodeSample3D.mb_set_source = MethodBind.get("VisualShaderNodeSample3D", "set_source", 3315130991L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeSample3D.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeSample3D.get_source */
  final def getSource(): gdext.classes.VisualShaderNodeSample3D.Source = {
    if (gdext.classes.VisualShaderNodeSample3D.mb_get_source == null) gdext.classes.VisualShaderNodeSample3D.mb_get_source = MethodBind.get("VisualShaderNodeSample3D", "get_source", 1079494121L)
    gdext.classes.VisualShaderNodeSample3D.Source(Ptrcall.call0[Long](gdext.classes.VisualShaderNodeSample3D.mb_get_source, livePtr))
  }

}

object VisualShaderNodeSample3D {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null

  /** Godot enum `VisualShaderNodeSample3D.Source`. */
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
}
