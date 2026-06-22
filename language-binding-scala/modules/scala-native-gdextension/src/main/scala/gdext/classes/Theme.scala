package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Theme`, extends `Resource`. */
abstract class Theme extends Resource {

  /** Theme.set_icon */
  final def setIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, texture: Texture2D): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_icon", 2188371082L), hostObject.objectPtr, name, theme_type, texture.hostObject)

  /** Theme.get_icon */
  final def getIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Theme", "get_icon", 934555193L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_icon */
  final def hasIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_icon", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_icon */
  final def renameIcon(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_icon", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_icon */
  final def clearIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_icon", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_stylebox */
  final def setStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, texture: StyleBox): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_stylebox", 2075907568L), hostObject.objectPtr, name, theme_type, texture.hostObject)

  /** Theme.get_stylebox */
  final def getStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Theme", "get_stylebox", 3405608165L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_stylebox */
  final def hasStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_stylebox", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_stylebox */
  final def renameStylebox(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_stylebox", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_stylebox */
  final def clearStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_stylebox", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_font */
  final def setFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, font: Font): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_font", 177292320L), hostObject.objectPtr, name, theme_type, font.hostObject)

  /** Theme.get_font */
  final def getFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Theme", "get_font", 3445063586L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_font */
  final def hasFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_font", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_font */
  final def renameFont(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_font", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_font */
  final def clearFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_font", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_font_size */
  final def setFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, font_size: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_font_size", 281601298L), hostObject.objectPtr, name, theme_type, font_size)

  /** Theme.get_font_size */
  final def getFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Theme", "get_font_size", 2419549490L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_font_size */
  final def hasFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_font_size", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_font_size */
  final def renameFontSize(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_font_size", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_font_size */
  final def clearFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_font_size", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_color */
  final def setColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_color", 4111215154L), hostObject.objectPtr, name, theme_type, color)

  /** Theme.get_color */
  final def getColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): gdext.builtin.Color =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.Color](MethodBind.get("Theme", "get_color", 2015923404L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_color */
  final def hasColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_color", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_color */
  final def renameColor(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_color", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_color */
  final def clearColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_color", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_constant */
  final def setConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName, constant: Long): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "set_constant", 281601298L), hostObject.objectPtr, name, theme_type, constant)

  /** Theme.get_constant */
  final def getConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Theme", "get_constant", 2419549490L), hostObject.objectPtr, name, theme_type)

  /** Theme.has_constant */
  final def hasConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_constant", 471820014L), hostObject.objectPtr, name, theme_type)

  /** Theme.rename_constant */
  final def renameConstant(old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "rename_constant", 642128662L), hostObject.objectPtr, old_name, name, theme_type)

  /** Theme.clear_constant */
  final def clearConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "clear_constant", 3740211285L), hostObject.objectPtr, name, theme_type)

  /** Theme.set_default_base_scale */
  final def setDefaultBaseScale(base_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "set_default_base_scale", 373806689L), hostObject.objectPtr, base_scale)

  /** Theme.get_default_base_scale */
  final def getDefaultBaseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Theme", "get_default_base_scale", 1740695150L), hostObject.objectPtr)

  /** Theme.has_default_base_scale */
  final def hasDefaultBaseScale(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Theme", "has_default_base_scale", 36873697L), hostObject.objectPtr)

  /** Theme.set_default_font */
  final def setDefaultFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "set_default_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** Theme.get_default_font */
  final def getDefaultFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Theme", "get_default_font", 3229501585L), hostObject.objectPtr)

  /** Theme.has_default_font */
  final def hasDefaultFont(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Theme", "has_default_font", 36873697L), hostObject.objectPtr)

  /** Theme.set_default_font_size */
  final def setDefaultFontSize(font_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "set_default_font_size", 1286410249L), hostObject.objectPtr, font_size)

  /** Theme.get_default_font_size */
  final def getDefaultFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Theme", "get_default_font_size", 3905245786L), hostObject.objectPtr)

  /** Theme.has_default_font_size */
  final def hasDefaultFontSize(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Theme", "has_default_font_size", 36873697L), hostObject.objectPtr)

  /** Theme.has_theme_item */
  final def hasThemeItem(data_type: Long, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call3[Long, gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "has_theme_item", 1739311056L), hostObject.objectPtr, data_type, name, theme_type)

  /** Theme.rename_theme_item */
  final def renameThemeItem(data_type: Long, old_name: gdext.builtin.StringName, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid4(MethodBind.get("Theme", "rename_theme_item", 3900867553L), hostObject.objectPtr, data_type, old_name, name, theme_type)

  /** Theme.clear_theme_item */
  final def clearThemeItem(data_type: Long, name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid3(MethodBind.get("Theme", "clear_theme_item", 2965505587L), hostObject.objectPtr, data_type, name, theme_type)

  /** Theme.set_type_variation */
  final def setTypeVariation(theme_type: gdext.builtin.StringName, base_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "set_type_variation", 3740211285L), hostObject.objectPtr, theme_type, base_type)

  /** Theme.is_type_variation */
  final def isTypeVariation(theme_type: gdext.builtin.StringName, base_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Theme", "is_type_variation", 471820014L), hostObject.objectPtr, theme_type, base_type)

  /** Theme.clear_type_variation */
  final def clearTypeVariation(theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "clear_type_variation", 3304788590L), hostObject.objectPtr, theme_type)

  /** Theme.get_type_variation_base */
  final def getTypeVariationBase(theme_type: gdext.builtin.StringName): gdext.builtin.StringName =
    Ptrcall.call1[gdext.builtin.StringName, gdext.builtin.StringName](MethodBind.get("Theme", "get_type_variation_base", 1965194235L), hostObject.objectPtr, theme_type)

  /** Theme.add_type */
  final def addType(theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "add_type", 3304788590L), hostObject.objectPtr, theme_type)

  /** Theme.remove_type */
  final def removeType(theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "remove_type", 3304788590L), hostObject.objectPtr, theme_type)

  /** Theme.rename_type */
  final def renameType(old_theme_type: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid2(MethodBind.get("Theme", "rename_type", 3740211285L), hostObject.objectPtr, old_theme_type, theme_type)

  /** Theme.merge_with */
  final def mergeWith(other: Theme): Unit =
    Ptrcall.callVoid1(MethodBind.get("Theme", "merge_with", 2326690814L), hostObject.objectPtr, other.hostObject)

  /** Theme.clear */
  final def clear(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Theme", "clear", 3218959716L), hostObject.objectPtr)

}

object Theme {
  /** Class metadata for Gd[Theme] lifetime management and casting. */
  given GodotClass[Theme] with {
    def className = "Theme"
    def isRefCounted = true
    def wrap(o: GodotObject): Theme = new Theme {}.withHost(o.objectPtr)
    def unwrap(t: Theme): GodotObject = t.hostObject
  }
}
