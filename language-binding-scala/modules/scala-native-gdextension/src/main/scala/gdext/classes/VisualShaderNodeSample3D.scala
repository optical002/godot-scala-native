package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeSample3D`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeSample3D extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeSample3D"

  /** VisualShaderNodeSample3D.set_source */
  final def setSource(value: Long): Unit = {
    if (gdext.classes.VisualShaderNodeSample3D.mb_set_source == null) gdext.classes.VisualShaderNodeSample3D.mb_set_source = MethodBind.get("VisualShaderNodeSample3D", "set_source", 3315130991L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeSample3D.mb_set_source, livePtr, value)
  }

  /** VisualShaderNodeSample3D.get_source */
  final def getSource(): Long = {
    if (gdext.classes.VisualShaderNodeSample3D.mb_get_source == null) gdext.classes.VisualShaderNodeSample3D.mb_get_source = MethodBind.get("VisualShaderNodeSample3D", "get_source", 1079494121L)
    Ptrcall.call0[Long](gdext.classes.VisualShaderNodeSample3D.mb_get_source, livePtr)
  }

}

object VisualShaderNodeSample3D {
  private[classes] var mb_set_source: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_source: GDExtensionMethodBindPtr = null
}
