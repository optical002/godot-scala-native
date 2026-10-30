package gdext.classes

import gdext.Godot
import gdext.builtin.*
import gdext.internal.StringNames
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
  final def addMessage(srcMessage: String, xlatedMessage: String, context: String = ""): Unit = {
    if (gdext.classes.Translation.mb_add_message == null) gdext.classes.Translation.mb_add_message = MethodBind.get("Translation", "add_message", 3898530326L)
    Ptrcall.callVoid3(gdext.classes.Translation.mb_add_message, livePtr, SnArg(srcMessage), SnArg(xlatedMessage), SnArg(context))
  }

  /** Translation.get_message */
  final def getMessage(srcMessage: String, context: String = ""): String = {
    if (gdext.classes.Translation.mb_get_message == null) gdext.classes.Translation.mb_get_message = MethodBind.get("Translation", "get_message", 1829228469L)
    Ptrcall.call2[SnArg, SnArg, SnArg](gdext.classes.Translation.mb_get_message, livePtr, SnArg(srcMessage), SnArg(context))
  }

  /** Translation.get_plural_message */
  final def getPluralMessage(srcMessage: String, srcPluralMessage: String, n: Long, context: String = ""): String = {
    if (gdext.classes.Translation.mb_get_plural_message == null) gdext.classes.Translation.mb_get_plural_message = MethodBind.get("Translation", "get_plural_message", 229954002L)
    Ptrcall.call4[SnArg, SnArg, Long, SnArg, SnArg](gdext.classes.Translation.mb_get_plural_message, livePtr, SnArg(srcMessage), SnArg(srcPluralMessage), n, SnArg(context))
  }

  /** Translation.erase_message */
  final def eraseMessage(srcMessage: String, context: String = ""): Unit = {
    if (gdext.classes.Translation.mb_erase_message == null) gdext.classes.Translation.mb_erase_message = MethodBind.get("Translation", "erase_message", 3959009644L)
    Ptrcall.callVoid2(gdext.classes.Translation.mb_erase_message, livePtr, SnArg(srcMessage), SnArg(context))
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
