package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `ThemeDB`, extends `Object`. */
abstract class ThemeDB extends Object {
  override def godotClassName: String = "ThemeDB"

  /** ThemeDB.get_default_theme. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getDefaultTheme(): Theme = {
    if (gdext.classes.ThemeDB.mb_get_default_theme == null) gdext.classes.ThemeDB.mb_get_default_theme = MethodBind.get("ThemeDB", "get_default_theme", 754276358L)
    Wrappers.owned[Theme](Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_default_theme, livePtr))
  }

  /** ThemeDB.get_project_theme. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getProjectTheme(): Theme = {
    if (gdext.classes.ThemeDB.mb_get_project_theme == null) gdext.classes.ThemeDB.mb_get_project_theme = MethodBind.get("ThemeDB", "get_project_theme", 754276358L)
    Wrappers.owned[Theme](Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_project_theme, livePtr))
  }

  /** ThemeDB.set_fallback_base_scale */
  final def setFallbackBaseScale(base_scale: Double): Unit = {
    if (gdext.classes.ThemeDB.mb_set_fallback_base_scale == null) gdext.classes.ThemeDB.mb_set_fallback_base_scale = MethodBind.get("ThemeDB", "set_fallback_base_scale", 373806689L)
    Ptrcall.callVoid1(gdext.classes.ThemeDB.mb_set_fallback_base_scale, livePtr, base_scale)
  }

  /** ThemeDB.get_fallback_base_scale */
  final def getFallbackBaseScale(): Double = {
    if (gdext.classes.ThemeDB.mb_get_fallback_base_scale == null) gdext.classes.ThemeDB.mb_get_fallback_base_scale = MethodBind.get("ThemeDB", "get_fallback_base_scale", 191475506L)
    Ptrcall.call0[Double](gdext.classes.ThemeDB.mb_get_fallback_base_scale, livePtr)
  }

  /** ThemeDB.set_fallback_font */
  final def setFallbackFont(font: Font): Unit = {
    if (gdext.classes.ThemeDB.mb_set_fallback_font == null) gdext.classes.ThemeDB.mb_set_fallback_font = MethodBind.get("ThemeDB", "set_fallback_font", 1262170328L)
    Ptrcall.callVoid1(gdext.classes.ThemeDB.mb_set_fallback_font, livePtr, Wrappers.handle(font))
  }

  /** ThemeDB.get_fallback_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFallbackFont(): Font = {
    if (gdext.classes.ThemeDB.mb_get_fallback_font == null) gdext.classes.ThemeDB.mb_get_fallback_font = MethodBind.get("ThemeDB", "get_fallback_font", 3656929885L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_fallback_font, livePtr))
  }

  /** ThemeDB.set_fallback_font_size */
  final def setFallbackFontSize(font_size: Long): Unit = {
    if (gdext.classes.ThemeDB.mb_set_fallback_font_size == null) gdext.classes.ThemeDB.mb_set_fallback_font_size = MethodBind.get("ThemeDB", "set_fallback_font_size", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.ThemeDB.mb_set_fallback_font_size, livePtr, font_size)
  }

  /** ThemeDB.get_fallback_font_size */
  final def getFallbackFontSize(): Long = {
    if (gdext.classes.ThemeDB.mb_get_fallback_font_size == null) gdext.classes.ThemeDB.mb_get_fallback_font_size = MethodBind.get("ThemeDB", "get_fallback_font_size", 2455072627L)
    Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_fallback_font_size, livePtr)
  }

  /** ThemeDB.set_fallback_icon */
  final def setFallbackIcon(icon: Texture2D): Unit = {
    if (gdext.classes.ThemeDB.mb_set_fallback_icon == null) gdext.classes.ThemeDB.mb_set_fallback_icon = MethodBind.get("ThemeDB", "set_fallback_icon", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.ThemeDB.mb_set_fallback_icon, livePtr, Wrappers.handle(icon))
  }

  /** ThemeDB.get_fallback_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFallbackIcon(): Texture2D = {
    if (gdext.classes.ThemeDB.mb_get_fallback_icon == null) gdext.classes.ThemeDB.mb_get_fallback_icon = MethodBind.get("ThemeDB", "get_fallback_icon", 255860311L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_fallback_icon, livePtr))
  }

  /** ThemeDB.set_fallback_stylebox */
  final def setFallbackStylebox(stylebox: StyleBox): Unit = {
    if (gdext.classes.ThemeDB.mb_set_fallback_stylebox == null) gdext.classes.ThemeDB.mb_set_fallback_stylebox = MethodBind.get("ThemeDB", "set_fallback_stylebox", 2797200388L)
    Ptrcall.callVoid1(gdext.classes.ThemeDB.mb_set_fallback_stylebox, livePtr, Wrappers.handle(stylebox))
  }

  /** ThemeDB.get_fallback_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFallbackStylebox(): StyleBox = {
    if (gdext.classes.ThemeDB.mb_get_fallback_stylebox == null) gdext.classes.ThemeDB.mb_get_fallback_stylebox = MethodBind.get("ThemeDB", "get_fallback_stylebox", 496040854L)
    Wrappers.owned[StyleBox](Ptrcall.call0[Long](gdext.classes.ThemeDB.mb_get_fallback_stylebox, livePtr))
  }

}

object ThemeDB {
  private[classes] var mb_get_default_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_project_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_fallback_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_fallback_stylebox: GDExtensionMethodBindPtr = null

  private var instance: ThemeDB = null

  /** The process-global ThemeDB singleton instance. */
  def singleton: ThemeDB = {
    if (instance == null)
      instance = Wrappers.borrowed[ThemeDB](GodotObject.fromPtr(
        Godot.interface.global_get_singleton(StringNames.cached("ThemeDB").ptr)))
    instance
  }
}
