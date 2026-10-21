package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Theme`, extends `Resource`. */
abstract class Theme extends Resource {
  override def godotClassName: String = "Theme"

  /** Theme.set_icon */
  final def setIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, texture: Texture2D): Unit = {
    if (gdext.classes.Theme.mb_set_icon == null) gdext.classes.Theme.mb_set_icon = MethodBind.get("Theme", "set_icon", 2188371082L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_icon, livePtr, name, theme_type, Wrappers.handle(texture))
  }

  /** Theme.get_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Texture2D = {
    if (gdext.classes.Theme.mb_get_icon == null) gdext.classes.Theme.mb_get_icon = MethodBind.get("Theme", "get_icon", 934555193L)
    Wrappers.owned[Texture2D](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Theme.mb_get_icon, livePtr, name, theme_type))
  }

  /** Theme.has_icon */
  final def hasIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_icon == null) gdext.classes.Theme.mb_has_icon = MethodBind.get("Theme", "has_icon", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_icon, livePtr, name, theme_type)
  }

  /** Theme.rename_icon */
  final def renameIcon(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_icon == null) gdext.classes.Theme.mb_rename_icon = MethodBind.get("Theme", "rename_icon", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_icon, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_icon */
  final def clearIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_icon == null) gdext.classes.Theme.mb_clear_icon = MethodBind.get("Theme", "clear_icon", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_icon, livePtr, name, theme_type)
  }

  /** Theme.set_stylebox */
  final def setStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, texture: StyleBox): Unit = {
    if (gdext.classes.Theme.mb_set_stylebox == null) gdext.classes.Theme.mb_set_stylebox = MethodBind.get("Theme", "set_stylebox", 2075907568L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_stylebox, livePtr, name, theme_type, Wrappers.handle(texture))
  }

  /** Theme.get_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): StyleBox = {
    if (gdext.classes.Theme.mb_get_stylebox == null) gdext.classes.Theme.mb_get_stylebox = MethodBind.get("Theme", "get_stylebox", 3405608165L)
    Wrappers.owned[StyleBox](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Theme.mb_get_stylebox, livePtr, name, theme_type))
  }

  /** Theme.has_stylebox */
  final def hasStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_stylebox == null) gdext.classes.Theme.mb_has_stylebox = MethodBind.get("Theme", "has_stylebox", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_stylebox, livePtr, name, theme_type)
  }

  /** Theme.rename_stylebox */
  final def renameStylebox(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_stylebox == null) gdext.classes.Theme.mb_rename_stylebox = MethodBind.get("Theme", "rename_stylebox", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_stylebox, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_stylebox */
  final def clearStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_stylebox == null) gdext.classes.Theme.mb_clear_stylebox = MethodBind.get("Theme", "clear_stylebox", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_stylebox, livePtr, name, theme_type)
  }

  /** Theme.set_font */
  final def setFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, font: Font): Unit = {
    if (gdext.classes.Theme.mb_set_font == null) gdext.classes.Theme.mb_set_font = MethodBind.get("Theme", "set_font", 177292320L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_font, livePtr, name, theme_type, Wrappers.handle(font))
  }

  /** Theme.get_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Font = {
    if (gdext.classes.Theme.mb_get_font == null) gdext.classes.Theme.mb_get_font = MethodBind.get("Theme", "get_font", 3445063586L)
    Wrappers.owned[Font](Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Theme.mb_get_font, livePtr, name, theme_type))
  }

  /** Theme.has_font */
  final def hasFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_font == null) gdext.classes.Theme.mb_has_font = MethodBind.get("Theme", "has_font", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_font, livePtr, name, theme_type)
  }

  /** Theme.rename_font */
  final def renameFont(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_font == null) gdext.classes.Theme.mb_rename_font = MethodBind.get("Theme", "rename_font", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_font, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_font */
  final def clearFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_font == null) gdext.classes.Theme.mb_clear_font = MethodBind.get("Theme", "clear_font", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_font, livePtr, name, theme_type)
  }

  /** Theme.set_font_size */
  final def setFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, font_size: Long): Unit = {
    if (gdext.classes.Theme.mb_set_font_size == null) gdext.classes.Theme.mb_set_font_size = MethodBind.get("Theme", "set_font_size", 281601298L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_font_size, livePtr, name, theme_type, font_size)
  }

  /** Theme.get_font_size */
  final def getFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long = {
    if (gdext.classes.Theme.mb_get_font_size == null) gdext.classes.Theme.mb_get_font_size = MethodBind.get("Theme", "get_font_size", 2419549490L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Theme.mb_get_font_size, livePtr, name, theme_type)
  }

  /** Theme.has_font_size */
  final def hasFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_font_size == null) gdext.classes.Theme.mb_has_font_size = MethodBind.get("Theme", "has_font_size", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_font_size, livePtr, name, theme_type)
  }

  /** Theme.rename_font_size */
  final def renameFontSize(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_font_size == null) gdext.classes.Theme.mb_rename_font_size = MethodBind.get("Theme", "rename_font_size", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_font_size, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_font_size */
  final def clearFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_font_size == null) gdext.classes.Theme.mb_clear_font_size = MethodBind.get("Theme", "clear_font_size", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_font_size, livePtr, name, theme_type)
  }

  /** Theme.set_color */
  final def setColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Theme.mb_set_color == null) gdext.classes.Theme.mb_set_color = MethodBind.get("Theme", "set_color", 4111215154L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_color, livePtr, name, theme_type, color)
  }

  /** Theme.get_color */
  final def getColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): gdext.builtin.Color = {
    if (gdext.classes.Theme.mb_get_color == null) gdext.classes.Theme.mb_get_color = MethodBind.get("Theme", "get_color", 2015923404L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.Color](gdext.classes.Theme.mb_get_color, livePtr, name, theme_type)
  }

  /** Theme.has_color */
  final def hasColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_color == null) gdext.classes.Theme.mb_has_color = MethodBind.get("Theme", "has_color", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_color, livePtr, name, theme_type)
  }

  /** Theme.rename_color */
  final def renameColor(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_color == null) gdext.classes.Theme.mb_rename_color = MethodBind.get("Theme", "rename_color", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_color, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_color */
  final def clearColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_color == null) gdext.classes.Theme.mb_clear_color = MethodBind.get("Theme", "clear_color", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_color, livePtr, name, theme_type)
  }

  /** Theme.set_constant */
  final def setConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, constant: Long): Unit = {
    if (gdext.classes.Theme.mb_set_constant == null) gdext.classes.Theme.mb_set_constant = MethodBind.get("Theme", "set_constant", 281601298L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_constant, livePtr, name, theme_type, constant)
  }

  /** Theme.get_constant */
  final def getConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long = {
    if (gdext.classes.Theme.mb_get_constant == null) gdext.classes.Theme.mb_get_constant = MethodBind.get("Theme", "get_constant", 2419549490L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](gdext.classes.Theme.mb_get_constant, livePtr, name, theme_type)
  }

  /** Theme.has_constant */
  final def hasConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_constant == null) gdext.classes.Theme.mb_has_constant = MethodBind.get("Theme", "has_constant", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_constant, livePtr, name, theme_type)
  }

  /** Theme.rename_constant */
  final def renameConstant(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_constant == null) gdext.classes.Theme.mb_rename_constant = MethodBind.get("Theme", "rename_constant", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_constant, livePtr, old_name, name, theme_type)
  }

  /** Theme.clear_constant */
  final def clearConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_constant == null) gdext.classes.Theme.mb_clear_constant = MethodBind.get("Theme", "clear_constant", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_constant, livePtr, name, theme_type)
  }

  /** Theme.set_default_base_scale */
  final def setDefaultBaseScale(base_scale: Double): Unit = {
    if (gdext.classes.Theme.mb_set_default_base_scale == null) gdext.classes.Theme.mb_set_default_base_scale = MethodBind.get("Theme", "set_default_base_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_set_default_base_scale, livePtr, base_scale)
  }

  /** Theme.get_default_base_scale */
  final def getDefaultBaseScale(): Double = {
    if (gdext.classes.Theme.mb_get_default_base_scale == null) gdext.classes.Theme.mb_get_default_base_scale = MethodBind.get("Theme", "get_default_base_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Theme.mb_get_default_base_scale, livePtr)
  }

  /** Theme.has_default_base_scale */
  final def hasDefaultBaseScale(): Boolean = {
    if (gdext.classes.Theme.mb_has_default_base_scale == null) gdext.classes.Theme.mb_has_default_base_scale = MethodBind.get("Theme", "has_default_base_scale", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Theme.mb_has_default_base_scale, livePtr)
  }

  /** Theme.set_default_font */
  final def setDefaultFont(font: Font): Unit = {
    if (gdext.classes.Theme.mb_set_default_font == null) gdext.classes.Theme.mb_set_default_font = MethodBind.get("Theme", "set_default_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_set_default_font, livePtr, Wrappers.handle(font))
  }

  /** Theme.get_default_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDefaultFont(): Font = {
    if (gdext.classes.Theme.mb_get_default_font == null) gdext.classes.Theme.mb_get_default_font = MethodBind.get("Theme", "get_default_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.Theme.mb_get_default_font, livePtr))
  }

  /** Theme.has_default_font */
  final def hasDefaultFont(): Boolean = {
    if (gdext.classes.Theme.mb_has_default_font == null) gdext.classes.Theme.mb_has_default_font = MethodBind.get("Theme", "has_default_font", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Theme.mb_has_default_font, livePtr)
  }

  /** Theme.set_default_font_size */
  final def setDefaultFontSize(font_size: Long): Unit = {
    if (gdext.classes.Theme.mb_set_default_font_size == null) gdext.classes.Theme.mb_set_default_font_size = MethodBind.get("Theme", "set_default_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_set_default_font_size, livePtr, font_size)
  }

  /** Theme.get_default_font_size */
  final def getDefaultFontSize(): Long = {
    if (gdext.classes.Theme.mb_get_default_font_size == null) gdext.classes.Theme.mb_get_default_font_size = MethodBind.get("Theme", "get_default_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Theme.mb_get_default_font_size, livePtr)
  }

  /** Theme.has_default_font_size */
  final def hasDefaultFontSize(): Boolean = {
    if (gdext.classes.Theme.mb_has_default_font_size == null) gdext.classes.Theme.mb_has_default_font_size = MethodBind.get("Theme", "has_default_font_size", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Theme.mb_has_default_font_size, livePtr)
  }

  /** Theme.has_theme_item */
  final def hasThemeItem(data_type: Long, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_has_theme_item == null) gdext.classes.Theme.mb_has_theme_item = MethodBind.get("Theme", "has_theme_item", 1739311056L)
    Ptrcall.call3[Long, gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_has_theme_item, livePtr, data_type, name, theme_type)
  }

  /** Theme.rename_theme_item */
  final def renameThemeItem(data_type: Long, old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_theme_item == null) gdext.classes.Theme.mb_rename_theme_item = MethodBind.get("Theme", "rename_theme_item", 3900867553L)
    Ptrcall.callVoid4(gdext.classes.Theme.mb_rename_theme_item, livePtr, data_type, old_name, name, theme_type)
  }

  /** Theme.clear_theme_item */
  final def clearThemeItem(data_type: Long, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_theme_item == null) gdext.classes.Theme.mb_clear_theme_item = MethodBind.get("Theme", "clear_theme_item", 2965505587L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_clear_theme_item, livePtr, data_type, name, theme_type)
  }

  /** Theme.set_type_variation */
  final def setTypeVariation(theme_type: gdext.builtin.StringName, base_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_set_type_variation == null) gdext.classes.Theme.mb_set_type_variation = MethodBind.get("Theme", "set_type_variation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_set_type_variation, livePtr, theme_type, base_type)
  }

  /** Theme.is_type_variation */
  final def isTypeVariation(theme_type: gdext.builtin.StringName, base_type: gdext.builtin.StringName): Boolean = {
    if (gdext.classes.Theme.mb_is_type_variation == null) gdext.classes.Theme.mb_is_type_variation = MethodBind.get("Theme", "is_type_variation", 471820014L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](gdext.classes.Theme.mb_is_type_variation, livePtr, theme_type, base_type)
  }

  /** Theme.clear_type_variation */
  final def clearTypeVariation(theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_clear_type_variation == null) gdext.classes.Theme.mb_clear_type_variation = MethodBind.get("Theme", "clear_type_variation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_clear_type_variation, livePtr, theme_type)
  }

  /** Theme.get_type_variation_base */
  final def getTypeVariationBase(theme_type: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.Theme.mb_get_type_variation_base == null) gdext.classes.Theme.mb_get_type_variation_base = MethodBind.get("Theme", "get_type_variation_base", 1965194235L)
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.Theme.mb_get_type_variation_base, livePtr, theme_type)
  }

  /** Theme.add_type */
  final def addType(theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_add_type == null) gdext.classes.Theme.mb_add_type = MethodBind.get("Theme", "add_type", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_add_type, livePtr, theme_type)
  }

  /** Theme.remove_type */
  final def removeType(theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_remove_type == null) gdext.classes.Theme.mb_remove_type = MethodBind.get("Theme", "remove_type", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_remove_type, livePtr, theme_type)
  }

  /** Theme.rename_type */
  final def renameType(old_theme_type: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Theme.mb_rename_type == null) gdext.classes.Theme.mb_rename_type = MethodBind.get("Theme", "rename_type", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_rename_type, livePtr, old_theme_type, theme_type)
  }

  /** Theme.merge_with */
  final def mergeWith(other: Theme): Unit = {
    if (gdext.classes.Theme.mb_merge_with == null) gdext.classes.Theme.mb_merge_with = MethodBind.get("Theme", "merge_with", 2326690814L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_merge_with, livePtr, Wrappers.handle(other))
  }

  /** Theme.clear */
  final def clear(): Unit = {
    if (gdext.classes.Theme.mb_clear == null) gdext.classes.Theme.mb_clear = MethodBind.get("Theme", "clear", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Theme.mb_clear, livePtr)
  }

}

object Theme {
  private[classes] var mb_set_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_default_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_default_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_default_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_default_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_default_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_theme_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_theme_item: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_type_variation_base: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_rename_type: GDExtensionMethodBindPtr = null
  private[classes] var mb_merge_with: GDExtensionMethodBindPtr = null
  private[classes] var mb_clear: GDExtensionMethodBindPtr = null
}
