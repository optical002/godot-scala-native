package gdext.codegen.engine

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Window`, extends `Viewport`. */
abstract class Window extends Viewport {

  /** Window.set_title */
  final def setTitle(title: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_title", 83702148L), hostObject.objectPtr, title)

  /** Window.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("Window", "get_title", 201670096L), hostObject.objectPtr)

  /** Window.set_initial_position */
  final def setInitialPosition(initial_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_initial_position", 4084468099L), hostObject.objectPtr, initial_position)

  /** Window.get_initial_position */
  final def getInitialPosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_initial_position", 4294066647L), hostObject.objectPtr)

  /** Window.set_current_screen */
  final def setCurrentScreen(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_current_screen", 1286410249L), hostObject.objectPtr, index)

  /** Window.get_current_screen */
  final def getCurrentScreen(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_current_screen", 3905245786L), hostObject.objectPtr)

  /** Window.set_position */
  final def setPosition(position: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_position", 1130785943L), hostObject.objectPtr, position)

  /** Window.get_position */
  final def getPosition(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_position", 3690982128L), hostObject.objectPtr)

  /** Window.move_to_center */
  final def moveToCenter(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "move_to_center", 3218959716L), hostObject.objectPtr)

  /** Window.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_size", 1130785943L), hostObject.objectPtr, size)

  /** Window.get_size */
  final def getSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_size", 3690982128L), hostObject.objectPtr)

  /** Window.reset_size */
  final def resetSize(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "reset_size", 3218959716L), hostObject.objectPtr)

  /** Window.get_position_with_decorations */
  final def getPositionWithDecorations(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_position_with_decorations", 3690982128L), hostObject.objectPtr)

  /** Window.get_size_with_decorations */
  final def getSizeWithDecorations(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_size_with_decorations", 3690982128L), hostObject.objectPtr)

  /** Window.set_max_size */
  final def setMaxSize(max_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_max_size", 1130785943L), hostObject.objectPtr, max_size)

  /** Window.get_max_size */
  final def getMaxSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_max_size", 3690982128L), hostObject.objectPtr)

  /** Window.set_min_size */
  final def setMinSize(min_size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_min_size", 1130785943L), hostObject.objectPtr, min_size)

  /** Window.get_min_size */
  final def getMinSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_min_size", 3690982128L), hostObject.objectPtr)

  /** Window.set_mode */
  final def setMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_mode", 3095236531L), hostObject.objectPtr, mode)

  /** Window.get_mode */
  final def getMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_mode", 2566346114L), hostObject.objectPtr)

  /** Window.set_flag */
  final def setFlag(flag: Long, enabled: Boolean): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "set_flag", 3426449779L), hostObject.objectPtr, flag, enabled)

  /** Window.get_flag */
  final def getFlag(flag: Long): Boolean =
    Ptrcall.call1[Long, Boolean](MethodBind.get("Window", "get_flag", 3062752289L), hostObject.objectPtr, flag)

  /** Window.is_maximize_allowed */
  final def isMaximizeAllowed(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_maximize_allowed", 36873697L), hostObject.objectPtr)

  /** Window.request_attention */
  final def requestAttention(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "request_attention", 3218959716L), hostObject.objectPtr)

  /** Window.move_to_foreground */
  final def moveToForeground(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "move_to_foreground", 3218959716L), hostObject.objectPtr)

  /** Window.set_visible */
  final def setVisible(visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_visible", 2586408642L), hostObject.objectPtr, visible)

  /** Window.is_visible */
  final def isVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_visible", 36873697L), hostObject.objectPtr)

  /** Window.hide */
  final def hide(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "hide", 3218959716L), hostObject.objectPtr)

  /** Window.show */
  final def show(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "show", 3218959716L), hostObject.objectPtr)

  /** Window.set_transient */
  final def setTransient(transient: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_transient", 2586408642L), hostObject.objectPtr, transient)

  /** Window.is_transient */
  final def isTransient(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_transient", 36873697L), hostObject.objectPtr)

  /** Window.set_transient_to_focused */
  final def setTransientToFocused(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_transient_to_focused", 2586408642L), hostObject.objectPtr, enable)

  /** Window.is_transient_to_focused */
  final def isTransientToFocused(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_transient_to_focused", 36873697L), hostObject.objectPtr)

  /** Window.set_exclusive */
  final def setExclusive(exclusive: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_exclusive", 2586408642L), hostObject.objectPtr, exclusive)

  /** Window.is_exclusive */
  final def isExclusive(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_exclusive", 36873697L), hostObject.objectPtr)

  /** Window.set_unparent_when_invisible */
  final def setUnparentWhenInvisible(unparent: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_unparent_when_invisible", 2586408642L), hostObject.objectPtr, unparent)

  /** Window.can_draw */
  final def canDraw(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "can_draw", 36873697L), hostObject.objectPtr)

  /** Window.has_focus */
  final def hasFocus(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "has_focus", 36873697L), hostObject.objectPtr)

  /** Window.grab_focus */
  final def grabFocus(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "grab_focus", 3218959716L), hostObject.objectPtr)

  /** Window.start_drag */
  final def startDrag(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "start_drag", 3218959716L), hostObject.objectPtr)

  /** Window.start_resize */
  final def startResize(edge: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "start_resize", 122288853L), hostObject.objectPtr, edge)

  /** Window.set_ime_active */
  final def setImeActive(active: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_ime_active", 2586408642L), hostObject.objectPtr, active)

  /** Window.set_ime_position */
  final def setImePosition(position: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_ime_position", 1130785943L), hostObject.objectPtr, position)

  /** Window.is_embedded */
  final def isEmbedded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_embedded", 36873697L), hostObject.objectPtr)

  /** Window.get_contents_minimum_size */
  final def getContentsMinimumSize(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("Window", "get_contents_minimum_size", 3341600327L), hostObject.objectPtr)

  /** Window.set_force_native */
  final def setForceNative(force_native: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_force_native", 2586408642L), hostObject.objectPtr, force_native)

  /** Window.get_force_native */
  final def getForceNative(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "get_force_native", 36873697L), hostObject.objectPtr)

  /** Window.set_content_scale_size */
  final def setContentScaleSize(size: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_content_scale_size", 1130785943L), hostObject.objectPtr, size)

  /** Window.get_content_scale_size */
  final def getContentScaleSize(): gdext.builtin.Vector2i =
    Ptrcall.call0[gdext.builtin.Vector2i](MethodBind.get("Window", "get_content_scale_size", 3690982128L), hostObject.objectPtr)

  /** Window.set_content_scale_mode */
  final def setContentScaleMode(mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_content_scale_mode", 2937716473L), hostObject.objectPtr, mode)

  /** Window.get_content_scale_mode */
  final def getContentScaleMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_content_scale_mode", 161585230L), hostObject.objectPtr)

  /** Window.set_content_scale_aspect */
  final def setContentScaleAspect(aspect: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_content_scale_aspect", 2370399418L), hostObject.objectPtr, aspect)

  /** Window.get_content_scale_aspect */
  final def getContentScaleAspect(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_content_scale_aspect", 4158790715L), hostObject.objectPtr)

  /** Window.set_content_scale_stretch */
  final def setContentScaleStretch(stretch: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_content_scale_stretch", 349355940L), hostObject.objectPtr, stretch)

  /** Window.get_content_scale_stretch */
  final def getContentScaleStretch(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_content_scale_stretch", 536857316L), hostObject.objectPtr)

  /** Window.set_nonclient_area */
  final def setNonclientArea(area: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_nonclient_area", 1763793166L), hostObject.objectPtr, area)

  /** Window.get_nonclient_area */
  final def getNonclientArea(): gdext.builtin.Rect2i =
    Ptrcall.call0[gdext.builtin.Rect2i](MethodBind.get("Window", "get_nonclient_area", 410525958L), hostObject.objectPtr)

  /** Window.set_keep_title_visible */
  final def setKeepTitleVisible(title_visible: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_keep_title_visible", 2586408642L), hostObject.objectPtr, title_visible)

  /** Window.get_keep_title_visible */
  final def getKeepTitleVisible(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "get_keep_title_visible", 36873697L), hostObject.objectPtr)

  /** Window.set_content_scale_factor */
  final def setContentScaleFactor(factor: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_content_scale_factor", 373806689L), hostObject.objectPtr, factor)

  /** Window.get_content_scale_factor */
  final def getContentScaleFactor(): Double =
    Ptrcall.call0[Double](MethodBind.get("Window", "get_content_scale_factor", 1740695150L), hostObject.objectPtr)

  /** Window.set_wrap_controls */
  final def setWrapControls(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_wrap_controls", 2586408642L), hostObject.objectPtr, enable)

  /** Window.is_wrapping_controls */
  final def isWrappingControls(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_wrapping_controls", 36873697L), hostObject.objectPtr)

  /** Window.child_controls_changed */
  final def childControlsChanged(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "child_controls_changed", 3218959716L), hostObject.objectPtr)

  /** Window.set_theme */
  final def setTheme(theme: Theme): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_theme", 2326690814L), hostObject.objectPtr, theme.hostObject)

  /** Window.get_theme */
  final def getTheme(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Window", "get_theme", 3846893731L), hostObject.objectPtr)

  /** Window.set_theme_type_variation */
  final def setThemeTypeVariation(theme_type: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_theme_type_variation", 3304788590L), hostObject.objectPtr, theme_type)

  /** Window.get_theme_type_variation */
  final def getThemeTypeVariation(): gdext.builtin.StringName =
    Ptrcall.call0[gdext.builtin.StringName](MethodBind.get("Window", "get_theme_type_variation", 2002593661L), hostObject.objectPtr)

  /** Window.begin_bulk_theme_override */
  final def beginBulkThemeOverride(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "begin_bulk_theme_override", 3218959716L), hostObject.objectPtr)

  /** Window.end_bulk_theme_override */
  final def endBulkThemeOverride(): Unit =
    Ptrcall.callVoid0(MethodBind.get("Window", "end_bulk_theme_override", 3218959716L), hostObject.objectPtr)

  /** Window.add_theme_icon_override */
  final def addThemeIconOverride(name: gdext.builtin.StringName, texture: Texture2D): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_icon_override", 1373065600L), hostObject.objectPtr, name, texture.hostObject)

  /** Window.add_theme_stylebox_override */
  final def addThemeStyleboxOverride(name: gdext.builtin.StringName, stylebox: StyleBox): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_stylebox_override", 4188838905L), hostObject.objectPtr, name, stylebox.hostObject)

  /** Window.add_theme_font_override */
  final def addThemeFontOverride(name: gdext.builtin.StringName, font: Font): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_font_override", 3518018674L), hostObject.objectPtr, name, font.hostObject)

  /** Window.add_theme_font_size_override */
  final def addThemeFontSizeOverride(name: gdext.builtin.StringName, font_size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_font_size_override", 2415702435L), hostObject.objectPtr, name, font_size)

  /** Window.add_theme_color_override */
  final def addThemeColorOverride(name: gdext.builtin.StringName, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_color_override", 4260178595L), hostObject.objectPtr, name, color)

  /** Window.add_theme_constant_override */
  final def addThemeConstantOverride(name: gdext.builtin.StringName, constant: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "add_theme_constant_override", 2415702435L), hostObject.objectPtr, name, constant)

  /** Window.remove_theme_icon_override */
  final def removeThemeIconOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_icon_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.remove_theme_stylebox_override */
  final def removeThemeStyleboxOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_stylebox_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.remove_theme_font_override */
  final def removeThemeFontOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_font_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.remove_theme_font_size_override */
  final def removeThemeFontSizeOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_font_size_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.remove_theme_color_override */
  final def removeThemeColorOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_color_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.remove_theme_constant_override */
  final def removeThemeConstantOverride(name: gdext.builtin.StringName): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "remove_theme_constant_override", 3304788590L), hostObject.objectPtr, name)

  /** Window.get_theme_icon */
  final def getThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Window", "get_theme_icon", 3163973443L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_stylebox */
  final def getThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Window", "get_theme_stylebox", 604739069L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_font */
  final def getThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): GodotObject =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, GodotObject](MethodBind.get("Window", "get_theme_font", 2826986490L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_font_size */
  final def getThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Window", "get_theme_font_size", 1327056374L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_color */
  final def getThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): gdext.builtin.Color =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.Color](MethodBind.get("Window", "get_theme_color", 2798751242L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_constant */
  final def getThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Long =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Long](MethodBind.get("Window", "get_theme_constant", 1327056374L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_icon_override */
  final def hasThemeIconOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_icon_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_stylebox_override */
  final def hasThemeStyleboxOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_stylebox_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_font_override */
  final def hasThemeFontOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_font_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_font_size_override */
  final def hasThemeFontSizeOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_font_size_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_color_override */
  final def hasThemeColorOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_color_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_constant_override */
  final def hasThemeConstantOverride(name: gdext.builtin.StringName): Boolean =
    Ptrcall.call1[gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_constant_override", 2619796661L), hostObject.objectPtr, name)

  /** Window.has_theme_icon */
  final def hasThemeIcon(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_icon", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_stylebox */
  final def hasThemeStylebox(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_stylebox", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_font */
  final def hasThemeFont(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_font", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_font_size */
  final def hasThemeFontSize(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_font_size", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_color */
  final def hasThemeColor(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_color", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.has_theme_constant */
  final def hasThemeConstant(name: gdext.builtin.StringName, theme_type: gdext.builtin.StringName): Boolean =
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, Boolean](MethodBind.get("Window", "has_theme_constant", 866386512L), hostObject.objectPtr, name, theme_type)

  /** Window.get_theme_default_base_scale */
  final def getThemeDefaultBaseScale(): Double =
    Ptrcall.call0[Double](MethodBind.get("Window", "get_theme_default_base_scale", 1740695150L), hostObject.objectPtr)

  /** Window.get_theme_default_font */
  final def getThemeDefaultFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Window", "get_theme_default_font", 3229501585L), hostObject.objectPtr)

  /** Window.get_theme_default_font_size */
  final def getThemeDefaultFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_theme_default_font_size", 3905245786L), hostObject.objectPtr)

  /** Window.get_window_id */
  final def getWindowId(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_window_id", 3905245786L), hostObject.objectPtr)

  /** Window.set_accessibility_name */
  final def setAccessibilityName(name: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_accessibility_name", 83702148L), hostObject.objectPtr, name)

  /** Window.get_accessibility_name */
  final def getAccessibilityName(): String =
    Ptrcall.call0[String](MethodBind.get("Window", "get_accessibility_name", 201670096L), hostObject.objectPtr)

  /** Window.set_accessibility_description */
  final def setAccessibilityDescription(description: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_accessibility_description", 83702148L), hostObject.objectPtr, description)

  /** Window.get_accessibility_description */
  final def getAccessibilityDescription(): String =
    Ptrcall.call0[String](MethodBind.get("Window", "get_accessibility_description", 201670096L), hostObject.objectPtr)

  /** Window.set_layout_direction */
  final def setLayoutDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_layout_direction", 3094704184L), hostObject.objectPtr, direction)

  /** Window.get_layout_direction */
  final def getLayoutDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Window", "get_layout_direction", 3909617982L), hostObject.objectPtr)

  /** Window.is_layout_rtl */
  final def isLayoutRtl(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_layout_rtl", 36873697L), hostObject.objectPtr)

  /** Window.set_auto_translate */
  final def setAutoTranslate(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_auto_translate", 2586408642L), hostObject.objectPtr, enable)

  /** Window.is_auto_translating */
  final def isAutoTranslating(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_auto_translating", 36873697L), hostObject.objectPtr)

  /** Window.set_use_font_oversampling */
  final def setUseFontOversampling(enable: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "set_use_font_oversampling", 2586408642L), hostObject.objectPtr, enable)

  /** Window.is_using_font_oversampling */
  final def isUsingFontOversampling(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Window", "is_using_font_oversampling", 36873697L), hostObject.objectPtr)

  /** Window.popup */
  final def popup(rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "popup", 1680304321L), hostObject.objectPtr, rect)

  /** Window.popup_on_parent */
  final def popupOnParent(parent_rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "popup_on_parent", 1763793166L), hostObject.objectPtr, parent_rect)

  /** Window.popup_centered */
  final def popupCentered(minsize: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "popup_centered", 3447975422L), hostObject.objectPtr, minsize)

  /** Window.popup_centered_ratio */
  final def popupCenteredRatio(ratio: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("Window", "popup_centered_ratio", 1014814997L), hostObject.objectPtr, ratio)

  /** Window.popup_centered_clamped */
  final def popupCenteredClamped(minsize: gdext.builtin.Vector2i, fallback_ratio: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "popup_centered_clamped", 2613752477L), hostObject.objectPtr, minsize, fallback_ratio)

  /** Window.popup_exclusive */
  final def popupExclusive(from_node: Node, rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "popup_exclusive", 2134721627L), hostObject.objectPtr, from_node.hostObject, rect)

  /** Window.popup_exclusive_on_parent */
  final def popupExclusiveOnParent(from_node: Node, parent_rect: gdext.builtin.Rect2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "popup_exclusive_on_parent", 2344671043L), hostObject.objectPtr, from_node.hostObject, parent_rect)

  /** Window.popup_exclusive_centered */
  final def popupExclusiveCentered(from_node: Node, minsize: gdext.builtin.Vector2i): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "popup_exclusive_centered", 3357594017L), hostObject.objectPtr, from_node.hostObject, minsize)

  /** Window.popup_exclusive_centered_ratio */
  final def popupExclusiveCenteredRatio(from_node: Node, ratio: Double): Unit =
    Ptrcall.callVoid2(MethodBind.get("Window", "popup_exclusive_centered_ratio", 2284776287L), hostObject.objectPtr, from_node.hostObject, ratio)

  /** Window.popup_exclusive_centered_clamped */
  final def popupExclusiveCenteredClamped(from_node: Node, minsize: gdext.builtin.Vector2i, fallback_ratio: Double): Unit =
    Ptrcall.callVoid3(MethodBind.get("Window", "popup_exclusive_centered_clamped", 2612708785L), hostObject.objectPtr, from_node.hostObject, minsize, fallback_ratio)

}

object Window {
  /** Class metadata for Gd[Window] lifetime management and casting. */
  given GodotClass[Window] with {
    def className = "Window"
    def isRefCounted = false
    def wrap(o: GodotObject): Window = new Window {}.withHost(o.objectPtr)
    def unwrap(t: Window): GodotObject = t.hostObject
  }
}
