package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def setUpdateMode(mode: gdext.classes.SubViewport.UpdateMode): Unit = {
    if (gdext.classes.SubViewport.mb_set_update_mode == null) gdext.classes.SubViewport.mb_set_update_mode = MethodBind.get("SubViewport", "set_update_mode", 1295690030L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_update_mode, livePtr, mode)
  }

  /** SubViewport.get_update_mode */
  final def getUpdateMode(): gdext.classes.SubViewport.UpdateMode = {
    if (gdext.classes.SubViewport.mb_get_update_mode == null) gdext.classes.SubViewport.mb_get_update_mode = MethodBind.get("SubViewport", "get_update_mode", 2980171553L)
    gdext.classes.SubViewport.UpdateMode(Ptrcall.call0[Long](gdext.classes.SubViewport.mb_get_update_mode, livePtr))
  }

  /** SubViewport.set_clear_mode */
  final def setClearMode(mode: gdext.classes.SubViewport.ClearMode): Unit = {
    if (gdext.classes.SubViewport.mb_set_clear_mode == null) gdext.classes.SubViewport.mb_set_clear_mode = MethodBind.get("SubViewport", "set_clear_mode", 2834454712L)
    Ptrcall.callVoid1(gdext.classes.SubViewport.mb_set_clear_mode, livePtr, mode)
  }

  /** SubViewport.get_clear_mode */
  final def getClearMode(): gdext.classes.SubViewport.ClearMode = {
    if (gdext.classes.SubViewport.mb_get_clear_mode == null) gdext.classes.SubViewport.mb_get_clear_mode = MethodBind.get("SubViewport", "get_clear_mode", 331324495L)
    gdext.classes.SubViewport.ClearMode(Ptrcall.call0[Long](gdext.classes.SubViewport.mb_get_clear_mode, livePtr))
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

  /** Godot enum `SubViewport.ClearMode`. */
  opaque type ClearMode <: Long = Long

  object ClearMode {
    final val Always: ClearMode = 0L.asInstanceOf[ClearMode]
    final val Never: ClearMode = 1L.asInstanceOf[ClearMode]
    final val Once: ClearMode = 2L.asInstanceOf[ClearMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ClearMode = value.asInstanceOf[ClearMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ClearMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ClearMode]]

    extension (self: ClearMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Always"
        case 1L => "Never"
        case 2L => "Once"
        case other => other.toString
      }
  }

  /** Godot enum `SubViewport.UpdateMode`. */
  opaque type UpdateMode <: Long = Long

  object UpdateMode {
    final val Disabled: UpdateMode = 0L.asInstanceOf[UpdateMode]
    final val Once: UpdateMode = 1L.asInstanceOf[UpdateMode]
    final val WhenVisible: UpdateMode = 2L.asInstanceOf[UpdateMode]
    final val WhenParentVisible: UpdateMode = 3L.asInstanceOf[UpdateMode]
    final val Always: UpdateMode = 4L.asInstanceOf[UpdateMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): UpdateMode = value.asInstanceOf[UpdateMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[UpdateMode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[UpdateMode]]

    extension (self: UpdateMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "Once"
        case 2L => "WhenVisible"
        case 3L => "WhenParentVisible"
        case 4L => "Always"
        case other => other.toString
      }
  }
}
