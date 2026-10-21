package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `FoldableContainer`, extends `Container`. */
abstract class FoldableContainer extends Container {
  override def godotClassName: String = "FoldableContainer"

  /** FoldableContainer.fold */
  final def fold(): Unit = {
    if (gdext.classes.FoldableContainer.mb_fold == null) gdext.classes.FoldableContainer.mb_fold = MethodBind.get("FoldableContainer", "fold", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FoldableContainer.mb_fold, livePtr)
  }

  /** FoldableContainer.expand */
  final def expand(): Unit = {
    if (gdext.classes.FoldableContainer.mb_expand == null) gdext.classes.FoldableContainer.mb_expand = MethodBind.get("FoldableContainer", "expand", 3218959716L)
    Ptrcall.callVoid0(gdext.classes.FoldableContainer.mb_expand, livePtr)
  }

  /** FoldableContainer.set_folded */
  final def setFolded(folded: Boolean): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_folded == null) gdext.classes.FoldableContainer.mb_set_folded = MethodBind.get("FoldableContainer", "set_folded", 2586408642L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_folded, livePtr, folded)
  }

  /** FoldableContainer.is_folded */
  final def isFolded(): Boolean = {
    if (gdext.classes.FoldableContainer.mb_is_folded == null) gdext.classes.FoldableContainer.mb_is_folded = MethodBind.get("FoldableContainer", "is_folded", 36873697L)
    Ptrcall.call0[Boolean](gdext.classes.FoldableContainer.mb_is_folded, livePtr)
  }

  /** FoldableContainer.set_foldable_group */
  final def setFoldableGroup(button_group: FoldableGroup): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_foldable_group == null) gdext.classes.FoldableContainer.mb_set_foldable_group = MethodBind.get("FoldableContainer", "set_foldable_group", 3001390597L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_foldable_group, livePtr, Wrappers.handle(button_group))
  }

  /** FoldableContainer.get_foldable_group. Returns an owned reference: release it with `unref()` or inside `Gd.scoped`. */
  final def getFoldableGroup(): FoldableGroup = {
    if (gdext.classes.FoldableContainer.mb_get_foldable_group == null) gdext.classes.FoldableContainer.mb_get_foldable_group = MethodBind.get("FoldableContainer", "get_foldable_group", 66499518L)
    Wrappers.owned[FoldableGroup](Ptrcall.call0[Long](gdext.classes.FoldableContainer.mb_get_foldable_group, livePtr))
  }

  /** FoldableContainer.set_title */
  final def setTitle(text: String): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_title == null) gdext.classes.FoldableContainer.mb_set_title = MethodBind.get("FoldableContainer", "set_title", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_title, livePtr, text)
  }

  /** FoldableContainer.get_title */
  final def getTitle(): String = {
    if (gdext.classes.FoldableContainer.mb_get_title == null) gdext.classes.FoldableContainer.mb_get_title = MethodBind.get("FoldableContainer", "get_title", 201670096L)
    Ptrcall.call0[String](gdext.classes.FoldableContainer.mb_get_title, livePtr)
  }

  /** FoldableContainer.set_title_alignment */
  final def setTitleAlignment(alignment: Long): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_title_alignment == null) gdext.classes.FoldableContainer.mb_set_title_alignment = MethodBind.get("FoldableContainer", "set_title_alignment", 2312603777L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_title_alignment, livePtr, alignment)
  }

  /** FoldableContainer.get_title_alignment */
  final def getTitleAlignment(): Long = {
    if (gdext.classes.FoldableContainer.mb_get_title_alignment == null) gdext.classes.FoldableContainer.mb_get_title_alignment = MethodBind.get("FoldableContainer", "get_title_alignment", 341400642L)
    Ptrcall.call0[Long](gdext.classes.FoldableContainer.mb_get_title_alignment, livePtr)
  }

  /** FoldableContainer.set_language */
  final def setLanguage(language: String): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_language == null) gdext.classes.FoldableContainer.mb_set_language = MethodBind.get("FoldableContainer", "set_language", 83702148L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_language, livePtr, language)
  }

  /** FoldableContainer.get_language */
  final def getLanguage(): String = {
    if (gdext.classes.FoldableContainer.mb_get_language == null) gdext.classes.FoldableContainer.mb_get_language = MethodBind.get("FoldableContainer", "get_language", 201670096L)
    Ptrcall.call0[String](gdext.classes.FoldableContainer.mb_get_language, livePtr)
  }

  /** FoldableContainer.set_title_text_direction */
  final def setTitleTextDirection(text_direction: Long): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_title_text_direction == null) gdext.classes.FoldableContainer.mb_set_title_text_direction = MethodBind.get("FoldableContainer", "set_title_text_direction", 119160795L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_title_text_direction, livePtr, text_direction)
  }

  /** FoldableContainer.get_title_text_direction */
  final def getTitleTextDirection(): Long = {
    if (gdext.classes.FoldableContainer.mb_get_title_text_direction == null) gdext.classes.FoldableContainer.mb_get_title_text_direction = MethodBind.get("FoldableContainer", "get_title_text_direction", 797257663L)
    Ptrcall.call0[Long](gdext.classes.FoldableContainer.mb_get_title_text_direction, livePtr)
  }

  /** FoldableContainer.set_title_text_overrun_behavior */
  final def setTitleTextOverrunBehavior(overrun_behavior: Long): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_title_text_overrun_behavior == null) gdext.classes.FoldableContainer.mb_set_title_text_overrun_behavior = MethodBind.get("FoldableContainer", "set_title_text_overrun_behavior", 1008890932L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_title_text_overrun_behavior, livePtr, overrun_behavior)
  }

  /** FoldableContainer.get_title_text_overrun_behavior */
  final def getTitleTextOverrunBehavior(): Long = {
    if (gdext.classes.FoldableContainer.mb_get_title_text_overrun_behavior == null) gdext.classes.FoldableContainer.mb_get_title_text_overrun_behavior = MethodBind.get("FoldableContainer", "get_title_text_overrun_behavior", 3779142101L)
    Ptrcall.call0[Long](gdext.classes.FoldableContainer.mb_get_title_text_overrun_behavior, livePtr)
  }

  /** FoldableContainer.set_title_position */
  final def setTitlePosition(title_position: Long): Unit = {
    if (gdext.classes.FoldableContainer.mb_set_title_position == null) gdext.classes.FoldableContainer.mb_set_title_position = MethodBind.get("FoldableContainer", "set_title_position", 2276829442L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_set_title_position, livePtr, title_position)
  }

  /** FoldableContainer.get_title_position */
  final def getTitlePosition(): Long = {
    if (gdext.classes.FoldableContainer.mb_get_title_position == null) gdext.classes.FoldableContainer.mb_get_title_position = MethodBind.get("FoldableContainer", "get_title_position", 3028840207L)
    Ptrcall.call0[Long](gdext.classes.FoldableContainer.mb_get_title_position, livePtr)
  }

  /** FoldableContainer.add_title_bar_control */
  final def addTitleBarControl(control: Control): Unit = {
    if (gdext.classes.FoldableContainer.mb_add_title_bar_control == null) gdext.classes.FoldableContainer.mb_add_title_bar_control = MethodBind.get("FoldableContainer", "add_title_bar_control", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_add_title_bar_control, livePtr, Wrappers.handle(control))
  }

  /** FoldableContainer.remove_title_bar_control */
  final def removeTitleBarControl(control: Control): Unit = {
    if (gdext.classes.FoldableContainer.mb_remove_title_bar_control == null) gdext.classes.FoldableContainer.mb_remove_title_bar_control = MethodBind.get("FoldableContainer", "remove_title_bar_control", 1496901182L)
    Ptrcall.callVoid1(gdext.classes.FoldableContainer.mb_remove_title_bar_control, livePtr, Wrappers.handle(control))
  }

}

object FoldableContainer {
  private[classes] var mb_fold: GDExtensionMethodBindPtr = null
  private[classes] var mb_expand: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_folded: GDExtensionMethodBindPtr = null
  private[classes] var mb_is_folded: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_foldable_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_foldable_group: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title_alignment: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_language: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title_text_direction: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title_text_overrun_behavior: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_title_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_title_position: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_title_bar_control: GDExtensionMethodBindPtr = null
  private[classes] var mb_remove_title_bar_control: GDExtensionMethodBindPtr = null
}
