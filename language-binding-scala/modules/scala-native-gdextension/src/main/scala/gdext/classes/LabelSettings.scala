package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `LabelSettings`, extends `Resource`. */
abstract class LabelSettings extends Resource {
  override def godotClassName: String = "LabelSettings"

  /** LabelSettings.set_line_spacing */
  final def setLineSpacing(spacing: Double): Unit = {
    if (gdext.classes.LabelSettings.mb_set_line_spacing == null) gdext.classes.LabelSettings.mb_set_line_spacing = MethodBind.get("LabelSettings", "set_line_spacing", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_line_spacing, livePtr, spacing)
  }

  /** LabelSettings.get_line_spacing */
  final def getLineSpacing(): Double = {
    if (gdext.classes.LabelSettings.mb_get_line_spacing == null) gdext.classes.LabelSettings.mb_get_line_spacing = MethodBind.get("LabelSettings", "get_line_spacing", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LabelSettings.mb_get_line_spacing, livePtr)
  }

  /** LabelSettings.set_paragraph_spacing */
  final def setParagraphSpacing(spacing: Double): Unit = {
    if (gdext.classes.LabelSettings.mb_set_paragraph_spacing == null) gdext.classes.LabelSettings.mb_set_paragraph_spacing = MethodBind.get("LabelSettings", "set_paragraph_spacing", 373806689L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_paragraph_spacing, livePtr, spacing)
  }

  /** LabelSettings.get_paragraph_spacing */
  final def getParagraphSpacing(): Double = {
    if (gdext.classes.LabelSettings.mb_get_paragraph_spacing == null) gdext.classes.LabelSettings.mb_get_paragraph_spacing = MethodBind.get("LabelSettings", "get_paragraph_spacing", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.LabelSettings.mb_get_paragraph_spacing, livePtr)
  }

