package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.engine.*
import gdext.engine.GodotObject.*

/** Generated wrapper for Godot's `LabelSettings`, extends `Resource`. */
abstract class LabelSettings extends Resource {

  /** LabelSettings.set_line_spacing */
  final def setLineSpacing(spacing: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_line_spacing", 373806689L), hostObject.objectPtr, spacing)

  /** LabelSettings.get_line_spacing */
  final def getLineSpacing(): Double =
    Ptrcall.call0[Double](MethodBind.get("LabelSettings", "get_line_spacing", 1740695150L), hostObject.objectPtr)

  /** LabelSettings.set_paragraph_spacing */
  final def setParagraphSpacing(spacing: Double): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_paragraph_spacing", 373806689L), hostObject.objectPtr, spacing)

  /** LabelSettings.get_paragraph_spacing */
  final def getParagraphSpacing(): Double =
    Ptrcall.call0[Double](MethodBind.get("LabelSettings", "get_paragraph_spacing", 1740695150L), hostObject.objectPtr)

  /** LabelSettings.set_font */
  final def setFont(font: Font): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_font", 1262170328L), hostObject.objectPtr, font.hostObject)

  /** LabelSettings.get_font */
  final def getFont(): GodotObject =
    Ptrcall.call0[GodotObject](MethodBind.get("LabelSettings", "get_font", 3229501585L), hostObject.objectPtr)

  /** LabelSettings.set_font_size */
  final def setFontSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_font_size", 1286410249L), hostObject.objectPtr, size)

  /** LabelSettings.get_font_size */
  final def getFontSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("LabelSettings", "get_font_size", 3905245786L), hostObject.objectPtr)

  /** LabelSettings.set_font_color */
  final def setFontColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_font_color", 2920490490L), hostObject.objectPtr, color)

