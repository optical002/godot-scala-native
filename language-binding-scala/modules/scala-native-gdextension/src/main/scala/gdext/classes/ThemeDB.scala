package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `ThemeDB`, extends `Object`. */
abstract class ThemeDB extends Object {
  override def godotClassName: String = "ThemeDB"

  /** ThemeDB.get_default_theme */
  final def getDefaultTheme(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ThemeDB", "get_default_theme", 754276358L), hostObject.objectPtr)

  /** ThemeDB.get_project_theme */
  final def getProjectTheme(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ThemeDB", "get_project_theme", 754276358L), hostObject.objectPtr)

  /** ThemeDB.set_fallback_base_scale */
  final def setFallbackBaseScale(base_scale: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("ThemeDB", "set_fallback_base_scale", 373806689L), hostObject.objectPtr, base_scale)

  /** ThemeDB.get_fallback_base_scale */
  final def getFallbackBaseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("ThemeDB", "get_fallback_base_scale", 191475506L), hostObject.objectPtr)

  /** ThemeDB.set_fallback_font */
  final def setFallbackFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("ThemeDB", "set_fallback_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** ThemeDB.get_fallback_font */
  final def getFallbackFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ThemeDB", "get_fallback_font", 3656929885L), hostObject.objectPtr)

  /** ThemeDB.set_fallback_font_size */
  final def setFallbackFontSize(font_size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("ThemeDB", "set_fallback_font_size", 1286410249L), hostObject.objectPtr, font_size)

  /** ThemeDB.get_fallback_font_size */
  final def getFallbackFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("ThemeDB", "get_fallback_font_size", 2455072627L), hostObject.objectPtr)

  /** ThemeDB.set_fallback_icon */
  final def setFallbackIcon(icon: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("ThemeDB", "set_fallback_icon", 4051416890L), hostObject.objectPtr, icon.hostObject)

  /** ThemeDB.get_fallback_icon */
  final def getFallbackIcon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ThemeDB", "get_fallback_icon", 255860311L), hostObject.objectPtr)

  /** ThemeDB.set_fallback_stylebox */
  final def setFallbackStylebox(stylebox: StyleBox): Unit =
    Ptrcall.callVoid1(MethodBind.get("ThemeDB", "set_fallback_stylebox", 2797200388L), hostObject.objectPtr, stylebox.hostObject)

  /** ThemeDB.get_fallback_stylebox */
  final def getFallbackStylebox(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("ThemeDB", "get_fallback_stylebox", 496040854L), hostObject.objectPtr)

}

object ThemeDB {
  /** The process-global ThemeDB singleton instance. */
  def singleton: ThemeDB = new ThemeDB {}
    .withHost(Godot.interface.global_get_singleton(
      StringNames.cached("ThemeDB").ptr))
}