  /** LabelSettings.set_font */
  final def setFont(font: Font): Unit = {
    if (gdext.classes.LabelSettings.mb_set_font == null) gdext.classes.LabelSettings.mb_set_font = MethodBind.get("LabelSettings", "set_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_font, livePtr, Wrappers.handle(font))
  }

  /** LabelSettings.get_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFont(): Font = {
    if (gdext.classes.LabelSettings.mb_get_font == null) gdext.classes.LabelSettings.mb_get_font = MethodBind.get("LabelSettings", "get_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_font, livePtr))
  }

  /** LabelSettings.set_font_size */
  final def setFontSize(size: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_font_size == null) gdext.classes.LabelSettings.mb_set_font_size = MethodBind.get("LabelSettings", "set_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_font_size, livePtr, size)
  }

  /** LabelSettings.get_font_size */
  final def getFontSize(): Long = {
    if (gdext.classes.LabelSettings.mb_get_font_size == null) gdext.classes.LabelSettings.mb_get_font_size = MethodBind.get("LabelSettings", "get_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_font_size, livePtr)
  }

  /** LabelSettings.set_font_color */
  final def setFontColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LabelSettings.mb_set_font_color == null) gdext.classes.LabelSettings.mb_set_font_color = MethodBind.get("LabelSettings", "set_font_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_font_color, livePtr, color)
  }

  /** LabelSettings.get_font_color */
  final def getFontColor(): gdext.builtin.Color = {
    if (gdext.classes.LabelSettings.mb_get_font_color == null) gdext.classes.LabelSettings.mb_get_font_color = MethodBind.get("LabelSettings", "get_font_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.LabelSettings.mb_get_font_color, livePtr)
  }

  /** LabelSettings.set_outline_size */
  final def setOutlineSize(size: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_outline_size == null) gdext.classes.LabelSettings.mb_set_outline_size = MethodBind.get("LabelSettings", "set_outline_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_outline_size, livePtr, size)
  }

  /** LabelSettings.get_outline_size */
  final def getOutlineSize(): Long = {
    if (gdext.classes.LabelSettings.mb_get_outline_size == null) gdext.classes.LabelSettings.mb_get_outline_size = MethodBind.get("LabelSettings", "get_outline_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_outline_size, livePtr)
  }

  /** LabelSettings.set_outline_color */
  final def setOutlineColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LabelSettings.mb_set_outline_color == null) gdext.classes.LabelSettings.mb_set_outline_color = MethodBind.get("LabelSettings", "set_outline_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_outline_color, livePtr, color)
  }

  /** LabelSettings.get_outline_color */
  final def getOutlineColor(): gdext.builtin.Color = {
    if (gdext.classes.LabelSettings.mb_get_outline_color == null) gdext.classes.LabelSettings.mb_get_outline_color = MethodBind.get("LabelSettings", "get_outline_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.LabelSettings.mb_get_outline_color, livePtr)
  }

  /** LabelSettings.set_shadow_size */
  final def setShadowSize(size: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_shadow_size == null) gdext.classes.LabelSettings.mb_set_shadow_size = MethodBind.get("LabelSettings", "set_shadow_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_shadow_size, livePtr, size)
  }

  /** LabelSettings.get_shadow_size */
  final def getShadowSize(): Long = {
    if (gdext.classes.LabelSettings.mb_get_shadow_size == null) gdext.classes.LabelSettings.mb_get_shadow_size = MethodBind.get("LabelSettings", "get_shadow_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_shadow_size, livePtr)
  }

  /** LabelSettings.set_shadow_color */
  final def setShadowColor(color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LabelSettings.mb_set_shadow_color == null) gdext.classes.LabelSettings.mb_set_shadow_color = MethodBind.get("LabelSettings", "set_shadow_color", 2920490490L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_shadow_color, livePtr, color)
  }

  /** LabelSettings.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color = {
    if (gdext.classes.LabelSettings.mb_get_shadow_color == null) gdext.classes.LabelSettings.mb_get_shadow_color = MethodBind.get("LabelSettings", "get_shadow_color", 3444240500L)
    Ptrcall.call0[gdext.builtin.Color](gdext.classes.LabelSettings.mb_get_shadow_color, livePtr)
  }

  /** LabelSettings.set_shadow_offset */
  final def setShadowOffset(offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.LabelSettings.mb_set_shadow_offset == null) gdext.classes.LabelSettings.mb_set_shadow_offset = MethodBind.get("LabelSettings", "set_shadow_offset", 743155724L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_shadow_offset, livePtr, offset)
  }

  /** LabelSettings.get_shadow_offset */
  final def getShadowOffset(): gdext.builtin.Vector2 = {
    if (gdext.classes.LabelSettings.mb_get_shadow_offset == null) gdext.classes.LabelSettings.mb_get_shadow_offset = MethodBind.get("LabelSettings", "get_shadow_offset", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.LabelSettings.mb_get_shadow_offset, livePtr)
  }

  /** LabelSettings.get_stacked_outline_count */
  final def getStackedOutlineCount(): Long = {
    if (gdext.classes.LabelSettings.mb_get_stacked_outline_count == null) gdext.classes.LabelSettings.mb_get_stacked_outline_count = MethodBind.get("LabelSettings", "get_stacked_outline_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_stacked_outline_count, livePtr)
  }

  /** LabelSettings.set_stacked_outline_count */
  final def setStackedOutlineCount(count: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_outline_count == null) gdext.classes.LabelSettings.mb_set_stacked_outline_count = MethodBind.get("LabelSettings", "set_stacked_outline_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_stacked_outline_count, livePtr, count)
  }

  /** LabelSettings.add_stacked_outline */
  final def addStackedOutline(index: Long = -1L): Unit = {
    if (gdext.classes.LabelSettings.mb_add_stacked_outline == null) gdext.classes.LabelSettings.mb_add_stacked_outline = MethodBind.get("LabelSettings", "add_stacked_outline", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_add_stacked_outline, livePtr, index)
  }

  /** LabelSettings.move_stacked_outline */
  final def moveStackedOutline(fromIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_move_stacked_outline == null) gdext.classes.LabelSettings.mb_move_stacked_outline = MethodBind.get("LabelSettings", "move_stacked_outline", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_move_stacked_outline, livePtr, fromIndex, toPosition)
  }

  /** LabelSettings.remove_stacked_outline */
  final def removeStackedOutline(index: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_remove_stacked_outline == null) gdext.classes.LabelSettings.mb_remove_stacked_outline = MethodBind.get("LabelSettings", "remove_stacked_outline", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_remove_stacked_outline, livePtr, index)
  }

  /** LabelSettings.set_stacked_outline_size */
  final def setStackedOutlineSize(index: Long, size: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_outline_size == null) gdext.classes.LabelSettings.mb_set_stacked_outline_size = MethodBind.get("LabelSettings", "set_stacked_outline_size", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_set_stacked_outline_size, livePtr, index, size)
  }

  /** LabelSettings.get_stacked_outline_size */
  final def getStackedOutlineSize(index: Long): Long = {
    if (gdext.classes.LabelSettings.mb_get_stacked_outline_size == null) gdext.classes.LabelSettings.mb_get_stacked_outline_size = MethodBind.get("LabelSettings", "get_stacked_outline_size", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LabelSettings.mb_get_stacked_outline_size, livePtr, index)
  }

  /** LabelSettings.set_stacked_outline_color */
  final def setStackedOutlineColor(index: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_outline_color == null) gdext.classes.LabelSettings.mb_set_stacked_outline_color = MethodBind.get("LabelSettings", "set_stacked_outline_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_set_stacked_outline_color, livePtr, index, color)
  }

