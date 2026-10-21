package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.engine.*
import gdext.internal.engine.GodotObject.*
import gdext.internal.ffi.types.GDExtensionMethodBindPtr

/** Generated wrapper for Godot's `Translation`, extends `Resource`. */
abstract class Translation extends Resource {
  override def godotClassName: String = "Translation"

  /** Translation.set_locale */
  final def setLocale(locale: String): Unit = {
    if (gdext.classes.Translation.mb_set_locale == null) gdext.classes.Translation.mb_set_locale = MethodBind.get("Translation", "set_locale", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Translation.mb_set_locale, livePtr, locale)
  }

  /** Translation.get_locale */
  final def getLocale(): String = {
    if (gdext.classes.Translation.mb_get_locale == null) gdext.classes.Translation.mb_get_locale = MethodBind.get("Translation", "get_locale", 201670096L)
    Ptrcall.call0[String](gdext.classes.Translation.mb_get_locale, livePtr)
  }

  /** Translation.add_message */
  final def addMessage(src_message: gdext.builtin.StringName, xlated_message: gdext.builtin.StringName, context: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Translation.mb_add_message == null) gdext.classes.Translation.mb_add_message = MethodBind.get("Translation", "add_message", 3898530326L)
    Ptrcall.callVoid3(gdext.classes.Translation.mb_add_message, livePtr, src_message, xlated_message, context)
  }

  /** Translation.get_message */
  final def getMessage(src_message: gdext.builtin.StringName, context: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.Translation.mb_get_message == null) gdext.classes.Translation.mb_get_message = MethodBind.get("Translation", "get_message", 1829228469L)
    Ptrcall.call2[gdext.builtin.StringName, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.Translation.mb_get_message, livePtr, src_message, context)
  }

  /** Translation.get_plural_message */
  final def getPluralMessage(src_message: gdext.builtin.StringName, src_plural_message: gdext.builtin.StringName, n: Long, context: gdext.builtin.StringName): gdext.builtin.StringName = {
    if (gdext.classes.Translation.mb_get_plural_message == null) gdext.classes.Translation.mb_get_plural_message = MethodBind.get("Translation", "get_plural_message", 229954002L)
    Ptrcall.call4[gdext.builtin.StringName, gdext.builtin.StringName, Long, gdext.builtin.StringName, gdext.builtin.StringName](gdext.classes.Translation.mb_get_plural_message, livePtr, src_message, src_plural_message, n, context)
  }

  /** Translation.erase_message */
  final def eraseMessage(src_message: gdext.builtin.StringName, context: gdext.builtin.StringName): Unit = {
    if (gdext.classes.Translation.mb_erase_message == null) gdext.classes.Translation.mb_erase_message = MethodBind.get("Translation", "erase_message", 3959009644L)
    Ptrcall.callVoid2(gdext.classes.Translation.mb_erase_message, livePtr, src_message, context)
  }

  /** Translation.get_message_count */
  final def getMessageCount(): Long = {
    if (gdext.classes.Translation.mb_get_message_count == null) gdext.classes.Translation.mb_get_message_count = MethodBind.get("Translation", "get_message_count", 3905245786L)
    Ptrcall.call0[Long](gdext.classes.Translation.mb_get_message_count, livePtr)
  }

  /** Translation.set_plural_rules_override */
  final def setPluralRulesOverride(rules: String): Unit = {
    if (gdext.classes.Translation.mb_set_plural_rules_override == null) gdext.classes.Translation.mb_set_plural_rules_override = MethodBind.get("Translation", "set_plural_rules_override", 83702148L)
    Ptrcall.callVoid1(gdext.classes.Translation.mb_set_plural_rules_override, livePtr, rules)
  }

  /** Translation.get_plural_rules_override */
  final def getPluralRulesOverride(): String = {
    if (gdext.classes.Translation.mb_get_plural_rules_override == null) gdext.classes.Translation.mb_get_plural_rules_override = MethodBind.get("Translation", "get_plural_rules_override", 201670096L)
    Ptrcall.call0[String](gdext.classes.Translation.mb_get_plural_rules_override, livePtr)
  }

}

object Translation {
  private[classes] var mb_set_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_locale: GDExtensionMethodBindPtr = null
  private[classes] var mb_add_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plural_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_erase_message: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_message_count: GDExtensionMethodBindPtr = null
  private[classes] var mb_set_plural_rules_override: GDExtensionMethodBindPtr = null
  private[classes] var mb_get_plural_rules_override: GDExtensionMethodBindPtr = null
}
