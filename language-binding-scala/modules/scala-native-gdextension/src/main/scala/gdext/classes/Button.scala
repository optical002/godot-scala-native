package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Button`, extends `BaseButton`. */
abstract class Button extends BaseButton {
  override def godotClassName: String = "Button"

  /** Button.set_text */
  final def setText(text: String): Unit = {
    if (gdext.classes.Button.mb_set_text == null) gdext.classes.Button.mb_set_text = MethodBind.get("Button", "set_text", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_text, livePtr, text)
  }

  /** Button.get_text */
  final def getText(): String = {
    if (gdext.classes.Button.mb_get_text == null) gdext.classes.Button.mb_get_text = MethodBind.get("Button", "get_text", 201670096L)
    Ptrcall.call0[String](gdext.classes.Button.mb_get_text, livePtr)
  }

  /** Button.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrunBehavior: gdext.classes.TextServer.OverrunBehavior): Unit = {
    if (gdext.classes.Button.mb_set_text_overrun_behavior == null) gdext.classes.Button.mb_set_text_overrun_behavior = MethodBind.get("Button", "set_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_text_overrun_behavior, livePtr, overrunBehavior)
  }

  /** Button.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): gdext.classes.TextServer.OverrunBehavior = {
    if (gdext.classes.Button.mb_get_text_overrun_behavior == null) gdext.classes.Button.mb_get_text_overrun_behavior = MethodBind.get("Button", "get_text_overrun_behavior", 3779142101L)
    gdext.classes.TextServer.OverrunBehavior(Ptrcall.call0[Long](gdext.classes.Button.mb_get_text_overrun_behavior, livePtr))
  }

  /** Button.set_autowrap_mode */
  final def setAutowrapMode(autowrapMode: gdext.classes.TextServer.AutowrapMode): Unit = {
    if (gdext.classes.Button.mb_set_autowrap_mode == null) gdext.classes.Button.mb_set_autowrap_mode = MethodBind.get("Button", "set_autowrap_mode", 3289138044L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_autowrap_mode, livePtr, autowrapMode)
  }

  /** Button.get_autowrap_mode */
  final def getAutowrapMode(): gdext.classes.TextServer.AutowrapMode = {
    if (gdext.classes.Button.mb_get_autowrap_mode == null) gdext.classes.Button.mb_get_autowrap_mode = MethodBind.get("Button", "get_autowrap_mode", 1549071663L)
    gdext.classes.TextServer.AutowrapMode(Ptrcall.call0[Long](gdext.classes.Button.mb_get_autowrap_mode, livePtr))
  }

  /** Button.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrapTrimFlags: gdext.classes.TextServer.LineBreakFlag): Unit = {
    if (gdext.classes.Button.mb_set_autowrap_trim_flags == null) gdext.classes.Button.mb_set_autowrap_trim_flags = MethodBind.get("Button", "set_autowrap_trim_flags", 2809697122L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_autowrap_trim_flags, livePtr, autowrapTrimFlags.asInstanceOf[Long])
  }

  /** Button.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): gdext.classes.TextServer.LineBreakFlag = {
    if (gdext.classes.Button.mb_get_autowrap_trim_flags == null) gdext.classes.Button.mb_get_autowrap_trim_flags = MethodBind.get("Button", "get_autowrap_trim_flags", 2340632602L)
    gdext.classes.TextServer.LineBreakFlag(Ptrcall.call0[Long](gdext.classes.Button.mb_get_autowrap_trim_flags, livePtr))
  }

  /** Button.set_text_direction */
  final def setTextDirection(direction: gdext.classes.Control.TextDirection): Unit = {
    if (gdext.classes.Button.mb_set_text_direction == null) gdext.classes.Button.mb_set_text_direction = MethodBind.get("Button", "set_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_text_direction, livePtr, direction)
  }

  /** Button.get_text_direction */
  final def getTextDirection(): gdext.classes.Control.TextDirection = {
    if (gdext.classes.Button.mb_get_text_direction == null) gdext.classes.Button.mb_get_text_direction = MethodBind.get("Button", "get_text_direction", 797257663L)
    gdext.classes.Control.TextDirection(Ptrcall.call0[Long](gdext.classes.Button.mb_get_text_direction, livePtr))
  }

  /** Button.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.Button.mb_set_language == null) gdext.classes.Button.mb_set_language = MethodBind.get("Button", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_language, livePtr, language)
  }

  /** Button.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.Button.mb_get_language == null) gdext.classes.Button.mb_get_language = MethodBind.get("Button", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.Button.mb_get_language, livePtr)
  }

  /** Button.set_button_icon */
  final def setButtonIcon(texture: Texture2D): Unit = {
    if (gdext.classes.Button.mb_set_button_icon == null) gdext.classes.Button.mb_set_button_icon = MethodBind.get("Button", "set_button_icon", 4051416890L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_button_icon, livePtr, Wrappers.handle(texture))
  }

  /** Button.get_button_icon. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getButtonIcon(): Texture2D = {
    if (gdext.classes.Button.mb_get_button_icon == null) gdext.classes.Button.mb_get_button_icon = MethodBind.get("Button", "get_button_icon", 3635182373L)
    Wrappers.owned[Texture2D](Ptrcall.call0[Long](gdext.classes.Button.mb_get_button_icon, livePtr))
  }

  /** Button.set_flat */
  final def setFlat(enabled: Boolean): Unit = {
    if (gdext.classes.Button.mb_set_flat == null) gdext.classes.Button.mb_set_flat = MethodBind.get("Button", "set_flat", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_flat, livePtr, enabled)
  }

  /** Button.is_flat */
  final def isFlat(): Boolean = {
    if (gdext.classes.Button.mb_is_flat == null) gdext.classes.Button.mb_is_flat = MethodBind.get("Button", "is_flat", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Button.mb_is_flat, livePtr)
  }

  /** Button.set_clip_text */
  final def setClipText(enabled: Boolean): Unit = {
    if (gdext.classes.Button.mb_set_clip_text == null) gdext.classes.Button.mb_set_clip_text = MethodBind.get("Button", "set_clip_text", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_clip_text, livePtr, enabled)
  }

  /** Button.get_clip_text */
  final def getClipText(): Boolean = {
    if (gdext.classes.Button.mb_get_clip_text == null) gdext.classes.Button.mb_get_clip_text = MethodBind.get("Button", "get_clip_text", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Button.mb_get_clip_text, livePtr)
  }

  /** Button.set_text_alignment */
  final def setTextAlignment(alignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.Button.mb_set_text_alignment == null) gdext.classes.Button.mb_set_text_alignment = MethodBind.get("Button", "set_text_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_text_alignment, livePtr, alignment)
  }

  /** Button.get_text_alignment */
  final def getTextAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.Button.mb_get_text_alignment == null) gdext.classes.Button.mb_get_text_alignment = MethodBind.get("Button", "get_text_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.Button.mb_get_text_alignment, livePtr))
  }

  /** Button.set_icon_alignment */
  final def setIconAlignment(iconAlignment: gdext.classes.HorizontalAlignment): Unit = {
    if (gdext.classes.Button.mb_set_icon_alignment == null) gdext.classes.Button.mb_set_icon_alignment = MethodBind.get("Button", "set_icon_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_icon_alignment, livePtr, iconAlignment)
  }

  /** Button.get_icon_alignment */
  final def getIconAlignment(): gdext.classes.HorizontalAlignment = {
    if (gdext.classes.Button.mb_get_icon_alignment == null) gdext.classes.Button.mb_get_icon_alignment = MethodBind.get("Button", "get_icon_alignment", 341400642L)
    gdext.classes.HorizontalAlignment(Ptrcall.call0[Long](gdext.classes.Button.mb_get_icon_alignment, livePtr))
  }

  /** Button.set_vertical_icon_alignment */
  final def setVerticalIconAlignment(verticalIconAlignment: gdext.classes.VerticalAlignment): Unit = {
    if (gdext.classes.Button.mb_set_vertical_icon_alignment == null) gdext.classes.Button.mb_set_vertical_icon_alignment = MethodBind.get("Button", "set_vertical_icon_alignment", 1796458609L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_vertical_icon_alignment, livePtr, verticalIconAlignment)
  }

  /** Button.get_vertical_icon_alignment */
  final def getVerticalIconAlignment(): gdext.classes.VerticalAlignment = {
    if (gdext.classes.Button.mb_get_vertical_icon_alignment == null) gdext.classes.Button.mb_get_vertical_icon_alignment = MethodBind.get("Button", "get_vertical_icon_alignment", 3274884059L)
    gdext.classes.VerticalAlignment(Ptrcall.call0[Long](gdext.classes.Button.mb_get_vertical_icon_alignment, livePtr))
  }

  /** Button.set_expand_icon */
  final def setExpandIcon(enabled: Boolean): Unit = {
    if (gdext.classes.Button.mb_set_expand_icon == null) gdext.classes.Button.mb_set_expand_icon = MethodBind.get("Button", "set_expand_icon", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.Button.mb_set_expand_icon, livePtr, enabled)
  }

  /** Button.is_expand_icon */
  final def isExpandIcon(): Boolean = {
    if (gdext.classes.Button.mb_is_expand_icon == null) gdext.classes.Button.mb_is_expand_icon = MethodBind.get("Button", "is_expand_icon", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.Button.mb_is_expand_icon, livePtr)
  }

}

object Button {
  private[classes] var mb_set_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_mode: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_autowrap_trim_flags: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_button_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_flat: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_clip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_clip_text: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_text_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_text_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_icon_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_icon_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_vertical_icon_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_vertical_icon_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_expand_icon: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_expand_icon: GDExtensionMethodBindPtr = null
}
