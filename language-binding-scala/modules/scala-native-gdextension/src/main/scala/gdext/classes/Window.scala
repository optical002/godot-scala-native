package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Window`, extends `Viewport`. */
abstract class Window extends Viewport {
  override def godotClassName: String = "Window"

  /** Window.set_title */
  final def setTitle(title: String): Unit = {
    if (gdext.classes.Window.mb_set_title == null) gdext.classes.Window.mb_set_title = MethodBind.get("Window", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_title, livePtr, title)
  }

  /** Window.get_title */
  final def getTitle(): String = {
    if (gdext.classes.Window.mb_get_title == null) gdext.classes.Window.mb_get_title = MethodBind.get("Window", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.Window.mb_get_title, livePtr)
  }

  /** Window.set_initial_position */
  final def setInitialPosition(initialPosition: gdext.classes.Window.WindowInitialPosition): Unit = {
    if (gdext.classes.Window.mb_set_initial_position == null) gdext.classes.Window.mb_set_initial_position = MethodBind.get("Window", "set_initial_position", 4084468099L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_initial_position, livePtr, initialPosition)
  }

  /** Window.get_initial_position */
  final def getInitialPosition(): gdext.classes.Window.WindowInitialPosition = {
    if (gdext.classes.Window.mb_get_initial_position == null) gdext.classes.Window.mb_get_initial_position = MethodBind.get("Window", "get_initial_position", 4294066647L)
    gdext.classes.Window.WindowInitialPosition(Ptrcall.call0[Long](gdext.classes.Window.mb_get_initial_position, livePtr))
  }

  /** Window.set_current_screen */
  final def setCurrentScreen(index: Long): Unit = {
    if (gdext.classes.Window.mb_set_current_screen == null) gdext.classes.Window.mb_set_current_screen = MethodBind.get("Window", "set_current_screen", 1286410249L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_current_screen, livePtr, index)
  }

  /** Window.get_current_screen */
  final def getCurrentScreen(): Long = {
    if (gdext.classes.Window.mb_get_current_screen == null) gdext.classes.Window.mb_get_current_screen = MethodBind.get("Window", "get_current_screen", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Window.mb_get_current_screen, livePtr)
  }

  /** Window.set_position */
  final def setPosition(position: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_position == null) gdext.classes.Window.mb_set_position = MethodBind.get("Window", "set_position", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_position, livePtr, position)
  }

  /** Window.get_position */
  final def getPosition(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_position == null) gdext.classes.Window.mb_get_position = MethodBind.get("Window", "get_position", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_position, livePtr)
  }

  /** Window.move_to_center */
  final def moveToCenter(): Unit = {
    if (gdext.classes.Window.mb_move_to_center == null) gdext.classes.Window.mb_move_to_center = MethodBind.get("Window", "move_to_center", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_move_to_center, livePtr)
  }

  /** Window.set_size */
  final def setSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_size == null) gdext.classes.Window.mb_set_size = MethodBind.get("Window", "set_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_size, livePtr, size)
  }

  /** Window.get_size */
  final def getSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_size == null) gdext.classes.Window.mb_get_size = MethodBind.get("Window", "get_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_size, livePtr)
  }

  /** Window.reset_size */
  final def resetSize(): Unit = {
    if (gdext.classes.Window.mb_reset_size == null) gdext.classes.Window.mb_reset_size = MethodBind.get("Window", "reset_size", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_reset_size, livePtr)
  }

  /** Window.get_position_with_decorations */
  final def getPositionWithDecorations(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_position_with_decorations == null) gdext.classes.Window.mb_get_position_with_decorations = MethodBind.get("Window", "get_position_with_decorations", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_position_with_decorations, livePtr)
  }

  /** Window.get_size_with_decorations */
  final def getSizeWithDecorations(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_size_with_decorations == null) gdext.classes.Window.mb_get_size_with_decorations = MethodBind.get("Window", "get_size_with_decorations", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_size_with_decorations, livePtr)
  }

  /** Window.set_max_size */
  final def setMaxSize(maxSize: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_max_size == null) gdext.classes.Window.mb_set_max_size = MethodBind.get("Window", "set_max_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_max_size, livePtr, maxSize)
  }

  /** Window.get_max_size */
  final def getMaxSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_max_size == null) gdext.classes.Window.mb_get_max_size = MethodBind.get("Window", "get_max_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_max_size, livePtr)
  }

  /** Window.set_min_size */
  final def setMinSize(minSize: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_min_size == null) gdext.classes.Window.mb_set_min_size = MethodBind.get("Window", "set_min_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_min_size, livePtr, minSize)
  }

  /** Window.get_min_size */
  final def getMinSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_min_size == null) gdext.classes.Window.mb_get_min_size = MethodBind.get("Window", "get_min_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_min_size, livePtr)
  }

  /** Window.set_mode */
  final def setMode(mode: gdext.classes.Window.Mode): Unit = {
    if (gdext.classes.Window.mb_set_mode == null) gdext.classes.Window.mb_set_mode = MethodBind.get("Window", "set_mode", 3095236531L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_mode, livePtr, mode)
  }

  /** Window.get_mode */
  final def getMode(): gdext.classes.Window.Mode = {
    if (gdext.classes.Window.mb_get_mode == null) gdext.classes.Window.mb_get_mode = MethodBind.get("Window", "get_mode", 2566346114L)
    gdext.classes.Window.Mode(Ptrcall.call0[Long](gdext.classes.Window.mb_get_mode, livePtr))
  }

  /** Window.set_flag */
  final def setFlag(flag: gdext.classes.Window.Flags, enabled: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_flag == null) gdext.classes.Window.mb_set_flag = MethodBind.get("Window", "set_flag", 3426449779L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_set_flag, livePtr, flag, enabled)
  }

  /** Window.get_flag */
  final def getFlag(flag: gdext.classes.Window.Flags): Boolean = {
    if (gdext.classes.Window.mb_get_flag == null) gdext.classes.Window.mb_get_flag = MethodBind.get("Window", "get_flag", 3062752289L)
    Ptrcall.call1[Long, Boolean](gdext.classes.Window.mb_get_flag, livePtr, flag)
  }

  /** Window.is_maximize_allowed */
  final def isMaximizeAllowed(): Boolean = {
    if (gdext.classes.Window.mb_is_maximize_allowed == null) gdext.classes.Window.mb_is_maximize_allowed = MethodBind.get("Window", "is_maximize_allowed", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_maximize_allowed, livePtr)
  }

  /** Window.request_attention */
  final def requestAttention(): Unit = {
    if (gdext.classes.Window.mb_request_attention == null) gdext.classes.Window.mb_request_attention = MethodBind.get("Window", "request_attention", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_request_attention, livePtr)
  }

  /** Window.move_to_foreground */
  final def moveToForeground(): Unit = {
    if (gdext.classes.Window.mb_move_to_foreground == null) gdext.classes.Window.mb_move_to_foreground = MethodBind.get("Window", "move_to_foreground", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_move_to_foreground, livePtr)
  }

  /** Window.set_visible */
  final def setVisible(visible: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_visible == null) gdext.classes.Window.mb_set_visible = MethodBind.get("Window", "set_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_visible, livePtr, visible)
  }

  /** Window.is_visible */
  final def isVisible(): Boolean = {
    if (gdext.classes.Window.mb_is_visible == null) gdext.classes.Window.mb_is_visible = MethodBind.get("Window", "is_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_visible, livePtr)
  }

  /** Window.hide */
  final def hide(): Unit = {
    if (gdext.classes.Window.mb_hide == null) gdext.classes.Window.mb_hide = MethodBind.get("Window", "hide", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_hide, livePtr)
  }

  /** Window.show */
  final def show(): Unit = {
    if (gdext.classes.Window.mb_show == null) gdext.classes.Window.mb_show = MethodBind.get("Window", "show", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_show, livePtr)
  }

  /** Window.set_transient */
  final def setTransient(transient: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_transient == null) gdext.classes.Window.mb_set_transient = MethodBind.get("Window", "set_transient", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_transient, livePtr, transient)
  }

  /** Window.is_transient */
  final def isTransient(): Boolean = {
    if (gdext.classes.Window.mb_is_transient == null) gdext.classes.Window.mb_is_transient = MethodBind.get("Window", "is_transient", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_transient, livePtr)
  }

  /** Window.set_transient_to_focused */
  final def setTransientToFocused(enable: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_transient_to_focused == null) gdext.classes.Window.mb_set_transient_to_focused = MethodBind.get("Window", "set_transient_to_focused", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_transient_to_focused, livePtr, enable)
  }

  /** Window.is_transient_to_focused */
  final def isTransientToFocused(): Boolean = {
    if (gdext.classes.Window.mb_is_transient_to_focused == null) gdext.classes.Window.mb_is_transient_to_focused = MethodBind.get("Window", "is_transient_to_focused", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_transient_to_focused, livePtr)
  }

  /** Window.set_exclusive */
  final def setExclusive(exclusive: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_exclusive == null) gdext.classes.Window.mb_set_exclusive = MethodBind.get("Window", "set_exclusive", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_exclusive, livePtr, exclusive)
  }

  /** Window.is_exclusive */
  final def isExclusive(): Boolean = {
    if (gdext.classes.Window.mb_is_exclusive == null) gdext.classes.Window.mb_is_exclusive = MethodBind.get("Window", "is_exclusive", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_exclusive, livePtr)
  }

  /** Window.set_unparent_when_invisible */
  final def setUnparentWhenInvisible(unparent: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_unparent_when_invisible == null) gdext.classes.Window.mb_set_unparent_when_invisible = MethodBind.get("Window", "set_unparent_when_invisible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_unparent_when_invisible, livePtr, unparent)
  }

  /** Window.can_draw */
  final def canDraw(): Boolean = {
    if (gdext.classes.Window.mb_can_draw == null) gdext.classes.Window.mb_can_draw = MethodBind.get("Window", "can_draw", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_can_draw, livePtr)
  }

  /** Window.has_focus */
  final def hasFocus(): Boolean = {
    if (gdext.classes.Window.mb_has_focus == null) gdext.classes.Window.mb_has_focus = MethodBind.get("Window", "has_focus", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_has_focus, livePtr)
  }

  /** Window.grab_focus */
  final def grabFocus(): Unit = {
    if (gdext.classes.Window.mb_grab_focus == null) gdext.classes.Window.mb_grab_focus = MethodBind.get("Window", "grab_focus", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_grab_focus, livePtr)
  }

  /** Window.start_drag */
  final def startDrag(): Unit = {
    if (gdext.classes.Window.mb_start_drag == null) gdext.classes.Window.mb_start_drag = MethodBind.get("Window", "start_drag", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_start_drag, livePtr)
  }

  /** Window.start_resize */
  final def startResize(edge: gdext.classes.DisplayServer.WindowResizeEdge): Unit = {
    if (gdext.classes.Window.mb_start_resize == null) gdext.classes.Window.mb_start_resize = MethodBind.get("Window", "start_resize", 122288853L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_start_resize, livePtr, edge)
  }

  /** Window.set_ime_active */
  final def setImeActive(active: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_ime_active == null) gdext.classes.Window.mb_set_ime_active = MethodBind.get("Window", "set_ime_active", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_ime_active, livePtr, active)
  }

  /** Window.set_ime_position */
  final def setImePosition(position: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_ime_position == null) gdext.classes.Window.mb_set_ime_position = MethodBind.get("Window", "set_ime_position", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_ime_position, livePtr, position)
  }

  /** Window.is_embedded */
  final def isEmbedded(): Boolean = {
    if (gdext.classes.Window.mb_is_embedded == null) gdext.classes.Window.mb_is_embedded = MethodBind.get("Window", "is_embedded", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_embedded, livePtr)
  }

  /** Window.get_contents_minimum_size */
  final def getContentsMinimumSize(): gdext.builtin.Vector2 = {
    if (gdext.classes.Window.mb_get_contents_minimum_size == null) gdext.classes.Window.mb_get_contents_minimum_size = MethodBind.get("Window", "get_contents_minimum_size", 3341600327L)
    Ptrcall.call0[gdext.builtin.Vector2](gdext.classes.Window.mb_get_contents_minimum_size, livePtr)
  }

  /** Window.set_force_native */
  final def setForceNative(forceNative: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_force_native == null) gdext.classes.Window.mb_set_force_native = MethodBind.get("Window", "set_force_native", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_force_native, livePtr, forceNative)
  }

  /** Window.get_force_native */
  final def getForceNative(): Boolean = {
    if (gdext.classes.Window.mb_get_force_native == null) gdext.classes.Window.mb_get_force_native = MethodBind.get("Window", "get_force_native", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_get_force_native, livePtr)
  }

  /** Window.set_content_scale_size */
  final def setContentScaleSize(size: gdext.builtin.Vector2i): Unit = {
    if (gdext.classes.Window.mb_set_content_scale_size == null) gdext.classes.Window.mb_set_content_scale_size = MethodBind.get("Window", "set_content_scale_size", 1130785943L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_content_scale_size, livePtr, size)
  }

  /** Window.get_content_scale_size */
  final def getContentScaleSize(): gdext.builtin.Vector2i = {
    if (gdext.classes.Window.mb_get_content_scale_size == null) gdext.classes.Window.mb_get_content_scale_size = MethodBind.get("Window", "get_content_scale_size", 3690982128L)
    Ptrcall.call0[gdext.builtin.Vector2i](gdext.classes.Window.mb_get_content_scale_size, livePtr)
  }

  /** Window.set_content_scale_mode */
  final def setContentScaleMode(mode: gdext.classes.Window.ContentScaleMode): Unit = {
    if (gdext.classes.Window.mb_set_content_scale_mode == null) gdext.classes.Window.mb_set_content_scale_mode = MethodBind.get("Window", "set_content_scale_mode", 2937716473L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_content_scale_mode, livePtr, mode)
  }

  /** Window.get_content_scale_mode */
  final def getContentScaleMode(): gdext.classes.Window.ContentScaleMode = {
    if (gdext.classes.Window.mb_get_content_scale_mode == null) gdext.classes.Window.mb_get_content_scale_mode = MethodBind.get("Window", "get_content_scale_mode", 161585230L)
    gdext.classes.Window.ContentScaleMode(Ptrcall.call0[Long](gdext.classes.Window.mb_get_content_scale_mode, livePtr))
  }

  /** Window.set_content_scale_aspect */
  final def setContentScaleAspect(aspect: gdext.classes.Window.ContentScaleAspect): Unit = {
    if (gdext.classes.Window.mb_set_content_scale_aspect == null) gdext.classes.Window.mb_set_content_scale_aspect = MethodBind.get("Window", "set_content_scale_aspect", 2370399418L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_content_scale_aspect, livePtr, aspect)
  }

  /** Window.get_content_scale_aspect */
  final def getContentScaleAspect(): gdext.classes.Window.ContentScaleAspect = {
    if (gdext.classes.Window.mb_get_content_scale_aspect == null) gdext.classes.Window.mb_get_content_scale_aspect = MethodBind.get("Window", "get_content_scale_aspect", 4158790715L)
    gdext.classes.Window.ContentScaleAspect(Ptrcall.call0[Long](gdext.classes.Window.mb_get_content_scale_aspect, livePtr))
  }

  /** Window.set_content_scale_stretch */
  final def setContentScaleStretch(stretch: gdext.classes.Window.ContentScaleStretch): Unit = {
    if (gdext.classes.Window.mb_set_content_scale_stretch == null) gdext.classes.Window.mb_set_content_scale_stretch = MethodBind.get("Window", "set_content_scale_stretch", 349355940L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_content_scale_stretch, livePtr, stretch)
  }

  /** Window.get_content_scale_stretch */
  final def getContentScaleStretch(): gdext.classes.Window.ContentScaleStretch = {
    if (gdext.classes.Window.mb_get_content_scale_stretch == null) gdext.classes.Window.mb_get_content_scale_stretch = MethodBind.get("Window", "get_content_scale_stretch", 536857316L)
    gdext.classes.Window.ContentScaleStretch(Ptrcall.call0[Long](gdext.classes.Window.mb_get_content_scale_stretch, livePtr))
  }

  /** Window.set_nonclient_area */
  final def setNonclientArea(area: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.Window.mb_set_nonclient_area == null) gdext.classes.Window.mb_set_nonclient_area = MethodBind.get("Window", "set_nonclient_area", 1763793166L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_nonclient_area, livePtr, area)
  }

  /** Window.get_nonclient_area */
  final def getNonclientArea(): gdext.builtin.Rect2i = {
    if (gdext.classes.Window.mb_get_nonclient_area == null) gdext.classes.Window.mb_get_nonclient_area = MethodBind.get("Window", "get_nonclient_area", 410525958L)
    Ptrcall.call0[gdext.builtin.Rect2i](gdext.classes.Window.mb_get_nonclient_area, livePtr)
  }

  /** Window.set_keep_title_visible */
  final def setKeepTitleVisible(titleVisible: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_keep_title_visible == null) gdext.classes.Window.mb_set_keep_title_visible = MethodBind.get("Window", "set_keep_title_visible", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_keep_title_visible, livePtr, titleVisible)
  }

  /** Window.get_keep_title_visible */
  final def getKeepTitleVisible(): Boolean = {
    if (gdext.classes.Window.mb_get_keep_title_visible == null) gdext.classes.Window.mb_get_keep_title_visible = MethodBind.get("Window", "get_keep_title_visible", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_get_keep_title_visible, livePtr)
  }

  /** Window.set_content_scale_factor */
  final def setContentScaleFactor(factor: Double): Unit = {
    if (gdext.classes.Window.mb_set_content_scale_factor == null) gdext.classes.Window.mb_set_content_scale_factor = MethodBind.get("Window", "set_content_scale_factor", 373806689L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_content_scale_factor, livePtr, factor)
  }

  /** Window.get_content_scale_factor */
  final def getContentScaleFactor(): Double = {
    if (gdext.classes.Window.mb_get_content_scale_factor == null) gdext.classes.Window.mb_get_content_scale_factor = MethodBind.get("Window", "get_content_scale_factor", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Window.mb_get_content_scale_factor, livePtr)
  }

  /** Window.set_wrap_controls */
  final def setWrapControls(enable: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_wrap_controls == null) gdext.classes.Window.mb_set_wrap_controls = MethodBind.get("Window", "set_wrap_controls", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_wrap_controls, livePtr, enable)
  }

  /** Window.is_wrapping_controls */
  final def isWrappingControls(): Boolean = {
    if (gdext.classes.Window.mb_is_wrapping_controls == null) gdext.classes.Window.mb_is_wrapping_controls = MethodBind.get("Window", "is_wrapping_controls", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_wrapping_controls, livePtr)
  }

  /** Window.child_controls_changed */
  final def childControlsChanged(): Unit = {
    if (gdext.classes.Window.mb_child_controls_changed == null) gdext.classes.Window.mb_child_controls_changed = MethodBind.get("Window", "child_controls_changed", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_child_controls_changed, livePtr)
  }

  /** Window.set_theme */
  final def setTheme(theme: Theme): Unit = {
    if (gdext.classes.Window.mb_set_theme == null) gdext.classes.Window.mb_set_theme = MethodBind.get("Window", "set_theme", 2326690814L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_theme, livePtr, Wrappers.handle(theme))
  }

  /** Window.get_theme. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getTheme(): Theme = {
    if (gdext.classes.Window.mb_get_theme == null) gdext.classes.Window.mb_get_theme = MethodBind.get("Window", "get_theme", 3846893731L)
    Wrappers.owned[Theme](Ptrcall.call0[Long](gdext.classes.Window.mb_get_theme, livePtr))
  }

  /** Window.set_theme_type_variation */
  final def setThemeTypeVariation(themeType: String): Unit = {
    if (gdext.classes.Window.mb_set_theme_type_variation == null) gdext.classes.Window.mb_set_theme_type_variation = MethodBind.get("Window", "set_theme_type_variation", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_theme_type_variation, livePtr, SnArg(themeType))
  }

  /** Window.get_theme_type_variation */
  final def getThemeTypeVariation(): String = {
    if (gdext.classes.Window.mb_get_theme_type_variation == null) gdext.classes.Window.mb_get_theme_type_variation = MethodBind.get("Window", "get_theme_type_variation", 2002593661L)
    Ptrcall.call0[SnArg](gdext.classes.Window.mb_get_theme_type_variation, livePtr)
  }

  /** Window.begin_bulk_theme_override */
  final def beginBulkThemeOverride(): Unit = {
    if (gdext.classes.Window.mb_begin_bulk_theme_override == null) gdext.classes.Window.mb_begin_bulk_theme_override = MethodBind.get("Window", "begin_bulk_theme_override", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_begin_bulk_theme_override, livePtr)
  }

  /** Window.end_bulk_theme_override */
  final def endBulkThemeOverride(): Unit = {
    if (gdext.classes.Window.mb_end_bulk_theme_override == null) gdext.classes.Window.mb_end_bulk_theme_override = MethodBind.get("Window", "end_bulk_theme_override", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.Window.mb_end_bulk_theme_override, livePtr)
  }

  /** Window.add_theme_icon_override */
  final def addThemeIconOverride(name: String, texture: Texture2D): Unit = {
    if (gdext.classes.Window.mb_add_theme_icon_override == null) gdext.classes.Window.mb_add_theme_icon_override = MethodBind.get("Window", "add_theme_icon_override", 1373065600L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_icon_override, livePtr, SnArg(name), Wrappers.handle(texture))
  }

  /** Window.add_theme_stylebox_override */
  final def addThemeStyleboxOverride(name: String, stylebox: StyleBox): Unit = {
    if (gdext.classes.Window.mb_add_theme_stylebox_override == null) gdext.classes.Window.mb_add_theme_stylebox_override = MethodBind.get("Window", "add_theme_stylebox_override", 4188838905L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_stylebox_override, livePtr, SnArg(name), Wrappers.handle(stylebox))
  }

  /** Window.add_theme_font_override */
  final def addThemeFontOverride(name: String, font: Font): Unit = {
    if (gdext.classes.Window.mb_add_theme_font_override == null) gdext.classes.Window.mb_add_theme_font_override = MethodBind.get("Window", "add_theme_font_override", 3518018674L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_font_override, livePtr, SnArg(name), Wrappers.handle(font))
  }

  /** Window.add_theme_font_size_override */
  final def addThemeFontSizeOverride(name: String, fontSize: Long): Unit = {
    if (gdext.classes.Window.mb_add_theme_font_size_override == null) gdext.classes.Window.mb_add_theme_font_size_override = MethodBind.get("Window", "add_theme_font_size_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_font_size_override, livePtr, SnArg(name), fontSize)
  }

  /** Window.add_theme_color_override */
  final def addThemeColorOverride(name: String, color: gdext.builtin.Color): Unit = {
    if (gdext.classes.Window.mb_add_theme_color_override == null) gdext.classes.Window.mb_add_theme_color_override = MethodBind.get("Window", "add_theme_color_override", 4260178595L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_color_override, livePtr, SnArg(name), color)
  }

  /** Window.add_theme_constant_override */
  final def addThemeConstantOverride(name: String, constant: Long): Unit = {
    if (gdext.classes.Window.mb_add_theme_constant_override == null) gdext.classes.Window.mb_add_theme_constant_override = MethodBind.get("Window", "add_theme_constant_override", 2415702435L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_add_theme_constant_override, livePtr, SnArg(name), constant)
  }

  /** Window.remove_theme_icon_override */
  final def removeThemeIconOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_icon_override == null) gdext.classes.Window.mb_remove_theme_icon_override = MethodBind.get("Window", "remove_theme_icon_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_icon_override, livePtr, SnArg(name))
  }

  /** Window.remove_theme_stylebox_override */
  final def removeThemeStyleboxOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_stylebox_override == null) gdext.classes.Window.mb_remove_theme_stylebox_override = MethodBind.get("Window", "remove_theme_stylebox_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_stylebox_override, livePtr, SnArg(name))
  }

  /** Window.remove_theme_font_override */
  final def removeThemeFontOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_font_override == null) gdext.classes.Window.mb_remove_theme_font_override = MethodBind.get("Window", "remove_theme_font_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_font_override, livePtr, SnArg(name))
  }

  /** Window.remove_theme_font_size_override */
  final def removeThemeFontSizeOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_font_size_override == null) gdext.classes.Window.mb_remove_theme_font_size_override = MethodBind.get("Window", "remove_theme_font_size_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_font_size_override, livePtr, SnArg(name))
  }

  /** Window.remove_theme_color_override */
  final def removeThemeColorOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_color_override == null) gdext.classes.Window.mb_remove_theme_color_override = MethodBind.get("Window", "remove_theme_color_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_color_override, livePtr, SnArg(name))
  }

  /** Window.remove_theme_constant_override */
  final def removeThemeConstantOverride(name: String): Unit = {
    if (gdext.classes.Window.mb_remove_theme_constant_override == null) gdext.classes.Window.mb_remove_theme_constant_override = MethodBind.get("Window", "remove_theme_constant_override", 3304788590L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_remove_theme_constant_override, livePtr, SnArg(name))
  }

  /** Window.get_theme_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeIcon(name: String, themeType: String = ""): Texture2D = {
    if (gdext.classes.Window.mb_get_theme_icon == null) gdext.classes.Window.mb_get_theme_icon = MethodBind.get("Window", "get_theme_icon", 3163973443L)
    Wrappers.owned[Texture2D](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Window.mb_get_theme_icon, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Window.get_theme_stylebox. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeStylebox(name: String, themeType: String = ""): StyleBox = {
    if (gdext.classes.Window.mb_get_theme_stylebox == null) gdext.classes.Window.mb_get_theme_stylebox = MethodBind.get("Window", "get_theme_stylebox", 604739069L)
    Wrappers.owned[StyleBox](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Window.mb_get_theme_stylebox, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Window.get_theme_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeFont(name: String, themeType: String = ""): Font = {
    if (gdext.classes.Window.mb_get_theme_font == null) gdext.classes.Window.mb_get_theme_font = MethodBind.get("Window", "get_theme_font", 2826986490L)
    Wrappers.owned[Font](Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Window.mb_get_theme_font, livePtr, SnArg(name), SnArg(themeType)))
  }

  /** Window.get_theme_font_size */
  final def getThemeFontSize(name: String, themeType: String = ""): Long = {
    if (gdext.classes.Window.mb_get_theme_font_size == null) gdext.classes.Window.mb_get_theme_font_size = MethodBind.get("Window", "get_theme_font_size", 1327056374L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Window.mb_get_theme_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.get_theme_color */
  final def getThemeColor(name: String, themeType: String = ""): gdext.builtin.Color = {
    if (gdext.classes.Window.mb_get_theme_color == null) gdext.classes.Window.mb_get_theme_color = MethodBind.get("Window", "get_theme_color", 2798751242L)
    Ptrcall.call2[SnArg, SnArg, gdext.builtin.Color](gdext.classes.Window.mb_get_theme_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.get_theme_constant */
  final def getThemeConstant(name: String, themeType: String = ""): Long = {
    if (gdext.classes.Window.mb_get_theme_constant == null) gdext.classes.Window.mb_get_theme_constant = MethodBind.get("Window", "get_theme_constant", 1327056374L)
    Ptrcall.call2[SnArg, SnArg, Long](gdext.classes.Window.mb_get_theme_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_icon_override */
  final def hasThemeIconOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_icon_override == null) gdext.classes.Window.mb_has_theme_icon_override = MethodBind.get("Window", "has_theme_icon_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_icon_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_stylebox_override */
  final def hasThemeStyleboxOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_stylebox_override == null) gdext.classes.Window.mb_has_theme_stylebox_override = MethodBind.get("Window", "has_theme_stylebox_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_stylebox_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_font_override */
  final def hasThemeFontOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_font_override == null) gdext.classes.Window.mb_has_theme_font_override = MethodBind.get("Window", "has_theme_font_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_font_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_font_size_override */
  final def hasThemeFontSizeOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_font_size_override == null) gdext.classes.Window.mb_has_theme_font_size_override = MethodBind.get("Window", "has_theme_font_size_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_font_size_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_color_override */
  final def hasThemeColorOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_color_override == null) gdext.classes.Window.mb_has_theme_color_override = MethodBind.get("Window", "has_theme_color_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_color_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_constant_override */
  final def hasThemeConstantOverride(name: String): Boolean = {
    if (gdext.classes.Window.mb_has_theme_constant_override == null) gdext.classes.Window.mb_has_theme_constant_override = MethodBind.get("Window", "has_theme_constant_override", 2619796661L)
    Ptrcall.call1[SnArg, Boolean](gdext.classes.Window.mb_has_theme_constant_override, livePtr, SnArg(name))
  }

  /** Window.has_theme_icon */
  final def hasThemeIcon(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_icon == null) gdext.classes.Window.mb_has_theme_icon = MethodBind.get("Window", "has_theme_icon", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_icon, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_stylebox */
  final def hasThemeStylebox(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_stylebox == null) gdext.classes.Window.mb_has_theme_stylebox = MethodBind.get("Window", "has_theme_stylebox", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_stylebox, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_font */
  final def hasThemeFont(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_font == null) gdext.classes.Window.mb_has_theme_font = MethodBind.get("Window", "has_theme_font", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_font, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_font_size */
  final def hasThemeFontSize(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_font_size == null) gdext.classes.Window.mb_has_theme_font_size = MethodBind.get("Window", "has_theme_font_size", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_font_size, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_color */
  final def hasThemeColor(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_color == null) gdext.classes.Window.mb_has_theme_color = MethodBind.get("Window", "has_theme_color", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_color, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.has_theme_constant */
  final def hasThemeConstant(name: String, themeType: String = ""): Boolean = {
    if (gdext.classes.Window.mb_has_theme_constant == null) gdext.classes.Window.mb_has_theme_constant = MethodBind.get("Window", "has_theme_constant", 866386512L)
    Ptrcall.call2[SnArg, SnArg, Boolean](gdext.classes.Window.mb_has_theme_constant, livePtr, SnArg(name), SnArg(themeType))
  }

  /** Window.get_theme_default_base_scale */
  final def getThemeDefaultBaseScale(): Double = {
    if (gdext.classes.Window.mb_get_theme_default_base_scale == null) gdext.classes.Window.mb_get_theme_default_base_scale = MethodBind.get("Window", "get_theme_default_base_scale", 1740695150L)
    Ptrcall.call0[Double](gdext.classes.Window.mb_get_theme_default_base_scale, livePtr)
  }

  /** Window.get_theme_default_font. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getThemeDefaultFont(): Font = {
    if (gdext.classes.Window.mb_get_theme_default_font == null) gdext.classes.Window.mb_get_theme_default_font = MethodBind.get("Window", "get_theme_default_font", 3229501585L)
    Wrappers.owned[Font](Ptrcall.call0[Long](gdext.classes.Window.mb_get_theme_default_font, livePtr))
  }

  /** Window.get_theme_default_font_size */
  final def getThemeDefaultFontSize(): Long = {
    if (gdext.classes.Window.mb_get_theme_default_font_size == null) gdext.classes.Window.mb_get_theme_default_font_size = MethodBind.get("Window", "get_theme_default_font_size", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Window.mb_get_theme_default_font_size, livePtr)
  }

  /** Window.get_window_id */
  final def getWindowId(): Long = {
    if (gdext.classes.Window.mb_get_window_id == null) gdext.classes.Window.mb_get_window_id = MethodBind.get("Window", "get_window_id", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Window.mb_get_window_id, livePtr)
  }

  /** Window.set_accessibility_name */
  final def setAccessibilityName(name: String): Unit = {
    if (gdext.classes.Window.mb_set_accessibility_name == null) gdext.classes.Window.mb_set_accessibility_name = MethodBind.get("Window", "set_accessibility_name", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_accessibility_name, livePtr, name)
  }

  /** Window.get_accessibility_name */
  final def getAccessibilityName(): String = {
    if (gdext.classes.Window.mb_get_accessibility_name == null) gdext.classes.Window.mb_get_accessibility_name = MethodBind.get("Window", "get_accessibility_name", 201670096L)
    Ptrcall.call0[String](gdext.classes.Window.mb_get_accessibility_name, livePtr)
  }

  /** Window.set_accessibility_description */
  final def setAccessibilityDescription(description: String): Unit = {
    if (gdext.classes.Window.mb_set_accessibility_description == null) gdext.classes.Window.mb_set_accessibility_description = MethodBind.get("Window", "set_accessibility_description", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_accessibility_description, livePtr, description)
  }

  /** Window.get_accessibility_description */
  final def getAccessibilityDescription(): String = {
    if (gdext.classes.Window.mb_get_accessibility_description == null) gdext.classes.Window.mb_get_accessibility_description = MethodBind.get("Window", "get_accessibility_description", 201670096L)
    Ptrcall.call0[String](gdext.classes.Window.mb_get_accessibility_description, livePtr)
  }

  /** Window.set_layout_direction */
  final def setLayoutDirection(direction: gdext.classes.Window.LayoutDirection): Unit = {
    if (gdext.classes.Window.mb_set_layout_direction == null) gdext.classes.Window.mb_set_layout_direction = MethodBind.get("Window", "set_layout_direction", 3094704184L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_layout_direction, livePtr, direction)
  }

  /** Window.get_layout_direction */
  final def getLayoutDirection(): gdext.classes.Window.LayoutDirection = {
    if (gdext.classes.Window.mb_get_layout_direction == null) gdext.classes.Window.mb_get_layout_direction = MethodBind.get("Window", "get_layout_direction", 3909617982L)
    gdext.classes.Window.LayoutDirection(Ptrcall.call0[Long](gdext.classes.Window.mb_get_layout_direction, livePtr))
  }

  /** Window.is_layout_rtl */
  final def isLayoutRtl(): Boolean = {
    if (gdext.classes.Window.mb_is_layout_rtl == null) gdext.classes.Window.mb_is_layout_rtl = MethodBind.get("Window", "is_layout_rtl", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_layout_rtl, livePtr)
  }

  /** Window.set_auto_translate */
  final def setAutoTranslate(enable: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_auto_translate == null) gdext.classes.Window.mb_set_auto_translate = MethodBind.get("Window", "set_auto_translate", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_auto_translate, livePtr, enable)
  }

  /** Window.is_auto_translating */
  final def isAutoTranslating(): Boolean = {
    if (gdext.classes.Window.mb_is_auto_translating == null) gdext.classes.Window.mb_is_auto_translating = MethodBind.get("Window", "is_auto_translating", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_auto_translating, livePtr)
  }

  /** Window.set_use_font_oversampling */
  final def setUseFontOversampling(enable: Boolean): Unit = {
    if (gdext.classes.Window.mb_set_use_font_oversampling == null) gdext.classes.Window.mb_set_use_font_oversampling = MethodBind.get("Window", "set_use_font_oversampling", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_set_use_font_oversampling, livePtr, enable)
  }

  /** Window.is_using_font_oversampling */
  final def isUsingFontOversampling(): Boolean = {
    if (gdext.classes.Window.mb_is_using_font_oversampling == null) gdext.classes.Window.mb_is_using_font_oversampling = MethodBind.get("Window", "is_using_font_oversampling", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Window.mb_is_using_font_oversampling, livePtr)
  }

  /** Window.popup */
  final def popup(rect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.Window.mb_popup == null) gdext.classes.Window.mb_popup = MethodBind.get("Window", "popup", 1680304321L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_popup, livePtr, rect)
  }

  /** Window.popup_on_parent */
  final def popupOnParent(parentRect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.Window.mb_popup_on_parent == null) gdext.classes.Window.mb_popup_on_parent = MethodBind.get("Window", "popup_on_parent", 1763793166L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_popup_on_parent, livePtr, parentRect)
  }

  /** Window.popup_centered */
  final def popupCentered(minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0)): Unit = {
    if (gdext.classes.Window.mb_popup_centered == null) gdext.classes.Window.mb_popup_centered = MethodBind.get("Window", "popup_centered", 3447975422L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_popup_centered, livePtr, minsize)
  }

  /** Window.popup_centered_ratio */
  final def popupCenteredRatio(ratio: Double = 0.8): Unit = {
    if (gdext.classes.Window.mb_popup_centered_ratio == null) gdext.classes.Window.mb_popup_centered_ratio = MethodBind.get("Window", "popup_centered_ratio", 1014814997L)
    Ptrcall.callVoid1(gdext.classes.Window.mb_popup_centered_ratio, livePtr, ratio)
  }

  /** Window.popup_centered_clamped */
  final def popupCenteredClamped(minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0), fallbackRatio: Double = 0.75): Unit = {
    if (gdext.classes.Window.mb_popup_centered_clamped == null) gdext.classes.Window.mb_popup_centered_clamped = MethodBind.get("Window", "popup_centered_clamped", 2613752477L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_popup_centered_clamped, livePtr, minsize, fallbackRatio)
  }

  /** Window.popup_exclusive */
  final def popupExclusive(fromNode: Node, rect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.Window.mb_popup_exclusive == null) gdext.classes.Window.mb_popup_exclusive = MethodBind.get("Window", "popup_exclusive", 2134721627L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_popup_exclusive, livePtr, Wrappers.handle(fromNode), rect)
  }

  /** Window.popup_exclusive_on_parent */
  final def popupExclusiveOnParent(fromNode: Node, parentRect: gdext.builtin.Rect2i): Unit = {
    if (gdext.classes.Window.mb_popup_exclusive_on_parent == null) gdext.classes.Window.mb_popup_exclusive_on_parent = MethodBind.get("Window", "popup_exclusive_on_parent", 2344671043L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_popup_exclusive_on_parent, livePtr, Wrappers.handle(fromNode), parentRect)
  }

  /** Window.popup_exclusive_centered */
  final def popupExclusiveCentered(fromNode: Node, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0)): Unit = {
    if (gdext.classes.Window.mb_popup_exclusive_centered == null) gdext.classes.Window.mb_popup_exclusive_centered = MethodBind.get("Window", "popup_exclusive_centered", 3357594017L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_popup_exclusive_centered, livePtr, Wrappers.handle(fromNode), minsize)
  }

  /** Window.popup_exclusive_centered_ratio */
  final def popupExclusiveCenteredRatio(fromNode: Node, ratio: Double = 0.8): Unit = {
    if (gdext.classes.Window.mb_popup_exclusive_centered_ratio == null) gdext.classes.Window.mb_popup_exclusive_centered_ratio = MethodBind.get("Window", "popup_exclusive_centered_ratio", 2284776287L)
    Ptrcall.callVoid2(gdext.classes.Window.mb_popup_exclusive_centered_ratio, livePtr, Wrappers.handle(fromNode), ratio)
  }

  /** Window.popup_exclusive_centered_clamped */
  final def popupExclusiveCenteredClamped(fromNode: Node, minsize: gdext.builtin.Vector2i = gdext.builtin.Vector2i(0, 0), fallbackRatio: Double = 0.75): Unit = {
    if (gdext.classes.Window.mb_popup_exclusive_centered_clamped == null) gdext.classes.Window.mb_popup_exclusive_centered_clamped = MethodBind.get("Window", "popup_exclusive_centered_clamped", 2612708785L)
    Ptrcall.callVoid3(gdext.classes.Window.mb_popup_exclusive_centered_clamped, livePtr, Wrappers.handle(fromNode), minsize, fallbackRatio)
  }

}

object Window {
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_initial_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_initial_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_current_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_current_screen: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_to_center: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_reset_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_position_with_decorations: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_size_with_decorations: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_max_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_min_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_flag: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_maximize_allowed: GDExtensionMethodBindPtr = null
  private[classes] var mb_request_attention: GDExtensionMethodBindPtr = null
  private[classes] var mb_move_to_foreground: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_hide: GDExtensionMethodBindPtr = null
  private[classes] var mb_show: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transient: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transient: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_transient_to_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_transient_to_focused: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_exclusive: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_exclusive: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_unparent_when_invisible: GDExtensionMethodBindPtr = null
  private[classes] var mb_can_draw: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_grab_focus: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_drag: GDExtensionMethodBindPtr = null
  private[classes] var mb_start_resize: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ime_active: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_ime_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_embedded: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_contents_minimum_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_force_native: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_force_native: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_scale_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_scale_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_scale_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_scale_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_scale_aspect: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_scale_aspect: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_scale_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_scale_stretch: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_nonclient_area: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_nonclient_area: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_keep_title_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_keep_title_visible: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_content_scale_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_content_scale_factor: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_wrap_controls: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_wrapping_controls: GDExtensionMethodBindPtr = null
  private[classes] var mb_child_controls_changed: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_theme_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_type_variation: GDExtensionMethodBindPtr = null
  private[classes] var mb_begin_bulk_theme_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_end_bulk_theme_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_icon_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_stylebox_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_size_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_color_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_constant_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_stylebox: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_color: GDExtensionMethodBindPtr = null
  private[classes] var mb_has_theme_constant: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_base_scale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_font: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_theme_default_font_size: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_window_id: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessibility_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessibility_name: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_accessibility_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_accessibility_description: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_focused_window: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_layout_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_layout_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_layout_rtl: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_auto_translate: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_auto_translating: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_use_font_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_using_font_oversampling: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_on_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_centered_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_centered_clamped: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_exclusive: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_exclusive_on_parent: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_exclusive_centered: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_exclusive_centered_ratio: GDExtensionMethodBindPtr = null
  private[classes] var mb_popup_exclusive_centered_clamped: GDExtensionMethodBindPtr = null

  /** Window.get_focused_window */
  final def getFocusedWindow(): Window = {
    if (gdext.classes.Window.mb_get_focused_window == null) gdext.classes.Window.mb_get_focused_window = MethodBind.get("Window", "get_focused_window", 1835468782L)
    Wrappers.borrowed[Window](Ptrcall.call0[Long](gdext.classes.Window.mb_get_focused_window, null.asInstanceOf[gdext.internal.ffi.types.GDExtensionObjectPtr]))
  }

  /** Godot enum `Window.Mode`. */
  opaque type Mode <: Long = Long

  object Mode {
    final val Windowed: Mode = 0L.asInstanceOf[Mode]
    final val Minimized: Mode = 1L.asInstanceOf[Mode]
    final val Maximized: Mode = 2L.asInstanceOf[Mode]
    final val Fullscreen: Mode = 3L.asInstanceOf[Mode]
    final val ExclusiveFullscreen: Mode = 4L.asInstanceOf[Mode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Mode = value.asInstanceOf[Mode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Mode] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[Mode]]

    extension (self: Mode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Windowed"
        case 1L => "Minimized"
        case 2L => "Maximized"
        case 3L => "Fullscreen"
        case 4L => "ExclusiveFullscreen"
        case other => other.toString
      }
  }

  /** Godot enum `Window.Flags`. */
  opaque type Flags <: Long = Long

  object Flags {
    final val ResizeDisabled: Flags = 0L.asInstanceOf[Flags]
    final val Borderless: Flags = 1L.asInstanceOf[Flags]
    final val AlwaysOnTop: Flags = 2L.asInstanceOf[Flags]
    final val Transparent: Flags = 3L.asInstanceOf[Flags]
    final val NoFocus: Flags = 4L.asInstanceOf[Flags]
    final val Popup: Flags = 5L.asInstanceOf[Flags]
    final val ExtendToTitle: Flags = 6L.asInstanceOf[Flags]
    final val MousePassthrough: Flags = 7L.asInstanceOf[Flags]
    final val SharpCorners: Flags = 8L.asInstanceOf[Flags]
    final val ExcludeFromCapture: Flags = 9L.asInstanceOf[Flags]
    final val PopupWmHint: Flags = 10L.asInstanceOf[Flags]
    final val MinimizeDisabled: Flags = 11L.asInstanceOf[Flags]
    final val MaximizeDisabled: Flags = 12L.asInstanceOf[Flags]
    final val Max: Flags = 13L.asInstanceOf[Flags]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): Flags = value.asInstanceOf[Flags]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[Flags] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 10L, 11L, 12L, 13L).asInstanceOf[scala.IArray[Flags]]

    extension (self: Flags)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "ResizeDisabled"
        case 1L => "Borderless"
        case 2L => "AlwaysOnTop"
        case 3L => "Transparent"
        case 4L => "NoFocus"
        case 5L => "Popup"
        case 6L => "ExtendToTitle"
        case 7L => "MousePassthrough"
        case 8L => "SharpCorners"
        case 9L => "ExcludeFromCapture"
        case 10L => "PopupWmHint"
        case 11L => "MinimizeDisabled"
        case 12L => "MaximizeDisabled"
        case 13L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Window.ContentScaleMode`. */
  opaque type ContentScaleMode <: Long = Long

  object ContentScaleMode {
    final val Disabled: ContentScaleMode = 0L.asInstanceOf[ContentScaleMode]
    final val CanvasItems: ContentScaleMode = 1L.asInstanceOf[ContentScaleMode]
    final val Viewport: ContentScaleMode = 2L.asInstanceOf[ContentScaleMode]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ContentScaleMode = value.asInstanceOf[ContentScaleMode]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ContentScaleMode] = scala.IArray[Long](0L, 1L, 2L).asInstanceOf[scala.IArray[ContentScaleMode]]

    extension (self: ContentScaleMode)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Disabled"
        case 1L => "CanvasItems"
        case 2L => "Viewport"
        case other => other.toString
      }
  }

  /** Godot enum `Window.ContentScaleAspect`. */
  opaque type ContentScaleAspect <: Long = Long

  object ContentScaleAspect {
    final val Ignore: ContentScaleAspect = 0L.asInstanceOf[ContentScaleAspect]
    final val Keep: ContentScaleAspect = 1L.asInstanceOf[ContentScaleAspect]
    final val KeepWidth: ContentScaleAspect = 2L.asInstanceOf[ContentScaleAspect]
    final val KeepHeight: ContentScaleAspect = 3L.asInstanceOf[ContentScaleAspect]
    final val Expand: ContentScaleAspect = 4L.asInstanceOf[ContentScaleAspect]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ContentScaleAspect = value.asInstanceOf[ContentScaleAspect]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ContentScaleAspect] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L).asInstanceOf[scala.IArray[ContentScaleAspect]]

    extension (self: ContentScaleAspect)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Ignore"
        case 1L => "Keep"
        case 2L => "KeepWidth"
        case 3L => "KeepHeight"
        case 4L => "Expand"
        case other => other.toString
      }
  }

  /** Godot enum `Window.ContentScaleStretch`. */
  opaque type ContentScaleStretch <: Long = Long

  object ContentScaleStretch {
    final val Fractional: ContentScaleStretch = 0L.asInstanceOf[ContentScaleStretch]
    final val Integer: ContentScaleStretch = 1L.asInstanceOf[ContentScaleStretch]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): ContentScaleStretch = value.asInstanceOf[ContentScaleStretch]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[ContentScaleStretch] = scala.IArray[Long](0L, 1L).asInstanceOf[scala.IArray[ContentScaleStretch]]

    extension (self: ContentScaleStretch)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Fractional"
        case 1L => "Integer"
        case other => other.toString
      }
  }

  /** Godot enum `Window.LayoutDirection`. */
  opaque type LayoutDirection <: Long = Long

  object LayoutDirection {
    final val Inherited: LayoutDirection = 0L.asInstanceOf[LayoutDirection]
    final val ApplicationLocale: LayoutDirection = 1L.asInstanceOf[LayoutDirection]
    final val Ltr: LayoutDirection = 2L.asInstanceOf[LayoutDirection]
    final val Rtl: LayoutDirection = 3L.asInstanceOf[LayoutDirection]
    final val SystemLocale: LayoutDirection = 4L.asInstanceOf[LayoutDirection]
    final val Max: LayoutDirection = 5L.asInstanceOf[LayoutDirection]
    final val Locale: LayoutDirection = 1L.asInstanceOf[LayoutDirection]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): LayoutDirection = value.asInstanceOf[LayoutDirection]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[LayoutDirection] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[LayoutDirection]]

    extension (self: LayoutDirection)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Inherited"
        case 1L => "ApplicationLocale"
        case 2L => "Ltr"
        case 3L => "Rtl"
        case 4L => "SystemLocale"
        case 5L => "Max"
        case other => other.toString
      }
  }

  /** Godot enum `Window.WindowInitialPosition`. */
  opaque type WindowInitialPosition <: Long = Long

  object WindowInitialPosition {
    final val Absolute: WindowInitialPosition = 0L.asInstanceOf[WindowInitialPosition]
    final val CenterPrimaryScreen: WindowInitialPosition = 1L.asInstanceOf[WindowInitialPosition]
    final val CenterMainWindowScreen: WindowInitialPosition = 2L.asInstanceOf[WindowInitialPosition]
    final val CenterOtherScreen: WindowInitialPosition = 3L.asInstanceOf[WindowInitialPosition]
    final val CenterScreenWithMouseFocus: WindowInitialPosition = 4L.asInstanceOf[WindowInitialPosition]
    final val CenterScreenWithKeyboardFocus: WindowInitialPosition = 5L.asInstanceOf[WindowInitialPosition]

    /** A value from its raw Godot integer. */
    inline def apply(value: Long): WindowInitialPosition = value.asInstanceOf[WindowInitialPosition]

    /** Every named value, ascending, aliases once. */
    val values: scala.IArray[WindowInitialPosition] = scala.IArray[Long](0L, 1L, 2L, 3L, 4L, 5L).asInstanceOf[scala.IArray[WindowInitialPosition]]

    extension (self: WindowInitialPosition)
      /** The constant's Scala name, or the number for an unnamed value. */
      def name: String = self.asInstanceOf[Long] match {
        case 0L => "Absolute"
        case 1L => "CenterPrimaryScreen"
        case 2L => "CenterMainWindowScreen"
        case 3L => "CenterOtherScreen"
        case 4L => "CenterScreenWithMouseFocus"
        case 5L => "CenterScreenWithKeyboardFocus"
        case other => other.toString
      }
  }
}
