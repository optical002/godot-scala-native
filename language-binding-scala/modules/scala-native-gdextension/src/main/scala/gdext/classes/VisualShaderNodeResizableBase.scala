package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `VisualShaderNodeResizableBase`, extends `VisualShaderNode`. */
abstract class VisualShaderNodeResizableBase extends VisualShaderNode {
  override def godotClassName: String = "VisualShaderNodeResizableBase"

  /** VisualShaderNodeResizableBase.set_size */
  final def setSize(size: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.VisualShaderNodeResizableBase.mb_set_size == null) gdext.classes.VisualShaderNodeResizableBase.mb_set_size = MethodBind.get("VisualShaderNodeResizableBase", "set_size", 743155724L)
    Ptrcall.callVoid1(gdext.classes.VisualShaderNodeResizableBase.mb_set_size, livePtr, size)
  }

  /** VisualShaderNodeResizableBase.get_size */
  final def getSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.VisualShaderNodeResizableBase.mb_get_size == null) gdext.classes.VisualShaderNodeResizableBase.mb_get_size = MethodBind.get("VisualShaderNodeResizableBase", "get_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.VisualShaderNodeResizableBase.mb_get_size, livePtr)
  }

}

object VisualShaderNodeResizableBase {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
}
