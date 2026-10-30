package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Theme`, extends `Resource`. */
abstract class Theme extends Resource {
  override def godotClassName: String = "Theme"

  /** Theme.set_icon */
  final def setIcon(name: String, themeType: String, texture: Texture2D): Unit = {
    if (gdext.classes.Theme.mb_set_icon == null) gdext.classes.Theme.mb_set_icon = MethodBind.get("Theme", "set_icon", 2188371082L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_icon, livePtr, SnArg(name), SnArg(themeType), Wrappers.handle(texture))
  }

  /** Theme.get_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getIcon(name: String, themeType: String): Texture2D = {
    if (gdext.classes.Theme.mb_get_icon == null) gdext.classes.Theme.mb_get_icon = MethodBind.get("Theme", "get_icon", 934555193L)
    Wrappers.owned[Texture2D](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Theme.mb_get_icon, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Theme.has_icon */
  final def hasIcon(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_icon == null) gdext.classes.Theme.mb_has_icon = MethodBind.get("Theme", "has_icon", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_icon, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_icon */
  final def renameIcon(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_icon == null) gdext.classes.Theme.mb_rename_icon = MethodBind.get("Theme", "rename_icon", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_icon, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_icon */
  final def clearIcon(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_icon == null) gdext.classes.Theme.mb_clear_icon = MethodBind.get("Theme", "clear_icon", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_icon, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_stylebox */
  final def setStylebox(name: String, themeType: String, texture: StyleBox): Unit = {
    if (gdext.classes.Theme.mb_set_stylebox == null) gdext.classes.Theme.mb_set_stylebox = MethodBind.get("Theme", "set_stylebox", 2075907568L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_stylebox, livePtr, SnArg(name), SnArg(themeType), Wrappers.handle(texture))
  }

  /** Theme.get_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getStylebox(name: String, themeType: String): StyleBox = {
    if (gdext.classes.Theme.mb_get_stylebox == null) gdext.classes.Theme.mb_get_stylebox = MethodBind.get("Theme", "get_stylebox", 3405608165L)
    Wrappers.owned[StyleBox](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Theme.mb_get_stylebox, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Theme.has_stylebox */
  final def hasStylebox(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_stylebox == null) gdext.classes.Theme.mb_has_stylebox = MethodBind.get("Theme", "has_stylebox", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_stylebox, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_stylebox */
  final def renameStylebox(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_stylebox == null) gdext.classes.Theme.mb_rename_stylebox = MethodBind.get("Theme", "rename_stylebox", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_stylebox, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_stylebox */
  final def clearStylebox(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_stylebox == null) gdext.classes.Theme.mb_clear_stylebox = MethodBind.get("Theme", "clear_stylebox", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_stylebox, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_font */
  final def setFont(name: String, themeType: String, font: Font): Unit = {
    if (gdext.classes.Theme.mb_set_font == null) gdext.classes.Theme.mb_set_font = MethodBind.get("Theme", "set_font", 177292320L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_font, livePtr, SnArg(name), SnArg(themeType), Wrappers.handle(font))
  }

  /** Theme.get_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFont(name: String, themeType: String): Font = {
    if (gdext.classes.Theme.mb_get_font == null) gdext.classes.Theme.mb_get_font = MethodBind.get("Theme", "get_font", 3445063586L)
    Wrappers.owned[Font](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Theme.mb_get_font, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Theme.has_font */
  final def hasFont(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_font == null) gdext.classes.Theme.mb_has_font = MethodBind.get("Theme", "has_font", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_font, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_font */
  final def renameFont(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_font == null) gdext.classes.Theme.mb_rename_font = MethodBind.get("Theme", "rename_font", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_font, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_font */
  final def clearFont(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_font == null) gdext.classes.Theme.mb_clear_font = MethodBind.get("Theme", "clear_font", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_font, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_font_size */
  final def setFontSize(name: String, themeType: String, fontSize: Long): Unit = {
    if (gdext.classes.Theme.mb_set_font_size == null) gdext.classes.Theme.mb_set_font_size = MethodBind.get("Theme", "set_font_size", 281601298L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_font_size, livePtr, SnArg(name), SnArg(themeType), fontSize)
  }

  /** Theme.get_font_size */
  final def getFontSize(name: String, themeType: String): Long = {
    if (gdext.classes.Theme.mb_get_font_size == null) gdext.classes.Theme.mb_get_font_size = MethodBind.get("Theme", "get_font_size", 2419549490L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Theme.mb_get_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.has_font_size */
  final def hasFontSize(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_font_size == null) gdext.classes.Theme.mb_has_font_size = MethodBind.get("Theme", "has_font_size", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_font_size */
  final def renameFontSize(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_font_size == null) gdext.classes.Theme.mb_rename_font_size = MethodBind.get("Theme", "rename_font_size", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_font_size, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_font_size */
  final def clearFontSize(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_font_size == null) gdext.classes.Theme.mb_clear_font_size = MethodBind.get("Theme", "clear_font_size", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_color */
  final def setColor(name: String, themeType: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Theme.mb_set_color == null) gdext.classes.Theme.mb_set_color = MethodBind.get("Theme", "set_color", 4111215154L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_color, livePtr, SnArg(name), SnArg(themeType), color)
  }

  /** Theme.get_color */
  final def getColor(name: String, themeType: String): gdext.builtin.Color = {
    if (gdext.classes.Theme.mb_get_color == null) gdext.classes.Theme.mb_get_color = MethodBind.get("Theme", "get_color", 2015923404L)
    Ptrcall.call2[SnArg, SnArg, gdext.builtin.Color](gdext.classes.Theme.mb_get_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.has_color */
  final def hasColor(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_color == null) gdext.classes.Theme.mb_has_color = MethodBind.get("Theme", "has_color", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_color */
  final def renameColor(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_color == null) gdext.classes.Theme.mb_rename_color = MethodBind.get("Theme", "rename_color", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_color, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_color */
  final def clearColor(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_color == null) gdext.classes.Theme.mb_clear_color = MethodBind.get("Theme", "clear_color", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_constant */
  final def setConstant(name: String, themeType: String, constant: Long): Unit = {
    if (gdext.classes.Theme.mb_set_constant == null) gdext.classes.Theme.mb_set_constant = MethodBind.get("Theme", "set_constant", 281601298L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_set_constant, livePtr, SnArg(name), SnArg(themeType), constant)
  }

  /** Theme.get_constant */
  final def getConstant(name: String, themeType: String): Long = {
    if (gdext.classes.Theme.mb_get_constant == null) gdext.classes.Theme.mb_get_constant = MethodBind.get("Theme", "get_constant", 2419549490L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Theme.mb_get_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.has_constant */
  final def hasConstant(name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_constant == null) gdext.classes.Theme.mb_has_constant = MethodBind.get("Theme", "has_constant", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_constant */
  final def renameConstant(oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_constant == null) gdext.classes.Theme.mb_rename_constant = MethodBind.get("Theme", "rename_constant", 642128662L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_rename_constant, livePtr, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_constant */
  final def clearConstant(name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_constant == null) gdext.classes.Theme.mb_clear_constant = MethodBind.get("Theme", "clear_constant", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_clear_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_default_base_scale */
  final def setDefaultBaseScale(baseScale: Double): Unit = {
    if (gdext.classes.Theme.mb_set_default_base_scale == null) gdext.classes.Theme.mb_set_default_base_scale = MethodBind.get("Theme", "set_default_base_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_set_default_base_scale, livePtr, baseScale)
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
  final def setDefaultFontSize(fontSize: Long): Unit = {
    if (gdext.classes.Theme.mb_set_default_font_size == null) gdext.classes.Theme.mb_set_default_font_size = MethodBind.get("Theme", "set_default_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_set_default_font_size, livePtr, fontSize)
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
  final def hasThemeItem(dataType: gdext.classes.Theme.DataType, name: String, themeType: String): Boolean = {
    if (gdext.classes.Theme.mb_has_theme_item == null) gdext.classes.Theme.mb_has_theme_item = MethodBind.get("Theme", "has_theme_item", 1739311056L)
    Ptrcall.call3[Long, SnArg, SnArg, Boolean](gdext.classes.Theme.mb_has_theme_item, livePtr, dataType, SnArg(name), SnArg(themeType))
  }

  /** Theme.rename_theme_item */
  final def renameThemeItem(dataType: gdext.classes.Theme.DataType, oldName: String, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_theme_item == null) gdext.classes.Theme.mb_rename_theme_item = MethodBind.get("Theme", "rename_theme_item", 3900867553L)
    Ptrcall.callVoid4(gdext.classes.Theme.mb_rename_theme_item, livePtr, dataType, SnArg(oldName), SnArg(name), SnArg(themeType))
  }

  /** Theme.clear_theme_item */
  final def clearThemeItem(dataType: gdext.classes.Theme.DataType, name: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_theme_item == null) gdext.classes.Theme.mb_clear_theme_item = MethodBind.get("Theme", "clear_theme_item", 2965505587L)
    Ptrcall.callVoid3(gdext.classes.Theme.mb_clear_theme_item, livePtr, dataType, SnArg(name), SnArg(themeType))
  }

  /** Theme.set_type_variation */
  final def setTypeVariation(themeType: String, baseType: String): Unit = {
    if (gdext.classes.Theme.mb_set_type_variation == null) gdext.classes.Theme.mb_set_type_variation = MethodBind.get("Theme", "set_type_variation", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_set_type_variation, livePtr, SnArg(themeType), SnArg(baseType))
  }

  /** Theme.is_type_variation */
  final def isTypeVariation(themeType: String, baseType: String): Boolean = {
    if (gdext.classes.Theme.mb_is_type_variation == null) gdext.classes.Theme.mb_is_type_variation = MethodBind.get("Theme", "is_type_variation", 471820014L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Theme.mb_is_type_variation, livePtr, SnArg(themeType), SnArg(baseType))
  }

  /** Theme.clear_type_variation */
  final def clearTypeVariation(themeType: String): Unit = {
    if (gdext.classes.Theme.mb_clear_type_variation == null) gdext.classes.Theme.mb_clear_type_variation = MethodBind.get("Theme", "clear_type_variation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_clear_type_variation, livePtr, SnArg(themeType))
  }

  /** Theme.get_type_variation_base */
  final def getTypeVariationBase(themeType: String): String = {
    if (gdext.classes.Theme.mb_get_type_variation_base == null) gdext.classes.Theme.mb_get_type_variation_base = MethodBind.get("Theme", "get_type_variation_base", 1965194235L)
    Ptrcall.call1[SnArg, SnArg](gdext.classes.Theme.mb_get_type_variation_base, livePtr, SnArg(themeType))
  }

  /** Theme.add_type */
  final def addType(themeType: String): Unit = {
    if (gdext.classes.Theme.mb_add_type == null) gdext.classes.Theme.mb_add_type = MethodBind.get("Theme", "add_type", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_add_type, livePtr, SnArg(themeType))
  }

  /** Theme.remove_type */
  final def removeType(themeType: String): Unit = {
    if (gdext.classes.Theme.mb_remove_type == null) gdext.classes.Theme.mb_remove_type = MethodBind.get("Theme", "remove_type", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Theme.mb_remove_type, livePtr, SnArg(themeType))
  }

  /** Theme.rename_type */
  final def renameType(oldThemeType: String, themeType: String): Unit = {
    if (gdext.classes.Theme.mb_rename_type == null) gdext.classes.Theme.mb_rename_type = MethodBind.get("Theme", "rename_type", 3740211285L)
    Ptrcall.callVoid2(gdext.classes.Theme.mb_rename_type, livePtr, SnArg(oldThemeType), SnArg(themeType))
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

  /** Godot enum `Theme.DataType`. */
  opaque type DataType <: Long = Long

  object DataType {
    final val Color: DataType = 0L.asInstanceOf[DataType]
    final val Constant: DataType = 1L.asInstanceOf[DataType]
    final val Font: DataType = 2L.asInstanceOf[DataType]
    final val FontSize: DataType = 3L.asInstanceOf[DataType]
    final val Icon: DataType = 4L.asInstanceOf[DataType]
    final val Stylebox: DataType = 5L.asInstanceOf[DataType]
    final val Max: DataType = 6L.asInstanceOf[DataType]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): DataType = value.asInstanceOf[DataType]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[DataType] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L).asInstanceOf[scala.IArray[DataType]]

    extension (self: DataType)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Color"
        case 1L => "Constant"
        case 2L => "Font"
        case 3L => "FontSize"
        case 4L => "Icon"
        case 5L => "Stylebox"
        case 6L => "Max"
        case other => other.toString
      }
  }
}
