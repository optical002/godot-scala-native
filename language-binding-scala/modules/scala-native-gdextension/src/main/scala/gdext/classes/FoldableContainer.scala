package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*

/** Generated wrapper for Godot's `FoldableContainer`, extends `Container`. */
abstract class FoldableContainer extends Container {
  override def godotClassName: String = "FoldableContainer"

  /** FoldableContainer.fold */
  final def fold(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FoldableContainer", "fold", 3218959716L), hostObject.objectPtr)

  /** FoldableContainer.expand */
  final def expand(): Unit =
    Ptrcall.callVoid0(MethodBind.get("FoldableContainer", "expand", 3218959716L), hostObject.objectPtr)

  /** FoldableContainer.set_folded */
  final def setFolded(folded: Boolean): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_folded", 2586408642L), hostObject.objectPtr, folded)

  /** FoldableContainer.is_folded */
  final def isFolded(): Boolean =
    Ptrcall.call0[Boolean](MethodBind.get("FoldableContainer", "is_folded", 36873697L), hostObject.objectPtr)

  /** FoldableContainer.set_foldable_group */
  final def setFoldableGroup(button_group: FoldableGroup): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_foldable_group", 3001390597L), hostObject.objectPtr, button_group.hostObject)

  /** FoldableContainer.get_foldable_group */
  final def getFoldableGroup(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("FoldableContainer", "get_foldable_group", 66499518L), hostObject.objectPtr)

  /** FoldableContainer.set_title */
  final def setTitle(text: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_title", 83702148L), hostObject.objectPtr, text)

  /** FoldableContainer.get_title */
  final def getTitle(): String =
    Ptrcall.call0[String](MethodBind.get("FoldableContainer", "get_title", 201670096L), hostObject.objectPtr)

  /** FoldableContainer.set_title_alignment */
  final def setTitleAlignment(alignment: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_title_alignment", 2312603777L), hostObject.objectPtr, alignment)

  /** FoldableContainer.get_title_alignment */
  final def getTitleAlignment(): Long =
    Ptrcall.call0[Long](MethodBind.get("FoldableContainer", "get_title_alignment", 341400642L), hostObject.objectPtr)

  /** FoldableContainer.set_language */
  final def setLanguage(language: String): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_language", 83702148L), hostObject.objectPtr, language)

  /** FoldableContainer.get_language */
  final def getLanguage(): String =
    Ptrcall.call0[String](MethodBind.get("FoldableContainer", "get_language", 201670096L), hostObject.objectPtr)

  /** FoldableContainer.set_title_text_direction */
  final def setTitleTextDirection(text_direction: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_title_text_direction", 119160795L), hostObject.objectPtr, text_direction)

  /** FoldableContainer.get_title_text_direction */
  final def getTitleTextDirection(): Long =
    Ptrcall.call0[Long](MethodBind.get("FoldableContainer", "get_title_text_direction", 797257663L), hostObject.objectPtr)

  /** FoldableContainer.set_title_text_overrun_behavior */
  final def setTitleTextOverrunBehavior(overrun_behavior: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_title_text_overrun_behavior", 1008890932L), hostObject.objectPtr, overrun_behavior)

  /** FoldableContainer.get_title_text_overrun_behavior */
  final def getTitleTextOverrunBehavior(): Long =
    Ptrcall.call0[Long](MethodBind.get("FoldableContainer", "get_title_text_overrun_behavior", 3779142101L), hostObject.objectPtr)

  /** FoldableContainer.set_title_position */
  final def setTitlePosition(title_position: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "set_title_position", 2276829442L), hostObject.objectPtr, title_position)

  /** FoldableContainer.get_title_position */
  final def getTitlePosition(): Long =
    Ptrcall.call0[Long](MethodBind.get("FoldableContainer", "get_title_position", 3028840207L), hostObject.objectPtr)

  /** FoldableContainer.add_title_bar_control */
  final def addTitleBarControl(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "add_title_bar_control", 1496901182L), hostObject.objectPtr, control.hostObject)

  /** FoldableContainer.remove_title_bar_control */
  final def removeTitleBarControl(control: Control): Unit =
    Ptrcall.callVoid1(MethodBind.get("FoldableContainer", "remove_title_bar_control", 1496901182L), hostObject.objectPtr, control.hostObject)

}