  /** LabelSettings.get_font_color */
  final def getFontColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("LabelSettings", "get_font_color", 3444240500L), hostObject.objectPtr)

  /** LabelSettings.set_outline_size */
  final def setOutlineSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_outline_size", 1286410249L), hostObject.objectPtr, size)

  /** LabelSettings.get_outline_size */
  final def getOutlineSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("LabelSettings", "get_outline_size", 3905245786L), hostObject.objectPtr)

  /** LabelSettings.set_outline_color */
  final def setOutlineColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_outline_color", 2920490490L), hostObject.objectPtr, color)

  /** LabelSettings.get_outline_color */
  final def getOutlineColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("LabelSettings", "get_outline_color", 3444240500L), hostObject.objectPtr)

  /** LabelSettings.set_shadow_size */
  final def setShadowSize(size: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_shadow_size", 1286410249L), hostObject.objectPtr, size)

  /** LabelSettings.get_shadow_size */
  final def getShadowSize(): Long =
    Ptrcall.call0[Long](MethodBind.get("LabelSettings", "get_shadow_size", 3905245786L), hostObject.objectPtr)

  /** LabelSettings.set_shadow_color */
  final def setShadowColor(color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_shadow_color", 2920490490L), hostObject.objectPtr, color)

  /** LabelSettings.get_shadow_color */
  final def getShadowColor(): gdext.builtin.Color =
    Ptrcall.call0[gdext.builtin.Color](MethodBind.get("LabelSettings", "get_shadow_color", 3444240500L), hostObject.objectPtr)

  /** LabelSettings.set_shadow_offset */
  final def setShadowOffset(offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_shadow_offset", 743155724L), hostObject.objectPtr, offset)

  /** LabelSettings.get_shadow_offset */
  final def getShadowOffset(): gdext.builtin.Vector2 =
    Ptrcall.call0[gdext.builtin.Vector2](MethodBind.get("LabelSettings", "get_shadow_offset", 3341600327L), hostObject.objectPtr)

  /** LabelSettings.get_stacked_outline_count */
  final def getStackedOutlineCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("LabelSettings", "get_stacked_outline_count", 3905245786L), hostObject.objectPtr)

  /** LabelSettings.set_stacked_outline_count */
  final def setStackedOutlineCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_stacked_outline_count", 1286410249L), hostObject.objectPtr, count)

  /** LabelSettings.add_stacked_outline */
  final def addStackedOutline(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "add_stacked_outline", 1025054187L), hostObject.objectPtr, index)

  /** LabelSettings.move_stacked_outline */
  final def moveStackedOutline(from_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "move_stacked_outline", 3937882851L), hostObject.objectPtr, from_index, to_position)

  /** LabelSettings.remove_stacked_outline */
  final def removeStackedOutline(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "remove_stacked_outline", 1286410249L), hostObject.objectPtr, index)

  /** LabelSettings.set_stacked_outline_size */
  final def setStackedOutlineSize(index: Long, size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "set_stacked_outline_size", 3937882851L), hostObject.objectPtr, index, size)

  /** LabelSettings.get_stacked_outline_size */
  final def getStackedOutlineSize(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LabelSettings", "get_stacked_outline_size", 923996154L), hostObject.objectPtr, index)

  /** LabelSettings.set_stacked_outline_color */
  final def setStackedOutlineColor(index: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "set_stacked_outline_color", 2878471219L), hostObject.objectPtr, index, color)

  /** LabelSettings.get_stacked_outline_color */
  final def getStackedOutlineColor(index: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("LabelSettings", "get_stacked_outline_color", 3457211756L), hostObject.objectPtr, index)

  /** LabelSettings.get_stacked_shadow_count */
  final def getStackedShadowCount(): Long =
    Ptrcall.call0[Long](MethodBind.get("LabelSettings", "get_stacked_shadow_count", 3905245786L), hostObject.objectPtr)

  /** LabelSettings.set_stacked_shadow_count */
  final def setStackedShadowCount(count: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "set_stacked_shadow_count", 1286410249L), hostObject.objectPtr, count)

  /** LabelSettings.add_stacked_shadow */
  final def addStackedShadow(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "add_stacked_shadow", 1025054187L), hostObject.objectPtr, index)

  /** LabelSettings.move_stacked_shadow */
  final def moveStackedShadow(from_index: Long, to_position: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "move_stacked_shadow", 3937882851L), hostObject.objectPtr, from_index, to_position)

  /** LabelSettings.remove_stacked_shadow */
  final def removeStackedShadow(index: Long): Unit =
    Ptrcall.callVoid1(MethodBind.get("LabelSettings", "remove_stacked_shadow", 1286410249L), hostObject.objectPtr, index)

  /** LabelSettings.set_stacked_shadow_offset */
  final def setStackedShadowOffset(index: Long, offset: gdext.builtin.Vector2): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "set_stacked_shadow_offset", 163021252L), hostObject.objectPtr, index, offset)

  /** LabelSettings.get_stacked_shadow_offset */
  final def getStackedShadowOffset(index: Long): gdext.builtin.Vector2 =
    Ptrcall.call1[Long, gdext.builtin.Vector2](MethodBind.get("LabelSettings", "get_stacked_shadow_offset", 2299179447L), hostObject.objectPtr, index)

  /** LabelSettings.set_stacked_shadow_color */
  final def setStackedShadowColor(index: Long, color: gdext.builtin.Color): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "set_stacked_shadow_color", 2878471219L), hostObject.objectPtr, index, color)

  /** LabelSettings.get_stacked_shadow_color */
  final def getStackedShadowColor(index: Long): gdext.builtin.Color =
    Ptrcall.call1[Long, gdext.builtin.Color](MethodBind.get("LabelSettings", "get_stacked_shadow_color", 3457211756L), hostObject.objectPtr, index)

  /** LabelSettings.set_stacked_shadow_outline_size */
  final def setStackedShadowOutlineSize(index: Long, size: Long): Unit =
    Ptrcall.callVoid2(MethodBind.get("LabelSettings", "set_stacked_shadow_outline_size", 3937882851L), hostObject.objectPtr, index, size)

  /** LabelSettings.get_stacked_shadow_outline_size */
  final def getStackedShadowOutlineSize(index: Long): Long =
    Ptrcall.call1[Long, Long](MethodBind.get("LabelSettings", "get_stacked_shadow_outline_size", 923996154L), hostObject.objectPtr, index)

}

object LabelSettings {
  /** Class metadata for Gd[LabelSettings] lifetime management and casting. */
  given GodotClass[LabelSettings] with {
    def className = "LabelSettings"
    def isRefCounted = true
    def wrap(o: GodotObject): LabelSettings = new LabelSettings {}.withHost(o.objectPtr)
    def unwrap(t: LabelSettings): GodotObject = t.hostObject
  }
}