  /** LabelSettings.get_stacked_outline_color */
  final def getStackedOutlineColor(index: Long): gdext.builtin.Color = {
    if (gdext.classes.LabelSettings.mb_get_stacked_outline_color == null) gdext.classes.LabelSettings.mb_get_stacked_outline_color = MethodBind.get("LabelSettings", "get_stacked_outline_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.LabelSettings.mb_get_stacked_outline_color, livePtr, index)
  }

  /** LabelSettings.get_stacked_shadow_count */
  final def getStackedShadowCount(): Long = {
    if (gdext.classes.LabelSettings.mb_get_stacked_shadow_count == null) gdext.classes.LabelSettings.mb_get_stacked_shadow_count = MethodBind.get("LabelSettings", "get_stacked_shadow_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.LabelSettings.mb_get_stacked_shadow_count, livePtr)
  }

  /** LabelSettings.set_stacked_shadow_count */
  final def setStackedShadowCount(count: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_shadow_count == null) gdext.classes.LabelSettings.mb_set_stacked_shadow_count = MethodBind.get("LabelSettings", "set_stacked_shadow_count", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_set_stacked_shadow_count, livePtr, count)
  }

  /** LabelSettings.add_stacked_shadow */
  final def addStackedShadow(index: Long = -1L): Unit = {
    if (gdext.classes.LabelSettings.mb_add_stacked_shadow == null) gdext.classes.LabelSettings.mb_add_stacked_shadow = MethodBind.get("LabelSettings", "add_stacked_shadow", 1025054187L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_add_stacked_shadow, livePtr, index)
  }

  /** LabelSettings.move_stacked_shadow */
  final def moveStackedShadow(fromIndex: Long, toPosition: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_move_stacked_shadow == null) gdext.classes.LabelSettings.mb_move_stacked_shadow = MethodBind.get("LabelSettings", "move_stacked_shadow", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_move_stacked_shadow, livePtr, fromIndex, toPosition)
  }

  /** LabelSettings.remove_stacked_shadow */
  final def removeStackedShadow(index: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_remove_stacked_shadow == null) gdext.classes.LabelSettings.mb_remove_stacked_shadow = MethodBind.get("LabelSettings", "remove_stacked_shadow", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.LabelSettings.mb_remove_stacked_shadow, livePtr, index)
  }

  /** LabelSettings.set_stacked_shadow_offset */
  final def setStackedShadowOffset(index: Long, offset: gdext.builtin.Vector2): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_shadow_offset == null) gdext.classes.LabelSettings.mb_set_stacked_shadow_offset = MethodBind.get("LabelSettings", "set_stacked_shadow_offset", 163021252L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_set_stacked_shadow_offset, livePtr, index, offset)
  }

  /** LabelSettings.get_stacked_shadow_offset */
  final def getStackedShadowOffset(index: Long): gdext.builtin.Vector2 = {
    if (gdext.classes.LabelSettings.mb_get_stacked_shadow_offset == null) gdext.classes.LabelSettings.mb_get_stacked_shadow_offset = MethodBind.get("LabelSettings", "get_stacked_shadow_offset", 2299179447L)
    Ptrcall.call1[Long, gdext.builtin.Vector2](gdext.classes.LabelSettings.mb_get_stacked_shadow_offset, livePtr, index)
  }

  /** LabelSettings.set_stacked_shadow_color */
  final def setStackedShadowColor(index: Long, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_shadow_color == null) gdext.classes.LabelSettings.mb_set_stacked_shadow_color = MethodBind.get("LabelSettings", "set_stacked_shadow_color", 2878471219L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_set_stacked_shadow_color, livePtr, index, color)
  }

  /** LabelSettings.get_stacked_shadow_color */
  final def getStackedShadowColor(index: Long): gdext.builtin.Color = {
    if (gdext.classes.LabelSettings.mb_get_stacked_shadow_color == null) gdext.classes.LabelSettings.mb_get_stacked_shadow_color = MethodBind.get("LabelSettings", "get_stacked_shadow_color", 3457211756L)
    Ptrcall.call1[Long, gdext.builtin.Color](gdext.classes.LabelSettings.mb_get_stacked_shadow_color, livePtr, index)
  }

  /** LabelSettings.set_stacked_shadow_outline_size */
  final def setStackedShadowOutlineSize(index: Long, size: Long): Unit = {
    if (gdext.classes.LabelSettings.mb_set_stacked_shadow_outline_size == null) gdext.classes.LabelSettings.mb_set_stacked_shadow_outline_size = MethodBind.get("LabelSettings", "set_stacked_shadow_outline_size", 3937882851L)
    Ptrcall.callVoid2(gdext.classes.LabelSettings.mb_set_stacked_shadow_outline_size, livePtr, index, size)
  }

  /** LabelSettings.get_stacked_shadow_outline_size */
  final def getStackedShadowOutlineSize(index: Long): Long = {
    if (gdext.classes.LabelSettings.mb_get_stacked_shadow_outline_size == null) gdext.classes.LabelSettings.mb_get_stacked_shadow_outline_size = MethodBind.get("LabelSettings", "get_stacked_shadow_outline_size", 923996154L)
    Ptrcall.call1[Long, Long](gdext.classes.LabelSettings.mb_get_stacked_shadow_outline_size, livePtr, index)
  }

}

object LabelSettings {
  private[classes] var mb_set_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_line_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_paragraph_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_paragraph_spacing: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_outline_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_outline_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_outline_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_outline_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_stacked_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_stacked_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_stacked_outline: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_outline_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_outline_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_shadow_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_shadow_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_stacked_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_stacked_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_stacked_shadow: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_shadow_offset: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_shadow_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stacked_shadow_outline_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stacked_shadow_outline_size: GDExtensionMethodBindPtr = null
}
