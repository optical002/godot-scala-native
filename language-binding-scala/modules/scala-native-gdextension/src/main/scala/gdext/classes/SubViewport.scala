package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `SubViewport`, extends `Viewport`. */
abstract class SubViewport extends Viewport {
  override def godotClassName: String = "SubViewport"

  /** SubViewport.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.SubViewport.mb_set_size == null) gdext.classes.SubViewport.mb_set_size = MethodBind.get("SubViewport", "set_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_size, livePtr, size)
  }

  /** SubViewport.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.SubViewport.mb_get_size == null) gdext.classes.SubViewport.mb_get_size = MethodBind.get("SubViewport", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.SubViewport.mb_get_size, livePtr)
  }

  /** SubViewport.set_size_2d_override */
  final def setSize2dOverride(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.SubViewport.mb_set_size_2d_override == null) gdext.classes.SubViewport.mb_set_size_2d_override = MethodBind.get("SubViewport", "set_size_2d_override", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_size_2d_override, livePtr, size)
  }

  /** SubViewport.get_size_2d_override */
  final def getSize2dOverride(): gdext.builtin.Vector2i = {
    if (gdext.classes.SubViewport.mb_get_size_2d_override == null) gdext.classes.SubViewport.mb_get_size_2d_override = MethodBind.get("SubViewport", "get_size_2d_override", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.SubViewport.mb_get_size_2d_override, livePtr)
  }

  /** SubViewport.set_size_2d_override_stretch */
  final def setSize2dOverrideStretch(enable: Boolean): Unit = {
    if (gdext.classes.SubViewport.mb_set_size_2d_override_stretch == null) gdext.classes.SubViewport.mb_set_size_2d_override_stretch = MethodBind.get("SubViewport", "set_size_2d_override_stretch", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_size_2d_override_stretch, livePtr, enable)
  }

  /** SubViewport.is_size_2d_override_stretch_enabled */
  final def isSize2dOverrideStretchEnabled(): Boolean = {
    if (gdext.classes.SubViewport.mb_is_size_2d_override_stretch_enabled == null) gdext.classes.SubViewport.mb_is_size_2d_override_stretch_enabled = MethodBind.get("SubViewport", "is_size_2d_override_stretch_enabled", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.SubViewport.mb_is_size_2d_override_stretch_enabled, livePtr)
  }

  /** SubViewport.set_update_mode */
  final def setUpdateMode(mode: Long): Unit = {
    if (gdext.classes.SubViewport.mb_set_update_mode == null) gdext.classes.SubViewport.mb_set_update_mode = MethodBind.get("SubViewport", "set_update_mode", 1295690030L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_update_mode, livePtr, mode)
  }

  /** SubViewport.get_update_mode */
  final def getUpdateMode(): Long = {
    if (gdext.classes.SubViewport.mb_get_update_mode == null) gdext.classes.SubViewport.mb_get_update_mode = MethodBind.get("SubViewport", "get_update_mode", 2980171553L)
    Ptrcall.call0[Long](gdext.classes.SubViewport.mb_get_update_mode, livePtr)
  }

  /** SubViewport.set_clear_mode */
  final def setClearMode(mode: Long): Unit = {
    if (gdext.classes.SubViewport.mb_set_clear_mode == null) gdext.classes.SubViewport.mb_set_clear_mode = MethodBind.get("SubViewport", "set_clear_mode", 2834454712L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_clear_mode, livePtr, mode)
  }

  /** SubViewport.get_clear_mode */
  final def getClearMode(): Long = {
    if (gdext.classes.SubViewport.mb_get_clear_mode == null) gdext.classes.SubViewport.mb_get_clear_mode = MethodBind.get("SubViewport", "get_clear_mode", 331324495L)
    Ptrcall.call0[Long](gdext.classes.SubViewport.mb_get_clear_mode, livePtr)
  }

}

object SubViewport {
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_2d_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size_2d_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size_2d_override_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_size_2d_override_stretch_enabled: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_update_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clear_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clear_mode: GDExtensionMethodBindPtr = null
}
