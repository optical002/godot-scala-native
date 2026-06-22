package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `Button`, extends `BaseButton`. */
abstract class Button extends BaseButton {

  /** Button.set_text */
  final def setText(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_text", 83702148L), hostObject.objectPtr, text)

  /** Button.get_text */
  final def getText(): String =
    Ptrcall.call0[String](MethodBind.get("Button", "get_text", 201670096L), hostObject.objectPtr)

  /** Button.set_text_overrun_behavior */
  final def setTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** Button.get_text_overrun_behavior */
  final def getTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** Button.set_autowrap_mode */
  final def setAutowrapMode(autowrap_mode: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_autowrap_mode", 3289138044L), hostObject.objectPtr, autowrap_mode)

  /** Button.get_autowrap_mode */
  final def getAutowrapMode(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_autowrap_mode", 1549071663L), hostObject.objectPtr)

  /** Button.set_autowrap_trim_flags */
  final def setAutowrapTrimFlags(autowrap_trim_flags: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_autowrap_trim_flags", 2809697122L), hostObject.objectPtr, autowrap_trim_flags)

  /** Button.get_autowrap_trim_flags */
  final def getAutowrapTrimFlags(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_autowrap_trim_flags", 2340632602L), hostObject.objectPtr)

  /** Button.set_text_direction */
  final def setTextDirection(direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_text_direction", 119160795L), hostObject.objectPtr, direction)

  /** Button.get_text_direction */
  final def getTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_text_direction", 797257663L), hostObject.objectPtr)

  /** Button.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_language", 83702148L), hostObject.objectPtr, language)

  /** Button.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("Button", "get_language", 201670096L), hostObject.objectPtr)

  /** Button.set_button_icon */
  final def setButtonIcon(texture: Texture2D): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_button_icon", 4051416890L), hostObject.objectPtr, texture.hostObject)

  /** Button.get_button_icon */
  final def getButtonIcon(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("Button", "get_button_icon", 3635182373L), hostObject.objectPtr)

  /** Button.set_flat */
  final def setFlat(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_flat", 2586408642L), hostObject.objectPtr, enabled)

  /** Button.is_flat */
  final def isFlat(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Button", "is_flat", 36873697L), hostObject.objectPtr)

  /** Button.set_clip_text */
  final def setClipText(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_clip_text", 2586408642L), hostObject.objectPtr, enabled)

  /** Button.get_clip_text */
  final def getClipText(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Button", "get_clip_text", 36873697L), hostObject.objectPtr)

  /** Button.set_text_alignment */
  final def setTextAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_text_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** Button.get_text_alignment */
  final def getTextAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_text_alignment", 341400642L), hostObject.objectPtr)

  /** Button.set_icon_alignment */
  final def setIconAlignment(icon_alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_icon_alignment", 2312603777L), hostObject.objectPtr, icon_alignment)

  /** Button.get_icon_alignment */
  final def getIconAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_icon_alignment", 341400642L), hostObject.objectPtr)

  /** Button.set_vertical_icon_alignment */
  final def setVerticalIconAlignment(vertical_icon_alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_vertical_icon_alignment", 1796458609L), hostObject.objectPtr, vertical_icon_alignment)

  /** Button.get_vertical_icon_alignment */
  final def getVerticalIconAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("Button", "get_vertical_icon_alignment", 3274884059L), hostObject.objectPtr)

  /** Button.set_expand_icon */
  final def setExpandIcon(enabled: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("Button", "set_expand_icon", 2586408642L), hostObject.objectPtr, enabled)

  /** Button.is_expand_icon */
  final def isExpandIcon(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("Button", "is_expand_icon", 36873697L), hostObject.objectPtr)

}

object Button {
  /** Class metadata for Gd[Button] lifetime management and casting. */
  given GodotClass[Button] with {
    def className = "Button"
    def isRefCounted = false
    def wrap(o: GodotObject): Button = new Button {}.withHost(o.objectPtr)
    def unwrap(t: Button): GodotObject = t.hostObject
  }
}
